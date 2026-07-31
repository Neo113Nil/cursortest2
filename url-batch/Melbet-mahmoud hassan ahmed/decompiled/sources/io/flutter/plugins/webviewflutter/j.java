package io.flutter.plugins.webviewflutter;

import android.content.Context;

/* loaded from: classes.dex */
class j extends io.flutter.plugin.platform.e {

    /* renamed from: b, reason: collision with root package name */
    private final i2 f17680b;

    j(i2 i2Var) {
        super(m5.q.f19259a);
        this.f17680b = i2Var;
    }

    @Override // io.flutter.plugin.platform.e
    public io.flutter.plugin.platform.d a(Context context, int i7, Object obj) {
        io.flutter.plugin.platform.d dVar = (io.flutter.plugin.platform.d) this.f17680b.h(((Integer) obj).intValue());
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("Unable to find WebView instance: " + obj);
    }
}
