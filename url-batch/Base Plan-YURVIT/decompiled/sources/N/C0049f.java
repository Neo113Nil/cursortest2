package N;

import android.animation.ValueAnimator;

/* renamed from: N.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0050g f716a;

    public C0049f(C0050g c0050g) {
        this.f716a = c0050g;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0050g c0050g = this.f716a;
        c0050g.f720b.setAlpha(floatValue);
        c0050g.f721c.setAlpha(floatValue);
        c0050g.f732n.invalidate();
    }
}
