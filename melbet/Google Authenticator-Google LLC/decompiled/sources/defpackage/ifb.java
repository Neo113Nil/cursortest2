package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifb extends iws {
    public iwr d;
    private final hvi e;
    private final Executor f = new hvv(huf.a);
    public final Queue a = new ArrayDeque();
    public iws c = null;
    public boolean b = false;

    public ifb(hvi hviVar) {
        this.e = hviVar;
    }

    private final void f(Runnable runnable) {
        this.f.execute(gvx.h(new iep(this, runnable, 3)));
    }

    @Override // defpackage.iws
    public final void a(iwr iwrVar, kaa kaaVar) {
        this.d = iwrVar;
        hoq.av(this.e, new ecu(this, iwrVar, 3), this.f);
        f(new gbm(this, iwrVar, kaaVar, 15));
    }

    @Override // defpackage.iws
    public final void c() {
        f(new iaq(this, 4));
    }

    @Override // defpackage.iws
    public final void d(int i) {
        f(new vz(this, i, 7));
    }

    @Override // defpackage.iws
    public final void e(Object obj) {
        f(new iep(this, obj, 4));
    }

    @Override // defpackage.iws
    public final void r(String str, Throwable th) {
        f(new gbm(this, str, th, 14));
    }

    public final String toString() {
        return super.toString() + "delegate=[" + String.valueOf(this.c) + "]";
    }
}
