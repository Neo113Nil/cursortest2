package b6;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import u0.C0675e;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final C0675e f3675f;

    /* renamed from: g, reason: collision with root package name */
    public volatile AtomicInteger f3676g = new AtomicInteger(0);

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f3677h;

    public n(q qVar, C0675e c0675e) {
        this.f3677h = qVar;
        this.f3675f = c0675e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        X5.k kVar;
        String str = "OkHttp " + ((X5.o) this.f3677h.f3681g.f331c).f();
        q qVar = this.f3677h;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            qVar.f3683i.h();
            boolean z5 = false;
            try {
                try {
                } catch (Throwable th) {
                    X5.k kVar2 = qVar.f3680f.f3011a;
                    kVar2.getClass();
                    X5.k.c(kVar2, null, this, 3);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f3675f.g(qVar.e());
                kVar = qVar.f3680f.f3011a;
                kVar.getClass();
            } catch (IOException e7) {
                e = e7;
                z5 = true;
                if (z5) {
                    h6.e eVar = h6.e.f4355a;
                    h6.e.f4355a.j("Callback failure for " + q.a(qVar), 4, e);
                } else {
                    ((C4.a) this.f3675f.f5975b).accept(e);
                }
                kVar = qVar.f3680f.f3011a;
                kVar.getClass();
                X5.k.c(kVar, null, this, 3);
            } catch (Throwable th3) {
                th = th3;
                z5 = true;
                qVar.c();
                if (!z5) {
                    IOException iOException = new IOException("canceled due to " + th);
                    iOException.initCause(th);
                    ((C4.a) this.f3675f.f5975b).accept(iOException);
                }
                if (!(th instanceof InterruptedException)) {
                    throw th;
                }
                Thread.currentThread().interrupt();
                kVar = qVar.f3680f.f3011a;
                kVar.getClass();
                X5.k.c(kVar, null, this, 3);
            }
            X5.k.c(kVar, null, this, 3);
        } finally {
            currentThread.setName(name);
        }
    }
}
