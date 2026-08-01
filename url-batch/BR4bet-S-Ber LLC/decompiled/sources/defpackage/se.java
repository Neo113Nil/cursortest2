package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class se implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout f;

    public se(CoordinatorLayout coordinatorLayout) {
        this.f = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f.p(0);
        return true;
    }
}
