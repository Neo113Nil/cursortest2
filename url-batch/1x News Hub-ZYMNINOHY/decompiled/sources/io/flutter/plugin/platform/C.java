package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class C implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f9232a;

    /* renamed from: b, reason: collision with root package name */
    public A f9233b;

    public C(View view, A a3) {
        this.f9232a = view;
        this.f9233b = a3;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        A a3 = this.f9233b;
        if (a3 == null) {
            return;
        }
        a3.run();
        this.f9233b = null;
        this.f9232a.post(new A(1, this));
    }
}
