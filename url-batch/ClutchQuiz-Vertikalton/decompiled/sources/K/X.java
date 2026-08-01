package K;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class X implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f370a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f371b;

    public /* synthetic */ X(A0.h hVar, View view) {
        this.f371b = hVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f370a) {
            case 0:
                ((View) ((g.J) ((A0.h) this.f371b).f30b).d.getParent()).invalidate();
                break;
            default:
                R0.k kVar = (R0.k) this.f371b;
                kVar.getClass();
                kVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ X(R0.k kVar) {
        this.f371b = kVar;
    }
}
