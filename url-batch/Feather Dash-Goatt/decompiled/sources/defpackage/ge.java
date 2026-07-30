package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ge extends sf1 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ he j;
    public final /* synthetic */ qp0 k;
    public final /* synthetic */ w3 l;
    public final /* synthetic */ kc m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(he heVar, qp0 qp0Var, w3 w3Var, kc kcVar, dn dnVar) {
        super(2, dnVar);
        this.j = heVar;
        this.k = qp0Var;
        this.l = w3Var;
        this.m = kcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((ge) h((dn) obj2, (sn) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        ge geVar = new ge(this.j, this.k, this.l, this.m, dnVar);
        geVar.i = obj;
        return geVar;
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        tn tnVar = tn.d;
        ca0.v(obj);
        sn snVar = (sn) this.i;
        w3 w3Var = this.l;
        he heVar = this.j;
        uq1.N(snVar, null, new f(heVar, this.k, w3Var, null, 1), 3);
        return uq1.N(snVar, null, new d(heVar, this.m, (dn) null, 4), 3);
    }
}
