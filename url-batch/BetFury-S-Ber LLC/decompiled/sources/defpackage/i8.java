package defpackage;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class i8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q8 b;

    public /* synthetic */ i8(q8 q8Var, int i) {
        this.a = i;
        this.b = q8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        q8 q8Var = this.b;
        switch (i) {
            case 0:
                q8Var.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p8 p8Var = q8Var.i;
                p8Var.setScaleX(floatValue);
                p8Var.setScaleY(floatValue);
                break;
            case 2:
                q8Var.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                q8Var.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
