package x3;

import androidx.emoji2.text.q;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import t3.o;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final q f3909f;

    /* renamed from: g, reason: collision with root package name */
    public volatile AtomicInteger f3910g = new AtomicInteger(0);
    public final /* synthetic */ i h;

    public f(i iVar, q qVar) {
        this.h = iVar;
        this.f3909f = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar;
        String concat = "OkHttp ".concat(this.h.f3914g.f3506a.f());
        i iVar = this.h;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            iVar.i.h();
            boolean z4 = false;
            try {
                try {
                } catch (Throwable th) {
                    iVar.f3913f.f3481f.i(this);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f3909f.D(iVar, iVar.f());
                oVar = iVar.f3913f;
            } catch (IOException e5) {
                e = e5;
                z4 = true;
                if (z4) {
                    b4.n nVar = b4.n.f853a;
                    b4.n nVar2 = b4.n.f853a;
                    String str = "Callback failure for " + i.a(iVar);
                    nVar2.getClass();
                    b4.n.i(str, 4, e);
                } else {
                    this.f3909f.B(iVar, e);
                }
                oVar = iVar.f3913f;
                oVar.f3481f.i(this);
            } catch (Throwable th3) {
                th = th3;
                z4 = true;
                iVar.d();
                if (!z4) {
                    IOException iOException = new IOException("canceled due to " + th);
                    s.a.c(iOException, th);
                    this.f3909f.B(iVar, iOException);
                }
                throw th;
            }
            oVar.f3481f.i(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
