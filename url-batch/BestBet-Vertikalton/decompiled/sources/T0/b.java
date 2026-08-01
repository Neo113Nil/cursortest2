package T0;

import a0.C0057a;
import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f1029b;

    public /* synthetic */ b(i iVar, int i, byte b2) {
        this.f1028a = i;
        this.f1029b = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        i iVar = this.f1029b;
        switch (this.f1028a) {
            case 0:
                iVar.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.i.setScaleX(floatValue);
                iVar.i.setScaleY(floatValue);
                break;
            case 2:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C0057a c0057a = i.f1043u;
                iVar.i.setTranslationY(intValue);
                break;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C0057a c0057a2 = i.f1043u;
                iVar.i.setTranslationY(intValue2);
                break;
        }
    }

    public b(i iVar, int i) {
        this.f1028a = 2;
        this.f1029b = iVar;
    }
}
