package io.flutter.plugins.googlemobileads;

import f3.d;

/* loaded from: classes.dex */
class z {

    /* renamed from: a, reason: collision with root package name */
    final Integer f17600a;

    /* renamed from: b, reason: collision with root package name */
    final Integer f17601b;

    /* renamed from: c, reason: collision with root package name */
    final f0 f17602c;

    /* renamed from: d, reason: collision with root package name */
    final Boolean f17603d;

    /* renamed from: e, reason: collision with root package name */
    final Boolean f17604e;

    /* renamed from: f, reason: collision with root package name */
    final Boolean f17605f;

    z(Integer num, Integer num2, f0 f0Var, Boolean bool, Boolean bool2, Boolean bool3) {
        this.f17600a = num;
        this.f17601b = num2;
        this.f17602c = f0Var;
        this.f17603d = bool;
        this.f17604e = bool2;
        this.f17605f = bool3;
    }

    f3.d a() {
        d.a aVar = new d.a();
        Integer num = this.f17600a;
        if (num != null) {
            aVar.b(num.intValue());
        }
        Integer num2 = this.f17601b;
        if (num2 != null) {
            aVar.c(num2.intValue());
        }
        f0 f0Var = this.f17602c;
        if (f0Var != null) {
            aVar.g(f0Var.a());
        }
        Boolean bool = this.f17603d;
        if (bool != null) {
            aVar.d(bool.booleanValue());
        }
        Boolean bool2 = this.f17604e;
        if (bool2 != null) {
            aVar.e(bool2.booleanValue());
        }
        Boolean bool3 = this.f17605f;
        if (bool3 != null) {
            aVar.f(bool3.booleanValue());
        }
        return aVar.a();
    }
}
