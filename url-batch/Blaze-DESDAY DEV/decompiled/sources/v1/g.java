package v1;

import U.u;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final B.j f4041a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f4042b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f4043c;

    public g(j jVar, B.j jVar2) {
        this.f4043c = jVar;
        this.f4041a = jVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVar;
        String concat = "OkHttp ".concat(((r1.m) this.f4043c.f4047b.f278c).f());
        j jVar = this.f4043c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            jVar.d.h();
            boolean z2 = false;
            try {
                try {
                } catch (Throwable th) {
                    jVar.f4046a.f3491a.f(this);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f4041a.E(jVar, jVar.f());
                uVar = jVar.f4046a.f3491a;
            } catch (IOException e3) {
                e = e3;
                z2 = true;
                if (z2) {
                    z1.n nVar = z1.n.f4366a;
                    z1.n nVar2 = z1.n.f4366a;
                    String str = "Callback failure for " + j.a(jVar);
                    nVar2.getClass();
                    z1.n.i(str, 4, e);
                } else {
                    this.f4041a.C(jVar, e);
                }
                uVar = jVar.f4046a.f3491a;
                uVar.f(this);
            } catch (Throwable th3) {
                th = th3;
                z2 = true;
                jVar.d();
                if (!z2) {
                    IOException iOException = new IOException("canceled due to " + th);
                    z1.d.h(iOException, th);
                    this.f4041a.C(jVar, iOException);
                }
                throw th;
            }
            uVar.f(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
