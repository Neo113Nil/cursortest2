package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class on1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f30121a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f30122b;

    public on1(@NotNull String body, @NotNull HashMap headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f30121a = headers;
        this.f30122b = body;
    }

    @NotNull
    public final String a() {
        return this.f30122b;
    }

    @NotNull
    public final Map<String, String> b() {
        return this.f30121a;
    }
}
