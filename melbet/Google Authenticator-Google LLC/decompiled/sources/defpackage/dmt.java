package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dmt extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ View b;

    public dmt(boolean z, View view) {
        this.a = z;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        this.b.setVisibility(8);
    }
}
