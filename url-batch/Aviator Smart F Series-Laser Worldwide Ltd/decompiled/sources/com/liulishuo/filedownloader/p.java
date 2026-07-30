package com.liulishuo.filedownloader;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.liulishuo.filedownloader.event.DownloadServiceConnectChangedEvent;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.FileDownloadService;
import com.liulishuo.filedownloader.services.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
class p implements w, e.a {
    private static final Class<?> SERVICE_CLASS = FileDownloadService.SharedMainProcessService.class;
    private com.liulishuo.filedownloader.services.e handler;
    private boolean runServiceForeground = false;
    private final ArrayList<Runnable> connectedRunnableList = new ArrayList<>();

    p() {
    }

    @Override // com.liulishuo.filedownloader.w
    public void bindStartByContext(Context context) {
        bindStartByContext(context, null);
    }

    @Override // com.liulishuo.filedownloader.w
    public void clearAllTaskData() {
        if (isConnected()) {
            this.handler.clearAllTaskData();
        } else {
            com.liulishuo.filedownloader.util.a.clearAllTaskData();
        }
    }

    @Override // com.liulishuo.filedownloader.w
    public boolean clearTaskData(int i8) {
        return !isConnected() ? com.liulishuo.filedownloader.util.a.clearTaskData(i8) : this.handler.clearTaskData(i8);
    }

    @Override // com.liulishuo.filedownloader.w
    public long getSofar(int i8) {
        return !isConnected() ? com.liulishuo.filedownloader.util.a.getSofar(i8) : this.handler.getSofar(i8);
    }

    @Override // com.liulishuo.filedownloader.w
    public byte getStatus(int i8) {
        return !isConnected() ? com.liulishuo.filedownloader.util.a.getStatus(i8) : this.handler.getStatus(i8);
    }

    @Override // com.liulishuo.filedownloader.w
    public long getTotal(int i8) {
        return !isConnected() ? com.liulishuo.filedownloader.util.a.getTotal(i8) : this.handler.getTotal(i8);
    }

    @Override // com.liulishuo.filedownloader.w
    public boolean isConnected() {
        return this.handler != null;
    }

    @Override // com.liulishuo.filedownloader.w
    public boolean isDownloading(String str, String str2) {
        return !isConnected() ? com.liulishuo.filedownloader.util.a.isDownloading(str, str2) : this.handler.checkDownloading(str, str2);
    }

    @Override // com.liulishuo.filedownloader.w
    public boolean isIdle() {
        return !isConnected() ? com.liulishuo.filedownloader.util.a.isIdle() : this.handler.isIdle();
    }

    @Override // com.liulishuo.filedownloader.w
    public boolean isRunServiceForeground() {
        return this.runServiceForeground;
    }

    @Override // com.liulishuo.filedownloader.services.e.a
    public void onConnected(com.liulishuo.filedownloader.services.e eVar) {
        this.handler = eVar;
        List list = (List) this.connectedRunnableList.clone();
        this.connectedRunnableList.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        f.getImpl().asyncPublishInNewThread(new DownloadServiceConnectChangedEvent(DownloadServiceConnectChangedEvent.ConnectStatus.connected, SERVICE_CLASS));
    }

    @Override // com.liulishuo.filedownloader.services.e.a
    public void onDisconnected() {
        this.handler = null;
        f.getImpl().asyncPublishInNewThread(new DownloadServiceConnectChangedEvent(DownloadServiceConnectChangedEvent.ConnectStatus.disconnected, SERVICE_CLASS));
    }

    @Override // com.liulishuo.filedownloader.w
    public boolean pause(int i8) {
        return !isConnected() ? com.liulishuo.filedownloader.util.a.pause(i8) : this.handler.pause(i8);
    }

    @Override // com.liulishuo.filedownloader.w
    public void pauseAllTasks() {
        if (isConnected()) {
            this.handler.pauseAllTasks();
        } else {
            com.liulishuo.filedownloader.util.a.pauseAllTasks();
        }
    }

    @Override // com.liulishuo.filedownloader.w
    public boolean setMaxNetworkThreadCount(int i8) {
        return !isConnected() ? com.liulishuo.filedownloader.util.a.setMaxNetworkThreadCount(i8) : this.handler.setMaxNetworkThreadCount(i8);
    }

    @Override // com.liulishuo.filedownloader.w
    public boolean start(String str, String str2, boolean z7, int i8, int i9, int i10, boolean z8, FileDownloadHeader fileDownloadHeader, boolean z9) {
        if (!isConnected()) {
            return com.liulishuo.filedownloader.util.a.start(str, str2, z7);
        }
        this.handler.start(str, str2, z7, i8, i9, i10, z8, fileDownloadHeader, z9);
        return true;
    }

    @Override // com.liulishuo.filedownloader.w
    public void startForeground(int i8, Notification notification) {
        if (isConnected()) {
            this.handler.startForeground(i8, notification);
        } else {
            com.liulishuo.filedownloader.util.a.startForeground(i8, notification);
        }
    }

    @Override // com.liulishuo.filedownloader.w
    public void stopForeground(boolean z7) {
        if (!isConnected()) {
            com.liulishuo.filedownloader.util.a.stopForeground(z7);
        } else {
            this.handler.stopForeground(z7);
            this.runServiceForeground = false;
        }
    }

    @Override // com.liulishuo.filedownloader.w
    public void unbindByContext(Context context) {
        context.stopService(new Intent(context, SERVICE_CLASS));
        this.handler = null;
    }

    @Override // com.liulishuo.filedownloader.w
    public void bindStartByContext(Context context, Runnable runnable) {
        if (runnable != null && !this.connectedRunnableList.contains(runnable)) {
            this.connectedRunnableList.add(runnable);
        }
        Intent intent = new Intent(context, SERVICE_CLASS);
        boolean needMakeServiceForeground = com.liulishuo.filedownloader.util.f.needMakeServiceForeground(context);
        this.runServiceForeground = needMakeServiceForeground;
        intent.putExtra("is_foreground", needMakeServiceForeground);
        if (!this.runServiceForeground) {
            context.startService(intent);
            return;
        }
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "start foreground service", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        }
    }
}
