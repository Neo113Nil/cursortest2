package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: X.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0036e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f915c;
    public final /* synthetic */ C0037f d;

    public AnimationAnimationListenerC0036e(U u2, ViewGroup viewGroup, View view, C0037f c0037f) {
        this.f913a = u2;
        this.f914b = viewGroup;
        this.f915c = view;
        this.d = c0037f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f914b.post(new K0.B(3, this));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f913a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f913a + " has reached onAnimationStart.");
        }
    }
}
