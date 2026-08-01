package K0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import e0.C0125l;

/* loaded from: classes.dex */
public final class C implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f527b;

    public /* synthetic */ C(int i, Object obj) {
        this.f526a = i;
        this.f527b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f526a) {
            case 0:
                ((TextInputLayout) this.f527b).f2019v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0125l c0125l = (C0125l) this.f527b;
                c0125l.f2285c.setAlpha(floatValue);
                c0125l.f2286d.setAlpha(floatValue);
                c0125l.f2299s.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                H0.g gVar = ((BottomSheetBehavior) this.f527b).i;
                if (gVar != null) {
                    H0.f fVar = gVar.f272a;
                    if (fVar.i != floatValue2) {
                        fVar.i = floatValue2;
                        gVar.f276e = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
