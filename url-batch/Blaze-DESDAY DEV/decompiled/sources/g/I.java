package g;

import K.T;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class I extends z1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f2192b;

    public /* synthetic */ I(K k2, int i) {
        this.f2191a = i;
        this.f2192b = k2;
    }

    @Override // K.d0
    public final void a() {
        View view;
        K k2 = this.f2192b;
        switch (this.f2191a) {
            case 0:
                if (k2.f2210o && (view = k2.f2204g) != null) {
                    view.setTranslationY(RecyclerView.f1559A0);
                    k2.d.setTranslationY(RecyclerView.f1559A0);
                }
                k2.d.setVisibility(8);
                k2.d.setTransitioning(false);
                k2.f2214s = null;
                B.j jVar = k2.f2206k;
                if (jVar != null) {
                    jVar.B(k2.f2205j);
                    k2.f2205j = null;
                    k2.f2206k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = k2.f2201c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = T.f440a;
                    K.F.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                k2.f2214s = null;
                k2.d.requestLayout();
                break;
        }
    }
}
