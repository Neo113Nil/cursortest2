package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.yb0;
import java.util.List;

/* loaded from: classes3.dex */
final class t82 {

    /* renamed from: a, reason: collision with root package name */
    private final List<yb0> f32243a;

    /* renamed from: b, reason: collision with root package name */
    private final p52[] f32244b;

    public t82(List<yb0> list) {
        this.f32243a = list;
        this.f32244b = new p52[list.size()];
    }

    public final void a(long j4, sf1 sf1Var) {
        if (sf1Var.a() < 9) {
            return;
        }
        int h4 = sf1Var.h();
        int h5 = sf1Var.h();
        int t4 = sf1Var.t();
        if (h4 == 434 && h5 == 1195456820 && t4 == 3) {
            mn.b(j4, sf1Var, this.f32244b);
        }
    }

    public final void a(r70 r70Var, e72.d dVar) {
        for (int i4 = 0; i4 < this.f32244b.length; i4++) {
            dVar.a();
            p52 a4 = r70Var.a(dVar.c(), 3);
            yb0 yb0Var = this.f32243a.get(i4);
            String str = yb0Var.f34991m;
            C2253tf.a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            a4.a(new yb0.a().b(dVar.b()).e(str).m(yb0Var.f34983e).d(yb0Var.f34982d).a(yb0Var.f34977E).a(yb0Var.f34993o).a());
            this.f32244b[i4] = a4;
        }
    }
}
