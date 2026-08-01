package Y;

import G1.AbstractC0001b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: Y.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1401c;
    public final /* synthetic */ U d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0039f f1402e;

    public C0037d(ViewGroup viewGroup, View view, boolean z2, U u2, C0039f c0039f) {
        this.f1399a = viewGroup;
        this.f1400b = view;
        this.f1401c = z2;
        this.d = u2;
        this.f1402e = c0039f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1399a;
        View view = this.f1400b;
        viewGroup.endViewTransition(view);
        U u2 = this.d;
        if (this.f1401c) {
            AbstractC0001b.a(view, u2.f1365a);
        }
        this.f1402e.d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + u2 + " has ended.");
        }
    }
}
