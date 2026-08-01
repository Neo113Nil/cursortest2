package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class vd0 extends mz {
    public final /* synthetic */ int j;
    public final /* synthetic */ xd0 k;

    public /* synthetic */ vd0(xd0 xd0Var, int i) {
        this.j = i;
        this.k = xd0Var;
    }

    @Override // defpackage.yc0
    public final void a() {
        View view;
        int i = this.j;
        xd0 xd0Var = this.k;
        switch (i) {
            case 0:
                if (xd0Var.o && (view = xd0Var.g) != null) {
                    view.setTranslationY(0.0f);
                    xd0Var.d.setTranslationY(0.0f);
                }
                xd0Var.d.setVisibility(8);
                xd0Var.d.setTransitioning(false);
                xd0Var.s = null;
                a5 a5Var = xd0Var.k;
                if (a5Var != null) {
                    a5Var.I(xd0Var.j);
                    xd0Var.j = null;
                    xd0Var.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = xd0Var.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = ic0.a;
                    actionBarOverlayLayout.requestApplyInsets();
                    break;
                }
                break;
            default:
                xd0Var.s = null;
                xd0Var.d.requestLayout();
                break;
        }
    }
}
