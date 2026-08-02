package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aow extends apz {
    public aow(int i) {
        this.v = i;
    }

    private static float H(apm apmVar, float f) {
        Float f2;
        return (apmVar == null || (f2 = (Float) apmVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    private final Animator I(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        apq.c(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) apq.b, f2);
        aov aovVar = new aov(view);
        ofFloat.addListener(aovVar);
        i().x(aovVar);
        return ofFloat;
    }

    @Override // defpackage.apz, defpackage.ape
    public final void c(apm apmVar) {
        apz.G(apmVar);
        Float f = (Float) apmVar.b.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            f = apmVar.b.getVisibility() == 0 ? Float.valueOf(apq.a(apmVar.b)) : Float.valueOf(0.0f);
        }
        apmVar.a.put("android:fade:transitionAlpha", f);
    }

    @Override // defpackage.apz
    public final Animator e(View view, apm apmVar) {
        apr aprVar = apq.a;
        return I(view, H(apmVar, 0.0f), 1.0f);
    }

    @Override // defpackage.apz
    public final Animator f(View view, apm apmVar, apm apmVar2) {
        apr aprVar = apq.a;
        Animator I = I(view, H(apmVar, 1.0f), 0.0f);
        if (I == null) {
            apq.c(view, H(apmVar2, 1.0f));
        }
        return I;
    }
}
