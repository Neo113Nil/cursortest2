package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Sf implements InterfaceC0960so {
    @Override // io.appmetrica.analytics.impl.InterfaceC0960so
    public final C0909qo a(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() > 0) {
            return new C0909qo(this, true, "");
        }
        return new C0909qo(this, false, "Invalid quantity value " + num);
    }
}
