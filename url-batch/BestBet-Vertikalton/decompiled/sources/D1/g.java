package D1;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import u0.C0385x;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0385x f173a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f174b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f175c;

    public g(j jVar, C0385x c0385x) {
        this.f175c = jVar;
        this.f173a = c0385x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T0.m mVar;
        String concat = "OkHttp ".concat(((z1.l) this.f175c.f179b.f483c).f());
        j jVar = this.f175c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            jVar.d.h();
            boolean z2 = false;
            try {
                try {
                } catch (Throwable th) {
                    jVar.f178a.f4721a.g(this);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f173a.A(jVar, jVar.f());
                mVar = jVar.f178a.f4721a;
            } catch (IOException e3) {
                e = e3;
                z2 = true;
                if (z2) {
                    H1.n nVar = H1.n.f525a;
                    H1.n nVar2 = H1.n.f525a;
                    String str = "Callback failure for " + j.a(jVar);
                    nVar2.getClass();
                    H1.n.i(str, 4, e);
                } else {
                    this.f173a.y(jVar, e);
                }
                mVar = jVar.f178a.f4721a;
                mVar.g(this);
            } catch (Throwable th3) {
                th = th3;
                z2 = true;
                jVar.d();
                if (!z2) {
                    IOException iOException = new IOException("canceled due to " + th);
                    H1.d.b(iOException, th);
                    this.f173a.y(jVar, iOException);
                }
                throw th;
            }
            mVar.g(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
