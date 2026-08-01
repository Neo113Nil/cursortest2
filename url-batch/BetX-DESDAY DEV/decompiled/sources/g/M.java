package g;

import K.X;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class M extends q1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f2515b;

    public /* synthetic */ M(O o2, int i) {
        this.f2514a = i;
        this.f2515b = o2;
    }

    @Override // K.f0
    public final void a() {
        View view;
        O o2 = this.f2515b;
        switch (this.f2514a) {
            case 0:
                if (o2.f2535o && (view = o2.f2529g) != null) {
                    view.setTranslationY(0.0f);
                    o2.f2526d.setTranslationY(0.0f);
                }
                o2.f2526d.setVisibility(8);
                o2.f2526d.setTransitioning(false);
                o2.f2539s = null;
                B.j jVar = o2.f2531k;
                if (jVar != null) {
                    jVar.d(o2.f2530j);
                    o2.f2530j = null;
                    o2.f2531k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = o2.f2525c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = X.f419a;
                    K.J.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                o2.f2539s = null;
                o2.f2526d.requestLayout();
                break;
        }
    }
}
