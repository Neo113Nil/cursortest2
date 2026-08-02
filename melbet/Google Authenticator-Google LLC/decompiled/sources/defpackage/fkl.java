package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fkl extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    public fkl(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
