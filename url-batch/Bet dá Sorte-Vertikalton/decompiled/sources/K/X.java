package K;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class X implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f356a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f357b;

    public /* synthetic */ X(C.h hVar, View view) {
        this.f357b = hVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f356a) {
            case 0:
                ((View) ((g.K) ((C.h) this.f357b).f150b).f2379f.getParent()).invalidate();
                break;
            default:
                P0.k kVar = (P0.k) this.f357b;
                kVar.getClass();
                kVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ X(P0.k kVar) {
        this.f357b = kVar;
    }
}
