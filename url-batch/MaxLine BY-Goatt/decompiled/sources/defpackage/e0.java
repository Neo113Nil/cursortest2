package defpackage;

import defpackage.aa2;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class e0 extends n61 implements o30, a50 {
    public final CoroutineContext q;

    public e0(CoroutineContext coroutineContext, boolean z) {
        super(z);
        R((g61) coroutineContext.m(qb2.U));
        this.q = coroutineContext.p(this);
    }

    @Override // defpackage.n61
    public final void Q(hx hxVar) {
        zm3.B(hxVar, this.q);
    }

    @Override // defpackage.n61
    public final void Z(Object obj) {
        if (!(obj instanceof gx)) {
            m0(obj);
        } else {
            gx gxVar = (gx) obj;
            l0(gxVar.a, gx.b.get(gxVar) != 0);
        }
    }

    @Override // defpackage.o30
    public final CoroutineContext getContext() {
        return this.q;
    }

    @Override // defpackage.a50
    public final CoroutineContext n() {
        return this.q;
    }

    public final void n0(d50 d50Var, e0 e0Var, Function2 function2) {
        Object invoke;
        int ordinal = d50Var.ordinal();
        if (ordinal == 0) {
            gs.a(function2, e0Var, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                function2.getClass();
                o30 b = q41.b(q41.a(e0Var, this, function2));
                Unit unit = Unit.a;
                aa2.a aVar = aa2.m;
                b.resumeWith(unit);
                return;
            }
            if (ordinal != 3) {
                a.b();
                return;
            }
            try {
                CoroutineContext coroutineContext = this.q;
                Object c = zw2.c(coroutineContext, null);
                try {
                    if (function2 instanceof hn) {
                        s03.f(2, function2);
                        invoke = function2.invoke(e0Var, this);
                    } else {
                        invoke = q41.c(function2, e0Var, this);
                    }
                    zw2.a(coroutineContext, c);
                    if (invoke != b50.m) {
                        aa2.a aVar2 = aa2.m;
                        resumeWith(invoke);
                    }
                } catch (Throwable th) {
                    zw2.a(coroutineContext, c);
                    throw th;
                }
            } catch (Throwable th2) {
                aa2.a aVar3 = aa2.m;
                resumeWith(new ba2(th2));
            }
        }
    }

    @Override // defpackage.o30
    public final void resumeWith(Object obj) {
        Throwable a = aa2.a(obj);
        if (a != null) {
            obj = new gx(a, false);
        }
        Object V = V(obj);
        if (V == j8.h) {
            return;
        }
        r(V);
    }

    @Override // defpackage.n61
    public final String z() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void m0(Object obj) {
    }

    public void l0(Throwable th, boolean z) {
    }
}
