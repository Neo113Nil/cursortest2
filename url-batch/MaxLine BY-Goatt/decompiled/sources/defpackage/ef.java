package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ef implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ qf n;

    public /* synthetic */ ef(qf qfVar, int i) {
        this.m = i;
        this.n = qfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.m;
        qf qfVar = this.n;
        switch (i) {
            case 0:
                if ((qfVar.l0 & 1) != 0) {
                    qfVar.y(0);
                }
                if ((qfVar.l0 & 4096) != 0) {
                    qfVar.y(108);
                }
                qfVar.k0 = false;
                qfVar.l0 = 0;
                break;
            default:
                qfVar.H.showAtLocation(qfVar.G, 55, 0, 0);
                w53 w53Var = qfVar.J;
                if (w53Var != null) {
                    w53Var.b();
                }
                if (!qfVar.L || (viewGroup = qfVar.M) == null || !viewGroup.isLaidOut()) {
                    qfVar.G.setAlpha(1.0f);
                    qfVar.G.setVisibility(0);
                    break;
                } else {
                    qfVar.G.setAlpha(0.0f);
                    w53 a = e53.a(qfVar.G);
                    a.a(1.0f);
                    qfVar.J = a;
                    a.d(new gf(0, this));
                    break;
                }
        }
    }
}
