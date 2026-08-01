package L;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: L.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0001a0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f503a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f504b;

    public /* synthetic */ C0001a0(D.g gVar, View view) {
        this.f504b = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f503a) {
            case 0:
                ((View) ((g.K) ((D.g) this.f504b).f122b).f2280h.getParent()).invalidate();
                break;
            default:
                N0.l lVar = (N0.l) this.f504b;
                lVar.getClass();
                lVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ C0001a0(N0.l lVar) {
        this.f504b = lVar;
    }
}
