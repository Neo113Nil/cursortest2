package M0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import g0.C0128n;

/* loaded from: classes.dex */
public final class C implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f561b;

    public /* synthetic */ C(int i, Object obj) {
        this.f560a = i;
        this.f561b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f560a) {
            case 0:
                ((TextInputLayout) this.f561b).f1943v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0128n c0128n = (C0128n) this.f561b;
                c0128n.f2437c.setAlpha(floatValue);
                c0128n.d.setAlpha(floatValue);
                c0128n.f2450s.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                J0.g gVar = ((BottomSheetBehavior) this.f561b).i;
                if (gVar != null) {
                    J0.f fVar = gVar.f335a;
                    if (fVar.i != floatValue2) {
                        fVar.i = floatValue2;
                        gVar.f338e = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
