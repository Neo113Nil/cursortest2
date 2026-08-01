package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class d8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d8(int i, Object obj) {
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
                ct ctVar = ((BottomSheetBehavior) obj).j;
                if (ctVar != null) {
                    ctVar.s(floatValue);
                    break;
                }
                break;
            case 1:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                cj cjVar = (cj) obj;
                cjVar.c.setAlpha(floatValue2);
                cjVar.d.setAlpha(floatValue2);
                cjVar.s.invalidate();
                break;
            case 2:
                ((bp) obj).m = valueAnimator.getAnimatedFraction();
                break;
            default:
                ((TextInputLayout) obj).B0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
