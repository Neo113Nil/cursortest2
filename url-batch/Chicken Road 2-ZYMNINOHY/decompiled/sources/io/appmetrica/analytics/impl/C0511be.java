package io.appmetrica.analytics.impl;

import E.AbstractC0005f;

/* renamed from: io.appmetrica.analytics.impl.be, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0511be implements InterfaceC0960so {

    /* renamed from: a, reason: collision with root package name */
    public final String f11536a;

    public C0511be(String str) {
        this.f11536a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0960so
    public final C0909qo a(Object obj) {
        return obj == null ? new C0909qo(this, false, AbstractC0005f.q(new StringBuilder(), this.f11536a, " is null.")) : new C0909qo(this, true, "");
    }

    public final String a() {
        return this.f11536a;
    }
}
