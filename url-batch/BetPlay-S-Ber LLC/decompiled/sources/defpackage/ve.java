package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.d;
import androidx.fragment.app.n;
import androidx.fragment.app.s;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ve extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ s d;
    public final /* synthetic */ d e;

    public ve(ViewGroup viewGroup, View view, boolean z, s sVar, d dVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = sVar;
        this.e = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        s sVar = this.d;
        if (z) {
            o30.a(view, sVar.a);
        }
        this.e.a();
        if (n.G(2)) {
            Log.v("FragmentManager", "Animator from operation " + sVar + " has ended.");
        }
    }
}
