package n6;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class u0 extends s6.q {

    /* renamed from: m, reason: collision with root package name */
    public final ThreadLocal f7086m;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u0(V5.b bVar, CoroutineContext coroutineContext) {
        super(bVar, coroutineContext.g(r0) == null ? coroutineContext.j(r0) : coroutineContext);
        v0 v0Var = v0.f7087d;
        this.f7086m = new ThreadLocal();
        if (bVar.getContext().g(kotlin.coroutines.d.f6145f) instanceof AbstractC0786t) {
            return;
        }
        Object c7 = s6.u.c(coroutineContext, null);
        s6.u.a(coroutineContext, c7);
        a0(coroutineContext, c7);
    }

    public final boolean Z() {
        boolean z7 = this.threadLocalIsSet && this.f7086m.get() == null;
        this.f7086m.remove();
        return !z7;
    }

    public final void a0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f7086m.set(new Pair(coroutineContext, obj));
    }

    @Override // s6.q, n6.f0
    public final void m(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f7086m.get();
            if (pair != null) {
                s6.u.a((CoroutineContext) pair.f6112d, pair.f6113e);
            }
            this.f7086m.remove();
        }
        Object m2 = AbstractC0792z.m(obj);
        V5.b bVar = this.f7852l;
        CoroutineContext context = bVar.getContext();
        Object c7 = s6.u.c(context, null);
        u0 b7 = c7 != s6.u.f7857a ? r.b(bVar, context, c7) : null;
        try {
            this.f7852l.resumeWith(m2);
            Unit unit = Unit.f6114a;
            if (b7 == null || b7.Z()) {
                s6.u.a(context, c7);
            }
        } catch (Throwable th) {
            if (b7 == null || b7.Z()) {
                s6.u.a(context, c7);
            }
            throw th;
        }
    }
}
