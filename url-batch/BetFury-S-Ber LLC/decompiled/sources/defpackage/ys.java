package defpackage;

import android.os.Handler;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ys implements Runnable {
    public final /* synthetic */ int f = 1;
    public Object g;
    public Object h;
    public Object i;

    public ys(zs zsVar, CoordinatorLayout coordinatorLayout, View view) {
        this.i = zsVar;
        this.g = coordinatorLayout;
        this.h = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OverScroller overScroller;
        switch (this.f) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.g;
                zs zsVar = (zs) this.i;
                View view = (View) this.h;
                if (view != null && (overScroller = zsVar.d) != null) {
                    if (!overScroller.computeScrollOffset()) {
                        AppBarLayout appBarLayout = (AppBarLayout) view;
                        ((AppBarLayout.BaseBehavior) zsVar).G(coordinatorLayout, appBarLayout);
                        if (appBarLayout.p) {
                            appBarLayout.e(appBarLayout.f(AppBarLayout.BaseBehavior.D(coordinatorLayout)));
                            break;
                        }
                    } else {
                        zsVar.A(coordinatorLayout, view, zsVar.d.getCurrY());
                        view.postOnAnimation(this);
                        break;
                    }
                }
                break;
            default:
                try {
                    obj = ((fp) this.g).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.i).post(new j1((gp) this.h, obj, 9, false));
                break;
        }
    }

    public /* synthetic */ ys() {
    }
}
