package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.t5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2243t5 {

    /* renamed from: a, reason: collision with root package name */
    private final long f32157a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final C2266u5 f32158b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final EnumC2289v5 f32159c;

    public C2243t5(long j4, @Nullable C2266u5 c2266u5, @Nullable EnumC2289v5 enumC2289v5) {
        this.f32157a = j4;
        this.f32158b = c2266u5;
        this.f32159c = enumC2289v5;
    }

    public final long a() {
        return this.f32157a;
    }

    @Nullable
    public final C2266u5 b() {
        return this.f32158b;
    }

    @Nullable
    public final EnumC2289v5 c() {
        return this.f32159c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2243t5)) {
            return false;
        }
        C2243t5 c2243t5 = (C2243t5) obj;
        return this.f32157a == c2243t5.f32157a && Intrinsics.areEqual(this.f32158b, c2243t5.f32158b) && this.f32159c == c2243t5.f32159c;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f32157a) * 31;
        C2266u5 c2266u5 = this.f32158b;
        int hashCode2 = (hashCode + (c2266u5 == null ? 0 : c2266u5.hashCode())) * 31;
        EnumC2289v5 enumC2289v5 = this.f32159c;
        return hashCode2 + (enumC2289v5 != null ? enumC2289v5.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "AdPodItem(duration=" + this.f32157a + ", skip=" + this.f32158b + ", transitionPolicy=" + this.f32159c + ")";
    }
}
