package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class kt extends jt {
    public final xm0 p;

    public kt(xm0 xm0Var, CoroutineContext coroutineContext, int i, hq hqVar) {
        super(coroutineContext, i, hqVar);
        this.p = xm0Var;
    }

    @Override // defpackage.jt, defpackage.xm0
    public final Object a(ym0 ym0Var, o30 o30Var) {
        if (this.n == -3) {
            CoroutineContext context = o30Var.getContext();
            Boolean bool = Boolean.FALSE;
            ww wwVar = new ww(17);
            CoroutineContext coroutineContext = this.m;
            CoroutineContext p = !((Boolean) coroutineContext.y(bool, wwVar)).booleanValue() ? context.p(coroutineContext) : r40.a(context, coroutineContext, false);
            if (Intrinsics.b(p, context)) {
                Object h = h(ym0Var, o30Var);
                return h == b50.m ? h : Unit.a;
            }
            s30 s30Var = e.d;
            if (Intrinsics.b(p.m(s30Var), context.m(s30Var))) {
                CoroutineContext context2 = o30Var.getContext();
                if (!(ym0Var instanceof vi2) && !(ym0Var instanceof us1)) {
                    ym0Var = new dd(ym0Var, context2);
                }
                Object U = s03.U(p, ym0Var, zw2.b(p), new v(11, null, this), o30Var);
                return U == b50.m ? U : Unit.a;
            }
        }
        Object a = super.a(ym0Var, o30Var);
        return a == b50.m ? a : Unit.a;
    }

    @Override // defpackage.jt
    public final Object d(e52 e52Var, v vVar) {
        Object h = h(new vi2(e52Var), vVar);
        return h == b50.m ? h : Unit.a;
    }

    public abstract Object h(ym0 ym0Var, o30 o30Var);

    @Override // defpackage.jt
    public final String toString() {
        return this.p + " -> " + super.toString();
    }
}
