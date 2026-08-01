package Z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: Z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1130b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1131c;
    public final /* synthetic */ U d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0036f f1132e;

    public C0034d(ViewGroup viewGroup, View view, boolean z2, U u2, C0036f c0036f) {
        this.f1129a = viewGroup;
        this.f1130b = view;
        this.f1131c = z2;
        this.d = u2;
        this.f1132e = c0036f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1129a;
        View view = this.f1130b;
        viewGroup.endViewTransition(view);
        U u2 = this.d;
        if (this.f1131c) {
            X0.a.a(view, u2.f1095a);
        }
        this.f1132e.d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + u2 + " has ended.");
        }
    }
}
