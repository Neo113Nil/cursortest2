package io.flutter.plugin.platform;

import D0.H;
import a.AbstractC0132a;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import r0.C0289a;

/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2634e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View.OnFocusChangeListener f2635f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f2636g;

    public i(View.OnFocusChangeListener onFocusChangeListener, C0289a c0289a) {
        this.f2635f = onFocusChangeListener;
        this.f2636g = c0289a;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.f2634e) {
            case 0:
                H h2 = new H(23);
                j jVar = (j) this.f2636g;
                this.f2635f.onFocusChange(jVar, AbstractC0132a.P(jVar, h2));
                break;
            default:
                C0289a c0289a = (C0289a) this.f2636g;
                this.f2635f.onFocusChange(c0289a, AbstractC0132a.P(c0289a, new H(23)));
                break;
        }
    }

    public i(j jVar, View.OnFocusChangeListener onFocusChangeListener) {
        this.f2636g = jVar;
        this.f2635f = onFocusChangeListener;
    }
}
