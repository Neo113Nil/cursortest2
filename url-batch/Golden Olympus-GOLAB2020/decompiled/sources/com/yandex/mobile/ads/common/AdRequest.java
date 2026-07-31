package com.yandex.mobile.ads.common;

import android.location.Location;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AdRequest {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f22387a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f22388b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final Location f22389c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f22390d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final List<String> f22391e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final Map<String, String> f22392f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f22393g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private final AdTheme f22394h;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private String f22395a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private String f22396b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private Location f22397c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        private String f22398d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private List<String> f22399e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        private Map<String, String> f22400f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        private String f22401g;

        /* renamed from: h, reason: collision with root package name */
        @Nullable
        private AdTheme f22402h;

        @NotNull
        public final AdRequest build() {
            return new AdRequest(this.f22395a, this.f22396b, this.f22397c, this.f22398d, this.f22399e, this.f22400f, this.f22401g, this.f22402h, null);
        }

        @NotNull
        public final Builder setAge(@Nullable String str) {
            this.f22395a = str;
            return this;
        }

        @NotNull
        public final Builder setBiddingData(@Nullable String str) {
            this.f22401g = str;
            return this;
        }

        @NotNull
        public final Builder setContextQuery(@Nullable String str) {
            this.f22398d = str;
            return this;
        }

        @NotNull
        public final Builder setContextTags(@Nullable List<String> list) {
            this.f22399e = list;
            return this;
        }

        @NotNull
        public final Builder setGender(@Nullable String str) {
            this.f22396b = str;
            return this;
        }

        @NotNull
        public final Builder setLocation(@Nullable Location location) {
            this.f22397c = location;
            return this;
        }

        @NotNull
        public final Builder setParameters(@Nullable Map<String, String> map) {
            this.f22400f = map;
            return this;
        }

        @NotNull
        public final Builder setPreferredTheme(@Nullable AdTheme adTheme) {
            this.f22402h = adTheme;
            return this;
        }
    }

    public /* synthetic */ AdRequest(String str, String str2, Location location, String str3, List list, Map map, String str4, AdTheme adTheme, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, location, str3, list, map, str4, adTheme);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.areEqual(AdRequest.class, obj.getClass())) {
            AdRequest adRequest = (AdRequest) obj;
            if (Intrinsics.areEqual(this.f22387a, adRequest.f22387a) && Intrinsics.areEqual(this.f22388b, adRequest.f22388b) && Intrinsics.areEqual(this.f22390d, adRequest.f22390d) && Intrinsics.areEqual(this.f22391e, adRequest.f22391e) && Intrinsics.areEqual(this.f22389c, adRequest.f22389c) && Intrinsics.areEqual(this.f22392f, adRequest.f22392f) && Intrinsics.areEqual(this.f22393g, adRequest.f22393g) && this.f22394h == adRequest.f22394h) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final String getAge() {
        return this.f22387a;
    }

    @Nullable
    public final String getBiddingData() {
        return this.f22393g;
    }

    @Nullable
    public final String getContextQuery() {
        return this.f22390d;
    }

    @Nullable
    public final List<String> getContextTags() {
        return this.f22391e;
    }

    @Nullable
    public final String getGender() {
        return this.f22388b;
    }

    @Nullable
    public final Location getLocation() {
        return this.f22389c;
    }

    @Nullable
    public final Map<String, String> getParameters() {
        return this.f22392f;
    }

    @Nullable
    public final AdTheme getPreferredTheme() {
        return this.f22394h;
    }

    public int hashCode() {
        String str = this.f22387a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f22388b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22390d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.f22391e;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f22389c;
        int hashCode5 = (hashCode4 + (location != null ? location.hashCode() : 0)) * 31;
        Map<String, String> map = this.f22392f;
        int hashCode6 = (hashCode5 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.f22393g;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.f22394h;
        return hashCode7 + (adTheme != null ? adTheme.hashCode() : 0);
    }

    private AdRequest(String str, String str2, Location location, String str3, List<String> list, Map<String, String> map, String str4, AdTheme adTheme) {
        this.f22387a = str;
        this.f22388b = str2;
        this.f22389c = location;
        this.f22390d = str3;
        this.f22391e = list;
        this.f22392f = map;
        this.f22393g = str4;
        this.f22394h = adTheme;
    }
}
