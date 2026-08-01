package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class ng implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ng(mr mrVar, View view) {
        this.a = 2;
        this.b = mrVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((rg) obj).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                rs rsVar = (rs) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rsVar.k.setAlpha((int) (255.0f * floatValue));
                rsVar.y = floatValue;
                break;
            default:
                ((View) ((qa0) ((mr) obj).f).v.getParent()).invalidate();
                break;
        }
    }

    public /* synthetic */ ng(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
