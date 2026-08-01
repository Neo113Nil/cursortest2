package O0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import h0.C0125l;

/* loaded from: classes.dex */
public final class C implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f648b;

    public /* synthetic */ C(int i, Object obj) {
        this.f647a = i;
        this.f648b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f647a) {
            case 0:
                ((TextInputLayout) this.f648b).f2031v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0125l c0125l = (C0125l) this.f648b;
                c0125l.f2533c.setAlpha(floatValue);
                c0125l.d.setAlpha(floatValue);
                c0125l.f2546s.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                L0.g gVar = ((BottomSheetBehavior) this.f648b).i;
                if (gVar != null) {
                    gVar.m(floatValue2);
                    break;
                }
                break;
        }
    }
}
