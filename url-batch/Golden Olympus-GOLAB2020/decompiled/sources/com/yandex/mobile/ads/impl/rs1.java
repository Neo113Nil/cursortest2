package com.yandex.mobile.ads.impl;

import W1.AbstractC1233c;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class rs1 extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final IOException f31350b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private IOException f31351c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs1(@NotNull IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.f31350b = firstConnectException;
        this.f31351c = firstConnectException;
    }

    public final void a(@NotNull IOException e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        AbstractC1233c.a(this.f31350b, e4);
        this.f31351c = e4;
    }

    @NotNull
    public final IOException b() {
        return this.f31351c;
    }

    @NotNull
    public final IOException a() {
        return this.f31350b;
    }
}
