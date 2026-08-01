package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class vi implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                wi wiVar = (wi) obj;
                wiVar.c.setAlpha(floatValue);
                wiVar.d.setAlpha(floatValue);
                wiVar.s.invalidate();
                break;
            default:
                ((TextInputLayout) obj).B0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
