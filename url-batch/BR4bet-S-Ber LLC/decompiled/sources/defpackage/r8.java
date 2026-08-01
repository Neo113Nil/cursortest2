package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class r8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r8(int i, Object obj) {
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
                dw dwVar = ((BottomSheetBehavior) obj).j;
                if (dwVar != null) {
                    dwVar.s(floatValue);
                    break;
                }
                break;
            case 1:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                ll llVar = (ll) obj;
                llVar.c.setAlpha(floatValue2);
                llVar.d.setAlpha(floatValue2);
                llVar.s.invalidate();
                break;
            default:
                ((TextInputLayout) obj).B0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
