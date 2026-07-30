package I;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: I.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0126w implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    private final View f1240d;

    /* renamed from: e, reason: collision with root package name */
    public ViewTreeObserver f1241e;

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f1242i;

    public ViewTreeObserverOnPreDrawListenerC0126w(View view, Runnable runnable) {
        this.f1240d = view;
        this.f1241e = view.getViewTreeObserver();
        this.f1242i = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0126w viewTreeObserverOnPreDrawListenerC0126w = new ViewTreeObserverOnPreDrawListenerC0126w(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0126w);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0126w);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.f1241e.isAlive()) {
            this.f1241e.removeOnPreDrawListener(this);
        } else {
            this.f1240d.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f1240d.removeOnAttachStateChangeListener(this);
        this.f1242i.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f1241e = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f1241e.isAlive()) {
            this.f1241e.removeOnPreDrawListener(this);
        } else {
            this.f1240d.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f1240d.removeOnAttachStateChangeListener(this);
    }
}
