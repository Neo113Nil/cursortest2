package g;

import K.T;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class I extends q1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f2256b;

    public /* synthetic */ I(K k2, int i) {
        this.f2255a = i;
        this.f2256b = k2;
    }

    @Override // K.b0
    public final void a() {
        View view;
        K k2 = this.f2256b;
        switch (this.f2255a) {
            case 0:
                if (k2.f2274o && (view = k2.f2268g) != null) {
                    view.setTranslationY(0.0f);
                    k2.d.setTranslationY(0.0f);
                }
                k2.d.setVisibility(8);
                k2.d.setTransitioning(false);
                k2.f2278s = null;
                B.j jVar = k2.f2270k;
                if (jVar != null) {
                    jVar.A(k2.f2269j);
                    k2.f2269j = null;
                    k2.f2270k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = k2.f2265c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = T.f381a;
                    K.F.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                k2.f2278s = null;
                k2.d.requestLayout();
                break;
        }
    }
}
