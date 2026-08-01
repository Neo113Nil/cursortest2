package K;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: K.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0005c0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f429a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f430b;

    public /* synthetic */ C0005c0(B0.d dVar, View view) {
        this.f430b = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f429a) {
            case 0:
                ((View) ((g.O) ((B0.d) this.f430b).f66b).f2526d.getParent()).invalidate();
                break;
            default:
                K0.l lVar = (K0.l) this.f430b;
                lVar.getClass();
                lVar.f596d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ C0005c0(K0.l lVar) {
        this.f430b = lVar;
    }
}
