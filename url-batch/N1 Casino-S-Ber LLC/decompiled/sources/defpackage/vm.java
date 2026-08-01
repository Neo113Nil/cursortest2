package defpackage;

import android.os.Handler;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class vm implements Runnable {
    public final /* synthetic */ int f = 1;
    public Object g;
    public Object h;
    public Object i;

    public vm(wm wmVar, CoordinatorLayout coordinatorLayout, View view) {
        this.i = wmVar;
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
                wm wmVar = (wm) this.i;
                View view = (View) this.h;
                if (view != null && (overScroller = wmVar.d) != null) {
                    if (!overScroller.computeScrollOffset()) {
                        AppBarLayout appBarLayout = (AppBarLayout) view;
                        ((AppBarLayout.BaseBehavior) wmVar).G(coordinatorLayout, appBarLayout);
                        if (appBarLayout.p) {
                            appBarLayout.e(appBarLayout.f(AppBarLayout.BaseBehavior.D(coordinatorLayout)));
                            break;
                        }
                    } else {
                        wmVar.A(coordinatorLayout, view, wmVar.d.getCurrY());
                        view.postOnAnimation(this);
                        break;
                    }
                }
                break;
            default:
                try {
                    obj = ((vj) this.g).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.i).post(new f1((wj) this.h, obj, 8, false));
                break;
        }
    }

    public /* synthetic */ vm() {
    }
}
