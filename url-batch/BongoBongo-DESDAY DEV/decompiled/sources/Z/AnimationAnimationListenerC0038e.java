package Z;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: Z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0038e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f1122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1124c;
    public final /* synthetic */ C0039f d;

    public AnimationAnimationListenerC0038e(U u2, ViewGroup viewGroup, View view, C0039f c0039f) {
        this.f1122a = u2;
        this.f1123b = viewGroup;
        this.f1124c = view;
        this.d = c0039f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f1123b.post(new N0.B(3, this));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1122a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1122a + " has reached onAnimationStart.");
        }
    }
}
