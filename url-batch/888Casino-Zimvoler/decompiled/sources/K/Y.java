package K;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class Y implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f386a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f387b;

    public /* synthetic */ Y(B0.d dVar, View view) {
        this.f387b = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f386a) {
            case 0:
                ((View) ((g.K) ((B0.d) this.f387b).f59b).d.getParent()).invalidate();
                break;
            default:
                K0.l lVar = (K0.l) this.f387b;
                lVar.getClass();
                lVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ Y(K0.l lVar) {
        this.f387b = lVar;
    }
}
