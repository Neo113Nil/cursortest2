package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class np0 {

    /* renamed from: f, reason: collision with root package name */
    private final WeakReference<View> f9198f;

    public np0(View view) {
        this.f9198f = new WeakReference<>(view);
    }

    protected abstract void a(ViewTreeObserver viewTreeObserver);

    protected abstract void b(ViewTreeObserver viewTreeObserver);

    protected final ViewTreeObserver c() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f9198f.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    public final void d() {
        ViewTreeObserver c7 = c();
        if (c7 != null) {
            a(c7);
        }
    }

    public final void e() {
        ViewTreeObserver c7 = c();
        if (c7 != null) {
            b(c7);
        }
    }
}
