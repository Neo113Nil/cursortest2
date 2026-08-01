package M;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class V implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f716a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f717b;

    public /* synthetic */ V(C1.d dVar, View view) {
        this.f717b = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f716a) {
            case 0:
                ((View) ((h.K) ((C1.d) this.f717b).f145b).f2751h.getParent()).invalidate();
                break;
            default:
                Q0.l lVar = (Q0.l) this.f717b;
                lVar.getClass();
                lVar.f1065d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ V(Q0.l lVar) {
        this.f717b = lVar;
    }
}
