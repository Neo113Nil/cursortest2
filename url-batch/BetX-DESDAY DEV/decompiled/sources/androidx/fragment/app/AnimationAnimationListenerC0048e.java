package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: androidx.fragment.app.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0048e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f1336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1337b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1338c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0049f f1339d;

    public AnimationAnimationListenerC0048e(X x2, ViewGroup viewGroup, View view, C0049f c0049f) {
        this.f1336a = x2;
        this.f1337b = viewGroup;
        this.f1338c = view;
        this.f1339d = c0049f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f1337b.post(new K0.B(3, this));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1336a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1336a + " has reached onAnimationStart.");
        }
    }
}
