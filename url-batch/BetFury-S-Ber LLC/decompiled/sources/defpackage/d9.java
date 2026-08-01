package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class d9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g10 g10Var = ((BottomSheetBehavior) obj).j;
                if (g10Var != null) {
                    g10Var.s(floatValue);
                    break;
                }
                break;
            case 1:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                ko koVar = (ko) obj;
                koVar.c.setAlpha(floatValue2);
                koVar.d.setAlpha(floatValue2);
                koVar.s.invalidate();
                break;
            case 2:
                ((xv) obj).m = valueAnimator.getAnimatedFraction();
                break;
            default:
                ((TextInputLayout) obj).B0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
