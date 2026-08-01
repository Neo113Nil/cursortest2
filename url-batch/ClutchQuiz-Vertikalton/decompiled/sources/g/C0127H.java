package g;

import K.S;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* renamed from: g.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127H extends A.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ J f2387f;

    public /* synthetic */ C0127H(J j2, int i) {
        this.f2386e = i;
        this.f2387f = j2;
    }

    @Override // K.a0
    public final void a() {
        View view;
        J j2 = this.f2387f;
        switch (this.f2386e) {
            case 0:
                if (j2.f2405o && (view = j2.f2399g) != null) {
                    view.setTranslationY(0.0f);
                    j2.d.setTranslationY(0.0f);
                }
                j2.d.setVisibility(8);
                j2.d.setTransitioning(false);
                j2.f2409s = null;
                B.j jVar = j2.f2401k;
                if (jVar != null) {
                    jVar.C(j2.f2400j);
                    j2.f2400j = null;
                    j2.f2401k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = j2.f2396c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = S.f365a;
                    K.E.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                j2.f2409s = null;
                j2.d.requestLayout();
                break;
        }
    }
}
