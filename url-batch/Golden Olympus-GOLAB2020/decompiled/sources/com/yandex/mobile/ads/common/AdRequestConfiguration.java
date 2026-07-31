package com.yandex.mobile.ads.common;

import android.location.Location;
import com.yandex.mobile.ads.impl.C1842c3;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AdRequestConfiguration {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f22403a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f22404b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f22405c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f22406d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final List<String> f22407e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final Location f22408f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final Map<String, String> f22409g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private final String f22410h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private final AdTheme f22411i;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f22412a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private String f22413b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private String f22414c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        private Location f22415d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private String f22416e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        private List<String> f22417f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        private Map<String, String> f22418g;

        /* renamed from: h, reason: collision with root package name */
        @Nullable
        private String f22419h;

        /* renamed from: i, reason: collision with root package name */
        @Nullable
        private AdTheme f22420i;

        public Builder(@NotNull String adUnitId) {
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            this.f22412a = adUnitId;
        }

        @NotNull
        public final AdRequestConfiguration build() {
            return new AdRequestConfiguration(this.f22412a, this.f22413b, this.f22414c, this.f22416e, this.f22417f, this.f22415d, this.f22418g, this.f22419h, this.f22420i, null);
        }

        @NotNull
        public final Builder setAge(@Nullable String str) {
            this.f22413b = str;
            return this;
        }

        @NotNull
        public final Builder setBiddingData(@Nullable String str) {
            this.f22419h = str;
            return this;
        }

        @NotNull
        public final Builder setContextQuery(@Nullable String str) {
            this.f22416e = str;
            return this;
        }

        @NotNull
        public final Builder setContextTags(@Nullable List<String> list) {
            this.f22417f = list;
            return this;
        }

        @NotNull
        public final Builder setGender(@Nullable String str) {
            this.f22414c = str;
            return this;
        }

        @NotNull
        public final Builder setLocation(@Nullable Location location) {
            this.f22415d = location;
            return this;
        }

        @NotNull
        public final Builder setParameters(@Nullable Map<String, String> map) {
            this.f22418g = map;
            return this;
        }

        @NotNull
        public final Builder setPreferredTheme(@Nullable AdTheme adTheme) {
            this.f22420i = adTheme;
            return this;
        }
    }

    public /* synthetic */ AdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, location, map, str5, adTheme);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.areEqual(AdRequestConfiguration.class, obj.getClass())) {
            AdRequestConfiguration adRequestConfiguration = (AdRequestConfiguration) obj;
            if (Intrinsics.areEqual(this.f22403a, adRequestConfiguration.f22403a) && Intrinsics.areEqual(this.f22404b, adRequestConfiguration.f22404b) && Intrinsics.areEqual(this.f22405c, adRequestConfiguration.f22405c) && Intrinsics.areEqual(this.f22406d, adRequestConfiguration.f22406d) && Intrinsics.areEqual(this.f22407e, adRequestConfiguration.f22407e) && Intrinsics.areEqual(this.f22408f, adRequestConfiguration.f22408f) && Intrinsics.areEqual(this.f22409g, adRequestConfiguration.f22409g) && Intrinsics.areEqual(this.f22410h, adRequestConfiguration.f22410h) && this.f22411i == adRequestConfiguration.f22411i) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String getAdUnitId() {
        return this.f22403a;
    }

    @Nullable
    public final String getAge() {
        return this.f22404b;
    }

    @Nullable
    public final String getBiddingData() {
        return this.f22410h;
    }

    @Nullable
    public final String getContextQuery() {
        return this.f22406d;
    }

    @Nullable
    public final List<String> getContextTags() {
        return this.f22407e;
    }

    @Nullable
    public final String getGender() {
        return this.f22405c;
    }

    @Nullable
    public final Location getLocation() {
        return this.f22408f;
    }

    @Nullable
    public final Map<String, String> getParameters() {
        return this.f22409g;
    }

    @Nullable
    public final AdTheme getPreferredTheme() {
        return this.f22411i;
    }

    public int hashCode() {
        String str = this.f22404b;
        int a4 = C1842c3.a(this.f22403a, (str != null ? str.hashCode() : 0) * 31, 31);
        String str2 = this.f22405c;
        int hashCode = (a4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22406d;
        int hashCode2 = (hashCode + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.f22407e;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f22408f;
        int hashCode4 = (hashCode3 + (location != null ? location.hashCode() : 0)) * 31;
        Map<String, String> map = this.f22409g;
        int hashCode5 = (hashCode4 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.f22410h;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.f22411i;
        return hashCode6 + (adTheme != null ? adTheme.hashCode() : 0);
    }

    private AdRequestConfiguration(String str, String str2, String str3, String str4, List<String> list, Location location, Map<String, String> map, String str5, AdTheme adTheme) {
        this.f22403a = str;
        this.f22404b = str2;
        this.f22405c = str3;
        this.f22406d = str4;
        this.f22407e = list;
        this.f22408f = location;
        this.f22409g = map;
        this.f22410h = str5;
        this.f22411i = adTheme;
    }
}
