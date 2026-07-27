package W2;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class A0 extends b3.q {

    /* renamed from: k, reason: collision with root package name */
    public final ThreadLocal f4207k;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public A0(C2.a aVar, CoroutineContext coroutineContext) {
        super(aVar, coroutineContext.k(r0) == null ? coroutineContext.s(r0) : coroutineContext);
        B0 b02 = B0.f4218d;
        this.f4207k = new ThreadLocal();
        if (aVar.p().k(kotlin.coroutines.e.f7496f) instanceof AbstractC0298u) {
            return;
        }
        Object c4 = b3.v.c(coroutineContext, null);
        b3.v.a(coroutineContext, c4);
        l0(coroutineContext, c4);
    }

    @Override // b3.q, W2.k0
    public final void B(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f4207k.get();
            if (pair != null) {
                b3.v.a((CoroutineContext) pair.f7485d, pair.f7486e);
            }
            this.f4207k.remove();
        }
        Object a4 = AbstractC0295q.a(obj);
        C2.a aVar = this.f5684j;
        CoroutineContext p4 = aVar.p();
        Object c4 = b3.v.c(p4, null);
        A0 b4 = c4 != b3.v.f5691a ? AbstractC0296s.b(aVar, p4, c4) : null;
        try {
            this.f5684j.u(a4);
            Unit unit = Unit.f7487a;
        } finally {
            if (b4 == null || b4.k0()) {
                b3.v.a(p4, c4);
            }
        }
    }

    public final boolean k0() {
        boolean z4 = this.threadLocalIsSet && this.f4207k.get() == null;
        this.f4207k.remove();
        return !z4;
    }

    public final void l0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f4207k.set(new Pair(coroutineContext, obj));
    }
}
