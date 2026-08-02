package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ffd implements Runnable {
    final /* synthetic */ ffe a;
    private final CoordinatorLayout b;
    private final View c;

    public ffd(ffe ffeVar, CoordinatorLayout coordinatorLayout, View view) {
        this.a = ffeVar;
        this.b = coordinatorLayout;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ffe ffeVar;
        OverScroller overScroller;
        View view = this.c;
        if (view == null || (overScroller = (ffeVar = this.a).b) == null) {
            return;
        }
        boolean computeScrollOffset = overScroller.computeScrollOffset();
        CoordinatorLayout coordinatorLayout = this.b;
        if (!computeScrollOffset) {
            ffeVar.O(coordinatorLayout, view);
        } else {
            ffeVar.M(coordinatorLayout, view, ffeVar.b.getCurrY(), Integer.MIN_VALUE, Integer.MAX_VALUE);
            view.postOnAnimation(this);
        }
    }
}
