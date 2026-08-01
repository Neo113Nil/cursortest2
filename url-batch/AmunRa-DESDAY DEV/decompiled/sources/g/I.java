package g;

import K.S;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class I extends s1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f2329b;

    public /* synthetic */ I(K k2, int i) {
        this.f2328a = i;
        this.f2329b = k2;
    }

    @Override // K.a0
    public final void a() {
        View view;
        K k2 = this.f2329b;
        switch (this.f2328a) {
            case 0:
                if (k2.f2352v && (view = k2.f2344n) != null) {
                    view.setTranslationY(0.0f);
                    k2.f2341k.setTranslationY(0.0f);
                }
                k2.f2341k.setVisibility(8);
                k2.f2341k.setTransitioning(false);
                k2.f2356z = null;
                B.j jVar = k2.f2348r;
                if (jVar != null) {
                    jVar.A(k2.f2347q);
                    k2.f2347q = null;
                    k2.f2348r = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = k2.f2340j;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = S.f362a;
                    K.E.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                k2.f2356z = null;
                k2.f2341k.requestLayout();
                break;
        }
    }
}
