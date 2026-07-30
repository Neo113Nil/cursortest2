package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qc0 implements j21, mn {
    public final CoroutineContext d;
    public final Function2 e;
    public final cn g;
    public rc1 h;

    public qc0(CoroutineContext coroutineContext, Function2 function2) {
        this.d = coroutineContext;
        this.e = function2;
        this.g = la0.f(coroutineContext.i(this));
    }

    @Override // defpackage.j21
    public final void c() {
        rc1 rc1Var = this.h;
        if (rc1Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            rc1Var.a(cancellationException);
        }
        this.h = uq1.N(this.g, null, this.e, 3);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element d(f fVar) {
        return e.a(this, fVar);
    }

    @Override // defpackage.j21
    public final void e() {
        rc1 rc1Var = this.h;
        if (rc1Var != null) {
            rc1Var.F(new c30(1));
        }
        this.h = null;
    }

    @Override // defpackage.j21
    public final void g() {
        rc1 rc1Var = this.h;
        if (rc1Var != null) {
            rc1Var.F(new c30(1));
        }
        this.h = null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final f getKey() {
        return j50.u;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext i(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object p(Object obj, Function2 function2) {
        return function2.b(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext w(f fVar) {
        return e.b(this, fVar);
    }

    @Override // defpackage.mn
    public final void y(Throwable th, CoroutineContext coroutineContext) {
        rl rlVar = (rl) coroutineContext.d(rl.e);
        if (rlVar != null) {
            yr1.e0(th, new vc(rlVar, 1, this));
        }
        mn mnVar = (mn) this.d.d(j50.u);
        if (mnVar == null) {
            throw th;
        }
        mnVar.y(th, coroutineContext);
    }
}
