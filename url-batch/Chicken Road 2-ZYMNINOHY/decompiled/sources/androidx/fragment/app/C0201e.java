package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: androidx.fragment.app.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201e extends A0 {

    /* renamed from: c, reason: collision with root package name */
    public final C0202f f4828c;

    public C0201e(C0202f c0202f) {
        this.f4828c = c0202f;
    }

    @Override // androidx.fragment.app.A0
    public final void b(ViewGroup container) {
        kotlin.jvm.internal.i.e(container, "container");
        C0202f c0202f = this.f4828c;
        B0 b02 = c0202f.f4893a;
        View view = b02.f4725c.mView;
        view.clearAnimation();
        container.endViewTransition(view);
        c0202f.f4893a.c(this);
        if (f0.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + b02 + " has been cancelled.");
        }
    }

    @Override // androidx.fragment.app.A0
    public final void c(ViewGroup container) {
        kotlin.jvm.internal.i.e(container, "container");
        C0202f c0202f = this.f4828c;
        B0 b02 = c0202f.f4893a;
        if (c0202f.a()) {
            b02.c(this);
            return;
        }
        Context context = container.getContext();
        View view = b02.f4725c.mView;
        kotlin.jvm.internal.i.d(context, "context");
        L b4 = c0202f.b(context);
        if (b4 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) b4.f4760a;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (b02.f4723a != 1) {
            view.startAnimation(animation);
            b02.c(this);
            return;
        }
        container.startViewTransition(view);
        M m4 = new M(animation, container, view);
        m4.setAnimationListener(new AnimationAnimationListenerC0199d(b02, container, view, this));
        view.startAnimation(m4);
        if (f0.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + b02 + " has started.");
        }
    }
}
