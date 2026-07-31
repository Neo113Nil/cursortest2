package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    private final View f528f;

    /* renamed from: g, reason: collision with root package name */
    private ViewTreeObserver f529g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f530h;

    private f(View view, Runnable runnable) {
        this.f528f = view;
        this.f529g = view.getViewTreeObserver();
        this.f530h = runnable;
    }

    public static f a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        f fVar = new f(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(fVar);
        view.addOnAttachStateChangeListener(fVar);
        return fVar;
    }

    public void b() {
        (this.f529g.isAlive() ? this.f529g : this.f528f.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f528f.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f530h.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f529g = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
