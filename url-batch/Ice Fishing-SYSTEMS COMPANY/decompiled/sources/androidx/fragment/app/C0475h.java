package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0475h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0477j f5094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f5095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5096c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f5097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0473f f5098e;

    public C0475h(C0477j c0477j, View view, boolean z8, a0 a0Var, C0473f c0473f) {
        this.f5094a = c0477j;
        this.f5095b = view;
        this.f5096c = z8;
        this.f5097d = a0Var;
        this.f5098e = c0473f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        kotlin.jvm.internal.h.e(anim, "anim");
        ViewGroup viewGroup = this.f5094a.f5103a;
        View viewToAnimate = this.f5095b;
        viewGroup.endViewTransition(viewToAnimate);
        a0 a0Var = this.f5097d;
        if (this.f5096c) {
            int i = a0Var.f5058a;
            kotlin.jvm.internal.h.d(viewToAnimate, "viewToAnimate");
            D.y.a(i, viewToAnimate);
        }
        this.f5098e.d();
        if (N.E(2)) {
            Log.v("FragmentManager", "Animator from operation " + a0Var + " has ended.");
        }
    }
}
