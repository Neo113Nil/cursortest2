package io.appmetrica.analytics.impl;

import E.AbstractC0005f;
import java.util.Collection;

/* loaded from: classes.dex */
public final class Yd implements InterfaceC0960so {

    /* renamed from: a, reason: collision with root package name */
    public final String f11304a;

    public Yd(String str) {
        this.f11304a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0960so
    public final C0909qo a(Collection<Object> collection) {
        return AbstractC0779lo.a((Collection) collection) ? new C0909qo(this, false, AbstractC0005f.q(new StringBuilder(), this.f11304a, " is null or empty.")) : new C0909qo(this, true, "");
    }
}
