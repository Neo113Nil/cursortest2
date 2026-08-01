package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f426b;
    public final /* synthetic */ View c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f427d;

    public h(v0 v0Var, ViewGroup viewGroup, View view, i iVar) {
        this.f425a = v0Var;
        this.f426b = viewGroup;
        this.c = view;
        this.f427d = iVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f426b.post(new g(0, this));
        if (k0.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f425a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (k0.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f425a + " has reached onAnimationStart.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
