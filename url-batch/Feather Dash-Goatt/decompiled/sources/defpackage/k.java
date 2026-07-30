package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class k extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public final /* synthetic */ eh j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(eh ehVar, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.j = ehVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        sn snVar = (sn) obj;
        dn dnVar = (dn) obj2;
        switch (this.i) {
        }
        return ((k) h(dnVar, snVar)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.i;
        eh ehVar = this.j;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new k(ehVar, dnVar, 0);
            default:
                return new k(ehVar, dnVar, 1);
        }
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        int i = this.i;
        dn dnVar = null;
        eh ehVar = this.j;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                ca0.v(obj);
                if (ehVar.C == null) {
                    q60 q60Var = new q60();
                    gn0 gn0Var = ehVar.u;
                    if (gn0Var != null) {
                        uq1.N(ehVar.n0(), null, new d(gn0Var, q60Var, dnVar, 0), 3);
                    }
                    ehVar.C = q60Var;
                }
                break;
            default:
                tn tnVar2 = tn.d;
                ca0.v(obj);
                q60 q60Var2 = ehVar.C;
                if (q60Var2 != null) {
                    r60 r60Var = new r60(q60Var2);
                    gn0 gn0Var2 = ehVar.u;
                    if (gn0Var2 != null) {
                        uq1.N(ehVar.n0(), null, new d(gn0Var2, r60Var, dnVar, 1), 3);
                    }
                    ehVar.C = null;
                }
                break;
        }
        return Unit.a;
    }
}
