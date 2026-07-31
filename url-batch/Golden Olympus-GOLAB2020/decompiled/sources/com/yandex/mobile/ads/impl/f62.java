package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class f62 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f25662a;

    /* renamed from: b, reason: collision with root package name */
    private final long f25663b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25664c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ux1 f25665d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private Long f25666e;

    public f62(int i4, long j4, @NotNull ux1 showNoticeType, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(showNoticeType, "showNoticeType");
        this.f25662a = url;
        this.f25663b = j4;
        this.f25664c = i4;
        this.f25665d = showNoticeType;
    }

    public final long a() {
        return this.f25663b;
    }

    @Nullable
    public final Long b() {
        return this.f25666e;
    }

    @NotNull
    public final ux1 c() {
        return this.f25665d;
    }

    @NotNull
    public final String d() {
        return this.f25662a;
    }

    public final int e() {
        return this.f25664c;
    }

    public final void a(@Nullable Long l4) {
        this.f25666e = l4;
    }
}
