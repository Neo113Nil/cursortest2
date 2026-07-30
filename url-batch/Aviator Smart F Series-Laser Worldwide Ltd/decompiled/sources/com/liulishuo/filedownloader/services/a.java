package com.liulishuo.filedownloader.services;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.liulishuo.filedownloader.event.DownloadServiceConnectChangedEvent;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class a implements w, ServiceConnection {
    private volatile IInterface service;
    private final Class<?> serviceClass;
    protected boolean runServiceForeground = false;
    private final HashMap<String, Object> uiCacheMap = new HashMap<>();
    private final List<Context> bindContexts = new ArrayList();
    private final ArrayList<Runnable> connectedRunnableList = new ArrayList<>();
    private final Binder callback = createCallback();

    protected a(Class<?> cls) {
        this.serviceClass = cls;
    }

    private void releaseConnect(boolean z7) {
        if (!z7 && this.service != null) {
            try {
                unregisterCallback(this.service, this.callback);
            } catch (RemoteException e8) {
                e8.printStackTrace();
            }
        }
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "release connect resources %s", this.service);
        }
        this.service = null;
        com.liulishuo.filedownloader.f.getImpl().asyncPublishInNewThread(new DownloadServiceConnectChangedEvent(z7 ? DownloadServiceConnectChangedEvent.ConnectStatus.lost : DownloadServiceConnectChangedEvent.ConnectStatus.disconnected, this.serviceClass));
    }

    protected abstract IInterface asInterface(IBinder iBinder);

    @Override // com.liulishuo.filedownloader.w
    public void bindStartByContext(Context context) {
        bindStartByContext(context, null);
    }

    @Override // com.liulishuo.filedownloader.w
    public abstract /* synthetic */ void clearAllTaskData();

    @Override // com.liulishuo.filedownloader.w
    public abstract /* synthetic */ boolean clearTaskData(int i8);

    protected abstract Binder createCallback();

    protected Binder getCallback() {
        return this.callback;
    }

    protected IInterface getService() {
        return this.service;
    }

    @Override // com.liulishuo.filedownloader.w
    public abstract /* synthetic */ long getSofar(int i8);

    @Override // com.liulishuo.filedownloader.w
    public abstract /* synthetic */ byte getStatus(int i8);

    @Override // com.liulishuo.filedownloader.w
    public abstract /* synthetic */ long getTotal(int i8);

    @Override // com.liulishuo.filedownloader.w
    public boolean isConnected() {
        return getService() != null;
    }

    @Override // com.liulishuo.filedownloader.w
    public abstract /* synthetic */ boolean isDownloading(String str, String str2);

    @Override // com.liulishuo.filedownloader.w
    public abstract /* synthetic */ boolean isIdle();

    @Override // com.liulishuo.filedownloader.w
    public boolean isRunServiceForeground() {
        return this.runServiceForeground;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.service = asInterface(iBinder);
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "onServiceConnected %s %s", componentName, this.service);
        }
        try {
            registerCallback(this.service, this.callback);
        } catch (RemoteException e8) {
            e8.printStackTrace();
        }
        List list = (List) this.connectedRunnableList.clone();
        this.connectedRunnableList.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        com.liulishuo.filedownloader.f.getImpl().asyncPublishInNewThread(new DownloadServiceConnectChangedEvent(DownloadServiceConnectChangedEvent.ConnectStatus.connected, this.serviceClass));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "onServiceDisconnected %s %s", componentName, this.service);
        }
        releaseConnect(true);
    }

    @Override // com.liulishuo.filedownloader.w
    public abstract /* synthetic */ boolean pause(int i8);

    @Override // com.liulishuo.filedownloader.w
    public abstract /* synthetic */ void pauseAllTasks();

    protected Object popCache(String str) {
        return this.uiCacheMap.remove(str);
    }

    protected String putCache(Object obj) {
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        this.uiCacheMap.put(obj2, obj);
        return obj2;
    }

    protected abstract void registerCallback(IInterface iInterface, Binder binder);

    @Override // com.liulishuo.filedownloader.w
    public abstract /* synthetic */ boolean setMaxNetworkThreadCount(int i8);

    @Override // com.liulishuo.filedownloader.w
    public abstract /* synthetic */ boolean start(String str, String str2, boolean z7, int i8, int i9, int i10, boolean z8, FileDownloadHeader fileDownloadHeader, boolean z9);

    @Override // com.liulishuo.filedownloader.w
    public abstract /* synthetic */ void startForeground(int i8, Notification notification);

    @Override // com.liulishuo.filedownloader.w
    public abstract /* synthetic */ void stopForeground(boolean z7);

    @Override // com.liulishuo.filedownloader.w
    public void unbindByContext(Context context) {
        if (this.bindContexts.contains(context)) {
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, "unbindByContext %s", context);
            }
            this.bindContexts.remove(context);
            if (this.bindContexts.isEmpty()) {
                releaseConnect(false);
            }
            Intent intent = new Intent(context, this.serviceClass);
            context.unbindService(this);
            context.stopService(intent);
        }
    }

    protected abstract void unregisterCallback(IInterface iInterface, Binder binder);

    @Override // com.liulishuo.filedownloader.w
    public void bindStartByContext(Context context, Runnable runnable) {
        if (com.liulishuo.filedownloader.util.f.isDownloaderProcess(context)) {
            throw new IllegalStateException("Fatal-Exception: You can't bind the FileDownloadService in :filedownloader process.\n It's the invalid operation and is likely to cause unexpected problems.\n Maybe you want to use non-separate process mode for FileDownloader, More detail about non-separate mode, please move to wiki manually: https://github.com/lingochamp/FileDownloader/wiki/filedownloader.properties");
        }
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "bindStartByContext %s", context.getClass().getSimpleName());
        }
        Intent intent = new Intent(context, this.serviceClass);
        if (runnable != null && !this.connectedRunnableList.contains(runnable)) {
            this.connectedRunnableList.add(runnable);
        }
        if (!this.bindContexts.contains(context)) {
            this.bindContexts.add(context);
        }
        boolean needMakeServiceForeground = com.liulishuo.filedownloader.util.f.needMakeServiceForeground(context);
        this.runServiceForeground = needMakeServiceForeground;
        intent.putExtra("is_foreground", needMakeServiceForeground);
        context.bindService(intent, this, 1);
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
