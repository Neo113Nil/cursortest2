package v2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f3732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3734c;

    public b(boolean z4, View view, View view2) {
        this.f3732a = z4;
        this.f3733b = view;
        this.f3734c = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f3732a) {
            return;
        }
        this.f3733b.setVisibility(4);
        View view = this.f3734c;
        view.setAlpha(1.0f);
        view.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f3732a) {
            this.f3733b.setVisibility(0);
            View view = this.f3734c;
            view.setAlpha(0.0f);
            view.setVisibility(4);
        }
    }
}
