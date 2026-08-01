package ge;

import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z1 extends le.r {

    /* renamed from: s, reason: collision with root package name */
    public final ThreadLocal f4424s;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z1(CoroutineContext coroutineContext, ld.a aVar) {
        super(coroutineContext.m(r0) == null ? coroutineContext.p(r0) : coroutineContext, aVar);
        a2 a2Var = a2.f4332d;
        this.f4424s = new ThreadLocal();
        if (aVar.getContext().m(kotlin.coroutines.d.f5591n) instanceof t) {
            return;
        }
        Object c10 = le.v.c(coroutineContext, null);
        le.v.a(coroutineContext, c10);
        l0(coroutineContext, c10);
    }

    @Override // le.r
    public final void i0() {
        k0();
    }

    public final boolean j0() {
        boolean z10 = this.threadLocalIsSet && this.f4424s.get() == null;
        this.f4424s.remove();
        return !z10;
    }

    public final void k0() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f4424s.get();
            if (pair != null) {
                le.v.a((CoroutineContext) pair.f5552d, pair.f5553e);
            }
            this.f4424s.remove();
        }
    }

    @Override // le.r, ge.k1
    public final void l(Object obj) {
        k0();
        Object u2 = a0.u(obj);
        ld.a aVar = this.f5997r;
        CoroutineContext context = aVar.getContext();
        Object c10 = le.v.c(context, null);
        z1 c11 = c10 != le.v.f6002a ? r.c(aVar, context, c10) : null;
        try {
            aVar.resumeWith(u2);
            if (c11 == null || c11.j0()) {
                le.v.a(context, c10);
            }
        } catch (Throwable th) {
            if (c11 == null || c11.j0()) {
                le.v.a(context, c10);
            }
            throw th;
        }
    }

    public final void l0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f4424s.set(new Pair(coroutineContext, obj));
    }
}
