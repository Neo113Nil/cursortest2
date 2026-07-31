package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.aj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2496aj implements InterfaceC2895po {

    /* renamed from: a, reason: collision with root package name */
    public final C2869oo f38680a = new C2869oo();

    @Override // io.appmetrica.analytics.impl.InterfaceC2895po
    public final C2843no a(Revenue revenue) {
        C2843no c2843no;
        C2869oo c2869oo = this.f38680a;
        C2627fg c2627fg = new C2627fg();
        Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            c2843no = new C2843no(c2627fg, true, "");
        } else {
            c2843no = new C2843no(c2627fg, false, "Invalid quantity value " + num);
        }
        List<C2843no> asList = Arrays.asList(c2843no);
        c2869oo.getClass();
        return c2869oo.a(asList);
    }
}
