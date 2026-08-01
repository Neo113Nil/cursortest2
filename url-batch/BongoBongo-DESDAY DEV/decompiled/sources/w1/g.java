package w1;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final D.g f4232a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f4233b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f4234c;

    public g(j jVar, D.g gVar) {
        this.f4234c = jVar;
        this.f4232a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S0.g gVar;
        String concat = "OkHttp ".concat(((s1.l) this.f4234c.f4238b.f321c).f());
        j jVar = this.f4234c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            jVar.d.h();
            boolean z2 = false;
            try {
                try {
                } catch (Throwable th) {
                    jVar.f4237a.f3661a.f(this);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f4232a.A(jVar, jVar.f());
                gVar = jVar.f4237a.f3661a;
            } catch (IOException e3) {
                e = e3;
                z2 = true;
                if (z2) {
                    A1.o oVar = A1.o.f39a;
                    A1.o oVar2 = A1.o.f39a;
                    String str = "Callback failure for " + j.a(jVar);
                    oVar2.getClass();
                    A1.o.i(str, 4, e);
                } else {
                    this.f4232a.z(jVar, e);
                }
                gVar = jVar.f4237a.f3661a;
                gVar.f(this);
            } catch (Throwable th3) {
                th = th3;
                z2 = true;
                jVar.d();
                if (!z2) {
                    IOException iOException = new IOException("canceled due to " + th);
                    A1.d.e(iOException, th);
                    this.f4232a.z(jVar, iOException);
                }
                throw th;
            }
            gVar.f(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
