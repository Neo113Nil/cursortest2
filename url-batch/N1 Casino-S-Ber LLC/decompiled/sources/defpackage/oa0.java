package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class oa0 extends o90 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qa0 b;

    public /* synthetic */ oa0(qa0 qa0Var, int i) {
        this.a = i;
        this.b = qa0Var;
    }

    @Override // defpackage.n90
    public final void a() {
        View view;
        int i = this.a;
        qa0 qa0Var = this.b;
        switch (i) {
            case 0:
                if (qa0Var.G && (view = qa0Var.y) != null) {
                    view.setTranslationY(0.0f);
                    qa0Var.v.setTranslationY(0.0f);
                }
                qa0Var.v.setVisibility(8);
                qa0Var.v.setTransitioning(false);
                qa0Var.K = null;
                q4 q4Var = qa0Var.C;
                if (q4Var != null) {
                    q4Var.I(qa0Var.B);
                    qa0Var.B = null;
                    qa0Var.C = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = qa0Var.u;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = x80.a;
                    actionBarOverlayLayout.requestApplyInsets();
                    break;
                }
                break;
            default:
                qa0Var.K = null;
                qa0Var.v.requestLayout();
                break;
        }
    }
}
