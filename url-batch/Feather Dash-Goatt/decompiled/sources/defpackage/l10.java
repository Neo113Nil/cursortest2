package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class l10 extends c40 implements Function2 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l10(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.m = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        boolean a;
        boolean a2;
        we0 we0Var = null;
        Object[] objArr = 0;
        switch (this.m) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j10 j10Var = (j10) obj;
                j10 j10Var2 = (j10) obj2;
                m10 m10Var = (m10) this.e;
                if (m10Var.r && (a = j10Var2.a()) != j10Var.a()) {
                    if (a) {
                        z11 z11Var = new z11();
                        gb0.G(m10Var, new w3(z11Var, 4, m10Var));
                        we0 we0Var2 = (we0) z11Var.d;
                        if (we0Var2 != null) {
                            we0Var2.a();
                            we0Var = we0Var2;
                        }
                        m10Var.v = we0Var;
                    } else {
                        we0 we0Var3 = m10Var.v;
                        if (we0Var3 != null) {
                            we0Var3.b();
                        }
                        m10Var.v = null;
                    }
                }
                break;
            default:
                j10 j10Var3 = (j10) obj;
                j10 j10Var4 = (j10) obj2;
                s10 s10Var = (s10) this.e;
                if (s10Var.r && (a2 = j10Var4.a()) != j10Var3.a()) {
                    e eVar = s10Var.v;
                    if (eVar != null) {
                        eVar.invoke(Boolean.valueOf(a2));
                    }
                    if (a2) {
                        uq1.N(s10Var.n0(), null, new rp((Object) s10Var, (dn) (objArr == true ? 1 : 0), 1), 3);
                        z11 z11Var2 = new z11();
                        gb0.G(s10Var, new vc(z11Var2, 2, s10Var));
                        we0 we0Var4 = (we0) z11Var2.d;
                        if (we0Var4 != null) {
                            we0Var4.a();
                        } else {
                            we0Var4 = null;
                        }
                        s10Var.x = we0Var4;
                        qp0 qp0Var = s10Var.y;
                        if (qp0Var != null && qp0Var.J0().r) {
                            s10Var.D0();
                        }
                    } else {
                        we0 we0Var5 = s10Var.x;
                        if (we0Var5 != null) {
                            we0Var5.b();
                        }
                        s10Var.x = null;
                        s10Var.D0();
                    }
                    ka0.v(s10Var);
                    gn0 gn0Var = s10Var.u;
                    if (gn0Var != null) {
                        w00 w00Var = s10Var.w;
                        if (a2) {
                            if (w00Var != null) {
                                s10Var.C0(gn0Var, new x00(w00Var));
                                s10Var.w = null;
                            }
                            w00 w00Var2 = new w00();
                            s10Var.C0(gn0Var, w00Var2);
                            s10Var.w = w00Var2;
                        } else if (w00Var != null) {
                            s10Var.C0(gn0Var, new x00(w00Var));
                            s10Var.w = null;
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
