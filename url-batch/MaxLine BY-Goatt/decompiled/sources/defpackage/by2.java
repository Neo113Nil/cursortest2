package defpackage;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class by2 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Toolbar n;

    public /* synthetic */ by2(Toolbar toolbar, int i) {
        this.m = i;
        this.n = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        Toolbar toolbar = this.n;
        switch (i) {
            case 0:
                ey2 ey2Var = toolbar.a0;
                lk1 lk1Var = ey2Var == null ? null : ey2Var.n;
                if (lk1Var != null) {
                    lk1Var.collapseActionView();
                    break;
                }
                break;
            default:
                toolbar.m();
                break;
        }
    }
}
