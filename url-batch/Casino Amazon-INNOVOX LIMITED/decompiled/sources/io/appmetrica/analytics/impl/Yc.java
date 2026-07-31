package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Yc extends E2 {
    public final String b;

    public Yc(String str, InterfaceC0586vl interfaceC0586vl) {
        super(interfaceC0586vl);
        this.b = str;
    }

    @Override // io.appmetrica.analytics.impl.E2
    public final String a(String str) {
        return str + '-' + this.b;
    }
}
