package defpackage;

import defpackage.aa2;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q62 implements Runnable {
    public final q30 m;
    public volatile AtomicInteger n = new AtomicInteger(0);
    public final /* synthetic */ t62 o;

    public q62(t62 t62Var, q30 q30Var) {
        this.o = t62Var;
        this.m = q30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fu1 fu1Var;
        String concat = "OkHttp ".concat(((kz0) this.o.n.n).f());
        t62 t62Var = this.o;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            t62Var.p.h();
            boolean z = false;
            try {
                try {
                    w92 f = t62Var.f();
                    try {
                        fs fsVar = (fs) this.m.o;
                        aa2.a aVar = aa2.m;
                        fsVar.resumeWith(f);
                        fu1Var = t62Var.m;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            r12 r12Var = r12.a;
                            r12 r12Var2 = r12.a;
                            String concat2 = "Callback failure for ".concat(t62.a(t62Var));
                            r12Var2.getClass();
                            r12.i(concat2, 4, e);
                        } else {
                            q30 q30Var = this.m;
                            if (!t62Var.y) {
                                fs fsVar2 = (fs) q30Var.o;
                                aa2.a aVar2 = aa2.m;
                                fsVar2.resumeWith(new ba2(e));
                            }
                        }
                        fu1Var = t62Var.m;
                        fu1Var.m.q(this);
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        t62Var.d();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            wi0.a(iOException, th);
                            q30 q30Var2 = this.m;
                            if (!t62Var.y) {
                                fs fsVar3 = (fs) q30Var2.o;
                                aa2.a aVar3 = aa2.m;
                                fsVar3.resumeWith(new ba2(iOException));
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    t62Var.m.m.q(this);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            fu1Var.m.q(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
