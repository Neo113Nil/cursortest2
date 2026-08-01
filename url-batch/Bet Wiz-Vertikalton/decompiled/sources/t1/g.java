package t1;

import T.u;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final B.j f3754a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f3755b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f3756c;

    public g(j jVar, B.j jVar2) {
        this.f3756c = jVar;
        this.f3754a = jVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVar;
        String concat = "OkHttp ".concat(((p1.m) this.f3756c.f3760b.f259c).f());
        j jVar = this.f3756c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            jVar.d.h();
            boolean z2 = false;
            try {
                try {
                } catch (Throwable th) {
                    jVar.f3759a.f3391a.f(this);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f3754a.D(jVar, jVar.f());
                uVar = jVar.f3759a.f3391a;
            } catch (IOException e3) {
                e = e3;
                z2 = true;
                if (z2) {
                    x1.n nVar = x1.n.f4286a;
                    x1.n nVar2 = x1.n.f4286a;
                    String str = "Callback failure for " + j.a(jVar);
                    nVar2.getClass();
                    x1.n.i(str, 4, e);
                } else {
                    this.f3754a.B(jVar, e);
                }
                uVar = jVar.f3759a.f3391a;
                uVar.f(this);
            } catch (Throwable th3) {
                th = th3;
                z2 = true;
                jVar.d();
                if (!z2) {
                    IOException iOException = new IOException("canceled due to " + th);
                    x1.d.e(iOException, th);
                    this.f3754a.B(jVar, iOException);
                }
                throw th;
            }
            uVar.f(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
