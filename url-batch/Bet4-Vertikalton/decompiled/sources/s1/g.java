package s1;

import U.u;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final B.j f3715a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f3716b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f3717c;

    public g(j jVar, B.j jVar2) {
        this.f3717c = jVar;
        this.f3715a = jVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVar;
        String concat = "OkHttp ".concat(((o1.l) this.f3717c.f3721b.f261c).f());
        j jVar = this.f3717c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            jVar.d.h();
            boolean z2 = false;
            try {
                try {
                } catch (Throwable th) {
                    jVar.f3720a.f3345a.f(this);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f3715a.E(jVar, jVar.f());
                uVar = jVar.f3720a.f3345a;
            } catch (IOException e3) {
                e = e3;
                z2 = true;
                if (z2) {
                    w1.n nVar = w1.n.f4190a;
                    w1.n nVar2 = w1.n.f4190a;
                    String str = "Callback failure for " + j.a(jVar);
                    nVar2.getClass();
                    w1.n.i(str, 4, e);
                } else {
                    this.f3715a.C(jVar, e);
                }
                uVar = jVar.f3720a.f3345a;
                uVar.f(this);
            } catch (Throwable th3) {
                th = th3;
                z2 = true;
                jVar.d();
                if (!z2) {
                    IOException iOException = new IOException("canceled due to " + th);
                    w1.d.d(iOException, th);
                    this.f3715a.C(jVar, iOException);
                }
                throw th;
            }
            uVar.f(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
