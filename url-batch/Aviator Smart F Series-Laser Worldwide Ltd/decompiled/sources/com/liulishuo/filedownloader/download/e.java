package com.liulishuo.filedownloader.download;

import android.os.SystemClock;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class e {
    static final int BUFFER_SIZE = 4096;
    private final f callback;
    private final com.liulishuo.filedownloader.connection.b connection;
    private final int connectionIndex;
    private final long contentLength;
    long currentOffset;
    private final com.liulishuo.filedownloader.database.a database;
    private final int downloadId;
    private final long endOffset;
    private final c hostRunnable;
    private final boolean isWifiRequired;
    private volatile long lastSyncBytes;
    private volatile long lastSyncTimestamp;
    private com.liulishuo.filedownloader.stream.a outputStream;
    private final String path;
    private volatile boolean paused;
    private final long startOffset;

    public static class b {
        f callback;
        com.liulishuo.filedownloader.connection.b connection;
        Integer connectionIndex;
        com.liulishuo.filedownloader.download.a connectionProfile;
        Integer downloadId;
        c downloadRunnable;
        Boolean isWifiRequired;
        String path;

        public e build() {
            com.liulishuo.filedownloader.connection.b bVar;
            com.liulishuo.filedownloader.download.a aVar;
            Integer num;
            if (this.isWifiRequired == null || (bVar = this.connection) == null || (aVar = this.connectionProfile) == null || this.callback == null || this.path == null || (num = this.downloadId) == null || this.connectionIndex == null) {
                throw new IllegalArgumentException();
            }
            return new e(bVar, aVar, this.downloadRunnable, num.intValue(), this.connectionIndex.intValue(), this.isWifiRequired.booleanValue(), this.callback, this.path);
        }

        public b setCallback(f fVar) {
            this.callback = fVar;
            return this;
        }

        public b setConnection(com.liulishuo.filedownloader.connection.b bVar) {
            this.connection = bVar;
            return this;
        }

        public b setConnectionIndex(int i8) {
            this.connectionIndex = Integer.valueOf(i8);
            return this;
        }

        public b setConnectionProfile(com.liulishuo.filedownloader.download.a aVar) {
            this.connectionProfile = aVar;
            return this;
        }

        public b setDownloadId(int i8) {
            this.downloadId = Integer.valueOf(i8);
            return this;
        }

        public b setHost(c cVar) {
            this.downloadRunnable = cVar;
            return this;
        }

        public b setPath(String str) {
            this.path = str;
            return this;
        }

        public b setWifiRequired(boolean z7) {
            this.isWifiRequired = Boolean.valueOf(z7);
            return this;
        }
    }

    private void checkAndSync() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (com.liulishuo.filedownloader.util.f.isNeedSync(this.currentOffset - this.lastSyncBytes, elapsedRealtime - this.lastSyncTimestamp)) {
            sync();
            this.lastSyncBytes = this.currentOffset;
            this.lastSyncTimestamp = elapsedRealtime;
        }
    }

    private void sync() {
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            this.outputStream.flushAndSync();
            int i8 = this.connectionIndex;
            if (i8 >= 0) {
                this.database.updateConnectionModel(this.downloadId, i8, this.currentOffset);
            } else {
                this.callback.syncProgressFromCache();
            }
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, "require flushAndSync id[%d] index[%d] offset[%d], consume[%d]", Integer.valueOf(this.downloadId), Integer.valueOf(this.connectionIndex), Long.valueOf(this.currentOffset), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        } catch (IOException e8) {
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, "Because of the system cannot guarantee that all the buffers have been synchronized with physical media, or write to filefailed, we just not flushAndSync process to database too %s", e8);
            }
        }
    }

    public void pause() {
        this.paused = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f4, code lost:
    
        throw new com.liulishuo.filedownloader.exception.FileDownloadNetworkPolicyException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        Throwable th;
        com.liulishuo.filedownloader.stream.a aVar;
        boolean isSupportSeek;
        if (this.paused) {
            return;
        }
        long findContentLength = com.liulishuo.filedownloader.util.f.findContentLength(this.connectionIndex, this.connection);
        if (findContentLength == -1) {
            findContentLength = com.liulishuo.filedownloader.util.f.findContentLengthFromContentRange(this.connection);
        }
        if (findContentLength == 0) {
            throw new FileDownloadGiveUpRetryException(com.liulishuo.filedownloader.util.f.formatString("there isn't any content need to download on %d-%d with the content-length is 0", Integer.valueOf(this.downloadId), Integer.valueOf(this.connectionIndex)));
        }
        long j8 = this.contentLength;
        if (j8 > 0 && findContentLength != j8) {
            throw new FileDownloadGiveUpRetryException(com.liulishuo.filedownloader.util.f.formatString("require %s with contentLength(%d), but the backend response contentLength is %d on downloadId[%d]-connectionIndex[%d], please ask your backend dev to fix such problem.", this.endOffset == -1 ? com.liulishuo.filedownloader.util.f.formatString("range[%d-)", Long.valueOf(this.currentOffset)) : com.liulishuo.filedownloader.util.f.formatString("range[%d-%d)", Long.valueOf(this.currentOffset), Long.valueOf(this.endOffset)), Long.valueOf(this.contentLength), Long.valueOf(findContentLength), Integer.valueOf(this.downloadId), Integer.valueOf(this.connectionIndex)));
        }
        long j9 = this.currentOffset;
        InputStream inputStream = null;
        try {
            isSupportSeek = com.liulishuo.filedownloader.download.b.getImpl().isSupportSeek();
            if (this.hostRunnable != null && !isSupportSeek) {
                throw new IllegalAccessException("can't using multi-download when the output stream can't support seek");
            }
            aVar = com.liulishuo.filedownloader.util.f.createOutputStream(this.path);
        } catch (Throwable th2) {
            th = th2;
            aVar = null;
        }
        try {
            this.outputStream = aVar;
            if (isSupportSeek) {
                aVar.seek(this.currentOffset);
            }
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, "start fetch(%d): range [%d, %d), seek to[%d]", Integer.valueOf(this.connectionIndex), Long.valueOf(this.startOffset), Long.valueOf(this.endOffset), Long.valueOf(this.currentOffset));
            }
            inputStream = this.connection.getInputStream();
            byte[] bArr = new byte[4096];
            if (this.paused) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                if (aVar != null) {
                    try {
                        sync();
                    } finally {
                    }
                }
                if (aVar != null) {
                    try {
                        aVar.close();
                        return;
                    } catch (IOException e9) {
                        e9.printStackTrace();
                        return;
                    }
                }
                return;
            }
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    try {
                        inputStream.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                    if (aVar != null) {
                        try {
                            sync();
                        } finally {
                            try {
                                aVar.close();
                                throw th;
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (aVar != null) {
                        try {
                            aVar.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    long j10 = this.currentOffset - j9;
                    if (findContentLength != -1 && findContentLength != j10) {
                        throw new FileDownloadGiveUpRetryException(com.liulishuo.filedownloader.util.f.formatString("fetched length[%d] != content length[%d], range[%d, %d) offset[%d] fetch begin offset[%d]", Long.valueOf(j10), Long.valueOf(findContentLength), Long.valueOf(this.startOffset), Long.valueOf(this.endOffset), Long.valueOf(this.currentOffset), Long.valueOf(j9)));
                    }
                    this.callback.onCompleted(this.hostRunnable, this.startOffset, this.endOffset);
                    return;
                }
                aVar.write(bArr, 0, read);
                long j11 = j9;
                long j12 = read;
                this.currentOffset += j12;
                this.callback.onProgress(j12);
                checkAndSync();
                if (this.paused) {
                    try {
                        inputStream.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                    try {
                        sync();
                        try {
                            aVar.close();
                            return;
                        } catch (IOException e14) {
                            e14.printStackTrace();
                            return;
                        }
                    } finally {
                    }
                } else {
                    if (this.isWifiRequired && com.liulishuo.filedownloader.util.f.isNetworkNotOnWifiType()) {
                        break;
                    }
                    j9 = j11;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e15) {
                    e15.printStackTrace();
                }
            }
            if (aVar != null) {
                try {
                    sync();
                } finally {
                    try {
                        aVar.close();
                        throw th;
                    } catch (IOException e16) {
                        e16.printStackTrace();
                    }
                }
            }
            if (aVar == null) {
                throw th;
            }
            try {
                aVar.close();
                throw th;
            } catch (IOException e17) {
                e17.printStackTrace();
                throw th;
            }
        }
    }

    private e(com.liulishuo.filedownloader.connection.b bVar, com.liulishuo.filedownloader.download.a aVar, c cVar, int i8, int i9, boolean z7, f fVar, String str) {
        this.lastSyncBytes = 0L;
        this.lastSyncTimestamp = 0L;
        this.callback = fVar;
        this.path = str;
        this.connection = bVar;
        this.isWifiRequired = z7;
        this.hostRunnable = cVar;
        this.connectionIndex = i9;
        this.downloadId = i8;
        this.database = com.liulishuo.filedownloader.download.b.getImpl().getDatabaseInstance();
        this.startOffset = aVar.startOffset;
        this.endOffset = aVar.endOffset;
        this.currentOffset = aVar.currentOffset;
        this.contentLength = aVar.contentLength;
    }
}
