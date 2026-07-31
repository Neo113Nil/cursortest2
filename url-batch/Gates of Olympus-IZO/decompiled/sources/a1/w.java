package a1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class w extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0162D f3569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3570b;

    public w(C0162D c0162d, View view) {
        this.f3569a = c0162d;
        this.f3570b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0162D c0162d = this.f3569a;
        c0162d.f3511a.c(1.0f);
        z.d(c0162d, this.f3570b);
    }
}
