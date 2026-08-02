package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import com.google.android.libraries.material.speeddial.expandable.ExpandableFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dnv extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ ExpandableFloatingActionButton d;

    public dnv(ExpandableFloatingActionButton expandableFloatingActionButton, boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = expandableFloatingActionButton;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d.b(ColorStateList.valueOf(this.a ? this.b : this.c));
    }
}
