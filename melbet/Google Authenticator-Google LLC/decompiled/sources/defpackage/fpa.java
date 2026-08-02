package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fpa implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fpa(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        if (i == 0) {
            ((fpk) this.a).j.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            return;
        }
        if (i == 1) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            fob fobVar = ((BottomSheetBehavior) this.a).e;
            if (fobVar != null) {
                fobVar.N(floatValue);
                return;
            }
            return;
        }
        if (i == 2) {
            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            fpj fpjVar = ((fpk) this.a).j;
            fpjVar.setScaleX(floatValue2);
            fpjVar.setScaleY(floatValue2);
            return;
        }
        if (i == 3) {
            ((fpk) this.a).j.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (i == 4) {
            ((fpk) this.a).j.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (i != 5) {
            ((TextInputLayout) this.a).q.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            ((TabLayout) this.a).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }
}
