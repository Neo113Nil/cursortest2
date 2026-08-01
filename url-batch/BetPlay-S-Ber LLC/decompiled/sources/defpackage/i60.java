package defpackage;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class i60 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Toolbar g;

    public /* synthetic */ i60(Toolbar toolbar, int i) {
        this.f = i;
        this.g = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Toolbar toolbar = this.g;
        switch (i) {
            case 0:
                l60 l60Var = toolbar.Q;
                eu euVar = l60Var == null ? null : l60Var.g;
                if (euVar != null) {
                    euVar.collapseActionView();
                    break;
                }
                break;
            default:
                toolbar.o();
                break;
        }
    }
}
