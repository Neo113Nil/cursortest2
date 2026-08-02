package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class O2 implements InterfaceC0890uo {
    @Override // io.appmetrica.analytics.impl.InterfaceC0890uo
    public final C0838so a(Object obj) {
        C0554ho[] c0554hoArr = ((C0631ko) obj).f7746a;
        return (c0554hoArr == null || c0554hoArr.length == 0) ? new C0838so(this, false, "attributes list is empty") : new C0838so(this, true, "");
    }
}
