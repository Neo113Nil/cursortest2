package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import n4.C0758a;

/* loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5703d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View.OnFocusChangeListener f5704e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f5705i;

    public k(View.OnFocusChangeListener onFocusChangeListener, C0758a c0758a) {
        this.f5704e = onFocusChangeListener;
        this.f5705i = c0758a;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.f5703d) {
            case 0:
                l lVar = (l) this.f5705i;
                this.f5704e.onFocusChange(lVar, O6.g.b0(lVar, new A4.c(0)));
                break;
            default:
                C0758a c0758a = (C0758a) this.f5705i;
                this.f5704e.onFocusChange(c0758a, O6.g.b0(c0758a, new A4.c(0)));
                break;
        }
    }

    public k(l lVar, View.OnFocusChangeListener onFocusChangeListener) {
        this.f5705i = lVar;
        this.f5704e = onFocusChangeListener;
    }
}
