package o1;

import T.u;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final B.j f3387a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f3388b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f3389c;

    public g(j jVar, B.j jVar2) {
        this.f3389c = jVar;
        this.f3387a = jVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVar;
        String concat = "OkHttp ".concat(((k1.n) this.f3389c.f3393b.f199c).f());
        j jVar = this.f3389c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            jVar.d.h();
            boolean z2 = false;
            try {
                try {
                } catch (Throwable th) {
                    jVar.f3392a.f2859a.f(this);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f3387a.D(jVar, jVar.f());
                uVar = jVar.f3392a.f2859a;
            } catch (IOException e3) {
                e = e3;
                z2 = true;
                if (z2) {
                    s1.n nVar = s1.n.f3825a;
                    s1.n nVar2 = s1.n.f3825a;
                    String str = "Callback failure for " + j.a(jVar);
                    nVar2.getClass();
                    s1.n.i(str, 4, e);
                } else {
                    this.f3387a.B(jVar, e);
                }
                uVar = jVar.f3392a.f2859a;
                uVar.f(this);
            } catch (Throwable th3) {
                th = th3;
                z2 = true;
                jVar.d();
                if (!z2) {
                    IOException iOException = new IOException("canceled due to " + th);
                    s1.d.d(iOException, th);
                    this.f3387a.B(jVar, iOException);
                }
                throw th;
            }
            uVar.f(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
