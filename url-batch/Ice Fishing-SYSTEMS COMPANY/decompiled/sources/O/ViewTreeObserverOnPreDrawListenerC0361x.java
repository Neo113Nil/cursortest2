package O;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: O.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0361x implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: n, reason: collision with root package name */
    public final View f2334n;

    /* renamed from: u, reason: collision with root package name */
    public ViewTreeObserver f2335u;

    /* renamed from: v, reason: collision with root package name */
    public final Runnable f2336v;

    public ViewTreeObserverOnPreDrawListenerC0361x(View view, Runnable runnable) {
        this.f2334n = view;
        this.f2335u = view.getViewTreeObserver();
        this.f2336v = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0361x viewTreeObserverOnPreDrawListenerC0361x = new ViewTreeObserverOnPreDrawListenerC0361x(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0361x);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0361x);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f2335u.isAlive();
        View view = this.f2334n;
        if (isAlive) {
            this.f2335u.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f2336v.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f2335u = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f2335u.isAlive();
        View view2 = this.f2334n;
        if (isAlive) {
            this.f2335u.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
