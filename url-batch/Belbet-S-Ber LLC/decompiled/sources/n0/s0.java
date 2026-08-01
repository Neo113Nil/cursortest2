package n0;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2831b;

    public /* synthetic */ s0(int i, Object obj) {
        this.f2830a = i;
        this.f2831b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2830a) {
            case 0:
                ((View) ((g.k0) ((a0.a) this.f2831b).f79g).f1536e.getParent()).invalidate();
                break;
            case 1:
                s2.k kVar = (s2.k) this.f2831b;
                kVar.getClass();
                kVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                x1.c cVar = (x1.c) this.f2831b;
                cVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cVar.f3864k.setAlpha((int) (255.0f * floatValue));
                cVar.f3878y = floatValue;
                break;
        }
    }

    public /* synthetic */ s0(a0.a aVar, View view) {
        this.f2830a = 0;
        this.f2831b = aVar;
    }
}
