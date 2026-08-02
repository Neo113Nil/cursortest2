package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class flq extends AnimatorListenerAdapter {
    final /* synthetic */ flt a;

    public flq(flt fltVar) {
        this.a = fltVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        flt fltVar = this.a;
        List list = fltVar.k;
        if (list == null || fltVar.l) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((aqc) it.next()).c(fltVar);
        }
    }
}
