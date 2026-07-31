package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.j4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2719j4 implements InterfaceC2955s7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f39258a = "client.db";

    /* renamed from: b, reason: collision with root package name */
    public final String f39259b = "metrica_client_data.db";

    @Override // io.appmetrica.analytics.impl.InterfaceC2955s7
    @NotNull
    public final String a() {
        return this.f39259b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2955s7
    @NotNull
    public final String b() {
        return this.f39258a;
    }
}
