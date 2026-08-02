package io.appmetrica.analytics.impl;

import E1.AbstractC0033i;

/* renamed from: io.appmetrica.analytics.impl.ie, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0570ie implements InterfaceC0890uo {

    /* renamed from: a, reason: collision with root package name */
    public final String f7565a;

    public C0570ie(String str) {
        this.f7565a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0890uo
    public final C0838so a(Object obj) {
        return obj == null ? new C0838so(this, false, AbstractC0033i.m(new StringBuilder(), this.f7565a, " is null.")) : new C0838so(this, true, "");
    }

    public final String a() {
        return this.f7565a;
    }
}
