package g;

import K.Q;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import u0.C0385x;

/* loaded from: classes.dex */
public final class I extends H1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f2609b;

    public /* synthetic */ I(K k2, int i) {
        this.f2608a = i;
        this.f2609b = k2;
    }

    @Override // K.a0
    public final void a() {
        View view;
        K k2 = this.f2609b;
        switch (this.f2608a) {
            case 0:
                if (k2.f2628r && (view = k2.f2620j) != null) {
                    view.setTranslationY(RecyclerView.f1937A0);
                    k2.f2619g.setTranslationY(RecyclerView.f1937A0);
                }
                k2.f2619g.setVisibility(8);
                k2.f2619g.setTransitioning(false);
                k2.f2632v = null;
                C0385x c0385x = k2.f2624n;
                if (c0385x != null) {
                    c0385x.x(k2.f2623m);
                    k2.f2623m = null;
                    k2.f2624n = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = k2.f2618f;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = Q.f578a;
                    K.D.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                k2.f2632v = null;
                k2.f2619g.requestLayout();
                break;
        }
    }
}
