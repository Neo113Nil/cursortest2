package io.flutter.plugins.googlemobileads;

import r2.x;

/* loaded from: classes.dex */
class f0 {

    /* renamed from: a, reason: collision with root package name */
    final Boolean f17488a;

    /* renamed from: b, reason: collision with root package name */
    final Boolean f17489b;

    /* renamed from: c, reason: collision with root package name */
    final Boolean f17490c;

    f0(Boolean bool, Boolean bool2, Boolean bool3) {
        this.f17488a = bool;
        this.f17489b = bool2;
        this.f17490c = bool3;
    }

    r2.x a() {
        x.a aVar = new x.a();
        Boolean bool = this.f17488a;
        if (bool != null) {
            aVar.b(bool.booleanValue());
        }
        Boolean bool2 = this.f17489b;
        if (bool2 != null) {
            aVar.c(bool2.booleanValue());
        }
        Boolean bool3 = this.f17490c;
        if (bool3 != null) {
            aVar.d(bool3.booleanValue());
        }
        return aVar.a();
    }
}
