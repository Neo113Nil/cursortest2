package io.appmetrica.analytics.impl;

import E1.AbstractC0033i;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.fe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0492fe implements InterfaceC0890uo {

    /* renamed from: a, reason: collision with root package name */
    public final String f7318a;

    public C0492fe(String str) {
        this.f7318a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0890uo
    public final C0838so a(Collection<Object> collection) {
        return AbstractC0709no.a((Collection) collection) ? new C0838so(this, false, AbstractC0033i.m(new StringBuilder(), this.f7318a, " is null or empty.")) : new C0838so(this, true, "");
    }
}
