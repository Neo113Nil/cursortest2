package io.appmetrica.analytics.impl;

import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class Ec implements F8 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1002ue f10248a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1328a f10249b;

    public Ec(InterfaceC1002ue interfaceC1002ue, InterfaceC1328a interfaceC1328a) {
        this.f10248a = interfaceC1002ue;
        this.f10249b = interfaceC1328a;
    }

    @Override // io.appmetrica.analytics.impl.F8
    public final boolean b() {
        return ((C0976te) this.f10248a).f12782b.get() >= ((long) ((Number) this.f10249b.invoke()).intValue());
    }
}
