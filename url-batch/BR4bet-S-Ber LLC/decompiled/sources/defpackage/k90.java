package defpackage;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class k90 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Toolbar g;

    public /* synthetic */ k90(Toolbar toolbar, int i) {
        this.f = i;
        this.g = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Toolbar toolbar = this.g;
        switch (i) {
            case 0:
                n90 n90Var = toolbar.Q;
                qw qwVar = n90Var == null ? null : n90Var.g;
                if (qwVar != null) {
                    qwVar.collapseActionView();
                    break;
                }
                break;
            default:
                toolbar.m();
                break;
        }
    }
}
