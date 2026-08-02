package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.focus.FocusRingDrawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fii extends AnimatorListenerAdapter {
    final /* synthetic */ FocusRingDrawable a;

    public fii(FocusRingDrawable focusRingDrawable) {
        this.a = focusRingDrawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        FocusRingDrawable focusRingDrawable = this.a;
        focusRingDrawable.b = 1.0f;
        focusRingDrawable.invalidateSelf();
    }
}
