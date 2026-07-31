package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.yb0;
import java.util.List;

/* loaded from: classes3.dex */
public final class yw1 {

    /* renamed from: a, reason: collision with root package name */
    private final List<yb0> f35351a;

    /* renamed from: b, reason: collision with root package name */
    private final p52[] f35352b;

    public yw1(List<yb0> list) {
        this.f35351a = list;
        this.f35352b = new p52[list.size()];
    }

    public final void a(long j4, sf1 sf1Var) {
        mn.a(j4, sf1Var, this.f35352b);
    }

    public final void a(r70 r70Var, e72.d dVar) {
        for (int i4 = 0; i4 < this.f35352b.length; i4++) {
            dVar.a();
            p52 a4 = r70Var.a(dVar.c(), 3);
            yb0 yb0Var = this.f35351a.get(i4);
            String str = yb0Var.f34991m;
            C2253tf.a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = yb0Var.f34980b;
            if (str2 == null) {
                str2 = dVar.b();
            }
            a4.a(new yb0.a().b(str2).e(str).m(yb0Var.f34983e).d(yb0Var.f34982d).a(yb0Var.f34977E).a(yb0Var.f34993o).a());
            this.f35352b[i4] = a4;
        }
    }
}
