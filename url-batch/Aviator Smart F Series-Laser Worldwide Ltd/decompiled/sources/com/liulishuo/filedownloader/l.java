package com.liulishuo.filedownloader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes4.dex */
public class l {
    public static final int DEFAULT_INTERVAL = 10;
    public static final int DEFAULT_SUB_PACKAGE_SIZE = 5;
    static final int DISPOSE_MESSENGER_LIST = 2;
    static final int HANDOVER_A_MESSENGER = 1;
    private final ArrayList<v> disposingList;
    private final Handler handler;
    private final Object queueLock;
    private final LinkedBlockingQueue<v> waitingQueue;
    private static final Executor BLOCK_COMPLETED_POOL = com.liulishuo.filedownloader.util.b.newDefaultThreadPool(5, "BlockCompleted");
    static int INTERVAL = 10;
    static int SUB_PACKAGE_SIZE = 5;

    static class a implements Runnable {
        final /* synthetic */ v val$messenger;

        a(v vVar) {
            this.val$messenger = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.val$messenger.handoverMessage();
        }
    }

    private static final class b {
        private static final l INSTANCE = new l(null);

        private b() {
        }
    }

    private static class c implements Handler.Callback {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        private void dispose(ArrayList<v> arrayList) {
            Iterator<v> it = arrayList.iterator();
            while (it.hasNext()) {
                v next = it.next();
                if (!l.interceptBlockCompleteMessage(next)) {
                    next.handoverMessage();
                }
            }
            arrayList.clear();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 1) {
                ((v) message.obj).handoverMessage();
            } else if (i8 == 2) {
                dispose((ArrayList) message.obj);
                l.getImpl().push();
            }
            return true;
        }
    }

    /* synthetic */ l(a aVar) {
        this();
    }

    private void enqueue(v vVar) {
        synchronized (this.queueLock) {
            this.waitingQueue.offer(vVar);
        }
        push();
    }

    public static l getImpl() {
        return b.INSTANCE;
    }

    private void handoverInUIThread(v vVar) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(1, vVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean interceptBlockCompleteMessage(v vVar) {
        if (!vVar.isBlockingCompleted()) {
            return false;
        }
        BLOCK_COMPLETED_POOL.execute(new a(vVar));
        return true;
    }

    public static boolean isIntervalValid() {
        return INTERVAL > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void push() {
        synchronized (this.queueLock) {
            try {
                if (this.disposingList.isEmpty()) {
                    if (this.waitingQueue.isEmpty()) {
                        return;
                    }
                    int i8 = 0;
                    if (isIntervalValid()) {
                        int i9 = INTERVAL;
                        int min = Math.min(this.waitingQueue.size(), SUB_PACKAGE_SIZE);
                        while (i8 < min) {
                            this.disposingList.add(this.waitingQueue.remove());
                            i8++;
                        }
                        i8 = i9;
                    } else {
                        this.waitingQueue.drainTo(this.disposingList);
                    }
                    Handler handler = this.handler;
                    handler.sendMessageDelayed(handler.obtainMessage(2, this.disposingList), i8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void requestEnqueue(v vVar) {
        requestEnqueue(vVar, false);
    }

    private l() {
        this.queueLock = new Object();
        this.disposingList = new ArrayList<>();
        this.handler = new Handler(Looper.getMainLooper(), new c(null));
        this.waitingQueue = new LinkedBlockingQueue<>();
    }

    void requestEnqueue(v vVar, boolean z7) {
        if (vVar.handoverDirectly()) {
            vVar.handoverMessage();
            return;
        }
        if (interceptBlockCompleteMessage(vVar)) {
            return;
        }
        if (!isIntervalValid() && !this.waitingQueue.isEmpty()) {
            synchronized (this.queueLock) {
                try {
                    if (!this.waitingQueue.isEmpty()) {
                        Iterator<v> it = this.waitingQueue.iterator();
                        while (it.hasNext()) {
                            handoverInUIThread(it.next());
                        }
                    }
                    this.waitingQueue.clear();
                } finally {
                }
            }
        }
        if (!isIntervalValid() || z7) {
            handoverInUIThread(vVar);
        } else {
            enqueue(vVar);
        }
    }
}
