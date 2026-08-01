package g;

import K.T;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class I extends q1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f2255b;

    public /* synthetic */ I(K k2, int i) {
        this.f2254a = i;
        this.f2255b = k2;
    }

    @Override // K.b0
    public final void a() {
        View view;
        K k2 = this.f2255b;
        switch (this.f2254a) {
            case 0:
                if (k2.f2273o && (view = k2.f2267g) != null) {
                    view.setTranslationY(0.0f);
                    k2.d.setTranslationY(0.0f);
                }
                k2.d.setVisibility(8);
                k2.d.setTransitioning(false);
                k2.f2277s = null;
                B.j jVar = k2.f2269k;
                if (jVar != null) {
                    jVar.A(k2.f2268j);
                    k2.f2268j = null;
                    k2.f2269k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = k2.f2264c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = T.f381a;
                    K.F.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                k2.f2277s = null;
                k2.d.requestLayout();
                break;
        }
    }
}
