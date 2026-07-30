package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class de1 extends sf1 implements Function2 {
    public int i;
    public final /* synthetic */ vg j;
    public final /* synthetic */ float k;
    public final /* synthetic */ p7 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de1(vg vgVar, float f, p7 p7Var, dn dnVar) {
        super(2, dnVar);
        this.j = vgVar;
        this.k = f;
        this.l = p7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((de1) h((dn) obj2, (sn) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        return new de1(this.j, this.k, this.l, dnVar);
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        tn tnVar = tn.d;
        int i = this.i;
        if (i == 0) {
            ca0.v(obj);
            l7 l7Var = (l7) this.j.c;
            Float f = new Float(this.k);
            this.i = 1;
            if (l7.c(l7Var, f, this.l, null, this, 12) == tnVar) {
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
