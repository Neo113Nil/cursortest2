package a0;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f96f;

    public f(CoordinatorLayout coordinatorLayout) {
        this.f96f = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f96f.p(0);
        return true;
    }
}
