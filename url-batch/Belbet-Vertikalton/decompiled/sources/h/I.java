package h;

import M.P;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class I extends H1.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2739b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K f2740c;

    public /* synthetic */ I(K k2, int i) {
        this.f2739b = i;
        this.f2740c = k2;
    }

    @Override // M.X
    public final void a() {
        View view;
        K k2 = this.f2740c;
        switch (this.f2739b) {
            case 0:
                if (k2.f2760s && (view = k2.f2752k) != null) {
                    view.setTranslationY(0.0f);
                    k2.f2751h.setTranslationY(0.0f);
                }
                k2.f2751h.setVisibility(8);
                k2.f2751h.setTransitioning(false);
                k2.f2764w = null;
                B1.c cVar = k2.f2756o;
                if (cVar != null) {
                    cVar.C(k2.f2755n);
                    k2.f2755n = null;
                    k2.f2756o = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = k2.f2750g;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = P.f711a;
                    M.C.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                k2.f2764w = null;
                k2.f2751h.requestLayout();
                break;
        }
    }
}
