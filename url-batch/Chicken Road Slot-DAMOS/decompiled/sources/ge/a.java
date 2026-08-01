package ge;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a extends k1 implements ld.a, x {

    /* renamed from: i, reason: collision with root package name */
    public final CoroutineContext f4322i;

    public a(CoroutineContext coroutineContext, boolean z10) {
        super(z10);
        O((c1) coroutineContext.m(u.f4403e));
        this.f4322i = coroutineContext.p(this);
    }

    @Override // ge.k1
    public final void N(com.google.android.gms.internal.measurement.d0 d0Var) {
        a0.o(d0Var, this.f4322i);
    }

    @Override // ge.k1
    public final void X(Object obj) {
        if (!(obj instanceof q)) {
            g0(obj);
        } else {
            q qVar = (q) obj;
            f0(qVar.f4394a, q.f4393b.get(qVar) == 1);
        }
    }

    @Override // ld.a
    public final CoroutineContext getContext() {
        return this.f4322i;
    }

    @Override // ge.x
    public final CoroutineContext h() {
        return this.f4322i;
    }

    public final void h0(y yVar, a aVar, Function2 function2) {
        Object invoke;
        int ordinal = yVar.ordinal();
        if (ordinal == 0) {
            c6.f.d0(function2, aVar, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                function2.getClass();
                ld.a b10 = md.f.b(md.f.a(function2, aVar, this));
                Unit unit = Unit.f5554a;
                hd.l lVar = hd.n.f4511e;
                b10.resumeWith(unit);
                return;
            }
            if (ordinal != 3) {
                a2.r.p();
                return;
            }
            try {
                CoroutineContext coroutineContext = this.f4322i;
                Object c10 = le.v.c(coroutineContext, null);
                try {
                    if (function2 instanceof nd.a) {
                        wd.g0.c(2, function2);
                        invoke = function2.invoke(aVar, this);
                    } else {
                        invoke = md.f.c(function2, aVar, this);
                    }
                    le.v.a(coroutineContext, c10);
                    if (invoke != md.a.f6622d) {
                        hd.l lVar2 = hd.n.f4511e;
                        resumeWith(invoke);
                    }
                } catch (Throwable th) {
                    le.v.a(coroutineContext, c10);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof g0) {
                    th = ((g0) th).f4351d;
                }
                hd.l lVar3 = hd.n.f4511e;
                resumeWith(cf.c.n(th));
            }
        }
    }

    @Override // ld.a
    public final void resumeWith(Object obj) {
        Throwable a9 = hd.n.a(obj);
        if (a9 != null) {
            obj = new q(a9, false);
        }
        Object T = T(obj);
        if (T == a0.f4327e) {
            return;
        }
        l(T);
    }

    @Override // ge.k1
    public final String t() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void g0(Object obj) {
    }

    public void f0(Throwable th, boolean z10) {
    }
}
