package Z;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: Z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0041e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f1551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1553c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0042f f1554d;

    public AnimationAnimationListenerC0041e(U u2, ViewGroup viewGroup, View view, C0042f c0042f) {
        this.f1551a = u2;
        this.f1552b = viewGroup;
        this.f1553c = view;
        this.f1554d = c0042f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f1552b.post(new C1.e(4, this));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1551a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1551a + " has reached onAnimationStart.");
        }
    }
}
