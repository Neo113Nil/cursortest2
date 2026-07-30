package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class u63 extends mi2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w63 b;

    public /* synthetic */ u63(w63 w63Var, int i) {
        this.a = i;
        this.b = w63Var;
    }

    @Override // defpackage.y53
    public final void a() {
        View view;
        int i = this.a;
        w63 w63Var = this.b;
        switch (i) {
            case 0:
                if (w63Var.o && (view = w63Var.g) != null) {
                    view.setTranslationY(0.0f);
                    w63Var.d.setTranslationY(0.0f);
                }
                w63Var.d.setVisibility(8);
                w63Var.d.setTransitioning(false);
                w63Var.s = null;
                t21 t21Var = w63Var.k;
                if (t21Var != null) {
                    t21Var.E(w63Var.j);
                    w63Var.j = null;
                    w63Var.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = w63Var.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = e53.a;
                    actionBarOverlayLayout.requestApplyInsets();
                    break;
                }
                break;
            default:
                w63Var.s = null;
                w63Var.d.requestLayout();
                break;
        }
    }
}
