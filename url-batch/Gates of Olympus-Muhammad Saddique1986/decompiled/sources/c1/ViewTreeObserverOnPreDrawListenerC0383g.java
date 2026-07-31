package c1;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: c1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0383g implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final View f5598d;

    /* renamed from: e, reason: collision with root package name */
    public ViewTreeObserver f5599e;

    /* renamed from: f, reason: collision with root package name */
    public final z f5600f;

    public ViewTreeObserverOnPreDrawListenerC0383g(View view, z zVar) {
        this.f5598d = view;
        this.f5599e = view.getViewTreeObserver();
        this.f5600f = zVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f5599e.isAlive();
        View view = this.f5598d;
        if (isAlive) {
            this.f5599e.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f5600f.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f5599e = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f5599e.isAlive();
        View view2 = this.f5598d;
        if (isAlive) {
            this.f5599e.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
