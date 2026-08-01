package m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f6027a;

    public b(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f6027a = actionBarOverlayLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f6027a;
        actionBarOverlayLayout.H = null;
        actionBarOverlayLayout.f423w = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f6027a;
        actionBarOverlayLayout.H = null;
        actionBarOverlayLayout.f423w = false;
    }
}
