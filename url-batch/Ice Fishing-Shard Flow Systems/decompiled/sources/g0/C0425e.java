package g0;

import android.animation.ValueAnimator;

/* renamed from: g0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0425e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0426f f4906a;

    public C0425e(C0426f c0426f) {
        this.f4906a = c0426f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0426f c0426f = this.f4906a;
        c0426f.f4910b.setAlpha(floatValue);
        c0426f.f4911c.setAlpha(floatValue);
        c0426f.f4921n.invalidate();
    }
}
