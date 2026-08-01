package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class qg implements Animation.AnimationListener {
    public final /* synthetic */ m60 a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ sg d;

    public qg(m60 m60Var, ViewGroup viewGroup, View view, sg sgVar) {
        this.a = m60Var;
        this.b = viewGroup;
        this.c = view;
        this.d = sgVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.b.post(new j7(2, this));
        if (en.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (en.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
