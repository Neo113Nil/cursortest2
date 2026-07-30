package com.liulishuo.filedownloader.database;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.liulishuo.filedownloader.database.a;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.util.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes4.dex */
public class c implements com.liulishuo.filedownloader.database.a {
    private static final int WHAT_CLEAN_LOCK = 0;
    private Handler handler;
    private volatile Thread parkThread;
    private final List<Integer> freeToDBIdList = new ArrayList();
    private AtomicInteger handlingId = new AtomicInteger();
    private final b cachedDatabase = new b();
    private final d realDatabase = new d();
    private final long minInterval = com.liulishuo.filedownloader.util.e.getImpl().downloadMinProgressTime;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 0) {
                if (c.this.parkThread != null) {
                    LockSupport.unpark(c.this.parkThread);
                    c.this.parkThread = null;
                }
                return false;
            }
            try {
                c.this.handlingId.set(i8);
                c.this.syncCacheToDB(i8);
                c.this.freeToDBIdList.add(Integer.valueOf(i8));
                return false;
            } finally {
                c.this.handlingId.set(0);
                if (c.this.parkThread != null) {
                    LockSupport.unpark(c.this.parkThread);
                    c.this.parkThread = null;
                }
            }
        }
    }

    public c() {
        HandlerThread handlerThread = new HandlerThread(f.getThreadPoolName("RemitHandoverToDB"));
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper(), new a());
    }

    private void ensureCacheToDB(int i8) {
        this.handler.removeMessages(i8);
        if (this.handlingId.get() != i8) {
            syncCacheToDB(i8);
            return;
        }
        this.parkThread = Thread.currentThread();
        this.handler.sendEmptyMessage(0);
        LockSupport.park();
    }

    private boolean isNoNeedUpdateToRealDB(int i8) {
        return !this.freeToDBIdList.contains(Integer.valueOf(i8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncCacheToDB(int i8) {
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "sync cache to db %d", Integer.valueOf(i8));
        }
        this.realDatabase.update(this.cachedDatabase.find(i8));
        List<com.liulishuo.filedownloader.model.a> findConnectionModel = this.cachedDatabase.findConnectionModel(i8);
        this.realDatabase.removeConnections(i8);
        Iterator<com.liulishuo.filedownloader.model.a> it = findConnectionModel.iterator();
        while (it.hasNext()) {
            this.realDatabase.insertConnectionModel(it.next());
        }
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void clear() {
        this.cachedDatabase.clear();
        this.realDatabase.clear();
    }

    @Override // com.liulishuo.filedownloader.database.a
    public FileDownloadModel find(int i8) {
        return this.cachedDatabase.find(i8);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public List<com.liulishuo.filedownloader.model.a> findConnectionModel(int i8) {
        return this.cachedDatabase.findConnectionModel(i8);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void insert(FileDownloadModel fileDownloadModel) {
        this.cachedDatabase.insert(fileDownloadModel);
        if (isNoNeedUpdateToRealDB(fileDownloadModel.getId())) {
            return;
        }
        this.realDatabase.insert(fileDownloadModel);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void insertConnectionModel(com.liulishuo.filedownloader.model.a aVar) {
        this.cachedDatabase.insertConnectionModel(aVar);
        if (isNoNeedUpdateToRealDB(aVar.getId())) {
            return;
        }
        this.realDatabase.insertConnectionModel(aVar);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public a.InterfaceC0290a maintainer() {
        d dVar = this.realDatabase;
        b bVar = this.cachedDatabase;
        return dVar.maintainer(bVar.downloaderModelMap, bVar.connectionModelListMap);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void onTaskStart(int i8) {
        this.handler.sendEmptyMessageDelayed(i8, this.minInterval);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public boolean remove(int i8) {
        this.realDatabase.remove(i8);
        return this.cachedDatabase.remove(i8);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void removeConnections(int i8) {
        this.cachedDatabase.removeConnections(i8);
        if (isNoNeedUpdateToRealDB(i8)) {
            return;
        }
        this.realDatabase.removeConnections(i8);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void update(FileDownloadModel fileDownloadModel) {
        this.cachedDatabase.update(fileDownloadModel);
        if (isNoNeedUpdateToRealDB(fileDownloadModel.getId())) {
            return;
        }
        this.realDatabase.update(fileDownloadModel);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateCompleted(int i8, long j8) {
        this.cachedDatabase.updateCompleted(i8, j8);
        if (isNoNeedUpdateToRealDB(i8)) {
            this.handler.removeMessages(i8);
            if (this.handlingId.get() == i8) {
                this.parkThread = Thread.currentThread();
                this.handler.sendEmptyMessage(0);
                LockSupport.park();
                this.realDatabase.updateCompleted(i8, j8);
            }
        } else {
            this.realDatabase.updateCompleted(i8, j8);
        }
        this.freeToDBIdList.remove(Integer.valueOf(i8));
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateConnected(int i8, long j8, String str, String str2) {
        this.cachedDatabase.updateConnected(i8, j8, str, str2);
        if (isNoNeedUpdateToRealDB(i8)) {
            return;
        }
        this.realDatabase.updateConnected(i8, j8, str, str2);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateConnectionCount(int i8, int i9) {
        this.cachedDatabase.updateConnectionCount(i8, i9);
        if (isNoNeedUpdateToRealDB(i8)) {
            return;
        }
        this.realDatabase.updateConnectionCount(i8, i9);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateConnectionModel(int i8, int i9, long j8) {
        this.cachedDatabase.updateConnectionModel(i8, i9, j8);
        if (isNoNeedUpdateToRealDB(i8)) {
            return;
        }
        this.realDatabase.updateConnectionModel(i8, i9, j8);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateError(int i8, Throwable th, long j8) {
        this.cachedDatabase.updateError(i8, th, j8);
        if (isNoNeedUpdateToRealDB(i8)) {
            ensureCacheToDB(i8);
        }
        this.realDatabase.updateError(i8, th, j8);
        this.freeToDBIdList.remove(Integer.valueOf(i8));
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateOldEtagOverdue(int i8, String str, long j8, long j9, int i9) {
        this.cachedDatabase.updateOldEtagOverdue(i8, str, j8, j9, i9);
        if (isNoNeedUpdateToRealDB(i8)) {
            return;
        }
        this.realDatabase.updateOldEtagOverdue(i8, str, j8, j9, i9);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updatePause(int i8, long j8) {
        this.cachedDatabase.updatePause(i8, j8);
        if (isNoNeedUpdateToRealDB(i8)) {
            ensureCacheToDB(i8);
        }
        this.realDatabase.updatePause(i8, j8);
        this.freeToDBIdList.remove(Integer.valueOf(i8));
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updatePending(int i8) {
        this.cachedDatabase.updatePending(i8);
        if (isNoNeedUpdateToRealDB(i8)) {
            return;
        }
        this.realDatabase.updatePending(i8);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateProgress(int i8, long j8) {
        this.cachedDatabase.updateProgress(i8, j8);
        if (isNoNeedUpdateToRealDB(i8)) {
            return;
        }
        this.realDatabase.updateProgress(i8, j8);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateRetry(int i8, Throwable th) {
        this.cachedDatabase.updateRetry(i8, th);
        if (isNoNeedUpdateToRealDB(i8)) {
            return;
        }
        this.realDatabase.updateRetry(i8, th);
    }
}
