package b1;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f844b;

    public /* synthetic */ m(int i4, Object obj) {
        this.f843a = i4;
        this.f844b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f843a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                n nVar = (n) this.f844b;
                nVar.c.setAlpha(floatValue);
                nVar.f853d.setAlpha(floatValue);
                nVar.f866s.invalidate();
                break;
            case 1:
                ((TextInputLayout) this.f844b).B0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g2.j jVar = ((BottomSheetBehavior) this.f844b).f1207j;
                if (jVar != null) {
                    g2.h hVar = jVar.g;
                    if (hVar.f1848i != floatValue2) {
                        hVar.f1848i = floatValue2;
                        jVar.f1860k = true;
                        jVar.f1861l = true;
                        jVar.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
