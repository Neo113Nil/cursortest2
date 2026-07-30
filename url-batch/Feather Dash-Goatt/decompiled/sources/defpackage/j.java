package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class j extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ eh k;
    public final /* synthetic */ zy0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(eh ehVar, zy0 zy0Var, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.k = ehVar;
        this.l = zy0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        sn snVar = (sn) obj;
        dn dnVar = (dn) obj2;
        switch (this.i) {
        }
        return ((j) h(dnVar, snVar)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.i;
        zy0 zy0Var = this.l;
        eh ehVar = this.k;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new j(ehVar, zy0Var, dnVar, 0);
            case 1:
                return new j(ehVar, zy0Var, dnVar, 1);
            case 2:
                return new j(ehVar, zy0Var, dnVar, 2);
            default:
                return new j(ehVar, zy0Var, dnVar, 3);
        }
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        int i = this.i;
        zy0 zy0Var = this.l;
        eh ehVar = this.k;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                int i2 = this.j;
                if (i2 == 0) {
                    ca0.v(obj);
                    gn0 gn0Var = ehVar.u;
                    if (gn0Var != null) {
                        yy0 yy0Var = new yy0(zy0Var);
                        this.j = 1;
                        if (gn0Var.a(yy0Var, this) == tnVar) {
                            break;
                        }
                    }
                } else if (i2 != 1) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca0.v(obj);
                }
                break;
            case 1:
                tn tnVar2 = tn.d;
                int i3 = this.j;
                if (i3 == 0) {
                    ca0.v(obj);
                    gn0 gn0Var2 = ehVar.u;
                    if (gn0Var2 != null) {
                        yy0 yy0Var2 = new yy0(zy0Var);
                        this.j = 1;
                        if (gn0Var2.a(yy0Var2, this) == tnVar2) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca0.v(obj);
                }
                break;
            case 2:
                tn tnVar3 = tn.d;
                int i4 = this.j;
                if (i4 == 0) {
                    ca0.v(obj);
                    gn0 gn0Var3 = ehVar.u;
                    if (gn0Var3 != null) {
                        this.j = 1;
                        if (gn0Var3.a(zy0Var, this) == tnVar3) {
                            break;
                        }
                    }
                } else if (i4 != 1) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca0.v(obj);
                }
                break;
            default:
                tn tnVar4 = tn.d;
                int i5 = this.j;
                if (i5 == 0) {
                    ca0.v(obj);
                    gn0 gn0Var4 = ehVar.u;
                    if (gn0Var4 != null) {
                        az0 az0Var = new az0(zy0Var);
                        this.j = 1;
                        if (gn0Var4.a(az0Var, this) == tnVar4) {
                            break;
                        }
                    }
                } else if (i5 != 1) {
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
