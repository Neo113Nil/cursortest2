package com.liulishuo.filedownloader;

import android.app.Notification;
import android.content.Context;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.e;

/* loaded from: classes4.dex */
public class o implements w {
    private final w handler;

    private static final class b {
        private static final o INSTANCE = new o();

        private b() {
        }
    }

    public static e.a getConnectionListener() {
        if (getImpl().handler instanceof p) {
            return (e.a) getImpl().handler;
        }
        return null;
    }

    public static o getImpl() {
        return b.INSTANCE;
    }

    @Override // com.liulishuo.filedownloader.w
    public void bindStartByContext(Context context) {
        this.handler.bindStartByContext(context);
    }

    @Override // com.liulishuo.filedownloader.w
    public void clearAllTaskData() {
        this.handler.clearAllTaskData();
    }

    @Override // com.liulishuo.filedownloader.w
    public boolean clearTaskData(int i8) {
        return this.handler.clearTaskData(i8);
    }

    @Override // com.liulishuo.filedownloader.w
    public long getSofar(int i8) {
        return this.handler.getSofar(i8);
    }

    @Override // com.liulishuo.filedownloader.w
    public byte getStatus(int i8) {
        return this.handler.getStatus(i8);
    }

    @Override // com.liulishuo.filedownloader.w
    public long getTotal(int i8) {
        return this.handler.getTotal(i8);
    }

    @Override // com.liulishuo.filedownloader.w
    public boolean isConnected() {
        return this.handler.isConnected();
    }

    @Override // com.liulishuo.filedownloader.w
    public boolean isDownloading(String str, String str2) {
        return this.handler.isDownloading(str, str2);
    }

    @Override // com.liulishuo.filedownloader.w
    public boolean isIdle() {
        return this.handler.isIdle();
    }

    @Override // com.liulishuo.filedownloader.w
    public boolean isRunServiceForeground() {
        return this.handler.isRunServiceForeground();
    }

    @Override // com.liulishuo.filedownloader.w
    public boolean pause(int i8) {
        return this.handler.pause(i8);
    }

    @Override // com.liulishuo.filedownloader.w
    public void pauseAllTasks() {
        this.handler.pauseAllTasks();
    }

    @Override // com.liulishuo.filedownloader.w
    public boolean setMaxNetworkThreadCount(int i8) {
        return this.handler.setMaxNetworkThreadCount(i8);
    }

    @Override // com.liulishuo.filedownloader.w
    public boolean start(String str, String str2, boolean z7, int i8, int i9, int i10, boolean z8, FileDownloadHeader fileDownloadHeader, boolean z9) {
        return this.handler.start(str, str2, z7, i8, i9, i10, z8, fileDownloadHeader, z9);
    }

    @Override // com.liulishuo.filedownloader.w
    public void startForeground(int i8, Notification notification) {
        this.handler.startForeground(i8, notification);
    }

    @Override // com.liulishuo.filedownloader.w
    public void stopForeground(boolean z7) {
        this.handler.stopForeground(z7);
    }

    @Override // com.liulishuo.filedownloader.w
    public void unbindByContext(Context context) {
        this.handler.unbindByContext(context);
    }

    private o() {
        this.handler = com.liulishuo.filedownloader.util.e.getImpl().processNonSeparate ? new p() : new q();
    }

    @Override // com.liulishuo.filedownloader.w
    public void bindStartByContext(Context context, Runnable runnable) {
        this.handler.bindStartByContext(context, runnable);
    }
}
