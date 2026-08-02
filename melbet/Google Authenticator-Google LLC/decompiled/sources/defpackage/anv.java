package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class anv implements Animation.AnimationListener {
    final /* synthetic */ SwipeRefreshLayout a;
    private final /* synthetic */ int b;

    public anv(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.b = i;
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        any anyVar;
        int i = this.b;
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        if (i == 0) {
            swipeRefreshLayout.k(null);
            return;
        }
        if (!swipeRefreshLayout.b) {
            this.a.b();
            return;
        }
        swipeRefreshLayout.h.setAlpha(255);
        swipeRefreshLayout.h.start();
        if (swipeRefreshLayout.i && (anyVar = swipeRefreshLayout.a) != null) {
            gxd gxdVar = (gxd) anyVar;
            any anyVar2 = gxdVar.b;
            gtt f = ((gva) gxdVar.c.a).f(gxdVar.a, 274);
            try {
                bvm bvmVar = ((bui) anyVar2).a;
                bvmVar.i.i(cbp.k(((bwz) bvmVar.n).a(true)), bvmVar.w);
                f.close();
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.a;
        swipeRefreshLayout2.c = swipeRefreshLayout2.d.getTop();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
