package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.we, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2321we {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f34016a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f34017b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f34018c;

    public C2321we(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f34016a = str;
        this.f34017b = str2;
        this.f34018c = str3;
    }

    @Nullable
    public final String a() {
        return this.f34017b;
    }

    @Nullable
    public final String b() {
        return this.f34018c;
    }

    @Nullable
    public final String c() {
        return this.f34016a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2321we)) {
            return false;
        }
        C2321we c2321we = (C2321we) obj;
        return Intrinsics.areEqual(this.f34016a, c2321we.f34016a) && Intrinsics.areEqual(this.f34017b, c2321we.f34017b) && Intrinsics.areEqual(this.f34018c, c2321we.f34018c);
    }

    public final int hashCode() {
        String str = this.f34016a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f34017b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f34018c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "AppMetricaStartupParams(uuid=" + this.f34016a + ", deviceId=" + this.f34017b + ", getAdUrl=" + this.f34018c + ")";
    }
}
