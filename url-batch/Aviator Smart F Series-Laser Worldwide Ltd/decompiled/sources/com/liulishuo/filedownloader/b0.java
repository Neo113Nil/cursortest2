package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.a;
import com.liulishuo.filedownloader.event.DownloadServiceConnectChangedEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class b0 extends e implements x {
    private final ArrayList<a.b> mWaitingList = new ArrayList<>();

    @Override // com.liulishuo.filedownloader.e
    public void connected() {
        y queuesHandler = s.getImpl().getQueuesHandler();
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "The downloader service is connected.", new Object[0]);
        }
        synchronized (this.mWaitingList) {
            try {
                List<a.b> list = (List) this.mWaitingList.clone();
                this.mWaitingList.clear();
                ArrayList arrayList = new ArrayList(queuesHandler.serialQueueSize());
                for (a.b bVar : list) {
                    int attachKey = bVar.getAttachKey();
                    if (queuesHandler.contain(attachKey)) {
                        bVar.getOrigin().asInQueueTask().enqueue();
                        if (!arrayList.contains(Integer.valueOf(attachKey))) {
                            arrayList.add(Integer.valueOf(attachKey));
                        }
                    } else {
                        bVar.startTaskByRescue();
                    }
                }
                queuesHandler.unFreezeSerialQueues(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.liulishuo.filedownloader.e
    public void disconnected() {
        if (getConnectStatus() != DownloadServiceConnectChangedEvent.ConnectStatus.lost) {
            if (j.getImpl().size() > 0) {
                com.liulishuo.filedownloader.util.d.w(this, "file download service has be unbound but the size of active tasks are not empty %d ", Integer.valueOf(j.getImpl().size()));
                return;
            }
            return;
        }
        y queuesHandler = s.getImpl().getQueuesHandler();
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "lost the connection to the file download service, and current active task size is %d", Integer.valueOf(j.getImpl().size()));
        }
        if (j.getImpl().size() > 0) {
            synchronized (this.mWaitingList) {
                try {
                    j.getImpl().divertAndIgnoreDuplicate(this.mWaitingList);
                    Iterator<a.b> it = this.mWaitingList.iterator();
                    while (it.hasNext()) {
                        it.next().free();
                    }
                    queuesHandler.freezeAllSerialQueues();
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                s.getImpl().bindService();
            } catch (IllegalStateException unused) {
                com.liulishuo.filedownloader.util.d.w(this, "restart service failed, you may need to restart downloading manually when the app comes back to foreground", new Object[0]);
            }
        }
    }

    @Override // com.liulishuo.filedownloader.x
    public boolean dispatchTaskStart(a.b bVar) {
        if (!s.getImpl().isServiceConnected()) {
            synchronized (this.mWaitingList) {
                try {
                    if (!s.getImpl().isServiceConnected()) {
                        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                            com.liulishuo.filedownloader.util.d.d(this, "Waiting for connecting with the downloader service... %d", Integer.valueOf(bVar.getOrigin().getId()));
                        }
                        o.getImpl().bindStartByContext(com.liulishuo.filedownloader.util.c.getAppContext());
                        if (!this.mWaitingList.contains(bVar)) {
                            bVar.free();
                            this.mWaitingList.add(bVar);
                        }
                        return true;
                    }
                } finally {
                }
            }
        }
        taskWorkFine(bVar);
        return false;
    }

    @Override // com.liulishuo.filedownloader.x
    public boolean isInWaitingList(a.b bVar) {
        return !this.mWaitingList.isEmpty() && this.mWaitingList.contains(bVar);
    }

    @Override // com.liulishuo.filedownloader.x
    public void taskWorkFine(a.b bVar) {
        if (this.mWaitingList.isEmpty()) {
            return;
        }
        synchronized (this.mWaitingList) {
            this.mWaitingList.remove(bVar);
        }
    }
}
