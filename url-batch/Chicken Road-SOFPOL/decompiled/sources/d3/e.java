package d3;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f2240d;

    public e(CoordinatorLayout coordinatorLayout) {
        this.f2240d = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f2240d.p(0);
        return true;
    }
}
