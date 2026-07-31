package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ab2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<ob2<ya1>> f23215a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final pf2 f23216b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final ej0 f23217c;

    public ab2(@NotNull List<ob2<ya1>> videoAdsInfo, @Nullable pf2 pf2Var, @Nullable ej0 ej0Var) {
        Intrinsics.checkNotNullParameter(videoAdsInfo, "videoAdsInfo");
        this.f23215a = videoAdsInfo;
        this.f23216b = pf2Var;
        this.f23217c = ej0Var;
    }

    public static ab2 a(ab2 ab2Var, List videoAdsInfo) {
        pf2 pf2Var = ab2Var.f23216b;
        ej0 ej0Var = ab2Var.f23217c;
        Intrinsics.checkNotNullParameter(videoAdsInfo, "videoAdsInfo");
        return new ab2(videoAdsInfo, pf2Var, ej0Var);
    }

    @NotNull
    public final ob2<ya1> b() {
        return (ob2) CollectionsKt.first((List) this.f23215a);
    }

    @NotNull
    public final List<ob2<ya1>> c() {
        return this.f23215a;
    }

    @Nullable
    public final pf2 d() {
        return this.f23216b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab2)) {
            return false;
        }
        ab2 ab2Var = (ab2) obj;
        return Intrinsics.areEqual(this.f23215a, ab2Var.f23215a) && Intrinsics.areEqual(this.f23216b, ab2Var.f23216b) && Intrinsics.areEqual(this.f23217c, ab2Var.f23217c);
    }

    public final int hashCode() {
        int hashCode = this.f23215a.hashCode() * 31;
        pf2 pf2Var = this.f23216b;
        int hashCode2 = (hashCode + (pf2Var == null ? 0 : pf2Var.hashCode())) * 31;
        ej0 ej0Var = this.f23217c;
        return hashCode2 + (ej0Var != null ? ej0Var.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "Video(videoAdsInfo=" + this.f23215a + ", videoSettings=" + this.f23216b + ", preview=" + this.f23217c + ")";
    }

    @Nullable
    public final ej0 a() {
        return this.f23217c;
    }
}
