package N0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import h0.C0131m;

/* loaded from: classes.dex */
public final class C implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f633b;

    public /* synthetic */ C(int i, Object obj) {
        this.f632a = i;
        this.f633b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f632a) {
            case 0:
                ((TextInputLayout) this.f633b).f2051v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0131m c0131m = (C0131m) this.f633b;
                c0131m.f2562c.setAlpha(floatValue);
                c0131m.d.setAlpha(floatValue);
                c0131m.f2576s.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                K0.g gVar = ((BottomSheetBehavior) this.f633b).i;
                if (gVar != null) {
                    K0.f fVar = gVar.f397a;
                    if (fVar.i != floatValue2) {
                        fVar.i = floatValue2;
                        gVar.f400e = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
