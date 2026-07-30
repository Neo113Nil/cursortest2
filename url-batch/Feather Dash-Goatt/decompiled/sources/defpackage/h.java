package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class h extends sf1 implements Function2 {
    public final /* synthetic */ int i = 1;
    public int j;
    public final /* synthetic */ gn0 k;
    public final /* synthetic */ zy0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(gn0 gn0Var, zy0 zy0Var, dn dnVar) {
        super(2, dnVar);
        this.k = gn0Var;
        this.l = zy0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        sn snVar = (sn) obj;
        dn dnVar = (dn) obj2;
        switch (this.i) {
        }
        return ((h) h(dnVar, snVar)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.i;
        zy0 zy0Var = this.l;
        gn0 gn0Var = this.k;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new h(zy0Var, gn0Var, dnVar);
            default:
                return new h(gn0Var, zy0Var, dnVar);
        }
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        int i = this.i;
        zy0 zy0Var = this.l;
        gn0 gn0Var = this.k;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                int i2 = this.j;
                if (i2 == 0) {
                    ca0.v(obj);
                    az0 az0Var = new az0(zy0Var);
                    this.j = 1;
                    if (gn0Var.a(az0Var, this) == tnVar) {
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
                    this.j = 1;
                    if (gn0Var.a(zy0Var, this) == tnVar2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(zy0 zy0Var, gn0 gn0Var, dn dnVar) {
        super(2, dnVar);
        this.l = zy0Var;
        this.k = gn0Var;
    }
}
