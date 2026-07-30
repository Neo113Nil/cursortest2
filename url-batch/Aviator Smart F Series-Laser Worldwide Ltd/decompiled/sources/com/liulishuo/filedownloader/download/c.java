package com.liulishuo.filedownloader.download;

import android.os.Process;
import com.liulishuo.filedownloader.download.ConnectTask;
import com.liulishuo.filedownloader.download.e;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.IOException;
import java.net.SocketException;

/* loaded from: classes4.dex */
public class c implements Runnable {
    private final f callback;
    private final ConnectTask connectTask;
    final int connectionIndex;
    private final int downloadId;
    private e fetchDataTask;
    private final boolean isWifiRequired;
    private final String path;
    private volatile boolean paused;

    public static class b {
        private f callback;
        private final ConnectTask.b connectTaskBuilder = new ConnectTask.b();
        private Integer connectionIndex;
        private Boolean isWifiRequired;
        private String path;

        public c build() {
            if (this.callback == null || this.path == null || this.isWifiRequired == null || this.connectionIndex == null) {
                throw new IllegalArgumentException(com.liulishuo.filedownloader.util.f.formatString("%s %s %B", this.callback, this.path, this.isWifiRequired));
            }
            ConnectTask build = this.connectTaskBuilder.build();
            return new c(build.downloadId, this.connectionIndex.intValue(), build, this.callback, this.isWifiRequired.booleanValue(), this.path);
        }

        c buildForTest(ConnectTask connectTask) {
            return new c(connectTask.downloadId, 0, connectTask, this.callback, false, "");
        }

        public b setCallback(f fVar) {
            this.callback = fVar;
            return this;
        }

        public b setConnectionIndex(Integer num) {
            this.connectionIndex = num;
            return this;
        }

        public b setConnectionModel(com.liulishuo.filedownloader.download.a aVar) {
            this.connectTaskBuilder.setConnectionProfile(aVar);
            return this;
        }

        public b setEtag(String str) {
            this.connectTaskBuilder.setEtag(str);
            return this;
        }

        public b setHeader(FileDownloadHeader fileDownloadHeader) {
            this.connectTaskBuilder.setHeader(fileDownloadHeader);
            return this;
        }

        public b setId(int i8) {
            this.connectTaskBuilder.setDownloadId(i8);
            return this;
        }

        public b setPath(String str) {
            this.path = str;
            return this;
        }

        public b setUrl(String str) {
            this.connectTaskBuilder.setUrl(str);
            return this;
        }

        public b setWifiRequired(boolean z7) {
            this.isWifiRequired = Boolean.valueOf(z7);
            return this;
        }
    }

    private long getDownloadedOffset() {
        com.liulishuo.filedownloader.database.a databaseInstance = com.liulishuo.filedownloader.download.b.getImpl().getDatabaseInstance();
        if (this.connectionIndex < 0) {
            FileDownloadModel find = databaseInstance.find(this.downloadId);
            if (find != null) {
                return find.getSoFar();
            }
            return 0L;
        }
        for (com.liulishuo.filedownloader.model.a aVar : databaseInstance.findConnectionModel(this.downloadId)) {
            if (aVar.getIndex() == this.connectionIndex) {
                return aVar.getCurrentOffset();
            }
        }
        return 0L;
    }

    public void discard() {
        pause();
    }

    public void pause() {
        this.paused = true;
        e eVar = this.fetchDataTask;
        if (eVar != null) {
            eVar.pause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0142 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        boolean z7;
        Exception e8;
        e.b bVar;
        Process.setThreadPriority(10);
        long j8 = this.connectTask.getProfile().currentOffset;
        com.liulishuo.filedownloader.connection.b bVar2 = null;
        boolean z8 = false;
        while (!this.paused) {
            try {
                try {
                    bVar2 = this.connectTask.connect();
                    int responseCode = bVar2.getResponseCode();
                    if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                        com.liulishuo.filedownloader.util.d.d(this, "the connection[%d] for %d, is connected %s with code[%d]", Integer.valueOf(this.connectionIndex), Integer.valueOf(this.downloadId), this.connectTask.getProfile(), Integer.valueOf(responseCode));
                    }
                    if (responseCode != 206 && responseCode != 200) {
                        throw new SocketException(com.liulishuo.filedownloader.util.f.formatString("Connection failed with request[%s] response[%s] http-state[%d] on task[%d-%d], which is changed after verify connection, so please try again.", this.connectTask.getRequestHeader(), bVar2.getResponseHeaderFields(), Integer.valueOf(responseCode), Integer.valueOf(this.downloadId), Integer.valueOf(this.connectionIndex)));
                    }
                } catch (FileDownloadGiveUpRetryException e9) {
                    e8 = e9;
                    z7 = false;
                    try {
                        if (!this.callback.isRetry(e8)) {
                            this.callback.onError(e8);
                            if (bVar2 == null) {
                                return;
                            }
                        } else if (z7 && this.fetchDataTask == null) {
                            com.liulishuo.filedownloader.util.d.w(this, "it is valid to retry and connection is valid but create fetch-data-task failed, so give up directly with %s", e8);
                            this.callback.onError(e8);
                            if (bVar2 == null) {
                                return;
                            }
                        } else {
                            if (this.fetchDataTask != null) {
                                long downloadedOffset = getDownloadedOffset();
                                if (downloadedOffset > 0) {
                                    this.connectTask.updateConnectionProfile(downloadedOffset);
                                }
                            }
                            this.callback.onRetry(e8);
                            if (bVar2 != null) {
                                bVar2.ending();
                            }
                            z8 = z7;
                        }
                        bVar2.ending();
                        return;
                    } catch (Throwable th) {
                        if (bVar2 != null) {
                            bVar2.ending();
                        }
                        throw th;
                    }
                } catch (IOException e10) {
                    e8 = e10;
                    z7 = false;
                    if (!this.callback.isRetry(e8)) {
                    }
                    bVar2.ending();
                    return;
                } catch (IllegalAccessException e11) {
                    e8 = e11;
                    z7 = false;
                    if (!this.callback.isRetry(e8)) {
                    }
                    bVar2.ending();
                    return;
                } catch (IllegalArgumentException e12) {
                    e8 = e12;
                    z7 = false;
                    if (!this.callback.isRetry(e8)) {
                    }
                    bVar2.ending();
                    return;
                }
            } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e13) {
                z7 = z8;
                e8 = e13;
            }
            try {
                bVar = new e.b();
            } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e14) {
                e8 = e14;
                z7 = true;
                if (!this.callback.isRetry(e8)) {
                }
                bVar2.ending();
                return;
            }
            if (this.paused) {
                bVar2.ending();
                return;
            }
            e build = bVar.setDownloadId(this.downloadId).setConnectionIndex(this.connectionIndex).setCallback(this.callback).setHost(this).setWifiRequired(this.isWifiRequired).setConnection(bVar2).setConnectionProfile(this.connectTask.getProfile()).setPath(this.path).build();
            this.fetchDataTask = build;
            build.run();
            if (this.paused) {
                this.fetchDataTask.pause();
            }
            bVar2.ending();
            return;
        }
        if (bVar2 != null) {
            bVar2.ending();
        }
    }

    private c(int i8, int i9, ConnectTask connectTask, f fVar, boolean z7, String str) {
        this.downloadId = i8;
        this.connectionIndex = i9;
        this.paused = false;
        this.callback = fVar;
        this.path = str;
        this.connectTask = connectTask;
        this.isWifiRequired = z7;
    }
}
