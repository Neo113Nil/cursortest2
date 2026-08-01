package s7;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n1 extends Thread {

    /* renamed from: d, reason: collision with root package name */
    public final Object f8865d;

    /* renamed from: e, reason: collision with root package name */
    public final BlockingQueue f8866e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8867i = false;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o1 f8868r;

    public n1(o1 o1Var, String str, BlockingQueue blockingQueue) {
        this.f8868r = o1Var;
        c7.c0.g(blockingQueue);
        this.f8865d = new Object();
        this.f8866e = blockingQueue;
        setName(str);
    }

    public final void a() {
        o1 o1Var = this.f8868r;
        synchronized (o1Var.f8902w) {
            try {
                if (!this.f8867i) {
                    o1Var.f8903x.release();
                    o1Var.f8902w.notifyAll();
                    if (this == o1Var.f8896i) {
                        o1Var.f8896i = null;
                    } else if (this == o1Var.f8897r) {
                        o1Var.f8897r = null;
                    } else {
                        v0 v0Var = ((q1) o1Var.f1478d).f8937t;
                        q1.l(v0Var);
                        v0Var.f9050t.a("Current scheduler thread is neither worker nor network");
                    }
                    this.f8867i = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f8868r.f8903x.acquire();
                z10 = true;
            } catch (InterruptedException e2) {
                v0 v0Var = ((q1) this.f8868r.f1478d).f8937t;
                q1.l(v0Var);
                v0Var.f9053w.b(e2, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f8866e;
                m1 m1Var = (m1) blockingQueue.poll();
                if (m1Var != null) {
                    Process.setThreadPriority(true != m1Var.f8842e ? 10 : threadPriority);
                    m1Var.run();
                } else {
                    Object obj = this.f8865d;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f8868r.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e9) {
                                v0 v0Var2 = ((q1) this.f8868r.f1478d).f8937t;
                                q1.l(v0Var2);
                                v0Var2.f9053w.b(e9, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f8868r.f8902w) {
                        if (this.f8866e.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
