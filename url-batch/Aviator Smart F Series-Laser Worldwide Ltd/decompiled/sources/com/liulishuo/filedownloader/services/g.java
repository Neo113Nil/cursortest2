package com.liulishuo.filedownloader.services;

import android.text.TextUtils;
import com.liulishuo.filedownloader.a0;
import com.liulishuo.filedownloader.d0;
import com.liulishuo.filedownloader.download.DownloadLaunchRunnable;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
class g implements a0 {
    private final com.liulishuo.filedownloader.database.a mDatabase;
    private final h mThreadPool;

    g() {
        com.liulishuo.filedownloader.download.b impl = com.liulishuo.filedownloader.download.b.getImpl();
        this.mDatabase = impl.getDatabaseInstance();
        this.mThreadPool = new h(impl.getMaxNetworkThreadCount());
    }

    public void clearAllTaskData() {
        this.mDatabase.clear();
    }

    public boolean clearTaskData(int i8) {
        if (i8 == 0) {
            com.liulishuo.filedownloader.util.d.w(this, "The task[%d] id is invalid, can't clear it.", Integer.valueOf(i8));
            return false;
        }
        if (isDownloading(i8)) {
            com.liulishuo.filedownloader.util.d.w(this, "The task[%d] is downloading, can't clear it.", Integer.valueOf(i8));
            return false;
        }
        this.mDatabase.remove(i8);
        this.mDatabase.removeConnections(i8);
        return true;
    }

    @Override // com.liulishuo.filedownloader.a0
    public int findRunningTaskIdBySameTempPath(String str, int i8) {
        return this.mThreadPool.findRunningTaskIdBySameTempPath(str, i8);
    }

    public long getSoFar(int i8) {
        FileDownloadModel find = this.mDatabase.find(i8);
        if (find == null) {
            return 0L;
        }
        int connectionCount = find.getConnectionCount();
        if (connectionCount <= 1) {
            return find.getSoFar();
        }
        List<com.liulishuo.filedownloader.model.a> findConnectionModel = this.mDatabase.findConnectionModel(i8);
        if (findConnectionModel == null || findConnectionModel.size() != connectionCount) {
            return 0L;
        }
        return com.liulishuo.filedownloader.model.a.getTotalOffset(findConnectionModel);
    }

    public byte getStatus(int i8) {
        FileDownloadModel find = this.mDatabase.find(i8);
        if (find == null) {
            return (byte) 0;
        }
        return find.getStatus();
    }

    public long getTotal(int i8) {
        FileDownloadModel find = this.mDatabase.find(i8);
        if (find == null) {
            return 0L;
        }
        return find.getTotal();
    }

    public boolean isDownloading(String str, String str2) {
        return isDownloading(com.liulishuo.filedownloader.util.f.generateId(str, str2));
    }

    public boolean isIdle() {
        return this.mThreadPool.exactSize() <= 0;
    }

    public boolean pause(int i8) {
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "request pause the task %d", Integer.valueOf(i8));
        }
        FileDownloadModel find = this.mDatabase.find(i8);
        if (find == null) {
            return false;
        }
        find.setStatus((byte) -2);
        this.mThreadPool.cancel(i8);
        return true;
    }

    public void pauseAll() {
        List<Integer> allExactRunningDownloadIds = this.mThreadPool.getAllExactRunningDownloadIds();
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "pause all tasks %d", Integer.valueOf(allExactRunningDownloadIds.size()));
        }
        Iterator<Integer> it = allExactRunningDownloadIds.iterator();
        while (it.hasNext()) {
            pause(it.next().intValue());
        }
    }

    public synchronized boolean setMaxNetworkThreadCount(int i8) {
        return this.mThreadPool.setMaxNetworkThreadCount(i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x018b A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:4:0x0009, B:6:0x0010, B:7:0x0026, B:10:0x0038, B:12:0x0048, B:14:0x0052, B:16:0x0056, B:17:0x0069, B:19:0x0076, B:21:0x007c, B:23:0x0080, B:28:0x0091, B:30:0x009e, B:32:0x00a4, B:34:0x00a8, B:39:0x00bb, B:41:0x00c4, B:43:0x00cf, B:45:0x00dd, B:47:0x00e1, B:49:0x00f2, B:53:0x0100, B:55:0x0107, B:57:0x010e, B:59:0x0114, B:61:0x011b, B:63:0x0121, B:65:0x0127, B:67:0x0141, B:68:0x0145, B:70:0x014b, B:74:0x018b, B:75:0x0190, B:78:0x015c, B:80:0x0166, B:82:0x016c, B:83:0x0171, B:84:0x00ca, B:86:0x0099), top: B:3:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void start(String str, String str2, boolean z7, int i8, int i9, int i10, boolean z8, FileDownloadHeader fileDownloadHeader, boolean z9) {
        FileDownloadModel fileDownloadModel;
        List<com.liulishuo.filedownloader.model.a> list;
        try {
            boolean z10 = false;
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, "request start the task with url(%s) path(%s) isDirectory(%B)", str, str2, Boolean.valueOf(z7));
            }
            d0.clearMarker();
            int generateId = com.liulishuo.filedownloader.util.f.generateId(str, str2, z7);
            FileDownloadModel find = this.mDatabase.find(generateId);
            if (z7 || find != null) {
                fileDownloadModel = find;
                list = null;
            } else {
                int generateId2 = com.liulishuo.filedownloader.util.f.generateId(str, com.liulishuo.filedownloader.util.f.getParent(str2), true);
                FileDownloadModel find2 = this.mDatabase.find(generateId2);
                if (find2 == null || !str2.equals(find2.getTargetFilePath())) {
                    list = null;
                } else {
                    if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                        com.liulishuo.filedownloader.util.d.d(this, "task[%d] find model by dirCaseId[%d]", Integer.valueOf(generateId), Integer.valueOf(generateId2));
                    }
                    list = this.mDatabase.findConnectionModel(generateId2);
                }
                fileDownloadModel = find2;
            }
            if (com.liulishuo.filedownloader.util.c.inspectAndInflowDownloading(generateId, fileDownloadModel, this, true)) {
                if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                    com.liulishuo.filedownloader.util.d.d(this, "has already started download %d", Integer.valueOf(generateId));
                }
                return;
            }
            String targetFilePath = fileDownloadModel != null ? fileDownloadModel.getTargetFilePath() : com.liulishuo.filedownloader.util.f.getTargetFilePath(str2, z7, null);
            if (com.liulishuo.filedownloader.util.c.inspectAndInflowDownloaded(generateId, targetFilePath, z8, true)) {
                if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                    com.liulishuo.filedownloader.util.d.d(this, "has already completed downloading %d", Integer.valueOf(generateId));
                }
                return;
            }
            if (com.liulishuo.filedownloader.util.c.inspectAndInflowConflictPath(generateId, fileDownloadModel != null ? fileDownloadModel.getSoFar() : 0L, fileDownloadModel != null ? fileDownloadModel.getTempFilePath() : com.liulishuo.filedownloader.util.f.getTempPath(targetFilePath), targetFilePath, this)) {
                if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                    com.liulishuo.filedownloader.util.d.d(this, "there is an another task with the same target-file-path %d %s", Integer.valueOf(generateId), targetFilePath);
                }
                if (fileDownloadModel != null) {
                    this.mDatabase.remove(generateId);
                    this.mDatabase.removeConnections(generateId);
                }
                return;
            }
            if (fileDownloadModel == null || !(fileDownloadModel.getStatus() == -2 || fileDownloadModel.getStatus() == -1 || fileDownloadModel.getStatus() == 1 || fileDownloadModel.getStatus() == 6 || fileDownloadModel.getStatus() == 2)) {
                if (fileDownloadModel == null) {
                    fileDownloadModel = new FileDownloadModel();
                }
                fileDownloadModel.setUrl(str);
                fileDownloadModel.setPath(str2, z7);
                fileDownloadModel.setId(generateId);
                fileDownloadModel.setSoFar(0L);
                fileDownloadModel.setTotal(0L);
                fileDownloadModel.setStatus((byte) 1);
                fileDownloadModel.setConnectionCount(1);
            } else {
                if (fileDownloadModel.getId() == generateId) {
                    if (!TextUtils.equals(str, fileDownloadModel.getUrl())) {
                        fileDownloadModel.setUrl(str);
                    }
                    if (z10) {
                        this.mDatabase.update(fileDownloadModel);
                    }
                    this.mThreadPool.execute(new DownloadLaunchRunnable.b().setModel(fileDownloadModel).setHeader(fileDownloadHeader).setThreadPoolMonitor(this).setMinIntervalMillis(Integer.valueOf(i9)).setCallbackProgressMaxCount(Integer.valueOf(i8)).setForceReDownload(Boolean.valueOf(z8)).setWifiRequired(Boolean.valueOf(z9)).setMaxRetryTimes(Integer.valueOf(i10)).build());
                }
                this.mDatabase.remove(fileDownloadModel.getId());
                this.mDatabase.removeConnections(fileDownloadModel.getId());
                fileDownloadModel.setId(generateId);
                fileDownloadModel.setPath(str2, z7);
                if (list != null) {
                    for (com.liulishuo.filedownloader.model.a aVar : list) {
                        aVar.setId(generateId);
                        this.mDatabase.insertConnectionModel(aVar);
                    }
                }
            }
            z10 = true;
            if (z10) {
            }
            this.mThreadPool.execute(new DownloadLaunchRunnable.b().setModel(fileDownloadModel).setHeader(fileDownloadHeader).setThreadPoolMonitor(this).setMinIntervalMillis(Integer.valueOf(i9)).setCallbackProgressMaxCount(Integer.valueOf(i8)).setForceReDownload(Boolean.valueOf(z8)).setWifiRequired(Boolean.valueOf(z9)).setMaxRetryTimes(Integer.valueOf(i10)).build());
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean isDownloading(int i8) {
        return isDownloading(this.mDatabase.find(i8));
    }

    @Override // com.liulishuo.filedownloader.a0
    public boolean isDownloading(FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            return false;
        }
        boolean isInThreadPool = this.mThreadPool.isInThreadPool(fileDownloadModel.getId());
        if (com.liulishuo.filedownloader.model.b.isOver(fileDownloadModel.getStatus())) {
            if (!isInThreadPool) {
                return false;
            }
        } else if (!isInThreadPool) {
            com.liulishuo.filedownloader.util.d.e(this, "%d status is[%s](not finish) & but not in the pool", Integer.valueOf(fileDownloadModel.getId()), Byte.valueOf(fileDownloadModel.getStatus()));
            return false;
        }
        return true;
    }
}
