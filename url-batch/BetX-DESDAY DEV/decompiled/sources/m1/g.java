package m1;

import T.v;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final i1.e f3568a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f3569b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f3570c;

    public g(j jVar, i1.e eVar) {
        this.f3570c = jVar;
        this.f3568a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v vVar;
        String concat = "OkHttp ".concat(this.f3570c.f3574b.f2780a.f());
        j jVar = this.f3570c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            jVar.f3576d.h();
            boolean z2 = false;
            try {
                try {
                } catch (Throwable th) {
                    jVar.f3573a.f2750a.j(this);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f3568a.onResponse(jVar, jVar.f());
                vVar = jVar.f3573a.f2750a;
            } catch (IOException e3) {
                e = e3;
                z2 = true;
                if (z2) {
                    q1.n nVar = q1.n.f3964a;
                    q1.n nVar2 = q1.n.f3964a;
                    String str = "Callback failure for " + j.a(jVar);
                    nVar2.getClass();
                    q1.n.i(str, 4, e);
                } else {
                    this.f3568a.onFailure(jVar, e);
                }
                vVar = jVar.f3573a.f2750a;
                vVar.j(this);
            } catch (Throwable th3) {
                th = th3;
                z2 = true;
                jVar.d();
                if (!z2) {
                    IOException iOException = new IOException("canceled due to " + th);
                    q1.l.b(iOException, th);
                    this.f3568a.onFailure(jVar, iOException);
                }
                throw th;
            }
            vVar.j(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
