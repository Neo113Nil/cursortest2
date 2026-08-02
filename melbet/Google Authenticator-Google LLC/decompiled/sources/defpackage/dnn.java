package defpackage;

import android.animation.Animator;
import android.view.ViewTreeObserver;
import com.google.android.libraries.material.speeddial.FloatingSpeedDialView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dnn implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ViewTreeObserver a;
    final /* synthetic */ boolean b;
    final /* synthetic */ FloatingSpeedDialView c;

    public dnn(FloatingSpeedDialView floatingSpeedDialView, ViewTreeObserver viewTreeObserver, boolean z) {
        this.a = viewTreeObserver;
        this.b = z;
        this.c = floatingSpeedDialView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.removeOnPreDrawListener(this);
        FloatingSpeedDialView floatingSpeedDialView = this.c;
        Animator b = floatingSpeedDialView.b(this.b);
        int i = yq.a;
        if (floatingSpeedDialView.isLaidOut()) {
            Animator animator = floatingSpeedDialView.d;
            if (animator != null && animator.isStarted()) {
                floatingSpeedDialView.d.cancel();
            }
            floatingSpeedDialView.d = b;
            floatingSpeedDialView.d.addListener(new dno(floatingSpeedDialView));
            if (floatingSpeedDialView.isLayoutRequested()) {
                dnp dnpVar = new dnp(floatingSpeedDialView, b, 0, null);
                floatingSpeedDialView.getViewTreeObserver().addOnPreDrawListener(dnpVar);
                b.addListener(new dnq(floatingSpeedDialView, dnpVar));
            } else {
                b.start();
            }
        } else {
            if (!b.isStarted()) {
                b.start();
            }
            b.end();
        }
        return false;
    }
}
