package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.sd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2961sd extends P2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f39796b;

    public C2961sd(@NotNull String str, @NotNull InterfaceC3021ul interfaceC3021ul) {
        super(interfaceC3021ul);
        this.f39796b = str;
    }

    @Override // io.appmetrica.analytics.impl.P2
    @NotNull
    public final String a(@NotNull String str) {
        return str + '-' + this.f39796b;
    }
}
