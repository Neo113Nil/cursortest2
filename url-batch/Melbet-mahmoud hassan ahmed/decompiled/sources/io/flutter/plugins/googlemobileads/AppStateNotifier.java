package io.flutter.plugins.googlemobileads;

import androidx.lifecycle.e;
import m5.d;
import m5.k;

/* loaded from: classes.dex */
final class AppStateNotifier implements androidx.lifecycle.g, k.c, d.InterfaceC0108d {

    /* renamed from: f, reason: collision with root package name */
    private final m5.k f17430f;

    /* renamed from: g, reason: collision with root package name */
    private final m5.d f17431g;

    /* renamed from: h, reason: collision with root package name */
    private d.b f17432h;

    AppStateNotifier(m5.c cVar) {
        m5.k kVar = new m5.k(cVar, "plugins.flutter.io/google_mobile_ads/app_state_method");
        this.f17430f = kVar;
        kVar.e(this);
        m5.d dVar = new m5.d(cVar, "plugins.flutter.io/google_mobile_ads/app_state_event");
        this.f17431g = dVar;
        dVar.d(this);
    }

    @Override // m5.k.c
    public void C(m5.j jVar, k.d dVar) {
        String str = jVar.f19247a;
        str.hashCode();
        if (str.equals("stop")) {
            k();
        } else if (str.equals("start")) {
            j();
        } else {
            dVar.c();
        }
    }

    @Override // androidx.lifecycle.g
    public void d(androidx.lifecycle.i iVar, e.b bVar) {
        d.b bVar2;
        String str;
        if (bVar == e.b.ON_START && (bVar2 = this.f17432h) != null) {
            str = "foreground";
        } else if (bVar != e.b.ON_STOP || (bVar2 = this.f17432h) == null) {
            return;
        } else {
            str = "background";
        }
        bVar2.a(str);
    }

    @Override // m5.d.InterfaceC0108d
    public void g(Object obj) {
        this.f17432h = null;
    }

    @Override // m5.d.InterfaceC0108d
    public void h(Object obj, d.b bVar) {
        this.f17432h = bVar;
    }

    void j() {
        androidx.lifecycle.r.k().a().a(this);
    }

    void k() {
        androidx.lifecycle.r.k().a().c(this);
    }
}
