package g;

import K.X;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class M extends q1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f2511b;

    public /* synthetic */ M(O o2, int i) {
        this.f2510a = i;
        this.f2511b = o2;
    }

    @Override // K.f0
    public final void a() {
        View view;
        O o2 = this.f2511b;
        switch (this.f2510a) {
            case 0:
                if (o2.f2531o && (view = o2.f2525g) != null) {
                    view.setTranslationY(0.0f);
                    o2.f2522d.setTranslationY(0.0f);
                }
                o2.f2522d.setVisibility(8);
                o2.f2522d.setTransitioning(false);
                o2.f2535s = null;
                B.j jVar = o2.f2527k;
                if (jVar != null) {
                    jVar.d(o2.f2526j);
                    o2.f2526j = null;
                    o2.f2527k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = o2.f2521c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = X.f418a;
                    K.J.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                o2.f2535s = null;
                o2.f2522d.requestLayout();
                break;
        }
    }
}
