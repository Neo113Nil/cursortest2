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
    public final /* synthetic */ ViewGroup f1331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1332b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1333c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ X f1334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0049f f1335e;

    public C0047d(ViewGroup viewGroup, View view, boolean z2, X x2, C0049f c0049f) {
        this.f1331a = viewGroup;
        this.f1332b = view;
        this.f1333c = z2;
        this.f1334d = x2;
        this.f1335e = c0049f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1331a;
        View view = this.f1332b;
        viewGroup.endViewTransition(view);
        X x2 = this.f1334d;
        if (this.f1333c) {
            X0.e.a(view, x2.f1294a);
        }
        this.f1335e.d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + x2 + " has ended.");
        }
    }
}
