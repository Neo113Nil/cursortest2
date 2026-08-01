package K;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: K.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0022u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f522a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f523b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f524c;

    public ViewTreeObserverOnPreDrawListenerC0022u(View view, Runnable runnable) {
        this.f522a = view;
        this.f523b = view.getViewTreeObserver();
        this.f524c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0022u viewTreeObserverOnPreDrawListenerC0022u = new ViewTreeObserverOnPreDrawListenerC0022u(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0022u);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0022u);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f523b.isAlive();
        View view = this.f522a;
        if (isAlive) {
            this.f523b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f524c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f523b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f523b.isAlive();
        View view2 = this.f522a;
        if (isAlive) {
            this.f523b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
