package k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1204b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13971b;

    public /* synthetic */ C1204b(int i4, Object obj) {
        this.f13970a = i4;
        this.f13971b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f13970a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f13971b;
                actionBarOverlayLayout.f4360t = null;
                actionBarOverlayLayout.f4352j = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13970a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f13971b;
                actionBarOverlayLayout.f4360t = null;
                actionBarOverlayLayout.f4352j = false;
                break;
            default:
                ((p1.q) this.f13971b).n();
                animator.removeListener(this);
                break;
        }
    }
}
