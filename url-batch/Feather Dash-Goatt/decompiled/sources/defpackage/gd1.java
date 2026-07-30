package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gd1 extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ ka k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gd1(ka kaVar, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.k = kaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        sn snVar = (sn) obj;
        dn dnVar = (dn) obj2;
        switch (this.i) {
        }
        return ((gd1) h(dnVar, snVar)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new gd1(this.k, dnVar, 0);
            default:
                return new gd1(this.k, dnVar, 1);
        }
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        int i = this.i;
        ka kaVar = this.k;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                int i2 = this.j;
                if (i2 == 0) {
                    ca0.v(obj);
                    this.j = 1;
                    String a = kaVar.a();
                    return a == tnVar ? tnVar : a;
                }
                if (i2 == 1) {
                    ca0.v(obj);
                    return obj;
                }
                dd0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                tn tnVar2 = tn.d;
                int i3 = this.j;
                if (i3 == 0) {
                    ca0.v(obj);
                    this.j = 1;
                    Object b = kaVar.b(this);
                    return b == tnVar2 ? tnVar2 : b;
                }
                if (i3 == 1) {
                    ca0.v(obj);
                    return obj;
                }
                dd0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
