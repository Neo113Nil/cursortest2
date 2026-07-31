package io.appmetrica.analytics.impl;

import java.util.Collection;

/* loaded from: classes3.dex */
public final class Zd implements to {

    /* renamed from: a, reason: collision with root package name */
    public final String f1144a;

    public Zd(String str) {
        this.f1144a = str;
    }

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(Collection<Object> collection) {
        return mo.a((Collection) collection) ? new ro(this, false, this.f1144a + " is null or empty.") : new ro(this, true, "");
    }
}
