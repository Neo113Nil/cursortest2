package o3;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    private final View f7404d;

    /* renamed from: e, reason: collision with root package name */
    public ViewTreeObserver f7405e;

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f7406i;

    public j(View view, Runnable runnable) {
        this.f7404d = view;
        this.f7405e = view.getViewTreeObserver();
        this.f7406i = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.f7405e.isAlive()) {
            this.f7405e.removeOnPreDrawListener(this);
        } else {
            this.f7404d.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f7404d.removeOnAttachStateChangeListener(this);
        this.f7406i.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f7405e = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f7405e.isAlive()) {
            this.f7405e.removeOnPreDrawListener(this);
        } else {
            this.f7404d.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f7404d.removeOnAttachStateChangeListener(this);
    }
}
