package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jr extends AnimatorListenerAdapter {
    final /* synthetic */ js a;
    private boolean b = false;

    public jr(js jsVar) {
        this.a = jsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b) {
            this.b = false;
            return;
        }
        js jsVar = this.a;
        if (((Float) jsVar.p.getAnimatedValue()).floatValue() == 0.0f) {
            jsVar.q = 0;
            jsVar.f(0);
        } else {
            jsVar.q = 2;
            jsVar.e();
        }
    }
}
