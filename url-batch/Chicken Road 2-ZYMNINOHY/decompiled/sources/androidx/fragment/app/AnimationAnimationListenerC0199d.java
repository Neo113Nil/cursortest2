package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0199d implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B0 f4822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f4823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f4824c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0201e f4825d;

    public AnimationAnimationListenerC0199d(B0 b02, ViewGroup viewGroup, View view, C0201e c0201e) {
        this.f4822a = b02;
        this.f4823b = viewGroup;
        this.f4824c = view;
        this.f4825d = c0201e;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        kotlin.jvm.internal.i.e(animation, "animation");
        ViewGroup viewGroup = this.f4823b;
        viewGroup.post(new Q1.a(viewGroup, this.f4824c, this.f4825d, 3));
        if (f0.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f4822a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        kotlin.jvm.internal.i.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        kotlin.jvm.internal.i.e(animation, "animation");
        if (f0.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f4822a + " has reached onAnimationStart.");
        }
    }
}
