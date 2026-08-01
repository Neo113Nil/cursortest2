package Q0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import h0.C0161k;

/* loaded from: classes.dex */
public final class B implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1000b;

    public /* synthetic */ B(int i, Object obj) {
        this.f999a = i;
        this.f1000b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f999a) {
            case 0:
                ((TextInputLayout) this.f1000b).f2546v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0161k c0161k = (C0161k) this.f1000b;
                c0161k.f3055c.setAlpha(floatValue);
                c0161k.f3056d.setAlpha(floatValue);
                c0161k.f3068s.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                N0.g gVar = ((BottomSheetBehavior) this.f1000b).i;
                if (gVar != null) {
                    N0.f fVar = gVar.f900a;
                    if (fVar.i != floatValue2) {
                        fVar.i = floatValue2;
                        gVar.e = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
