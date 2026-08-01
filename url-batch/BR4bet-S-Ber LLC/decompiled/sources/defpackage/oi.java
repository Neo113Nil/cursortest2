package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class oi implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oi(pw pwVar, View view) {
        this.a = 2;
        this.b = pwVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((si) obj).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                sv svVar = (sv) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                svVar.k.setAlpha((int) (255.0f * floatValue));
                svVar.y = floatValue;
                break;
            default:
                ((View) ((xd0) ((pw) obj).f).d.getParent()).invalidate();
                break;
        }
    }

    public /* synthetic */ oi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
