package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ro0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final aa1 f31320a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31321b;

    public ro0(@NotNull aa1 nativeValidator, int i4) {
        Intrinsics.checkNotNullParameter(nativeValidator, "nativeValidator");
        this.f31320a = nativeValidator;
        this.f31321b = i4;
    }

    @NotNull
    public final c92 a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f31320a.a(context, this.f31321b);
    }
}
