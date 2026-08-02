package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.libraries.material.speeddial.expandable.ExpandableScrimBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class doa extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ ExpandableScrimBehavior b;

    public doa(ExpandableScrimBehavior expandableScrimBehavior, View view) {
        this.a = view;
        this.b = expandableScrimBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b.a) {
            return;
        }
        this.a.setVisibility(8);
    }
}
