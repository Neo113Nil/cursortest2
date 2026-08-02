package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.xb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0955xb implements InterfaceC0890uo {
    @Override // io.appmetrica.analytics.impl.InterfaceC0890uo
    public final C0838so a(String str) {
        return str == null ? new C0838so(this, false, "key is null") : str.startsWith("appmetrica") ? new C0838so(this, false, "key starts with appmetrica") : str.length() > 200 ? new C0838so(this, false, "key length more then 200 characters") : new C0838so(this, true, "");
    }
}
