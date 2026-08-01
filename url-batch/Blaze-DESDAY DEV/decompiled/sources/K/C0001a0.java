package K;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: K.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0001a0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f453a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f454b;

    public /* synthetic */ C0001a0(C.g gVar, View view) {
        this.f454b = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f453a) {
            case 0:
                ((View) ((g.K) ((C.g) this.f454b).f80b).d.getParent()).invalidate();
                break;
            default:
                M0.l lVar = (M0.l) this.f454b;
                lVar.getClass();
                lVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ C0001a0(M0.l lVar) {
        this.f454b = lVar;
    }
}
