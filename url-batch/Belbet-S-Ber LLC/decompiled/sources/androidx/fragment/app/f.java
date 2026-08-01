package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f536b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f537c;
    public final /* synthetic */ v0 d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f538e;

    public f(ViewGroup viewGroup, View view, boolean z4, v0 v0Var, i iVar) {
        this.f535a = viewGroup;
        this.f536b = view;
        this.f537c = z4;
        this.d = v0Var;
        this.f538e = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f535a;
        View view = this.f536b;
        viewGroup.endViewTransition(view);
        boolean z4 = this.f537c;
        v0 v0Var = this.d;
        if (z4) {
            a4.b.a(view, v0Var.f667a);
        }
        this.f538e.d();
        if (k0.H(2)) {
            Log.v("FragmentManager", "Animator from operation " + v0Var + " has ended.");
        }
    }
}
