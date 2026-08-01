package Y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: Y.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1042c;
    public final /* synthetic */ U d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0040f f1043e;

    public C0038d(ViewGroup viewGroup, View view, boolean z2, U u2, C0040f c0040f) {
        this.f1040a = viewGroup;
        this.f1041b = view;
        this.f1042c = z2;
        this.d = u2;
        this.f1043e = c0040f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1040a;
        View view = this.f1041b;
        viewGroup.endViewTransition(view);
        U u2 = this.d;
        if (this.f1042c) {
            V.a(view, u2.f1006a);
        }
        this.f1043e.d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + u2 + " has ended.");
        }
    }
}
