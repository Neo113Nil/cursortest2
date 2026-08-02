package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ffj extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ HideBottomViewOnScrollBehavior b;

    public ffj(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, View view) {
        this.a = view;
        this.b = hideBottomViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = this.b;
        hideBottomViewOnScrollBehavior.d = null;
        if (hideBottomViewOnScrollBehavior.c == 1) {
            View view = this.a;
            if (view.getVisibility() == 0) {
                view.setVisibility(4);
            }
        }
    }
}
