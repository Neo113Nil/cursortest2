package a1;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: a1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0392g implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final View f4880d;

    /* renamed from: e, reason: collision with root package name */
    public ViewTreeObserver f4881e;

    /* renamed from: i, reason: collision with root package name */
    public final Runnable f4882i;

    public ViewTreeObserverOnPreDrawListenerC0392g(View view, Runnable runnable) {
        this.f4880d = view;
        this.f4881e = view.getViewTreeObserver();
        this.f4882i = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f4881e.isAlive();
        View view = this.f4880d;
        if (isAlive) {
            this.f4881e.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f4882i.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f4881e = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f4881e.isAlive();
        View view2 = this.f4880d;
        if (isAlive) {
            this.f4881e.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
