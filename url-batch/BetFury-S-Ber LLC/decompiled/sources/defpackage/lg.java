package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class lg implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout f;

    public lg(CoordinatorLayout coordinatorLayout) {
        this.f = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f.q(0);
        return true;
    }
}
