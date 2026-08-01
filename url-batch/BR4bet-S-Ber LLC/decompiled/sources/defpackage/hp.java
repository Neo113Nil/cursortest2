package defpackage;

import android.os.Handler;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class hp implements Runnable {
    public final /* synthetic */ int f = 1;
    public Object g;
    public Object h;
    public Object i;

    public hp(ip ipVar, CoordinatorLayout coordinatorLayout, View view) {
        this.i = ipVar;
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
                ip ipVar = (ip) this.i;
                View view = (View) this.h;
                if (view != null && (overScroller = ipVar.d) != null) {
                    if (!overScroller.computeScrollOffset()) {
                        AppBarLayout appBarLayout = (AppBarLayout) view;
                        ((AppBarLayout.BaseBehavior) ipVar).G(coordinatorLayout, appBarLayout);
                        if (appBarLayout.p) {
                            appBarLayout.e(appBarLayout.f(AppBarLayout.BaseBehavior.D(coordinatorLayout)));
                            break;
                        }
                    } else {
                        ipVar.A(coordinatorLayout, view, ipVar.d.getCurrY());
                        view.postOnAnimation(this);
                        break;
                    }
                }
                break;
            default:
                try {
                    obj = ((zl) this.g).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.i).post(new g1((am) this.h, obj, 8, false));
                break;
        }
    }

    public /* synthetic */ hp() {
    }
}
