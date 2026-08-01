package e2;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class l implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1233b;

    public /* synthetic */ l(int i, Object obj) {
        this.f1232a = i;
        this.f1233b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1232a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) this.f1233b;
                textView.setScaleX(floatValue);
                textView.setScaleY(floatValue);
                break;
            case 1:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                f1.m mVar = (f1.m) this.f1233b;
                mVar.f1422c.setAlpha(floatValue2);
                mVar.d.setAlpha(floatValue2);
                mVar.f1436s.invalidate();
                break;
            case 2:
                ((TextInputLayout) this.f1233b).B0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2.j jVar = ((BottomSheetBehavior) this.f1233b).i;
                if (jVar != null) {
                    jVar.r(floatValue3);
                    break;
                }
                break;
        }
    }
}
