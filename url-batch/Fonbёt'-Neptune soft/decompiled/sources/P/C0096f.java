package P;

import android.animation.ValueAnimator;

/* renamed from: P.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0097g f893a;

    public C0096f(C0097g c0097g) {
        this.f893a = c0097g;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0097g c0097g = this.f893a;
        c0097g.f897b.setAlpha(floatValue);
        c0097g.f898c.setAlpha(floatValue);
        c0097g.f909n.invalidate();
    }
}
