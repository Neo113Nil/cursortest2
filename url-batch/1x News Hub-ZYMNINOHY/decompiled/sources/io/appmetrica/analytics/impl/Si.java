package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class Si implements InterfaceC0890uo {

    /* renamed from: a, reason: collision with root package name */
    public final C0864to f6647a = new C0864to();

    @Override // io.appmetrica.analytics.impl.InterfaceC0890uo
    public final C0838so a(Revenue revenue) {
        C0838so c0838so;
        C0864to c0864to = this.f6647a;
        Xf xf = new Xf();
        Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            c0838so = new C0838so(xf, true, "");
        } else {
            c0838so = new C0838so(xf, false, "Invalid quantity value " + num);
        }
        List<C0838so> asList = Arrays.asList(c0838so);
        c0864to.getClass();
        return c0864to.a(asList);
    }
}
