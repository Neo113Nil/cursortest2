package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.kw0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class yn1 extends sq1 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f35266a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35267b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final okio.g f35268c;

    public yn1(@Nullable String str, long j4, @NotNull okio.g source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f35266a = str;
        this.f35267b = j4;
        this.f35268c = source;
    }

    @Override // com.yandex.mobile.ads.impl.sq1
    public final long a() {
        return this.f35267b;
    }

    @Override // com.yandex.mobile.ads.impl.sq1
    @Nullable
    public final kw0 b() {
        String str = this.f35266a;
        if (str == null) {
            return null;
        }
        int i4 = kw0.f28344d;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return kw0.a.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.sq1
    @NotNull
    public final okio.g c() {
        return this.f35268c;
    }
}
