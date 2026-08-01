package g;

import L.T;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class I extends A1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f2268b;

    public /* synthetic */ I(K k2, int i) {
        this.f2267a = i;
        this.f2268b = k2;
    }

    @Override // L.d0
    public final void a() {
        View view;
        K k2 = this.f2268b;
        switch (this.f2267a) {
            case 0:
                if (k2.f2290s && (view = k2.f2282k) != null) {
                    view.setTranslationY(RecyclerView.A0);
                    k2.f2280h.setTranslationY(RecyclerView.A0);
                }
                k2.f2280h.setVisibility(8);
                k2.f2280h.setTransitioning(false);
                k2.f2294w = null;
                C.j jVar = k2.f2286o;
                if (jVar != null) {
                    jVar.B(k2.f2285n);
                    k2.f2285n = null;
                    k2.f2286o = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = k2.f2279g;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = T.f490a;
                    L.F.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                k2.f2294w = null;
                k2.f2280h.requestLayout();
                break;
        }
    }
}
