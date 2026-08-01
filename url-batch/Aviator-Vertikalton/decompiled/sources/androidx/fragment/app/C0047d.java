package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0047d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1331b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1332c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ X f1333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0049f f1334e;

    public C0047d(ViewGroup viewGroup, View view, boolean z2, X x2, C0049f c0049f) {
        this.f1330a = viewGroup;
        this.f1331b = view;
        this.f1332c = z2;
        this.f1333d = x2;
        this.f1334e = c0049f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1330a;
        View view = this.f1331b;
        viewGroup.endViewTransition(view);
        X x2 = this.f1333d;
        if (this.f1332c) {
            X0.e.a(view, x2.f1293a);
        }
        this.f1334e.d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + x2 + " has ended.");
        }
    }
}
