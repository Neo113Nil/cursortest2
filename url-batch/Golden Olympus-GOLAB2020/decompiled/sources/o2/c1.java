package o2;

import a2.AbstractC1241b;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import t2.AbstractC3441l;
import t2.C3440k;

/* loaded from: classes3.dex */
public abstract class c1 {
    public static final Object a(kotlin.coroutines.d dVar) {
        Object f4;
        CoroutineContext context = dVar.getContext();
        AbstractC3367z0.i(context);
        kotlin.coroutines.d c4 = AbstractC1241b.c(dVar);
        C3440k c3440k = c4 instanceof C3440k ? (C3440k) c4 : null;
        if (c3440k == null) {
            f4 = Unit.f41027a;
        } else {
            if (c3440k.f46232e.i(context)) {
                c3440k.n(context, Unit.f41027a);
            } else {
                b1 b1Var = new b1();
                CoroutineContext plus = context.plus(b1Var);
                Unit unit = Unit.f41027a;
                c3440k.n(plus, unit);
                if (b1Var.f42046c) {
                    f4 = AbstractC3441l.d(c3440k) ? AbstractC1241b.f() : unit;
                }
            }
            f4 = AbstractC1241b.f();
        }
        if (f4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return f4 == AbstractC1241b.f() ? f4 : Unit.f41027a;
    }
}
