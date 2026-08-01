package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1020a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1021b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1022c;
    public final /* synthetic */ U d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0037f f1023e;

    public C0035d(ViewGroup viewGroup, View view, boolean z2, U u2, C0037f c0037f) {
        this.f1020a = viewGroup;
        this.f1021b = view;
        this.f1022c = z2;
        this.d = u2;
        this.f1023e = c0037f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1020a;
        View view = this.f1021b;
        viewGroup.endViewTransition(view);
        U u2 = this.d;
        if (this.f1022c) {
            T0.c.a(view, u2.f986a);
        }
        this.f1023e.d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + u2 + " has ended.");
        }
    }
}
