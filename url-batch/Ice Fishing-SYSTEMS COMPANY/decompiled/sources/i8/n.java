package i8;

import com.google.android.gms.internal.ads.C3112dq;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class n implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final S0.e f38385n;

    /* renamed from: u, reason: collision with root package name */
    public volatile AtomicInteger f38386u = new AtomicInteger(0);

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q f38387v;

    public n(q qVar, S0.e eVar) {
        this.f38387v = qVar;
        this.f38385n = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3112dq c3112dq;
        String str = "OkHttp " + ((e8.o) this.f38387v.f38400u.f40101u).f();
        q qVar = this.f38387v;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            qVar.f38402w.h();
            boolean z8 = false;
            try {
                try {
                } catch (Throwable th) {
                    C3112dq c3112dq2 = qVar.f38399n.f37473a;
                    c3112dq2.getClass();
                    C3112dq.j(c3112dq2, null, this, 3);
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f38385n.k(qVar.j());
                c3112dq = qVar.f38399n.f37473a;
                c3112dq.getClass();
            } catch (IOException e9) {
                e = e9;
                z8 = true;
                if (z8) {
                    o8.f fVar = o8.f.f39739a;
                    o8.f.f39739a.j(4, "Callback failure for " + q.a(qVar), e);
                } else {
                    ((I6.a) this.f38385n.f2891u).accept(e);
                }
                c3112dq = qVar.f38399n.f37473a;
                c3112dq.getClass();
                C3112dq.j(c3112dq, null, this, 3);
            } catch (Throwable th3) {
                th = th3;
                z8 = true;
                qVar.h();
                if (!z8) {
                    IOException iOException = new IOException("canceled due to " + th);
                    iOException.initCause(th);
                    ((I6.a) this.f38385n.f2891u).accept(iOException);
                }
                if (!(th instanceof InterruptedException)) {
                    throw th;
                }
                Thread.currentThread().interrupt();
                c3112dq = qVar.f38399n.f37473a;
                c3112dq.getClass();
                C3112dq.j(c3112dq, null, this, 3);
            }
            C3112dq.j(c3112dq, null, this, 3);
        } finally {
            currentThread.setName(name);
        }
    }
}
