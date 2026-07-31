package com.yandex.mobile.ads.feed;

import android.location.Location;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class FeedAdRequestConfiguration {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f22474a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f22475b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f22476c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f22477d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final List<String> f22478e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final Location f22479f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final Map<String, String> f22480g;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f22481a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private String f22482b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private String f22483c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        private String f22484d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private List<String> f22485e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        private Location f22486f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        private Map<String, String> f22487g;

        public Builder(@NotNull String adUnitId) {
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            this.f22481a = adUnitId;
        }

        @NotNull
        public final FeedAdRequestConfiguration build() {
            return new FeedAdRequestConfiguration(this.f22481a, this.f22482b, this.f22483c, this.f22484d, this.f22485e, this.f22486f, this.f22487g);
        }

        @NotNull
        public final Builder setAge(@Nullable String str) {
            this.f22482b = str;
            return this;
        }

        @NotNull
        public final Builder setContextQuery(@Nullable String str) {
            this.f22484d = str;
            return this;
        }

        @NotNull
        public final Builder setContextTags(@Nullable List<String> list) {
            this.f22485e = list;
            return this;
        }

        @NotNull
        public final Builder setGender(@Nullable String str) {
            this.f22483c = str;
            return this;
        }

        @NotNull
        public final Builder setLocation(@Nullable Location location) {
            this.f22486f = location;
            return this;
        }

        @NotNull
        public final Builder setParameters(@Nullable Map<String, String> map) {
            this.f22487g = map;
            return this;
        }
    }

    public FeedAdRequestConfiguration(@NotNull String adUnitId, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, @Nullable Location location, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f22474a = adUnitId;
        this.f22475b = str;
        this.f22476c = str2;
        this.f22477d = str3;
        this.f22478e = list;
        this.f22479f = location;
        this.f22480g = map;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(FeedAdRequestConfiguration.class, obj.getClass())) {
            return false;
        }
        FeedAdRequestConfiguration feedAdRequestConfiguration = (FeedAdRequestConfiguration) obj;
        return Intrinsics.areEqual(this.f22474a, feedAdRequestConfiguration.f22474a) && Intrinsics.areEqual(this.f22475b, feedAdRequestConfiguration.f22475b) && Intrinsics.areEqual(this.f22476c, feedAdRequestConfiguration.f22476c) && Intrinsics.areEqual(this.f22477d, feedAdRequestConfiguration.f22477d) && Intrinsics.areEqual(this.f22478e, feedAdRequestConfiguration.f22478e) && Intrinsics.areEqual(this.f22479f, feedAdRequestConfiguration.f22479f) && Intrinsics.areEqual(this.f22480g, feedAdRequestConfiguration.f22480g);
    }

    @NotNull
    public final String getAdUnitId() {
        return this.f22474a;
    }

    @Nullable
    public final String getAge() {
        return this.f22475b;
    }

    @Nullable
    public final String getContextQuery() {
        return this.f22477d;
    }

    @Nullable
    public final List<String> getContextTags() {
        return this.f22478e;
    }

    @Nullable
    public final String getGender() {
        return this.f22476c;
    }

    @Nullable
    public final Location getLocation() {
        return this.f22479f;
    }

    @Nullable
    public final Map<String, String> getParameters() {
        return this.f22480g;
    }

    public int hashCode() {
        int hashCode = this.f22474a.hashCode() * 31;
        String str = this.f22475b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f22476c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22477d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.f22478e;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f22479f;
        int hashCode6 = (hashCode5 + (location != null ? location.hashCode() : 0)) * 31;
        Map<String, String> map = this.f22480g;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }
}
