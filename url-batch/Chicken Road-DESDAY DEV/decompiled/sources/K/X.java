package K;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class X implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f374a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f375b;

    public /* synthetic */ X(C.g gVar, View view) {
        this.f375b = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f374a) {
            case 0:
                ((View) ((g.K) ((C.g) this.f375b).f66b).d.getParent()).invalidate();
                break;
            default:
                L0.l lVar = (L0.l) this.f375b;
                lVar.getClass();
                lVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ X(L0.l lVar) {
        this.f375b = lVar;
    }
}
