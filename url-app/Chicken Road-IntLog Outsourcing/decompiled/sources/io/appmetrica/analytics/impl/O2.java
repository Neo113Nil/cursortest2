package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class O2 implements InterfaceC1041uo {
    @Override // io.appmetrica.analytics.impl.InterfaceC1041uo
    public final C0989so a(Object obj) {
        C0705ho[] c0705hoArr = ((C0782ko) obj).f8648a;
        return (c0705hoArr == null || c0705hoArr.length == 0) ? new C0989so(this, false, "attributes list is empty") : new C0989so(this, true, "");
    }
}
