package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class k7 extends sf1 implements Function1 {
    public q7 i;
    public v11 j;
    public int k;
    public final /* synthetic */ l7 l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ lg1 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ Function1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(l7 l7Var, Object obj, lg1 lg1Var, long j, Function1 function1, dn dnVar) {
        super(1, dnVar);
        this.l = l7Var;
        this.m = obj;
        this.n = lg1Var;
        this.o = j;
        this.p = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j = this.o;
        Function1 function1 = this.p;
        return new k7(this.l, this.m, this.n, j, function1, (dn) obj).k(Unit.a);
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        q7 q7Var;
        v11 v11Var;
        lg1 lg1Var = this.n;
        tn tnVar = tn.d;
        int i = this.k;
        l7 l7Var = this.l;
        try {
            if (i == 0) {
                ca0.v(obj);
                ((q7) l7Var.d).g = (v7) ((Function1) ((c51) l7Var.b).e).invoke(this.m);
                ((av0) l7Var.f).setValue(lg1Var.c);
                ((av0) l7Var.e).setValue(Boolean.TRUE);
                q7 q7Var2 = (q7) l7Var.d;
                q7 q7Var3 = new q7(q7Var2.d, q7Var2.e.getValue(), op.w(q7Var2.g), q7Var2.h, Long.MIN_VALUE, q7Var2.j);
                v11 v11Var2 = new v11();
                long j = this.o;
                j7 j7Var = new j7(l7Var, q7Var3, this.p, v11Var2, 0);
                this.i = q7Var3;
                this.j = v11Var2;
                this.k = 1;
                if (ka0.f(q7Var3, lg1Var, j, j7Var, this) == tnVar) {
                    return tnVar;
                }
                q7Var = q7Var3;
                v11Var = v11Var2;
            } else {
                if (i != 1) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v11Var = this.j;
                q7Var = this.i;
                ca0.v(obj);
            }
            n7 n7Var = v11Var.d ? n7.d : n7.e;
            l7.a(l7Var);
            return new yw(q7Var, 2, n7Var);
        } catch (CancellationException e) {
            l7.a(l7Var);
            throw e;
        }
    }
}
