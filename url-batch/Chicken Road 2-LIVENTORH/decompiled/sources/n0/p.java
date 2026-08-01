package n0;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final View f2769f;

    /* renamed from: g, reason: collision with root package name */
    public ViewTreeObserver f2770g;

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f2771h;

    public p(View view, Runnable runnable) {
        this.f2769f = view;
        this.f2770g = view.getViewTreeObserver();
        this.f2771h = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        p pVar = new p(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(pVar);
        view.addOnAttachStateChangeListener(pVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f2770g.isAlive();
        View view = this.f2769f;
        if (isAlive) {
            this.f2770g.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f2771h.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f2770g = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f2770g.isAlive();
        View view2 = this.f2769f;
        if (isAlive) {
            this.f2770g.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
