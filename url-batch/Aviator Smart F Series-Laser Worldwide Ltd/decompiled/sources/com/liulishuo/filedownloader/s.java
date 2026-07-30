package com.liulishuo.filedownloader;

import android.app.Application;
import android.app.Notification;
import android.content.Context;
import com.liulishuo.filedownloader.a;
import com.liulishuo.filedownloader.event.DownloadServiceConnectChangedEvent;
import com.liulishuo.filedownloader.model.FileDownloadTaskAtom;
import com.liulishuo.filedownloader.services.c;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class s {
    private x mLostConnectedHandler;
    private y mQueuesHandler;
    private static final Object INIT_QUEUES_HANDLER_LOCK = new Object();
    private static final Object INIT_LOST_CONNECTED_HANDLER_LOCK = new Object();

    private static final class a {
        private static final s INSTANCE = new s();

        private a() {
        }
    }

    public static void disableAvoidDropFrame() {
        setGlobalPost2UIInterval(-1);
    }

    public static void enableAvoidDropFrame() {
        setGlobalPost2UIInterval(10);
    }

    public static s getImpl() {
        return a.INSTANCE;
    }

    public static void init(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("the provided context must not be null!");
        }
        setup(context);
    }

    public static boolean isEnabledAvoidDropFrame() {
        return l.isIntervalValid();
    }

    public static void setGlobalHandleSubPackageSize(int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("sub package size must more than 0");
        }
        l.SUB_PACKAGE_SIZE = i8;
    }

    public static void setGlobalPost2UIInterval(int i8) {
        l.INTERVAL = i8;
    }

    public static void setup(Context context) {
        com.liulishuo.filedownloader.util.c.holdContext(context.getApplicationContext());
    }

    public static c.a setupOnApplicationOnCreate(Application application) {
        com.liulishuo.filedownloader.util.c.holdContext(application.getApplicationContext());
        c.a aVar = new c.a();
        com.liulishuo.filedownloader.download.b.getImpl().setInitCustomMaker(aVar);
        return aVar;
    }

    public void addServiceConnectListener(e eVar) {
        f.getImpl().addListener(DownloadServiceConnectChangedEvent.ID, eVar);
    }

    public void bindService() {
        if (isServiceConnected()) {
            return;
        }
        o.getImpl().bindStartByContext(com.liulishuo.filedownloader.util.c.getAppContext());
    }

    public boolean clear(int i8, String str) {
        pause(i8);
        if (!o.getImpl().clearTaskData(i8)) {
            return false;
        }
        File file = new File(com.liulishuo.filedownloader.util.f.getTempPath(str));
        if (file.exists()) {
            file.delete();
        }
        File file2 = new File(str);
        if (!file2.exists()) {
            return true;
        }
        file2.delete();
        return true;
    }

    public void clearAllTaskData() {
        pauseAll();
        o.getImpl().clearAllTaskData();
    }

    public com.liulishuo.filedownloader.a create(String str) {
        return new c(str);
    }

    x getLostConnectedHandler() {
        if (this.mLostConnectedHandler == null) {
            synchronized (INIT_LOST_CONNECTED_HANDLER_LOCK) {
                try {
                    if (this.mLostConnectedHandler == null) {
                        b0 b0Var = new b0();
                        this.mLostConnectedHandler = b0Var;
                        addServiceConnectListener(b0Var);
                    }
                } finally {
                }
            }
        }
        return this.mLostConnectedHandler;
    }

    y getQueuesHandler() {
        if (this.mQueuesHandler == null) {
            synchronized (INIT_QUEUES_HANDLER_LOCK) {
                try {
                    if (this.mQueuesHandler == null) {
                        this.mQueuesHandler = new e0();
                    }
                } finally {
                }
            }
        }
        return this.mQueuesHandler;
    }

    public long getSoFar(int i8) {
        a.b bVar = j.getImpl().get(i8);
        return bVar == null ? o.getImpl().getSofar(i8) : bVar.getOrigin().getLargeFileSoFarBytes();
    }

    public byte getStatus(String str, String str2) {
        return getStatus(com.liulishuo.filedownloader.util.f.generateId(str, str2), str2);
    }

    public byte getStatusIgnoreCompleted(int i8) {
        return getStatus(i8, (String) null);
    }

    public long getTotal(int i8) {
        a.b bVar = j.getImpl().get(i8);
        return bVar == null ? o.getImpl().getTotal(i8) : bVar.getOrigin().getLargeFileTotalBytes();
    }

    public h insureServiceBind() {
        return new h();
    }

    public i insureServiceBindAsync() {
        return new i();
    }

    public boolean isServiceConnected() {
        return o.getImpl().isConnected();
    }

    public void pause(k kVar) {
        r.getImpl().expire(kVar);
        Iterator<a.b> it = j.getImpl().copy(kVar).iterator();
        while (it.hasNext()) {
            it.next().getOrigin().pause();
        }
    }

    public void pauseAll() {
        r.getImpl().expireAll();
        for (a.b bVar : j.getImpl().copy()) {
            bVar.getOrigin().pause();
        }
        if (o.getImpl().isConnected()) {
            o.getImpl().pauseAllTasks();
        } else {
            d0.createMarker();
        }
    }

    public void removeServiceConnectListener(e eVar) {
        f.getImpl().removeListener(DownloadServiceConnectChangedEvent.ID, eVar);
    }

    public int replaceListener(String str, k kVar) {
        return replaceListener(str, com.liulishuo.filedownloader.util.f.getDefaultSaveFilePath(str), kVar);
    }

    public boolean setMaxNetworkThreadCount(int i8) {
        if (j.getImpl().isEmpty()) {
            return o.getImpl().setMaxNetworkThreadCount(i8);
        }
        com.liulishuo.filedownloader.util.d.w(this, "Can't change the max network thread count, because there are actively executing tasks in FileDownloader, please try again after all actively executing tasks are completed or invoking FileDownloader#pauseAll directly.", new Object[0]);
        return false;
    }

    public boolean setTaskCompleted(String str, String str2, long j8) {
        com.liulishuo.filedownloader.util.d.w(this, "If you invoked this method, please remove it directly feel free, it doesn't need any longer", new Object[0]);
        return true;
    }

    public boolean start(k kVar, boolean z7) {
        if (kVar != null) {
            return z7 ? getQueuesHandler().startQueueSerial(kVar) : getQueuesHandler().startQueueParallel(kVar);
        }
        com.liulishuo.filedownloader.util.d.w(this, "Tasks with the listener can't start, because the listener provided is null: [null, %B]", Boolean.valueOf(z7));
        return false;
    }

    public void startForeground(int i8, Notification notification) {
        o.getImpl().startForeground(i8, notification);
    }

    public void stopForeground(boolean z7) {
        o.getImpl().stopForeground(z7);
    }

    public void unBindService() {
        if (isServiceConnected()) {
            o.getImpl().unbindByContext(com.liulishuo.filedownloader.util.c.getAppContext());
        }
    }

    public boolean unBindServiceIfIdle() {
        if (!isServiceConnected() || !j.getImpl().isEmpty() || !o.getImpl().isIdle()) {
            return false;
        }
        unBindService();
        return true;
    }

    public byte getStatus(int i8, String str) {
        a.b bVar = j.getImpl().get(i8);
        byte status = bVar == null ? o.getImpl().getStatus(i8) : bVar.getOrigin().getStatus();
        if (str != null && status == 0 && com.liulishuo.filedownloader.util.f.isFilenameConverted(com.liulishuo.filedownloader.util.c.getAppContext()) && new File(str).exists()) {
            return (byte) -3;
        }
        return status;
    }

    public int replaceListener(String str, String str2, k kVar) {
        return replaceListener(com.liulishuo.filedownloader.util.f.generateId(str, str2), kVar);
    }

    public boolean setTaskCompleted(List<FileDownloadTaskAtom> list) {
        com.liulishuo.filedownloader.util.d.w(this, "If you invoked this method, please remove it directly feel free, it doesn't need any longer", new Object[0]);
        return true;
    }

    public static void init(Context context, c.a aVar) {
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(s.class, "init Downloader with params: %s %s", context, aVar);
        }
        if (context != null) {
            com.liulishuo.filedownloader.util.c.holdContext(context.getApplicationContext());
            com.liulishuo.filedownloader.download.b.getImpl().setInitCustomMaker(aVar);
            return;
        }
        throw new IllegalArgumentException("the provided context must not be null!");
    }

    public int replaceListener(int i8, k kVar) {
        a.b bVar = j.getImpl().get(i8);
        if (bVar == null) {
            return 0;
        }
        bVar.getOrigin().setListener(kVar);
        return bVar.getOrigin().getId();
    }

    public void bindService(Runnable runnable) {
        if (isServiceConnected()) {
            runnable.run();
        } else {
            o.getImpl().bindStartByContext(com.liulishuo.filedownloader.util.c.getAppContext(), runnable);
        }
    }

    public int pause(int i8) {
        List<a.b> downloadingList = j.getImpl().getDownloadingList(i8);
        if (downloadingList == null || downloadingList.isEmpty()) {
            com.liulishuo.filedownloader.util.d.w(this, "request pause but not exist %d", Integer.valueOf(i8));
            return 0;
        }
        Iterator<a.b> it = downloadingList.iterator();
        while (it.hasNext()) {
            it.next().getOrigin().pause();
        }
        return downloadingList.size();
    }
}
