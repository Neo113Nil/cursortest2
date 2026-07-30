package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;

/* renamed from: androidx.fragment.app.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0476i implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f5099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0477j f5100b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f5101c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0473f f5102d;

    public AnimationAnimationListenerC0476i(View view, C0473f c0473f, C0477j c0477j, a0 a0Var) {
        this.f5099a = a0Var;
        this.f5100b = c0477j;
        this.f5101c = view;
        this.f5102d = c0473f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        kotlin.jvm.internal.h.e(animation, "animation");
        C0477j c0477j = this.f5100b;
        c0477j.f5103a.post(new a7.b(c0477j, this.f5101c, this.f5102d, 4));
        if (N.E(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f5099a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        kotlin.jvm.internal.h.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        kotlin.jvm.internal.h.e(animation, "animation");
        if (N.E(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f5099a + " has reached onAnimationStart.");
        }
    }
}
