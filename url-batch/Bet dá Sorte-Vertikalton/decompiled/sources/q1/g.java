package q1;

import T.u;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final B.j f3521a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f3522b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f3523c;

    public g(j jVar, B.j jVar2) {
        this.f3523c = jVar;
        this.f3521a = jVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVar;
        String concat = "OkHttp ".concat(((m1.m) this.f3523c.f3527b.f275c).f());
        j jVar = this.f3523c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            jVar.d.h();
            boolean z2 = false;
            try {
                try {
                } catch (Throwable th) {
                    jVar.f3526a.f3244a.f(this);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f3521a.D(jVar, jVar.f());
                uVar = jVar.f3526a.f3244a;
            } catch (IOException e3) {
                e = e3;
                z2 = true;
                if (z2) {
                    u1.n nVar = u1.n.f3966a;
                    u1.n nVar2 = u1.n.f3966a;
                    String str = "Callback failure for " + j.a(jVar);
                    nVar2.getClass();
                    u1.n.i(str, 4, e);
                } else {
                    this.f3521a.B(jVar, e);
                }
                uVar = jVar.f3526a.f3244a;
                uVar.f(this);
            } catch (Throwable th3) {
                th = th3;
                z2 = true;
                jVar.d();
                if (!z2) {
                    IOException iOException = new IOException("canceled due to " + th);
                    u1.l.e(iOException, th);
                    this.f3521a.B(jVar, iOException);
                }
                throw th;
            }
            uVar.f(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
