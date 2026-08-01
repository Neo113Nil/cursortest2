package K;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: K.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0019u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f442a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f443b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f444c;

    public ViewTreeObserverOnPreDrawListenerC0019u(View view, Runnable runnable) {
        this.f442a = view;
        this.f443b = view.getViewTreeObserver();
        this.f444c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0019u viewTreeObserverOnPreDrawListenerC0019u = new ViewTreeObserverOnPreDrawListenerC0019u(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0019u);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0019u);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f443b.isAlive();
        View view = this.f442a;
        if (isAlive) {
            this.f443b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f444c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f443b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f443b.isAlive();
        View view2 = this.f442a;
        if (isAlive) {
            this.f443b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
