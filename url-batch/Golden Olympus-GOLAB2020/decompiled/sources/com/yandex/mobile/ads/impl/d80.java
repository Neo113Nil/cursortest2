package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C2030k0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class d80 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gs f24497a;

    /* renamed from: b, reason: collision with root package name */
    private final long f24498b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2030k0.a f24499c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final c80 f24500d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f24501e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final C1814b f24502f;

    public d80(@NotNull gs adType, long j4, @NotNull C2030k0.a activityInteractionType, @Nullable c80 c80Var, @NotNull Map<String, ? extends Object> reportData, @Nullable C1814b c1814b) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(activityInteractionType, "activityInteractionType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        this.f24497a = adType;
        this.f24498b = j4;
        this.f24499c = activityInteractionType;
        this.f24500d = c80Var;
        this.f24501e = reportData;
        this.f24502f = c1814b;
    }

    @Nullable
    public final C1814b a() {
        return this.f24502f;
    }

    @NotNull
    public final C2030k0.a b() {
        return this.f24499c;
    }

    @NotNull
    public final gs c() {
        return this.f24497a;
    }

    @Nullable
    public final c80 d() {
        return this.f24500d;
    }

    @NotNull
    public final Map<String, Object> e() {
        return this.f24501e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d80)) {
            return false;
        }
        d80 d80Var = (d80) obj;
        return this.f24497a == d80Var.f24497a && this.f24498b == d80Var.f24498b && this.f24499c == d80Var.f24499c && Intrinsics.areEqual(this.f24500d, d80Var.f24500d) && Intrinsics.areEqual(this.f24501e, d80Var.f24501e) && Intrinsics.areEqual(this.f24502f, d80Var.f24502f);
    }

    public final long f() {
        return this.f24498b;
    }

    public final int hashCode() {
        int hashCode = (this.f24499c.hashCode() + ((Long.hashCode(this.f24498b) + (this.f24497a.hashCode() * 31)) * 31)) * 31;
        c80 c80Var = this.f24500d;
        int hashCode2 = (this.f24501e.hashCode() + ((hashCode + (c80Var == null ? 0 : c80Var.hashCode())) * 31)) * 31;
        C1814b c1814b = this.f24502f;
        return hashCode2 + (c1814b != null ? c1814b.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "FalseClickData(adType=" + this.f24497a + ", startTime=" + this.f24498b + ", activityInteractionType=" + this.f24499c + ", falseClick=" + this.f24500d + ", reportData=" + this.f24501e + ", abExperiments=" + this.f24502f + ")";
    }
}
