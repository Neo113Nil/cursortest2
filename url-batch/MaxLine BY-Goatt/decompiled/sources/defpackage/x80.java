package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x80 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ bo2 d;
    public final /* synthetic */ a90 e;

    public x80(ViewGroup viewGroup, View view, boolean z, bo2 bo2Var, a90 a90Var) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = bo2Var;
        this.e = a90Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        bo2 bo2Var = this.d;
        if (z) {
            in1.a(view, bo2Var.a);
        }
        this.e.d();
        if (as0.G(2)) {
            Log.v("FragmentManager", "Animator from operation " + bo2Var + " has ended.");
        }
    }
}
