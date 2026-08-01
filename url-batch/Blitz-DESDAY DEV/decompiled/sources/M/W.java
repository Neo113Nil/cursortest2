package M;

import android.animation.ValueAnimator;
import android.view.View;
import x0.C0312c;

/* loaded from: classes.dex */
public final /* synthetic */ class W implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f519b;

    public /* synthetic */ W(int i, Object obj) {
        this.f518a = i;
        this.f519b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f518a) {
            case 0:
                ((View) ((g.K) ((E.g) this.f519b).f170b).d.getParent()).invalidate();
                break;
            case 1:
                O0.l lVar = (O0.l) this.f519b;
                lVar.getClass();
                lVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                C0312c c0312c = (C0312c) this.f519b;
                c0312c.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c0312c.f4157j.setAlpha((int) (255.0f * floatValue));
                c0312c.f4171x = floatValue;
                break;
        }
    }

    public /* synthetic */ W(E.g gVar, View view) {
        this.f518a = 0;
        this.f519b = gVar;
    }
}
