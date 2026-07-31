package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class M implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final View f11891a;

    /* renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f11892b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f11893c;

    private M(View view, Runnable runnable) {
        this.f11891a = view;
        this.f11892b = view.getViewTreeObserver();
        this.f11893c = runnable;
    }

    public static M a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        M m4 = new M(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(m4);
        view.addOnAttachStateChangeListener(m4);
        return m4;
    }

    public void b() {
        if (this.f11892b.isAlive()) {
            this.f11892b.removeOnPreDrawListener(this);
        } else {
            this.f11891a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f11891a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f11893c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f11892b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
