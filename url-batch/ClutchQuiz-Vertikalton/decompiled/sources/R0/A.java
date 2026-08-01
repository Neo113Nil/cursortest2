package R0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import f0.C0106l;

/* loaded from: classes.dex */
public final class A implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f648b;

    public /* synthetic */ A(int i, Object obj) {
        this.f647a = i;
        this.f648b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f647a) {
            case 0:
                ((TextInputLayout) this.f648b).f2027v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0106l c0106l = (C0106l) this.f648b;
                c0106l.f2291c.setAlpha(floatValue);
                c0106l.d.setAlpha(floatValue);
                c0106l.f2304s.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                O0.g gVar = ((BottomSheetBehavior) this.f648b).i;
                if (gVar != null) {
                    O0.f fVar = gVar.f527a;
                    if (fVar.i != floatValue2) {
                        fVar.i = floatValue2;
                        gVar.f530e = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
