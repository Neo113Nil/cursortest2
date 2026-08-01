package K;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: K.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0028y implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f515a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f516b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f517c;

    public ViewTreeObserverOnPreDrawListenerC0028y(View view, Runnable runnable) {
        this.f515a = view;
        this.f516b = view.getViewTreeObserver();
        this.f517c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0028y viewTreeObserverOnPreDrawListenerC0028y = new ViewTreeObserverOnPreDrawListenerC0028y(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0028y);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0028y);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f516b.isAlive();
        View view = this.f515a;
        if (isAlive) {
            this.f516b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f517c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f516b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f516b.isAlive();
        View view2 = this.f515a;
        if (isAlive) {
            this.f516b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
