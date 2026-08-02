package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fiy implements ValueAnimator.AnimatorUpdateListener {
    public static final /* synthetic */ int a = 0;
    private final fix b;
    private final View[] c;

    public fiy(fix fixVar, View... viewArr) {
        this.b = fixVar;
        this.c = viewArr;
    }

    public static fiy a(View... viewArr) {
        return new fiy(new fiw(3), viewArr);
    }

    public static fiy b(View... viewArr) {
        return new fiy(new fiw(1), viewArr);
    }

    public static fiy c(View... viewArr) {
        return new fiy(new fiw(2), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 0;
        while (true) {
            View[] viewArr = this.c;
            if (i >= viewArr.length) {
                return;
            }
            this.b.a(valueAnimator, viewArr[i]);
            i++;
        }
    }
}
