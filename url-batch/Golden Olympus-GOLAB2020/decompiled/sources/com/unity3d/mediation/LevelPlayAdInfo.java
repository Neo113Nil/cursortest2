package com.unity3d.mediation;

import com.ironsource.bm;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class LevelPlayAdInfo {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f21943a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f21944b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f21945c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final ImpressionData f21946d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final bm f21947e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final LevelPlayAdSize f21948f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f21949g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdInfo(@NotNull LevelPlayAdInfo adInfo, @Nullable String str) {
        this(adInfo.f21943a, adInfo.f21944b, adInfo.f21945c, adInfo.f21946d, adInfo.f21947e, adInfo.f21948f, str);
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    private final String a() {
        return this.f21943a;
    }

    private final String b() {
        return this.f21944b;
    }

    private final String c() {
        return this.f21945c;
    }

    public static /* synthetic */ LevelPlayAdInfo copy$default(LevelPlayAdInfo levelPlayAdInfo, String str, String str2, String str3, ImpressionData impressionData, bm bmVar, LevelPlayAdSize levelPlayAdSize, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = levelPlayAdInfo.f21943a;
        }
        if ((i4 & 2) != 0) {
            str2 = levelPlayAdInfo.f21944b;
        }
        if ((i4 & 4) != 0) {
            str3 = levelPlayAdInfo.f21945c;
        }
        if ((i4 & 8) != 0) {
            impressionData = levelPlayAdInfo.f21946d;
        }
        if ((i4 & 16) != 0) {
            bmVar = levelPlayAdInfo.f21947e;
        }
        if ((i4 & 32) != 0) {
            levelPlayAdSize = levelPlayAdInfo.f21948f;
        }
        if ((i4 & 64) != 0) {
            str4 = levelPlayAdInfo.f21949g;
        }
        LevelPlayAdSize levelPlayAdSize2 = levelPlayAdSize;
        String str5 = str4;
        bm bmVar2 = bmVar;
        String str6 = str3;
        return levelPlayAdInfo.copy(str, str2, str6, impressionData, bmVar2, levelPlayAdSize2, str5);
    }

    private final ImpressionData d() {
        return this.f21946d;
    }

    private final bm e() {
        return this.f21947e;
    }

    private final LevelPlayAdSize f() {
        return this.f21948f;
    }

    private final String g() {
        return this.f21949g;
    }

    @NotNull
    public final LevelPlayAdInfo copy(@NotNull String adId, @NotNull String adUnitId, @NotNull String adFormat, @Nullable ImpressionData impressionData, @Nullable bm bmVar, @Nullable LevelPlayAdSize levelPlayAdSize, @Nullable String str) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return new LevelPlayAdInfo(adId, adUnitId, adFormat, impressionData, bmVar, levelPlayAdSize, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayAdInfo)) {
            return false;
        }
        LevelPlayAdInfo levelPlayAdInfo = (LevelPlayAdInfo) obj;
        return Intrinsics.areEqual(this.f21943a, levelPlayAdInfo.f21943a) && Intrinsics.areEqual(this.f21944b, levelPlayAdInfo.f21944b) && Intrinsics.areEqual(this.f21945c, levelPlayAdInfo.f21945c) && Intrinsics.areEqual(this.f21946d, levelPlayAdInfo.f21946d) && Intrinsics.areEqual(this.f21947e, levelPlayAdInfo.f21947e) && Intrinsics.areEqual(this.f21948f, levelPlayAdInfo.f21948f) && Intrinsics.areEqual(this.f21949g, levelPlayAdInfo.f21949g);
    }

    @NotNull
    public final String getAb() {
        ImpressionData impressionData = this.f21946d;
        String ab = impressionData != null ? impressionData.getAb() : null;
        return ab == null ? "" : ab;
    }

    @NotNull
    public final String getAdFormat() {
        ImpressionData impressionData = this.f21946d;
        String adFormat = impressionData != null ? impressionData.getAdFormat() : null;
        return adFormat == null ? this.f21945c : adFormat;
    }

    @NotNull
    public final String getAdId() {
        return this.f21943a;
    }

    @NotNull
    public final String getAdNetwork() {
        ImpressionData impressionData = this.f21946d;
        String adNetwork = impressionData != null ? impressionData.getAdNetwork() : null;
        return adNetwork == null ? "" : adNetwork;
    }

    @Nullable
    public final LevelPlayAdSize getAdSize() {
        return this.f21948f;
    }

    @NotNull
    public final String getAdUnitId() {
        ImpressionData impressionData = this.f21946d;
        String mediationAdUnitId = impressionData != null ? impressionData.getMediationAdUnitId() : null;
        return mediationAdUnitId == null ? this.f21944b : mediationAdUnitId;
    }

    @NotNull
    public final String getAdUnitName() {
        ImpressionData impressionData = this.f21946d;
        String mediationAdUnitName = impressionData != null ? impressionData.getMediationAdUnitName() : null;
        return mediationAdUnitName == null ? "" : mediationAdUnitName;
    }

    @NotNull
    public final String getAuctionId() {
        ImpressionData impressionData = this.f21946d;
        String auctionId = impressionData != null ? impressionData.getAuctionId() : null;
        return auctionId == null ? "" : auctionId;
    }

    @NotNull
    public final String getCountry() {
        ImpressionData impressionData = this.f21946d;
        String country = impressionData != null ? impressionData.getCountry() : null;
        return country == null ? "" : country;
    }

    @NotNull
    public final String getCreativeId() {
        ImpressionData impressionData = this.f21946d;
        String creativeId = impressionData != null ? impressionData.getCreativeId() : null;
        return creativeId == null ? "" : creativeId;
    }

    @NotNull
    public final String getEncryptedCPM() {
        ImpressionData impressionData = this.f21946d;
        String encryptedCPM = impressionData != null ? impressionData.getEncryptedCPM() : null;
        return encryptedCPM == null ? "" : encryptedCPM;
    }

    @NotNull
    public final String getInstanceId() {
        ImpressionData impressionData = this.f21946d;
        String instanceId = impressionData != null ? impressionData.getInstanceId() : null;
        return instanceId == null ? "" : instanceId;
    }

    @NotNull
    public final String getInstanceName() {
        ImpressionData impressionData = this.f21946d;
        String instanceName = impressionData != null ? impressionData.getInstanceName() : null;
        return instanceName == null ? "" : instanceName;
    }

    @NotNull
    public final String getPlacementName() {
        String str = this.f21949g;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getPrecision() {
        String c4;
        bm bmVar = this.f21947e;
        if (bmVar != null && (c4 = bmVar.c()) != null) {
            return c4;
        }
        ImpressionData impressionData = this.f21946d;
        String precision = impressionData != null ? impressionData.getPrecision() : null;
        return precision == null ? "" : precision;
    }

    public final double getRevenue() {
        bm bmVar = this.f21947e;
        if (bmVar != null) {
            return bmVar.d();
        }
        ImpressionData impressionData = this.f21946d;
        Double revenue = impressionData != null ? impressionData.getRevenue() : null;
        if (revenue != null) {
            return revenue.doubleValue();
        }
        return 0.0d;
    }

    @NotNull
    public final String getSegmentName() {
        ImpressionData impressionData = this.f21946d;
        String segmentName = impressionData != null ? impressionData.getSegmentName() : null;
        return segmentName == null ? "" : segmentName;
    }

    public int hashCode() {
        int hashCode = ((((this.f21943a.hashCode() * 31) + this.f21944b.hashCode()) * 31) + this.f21945c.hashCode()) * 31;
        ImpressionData impressionData = this.f21946d;
        int hashCode2 = (hashCode + (impressionData == null ? 0 : impressionData.hashCode())) * 31;
        bm bmVar = this.f21947e;
        int hashCode3 = (hashCode2 + (bmVar == null ? 0 : bmVar.hashCode())) * 31;
        LevelPlayAdSize levelPlayAdSize = this.f21948f;
        int hashCode4 = (hashCode3 + (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode())) * 31;
        String str = this.f21949g;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "adId: " + getAdId() + ", adUnitId: " + getAdUnitId() + ", adUnitName: " + getAdUnitName() + ", adSize: " + this.f21948f + ", adFormat: " + getAdFormat() + ", placementName: " + getPlacementName() + ", auctionId: " + getAuctionId() + ", country: " + getCountry() + ", ab: " + getAb() + ", segmentName: " + getSegmentName() + ", adNetwork: " + getAdNetwork() + ", instanceName: " + getInstanceName() + ", instanceId: " + getInstanceId() + ", revenue: " + getRevenue() + ", precision: " + getPrecision() + ", encryptedCPM: " + getEncryptedCPM() + ", creativeId: " + getCreativeId();
    }

    public LevelPlayAdInfo(@NotNull String adId, @NotNull String adUnitId, @NotNull String adFormat, @Nullable ImpressionData impressionData, @Nullable bm bmVar, @Nullable LevelPlayAdSize levelPlayAdSize, @Nullable String str) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f21943a = adId;
        this.f21944b = adUnitId;
        this.f21945c = adFormat;
        this.f21946d = impressionData;
        this.f21947e = bmVar;
        this.f21948f = levelPlayAdSize;
        this.f21949g = str;
    }

    public /* synthetic */ LevelPlayAdInfo(String str, String str2, String str3, ImpressionData impressionData, bm bmVar, LevelPlayAdSize levelPlayAdSize, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i4 & 8) != 0 ? null : impressionData, (i4 & 16) != 0 ? null : bmVar, (i4 & 32) != 0 ? null : levelPlayAdSize, (i4 & 64) != 0 ? null : str4);
    }
}
