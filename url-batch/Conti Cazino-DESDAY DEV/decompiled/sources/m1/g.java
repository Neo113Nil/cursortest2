package m1;

import T.t;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final B0.d f3223a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f3224b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f3225c;

    public g(j jVar, B0.d dVar) {
        this.f3225c = jVar;
        this.f3223a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar;
        String concat = "OkHttp ".concat(((i1.m) this.f3225c.f3229b.f213c).f());
        j jVar = this.f3225c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            jVar.d.h();
            boolean z2 = false;
            try {
                try {
                } catch (Throwable th) {
                    jVar.f3228a.f2478a.f(this);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f3223a.y(jVar, jVar.f());
                tVar = jVar.f3228a.f2478a;
            } catch (IOException e3) {
                e = e3;
                z2 = true;
                if (z2) {
                    q1.n nVar = q1.n.f3571a;
                    q1.n nVar2 = q1.n.f3571a;
                    String str = "Callback failure for " + j.a(jVar);
                    nVar2.getClass();
                    q1.n.i(str, 4, e);
                } else {
                    this.f3223a.x(jVar, e);
                }
                tVar = jVar.f3228a.f2478a;
                tVar.f(this);
            } catch (Throwable th3) {
                th = th3;
                z2 = true;
                jVar.d();
                if (!z2) {
                    IOException iOException = new IOException("canceled due to " + th);
                    q1.l.d(iOException, th);
                    this.f3223a.x(jVar, iOException);
                }
                throw th;
            }
            tVar.f(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
