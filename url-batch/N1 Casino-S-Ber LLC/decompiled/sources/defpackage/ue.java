package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ue extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ k30 d;
    public final /* synthetic */ xe e;

    public ue(ViewGroup viewGroup, View view, boolean z, k30 k30Var, xe xeVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = k30Var;
        this.e = xeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        k30 k30Var = this.d;
        if (z) {
            d30.a(view, k30Var.a);
        }
        this.e.d();
        if (bl.G(2)) {
            Log.v("FragmentManager", "Animator from operation " + k30Var + " has ended.");
        }
    }
}
