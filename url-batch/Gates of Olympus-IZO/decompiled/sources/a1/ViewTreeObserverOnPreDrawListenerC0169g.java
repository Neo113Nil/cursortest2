package a1;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: a1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0169g implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final View f3551d;

    /* renamed from: e, reason: collision with root package name */
    public ViewTreeObserver f3552e;

    /* renamed from: f, reason: collision with root package name */
    public final x f3553f;

    public ViewTreeObserverOnPreDrawListenerC0169g(View view, x xVar) {
        this.f3551d = view;
        this.f3552e = view.getViewTreeObserver();
        this.f3553f = xVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f3552e.isAlive();
        View view = this.f3551d;
        if (isAlive) {
            this.f3552e.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f3553f.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f3552e = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f3552e.isAlive();
        View view2 = this.f3551d;
        if (isAlive) {
            this.f3552e.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
