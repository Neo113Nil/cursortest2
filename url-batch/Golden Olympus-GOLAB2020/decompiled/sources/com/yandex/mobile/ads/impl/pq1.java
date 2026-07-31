package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pq1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f30533a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final tq1 f30534b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f30535c;

    public pq1(int i4, @NotNull tq1 body, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f30533a = i4;
        this.f30534b = body;
        this.f30535c = headers;
    }

    @NotNull
    public final tq1 a() {
        return this.f30534b;
    }

    @NotNull
    public final Map<String, String> b() {
        return this.f30535c;
    }

    public final int c() {
        return this.f30533a;
    }
}
