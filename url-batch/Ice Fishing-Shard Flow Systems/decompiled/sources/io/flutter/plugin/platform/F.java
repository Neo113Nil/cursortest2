package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class F implements ViewTreeObserver.OnDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final View f5677d;

    /* renamed from: e, reason: collision with root package name */
    public E f5678e;

    public F(View view, E e7) {
        this.f5677d = view;
        this.f5678e = e7;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        E e7 = this.f5678e;
        if (e7 == null) {
            return;
        }
        e7.run();
        this.f5678e = null;
        this.f5677d.post(new E(1, this));
    }
}
