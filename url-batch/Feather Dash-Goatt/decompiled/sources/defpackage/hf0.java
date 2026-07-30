package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hf0 extends sf1 implements Function2 {
    public int i;
    public final /* synthetic */ if0 j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf0(if0 if0Var, int i, dn dnVar) {
        super(2, dnVar);
        this.j = if0Var;
        this.k = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((hf0) h((dn) obj2, (sn) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        return new hf0(this.j, this.k, dnVar);
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        tn tnVar = tn.d;
        int i = this.i;
        if (i == 0) {
            ca0.v(obj);
            df0 df0Var = this.j.t;
            this.i = 1;
            wf0 wf0Var = df0Var.b;
            c51 c51Var = wf0.x;
            wf0Var.getClass();
            Object c = wf0Var.c(go0.d, new rp(wf0Var, this.k, (dn) null), this);
            if (c != tnVar) {
                c = Unit.a;
            }
            if (c != tnVar) {
                c = Unit.a;
            }
            if (c == tnVar) {
                return tnVar;
            }
        } else {
            if (i != 1) {
                dd0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ca0.v(obj);
        }
        return Unit.a;
    }
}
