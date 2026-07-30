package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ik implements s30 {
    public final /* synthetic */ int d;

    public /* synthetic */ ik(int i) {
        this.d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s30
    public final Object a(Object obj, Object obj2, Object obj3) {
        final int i = 1;
        Object[] objArr = 0;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                hl hlVar = (hl) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zd) obj).getClass();
                if (hlVar.O(intValue & 1, (intValue & 17) != 16)) {
                    am0 T = yr1.T(xa1.b, 28.0f, 2);
                    yi a = wi.a(yr1.d, j50.t, hlVar, 54);
                    int hashCode = Long.hashCode(hlVar.T);
                    kw0 l = hlVar.l();
                    am0 N = p4.N(hlVar, T);
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
                    long j = hi.c;
                    long x = t80.x(22);
                    x20 x20Var = x20.l;
                    xl0 xl0Var = xl0.a;
                    eh1.b("No attempts yet", xa1.a(xl0Var, 1.0f), j, x, x20Var, null, 0L, new tg1(3), 0L, 0, false, 0, 0, null, hlVar, 1597878, 0, 261032);
                    ca0.b(hlVar, xa1.b(xl0Var, 8.0f));
                    eh1.b("Start your first dash from the Home screen.", xa1.a(xl0Var, 1.0f), la0.d(4294961562L), t80.x(15), x20.k, null, 0L, new tg1(3), 0L, 0, false, 0, 0, null, hlVar, 1597878, 0, 261032);
                    hlVar.p(true);
                } else {
                    hlVar.R();
                }
                return Unit.a;
            case 1:
                xk0 xk0Var = (xk0) obj;
                final int H = xk0Var.H(10.0f);
                int i2 = H * 2;
                final zw0 c = ((qk0) obj2).c(nm.h(((mm) obj3).a, i2, 0));
                return xk0.q(xk0Var, c.d - i2, c.e, new Function1() { // from class: r1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i3 = i;
                        int i4 = H;
                        zw0 zw0Var = c;
                        yw0 yw0Var = (yw0) obj4;
                        switch (i3) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                yw0.h(yw0Var, zw0Var, 0, -i4);
                                break;
                            default:
                                yw0.h(yw0Var, zw0Var, -i4, 0);
                                break;
                        }
                        return Unit.a;
                    }
                });
            default:
                xk0 xk0Var2 = (xk0) obj;
                final int H2 = xk0Var2.H(10.0f);
                int i3 = H2 * 2;
                final zw0 c2 = ((qk0) obj2).c(nm.h(((mm) obj3).a, 0, i3));
                int i4 = c2.e - i3;
                int i5 = c2.d;
                final Object[] objArr2 = objArr == true ? 1 : 0;
                return xk0.q(xk0Var2, i5, i4, new Function1() { // from class: r1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i32 = objArr2;
                        int i42 = H2;
                        zw0 zw0Var = c2;
                        yw0 yw0Var = (yw0) obj4;
                        switch (i32) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                yw0.h(yw0Var, zw0Var, 0, -i42);
                                break;
                            default:
                                yw0.h(yw0Var, zw0Var, -i42, 0);
                                break;
                        }
                        return Unit.a;
                    }
                });
        }
    }
}
