package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewTreeObserver;
import com.google.android.libraries.material.speeddial.expandable.ExpandableFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dnw extends AnimatorListenerAdapter {
    final /* synthetic */ ViewTreeObserver.OnPreDrawListener a;
    final /* synthetic */ ExpandableFloatingActionButton b;

    public dnw(ExpandableFloatingActionButton expandableFloatingActionButton, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.a = onPreDrawListener;
        this.b = expandableFloatingActionButton;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.getViewTreeObserver().removeOnPreDrawListener(this.a);
    }
}
