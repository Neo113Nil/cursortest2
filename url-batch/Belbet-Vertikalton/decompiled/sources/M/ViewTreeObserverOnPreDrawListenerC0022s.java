package M;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: M.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0022s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f789a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f790b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f791c;

    public ViewTreeObserverOnPreDrawListenerC0022s(View view, Runnable runnable) {
        this.f789a = view;
        this.f790b = view.getViewTreeObserver();
        this.f791c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0022s viewTreeObserverOnPreDrawListenerC0022s = new ViewTreeObserverOnPreDrawListenerC0022s(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0022s);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0022s);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f790b.isAlive();
        View view = this.f789a;
        if (isAlive) {
            this.f790b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f791c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f790b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f790b.isAlive();
        View view2 = this.f789a;
        if (isAlive) {
            this.f790b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
