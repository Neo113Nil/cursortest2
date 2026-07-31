package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1482i2 {

    /* renamed from: a, reason: collision with root package name */
    private final long f16652a;

    public C1482i2(long j4) {
        this.f16652a = j4;
    }

    public final long a() {
        return this.f16652a;
    }

    public final long b() {
        return this.f16652a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1482i2) && this.f16652a == ((C1482i2) obj).f16652a;
    }

    public int hashCode() {
        return Long.hashCode(this.f16652a);
    }

    @NotNull
    public String toString() {
        return "AdUnitInteractionData(impressionTimeout=" + this.f16652a + ')';
    }

    @NotNull
    public final C1482i2 a(long j4) {
        return new C1482i2(j4);
    }

    public static /* synthetic */ C1482i2 a(C1482i2 c1482i2, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = c1482i2.f16652a;
        }
        return c1482i2.a(j4);
    }
}
