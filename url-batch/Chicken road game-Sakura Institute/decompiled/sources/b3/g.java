package b3;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final View f1323f;

    /* renamed from: g, reason: collision with root package name */
    public ViewTreeObserver f1324g;

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f1325h;

    public g(View view, Runnable runnable) {
        this.f1323f = view;
        this.f1324g = view.getViewTreeObserver();
        this.f1325h = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f1324g.isAlive();
        View view = this.f1323f;
        if (isAlive) {
            this.f1324g.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f1325h.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f1324g = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f1324g.isAlive();
        View view2 = this.f1323f;
        if (isAlive) {
            this.f1324g.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
