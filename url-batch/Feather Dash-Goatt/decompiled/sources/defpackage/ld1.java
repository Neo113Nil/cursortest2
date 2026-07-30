package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ld1 extends sf1 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ String j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld1(String str, long j, dn dnVar) {
        super(2, dnVar);
        this.j = str;
        this.k = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((ld1) h((dn) obj2, (qn0) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        ld1 ld1Var = new ld1(this.j, this.k, dnVar);
        ld1Var.i = obj;
        return ld1Var;
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        qn0 qn0Var = (qn0) this.i;
        tn tnVar = tn.d;
        ca0.v(obj);
        qn0Var.d(nd1.c, "WebView");
        qn0Var.d(nd1.d, this.j);
        qn0Var.d(nd1.e, new Long(this.k));
        return Unit.a;
    }
}
