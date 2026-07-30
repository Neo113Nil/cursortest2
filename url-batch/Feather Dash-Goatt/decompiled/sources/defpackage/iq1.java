package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class iq1 extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ kq1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iq1(kq1 kq1Var, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.k = kq1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        sn snVar = (sn) obj;
        dn dnVar = (dn) obj2;
        switch (this.i) {
        }
        return ((iq1) h(dnVar, snVar)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.i;
        kq1 kq1Var = this.k;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new iq1(kq1Var, dnVar, 0);
            default:
                return new iq1(kq1Var, dnVar, 1);
        }
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        int i = this.i;
        kq1 kq1Var = this.k;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                int i2 = this.j;
                if (i2 == 0) {
                    ca0.v(obj);
                    d4 d4Var = kq1Var.d;
                    this.j = 1;
                    Object e = d4Var.C.e(this);
                    if (e != tnVar) {
                        e = Unit.a;
                    }
                    if (e == tnVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca0.v(obj);
                }
                break;
            default:
                tn tnVar2 = tn.d;
                int i3 = this.j;
                if (i3 == 0) {
                    ca0.v(obj);
                    d4 d4Var2 = kq1Var.d;
                    this.j = 1;
                    Object d = d4Var2.D.d(this);
                    if (d != tnVar2) {
                        d = Unit.a;
                    }
                    if (d == tnVar2) {
                        break;
                    }
                } else if (i3 != 1) {
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
