package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class Oi implements to {

    /* renamed from: a, reason: collision with root package name */
    public final so f989a = new so();

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(Revenue revenue) {
        so soVar = this.f989a;
        ro[] roVarArr = new ro[1];
        Tf tf = new Tf();
        Integer num = revenue.quantity;
        roVarArr[0] = (num == null || num.intValue() > 0) ? new ro(tf, true, "") : new ro(tf, false, "Invalid quantity value " + num);
        List<ro> asList = Arrays.asList(roVarArr);
        soVar.getClass();
        return soVar.a(asList);
    }
}
