package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import n0.p0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i0 extends b4.d {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1528o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k0 f1529p;

    public /* synthetic */ i0(k0 k0Var, int i) {
        this.f1528o = i;
        this.f1529p = k0Var;
    }

    @Override // n0.u0
    public final void b() {
        View view;
        int i = this.f1528o;
        k0 k0Var = this.f1529p;
        switch (i) {
            case 0:
                if (k0Var.f1545p && (view = k0Var.h) != null) {
                    view.setTranslationY(0.0f);
                    k0Var.f1536e.setTranslationY(0.0f);
                }
                k0Var.f1536e.setVisibility(8);
                k0Var.f1536e.setTransitioning(false);
                k0Var.f1549t = null;
                androidx.emoji2.text.q qVar = k0Var.f1541l;
                if (qVar != null) {
                    qVar.A(k0Var.f1540k);
                    k0Var.f1540k = null;
                    k0Var.f1541l = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = k0Var.d;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = p0.f2816a;
                    actionBarOverlayLayout.requestApplyInsets();
                    break;
                }
                break;
            default:
                k0Var.f1549t = null;
                k0Var.f1536e.requestLayout();
                break;
        }
    }
}
