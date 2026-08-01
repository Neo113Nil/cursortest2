package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class g4 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ t4 g;

    public /* synthetic */ g4(t4 t4Var, int i) {
        this.f = i;
        this.g = t4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.f;
        t4 t4Var = this.g;
        switch (i) {
            case 0:
                if ((t4Var.f0 & 1) != 0) {
                    t4Var.u(0);
                }
                if ((t4Var.f0 & 4096) != 0) {
                    t4Var.u(108);
                }
                t4Var.e0 = false;
                t4Var.f0 = 0;
                break;
            default:
                t4Var.B.showAtLocation(t4Var.A, 55, 0, 0);
                t90 t90Var = t4Var.D;
                if (t90Var != null) {
                    t90Var.b();
                }
                if (!t4Var.F || (viewGroup = t4Var.G) == null || !viewGroup.isLaidOut()) {
                    t4Var.A.setAlpha(1.0f);
                    t4Var.A.setVisibility(0);
                    break;
                } else {
                    t4Var.A.setAlpha(0.0f);
                    t90 a = e90.a(t4Var.A);
                    a.a(1.0f);
                    t4Var.D = a;
                    a.d(new i4(0, this));
                    break;
                }
        }
    }
}
