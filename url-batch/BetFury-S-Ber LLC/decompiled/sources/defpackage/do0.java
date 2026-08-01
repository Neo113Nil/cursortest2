package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class do0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ jo0 a;
    public final /* synthetic */ dp0 b;
    public final /* synthetic */ dp0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public do0(jo0 jo0Var, dp0 dp0Var, dp0 dp0Var2, int i, View view) {
        this.a = jo0Var;
        this.b = dp0Var;
        this.c = dp0Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        jo0 jo0Var = this.a;
        io0 io0Var = jo0Var.a;
        io0Var.e(animatedFraction);
        float c = io0Var.c();
        PathInterpolator pathInterpolator = fo0.e;
        int i = Build.VERSION.SDK_INT;
        dp0 dp0Var = this.b;
        ro0 qo0Var = i >= 36 ? new qo0(dp0Var) : i >= 35 ? new po0(dp0Var) : i >= 34 ? new oo0(dp0Var) : i >= 31 ? new no0(dp0Var) : i >= 30 ? new mo0(dp0Var) : i >= 29 ? new lo0(dp0Var) : new ko0(dp0Var);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            ap0 ap0Var = dp0Var.a;
            if (i3 == 0) {
                qo0Var.d(i2, ap0Var.h(i2));
            } else {
                fv h = ap0Var.h(i2);
                fv h2 = this.c.a.h(i2);
                float f = 1.0f - c;
                qo0Var.d(i2, dp0.e(h, (int) (((h.a - h2.a) * f) + 0.5d), (int) (((h.b - h2.b) * f) + 0.5d), (int) (((h.c - h2.c) * f) + 0.5d), (int) (((h.d - h2.d) * f) + 0.5d)));
            }
        }
        fo0.h(this.e, qo0Var.b(), Collections.singletonList(jo0Var));
    }
}
