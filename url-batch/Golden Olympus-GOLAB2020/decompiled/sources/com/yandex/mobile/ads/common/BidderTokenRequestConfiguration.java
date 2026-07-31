package com.yandex.mobile.ads.common;

import com.yandex.mobile.ads.banner.BannerAdSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class BidderTokenRequestConfiguration {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AdType f22431a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final BannerAdSize f22432b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final Map<String, String> f22433c;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final AdType f22434a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private BannerAdSize f22435b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private Map<String, String> f22436c;

        public Builder(@NotNull AdType adType) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            this.f22434a = adType;
        }

        @NotNull
        public final BidderTokenRequestConfiguration build() {
            return new BidderTokenRequestConfiguration(this.f22434a, this.f22435b, this.f22436c, null);
        }

        @NotNull
        public final Builder setBannerAdSize(@Nullable BannerAdSize bannerAdSize) {
            this.f22435b = bannerAdSize;
            return this;
        }

        @NotNull
        public final Builder setParameters(@Nullable Map<String, String> map) {
            this.f22436c = map;
            return this;
        }
    }

    public /* synthetic */ BidderTokenRequestConfiguration(AdType adType, BannerAdSize bannerAdSize, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(adType, bannerAdSize, map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(BidderTokenRequestConfiguration.class, obj.getClass())) {
            return false;
        }
        BidderTokenRequestConfiguration bidderTokenRequestConfiguration = (BidderTokenRequestConfiguration) obj;
        if (this.f22431a == bidderTokenRequestConfiguration.f22431a && Intrinsics.areEqual(this.f22432b, bidderTokenRequestConfiguration.f22432b)) {
            return Intrinsics.areEqual(this.f22433c, bidderTokenRequestConfiguration.f22433c);
        }
        return false;
    }

    @NotNull
    public final AdType getAdType() {
        return this.f22431a;
    }

    @Nullable
    public final BannerAdSize getBannerAdSize() {
        return this.f22432b;
    }

    @Nullable
    public final Map<String, String> getParameters() {
        return this.f22433c;
    }

    public int hashCode() {
        int hashCode = this.f22431a.hashCode() * 31;
        BannerAdSize bannerAdSize = this.f22432b;
        int hashCode2 = (hashCode + (bannerAdSize != null ? bannerAdSize.hashCode() : 0)) * 31;
        Map<String, String> map = this.f22433c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    private BidderTokenRequestConfiguration(AdType adType, BannerAdSize bannerAdSize, Map<String, String> map) {
        this.f22431a = adType;
        this.f22432b = bannerAdSize;
        this.f22433c = map;
    }
}
