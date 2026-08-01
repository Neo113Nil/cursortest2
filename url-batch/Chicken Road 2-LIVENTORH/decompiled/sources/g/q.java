package g;

import android.view.ViewGroup;
import n0.p0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1684f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0 f1685g;

    public /* synthetic */ q(c0 c0Var, int i) {
        this.f1684f = i;
        this.f1685g = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f1684f) {
            case 0:
                c0 c0Var = this.f1685g;
                if ((c0Var.f1587e0 & 1) != 0) {
                    c0Var.t(0);
                }
                if ((c0Var.f1587e0 & 4096) != 0) {
                    c0Var.t(108);
                }
                c0Var.d0 = false;
                c0Var.f1587e0 = 0;
                break;
            default:
                c0 c0Var2 = this.f1685g;
                c0Var2.B.showAtLocation(c0Var2.A, 55, 0, 0);
                p0 p0Var = c0Var2.D;
                if (p0Var != null) {
                    p0Var.b();
                }
                if (!c0Var2.E || (viewGroup = c0Var2.F) == null || !viewGroup.isLaidOut()) {
                    c0Var2.A.setAlpha(1.0f);
                    c0Var2.A.setVisibility(0);
                    break;
                } else {
                    c0Var2.A.setAlpha(0.0f);
                    p0 a2 = n0.l0.a(c0Var2.A);
                    a2.a(1.0f);
                    c0Var2.D = a2;
                    a2.d(new s(0, this));
                    break;
                }
        }
    }
}
