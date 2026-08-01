package K;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: K.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0022s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f653a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f654b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f655c;

    public ViewTreeObserverOnPreDrawListenerC0022s(View view, Runnable runnable) {
        this.f653a = view;
        this.f654b = view.getViewTreeObserver();
        this.f655c = runnable;
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
        boolean isAlive = this.f654b.isAlive();
        View view = this.f653a;
        if (isAlive) {
            this.f654b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f655c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f654b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f654b.isAlive();
        View view2 = this.f653a;
        if (isAlive) {
            this.f654b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
