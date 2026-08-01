package g1;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class w implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1812b;

    public /* synthetic */ w(int i, Object obj) {
        this.f1811a = i;
        this.f1812b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1811a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                x xVar = (x) this.f1812b;
                xVar.f1822c.setAlpha(floatValue);
                xVar.d.setAlpha(floatValue);
                xVar.f1835s.invalidate();
                break;
            case 1:
                ((TextInputLayout) this.f1812b).B0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o2.j jVar = ((BottomSheetBehavior) this.f1812b).f945j;
                if (jVar != null) {
                    jVar.s(floatValue2);
                    break;
                }
                break;
        }
    }
}
