package com.yandex.mobile.ads.nativeads;

import android.location.Location;
import com.yandex.mobile.ads.common.AdTheme;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class NativeAdRequestConfiguration {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f35867a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f35868b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f35869c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f35870d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final List<String> f35871e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final Location f35872f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final Map<String, String> f35873g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private final String f35874h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private final AdTheme f35875i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f35876j;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f35877a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private String f35878b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private String f35879c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        private Location f35880d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private String f35881e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        private List<String> f35882f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        private Map<String, String> f35883g;

        /* renamed from: h, reason: collision with root package name */
        @Nullable
        private String f35884h;

        /* renamed from: i, reason: collision with root package name */
        @Nullable
        private AdTheme f35885i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f35886j;

        public Builder(@NotNull String adUnitId) {
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            this.f35877a = adUnitId;
            this.f35886j = true;
        }

        @NotNull
        public final NativeAdRequestConfiguration build() {
            return new NativeAdRequestConfiguration(this.f35877a, this.f35878b, this.f35879c, this.f35881e, this.f35882f, this.f35880d, this.f35883g, this.f35884h, this.f35885i, this.f35886j, null);
        }

        @NotNull
        public final Builder setAge(@NotNull String age) {
            Intrinsics.checkNotNullParameter(age, "age");
            this.f35878b = age;
            return this;
        }

        @NotNull
        public final Builder setBiddingData(@NotNull String biddingData) {
            Intrinsics.checkNotNullParameter(biddingData, "biddingData");
            this.f35884h = biddingData;
            return this;
        }

        @NotNull
        public final Builder setContextQuery(@NotNull String contextQuery) {
            Intrinsics.checkNotNullParameter(contextQuery, "contextQuery");
            this.f35881e = contextQuery;
            return this;
        }

        @NotNull
        public final Builder setContextTags(@NotNull List<String> contextTags) {
            Intrinsics.checkNotNullParameter(contextTags, "contextTags");
            this.f35882f = contextTags;
            return this;
        }

        @NotNull
        public final Builder setGender(@NotNull String gender) {
            Intrinsics.checkNotNullParameter(gender, "gender");
            this.f35879c = gender;
            return this;
        }

        @NotNull
        public final Builder setLocation(@NotNull Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            this.f35880d = location;
            return this;
        }

        @NotNull
        public final Builder setParameters(@NotNull Map<String, String> parameters) {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.f35883g = parameters;
            return this;
        }

        @NotNull
        public final Builder setPreferredTheme(@NotNull AdTheme preferredTheme) {
            Intrinsics.checkNotNullParameter(preferredTheme, "preferredTheme");
            this.f35885i = preferredTheme;
            return this;
        }

        @NotNull
        public final Builder setShouldLoadImagesAutomatically(boolean z4) {
            this.f35886j = z4;
            return this;
        }
    }

    public /* synthetic */ NativeAdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, location, map, str5, adTheme, z4);
    }

    @NotNull
    public final String getAdUnitId() {
        return this.f35867a;
    }

    @Nullable
    public final String getAge() {
        return this.f35868b;
    }

    @Nullable
    public final String getBiddingData() {
        return this.f35874h;
    }

    @Nullable
    public final String getContextQuery() {
        return this.f35870d;
    }

    @Nullable
    public final List<String> getContextTags() {
        return this.f35871e;
    }

    @Nullable
    public final String getGender() {
        return this.f35869c;
    }

    @Nullable
    public final Location getLocation() {
        return this.f35872f;
    }

    @Nullable
    public final Map<String, String> getParameters() {
        return this.f35873g;
    }

    @Nullable
    public final AdTheme getPreferredTheme() {
        return this.f35875i;
    }

    public final boolean getShouldLoadImagesAutomatically() {
        return this.f35876j;
    }

    private NativeAdRequestConfiguration(String str, String str2, String str3, String str4, List<String> list, Location location, Map<String, String> map, String str5, AdTheme adTheme, boolean z4) {
        this.f35867a = str;
        this.f35868b = str2;
        this.f35869c = str3;
        this.f35870d = str4;
        this.f35871e = list;
        this.f35872f = location;
        this.f35873g = map;
        this.f35874h = str5;
        this.f35875i = adTheme;
        this.f35876j = z4;
    }
}
