package com.liulishuo.filedownloader;

import android.app.Notification;
import android.os.IBinder;
import android.os.RemoteException;
import com.liulishuo.filedownloader.i.a;
import com.liulishuo.filedownloader.i.b;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.FileDownloadService;

/* loaded from: classes4.dex */
class q extends com.liulishuo.filedownloader.services.a {

    protected static class a extends a.AbstractBinderC0294a {
        protected a() {
        }

        @Override // com.liulishuo.filedownloader.i.a.AbstractBinderC0294a, com.liulishuo.filedownloader.i.a
        public void callback(MessageSnapshot messageSnapshot) {
            com.liulishuo.filedownloader.message.c.getImpl().inflow(messageSnapshot);
        }
    }

    q() {
        super(FileDownloadService.SeparateProcessService.class);
    }

    @Override // com.liulishuo.filedownloader.services.a, com.liulishuo.filedownloader.w
    public void clearAllTaskData() {
        if (!isConnected()) {
            com.liulishuo.filedownloader.util.a.clearAllTaskData();
            return;
        }
        try {
            ((com.liulishuo.filedownloader.i.b) getService()).clearAllTaskData();
        } catch (RemoteException e8) {
            e8.printStackTrace();
        }
    }

    @Override // com.liulishuo.filedownloader.services.a, com.liulishuo.filedownloader.w
    public boolean clearTaskData(int i8) {
        if (!isConnected()) {
            return com.liulishuo.filedownloader.util.a.clearTaskData(i8);
        }
        try {
            return ((com.liulishuo.filedownloader.i.b) getService()).clearTaskData(i8);
        } catch (RemoteException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    @Override // com.liulishuo.filedownloader.services.a, com.liulishuo.filedownloader.w
    public long getSofar(int i8) {
        if (!isConnected()) {
            return com.liulishuo.filedownloader.util.a.getSofar(i8);
        }
        try {
            return ((com.liulishuo.filedownloader.i.b) getService()).getSofar(i8);
        } catch (RemoteException e8) {
            e8.printStackTrace();
            return 0L;
        }
    }

    @Override // com.liulishuo.filedownloader.services.a, com.liulishuo.filedownloader.w
    public byte getStatus(int i8) {
        if (!isConnected()) {
            return com.liulishuo.filedownloader.util.a.getStatus(i8);
        }
        try {
            return ((com.liulishuo.filedownloader.i.b) getService()).getStatus(i8);
        } catch (RemoteException e8) {
            e8.printStackTrace();
            return (byte) 0;
        }
    }

    @Override // com.liulishuo.filedownloader.services.a, com.liulishuo.filedownloader.w
    public long getTotal(int i8) {
        if (!isConnected()) {
            return com.liulishuo.filedownloader.util.a.getTotal(i8);
        }
        try {
            return ((com.liulishuo.filedownloader.i.b) getService()).getTotal(i8);
        } catch (RemoteException e8) {
            e8.printStackTrace();
            return 0L;
        }
    }

    @Override // com.liulishuo.filedownloader.services.a, com.liulishuo.filedownloader.w
    public boolean isDownloading(String str, String str2) {
        if (!isConnected()) {
            return com.liulishuo.filedownloader.util.a.isDownloading(str, str2);
        }
        try {
            return ((com.liulishuo.filedownloader.i.b) getService()).checkDownloading(str, str2);
        } catch (RemoteException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    @Override // com.liulishuo.filedownloader.services.a, com.liulishuo.filedownloader.w
    public boolean isIdle() {
        if (!isConnected()) {
            return com.liulishuo.filedownloader.util.a.isIdle();
        }
        try {
            ((com.liulishuo.filedownloader.i.b) getService()).isIdle();
            return true;
        } catch (RemoteException e8) {
            e8.printStackTrace();
            return true;
        }
    }

    @Override // com.liulishuo.filedownloader.services.a, com.liulishuo.filedownloader.w
    public boolean pause(int i8) {
        if (!isConnected()) {
            return com.liulishuo.filedownloader.util.a.pause(i8);
        }
        try {
            return ((com.liulishuo.filedownloader.i.b) getService()).pause(i8);
        } catch (RemoteException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    @Override // com.liulishuo.filedownloader.services.a, com.liulishuo.filedownloader.w
    public void pauseAllTasks() {
        if (!isConnected()) {
            com.liulishuo.filedownloader.util.a.pauseAllTasks();
            return;
        }
        try {
            ((com.liulishuo.filedownloader.i.b) getService()).pauseAllTasks();
        } catch (RemoteException e8) {
            e8.printStackTrace();
        }
    }

    @Override // com.liulishuo.filedownloader.services.a, com.liulishuo.filedownloader.w
    public boolean setMaxNetworkThreadCount(int i8) {
        if (!isConnected()) {
            return com.liulishuo.filedownloader.util.a.setMaxNetworkThreadCount(i8);
        }
        try {
            return ((com.liulishuo.filedownloader.i.b) getService()).setMaxNetworkThreadCount(i8);
        } catch (RemoteException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    @Override // com.liulishuo.filedownloader.services.a, com.liulishuo.filedownloader.w
    public boolean start(String str, String str2, boolean z7, int i8, int i9, int i10, boolean z8, FileDownloadHeader fileDownloadHeader, boolean z9) {
        if (!isConnected()) {
            return com.liulishuo.filedownloader.util.a.start(str, str2, z7);
        }
        try {
            ((com.liulishuo.filedownloader.i.b) getService()).start(str, str2, z7, i8, i9, i10, z8, fileDownloadHeader, z9);
            return true;
        } catch (RemoteException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    @Override // com.liulishuo.filedownloader.services.a, com.liulishuo.filedownloader.w
    public void startForeground(int i8, Notification notification) {
        if (!isConnected()) {
            com.liulishuo.filedownloader.util.a.startForeground(i8, notification);
            return;
        }
        try {
            ((com.liulishuo.filedownloader.i.b) getService()).startForeground(i8, notification);
        } catch (RemoteException e8) {
            e8.printStackTrace();
        }
    }

    @Override // com.liulishuo.filedownloader.services.a, com.liulishuo.filedownloader.w
    public void stopForeground(boolean z7) {
        if (!isConnected()) {
            com.liulishuo.filedownloader.util.a.stopForeground(z7);
            return;
        }
        try {
            try {
                ((com.liulishuo.filedownloader.i.b) getService()).stopForeground(z7);
            } catch (RemoteException e8) {
                e8.printStackTrace();
            }
        } finally {
            this.runServiceForeground = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.liulishuo.filedownloader.services.a
    public com.liulishuo.filedownloader.i.b asInterface(IBinder iBinder) {
        return b.a.asInterface(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.liulishuo.filedownloader.services.a
    public a createCallback() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.liulishuo.filedownloader.services.a
    public void registerCallback(com.liulishuo.filedownloader.i.b bVar, a aVar) {
        bVar.registerCallback(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.liulishuo.filedownloader.services.a
    public void unregisterCallback(com.liulishuo.filedownloader.i.b bVar, a aVar) {
        bVar.unregisterCallback(aVar);
    }
}
