package io.appmetrica.analytics.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class O4 implements InterfaceC0459e7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6397a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6398b;

    public O4(X4 x4) {
        this.f6397a = String.format("component_%s.db", Arrays.copyOf(new Object[]{x4.d() ? "main" : x4.b()}, 1));
        this.f6398b = "db_metrica_" + x4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0459e7
    public final String a() {
        return this.f6398b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0459e7
    public final String b() {
        return this.f6397a;
    }
}
