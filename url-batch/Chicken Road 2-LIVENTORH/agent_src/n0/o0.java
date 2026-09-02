package n0;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2768b;

    public /* synthetic */ o0(int i, Object obj) {
        this.f2767a = i;
        this.f2768b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2767a) {
            case 0:
                ((View) ((g.m0) ((a0.a) this.f2768b).f81g).f1663q.getParent()).invalidate();
                break;
            case 1:
                o2.k kVar = (o2.k) this.f2768b;
                kVar.getClass();
                kVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                w1.c cVar = (w1.c) this.f2768b;
                cVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cVar.f3586j.setAlpha((int) (255.0f * floatValue));
                cVar.f3600x = floatValue;
                break;
        }
    }

    public /* synthetic */ o0(a0.a aVar, View view) {
        this.f2767a = 0;
        this.f2768b = aVar;
    }
}
