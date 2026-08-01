package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class i4 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ v4 g;

    public /* synthetic */ i4(v4 v4Var, int i) {
        this.f = i;
        this.g = v4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.f;
        v4 v4Var = this.g;
        switch (i) {
            case 0:
                if ((v4Var.e0 & 1) != 0) {
                    v4Var.v(0);
                }
                if ((v4Var.e0 & 4096) != 0) {
                    v4Var.v(108);
                }
                v4Var.d0 = false;
                v4Var.e0 = 0;
                break;
            default:
                v4Var.A.showAtLocation(v4Var.z, 55, 0, 0);
                vm0 vm0Var = v4Var.C;
                if (vm0Var != null) {
                    vm0Var.b();
                }
                if (!v4Var.E || (viewGroup = v4Var.F) == null || !viewGroup.isLaidOut()) {
                    v4Var.z.setAlpha(1.0f);
                    v4Var.z.setVisibility(0);
                    break;
                } else {
                    v4Var.z.setAlpha(0.0f);
                    vm0 a = hm0.a(v4Var.z);
                    a.a(1.0f);
                    v4Var.C = a;
                    a.d(new k4(0, this));
                    break;
                }
        }
    }
}
