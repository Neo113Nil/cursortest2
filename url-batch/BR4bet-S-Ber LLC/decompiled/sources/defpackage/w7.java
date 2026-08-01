package defpackage;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class w7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;

    public /* synthetic */ w7(f8 f8Var, int i) {
        this.a = i;
        this.b = f8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        f8 f8Var = this.b;
        switch (i) {
            case 0:
                f8Var.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e8 e8Var = f8Var.i;
                e8Var.setScaleX(floatValue);
                e8Var.setScaleY(floatValue);
                break;
            case 2:
                f8Var.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                f8Var.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
