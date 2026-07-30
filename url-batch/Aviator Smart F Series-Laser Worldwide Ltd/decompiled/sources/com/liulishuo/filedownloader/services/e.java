package com.liulishuo.filedownloader.services;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.liulishuo.filedownloader.i.b;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.o;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class e extends b.a implements l {
    private final g downloadManager;
    private final WeakReference<FileDownloadService> wService;

    public interface a {
        void onConnected(e eVar);

        void onDisconnected();
    }

    e(WeakReference<FileDownloadService> weakReference, g gVar) {
        this.wService = weakReference;
        this.downloadManager = gVar;
    }

    @Override // com.liulishuo.filedownloader.i.b.a, com.liulishuo.filedownloader.i.b
    public boolean checkDownloading(String str, String str2) {
        return this.downloadManager.isDownloading(str, str2);
    }

    @Override // com.liulishuo.filedownloader.i.b.a, com.liulishuo.filedownloader.i.b
    public void clearAllTaskData() {
        this.downloadManager.clearAllTaskData();
    }

    @Override // com.liulishuo.filedownloader.i.b.a, com.liulishuo.filedownloader.i.b
    public boolean clearTaskData(int i8) {
        return this.downloadManager.clearTaskData(i8);
    }

    @Override // com.liulishuo.filedownloader.i.b.a, com.liulishuo.filedownloader.i.b
    public long getSofar(int i8) {
        return this.downloadManager.getSoFar(i8);
    }

    @Override // com.liulishuo.filedownloader.i.b.a, com.liulishuo.filedownloader.i.b
    public byte getStatus(int i8) {
        return this.downloadManager.getStatus(i8);
    }

    @Override // com.liulishuo.filedownloader.i.b.a, com.liulishuo.filedownloader.i.b
    public long getTotal(int i8) {
        return this.downloadManager.getTotal(i8);
    }

    @Override // com.liulishuo.filedownloader.i.b.a, com.liulishuo.filedownloader.i.b
    public boolean isIdle() {
        return this.downloadManager.isIdle();
    }

    @Override // com.liulishuo.filedownloader.services.l
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.liulishuo.filedownloader.services.l
    public void onDestroy() {
        o.getConnectionListener().onDisconnected();
    }

    @Override // com.liulishuo.filedownloader.services.l
    public void onStartCommand(Intent intent, int i8, int i9) {
        o.getConnectionListener().onConnected(this);
    }

    @Override // com.liulishuo.filedownloader.i.b.a, com.liulishuo.filedownloader.i.b
    public boolean pause(int i8) {
        return this.downloadManager.pause(i8);
    }

    @Override // com.liulishuo.filedownloader.i.b.a, com.liulishuo.filedownloader.i.b
    public void pauseAllTasks() {
        this.downloadManager.pauseAll();
    }

    @Override // com.liulishuo.filedownloader.i.b.a, com.liulishuo.filedownloader.i.b
    public void registerCallback(com.liulishuo.filedownloader.i.a aVar) {
    }

    @Override // com.liulishuo.filedownloader.i.b.a, com.liulishuo.filedownloader.i.b
    public boolean setMaxNetworkThreadCount(int i8) {
        return this.downloadManager.setMaxNetworkThreadCount(i8);
    }

    @Override // com.liulishuo.filedownloader.i.b.a, com.liulishuo.filedownloader.i.b
    public void start(String str, String str2, boolean z7, int i8, int i9, int i10, boolean z8, FileDownloadHeader fileDownloadHeader, boolean z9) {
        this.downloadManager.start(str, str2, z7, i8, i9, i10, z8, fileDownloadHeader, z9);
    }

    @Override // com.liulishuo.filedownloader.i.b.a, com.liulishuo.filedownloader.i.b
    public void startForeground(int i8, Notification notification) {
        WeakReference<FileDownloadService> weakReference = this.wService;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.wService.get().startForeground(i8, notification);
    }

    @Override // com.liulishuo.filedownloader.i.b.a, com.liulishuo.filedownloader.i.b
    public void stopForeground(boolean z7) {
        WeakReference<FileDownloadService> weakReference = this.wService;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.wService.get().stopForeground(z7);
    }

    @Override // com.liulishuo.filedownloader.i.b.a, com.liulishuo.filedownloader.i.b
    public void unregisterCallback(com.liulishuo.filedownloader.i.a aVar) {
    }
}
