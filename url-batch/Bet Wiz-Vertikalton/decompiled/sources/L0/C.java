package L0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import f0.C0102l;

/* loaded from: classes.dex */
public final class C implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f550b;

    public /* synthetic */ C(int i, Object obj) {
        this.f549a = i;
        this.f550b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f549a) {
            case 0:
                ((TextInputLayout) this.f550b).f1920v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0102l c0102l = (C0102l) this.f550b;
                c0102l.f2242c.setAlpha(floatValue);
                c0102l.d.setAlpha(floatValue);
                c0102l.f2255s.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                I0.g gVar = ((BottomSheetBehavior) this.f550b).i;
                if (gVar != null) {
                    I0.f fVar = gVar.f328a;
                    if (fVar.i != floatValue2) {
                        fVar.i = floatValue2;
                        gVar.f331e = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
