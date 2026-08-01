package j2;

import android.animation.ValueAnimator;
import android.view.View;
import f.l0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2313a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2314b;

    public /* synthetic */ i(a2.e eVar, View view) {
        this.f2314b = eVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2313a) {
            case 0:
                m mVar = (m) this.f2314b;
                mVar.getClass();
                mVar.f2357d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((View) ((l0) ((a2.e) this.f2314b).g).f1618i.getParent()).invalidate();
                break;
        }
    }

    public /* synthetic */ i(m mVar) {
        this.f2314b = mVar;
    }
}
