package androidx.swiperefreshlayout.widget;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f4027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f4028b;

    public b(e eVar, d dVar) {
        this.f4028b = eVar;
        this.f4027a = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d dVar = this.f4027a;
        e.d(floatValue, dVar);
        e eVar = this.f4028b;
        eVar.a(floatValue, dVar, false);
        eVar.invalidateSelf();
    }
}
