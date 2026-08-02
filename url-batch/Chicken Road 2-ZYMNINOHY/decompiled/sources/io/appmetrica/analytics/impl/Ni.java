package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class Ni implements InterfaceC0960so {

    /* renamed from: a, reason: collision with root package name */
    public final C0934ro f10718a = new C0934ro();

    @Override // io.appmetrica.analytics.impl.InterfaceC0960so
    public final C0909qo a(Revenue revenue) {
        C0909qo c0909qo;
        C0934ro c0934ro = this.f10718a;
        Sf sf = new Sf();
        Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            c0909qo = new C0909qo(sf, true, "");
        } else {
            c0909qo = new C0909qo(sf, false, "Invalid quantity value " + num);
        }
        List<C0909qo> asList = Arrays.asList(c0909qo);
        c0934ro.getClass();
        return c0934ro.a(asList);
    }
}
