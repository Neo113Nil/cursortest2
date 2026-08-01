package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class zn0 extends mc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo0 b;

    public /* synthetic */ zn0(bo0 bo0Var, int i) {
        this.a = i;
        this.b = bo0Var;
    }

    @Override // defpackage.xm0
    public final void a() {
        View view;
        int i = this.a;
        bo0 bo0Var = this.b;
        switch (i) {
            case 0:
                if (bo0Var.G && (view = bo0Var.y) != null) {
                    view.setTranslationY(0.0f);
                    bo0Var.v.setTranslationY(0.0f);
                }
                bo0Var.v.setVisibility(8);
                bo0Var.v.setTransitioning(false);
                bo0Var.K = null;
                i5 i5Var = bo0Var.C;
                if (i5Var != null) {
                    i5Var.F(bo0Var.B);
                    bo0Var.B = null;
                    bo0Var.C = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = bo0Var.u;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = hm0.a;
                    actionBarOverlayLayout.requestApplyInsets();
                    break;
                }
                break;
            default:
                bo0Var.K = null;
                bo0Var.v.requestLayout();
                break;
        }
    }
}
