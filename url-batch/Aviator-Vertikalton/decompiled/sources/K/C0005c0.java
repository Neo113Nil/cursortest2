package K;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: K.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0005c0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f428a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f429b;

    public /* synthetic */ C0005c0(B0.d dVar, View view) {
        this.f429b = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f428a) {
            case 0:
                ((View) ((g.O) ((B0.d) this.f429b).f67b).f2522d.getParent()).invalidate();
                break;
            default:
                K0.l lVar = (K0.l) this.f429b;
                lVar.getClass();
                lVar.f595d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ C0005c0(K0.l lVar) {
        this.f429b = lVar;
    }
}
