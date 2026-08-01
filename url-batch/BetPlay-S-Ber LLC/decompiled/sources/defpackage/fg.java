package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class fg implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fg(tx txVar, View view) {
        this.a = 2;
        this.b = txVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((jg) obj).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                ft ftVar = (ft) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ftVar.k.setAlpha((int) (255.0f * floatValue));
                ftVar.y = floatValue;
                break;
            default:
                ((View) ((xa0) ((tx) obj).f).d.getParent()).invalidate();
                break;
        }
    }

    public /* synthetic */ fg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
