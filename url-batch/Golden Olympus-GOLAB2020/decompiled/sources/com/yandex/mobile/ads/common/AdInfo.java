package com.yandex.mobile.ads.common;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AdInfo {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f22384a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final AdSize f22385b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f22386c;

    public AdInfo(@NotNull String adUnitId, @Nullable AdSize adSize, @Nullable String str) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f22384a = adUnitId;
        this.f22385b = adSize;
        this.f22386c = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(AdInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.common.AdInfo");
        AdInfo adInfo = (AdInfo) obj;
        return Intrinsics.areEqual(this.f22384a, adInfo.f22384a) && Intrinsics.areEqual(this.f22385b, adInfo.f22385b) && Intrinsics.areEqual(this.f22386c, adInfo.f22386c);
    }

    @Nullable
    public final AdSize getAdSize() {
        return this.f22385b;
    }

    @NotNull
    public final String getAdUnitId() {
        return this.f22384a;
    }

    @Nullable
    public final String getData() {
        return this.f22386c;
    }

    public int hashCode() {
        int hashCode = this.f22384a.hashCode() * 31;
        AdSize adSize = this.f22385b;
        int hashCode2 = (hashCode + (adSize != null ? adSize.hashCode() : 0)) * 31;
        String str = this.f22386c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f22384a;
        AdSize adSize = this.f22385b;
        String adSize2 = adSize != null ? adSize.toString() : null;
        if (adSize2 == null) {
            adSize2 = "";
        }
        String str2 = this.f22386c;
        return "AdSize (adUnitId: " + str + ", adSize: " + adSize2 + ", data: " + (str2 != null ? str2 : "") + ")";
    }

    public /* synthetic */ AdInfo(String str, AdSize adSize, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, adSize, (i4 & 4) != 0 ? null : str2);
    }
}
