package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gv1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View m;
    public ViewTreeObserver n;
    public final Runnable o;

    public gv1(View view, Runnable runnable) {
        this.m = view;
        this.n = view.getViewTreeObserver();
        this.o = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            ch2.l("view == null");
            return;
        }
        gv1 gv1Var = new gv1(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(gv1Var);
        view.addOnAttachStateChangeListener(gv1Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.n.isAlive();
        View view = this.m;
        if (isAlive) {
            this.n.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.o.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.n = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.n.isAlive();
        View view2 = this.m;
        if (isAlive) {
            this.n.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
