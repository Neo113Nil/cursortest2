package Y;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: Y.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0039e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f1044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1046c;
    public final /* synthetic */ C0040f d;

    public AnimationAnimationListenerC0039e(U u2, ViewGroup viewGroup, View view, C0040f c0040f) {
        this.f1044a = u2;
        this.f1045b = viewGroup;
        this.f1046c = view;
        this.d = c0040f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f1045b.post(new M0.B(3, this));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1044a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1044a + " has reached onAnimationStart.");
        }
    }
}
