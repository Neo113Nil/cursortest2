package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class vd implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout f;

    public vd(CoordinatorLayout coordinatorLayout) {
        this.f = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f.p(0);
        return true;
    }
}
