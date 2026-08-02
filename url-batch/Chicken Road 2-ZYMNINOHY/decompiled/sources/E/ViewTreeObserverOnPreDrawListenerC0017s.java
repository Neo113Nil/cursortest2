package E;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: E.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0017s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f439a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f440b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f441c;

    public ViewTreeObserverOnPreDrawListenerC0017s(View view, Runnable runnable) {
        this.f439a = view;
        this.f440b = view.getViewTreeObserver();
        this.f441c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0017s viewTreeObserverOnPreDrawListenerC0017s = new ViewTreeObserverOnPreDrawListenerC0017s(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0017s);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0017s);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f440b.isAlive();
        View view = this.f439a;
        if (isAlive) {
            this.f440b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f441c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f440b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f440b.isAlive();
        View view2 = this.f439a;
        if (isAlive) {
            this.f440b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
