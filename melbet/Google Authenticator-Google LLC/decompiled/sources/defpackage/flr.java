package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class flr extends AnimatorListenerAdapter {
    final /* synthetic */ flt a;

    public flr(flt fltVar) {
        this.a = fltVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        flt fltVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        List list = fltVar.k;
        if (list == null || fltVar.l) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((aqc) it.next()).b(fltVar);
        }
    }
}
