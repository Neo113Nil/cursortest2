package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jj3 extends Thread {
    public final Object m;
    public final BlockingQueue n;
    public boolean o = false;
    public final /* synthetic */ lj3 p;

    public jj3(lj3 lj3Var, String str, BlockingQueue blockingQueue) {
        this.p = lj3Var;
        ll3.v(blockingQueue);
        this.m = new Object();
        this.n = blockingQueue;
        setName(str);
    }

    public final void a() {
        lj3 lj3Var = this.p;
        synchronized (lj3Var.u) {
            try {
                if (!this.o) {
                    lj3Var.v.release();
                    lj3Var.u.notifyAll();
                    if (this == lj3Var.o) {
                        lj3Var.o = null;
                    } else if (this == lj3Var.p) {
                        lj3Var.p = null;
                    } else {
                        vh3 vh3Var = ((pj3) lj3Var.m).r;
                        pj3.m(vh3Var);
                        vh3Var.r.b("Current scheduler thread is neither worker nor network");
                    }
                    this.o = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.p.v.acquire();
                z = true;
            } catch (InterruptedException e) {
                vh3 vh3Var = ((pj3) this.p.m).r;
                pj3.m(vh3Var);
                vh3Var.u.c(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.n;
                ij3 ij3Var = (ij3) blockingQueue.poll();
                if (ij3Var != null) {
                    Process.setThreadPriority(true != ij3Var.n ? 10 : threadPriority);
                    ij3Var.run();
                } else {
                    Object obj = this.m;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.p.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                vh3 vh3Var2 = ((pj3) this.p.m).r;
                                pj3.m(vh3Var2);
                                vh3Var2.u.c(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.p.u) {
                        if (this.n.peek() == null) {
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
