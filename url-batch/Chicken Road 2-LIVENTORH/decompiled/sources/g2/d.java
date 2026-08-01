package g2;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f1710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f1711b;

    public d(f fVar, float f2) {
        this.f1711b = fVar;
        this.f1710a = f2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1711b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f1710a);
    }
}
