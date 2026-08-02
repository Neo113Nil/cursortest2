package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Xf implements InterfaceC0890uo {
    @Override // io.appmetrica.analytics.impl.InterfaceC0890uo
    public final C0838so a(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() > 0) {
            return new C0838so(this, true, "");
        }
        return new C0838so(this, false, "Invalid quantity value " + num);
    }
}
