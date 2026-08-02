package U;

import android.animation.ValueAnimator;

/* renamed from: U.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0070f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0071g f1402a;

    public C0070f(C0071g c0071g) {
        this.f1402a = c0071g;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0071g c0071g = this.f1402a;
        c0071g.f1406b.setAlpha(floatValue);
        c0071g.f1407c.setAlpha(floatValue);
        c0071g.f1417n.invalidate();
    }
}
