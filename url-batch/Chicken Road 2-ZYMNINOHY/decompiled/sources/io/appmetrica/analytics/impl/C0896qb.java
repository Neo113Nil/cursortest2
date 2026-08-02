package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0896qb implements InterfaceC0960so {
    @Override // io.appmetrica.analytics.impl.InterfaceC0960so
    public final C0909qo a(String str) {
        return str == null ? new C0909qo(this, false, "key is null") : str.startsWith(G7.f10311b) ? new C0909qo(this, false, "key starts with appmetrica") : str.length() > 200 ? new C0909qo(this, false, "key length more then 200 characters") : new C0909qo(this, true, "");
    }
}
