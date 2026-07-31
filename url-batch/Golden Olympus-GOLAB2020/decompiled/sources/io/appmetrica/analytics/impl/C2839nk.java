package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.nk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2839nk implements InterfaceC2955s7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f39519a = "service_main.db";

    /* renamed from: b, reason: collision with root package name */
    public final String f39520b = "metrica_data.db";

    @Override // io.appmetrica.analytics.impl.InterfaceC2955s7
    @NotNull
    public final String a() {
        return this.f39520b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2955s7
    @NotNull
    public final String b() {
        return this.f39519a;
    }
}
