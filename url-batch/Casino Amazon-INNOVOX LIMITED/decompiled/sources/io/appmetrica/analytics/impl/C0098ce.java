package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ce, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0098ce implements to {

    /* renamed from: a, reason: collision with root package name */
    public final String f1198a;

    public C0098ce(String str) {
        this.f1198a = str;
    }

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(Object obj) {
        return obj == null ? new ro(this, false, this.f1198a + " is null.") : new ro(this, true, "");
    }

    public final String a() {
        return this.f1198a;
    }
}
