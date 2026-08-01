package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: X.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0036e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f957c;
    public final /* synthetic */ C0037f d;

    public AnimationAnimationListenerC0036e(U u2, ViewGroup viewGroup, View view, C0037f c0037f) {
        this.f955a = u2;
        this.f956b = viewGroup;
        this.f957c = view;
        this.d = c0037f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f956b.post(new L0.B(3, this));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f955a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f955a + " has reached onAnimationStart.");
        }
    }
}
