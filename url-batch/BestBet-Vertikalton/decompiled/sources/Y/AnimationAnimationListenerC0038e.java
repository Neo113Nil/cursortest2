package Y;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: Y.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0038e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f1403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1405c;
    public final /* synthetic */ C0039f d;

    public AnimationAnimationListenerC0038e(U u2, ViewGroup viewGroup, View view, C0039f c0039f) {
        this.f1403a = u2;
        this.f1404b = viewGroup;
        this.f1405c = view;
        this.d = c0039f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f1404b.post(new C0.i(5, this));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1403a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1403a + " has reached onAnimationStart.");
        }
    }
}
