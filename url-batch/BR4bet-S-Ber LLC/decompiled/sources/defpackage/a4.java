package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class a4 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ n4 g;

    public /* synthetic */ a4(n4 n4Var, int i) {
        this.f = i;
        this.g = n4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.f;
        n4 n4Var = this.g;
        switch (i) {
            case 0:
                if ((n4Var.e0 & 1) != 0) {
                    n4Var.u(0);
                }
                if ((n4Var.e0 & 4096) != 0) {
                    n4Var.u(108);
                }
                n4Var.d0 = false;
                n4Var.e0 = 0;
                break;
            default:
                n4Var.A.showAtLocation(n4Var.z, 55, 0, 0);
                wc0 wc0Var = n4Var.C;
                if (wc0Var != null) {
                    wc0Var.b();
                }
                if (!n4Var.E || (viewGroup = n4Var.F) == null || !viewGroup.isLaidOut()) {
                    n4Var.z.setAlpha(1.0f);
                    n4Var.z.setVisibility(0);
                    break;
                } else {
                    n4Var.z.setAlpha(0.0f);
                    wc0 a = ic0.a(n4Var.z);
                    a.a(1.0f);
                    n4Var.C = a;
                    a.d(new c4(0, this));
                    break;
                }
        }
    }
}
