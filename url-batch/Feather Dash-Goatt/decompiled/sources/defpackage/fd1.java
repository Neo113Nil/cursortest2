package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fd1 extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ nd1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fd1(nd1 nd1Var, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.k = nd1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        sn snVar = (sn) obj;
        dn dnVar = (dn) obj2;
        switch (this.i) {
        }
        return ((fd1) h(dnVar, snVar)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new fd1(this.k, dnVar, 0);
            default:
                return new fd1(this.k, dnVar, 1);
        }
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        int i = this.i;
        nd1 nd1Var = this.k;
        int i2 = 1;
        dn dnVar = null;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object obj2 = tn.d;
                int i3 = this.j;
                if (i3 == 0) {
                    ca0.v(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    this.j = 1;
                    Object p = gb0.p(nd1Var.a, new s71(currentTimeMillis, dnVar, 2), this);
                    if (p != obj2) {
                        p = Unit.a;
                    }
                    if (p == obj2) {
                        break;
                    }
                } else if (i3 != 1) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca0.v(obj);
                }
                break;
            default:
                Object obj3 = tn.d;
                int i4 = this.j;
                if (i4 == 0) {
                    ca0.v(obj);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    this.j = 1;
                    Object p2 = gb0.p(nd1Var.a, new s71(currentTimeMillis2, dnVar, i2), this);
                    if (p2 != obj3) {
                        p2 = Unit.a;
                    }
                    if (p2 == obj3) {
                        break;
                    }
                } else if (i4 != 1) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca0.v(obj);
                }
                break;
        }
        return Unit.a;
    }
}
