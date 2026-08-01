package g;

import K.S;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class I extends u1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f2330b;

    public /* synthetic */ I(K k2, int i) {
        this.f2329a = i;
        this.f2330b = k2;
    }

    @Override // K.a0
    public final void a() {
        View view;
        K k2 = this.f2330b;
        switch (this.f2329a) {
            case 0:
                if (k2.f2348o && (view = k2.f2342g) != null) {
                    view.setTranslationY(0.0f);
                    k2.d.setTranslationY(0.0f);
                }
                k2.d.setVisibility(8);
                k2.d.setTransitioning(false);
                k2.f2352s = null;
                B.j jVar = k2.f2344k;
                if (jVar != null) {
                    jVar.A(k2.f2343j);
                    k2.f2343j = null;
                    k2.f2344k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = k2.f2339c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = S.f369a;
                    K.E.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                k2.f2352s = null;
                k2.d.requestLayout();
                break;
        }
    }
}
