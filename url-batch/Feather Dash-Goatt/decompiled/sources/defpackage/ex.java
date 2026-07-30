package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ex extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ex(int i, dn dnVar, int i2) {
        super(i, dnVar);
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ex) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 1:
                return ((ex) h((dn) obj2, (sn) obj)).k(Unit.a);
            default:
                return ((ex) h((dn) obj2, Integer.valueOf(((Number) obj).intValue()))).k(Unit.a);
        }
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = 2;
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new ex(i, dnVar, 0);
            case 1:
                return new ex(i, dnVar, 1);
            default:
                ex exVar = new ex(i, dnVar, i);
                exVar.j = ((Number) obj).intValue();
                return exVar;
        }
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                int i = this.j;
                if (i != 0) {
                    if (i == 1) {
                        ca0.v(obj);
                        return obj;
                    }
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca0.v(obj);
                ej ejVar = hx.b;
                this.j = 1;
                Object D = ejVar.D(this);
                return D == tnVar ? tnVar : D;
            case 1:
                tn tnVar2 = tn.d;
                int i2 = this.j;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ca0.v(obj);
                        return obj;
                    }
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca0.v(obj);
                ej ejVar2 = hx.c;
                this.j = 1;
                Object D2 = ejVar2.D(this);
                return D2 == tnVar2 ? tnVar2 : D2;
            default:
                tn tnVar3 = tn.d;
                ca0.v(obj);
                return Boolean.valueOf(this.j > 0);
        }
    }
}
