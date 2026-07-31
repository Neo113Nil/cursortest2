package io.appmetrica.analytics.impl;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class I4 implements Y6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f885a;
    public final String b;

    public I4(R4 r4) {
        this.f885a = String.format("component_%s.db", Arrays.copyOf(new Object[]{r4.d() ? "main" : r4.b()}, 1));
        this.b = "db_metrica_" + r4;
    }

    @Override // io.appmetrica.analytics.impl.Y6
    public final String a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.Y6
    public final String b() {
        return this.f885a;
    }
}
