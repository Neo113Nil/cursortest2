package Z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: Z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1120c;
    public final /* synthetic */ U d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0039f f1121e;

    public C0037d(ViewGroup viewGroup, View view, boolean z2, U u2, C0039f c0039f) {
        this.f1118a = viewGroup;
        this.f1119b = view;
        this.f1120c = z2;
        this.d = u2;
        this.f1121e = c0039f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1118a;
        View view = this.f1119b;
        viewGroup.endViewTransition(view);
        U u2 = this.d;
        if (this.f1120c) {
            V.a(view, u2.f1081a);
        }
        this.f1121e.d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + u2 + " has ended.");
        }
    }
}
