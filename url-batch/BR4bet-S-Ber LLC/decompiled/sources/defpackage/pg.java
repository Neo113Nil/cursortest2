package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class pg extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ m60 d;
    public final /* synthetic */ sg e;

    public pg(ViewGroup viewGroup, View view, boolean z, m60 m60Var, sg sgVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = m60Var;
        this.e = sgVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        m60 m60Var = this.d;
        if (z) {
            f60.a(view, m60Var.a);
        }
        this.e.d();
        if (en.G(2)) {
            Log.v("FragmentManager", "Animator from operation " + m60Var + " has ended.");
        }
    }
}
