package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class z implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f2696a;

    /* renamed from: b, reason: collision with root package name */
    public y f2697b;

    public z(View view, y yVar) {
        this.f2696a = view;
        this.f2697b = yVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        y yVar = this.f2697b;
        if (yVar == null) {
            return;
        }
        yVar.run();
        this.f2697b = null;
        this.f2696a.post(new y(1, this));
    }
}
