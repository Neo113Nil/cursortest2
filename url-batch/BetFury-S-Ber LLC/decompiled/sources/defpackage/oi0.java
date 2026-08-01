package defpackage;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class oi0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Toolbar g;

    public /* synthetic */ oi0(Toolbar toolbar, int i) {
        this.f = i;
        this.g = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Toolbar toolbar = this.g;
        switch (i) {
            case 0:
                ri0 ri0Var = toolbar.R;
                u10 u10Var = ri0Var == null ? null : ri0Var.g;
                if (u10Var != null) {
                    u10Var.collapseActionView();
                    break;
                }
                break;
            default:
                toolbar.m();
                break;
        }
    }
}
