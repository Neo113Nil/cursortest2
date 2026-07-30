package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes4.dex */
class r {
    private final b mLaunchTaskPool = new b();

    private static class a {
        private static final r INSTANCE = new r();

        static {
            com.liulishuo.filedownloader.message.c.getImpl().setReceiver(new c0());
        }

        private a() {
        }
    }

    private static class b {
        private ThreadPoolExecutor mPool;
        private LinkedBlockingQueue<Runnable> mWorkQueue;

        b() {
            init();
        }

        private void init() {
            LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
            this.mWorkQueue = linkedBlockingQueue;
            this.mPool = com.liulishuo.filedownloader.util.b.newDefaultThreadPool(3, linkedBlockingQueue, "LauncherTask");
        }

        public void asyncExecute(z.b bVar) {
            this.mPool.execute(new c(bVar));
        }

        public void expire(z.b bVar) {
            this.mWorkQueue.remove(bVar);
        }

        public void expireAll() {
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, "expire %d tasks", Integer.valueOf(this.mWorkQueue.size()));
            }
            this.mPool.shutdownNow();
            init();
        }

        public void expire(k kVar) {
            if (kVar == null) {
                com.liulishuo.filedownloader.util.d.w(this, "want to expire by listener, but the listener provided is null", new Object[0]);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Runnable> it = this.mWorkQueue.iterator();
            while (it.hasNext()) {
                Runnable next = it.next();
                c cVar = (c) next;
                if (cVar.isSameListener(kVar)) {
                    cVar.expire();
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, "expire %d tasks with listener[%s]", Integer.valueOf(arrayList.size()), kVar);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.mPool.remove((Runnable) it2.next());
            }
        }
    }

    private static class c implements Runnable {
        private boolean mExpired = false;
        private final z.b mTaskStarter;

        c(z.b bVar) {
            this.mTaskStarter = bVar;
        }

        public boolean equals(Object obj) {
            return super.equals(obj) || obj == this.mTaskStarter;
        }

        public void expire() {
            this.mExpired = true;
        }

        public boolean isSameListener(k kVar) {
            z.b bVar = this.mTaskStarter;
            return bVar != null && bVar.equalListener(kVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mExpired) {
                return;
            }
            this.mTaskStarter.start();
        }
    }

    r() {
    }

    public static r getImpl() {
        return a.INSTANCE;
    }

    synchronized void expire(z.b bVar) {
        this.mLaunchTaskPool.expire(bVar);
    }

    synchronized void expireAll() {
        this.mLaunchTaskPool.expireAll();
    }

    synchronized void launch(z.b bVar) {
        this.mLaunchTaskPool.asyncExecute(bVar);
    }

    synchronized void expire(k kVar) {
        this.mLaunchTaskPool.expire(kVar);
    }
}
