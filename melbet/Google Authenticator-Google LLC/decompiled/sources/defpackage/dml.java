package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dml extends AnimatorListenerAdapter {
    final /* synthetic */ dmm a;

    public dml(dmm dmmVar) {
        this.a = dmmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dmm dmmVar = this.a;
        dmmVar.b.setVisibility(4);
        View view = dmmVar.c;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        dmm dmmVar = this.a;
        dmmVar.b.setVisibility(0);
        View view = dmmVar.c;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = dmmVar.c;
        if (view2 != null) {
            view2.setClickable(false);
        }
    }
}
