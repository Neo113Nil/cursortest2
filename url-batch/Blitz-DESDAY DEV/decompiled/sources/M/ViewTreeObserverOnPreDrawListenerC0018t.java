package M;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: M.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0018t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f589a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f590b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f591c;

    public ViewTreeObserverOnPreDrawListenerC0018t(View view, Runnable runnable) {
        this.f589a = view;
        this.f590b = view.getViewTreeObserver();
        this.f591c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0018t viewTreeObserverOnPreDrawListenerC0018t = new ViewTreeObserverOnPreDrawListenerC0018t(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0018t);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0018t);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f590b.isAlive();
        View view = this.f589a;
        if (isAlive) {
            this.f590b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f591c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f590b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f590b.isAlive();
        View view2 = this.f589a;
        if (isAlive) {
            this.f590b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
