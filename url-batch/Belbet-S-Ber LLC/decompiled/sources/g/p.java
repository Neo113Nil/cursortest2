package g;

import android.view.ViewGroup;
import n0.p0;
import n0.t0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1564f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0 f1565g;

    public /* synthetic */ p(a0 a0Var, int i) {
        this.f1564f = i;
        this.f1565g = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f1564f) {
            case 0:
                a0 a0Var = this.f1565g;
                if ((a0Var.f1451f0 & 1) != 0) {
                    a0Var.t(0);
                }
                if ((a0Var.f1451f0 & 4096) != 0) {
                    a0Var.t(108);
                }
                a0Var.f1450e0 = false;
                a0Var.f1451f0 = 0;
                break;
            default:
                a0 a0Var2 = this.f1565g;
                a0Var2.B.showAtLocation(a0Var2.A, 55, 0, 0);
                t0 t0Var = a0Var2.D;
                if (t0Var != null) {
                    t0Var.b();
                }
                if (!a0Var2.F || (viewGroup = a0Var2.G) == null || !viewGroup.isLaidOut()) {
                    a0Var2.A.setAlpha(1.0f);
                    a0Var2.A.setVisibility(0);
                    break;
                } else {
                    a0Var2.A.setAlpha(0.0f);
                    t0 a5 = p0.a(a0Var2.A);
                    a5.a(1.0f);
                    a0Var2.D = a5;
                    a5.d(new r(0, this));
                    break;
                }
        }
    }
}
