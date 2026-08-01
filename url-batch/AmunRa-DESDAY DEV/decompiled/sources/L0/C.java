package L0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import f0.C0101l;

/* loaded from: classes.dex */
public final class C implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f486b;

    public /* synthetic */ C(int i, Object obj) {
        this.f485a = i;
        this.f486b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f485a) {
            case 0:
                ((TextInputLayout) this.f486b).f1851v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0101l c0101l = (C0101l) this.f486b;
                c0101l.f2174c.setAlpha(floatValue);
                c0101l.d.setAlpha(floatValue);
                c0101l.f2187s.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                I0.g gVar = ((BottomSheetBehavior) this.f486b).i;
                if (gVar != null) {
                    I0.f fVar = gVar.f268a;
                    if (fVar.i != floatValue2) {
                        fVar.i = floatValue2;
                        gVar.f271e = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
