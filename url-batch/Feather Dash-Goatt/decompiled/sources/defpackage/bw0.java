package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class bw0 implements gm0 {
    public final gm0 d;
    public final nz e = new nz();

    public bw0(gm0 gm0Var) {
        this.d = gm0Var;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element d(f fVar) {
        return e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext i(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.gm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Function1 function1, fn fnVar) {
        aw0 aw0Var;
        int i;
        boolean z;
        Object u;
        if (fnVar instanceof aw0) {
            aw0Var = (aw0) fnVar;
            int i2 = aw0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aw0Var.k = i2 - Integer.MIN_VALUE;
                Object obj = aw0Var.i;
                tn tnVar = tn.d;
                i = aw0Var.k;
                int i3 = 2;
                if (i != 0) {
                    ca0.v(obj);
                    nz nzVar = this.e;
                    aw0Var.h = function1;
                    aw0Var.k = 1;
                    synchronized (nzVar.b) {
                        z = nzVar.a;
                    }
                    if (z) {
                        u = Unit.a;
                    } else {
                        tf tfVar = new tf(1, qa0.b(aw0Var));
                        tfVar.w();
                        synchronized (nzVar.b) {
                            ((ArrayList) nzVar.c).add(tfVar);
                        }
                        tfVar.y(new qz(nzVar, i3, tfVar));
                        u = tfVar.u();
                        if (u != tnVar) {
                            u = Unit.a;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ca0.v(obj);
                            return obj;
                        }
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function1 = aw0Var.h;
                    ca0.v(obj);
                }
                gm0 gm0Var = this.d;
                aw0Var.h = null;
                aw0Var.k = 2;
                Object j = gm0Var.j(function1, aw0Var);
                return j != tnVar ? tnVar : j;
            }
        }
        aw0Var = new aw0(this, fnVar);
        Object obj2 = aw0Var.i;
        tn tnVar2 = tn.d;
        i = aw0Var.k;
        int i32 = 2;
        if (i != 0) {
        }
        gm0 gm0Var2 = this.d;
        aw0Var.h = null;
        aw0Var.k = 2;
        Object j2 = gm0Var2.j(function1, aw0Var);
        if (j2 != tnVar2) {
        }
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
