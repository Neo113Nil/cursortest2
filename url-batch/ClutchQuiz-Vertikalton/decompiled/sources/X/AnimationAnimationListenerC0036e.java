package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: X.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0036e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f1050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1051b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1052c;
    public final /* synthetic */ C0037f d;

    public AnimationAnimationListenerC0036e(C0037f c0037f, U u2, View view, ViewGroup viewGroup) {
        this.f1050a = u2;
        this.f1051b = viewGroup;
        this.f1052c = view;
        this.d = c0037f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f1051b.post(new Q.b(3, this));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1050a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1050a + " has reached onAnimationStart.");
        }
    }
}
