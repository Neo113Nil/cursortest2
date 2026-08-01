package L0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import f0.C0103l;

/* loaded from: classes.dex */
public final class C implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f497b;

    public /* synthetic */ C(int i, Object obj) {
        this.f496a = i;
        this.f497b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f496a) {
            case 0:
                ((TextInputLayout) this.f497b).f1883v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0103l c0103l = (C0103l) this.f497b;
                c0103l.f2175c.setAlpha(floatValue);
                c0103l.d.setAlpha(floatValue);
                c0103l.f2188s.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                I0.g gVar = ((BottomSheetBehavior) this.f497b).i;
                if (gVar != null) {
                    I0.f fVar = gVar.f275a;
                    if (fVar.i != floatValue2) {
                        fVar.i = floatValue2;
                        gVar.f278e = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
