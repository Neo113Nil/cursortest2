package g;

import K.S;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class I extends x1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2390a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f2391b;

    public /* synthetic */ I(K k2, int i) {
        this.f2390a = i;
        this.f2391b = k2;
    }

    @Override // K.a0
    public final void a() {
        View view;
        K k2 = this.f2391b;
        switch (this.f2390a) {
            case 0:
                if (k2.f2409o && (view = k2.f2403g) != null) {
                    view.setTranslationY(0.0f);
                    k2.d.setTranslationY(0.0f);
                }
                k2.d.setVisibility(8);
                k2.d.setTransitioning(false);
                k2.f2413s = null;
                B.j jVar = k2.f2405k;
                if (jVar != null) {
                    jVar.A(k2.f2404j);
                    k2.f2404j = null;
                    k2.f2405k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = k2.f2400c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = S.f422a;
                    K.E.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                k2.f2413s = null;
                k2.d.requestLayout();
                break;
        }
    }
}
