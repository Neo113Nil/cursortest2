package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qe implements gm0 {
    public final j11 d;
    public final mc e = new mc();

    public qe(j11 j11Var) {
        this.d = j11Var;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element d(f fVar) {
        return e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext i(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }

    @Override // defpackage.gm0
    public final Object j(Function1 function1, fn fnVar) {
        tf tfVar = new tf(1, qa0.b(fnVar));
        tfVar.w();
        oe oeVar = new oe();
        oeVar.a = tfVar;
        oeVar.b = function1;
        tfVar.y(new pe(0, this.e.g(oeVar, this.d)));
        Object u = tfVar.u();
        tn tnVar = tn.d;
        return u;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object p(Object obj, Function2 function2) {
        return function2.b(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext w(f fVar) {
        return e.b(this, fVar);
    }
}
