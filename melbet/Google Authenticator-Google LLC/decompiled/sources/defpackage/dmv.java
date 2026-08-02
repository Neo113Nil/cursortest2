package defpackage;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.google.android.libraries.material.speeddial.FloatingSpeedDialView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dmv {
    private static final int[] a = {R.attr.state_expanded};
    private static final int[] b = {-16842920};

    public static void a(FloatingActionButton floatingActionButton, FloatingSpeedDialView floatingSpeedDialView, View view, boolean z) {
        floatingActionButton.setImageState(z ? a : b, true);
        ArrayList arrayList = new ArrayList();
        if (z) {
            floatingSpeedDialView.setVisibility(0);
        }
        arrayList.add(floatingSpeedDialView.b(z));
        if (view != null) {
            if (z) {
                view.setAlpha(0.0f);
                view.setVisibility(0);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, true != z ? 1.0f : 0.0f, true == z ? 1.0f : 0.0f);
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(dmk.c);
            ofFloat.addListener(new dmt(z, view));
            arrayList.add(ofFloat);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        fhq.h(animatorSet, arrayList);
        int i = yq.a;
        if (!floatingSpeedDialView.isLaidOut()) {
            if (!animatorSet.isStarted()) {
                animatorSet.start();
            }
            animatorSet.end();
        } else {
            if (!floatingSpeedDialView.isLayoutRequested()) {
                animatorSet.start();
                return;
            }
            dnp dnpVar = new dnp(floatingSpeedDialView, animatorSet, 1);
            floatingSpeedDialView.getViewTreeObserver().addOnPreDrawListener(dnpVar);
            animatorSet.addListener(new dmu(floatingSpeedDialView, dnpVar));
        }
    }
}
