package l1;

import android.animation.ValueAnimator;

/* renamed from: l1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1258e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1259f f14206a;

    public C1258e(C1259f c1259f) {
        this.f14206a = c1259f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C1259f c1259f = this.f14206a;
        c1259f.f14210b.setAlpha(floatValue);
        c1259f.f14211c.setAlpha(floatValue);
        c1259f.n.invalidate();
    }
}
