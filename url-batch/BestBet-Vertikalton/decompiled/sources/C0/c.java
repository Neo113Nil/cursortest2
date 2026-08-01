package C0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import g0.C0148l;

/* loaded from: classes.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f90b;

    public /* synthetic */ c(int i, Object obj) {
        this.f89a = i;
        this.f90b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f89a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                R0.g gVar = ((BottomSheetBehavior) this.f90b).i;
                if (gVar != null) {
                    R0.f fVar = gVar.f917a;
                    if (fVar.i != floatValue) {
                        fVar.i = floatValue;
                        gVar.f920e = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
            case 1:
                ((TextInputLayout) this.f90b).f2424v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0148l c0148l = (C0148l) this.f90b;
                c0148l.f2878c.setAlpha(floatValue2);
                c0148l.d.setAlpha(floatValue2);
                c0148l.f2891s.invalidate();
                break;
        }
    }
}
