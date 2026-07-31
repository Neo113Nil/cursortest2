package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.g9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1944g9 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f26072a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f26073b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f26074c;

    public C1944g9(@NotNull String token, @NotNull String advertiserInfo, boolean z4) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(advertiserInfo, "advertiserInfo");
        this.f26072a = z4;
        this.f26073b = token;
        this.f26074c = advertiserInfo;
    }

    @NotNull
    public final String a() {
        return this.f26074c;
    }

    public final boolean b() {
        return this.f26072a;
    }

    @NotNull
    public final String c() {
        return this.f26073b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1944g9)) {
            return false;
        }
        C1944g9 c1944g9 = (C1944g9) obj;
        return this.f26072a == c1944g9.f26072a && Intrinsics.areEqual(this.f26073b, c1944g9.f26073b) && Intrinsics.areEqual(this.f26074c, c1944g9.f26074c);
    }

    public final int hashCode() {
        return this.f26074c.hashCode() + C1842c3.a(this.f26073b, Boolean.hashCode(this.f26072a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "AdTuneInfo(shouldShow=" + this.f26072a + ", token=" + this.f26073b + ", advertiserInfo=" + this.f26074c + ")";
    }
}
