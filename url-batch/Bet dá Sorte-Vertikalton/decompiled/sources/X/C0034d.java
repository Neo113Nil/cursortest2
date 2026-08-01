package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f995b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f996c;
    public final /* synthetic */ U d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0036f f997e;

    public C0034d(ViewGroup viewGroup, View view, boolean z2, U u2, C0036f c0036f) {
        this.f994a = viewGroup;
        this.f995b = view;
        this.f996c = z2;
        this.d = u2;
        this.f997e = c0036f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f994a;
        View view = this.f995b;
        viewGroup.endViewTransition(view);
        U u2 = this.d;
        if (this.f996c) {
            V.a(view, u2.f960a);
        }
        this.f997e.d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + u2 + " has ended.");
        }
    }
}
