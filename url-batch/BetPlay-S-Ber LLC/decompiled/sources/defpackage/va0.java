package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class va0 extends vw {
    public final /* synthetic */ int o;
    public final /* synthetic */ xa0 p;

    public /* synthetic */ va0(xa0 xa0Var, int i) {
        this.o = i;
        this.p = xa0Var;
    }

    @Override // defpackage.v90
    public final void a() {
        View view;
        int i = this.o;
        xa0 xa0Var = this.p;
        switch (i) {
            case 0:
                if (xa0Var.o && (view = xa0Var.g) != null) {
                    view.setTranslationY(0.0f);
                    xa0Var.d.setTranslationY(0.0f);
                }
                xa0Var.d.setVisibility(8);
                xa0Var.d.setTransitioning(false);
                xa0Var.s = null;
                h5 h5Var = xa0Var.k;
                if (h5Var != null) {
                    h5Var.C(xa0Var.j);
                    xa0Var.j = null;
                    xa0Var.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = xa0Var.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = e90.a;
                    actionBarOverlayLayout.requestApplyInsets();
                    break;
                }
                break;
            default:
                xa0Var.s = null;
                xa0Var.d.requestLayout();
                break;
        }
    }
}
