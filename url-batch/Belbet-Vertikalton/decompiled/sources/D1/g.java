package D1;

import V.v;
import a.AbstractC0058a;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final B1.c f230a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f231b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f232c;

    public g(j jVar, B1.c cVar) {
        this.f232c = jVar;
        this.f230a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v vVar;
        String concat = "OkHttp ".concat(((z1.o) this.f232c.f236b.f626c).f());
        j jVar = this.f232c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            jVar.f238d.h();
            boolean z2 = false;
            try {
                try {
                } catch (Throwable th) {
                    jVar.f235a.f4905a.f(this);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f230a.F(jVar, jVar.f());
                vVar = jVar.f235a.f4905a;
            } catch (IOException e2) {
                e = e2;
                z2 = true;
                if (z2) {
                    H1.n nVar = H1.n.f570a;
                    H1.n nVar2 = H1.n.f570a;
                    String str = "Callback failure for " + j.a(jVar);
                    nVar2.getClass();
                    H1.n.i(str, 4, e);
                } else {
                    this.f230a.D(jVar, e);
                }
                vVar = jVar.f235a.f4905a;
                vVar.f(this);
            } catch (Throwable th3) {
                th = th3;
                z2 = true;
                jVar.d();
                if (!z2) {
                    IOException iOException = new IOException("canceled due to " + th);
                    AbstractC0058a.a(iOException, th);
                    this.f230a.D(jVar, iOException);
                }
                throw th;
            }
            vVar.f(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
