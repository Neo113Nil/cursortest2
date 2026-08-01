package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class h implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f544b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f545c;
    public final /* synthetic */ i d;

    public h(v0 v0Var, ViewGroup viewGroup, View view, i iVar) {
        this.f543a = v0Var;
        this.f544b = viewGroup;
        this.f545c = view;
        this.d = iVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f544b.post(new g(0, this));
        if (k0.H(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f543a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (k0.H(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f543a + " has reached onAnimationStart.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
