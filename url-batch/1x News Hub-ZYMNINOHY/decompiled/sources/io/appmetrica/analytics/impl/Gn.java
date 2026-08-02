package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ValidationException;

/* loaded from: classes.dex */
public class Gn implements InterfaceC0890uo {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0890uo f6055a;

    public Gn(InterfaceC0890uo interfaceC0890uo) {
        this.f6055a = interfaceC0890uo;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0890uo
    public final C0838so a(Object obj) {
        C0838so a3 = this.f6055a.a(obj);
        if (a3.f8327a) {
            return a3;
        }
        throw new ValidationException(a3.f8328b);
    }

    public final InterfaceC0890uo a() {
        return this.f6055a;
    }
}
