package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x13 extends we2 {
    public final ThreadLocal s;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x13(o30 o30Var, CoroutineContext coroutineContext) {
        super(o30Var, coroutineContext.m(r0) == null ? coroutineContext.p(r0) : coroutineContext);
        y13 y13Var = y13.m;
        this.s = new ThreadLocal();
        if (o30Var.getContext().m(e.d) instanceof t40) {
            return;
        }
        Object c = zw2.c(coroutineContext, null);
        zw2.a(coroutineContext, c);
        p0(coroutineContext, c);
    }

    public final boolean o0() {
        boolean z = this.threadLocalIsSet && this.s.get() == null;
        this.s.remove();
        return !z;
    }

    public final void p0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.s.set(new Pair(coroutineContext, obj));
    }

    @Override // defpackage.we2, defpackage.n61
    public final void r(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.s.get();
            if (pair != null) {
                zw2.a((CoroutineContext) pair.m, pair.n);
            }
            this.s.remove();
        }
        Object a = ix.a(obj);
        o30 o30Var = this.r;
        CoroutineContext context = o30Var.getContext();
        Object c = zw2.c(context, null);
        x13 c2 = c != zw2.a ? r40.c(o30Var, context, c) : null;
        try {
            this.r.resumeWith(a);
            Unit unit = Unit.a;
            if (c2 == null || c2.o0()) {
                zw2.a(context, c);
            }
        } catch (Throwable th) {
            if (c2 == null || c2.o0()) {
                zw2.a(context, c);
            }
            throw th;
        }
    }
}
