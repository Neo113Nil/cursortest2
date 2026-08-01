package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ra0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ xa0 a;
    public final /* synthetic */ rb0 b;
    public final /* synthetic */ rb0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public ra0(xa0 xa0Var, rb0 rb0Var, rb0 rb0Var2, int i, View view) {
        this.a = xa0Var;
        this.b = rb0Var;
        this.c = rb0Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        xa0 xa0Var = this.a;
        wa0 wa0Var = xa0Var.a;
        wa0Var.e(animatedFraction);
        float c = wa0Var.c();
        PathInterpolator pathInterpolator = ta0.e;
        int i = Build.VERSION.SDK_INT;
        rb0 rb0Var = this.b;
        fb0 eb0Var = i >= 36 ? new eb0(rb0Var) : i >= 35 ? new db0(rb0Var) : i >= 34 ? new cb0(rb0Var) : i >= 31 ? new bb0(rb0Var) : i >= 30 ? new ab0(rb0Var) : i >= 29 ? new za0(rb0Var) : new ya0(rb0Var);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            ob0 ob0Var = rb0Var.a;
            if (i3 == 0) {
                eb0Var.d(i2, ob0Var.h(i2));
            } else {
                to h = ob0Var.h(i2);
                to h2 = this.c.a.h(i2);
                float f = 1.0f - c;
                eb0Var.d(i2, rb0.e(h, (int) (((h.a - h2.a) * f) + 0.5d), (int) (((h.b - h2.b) * f) + 0.5d), (int) (((h.c - h2.c) * f) + 0.5d), (int) (((h.d - h2.d) * f) + 0.5d)));
            }
        }
        ta0.h(this.e, eb0Var.b(), Collections.singletonList(xa0Var));
    }
}
