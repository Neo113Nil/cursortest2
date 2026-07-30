package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class y8 extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ z8 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8(z8 z8Var, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.k = z8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        sn snVar = (sn) obj;
        dn dnVar = (dn) obj2;
        switch (this.i) {
        }
        return ((y8) h(dnVar, snVar)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.i;
        z8 z8Var = this.k;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new y8(z8Var, dnVar, 0);
            default:
                return new y8(z8Var, dnVar, 1);
        }
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        Object value;
        int i = this.i;
        z8 z8Var = this.k;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                int i2 = this.j;
                if (i2 == 0) {
                    ca0.v(obj);
                    s40 s40Var = (s40) z8Var.b.g;
                    x8 x8Var = new x8(0, z8Var);
                    this.j = 1;
                    if (s40Var.f(x8Var, this) == tnVar) {
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
                    if (mo.l(1500L, this) == tnVar2) {
                        break;
                    }
                } else if (i3 != 1) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca0.v(obj);
                }
                z8Var.c.d = true;
                z8Var.d.d = true;
                be1 be1Var = z8Var.e;
                do {
                    value = be1Var.getValue();
                } while (!be1Var.h(value, w8.a((w8) value, r8.a, null, null, 0, 0, null, null, null, null, false, 1534)));
                z8Var.u();
                break;
        }
        return Unit.a;
    }
}
