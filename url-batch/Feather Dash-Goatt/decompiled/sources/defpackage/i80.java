package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class i80 extends sf1 implements Function2 {
    public /* synthetic */ float i;

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((i80) h((dn) obj2, Float.valueOf(((Number) obj).floatValue()))).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        i80 i80Var = new i80(2, dnVar);
        i80Var.i = ((Number) obj).floatValue();
        return i80Var;
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        tn tnVar = tn.d;
        ca0.v(obj);
        return Boolean.valueOf(this.i > 0.0f);
    }
}
