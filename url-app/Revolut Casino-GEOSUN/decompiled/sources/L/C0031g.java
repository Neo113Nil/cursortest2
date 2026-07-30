package L;

import android.animation.ValueAnimator;

/* renamed from: L.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0032h f538a;

    public C0031g(C0032h c0032h) {
        this.f538a = c0032h;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0032h c0032h = this.f538a;
        c0032h.f542b.setAlpha(floatValue);
        c0032h.f543c.setAlpha(floatValue);
        c0032h.f554n.invalidate();
    }
}
