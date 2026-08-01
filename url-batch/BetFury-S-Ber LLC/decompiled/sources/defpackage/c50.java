package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class c50 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f;
    public ViewTreeObserver g;
    public final Runnable h;

    public c50(View view, Runnable runnable) {
        this.f = view;
        this.g = view.getViewTreeObserver();
        this.h = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        c50 c50Var = new c50(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(c50Var);
        view.addOnAttachStateChangeListener(c50Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.g.isAlive();
        View view = this.f;
        if (isAlive) {
            this.g.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.h.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.g = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.g.isAlive();
        View view2 = this.f;
        if (isAlive) {
            this.g.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
