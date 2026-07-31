package com.yandex.mobile.ads.impl;

import android.location.Location;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.f7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1918f7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f25667a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f25668b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f25669c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f25670d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final List<String> f25671e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final Location f25672f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final Map<String, String> f25673g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private final String f25674h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private final String f25675i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private final gq1 f25676j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f25677k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private final String f25678l;

    /* renamed from: com.yandex.mobile.ads.impl.f7$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f25679a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private String f25680b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private String f25681c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        private Location f25682d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private String f25683e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        private List<String> f25684f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        private Map<String, String> f25685g;

        /* renamed from: h, reason: collision with root package name */
        @Nullable
        private String f25686h;

        /* renamed from: i, reason: collision with root package name */
        @Nullable
        private String f25687i;

        /* renamed from: j, reason: collision with root package name */
        @Nullable
        private gq1 f25688j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f25689k;

        public a(@NotNull String adUnitId) {
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            this.f25679a = adUnitId;
        }

        @NotNull
        public final C1918f7 a() {
            return new C1918f7(this.f25679a, this.f25680b, this.f25681c, this.f25683e, this.f25684f, this.f25682d, this.f25685g, this.f25686h, this.f25687i, this.f25688j, this.f25689k, null);
        }

        @NotNull
        public final a b(@Nullable String str) {
            this.f25683e = str;
            return this;
        }

        @NotNull
        public final a c(@Nullable String str) {
            this.f25681c = str;
            return this;
        }

        @NotNull
        public final a d(@Nullable String str) {
            this.f25686h = str;
            return this;
        }

        @NotNull
        public final a b() {
            this.f25687i = null;
            return this;
        }

        @NotNull
        public final a a(@Nullable String str) {
            this.f25680b = str;
            return this;
        }

        @NotNull
        public final a a(@Nullable List<String> list) {
            this.f25684f = list;
            return this;
        }

        @NotNull
        public final a a(@Nullable Location location) {
            this.f25682d = location;
            return this;
        }

        @NotNull
        public final a a(@Nullable Map<String, String> map) {
            this.f25685g = map;
            return this;
        }

        @NotNull
        public final a a(@Nullable gq1 gq1Var) {
            this.f25688j = gq1Var;
            return this;
        }

        @NotNull
        public final a a(boolean z4) {
            this.f25689k = z4;
            return this;
        }
    }

    public C1918f7(@NotNull String adUnitId, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, @Nullable Location location, @Nullable Map<String, String> map, @Nullable String str4, @Nullable String str5, @Nullable gq1 gq1Var, boolean z4, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f25667a = adUnitId;
        this.f25668b = str;
        this.f25669c = str2;
        this.f25670d = str3;
        this.f25671e = list;
        this.f25672f = location;
        this.f25673g = map;
        this.f25674h = str4;
        this.f25675i = str5;
        this.f25676j = gq1Var;
        this.f25677k = z4;
        this.f25678l = str6;
    }

    public static C1918f7 a(C1918f7 c1918f7, Map map, String str, int i4) {
        String adUnitId = c1918f7.f25667a;
        String str2 = c1918f7.f25668b;
        String str3 = c1918f7.f25669c;
        String str4 = c1918f7.f25670d;
        List<String> list = c1918f7.f25671e;
        Location location = c1918f7.f25672f;
        if ((i4 & 64) != 0) {
            map = c1918f7.f25673g;
        }
        Map map2 = map;
        String str5 = c1918f7.f25674h;
        String str6 = c1918f7.f25675i;
        gq1 gq1Var = c1918f7.f25676j;
        boolean z4 = c1918f7.f25677k;
        if ((i4 & com.ironsource.mediationsdk.metadata.a.f17688n) != 0) {
            str = c1918f7.f25678l;
        }
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return new C1918f7(adUnitId, str2, str3, str4, list, location, map2, str5, str6, gq1Var, z4, str);
    }

    @Nullable
    public final String b() {
        return this.f25668b;
    }

    @Nullable
    public final String c() {
        return this.f25670d;
    }

    @Nullable
    public final List<String> d() {
        return this.f25671e;
    }

    @Nullable
    public final String e() {
        return this.f25669c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1918f7)) {
            return false;
        }
        C1918f7 c1918f7 = (C1918f7) obj;
        return Intrinsics.areEqual(this.f25667a, c1918f7.f25667a) && Intrinsics.areEqual(this.f25668b, c1918f7.f25668b) && Intrinsics.areEqual(this.f25669c, c1918f7.f25669c) && Intrinsics.areEqual(this.f25670d, c1918f7.f25670d) && Intrinsics.areEqual(this.f25671e, c1918f7.f25671e) && Intrinsics.areEqual(this.f25672f, c1918f7.f25672f) && Intrinsics.areEqual(this.f25673g, c1918f7.f25673g) && Intrinsics.areEqual(this.f25674h, c1918f7.f25674h) && Intrinsics.areEqual(this.f25675i, c1918f7.f25675i) && this.f25676j == c1918f7.f25676j && this.f25677k == c1918f7.f25677k && Intrinsics.areEqual(this.f25678l, c1918f7.f25678l);
    }

    @Nullable
    public final Location f() {
        return this.f25672f;
    }

    @Nullable
    public final String g() {
        return this.f25674h;
    }

    @Nullable
    public final Map<String, String> h() {
        return this.f25673g;
    }

    public final int hashCode() {
        int hashCode = this.f25667a.hashCode() * 31;
        String str = this.f25668b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25669c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25670d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.f25671e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Location location = this.f25672f;
        int hashCode6 = (hashCode5 + (location == null ? 0 : location.hashCode())) * 31;
        Map<String, String> map = this.f25673g;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.f25674h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f25675i;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        gq1 gq1Var = this.f25676j;
        int a4 = C1965h6.a(this.f25677k, (hashCode9 + (gq1Var == null ? 0 : gq1Var.hashCode())) * 31, 31);
        String str6 = this.f25678l;
        return a4 + (str6 != null ? str6.hashCode() : 0);
    }

    @Nullable
    public final gq1 i() {
        return this.f25676j;
    }

    @Nullable
    public final String j() {
        return this.f25678l;
    }

    @Nullable
    public final String k() {
        return this.f25675i;
    }

    public final boolean l() {
        return this.f25677k;
    }

    @NotNull
    public final String toString() {
        return "AdRequestData(adUnitId=" + this.f25667a + ", age=" + this.f25668b + ", gender=" + this.f25669c + ", contextQuery=" + this.f25670d + ", contextTags=" + this.f25671e + ", location=" + this.f25672f + ", parameters=" + this.f25673g + ", openBiddingData=" + this.f25674h + ", readyResponse=" + this.f25675i + ", preferredTheme=" + this.f25676j + ", shouldLoadImagesAutomatically=" + this.f25677k + ", preloadType=" + this.f25678l + ")";
    }

    @NotNull
    public final String a() {
        return this.f25667a;
    }
}
