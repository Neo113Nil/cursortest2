package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ua implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ CoordinatorLayout a;

    public ua(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.i(0);
        return true;
    }
}
