package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0218i f3736c;

    public C0217h(ViewGroup viewGroup, boolean z7, d0 d0Var, C0218i c0218i) {
        this.f3734a = viewGroup;
        this.f3735b = z7;
        this.f3736c = c0218i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        this.f3734a.endViewTransition(null);
        if (!this.f3735b) {
            throw null;
        }
        throw null;
    }
}
