package K;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: K.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0020v implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f447a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f448b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f449c;

    public ViewTreeObserverOnPreDrawListenerC0020v(View view, Runnable runnable) {
        this.f447a = view;
        this.f448b = view.getViewTreeObserver();
        this.f449c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0020v viewTreeObserverOnPreDrawListenerC0020v = new ViewTreeObserverOnPreDrawListenerC0020v(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0020v);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0020v);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f448b.isAlive();
        View view = this.f447a;
        if (isAlive) {
            this.f448b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f449c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f448b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f448b.isAlive();
        View view2 = this.f447a;
        if (isAlive) {
            this.f448b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
