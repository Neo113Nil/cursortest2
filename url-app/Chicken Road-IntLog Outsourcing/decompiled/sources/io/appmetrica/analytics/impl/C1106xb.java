package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.xb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1106xb implements InterfaceC1041uo {
    @Override // io.appmetrica.analytics.impl.InterfaceC1041uo
    public final C0989so a(String str) {
        return str == null ? new C0989so(this, false, "key is null") : str.startsWith("appmetrica") ? new C0989so(this, false, "key starts with appmetrica") : str.length() > 200 ? new C0989so(this, false, "key length more then 200 characters") : new C0989so(this, true, "");
    }
}
