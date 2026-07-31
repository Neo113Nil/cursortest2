package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class la2 implements yf2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f28495a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final wp0 f28496b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f28497c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<String, List<String>> f28498d;

    public la2(@NotNull String vendor, @Nullable wp0 wp0Var, @Nullable String str, @NotNull HashMap events) {
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f28495a = vendor;
        this.f28496b = wp0Var;
        this.f28497c = str;
        this.f28498d = events;
    }

    @Override // com.yandex.mobile.ads.impl.yf2
    @NotNull
    public final Map<String, List<String>> a() {
        Map<String, List<String>> unmodifiableMap = Collections.unmodifiableMap(this.f28498d);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        return unmodifiableMap;
    }

    @Nullable
    public final wp0 b() {
        return this.f28496b;
    }

    @Nullable
    public final String c() {
        return this.f28497c;
    }

    @NotNull
    public final String d() {
        return this.f28495a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la2)) {
            return false;
        }
        la2 la2Var = (la2) obj;
        return Intrinsics.areEqual(this.f28495a, la2Var.f28495a) && Intrinsics.areEqual(this.f28496b, la2Var.f28496b) && Intrinsics.areEqual(this.f28497c, la2Var.f28497c) && Intrinsics.areEqual(this.f28498d, la2Var.f28498d);
    }

    public final int hashCode() {
        int hashCode = this.f28495a.hashCode() * 31;
        wp0 wp0Var = this.f28496b;
        int hashCode2 = (hashCode + (wp0Var == null ? 0 : wp0Var.hashCode())) * 31;
        String str = this.f28497c;
        return this.f28498d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "Verification(vendor=" + this.f28495a + ", javaScriptResource=" + this.f28496b + ", parameters=" + this.f28497c + ", events=" + this.f28498d + ")";
    }
}
