package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class q3 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ d4 g;

    public /* synthetic */ q3(d4 d4Var, int i) {
        this.f = i;
        this.g = d4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.f;
        d4 d4Var = this.g;
        switch (i) {
            case 0:
                if ((d4Var.d0 & 1) != 0) {
                    d4Var.v(0);
                }
                if ((d4Var.d0 & 4096) != 0) {
                    d4Var.v(108);
                }
                d4Var.c0 = false;
                d4Var.d0 = 0;
                break;
            default:
                d4Var.A.showAtLocation(d4Var.z, 55, 0, 0);
                l90 l90Var = d4Var.C;
                if (l90Var != null) {
                    l90Var.b();
                }
                if (!d4Var.D || (viewGroup = d4Var.E) == null || !viewGroup.isLaidOut()) {
                    d4Var.z.setAlpha(1.0f);
                    d4Var.z.setVisibility(0);
                    break;
                } else {
                    d4Var.z.setAlpha(0.0f);
                    l90 a = x80.a(d4Var.z);
                    a.a(1.0f);
                    d4Var.C = a;
                    a.d(new s3(0, this));
                    break;
                }
        }
    }
}
