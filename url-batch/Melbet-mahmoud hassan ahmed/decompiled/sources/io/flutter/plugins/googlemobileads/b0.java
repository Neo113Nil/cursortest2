package io.flutter.plugins.googlemobileads;

import android.view.View;

/* loaded from: classes.dex */
class b0 implements io.flutter.plugin.platform.d {

    /* renamed from: f, reason: collision with root package name */
    private View f17444f;

    b0(View view) {
        this.f17444f = view;
    }

    @Override // io.flutter.plugin.platform.d
    public void d() {
        this.f17444f = null;
    }

    @Override // io.flutter.plugin.platform.d
    public /* synthetic */ void e() {
        io.flutter.plugin.platform.c.d(this);
    }

    @Override // io.flutter.plugin.platform.d
    public /* synthetic */ void f(View view) {
        io.flutter.plugin.platform.c.a(this, view);
    }

    @Override // io.flutter.plugin.platform.d
    public /* synthetic */ void g() {
        io.flutter.plugin.platform.c.b(this);
    }

    @Override // io.flutter.plugin.platform.d
    public View getView() {
        return this.f17444f;
    }

    @Override // io.flutter.plugin.platform.d
    public /* synthetic */ void h() {
        io.flutter.plugin.platform.c.c(this);
    }
}
