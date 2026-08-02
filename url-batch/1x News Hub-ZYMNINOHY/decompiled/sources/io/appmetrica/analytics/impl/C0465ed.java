package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ed, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0465ed extends L2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f7266b;

    public C0465ed(String str, InterfaceC0990yl interfaceC0990yl) {
        super(interfaceC0990yl);
        this.f7266b = str;
    }

    @Override // io.appmetrica.analytics.impl.L2
    public final String a(String str) {
        return str + '-' + this.f7266b;
    }
}
