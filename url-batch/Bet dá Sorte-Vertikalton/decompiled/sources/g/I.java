package g;

import K.S;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class I extends u1.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2370c;
    public final /* synthetic */ K d;

    public /* synthetic */ I(K k2, int i) {
        this.f2370c = i;
        this.d = k2;
    }

    @Override // K.a0
    public final void a() {
        View view;
        K k2 = this.d;
        switch (this.f2370c) {
            case 0:
                if (k2.f2388q && (view = k2.i) != null) {
                    view.setTranslationY(0.0f);
                    k2.f2379f.setTranslationY(0.0f);
                }
                k2.f2379f.setVisibility(8);
                k2.f2379f.setTransitioning(false);
                k2.f2392u = null;
                B.j jVar = k2.f2384m;
                if (jVar != null) {
                    jVar.A(k2.f2383l);
                    k2.f2383l = null;
                    k2.f2384m = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = k2.f2378e;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = S.f351a;
                    K.E.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                k2.f2392u = null;
                k2.f2379f.requestLayout();
                break;
        }
    }
}
