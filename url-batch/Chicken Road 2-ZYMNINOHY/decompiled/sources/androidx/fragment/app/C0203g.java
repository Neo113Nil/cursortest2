package androidx.fragment.app;

import E.AbstractC0005f;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f4869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4871c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B0 f4872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0204h f4873e;

    public C0203g(ViewGroup viewGroup, View view, boolean z, B0 b02, C0204h c0204h) {
        this.f4869a = viewGroup;
        this.f4870b = view;
        this.f4871c = z;
        this.f4872d = b02;
        this.f4873e = c0204h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        kotlin.jvm.internal.i.e(anim, "anim");
        ViewGroup viewGroup = this.f4869a;
        View viewToAnimate = this.f4870b;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z = this.f4871c;
        B0 b02 = this.f4872d;
        if (z) {
            int i4 = b02.f4723a;
            kotlin.jvm.internal.i.d(viewToAnimate, "viewToAnimate");
            AbstractC0005f.a(i4, viewToAnimate, viewGroup);
        }
        C0204h c0204h = this.f4873e;
        c0204h.f4874c.f4893a.c(c0204h);
        if (f0.J(2)) {
            Log.v("FragmentManager", "Animator from operation " + b02 + " has ended.");
        }
    }
}
