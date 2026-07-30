package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class s71 extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s71(long j, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.k = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((s71) h((dn) obj2, (b81) obj)).k(Unit.a);
            case 1:
                return ((s71) h((dn) obj2, (qn0) obj)).k(Unit.a);
            default:
                return ((s71) h((dn) obj2, (qn0) obj)).k(Unit.a);
        }
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                s71 s71Var = new s71(this.k, dnVar, 0);
                s71Var.j = obj;
                return s71Var;
            case 1:
                s71 s71Var2 = new s71(this.k, dnVar, 1);
                s71Var2.j = obj;
                return s71Var2;
            default:
                s71 s71Var3 = new s71(this.k, dnVar, 2);
                s71Var3.j = obj;
                return s71Var3;
        }
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        int i = this.i;
        long j = this.k;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                ca0.v(obj);
                d81 d81Var = ((b81) this.j).a;
                d81Var.c(d81Var.k, j, 1);
                break;
            case 1:
                qn0 qn0Var = (qn0) this.j;
                tn tnVar2 = tn.d;
                ca0.v(obj);
                hy0 hy0Var = nd1.c;
                qn0Var.d(nd1.g, new Long(j));
                break;
            default:
                qn0 qn0Var2 = (qn0) this.j;
                tn tnVar3 = tn.d;
                ca0.v(obj);
                hy0 hy0Var2 = nd1.c;
                qn0Var2.d(nd1.f, new Long(j));
                break;
        }
        return Unit.a;
    }
}
