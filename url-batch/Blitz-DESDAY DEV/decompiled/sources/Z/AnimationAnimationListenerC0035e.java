package Z;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: Z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0035e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f1133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1134b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1135c;
    public final /* synthetic */ C0036f d;

    public AnimationAnimationListenerC0035e(U u2, ViewGroup viewGroup, View view, C0036f c0036f) {
        this.f1133a = u2;
        this.f1134b = viewGroup;
        this.f1135c = view;
        this.d = c0036f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f1134b.post(new O0.B(3, this));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1133a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1133a + " has reached onAnimationStart.");
        }
    }
}
