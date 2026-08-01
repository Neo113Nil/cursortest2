package f;

import android.view.ViewGroup;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1645f;
    public final /* synthetic */ b0 g;

    public /* synthetic */ q(b0 b0Var, int i4) {
        this.f1645f = i4;
        this.g = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f1645f) {
            case 0:
                b0 b0Var = this.g;
                if ((b0Var.f0 & 1) != 0) {
                    b0Var.u(0);
                }
                if ((b0Var.f0 & 4096) != 0) {
                    b0Var.u(108);
                }
                b0Var.f1547e0 = false;
                b0Var.f0 = 0;
                break;
            default:
                b0 b0Var2 = this.g;
                b0Var2.B.showAtLocation(b0Var2.A, 55, 0, 0);
                k0.l0 l0Var = b0Var2.D;
                if (l0Var != null) {
                    l0Var.b();
                }
                if (!b0Var2.F || (viewGroup = b0Var2.G) == null || !viewGroup.isLaidOut()) {
                    b0Var2.A.setAlpha(1.0f);
                    b0Var2.A.setVisibility(0);
                    break;
                } else {
                    b0Var2.A.setAlpha(0.0f);
                    k0.l0 a4 = k0.j0.a(b0Var2.A);
                    a4.a(1.0f);
                    b0Var2.D = a4;
                    a4.d(new s(0, this));
                    break;
                }
        }
    }
}
