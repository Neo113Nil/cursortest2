package io.flutter.plugins.googlemobileads;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class r extends f {

    /* renamed from: c, reason: collision with root package name */
    final WeakReference<g> f17571c;

    r(int i7, a aVar, g gVar) {
        super(i7, aVar);
        this.f17571c = new WeakReference<>(gVar);
    }

    @Override // r2.d
    public void m() {
        if (this.f17571c.get() != null) {
            this.f17571c.get().a();
        }
    }
}
