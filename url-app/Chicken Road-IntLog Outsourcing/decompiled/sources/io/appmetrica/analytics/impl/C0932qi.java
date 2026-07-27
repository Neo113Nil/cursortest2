package io.appmetrica.analytics.impl;

import b2.AbstractC0279e;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.qi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0932qi implements InterfaceC1041uo {

    /* renamed from: a, reason: collision with root package name */
    public final Map f9112a;

    public C0932qi(Map<String, ?> map) {
        this.f9112a = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1041uo
    public final C0989so a(String str) {
        return this.f9112a.containsKey(str) ? new C0989so(this, false, AbstractC0279e.f("Failed to activate AppMetrica with provided apiKey ApiKey ", str, " has already been used by another reporter.")) : new C0989so(this, true, "");
    }
}
