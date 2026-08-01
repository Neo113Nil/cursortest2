package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ab0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ gb0 a;
    public final /* synthetic */ ac0 b;
    public final /* synthetic */ ac0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public ab0(gb0 gb0Var, ac0 ac0Var, ac0 ac0Var2, int i, View view) {
        this.a = gb0Var;
        this.b = ac0Var;
        this.c = ac0Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        gb0 gb0Var = this.a;
        fb0 fb0Var = gb0Var.a;
        fb0Var.e(animatedFraction);
        float c = fb0Var.c();
        PathInterpolator pathInterpolator = cb0.e;
        int i = Build.VERSION.SDK_INT;
        ac0 ac0Var = this.b;
        ob0 nb0Var = i >= 36 ? new nb0(ac0Var) : i >= 35 ? new mb0(ac0Var) : i >= 34 ? new lb0(ac0Var) : i >= 31 ? new kb0(ac0Var) : i >= 30 ? new jb0(ac0Var) : i >= 29 ? new ib0(ac0Var) : new hb0(ac0Var);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            xb0 xb0Var = ac0Var.a;
            if (i3 == 0) {
                nb0Var.d(i2, xb0Var.h(i2));
            } else {
                ip h = xb0Var.h(i2);
                ip h2 = this.c.a.h(i2);
                float f = 1.0f - c;
                nb0Var.d(i2, ac0.e(h, (int) (((h.a - h2.a) * f) + 0.5d), (int) (((h.b - h2.b) * f) + 0.5d), (int) (((h.c - h2.c) * f) + 0.5d), (int) (((h.d - h2.d) * f) + 0.5d)));
            }
        }
        cb0.h(this.e, nb0Var.b(), Collections.singletonList(gb0Var));
    }
}
