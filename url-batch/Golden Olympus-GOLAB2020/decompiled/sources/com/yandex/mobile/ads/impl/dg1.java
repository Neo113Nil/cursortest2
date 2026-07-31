package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.yb0;

/* loaded from: classes3.dex */
public final class dg1 implements rw1 {

    /* renamed from: a, reason: collision with root package name */
    private yb0 f24613a;

    /* renamed from: b, reason: collision with root package name */
    private e52 f24614b;

    /* renamed from: c, reason: collision with root package name */
    private p52 f24615c;

    public dg1(String str) {
        this.f24613a = new yb0.a().e(str).a();
    }

    @Override // com.yandex.mobile.ads.impl.rw1
    public final void a(sf1 sf1Var) {
        e52 e52Var = this.f24614b;
        if (e52Var == null) {
            throw new IllegalStateException();
        }
        int i4 = u82.f32873a;
        long b4 = e52Var.b();
        long c4 = this.f24614b.c();
        if (b4 == -9223372036854775807L || c4 == -9223372036854775807L) {
            return;
        }
        yb0 yb0Var = this.f24613a;
        if (c4 != yb0Var.f34995q) {
            yb0 a4 = yb0Var.a().a(c4).a();
            this.f24613a = a4;
            this.f24615c.a(a4);
        }
        int a5 = sf1Var.a();
        this.f24615c.a(a5, sf1Var);
        this.f24615c.a(b4, 1, a5, 0, null);
    }

    @Override // com.yandex.mobile.ads.impl.rw1
    public final void a(e52 e52Var, r70 r70Var, e72.d dVar) {
        this.f24614b = e52Var;
        dVar.a();
        p52 a4 = r70Var.a(dVar.c(), 5);
        this.f24615c = a4;
        a4.a(this.f24613a);
    }
}
