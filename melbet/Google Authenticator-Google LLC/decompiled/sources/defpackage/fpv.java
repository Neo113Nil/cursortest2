package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fpv implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ View a;
    final /* synthetic */ Object b;
    final /* synthetic */ LinearLayout c;
    private final /* synthetic */ int d;

    public fpv(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
        this.d = i;
        this.a = coordinatorLayout;
        this.c = appBarLayout;
        this.b = baseBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.d != 0) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ((ffe) this.b).M((CoordinatorLayout) this.a, this.c, intValue, Integer.MIN_VALUE, Integer.MAX_VALUE);
            return;
        }
        float animatedFraction = valueAnimator.getAnimatedFraction();
        Object obj = this.b;
        ((fpw) this.c).c(this.a, (View) obj, animatedFraction);
    }

    public fpv(fpw fpwVar, View view, View view2, int i) {
        this.d = i;
        this.a = view;
        this.b = view2;
        this.c = fpwVar;
    }
}
