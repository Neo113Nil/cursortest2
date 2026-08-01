package g;

import K.T;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class I extends w1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f2152b;

    public /* synthetic */ I(K k2, int i) {
        this.f2151a = i;
        this.f2152b = k2;
    }

    @Override // K.d0
    public final void a() {
        View view;
        K k2 = this.f2152b;
        switch (this.f2151a) {
            case 0:
                if (k2.f2170o && (view = k2.f2164g) != null) {
                    view.setTranslationY(RecyclerView.f1530C0);
                    k2.d.setTranslationY(RecyclerView.f1530C0);
                }
                k2.d.setVisibility(8);
                k2.d.setTransitioning(false);
                k2.f2174s = null;
                B.j jVar = k2.f2166k;
                if (jVar != null) {
                    jVar.B(k2.f2165j);
                    k2.f2165j = null;
                    k2.f2166k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = k2.f2161c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = T.f423a;
                    K.F.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                k2.f2174s = null;
                k2.d.requestLayout();
                break;
        }
    }
}
