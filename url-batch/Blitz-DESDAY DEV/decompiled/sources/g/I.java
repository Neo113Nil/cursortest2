package g;

import M.Q;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class I extends z1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f2254b;

    public /* synthetic */ I(K k2, int i) {
        this.f2253a = i;
        this.f2254b = k2;
    }

    @Override // M.Z
    public final void a() {
        View view;
        K k2 = this.f2254b;
        switch (this.f2253a) {
            case 0:
                if (k2.f2272o && (view = k2.f2266g) != null) {
                    view.setTranslationY(0.0f);
                    k2.d.setTranslationY(0.0f);
                }
                k2.d.setVisibility(8);
                k2.d.setTransitioning(false);
                k2.f2276s = null;
                D.j jVar = k2.f2268k;
                if (jVar != null) {
                    jVar.B(k2.f2267j);
                    k2.f2267j = null;
                    k2.f2268k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = k2.f2263c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = Q.f513a;
                    M.D.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                k2.f2276s = null;
                k2.d.requestLayout();
                break;
        }
    }
}
