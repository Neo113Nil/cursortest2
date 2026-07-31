package q3;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final View f6146d;

    /* renamed from: e, reason: collision with root package name */
    public ViewTreeObserver f6147e;

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f6148f;

    public r(View view, Runnable runnable) {
        this.f6146d = view;
        this.f6147e = view.getViewTreeObserver();
        this.f6148f = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f6147e.isAlive();
        View view = this.f6146d;
        if (isAlive) {
            this.f6147e.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f6148f.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f6147e = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f6147e.isAlive();
        View view2 = this.f6146d;
        if (isAlive) {
            this.f6147e.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
