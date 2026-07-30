package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class yo extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yo(int i, dn dnVar, int i2) {
        super(i, dnVar);
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((yo) h((dn) obj2, (xd1) obj)).k(Unit.a);
            case 1:
                return ((yo) h((dn) obj2, (k11) obj)).k(Unit.a);
            case 2:
                return ((yo) h((dn) obj2, (la1) obj)).k(Unit.a);
            case 3:
                return ((yo) h((dn) obj2, (qn0) obj)).k(Unit.a);
            case 4:
                return ((yo) h((dn) obj2, (qn0) obj)).k(Unit.a);
            default:
                return ((yo) h((dn) obj2, (qn0) obj)).k(Unit.a);
        }
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                yo yoVar = new yo(2, dnVar, 0);
                yoVar.j = obj;
                return yoVar;
            case 1:
                yo yoVar2 = new yo(2, dnVar, 1);
                yoVar2.j = obj;
                return yoVar2;
            case 2:
                yo yoVar3 = new yo(2, dnVar, 2);
                yoVar3.j = obj;
                return yoVar3;
            case 3:
                yo yoVar4 = new yo(2, dnVar, 3);
                yoVar4.j = obj;
                return yoVar4;
            case 4:
                yo yoVar5 = new yo(2, dnVar, 4);
                yoVar5.j = obj;
                return yoVar5;
            default:
                yo yoVar6 = new yo(2, dnVar, 5);
                yoVar6.j = obj;
                return yoVar6;
        }
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                ca0.v(obj);
                break;
            case 1:
                tn tnVar2 = tn.d;
                ca0.v(obj);
                break;
            case 2:
                tn tnVar3 = tn.d;
                ca0.v(obj);
                break;
            case 3:
                qn0 qn0Var = (qn0) this.j;
                tn tnVar4 = tn.d;
                ca0.v(obj);
                hy0 hy0Var = nd1.c;
                qn0Var.d(nd1.c, "Fallback");
                break;
            case 4:
                qn0 qn0Var2 = (qn0) this.j;
                tn tnVar5 = tn.d;
                ca0.v(obj);
                hy0 hy0Var2 = nd1.c;
                qn0Var2.d(nd1.c, "Undecided");
                break;
            default:
                qn0 qn0Var3 = (qn0) this.j;
                tn tnVar6 = tn.d;
                ca0.v(obj);
                hy0 hy0Var3 = nd1.c;
                qn0Var3.d(nd1.c, "WebView");
                break;
        }
        return Unit.a;
    }
}
