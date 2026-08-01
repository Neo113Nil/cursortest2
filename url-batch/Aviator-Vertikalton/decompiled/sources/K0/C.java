package K0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import e0.C0124l;

/* loaded from: classes.dex */
public final class C implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f525a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f526b;

    public /* synthetic */ C(int i, Object obj) {
        this.f525a = i;
        this.f526b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f525a) {
            case 0:
                ((TextInputLayout) this.f526b).f2041v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0124l c0124l = (C0124l) this.f526b;
                c0124l.f2281c.setAlpha(floatValue);
                c0124l.f2282d.setAlpha(floatValue);
                c0124l.f2295s.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                H0.g gVar = ((BottomSheetBehavior) this.f526b).i;
                if (gVar != null) {
                    H0.f fVar = gVar.f273a;
                    if (fVar.i != floatValue2) {
                        fVar.i = floatValue2;
                        gVar.f277e = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
