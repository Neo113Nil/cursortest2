package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class lz implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f;
    public ViewTreeObserver g;
    public final Runnable h;

    public lz(View view, Runnable runnable) {
        this.f = view;
        this.g = view.getViewTreeObserver();
        this.h = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        lz lzVar = new lz(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(lzVar);
        view.addOnAttachStateChangeListener(lzVar);
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
