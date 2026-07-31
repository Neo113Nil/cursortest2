package i;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: i.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2185a;

    public C0155b(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f2185a = actionBarOverlayLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2185a;
        actionBarOverlayLayout.f1247x = null;
        actionBarOverlayLayout.f1238n = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2185a;
        actionBarOverlayLayout.f1247x = null;
        actionBarOverlayLayout.f1238n = false;
    }
}
