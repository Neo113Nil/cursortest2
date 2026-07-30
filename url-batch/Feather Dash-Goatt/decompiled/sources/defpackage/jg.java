package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class jg extends sf1 implements Function2 {
    public final /* synthetic */ int i = 1;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ mg l;
    public final /* synthetic */ d00 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg(mg mgVar, d00 d00Var, Object obj, dn dnVar) {
        super(2, dnVar);
        this.l = mgVar;
        this.m = d00Var;
        this.k = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        sn snVar = (sn) obj;
        dn dnVar = (dn) obj2;
        switch (this.i) {
        }
        return ((jg) h(dnVar, snVar)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.i;
        d00 d00Var = this.m;
        mg mgVar = this.l;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new jg(mgVar, d00Var, this.k, dnVar);
            default:
                jg jgVar = new jg(mgVar, d00Var, dnVar);
                jgVar.k = obj;
                return jgVar;
        }
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                int i = this.j;
                if (i == 0) {
                    ca0.v(obj);
                    s30 s30Var = this.l.i;
                    Object obj2 = this.k;
                    this.j = 1;
                    if (s30Var.a(this.m, obj2, this) == tnVar) {
                        break;
                    }
                } else if (i != 1) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca0.v(obj);
                }
                break;
            default:
                tn tnVar2 = tn.d;
                int i2 = this.j;
                if (i2 == 0) {
                    ca0.v(obj);
                    sn snVar = (sn) this.k;
                    z11 z11Var = new z11();
                    mg mgVar = this.l;
                    c00 c00Var = mgVar.h;
                    lg lgVar = new lg(z11Var, snVar, mgVar, this.m, 0);
                    this.j = 1;
                    if (c00Var.f(lgVar, this) == tnVar2) {
                        break;
                    }
                } else if (i2 != 1) {
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
    public jg(mg mgVar, d00 d00Var, dn dnVar) {
        super(2, dnVar);
        this.l = mgVar;
        this.m = d00Var;
    }
}
