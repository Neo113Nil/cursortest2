package defpackage;

import android.view.Choreographer;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class r6 implements gm0 {
    public final Choreographer d;
    public final p6 e;

    public r6(Choreographer choreographer, p6 p6Var) {
        this.d = choreographer;
        this.e = p6Var;
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
        p6 p6Var = this.e;
        tf tfVar = new tf(1, qa0.b(fnVar));
        tfVar.w();
        q6 q6Var = new q6(tfVar, this, function1);
        if (Intrinsics.a(p6Var.g, this.d)) {
            synchronized (p6Var.i) {
                p6Var.k.add(q6Var);
                if (!p6Var.n) {
                    p6Var.n = true;
                    p6Var.g.postFrameCallback(p6Var.o);
                }
            }
            tfVar.y(new t4(p6Var, 2, q6Var));
        } else {
            this.d.postFrameCallback(q6Var);
            tfVar.y(new t4(this, 3, q6Var));
        }
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
