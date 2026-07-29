package K;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: K.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0020u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f460a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f461b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f462c;

    public ViewTreeObserverOnPreDrawListenerC0020u(View view, Runnable runnable) {
        this.f460a = view;
        this.f461b = view.getViewTreeObserver();
        this.f462c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0020u viewTreeObserverOnPreDrawListenerC0020u = new ViewTreeObserverOnPreDrawListenerC0020u(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0020u);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0020u);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f461b.isAlive();
        View view = this.f460a;
        if (isAlive) {
            this.f461b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f462c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f461b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f461b.isAlive();
        View view2 = this.f460a;
        if (isAlive) {
            this.f461b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
