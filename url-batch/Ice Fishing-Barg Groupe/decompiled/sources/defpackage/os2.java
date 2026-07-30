package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class os2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ xs2 PxuCJdSBwIXG;
    public final /* synthetic */ rt2 TSizfFm2Yiuu;
    public final /* synthetic */ int Y1f8riQaR6yg;
    public final /* synthetic */ View e9gEMXR7LXtO;
    public final /* synthetic */ rt2 lS5Rgt96tfkO;

    public os2(xs2 xs2Var, rt2 rt2Var, rt2 rt2Var2, int i, View view) {
        this.PxuCJdSBwIXG = xs2Var;
        this.lS5Rgt96tfkO = rt2Var;
        this.TSizfFm2Yiuu = rt2Var2;
        this.Y1f8riQaR6yg = i;
        this.e9gEMXR7LXtO = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        xs2 xs2Var = this.PxuCJdSBwIXG;
        ws2 ws2Var = xs2Var.PxuCJdSBwIXG;
        ws2Var.e9gEMXR7LXtO(animatedFraction);
        float TSizfFm2Yiuu = ws2Var.TSizfFm2Yiuu();
        PathInterpolator pathInterpolator = ss2.e9gEMXR7LXtO;
        int i = Build.VERSION.SDK_INT;
        rt2 rt2Var = this.lS5Rgt96tfkO;
        ft2 et2Var = i >= 36 ? new et2(rt2Var) : i >= 35 ? new dt2(rt2Var) : i >= 34 ? new ct2(rt2Var) : i >= 31 ? new bt2(rt2Var) : i >= 30 ? new at2(rt2Var) : i >= 29 ? new zs2(rt2Var) : new ys2(rt2Var);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.Y1f8riQaR6yg & i2;
            ot2 ot2Var = rt2Var.PxuCJdSBwIXG;
            if (i3 == 0) {
                et2Var.Y1f8riQaR6yg(i2, ot2Var.rtx2ld2ELZv4(i2));
            } else {
                wp0 rtx2ld2ELZv4 = ot2Var.rtx2ld2ELZv4(i2);
                wp0 rtx2ld2ELZv42 = this.TSizfFm2Yiuu.PxuCJdSBwIXG.rtx2ld2ELZv4(i2);
                float f = 1.0f - TSizfFm2Yiuu;
                et2Var.Y1f8riQaR6yg(i2, rt2.PxuCJdSBwIXG(rtx2ld2ELZv4, (int) (((rtx2ld2ELZv4.PxuCJdSBwIXG - rtx2ld2ELZv42.PxuCJdSBwIXG) * f) + 0.5d), (int) (((rtx2ld2ELZv4.lS5Rgt96tfkO - rtx2ld2ELZv42.lS5Rgt96tfkO) * f) + 0.5d), (int) (((rtx2ld2ELZv4.TSizfFm2Yiuu - rtx2ld2ELZv42.TSizfFm2Yiuu) * f) + 0.5d), (int) (((rtx2ld2ELZv4.Y1f8riQaR6yg - rtx2ld2ELZv42.Y1f8riQaR6yg) * f) + 0.5d)));
            }
        }
        ss2.rtx2ld2ELZv4(this.e9gEMXR7LXtO, et2Var.lS5Rgt96tfkO(), Collections.singletonList(xs2Var));
    }
}
