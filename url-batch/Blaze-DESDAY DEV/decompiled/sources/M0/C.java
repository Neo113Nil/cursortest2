package M0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import g0.C0129m;

/* loaded from: classes.dex */
public final class C implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f578b;

    public /* synthetic */ C(int i, Object obj) {
        this.f577a = i;
        this.f578b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f577a) {
            case 0:
                ((TextInputLayout) this.f578b).f1976v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0129m c0129m = (C0129m) this.f578b;
                c0129m.f2467c.setAlpha(floatValue);
                c0129m.d.setAlpha(floatValue);
                c0129m.f2480s.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                J0.g gVar = ((BottomSheetBehavior) this.f578b).i;
                if (gVar != null) {
                    J0.f fVar = gVar.f352a;
                    if (fVar.i != floatValue2) {
                        fVar.i = floatValue2;
                        gVar.f355e = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
