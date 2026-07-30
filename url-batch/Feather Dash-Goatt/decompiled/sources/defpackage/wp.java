package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wp extends sf1 implements Function2 {
    public w11 i;
    public q7 j;
    public int k;
    public final /* synthetic */ float l;
    public final /* synthetic */ xp m;
    public final /* synthetic */ z71 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp(float f, xp xpVar, z71 z71Var, dn dnVar) {
        super(2, dnVar);
        this.l = f;
        this.m = xpVar;
        this.n = z71Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((wp) h((dn) obj2, (sn) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        return new wp(this.l, this.m, this.n, dnVar);
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        float f;
        q7 q7Var;
        w11 w11Var;
        q7 q7Var2;
        qp qpVar;
        j7 j7Var;
        Object obj2 = tn.d;
        int i = this.k;
        if (i == 0) {
            ca0.v(obj);
            f = this.l;
            if (Math.abs(f) > 1.0f) {
                w11 w11Var2 = new w11();
                w11Var2.d = f;
                w11 w11Var3 = new w11();
                q7 a = mo.a(f, 28);
                try {
                    xp xpVar = this.m;
                    qpVar = xpVar.a;
                    j7Var = new j7(w11Var3, this.n, w11Var2, xpVar, 1);
                    this.i = w11Var2;
                    this.j = a;
                    this.k = 1;
                    q7Var = a;
                } catch (CancellationException unused) {
                    q7Var = a;
                }
                try {
                    Object f2 = ka0.f(q7Var, new pp(qpVar, p4.o, a.e.getValue(), a.g), Long.MIN_VALUE, j7Var, this);
                    if (f2 != obj2) {
                        f2 = Unit.a;
                    }
                    if (f2 == obj2) {
                        return obj2;
                    }
                    w11Var = w11Var2;
                } catch (CancellationException unused2) {
                    w11Var = w11Var2;
                    q7Var2 = q7Var;
                    w11Var.d = ((Number) ((Function1) q7Var2.d.g).invoke(q7Var2.g)).floatValue();
                    f = w11Var.d;
                    return new Float(f);
                }
            }
            return new Float(f);
        }
        if (i != 1) {
            dd0.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        q7Var2 = this.j;
        w11Var = this.i;
        try {
            ca0.v(obj);
        } catch (CancellationException unused3) {
            w11Var.d = ((Number) ((Function1) q7Var2.d.g).invoke(q7Var2.g)).floatValue();
            f = w11Var.d;
            return new Float(f);
        }
        f = w11Var.d;
        return new Float(f);
    }
}
