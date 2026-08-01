package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f430a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f431b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f432c;
    public final /* synthetic */ i d;

    public h(View view, ViewGroup viewGroup, i iVar, v0 v0Var) {
        this.f430a = v0Var;
        this.f431b = viewGroup;
        this.f432c = view;
        this.d = iVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f431b.post(new g(0, this));
        if (k0.E(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f430a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (k0.E(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f430a + " has reached onAnimationStart.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
