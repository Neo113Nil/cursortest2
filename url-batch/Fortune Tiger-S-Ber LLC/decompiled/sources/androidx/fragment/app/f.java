package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f419b;
    public final /* synthetic */ boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v0 f420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f421e;

    public f(ViewGroup viewGroup, View view, boolean z3, v0 v0Var, i iVar) {
        this.f418a = viewGroup;
        this.f419b = view;
        this.c = z3;
        this.f420d = v0Var;
        this.f421e = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f418a;
        View view = this.f419b;
        viewGroup.endViewTransition(view);
        boolean z3 = this.c;
        v0 v0Var = this.f420d;
        if (z3) {
            w0.a(view, v0Var.f542a);
        }
        this.f421e.d();
        if (k0.G(2)) {
            Log.v("FragmentManager", "Animator from operation " + v0Var + " has ended.");
        }
    }
}
