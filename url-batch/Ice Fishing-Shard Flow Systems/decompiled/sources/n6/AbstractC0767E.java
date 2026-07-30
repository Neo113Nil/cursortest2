package n6;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n6.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0767E extends u6.i {

    /* renamed from: i, reason: collision with root package name */
    public int f7010i;

    public AbstractC0767E(int i2) {
        super(0L, false);
        this.f7010i = i2;
    }

    public abstract V5.b d();

    public Throwable f(Object obj) {
        C0784q c0784q = obj instanceof C0784q ? (C0784q) obj : null;
        if (c0784q != null) {
            return c0784q.f7076a;
        }
        return null;
    }

    public final void h(Throwable th) {
        AbstractC0792z.i(new C0791y("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), d().getContext());
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r4 = (n6.X) r5.g(n6.C0787u.f7085e);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            V5.b d7 = d();
            Intrinsics.c(d7, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            s6.f fVar = (s6.f) d7;
            X5.c cVar = fVar.f7828m;
            Object obj = fVar.f7830o;
            CoroutineContext context = cVar.getContext();
            Object c7 = s6.u.c(context, obj);
            X x7 = null;
            u0 b7 = c7 != s6.u.f7857a ? r.b(cVar, context, c7) : null;
            try {
                CoroutineContext context2 = cVar.getContext();
                Object i2 = i();
                Throwable f7 = f(i2);
                if (f7 == null) {
                    int i5 = this.f7010i;
                    boolean z7 = true;
                    if (i5 != 1 && i5 != 2) {
                        z7 = false;
                    }
                }
                if (x7 != null && !x7.a()) {
                    CancellationException w4 = ((f0) x7).w();
                    b(w4);
                    R5.l lVar = R5.n.f2421d;
                    cVar.resumeWith(V6.b.n(w4));
                } else if (f7 != null) {
                    R5.l lVar2 = R5.n.f2421d;
                    cVar.resumeWith(V6.b.n(f7));
                } else {
                    R5.l lVar3 = R5.n.f2421d;
                    cVar.resumeWith(g(i2));
                }
                Unit unit = Unit.f6114a;
                if (b7 != null && !b7.Z()) {
                    return;
                }
                s6.u.a(context, c7);
            } catch (Throwable th) {
                if (b7 == null || b7.Z()) {
                    s6.u.a(context, c7);
                }
                throw th;
            }
        } catch (Throwable th2) {
            h(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object g(Object obj) {
        return obj;
    }
}
