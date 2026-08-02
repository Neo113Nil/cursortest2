package io.appmetrica.analytics.impl;

import java.util.Map;
import w0.AbstractC1234c;

/* renamed from: io.appmetrica.analytics.impl.qi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0781qi implements InterfaceC0890uo {

    /* renamed from: a, reason: collision with root package name */
    public final Map f8178a;

    public C0781qi(Map<String, ?> map) {
        this.f8178a = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0890uo
    public final C0838so a(String str) {
        return this.f8178a.containsKey(str) ? new C0838so(this, false, AbstractC1234c.a("Failed to activate AppMetrica with provided apiKey ApiKey ", str, " has already been used by another reporter.")) : new C0838so(this, true, "");
    }
}
