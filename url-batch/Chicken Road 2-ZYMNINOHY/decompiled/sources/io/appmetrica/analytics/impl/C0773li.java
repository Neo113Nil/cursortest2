package io.appmetrica.analytics.impl;

import java.util.Map;
import x.AbstractC1514c;

/* renamed from: io.appmetrica.analytics.impl.li, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0773li implements InterfaceC0960so {

    /* renamed from: a, reason: collision with root package name */
    public final Map f12307a;

    public C0773li(Map<String, ?> map) {
        this.f12307a = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0960so
    public final C0909qo a(String str) {
        return this.f12307a.containsKey(str) ? new C0909qo(this, false, AbstractC1514c.a("Failed to activate AppMetrica with provided apiKey ApiKey ", str, " has already been used by another reporter.")) : new C0909qo(this, true, "");
    }
}
