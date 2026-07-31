package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.oe, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2138oe {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f30000a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f30001b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f30002c;

    public C2138oe(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f30000a = str;
        this.f30001b = str2;
        this.f30002c = str3;
    }

    @Nullable
    public final String a() {
        return this.f30000a;
    }

    @Nullable
    public final String b() {
        return this.f30001b;
    }

    @Nullable
    public final String c() {
        return this.f30002c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2138oe)) {
            return false;
        }
        C2138oe c2138oe = (C2138oe) obj;
        return Intrinsics.areEqual(this.f30000a, c2138oe.f30000a) && Intrinsics.areEqual(this.f30001b, c2138oe.f30001b) && Intrinsics.areEqual(this.f30002c, c2138oe.f30002c);
    }

    public final int hashCode() {
        String str = this.f30000a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f30001b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30002c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "AppMetricaIdentifiers(adGetUrl=" + this.f30000a + ", deviceId=" + this.f30001b + ", uuid=" + this.f30002c + ")";
    }
}
