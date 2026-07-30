package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a73 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ i73 a;
    public final /* synthetic */ c83 b;
    public final /* synthetic */ c83 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public a73(i73 i73Var, c83 c83Var, c83 c83Var2, int i, View view) {
        this.a = i73Var;
        this.b = c83Var;
        this.c = c83Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        i73 i73Var = this.a;
        h73 h73Var = i73Var.a;
        h73Var.e(animatedFraction);
        float c = h73Var.c();
        PathInterpolator pathInterpolator = d73.e;
        int i = Build.VERSION.SDK_INT;
        c83 c83Var = this.b;
        q73 p73Var = i >= 36 ? new p73(c83Var) : i >= 35 ? new o73(c83Var) : i >= 34 ? new n73(c83Var) : i >= 31 ? new m73(c83Var) : i >= 30 ? new l73(c83Var) : i >= 29 ? new k73(c83Var) : new j73(c83Var);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            z73 z73Var = c83Var.a;
            if (i3 == 0) {
                p73Var.d(i2, z73Var.h(i2));
            } else {
                z21 h = z73Var.h(i2);
                z21 h2 = this.c.a.h(i2);
                float f = 1.0f - c;
                p73Var.d(i2, c83.a(h, (int) (((h.a - h2.a) * f) + 0.5d), (int) (((h.b - h2.b) * f) + 0.5d), (int) (((h.c - h2.c) * f) + 0.5d), (int) (((h.d - h2.d) * f) + 0.5d)));
            }
        }
        d73.h(this.e, p73Var.b(), Collections.singletonList(i73Var));
    }
}
