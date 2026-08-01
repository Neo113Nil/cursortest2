package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: X.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0035e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1000c;
    public final /* synthetic */ C0036f d;

    public AnimationAnimationListenerC0035e(U u2, ViewGroup viewGroup, View view, C0036f c0036f) {
        this.f998a = u2;
        this.f999b = viewGroup;
        this.f1000c = view;
        this.d = c0036f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f999b.post(new P0.A(3, this));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f998a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f998a + " has reached onAnimationStart.");
        }
    }
}
