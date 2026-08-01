package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class dy implements Runnable {
    public final q4 f;
    public volatile AtomicInteger g = new AtomicInteger(0);
    public final /* synthetic */ gy h;

    public dy(gy gyVar, q4 q4Var) {
        this.h = gyVar;
        this.f = q4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uv uvVar;
        String concat = "OkHttp ".concat(this.h.g.a.f());
        gy gyVar = this.h;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            gyVar.i.h();
            boolean z = false;
            try {
                try {
                } catch (Throwable th) {
                    gyVar.f.f.j(this);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f.L(gyVar, gyVar.f());
                uvVar = gyVar.f;
            } catch (IOException e2) {
                e = e2;
                z = true;
                if (z) {
                    ww wwVar = ww.a;
                    ww wwVar2 = ww.a;
                    String concat2 = "Callback failure for ".concat(gy.a(gyVar));
                    wwVar2.getClass();
                    ww.i(concat2, 4, e);
                } else {
                    this.f.J(gyVar, e);
                }
                uvVar = gyVar.f;
                uvVar.f.j(this);
            } catch (Throwable th3) {
                th = th3;
                z = true;
                gyVar.d();
                if (!z) {
                    IOException iOException = new IOException("canceled due to " + th);
                    zo.a(iOException, th);
                    this.f.J(gyVar, iOException);
                }
                throw th;
            }
            uvVar.f.j(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
