package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class yd0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ee0 a;
    public final /* synthetic */ ye0 b;
    public final /* synthetic */ ye0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public yd0(ee0 ee0Var, ye0 ye0Var, ye0 ye0Var2, int i, View view) {
        this.a = ee0Var;
        this.b = ye0Var;
        this.c = ye0Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ee0 ee0Var = this.a;
        de0 de0Var = ee0Var.a;
        de0Var.e(animatedFraction);
        float c = de0Var.c();
        PathInterpolator pathInterpolator = ae0.e;
        int i = Build.VERSION.SDK_INT;
        ye0 ye0Var = this.b;
        me0 le0Var = i >= 36 ? new le0(ye0Var) : i >= 35 ? new ke0(ye0Var) : i >= 34 ? new je0(ye0Var) : i >= 31 ? new ie0(ye0Var) : i >= 30 ? new he0(ye0Var) : i >= 29 ? new ge0(ye0Var) : new fe0(ye0Var);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            ve0 ve0Var = ye0Var.a;
            if (i3 == 0) {
                le0Var.d(i2, ve0Var.h(i2));
            } else {
                er h = ve0Var.h(i2);
                er h2 = this.c.a.h(i2);
                float f = 1.0f - c;
                le0Var.d(i2, ye0.e(h, (int) (((h.a - h2.a) * f) + 0.5d), (int) (((h.b - h2.b) * f) + 0.5d), (int) (((h.c - h2.c) * f) + 0.5d), (int) (((h.d - h2.d) * f) + 0.5d)));
            }
        }
        ae0.h(this.e, le0Var.b(), Collections.singletonList(ee0Var));
    }
}
