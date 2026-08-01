package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class zk implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zk(kz kzVar, View view) {
        this.a = 2;
        this.b = kzVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((dl) obj).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                v00 v00Var = (v00) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v00Var.k.setAlpha((int) (255.0f * floatValue));
                v00Var.y = floatValue;
                break;
            default:
                ((View) ((bo0) ((kz) obj).f).v.getParent()).invalidate();
                break;
        }
    }

    public /* synthetic */ zk(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
