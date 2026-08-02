package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ffq extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ HideViewOnScrollBehavior b;

    public ffq(HideViewOnScrollBehavior hideViewOnScrollBehavior, View view) {
        this.a = view;
        this.b = hideViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        HideViewOnScrollBehavior hideViewOnScrollBehavior = this.b;
        hideViewOnScrollBehavior.d = null;
        if (hideViewOnScrollBehavior.c == 1) {
            View view = this.a;
            if (view.getVisibility() == 0) {
                view.setVisibility(4);
            }
        }
    }
}
