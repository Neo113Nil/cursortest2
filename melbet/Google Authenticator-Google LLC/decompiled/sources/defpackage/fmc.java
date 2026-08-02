package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fmc extends AnimatorListenerAdapter {
    final /* synthetic */ fmf a;

    public fmc(fmf fmfVar) {
        this.a = fmfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        fmf fmfVar = this.a;
        fmfVar.e = (fmfVar.e + 1) % fmfVar.d.e.length;
        fmfVar.f = true;
    }
}
