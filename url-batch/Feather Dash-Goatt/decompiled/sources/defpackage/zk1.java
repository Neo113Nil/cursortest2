package defpackage;

import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class zk1 extends y61 {
    public final ThreadLocal k;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zk1(dn dnVar, CoroutineContext coroutineContext) {
        super(dnVar, coroutineContext.d(r0) == null ? coroutineContext.i(r0) : coroutineContext);
        al1 al1Var = al1.d;
        this.k = new ThreadLocal();
        if (dnVar.g().d(d.f) instanceof ln) {
            return;
        }
        Object c = bi1.c(coroutineContext, null);
        bi1.a(coroutineContext, c);
        t0(coroutineContext, c);
    }

    @Override // defpackage.y61, defpackage.qb0
    public final void C(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.k.get();
            if (pair != null) {
                bi1.a((CoroutineContext) pair.d, pair.e);
            }
            this.k.remove();
        }
        Object F = op.F(obj);
        dn dnVar = this.j;
        CoroutineContext g = dnVar.g();
        Object c = bi1.c(g, null);
        zk1 c2 = c != bi1.a ? jn.c(dnVar, g, c) : null;
        try {
            this.j.l(F);
            if (c2 == null || c2.s0()) {
                bi1.a(g, c);
            }
        } catch (Throwable th) {
            if (c2 == null || c2.s0()) {
                bi1.a(g, c);
            }
            throw th;
        }
    }

    public final boolean s0() {
        boolean z = this.threadLocalIsSet && this.k.get() == null;
        this.k.remove();
        return !z;
    }

    public final void t0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.k.set(new Pair(coroutineContext, obj));
    }
}
