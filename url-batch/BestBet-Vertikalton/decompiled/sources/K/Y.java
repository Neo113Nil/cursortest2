package K;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class Y implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f589a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f590b;

    public /* synthetic */ Y(A0.c cVar, View view) {
        this.f590b = cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f589a) {
            case 0:
                ((View) ((g.K) ((A0.c) this.f590b).f6b).f2619g.getParent()).invalidate();
                break;
            default:
                U0.k kVar = (U0.k) this.f590b;
                kVar.getClass();
                kVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ Y(U0.k kVar) {
        this.f590b = kVar;
    }
}
