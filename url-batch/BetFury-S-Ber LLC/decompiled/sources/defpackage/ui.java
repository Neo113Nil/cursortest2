package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ui extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qe0 d;
    public final /* synthetic */ xi e;

    public ui(ViewGroup viewGroup, View view, boolean z, qe0 qe0Var, xi xiVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = qe0Var;
        this.e = xiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        qe0 qe0Var = this.d;
        if (z) {
            qe0Var.a.applyState(view);
        }
        this.e.d();
        if (c.G(2)) {
            Log.v("FragmentManager", "Animator from operation " + qe0Var + " has ended.");
        }
    }
}
