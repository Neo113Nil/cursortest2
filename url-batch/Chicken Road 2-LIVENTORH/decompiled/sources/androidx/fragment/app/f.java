package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f423b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f424c;
    public final /* synthetic */ v0 d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f425e;

    public f(ViewGroup viewGroup, View view, boolean z3, v0 v0Var, i iVar) {
        this.f422a = viewGroup;
        this.f423b = view;
        this.f424c = z3;
        this.d = v0Var;
        this.f425e = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f422a;
        View view = this.f423b;
        viewGroup.endViewTransition(view);
        boolean z3 = this.f424c;
        v0 v0Var = this.d;
        if (z3) {
            w0.a(view, v0Var.f560a);
        }
        this.f425e.d();
        if (k0.E(2)) {
            Log.v("FragmentManager", "Animator from operation " + v0Var + " has ended.");
        }
    }
}
