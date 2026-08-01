package Z;

import G1.AbstractC0001b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: Z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1549c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U f1550d;
    public final /* synthetic */ C0042f e;

    public C0040d(ViewGroup viewGroup, View view, boolean z2, U u2, C0042f c0042f) {
        this.f1547a = viewGroup;
        this.f1548b = view;
        this.f1549c = z2;
        this.f1550d = u2;
        this.e = c0042f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1547a;
        View view = this.f1548b;
        viewGroup.endViewTransition(view);
        U u2 = this.f1550d;
        if (this.f1549c) {
            AbstractC0001b.a(view, u2.f1512a);
        }
        this.e.d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + u2 + " has ended.");
        }
    }
}
