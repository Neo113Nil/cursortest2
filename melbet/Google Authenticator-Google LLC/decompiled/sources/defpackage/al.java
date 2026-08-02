package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class al extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ boolean c;
    final /* synthetic */ cm d;
    final /* synthetic */ am e;

    public al(ViewGroup viewGroup, View view, boolean z, cm cmVar, am amVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = cmVar;
        this.e = amVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        View view = this.b;
        ViewGroup viewGroup = this.a;
        viewGroup.endViewTransition(view);
        if (this.c || this.d.h == 3) {
            int i = this.d.h;
            view.getClass();
            a.L(i, view, viewGroup);
        }
        am amVar = this.e;
        amVar.a.a.f(amVar);
        if (by.U(2)) {
            Objects.toString(this.d);
        }
    }
}
