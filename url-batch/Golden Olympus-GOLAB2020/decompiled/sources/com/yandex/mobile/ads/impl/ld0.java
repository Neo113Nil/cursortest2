package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ld0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f28511a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f28512b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f28513c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f28514d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final List<String> f28515e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final Map<String, String> f28516f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final gq1 f28517g;

    public ld0(@NotNull String adUnitId, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, @Nullable Map<String, String> map, @Nullable gq1 gq1Var) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f28511a = adUnitId;
        this.f28512b = str;
        this.f28513c = str2;
        this.f28514d = str3;
        this.f28515e = list;
        this.f28516f = map;
        this.f28517g = gq1Var;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld0)) {
            return false;
        }
        ld0 ld0Var = (ld0) obj;
        return Intrinsics.areEqual(this.f28511a, ld0Var.f28511a) && Intrinsics.areEqual(this.f28512b, ld0Var.f28512b) && Intrinsics.areEqual(this.f28513c, ld0Var.f28513c) && Intrinsics.areEqual(this.f28514d, ld0Var.f28514d) && Intrinsics.areEqual(this.f28515e, ld0Var.f28515e) && Intrinsics.areEqual(this.f28516f, ld0Var.f28516f) && this.f28517g == ld0Var.f28517g;
    }

    public final int hashCode() {
        int hashCode = this.f28511a.hashCode() * 31;
        String str = this.f28512b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28513c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f28514d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.f28515e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, String> map = this.f28516f;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        gq1 gq1Var = this.f28517g;
        return hashCode6 + (gq1Var != null ? gq1Var.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "FullscreenCacheParams(adUnitId=" + this.f28511a + ", age=" + this.f28512b + ", gender=" + this.f28513c + ", contextQuery=" + this.f28514d + ", contextTags=" + this.f28515e + ", parameters=" + this.f28516f + ", preferredTheme=" + this.f28517g + ")";
    }
}
