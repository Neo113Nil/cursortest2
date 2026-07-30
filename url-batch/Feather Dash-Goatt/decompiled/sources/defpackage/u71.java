package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class u71 extends sf1 implements Function2 {
    public int i;
    public final /* synthetic */ v71 j;
    public final /* synthetic */ float k;
    public final /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u71(v71 v71Var, float f, float f2, dn dnVar) {
        super(2, dnVar);
        this.j = v71Var;
        this.k = f;
        this.l = f2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((u71) h((dn) obj2, (sn) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        return new u71(this.j, this.k, this.l, dnVar);
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        tn tnVar = tn.d;
        int i = this.i;
        if (i == 0) {
            ca0.v(obj);
            d81 d81Var = this.j.R;
            long floatToRawIntBits = (Float.floatToRawIntBits(this.k) << 32) | (Float.floatToRawIntBits(this.l) & 4294967295L);
            this.i = 1;
            if (p71.a(d81Var, floatToRawIntBits, this) == tnVar) {
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
