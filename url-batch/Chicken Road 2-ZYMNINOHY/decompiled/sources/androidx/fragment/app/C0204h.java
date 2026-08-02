package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import b.C0241b;

/* renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204h extends A0 {

    /* renamed from: c, reason: collision with root package name */
    public final C0202f f4874c;

    /* renamed from: d, reason: collision with root package name */
    public AnimatorSet f4875d;

    public C0204h(C0202f c0202f) {
        this.f4874c = c0202f;
    }

    @Override // androidx.fragment.app.A0
    public final void b(ViewGroup container) {
        B0 b02 = this.f4874c.f4893a;
        kotlin.jvm.internal.i.e(container, "container");
        AnimatorSet animatorSet = this.f4875d;
        if (animatorSet == null) {
            b02.c(this);
            return;
        }
        if (!b02.f4729g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0206j.f4892a.a(animatorSet);
        }
        if (f0.J(2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(b02);
            sb.append(" has been canceled");
            sb.append(b02.f4729g ? " with seeking." : ".");
            sb.append(' ');
            Log.v("FragmentManager", sb.toString());
        }
    }

    @Override // androidx.fragment.app.A0
    public final void c(ViewGroup container) {
        kotlin.jvm.internal.i.e(container, "container");
        B0 b02 = this.f4874c.f4893a;
        AnimatorSet animatorSet = this.f4875d;
        if (animatorSet == null) {
            b02.c(this);
            return;
        }
        animatorSet.start();
        if (f0.J(2)) {
            Log.v("FragmentManager", "Animator from operation " + b02 + " has started.");
        }
    }

    @Override // androidx.fragment.app.A0
    public final void d(C0241b c0241b, ViewGroup container) {
        kotlin.jvm.internal.i.e(container, "container");
        B0 b02 = this.f4874c.f4893a;
        AnimatorSet animatorSet = this.f4875d;
        if (animatorSet == null) {
            b02.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !b02.f4725c.mTransitioning) {
            return;
        }
        if (f0.J(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + b02);
        }
        long a3 = C0205i.f4884a.a(animatorSet);
        long j4 = (long) (c0241b.f5215c * a3);
        if (j4 == 0) {
            j4 = 1;
        }
        if (j4 == a3) {
            j4 = a3 - 1;
        }
        if (f0.J(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j4 + " for Animator " + animatorSet + " on operation " + b02);
        }
        C0206j.f4892a.b(animatorSet, j4);
    }

    @Override // androidx.fragment.app.A0
    public final void e(ViewGroup container) {
        C0204h c0204h;
        kotlin.jvm.internal.i.e(container, "container");
        C0202f c0202f = this.f4874c;
        if (c0202f.a()) {
            return;
        }
        Context context = container.getContext();
        kotlin.jvm.internal.i.d(context, "context");
        L b4 = c0202f.b(context);
        this.f4875d = b4 != null ? (AnimatorSet) b4.f4761b : null;
        B0 b02 = c0202f.f4893a;
        F f4 = b02.f4725c;
        boolean z = b02.f4723a == 3;
        View view = f4.mView;
        container.startViewTransition(view);
        AnimatorSet animatorSet = this.f4875d;
        if (animatorSet != null) {
            c0204h = this;
            animatorSet.addListener(new C0203g(container, view, z, b02, c0204h));
        } else {
            c0204h = this;
        }
        AnimatorSet animatorSet2 = c0204h.f4875d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
