package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class f10 implements Runnable {
    public final a5 f;
    public volatile AtomicInteger g = new AtomicInteger(0);
    public final /* synthetic */ i10 h;

    public f10(i10 i10Var, a5 a5Var) {
        this.h = i10Var;
        this.f = a5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xy xyVar;
        String concat = "OkHttp ".concat(this.h.g.a.f());
        i10 i10Var = this.h;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            i10Var.i.h();
            boolean z = false;
            try {
                try {
                } catch (Throwable th) {
                    i10Var.f.f.j(this);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f.L(i10Var, i10Var.f());
                xyVar = i10Var.f;
            } catch (IOException e2) {
                e = e2;
                z = true;
                if (z) {
                    zz zzVar = zz.a;
                    zz zzVar2 = zz.a;
                    String concat2 = "Callback failure for ".concat(i10.a(i10Var));
                    zzVar2.getClass();
                    zz.i(concat2, 4, e);
                } else {
                    this.f.J(i10Var, e);
                }
                xyVar = i10Var.f;
                xyVar.f.j(this);
            } catch (Throwable th3) {
                th = th3;
                z = true;
                i10Var.d();
                if (!z) {
                    IOException iOException = new IOException("canceled due to " + th);
                    la0.f(iOException, th);
                    this.f.J(i10Var, iOException);
                }
                throw th;
            }
            xyVar.f.j(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
