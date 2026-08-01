package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class k70 implements Runnable {
    public final i5 f;
    public volatile AtomicInteger g = new AtomicInteger(0);
    public final /* synthetic */ n70 h;

    public k70(n70 n70Var, i5 i5Var) {
        this.h = n70Var;
        this.f = i5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o40 o40Var;
        String concat = "OkHttp ".concat(((ou) this.h.g.b).f());
        n70 n70Var = this.h;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            n70Var.i.h();
            boolean z = false;
            try {
                try {
                } catch (Throwable th) {
                    n70Var.f.f.g(this);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f.I(n70Var, n70Var.f());
                o40Var = n70Var.f;
            } catch (IOException e2) {
                e = e2;
                z = true;
                if (z) {
                    q50 q50Var = q50.a;
                    q50 q50Var2 = q50.a;
                    String concat2 = "Callback failure for ".concat(n70.a(n70Var));
                    q50Var2.getClass();
                    q50.i(concat2, 4, e);
                } else {
                    this.f.G(n70Var, e);
                }
                o40Var = n70Var.f;
                o40Var.f.g(this);
            } catch (Throwable th3) {
                th = th3;
                z = true;
                n70Var.d();
                if (!z) {
                    IOException iOException = new IOException("canceled due to " + th);
                    bi.f(iOException, th);
                    this.f.G(n70Var, iOException);
                }
                throw th;
            }
            o40Var.f.g(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
