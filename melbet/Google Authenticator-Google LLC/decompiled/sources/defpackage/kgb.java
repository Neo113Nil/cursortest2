package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgb extends iwr {
    public volatile boolean a;
    public volatile kbq b;
    public List c = new ArrayList();
    public final iwr d;
    private final kgc e;

    public kgb(kgc kgcVar, iwr iwrVar) {
        this.e = kgcVar;
        this.d = iwrVar;
    }

    private final void h(Runnable runnable) {
        synchronized (this) {
            if (this.a) {
                runnable.run();
            } else {
                this.c.add(runnable);
            }
        }
    }

    private final void i(Throwable th, String str) {
        this.b = kbq.c.d(th).e(str);
        this.e.r(str, th);
    }

    @Override // defpackage.iwr
    public final void a(kbq kbqVar, kaa kaaVar) {
        h(new kfu(this, kbqVar, kaaVar, 2));
    }

    @Override // defpackage.iwr
    public final void b(kaa kaaVar) {
        if (this.a) {
            e(kaaVar);
        } else {
            h(new kga(this, kaaVar, 1, null));
        }
    }

    @Override // defpackage.iwr
    public final void c(Object obj) {
        if (this.a) {
            f(obj);
        } else {
            h(new kga(this, obj, 0));
        }
    }

    @Override // defpackage.iwr
    public final void d() {
        if (this.a) {
            g();
        } else {
            h(new iaq(this, 17, null));
        }
    }

    public final void e(kaa kaaVar) {
        if (this.b != null) {
            return;
        }
        try {
            this.d.b(kaaVar);
        } catch (Throwable th) {
            i(th, "Failed to read headers");
        }
    }

    public final void f(Object obj) {
        if (this.b != null) {
            return;
        }
        try {
            this.d.c(obj);
        } catch (Throwable th) {
            i(th, "Failed to read message.");
        }
    }

    public final void g() {
        if (this.b != null) {
            return;
        }
        try {
            this.d.d();
        } catch (Throwable th) {
            i(th, "Failed to call onReady.");
        }
    }
}
