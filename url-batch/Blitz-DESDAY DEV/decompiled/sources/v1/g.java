package v1;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final E.g f3871a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f3872b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f3873c;

    public g(j jVar, E.g gVar) {
        this.f3873c = jVar;
        this.f3871a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T0.g gVar;
        String concat = "OkHttp ".concat(((r1.l) this.f3873c.f3877b.f359c).f());
        j jVar = this.f3873c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            jVar.d.h();
            boolean z2 = false;
            try {
                try {
                } catch (Throwable th) {
                    jVar.f3876a.f3507a.f(this);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f3871a.A(jVar, jVar.f());
                gVar = jVar.f3876a.f3507a;
            } catch (IOException e3) {
                e = e3;
                z2 = true;
                if (z2) {
                    z1.o oVar = z1.o.f4365a;
                    z1.o oVar2 = z1.o.f4365a;
                    String str = "Callback failure for " + j.a(jVar);
                    oVar2.getClass();
                    z1.o.i(str, 4, e);
                } else {
                    this.f3871a.z(jVar, e);
                }
                gVar = jVar.f3876a.f3507a;
                gVar.f(this);
            } catch (Throwable th3) {
                th = th3;
                z2 = true;
                jVar.d();
                if (!z2) {
                    IOException iOException = new IOException("canceled due to " + th);
                    z1.l.j(iOException, th);
                    this.f3871a.z(jVar, iOException);
                }
                throw th;
            }
            gVar.f(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
