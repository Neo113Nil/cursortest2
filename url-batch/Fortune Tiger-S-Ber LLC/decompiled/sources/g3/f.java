package g3;

import a2.s;
import c3.q;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import k3.o;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final s f1940f;
    public volatile AtomicInteger g = new AtomicInteger(0);
    public final /* synthetic */ i h;

    public f(i iVar, s sVar) {
        this.h = iVar;
        this.f1940f = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar;
        String concat = "OkHttp ".concat(this.h.g.f1127a.f());
        i iVar = this.h;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            iVar.f1944i.h();
            boolean z3 = false;
            try {
                try {
                } catch (Throwable th) {
                    iVar.f1943f.f1102f.f(this);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f1940f.D(iVar, iVar.f());
                qVar = iVar.f1943f;
            } catch (IOException e5) {
                e = e5;
                z3 = true;
                if (z3) {
                    o oVar = o.f2841a;
                    o oVar2 = o.f2841a;
                    String str = "Callback failure for " + i.a(iVar);
                    oVar2.getClass();
                    o.i(str, 4, e);
                } else {
                    this.f1940f.B(iVar, e);
                }
                qVar = iVar.f1943f;
                qVar.f1102f.f(this);
            } catch (Throwable th3) {
                th = th3;
                z3 = true;
                iVar.d();
                if (!z3) {
                    IOException iOException = new IOException("canceled due to " + th);
                    l0.g.a(iOException, th);
                    this.f1940f.B(iVar, iOException);
                }
                throw th;
            }
            qVar.f1102f.f(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
