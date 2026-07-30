package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hs0 extends zs0 {
    public static final hs0 d;
    public static final hs0 e;
    public static final hs0 f;
    public static final hs0 g;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new hs0(i, 2, 0);
        int i2 = 1;
        e = new hs0(i2, i2, 1);
        f = new hs0(i, 2, 2);
        int i3 = 1;
        g = new hs0(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hs0(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // defpackage.zs0
    public final void a(uh uhVar, b9 b9Var, db1 db1Var, i21 i21Var, at0 at0Var) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object invoke = ((Function0) uhVar.c(0)).invoke();
                d3 d3Var = (d3) uhVar.c(1);
                int b = uhVar.b(0);
                d3Var.getClass();
                db1Var.U(db1Var.c(d3Var), invoke);
                b9Var.d(b, invoke);
                b9Var.b(invoke);
                break;
            case 1:
                d3 d3Var2 = (d3) uhVar.c(0);
                int b2 = uhVar.b(0);
                b9Var.i();
                d3Var2.getClass();
                b9Var.a(b2, db1Var.D(db1Var.c(d3Var2)));
                break;
            case 2:
                Object c = uhVar.c(0);
                d3 d3Var3 = (d3) uhVar.c(1);
                int b3 = uhVar.b(0);
                if (c instanceof k21) {
                    k21 k21Var = (k21) c;
                    i21Var.e.b(k21Var);
                    i21Var.d.a(k21Var);
                }
                Object K = db1Var.K(db1Var.c(d3Var3), b3, c);
                if (!(K instanceof k21)) {
                    if (K instanceof i11) {
                        ((i11) K).c();
                        break;
                    }
                } else {
                    i21Var.e((k21) K);
                    break;
                }
                break;
            default:
                Object c2 = uhVar.c(0);
                int b4 = uhVar.b(0);
                if (c2 instanceof k21) {
                    k21 k21Var2 = (k21) c2;
                    i21Var.e.b(k21Var2);
                    i21Var.d.a(k21Var2);
                }
                Object K2 = db1Var.K(db1Var.t, b4, c2);
                if (!(K2 instanceof k21)) {
                    if (K2 instanceof i11) {
                        ((i11) K2).c();
                        break;
                    }
                } else {
                    i21Var.e((k21) K2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.zs0
    public d3 b(uh uhVar) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (d3) uhVar.c(1);
            case 1:
                return (d3) uhVar.c(0);
            default:
                return super.b(uhVar);
        }
    }
}
