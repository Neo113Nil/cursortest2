package P0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import f0.C0098l;

/* loaded from: classes.dex */
public final class B implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f586b;

    public /* synthetic */ B(int i, Object obj) {
        this.f585a = i;
        this.f586b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f585a) {
            case 0:
                ((TextInputLayout) this.f586b).f1947v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0098l c0098l = (C0098l) this.f586b;
                c0098l.f2217c.setAlpha(floatValue);
                c0098l.d.setAlpha(floatValue);
                c0098l.f2230s.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                M0.g gVar = ((BottomSheetBehavior) this.f586b).i;
                if (gVar != null) {
                    M0.f fVar = gVar.f495a;
                    if (fVar.i != floatValue2) {
                        fVar.i = floatValue2;
                        gVar.f498e = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
