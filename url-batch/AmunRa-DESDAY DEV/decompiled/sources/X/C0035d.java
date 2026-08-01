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
    public final /* synthetic */ ViewGroup f951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f953c;
    public final /* synthetic */ U d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0037f f954e;

    public C0035d(ViewGroup viewGroup, View view, boolean z2, U u2, C0037f c0037f) {
        this.f951a = viewGroup;
        this.f952b = view;
        this.f953c = z2;
        this.d = u2;
        this.f954e = c0037f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f951a;
        View view = this.f952b;
        viewGroup.endViewTransition(view);
        U u2 = this.d;
        if (this.f953c) {
            V.a(view, u2.f917a);
        }
        this.f954e.d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + u2 + " has ended.");
        }
    }
}
