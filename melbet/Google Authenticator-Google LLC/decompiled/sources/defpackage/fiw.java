package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fiw implements fix {
    private final /* synthetic */ int a;

    @Override // defpackage.fix
    public final void a(ValueAnimator valueAnimator, View view) {
        int i = this.a;
        if (i == 0) {
            int i2 = fiy.a;
            Float f = (Float) valueAnimator.getAnimatedValue();
            view.setScaleX(f.floatValue());
            view.setScaleY(f.floatValue());
            return;
        }
        if (i == 1) {
            int i3 = fiy.a;
            view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else if (i != 2) {
            int i4 = fiy.a;
            view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            int i5 = fiy.a;
            view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
