package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ed, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616ed extends L2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f8131b;

    public C0616ed(String str, InterfaceC1141yl interfaceC1141yl) {
        super(interfaceC1141yl);
        this.f8131b = str;
    }

    @Override // io.appmetrica.analytics.impl.L2
    public final String a(String str) {
        return str + '-' + this.f8131b;
    }
}
