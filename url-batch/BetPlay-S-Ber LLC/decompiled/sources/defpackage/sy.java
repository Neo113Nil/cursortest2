package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class sy implements Runnable {
    public final h5 f;
    public volatile AtomicInteger g = new AtomicInteger(0);
    public final /* synthetic */ vy h;

    public sy(vy vyVar, h5 h5Var) {
        this.h = vyVar;
        this.f = h5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bw bwVar;
        String concat = "OkHttp ".concat(((yo) this.h.g.b).f());
        vy vyVar = this.h;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            vyVar.i.h();
            boolean z = false;
            try {
                try {
                } catch (Throwable th) {
                    vyVar.f.f.c(this);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f.F(vyVar, vyVar.f());
                bwVar = vyVar.f;
            } catch (IOException e2) {
                e = e2;
                z = true;
                if (z) {
                    jx jxVar = jx.a;
                    jx jxVar2 = jx.a;
                    String concat2 = "Callback failure for ".concat(vy.a(vyVar));
                    jxVar2.getClass();
                    jx.i(concat2, 4, e);
                } else {
                    this.f.D(vyVar, e);
                }
                bwVar = vyVar.f;
                bwVar.f.c(this);
            } catch (Throwable th3) {
                th = th3;
                z = true;
                vyVar.d();
                if (!z) {
                    IOException iOException = new IOException("canceled due to " + th);
                    j8.b(iOException, th);
                    this.f.D(vyVar, iOException);
                }
                throw th;
            }
            bwVar.f.c(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
