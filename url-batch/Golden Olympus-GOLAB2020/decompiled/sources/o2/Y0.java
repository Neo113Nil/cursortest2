package o2;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import t2.C3428C;

/* loaded from: classes3.dex */
public final class Y0 extends C3428C {

    /* renamed from: f, reason: collision with root package name */
    private final ThreadLocal f42037f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Y0(CoroutineContext coroutineContext, kotlin.coroutines.d dVar) {
        super(coroutineContext.get(r0) == null ? coroutineContext.plus(r0) : coroutineContext, dVar);
        Z0 z02 = Z0.f42042b;
        this.f42037f = new ThreadLocal();
        if (dVar.getContext().get(kotlin.coroutines.e.f41111K2) instanceof AbstractC3313G) {
            return;
        }
        Object c4 = t2.K.c(coroutineContext, null);
        t2.K.a(coroutineContext, c4);
        T0(coroutineContext, c4);
    }

    @Override // t2.C3428C, o2.AbstractC3317a
    protected void O0(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f42037f.get();
            if (pair != null) {
                t2.K.a((CoroutineContext) pair.component1(), pair.component2());
            }
            this.f42037f.remove();
        }
        Object a4 = AbstractC3311E.a(obj, this.f46201e);
        kotlin.coroutines.d dVar = this.f46201e;
        CoroutineContext context = dVar.getContext();
        Object c4 = t2.K.c(context, null);
        Y0 g4 = c4 != t2.K.f46209a ? AbstractC3312F.g(dVar, context, c4) : null;
        try {
            this.f46201e.resumeWith(a4);
            Unit unit = Unit.f41027a;
            if (g4 == null || g4.S0()) {
                t2.K.a(context, c4);
            }
        } catch (Throwable th) {
            if (g4 == null || g4.S0()) {
                t2.K.a(context, c4);
            }
            throw th;
        }
    }

    public final boolean S0() {
        boolean z4 = this.threadLocalIsSet && this.f42037f.get() == null;
        this.f42037f.remove();
        return !z4;
    }

    public final void T0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f42037f.set(TuplesKt.to(coroutineContext, obj));
    }
}
