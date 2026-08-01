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
    public final /* synthetic */ ViewGroup f902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f903b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f904c;
    public final /* synthetic */ U d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0037f f905e;

    public C0035d(ViewGroup viewGroup, View view, boolean z2, U u2, C0037f c0037f) {
        this.f902a = viewGroup;
        this.f903b = view;
        this.f904c = z2;
        this.d = u2;
        this.f905e = c0037f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f902a;
        View view = this.f903b;
        viewGroup.endViewTransition(view);
        U u2 = this.d;
        if (this.f904c) {
            V.a(view, u2.f868a);
        }
        this.f905e.d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + u2 + " has ended.");
        }
    }
}
