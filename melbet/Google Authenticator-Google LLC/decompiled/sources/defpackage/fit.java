package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fit implements ValueAnimator.AnimatorUpdateListener {
    private final View a;
    private final View b;
    private final float[] c = new float[2];

    public fit(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] fArr = this.c;
        fhr.h(floatValue, fArr);
        View view = this.a;
        if (view != null) {
            view.setAlpha(fArr[0]);
        }
        View view2 = this.b;
        if (view2 != null) {
            view2.setAlpha(fArr[1]);
        }
    }
}
