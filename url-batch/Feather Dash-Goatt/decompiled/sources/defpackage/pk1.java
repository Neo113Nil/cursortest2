package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class pk1 implements s30 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pk1(oo0 oo0Var, no0 no0Var) {
        this.d = 2;
        this.e = oo0Var;
    }

    @Override // defpackage.s30
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        Object obj4 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                hk hkVar = (hk) obj4;
                hl hlVar = (hl) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zd) obj).getClass();
                if (hlVar.O(intValue & 1, (intValue & 17) != 16)) {
                    am0 S = yr1.S(xa1.b, 24.0f, 28.0f);
                    yi a = wi.a(yr1.d, j50.t, hlVar, 54);
                    int hashCode = Long.hashCode(hlVar.T);
                    kw0 l = hlVar.l();
                    am0 N = p4.N(hlVar, S);
                    yk.b.getClass();
                    xl xlVar = xk.b;
                    hlVar.a0();
                    if (hlVar.S) {
                        hlVar.k(xlVar);
                    } else {
                        hlVar.k0();
                    }
                    ka0.C(hlVar, a, xk.e);
                    ka0.C(hlVar, l, xk.d);
                    ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
                    ka0.A(hlVar, xk.g);
                    ka0.C(hlVar, N, xk.c);
                    hkVar.a(zi.a, hlVar, 6);
                    hlVar.p(true);
                } else {
                    hlVar.R();
                }
                break;
            case 1:
                ((l) obj4).invoke((Throwable) obj);
                break;
            case 2:
                oo0 oo0Var = (oo0) obj4;
                oo0.i.set(oo0Var, null);
                oo0Var.h(null);
                break;
            default:
                ((z81) obj4).b();
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ pk1(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }
}
