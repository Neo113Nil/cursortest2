package K0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import f0.C0095l;

/* loaded from: classes.dex */
public final class C implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f478b;

    public /* synthetic */ C(int i, Object obj) {
        this.f477a = i;
        this.f478b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f477a) {
            case 0:
                ((TextInputLayout) this.f478b).f1819v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0095l c0095l = (C0095l) this.f478b;
                c0095l.f2108c.setAlpha(floatValue);
                c0095l.d.setAlpha(floatValue);
                c0095l.f2121s.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                H0.g gVar = ((BottomSheetBehavior) this.f478b).i;
                if (gVar != null) {
                    H0.f fVar = gVar.f256a;
                    if (fVar.i != floatValue2) {
                        fVar.i = floatValue2;
                        gVar.f259e = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
