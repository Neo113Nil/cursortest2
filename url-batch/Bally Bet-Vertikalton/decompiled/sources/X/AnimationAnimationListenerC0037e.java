package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: X.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0037e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f916b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f917c;
    public final /* synthetic */ C0038f d;

    public AnimationAnimationListenerC0037e(U u2, ViewGroup viewGroup, View view, C0038f c0038f) {
        this.f915a = u2;
        this.f916b = viewGroup;
        this.f917c = view;
        this.d = c0038f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f916b.post(new K0.B(3, this));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f915a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f915a + " has reached onAnimationStart.");
        }
    }
}
