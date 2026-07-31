package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.jb2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bb2 implements yf2 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23671a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<hu> f23672b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, List<String>> f23673c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final jb2 f23674d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f23675e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f23676f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f23677g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private final String f23678h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private final String f23679i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private final oh2 f23680j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private final Integer f23681k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private final String f23682l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private final kk2 f23683m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final List<la2> f23684n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final Map<String, List<String>> f23685o;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f23686a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final gd2 f23687b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private kk2 f23688c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        private String f23689d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private String f23690e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        private String f23691f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        private String f23692g;

        /* renamed from: h, reason: collision with root package name */
        @Nullable
        private String f23693h;

        /* renamed from: i, reason: collision with root package name */
        @Nullable
        private oh2 f23694i;

        /* renamed from: j, reason: collision with root package name */
        @Nullable
        private Integer f23695j;

        /* renamed from: k, reason: collision with root package name */
        @Nullable
        private String f23696k;

        /* renamed from: l, reason: collision with root package name */
        @NotNull
        private final ArrayList f23697l;

        /* renamed from: m, reason: collision with root package name */
        @NotNull
        private final ArrayList f23698m;

        /* renamed from: n, reason: collision with root package name */
        @NotNull
        private final LinkedHashMap f23699n;

        /* renamed from: o, reason: collision with root package name */
        @NotNull
        private jb2 f23700o;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Context context, boolean z4) {
            this(z4, new gd2(context));
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @NotNull
        public final a a(@Nullable List list) {
            ArrayList arrayList = this.f23698m;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            arrayList.addAll(list);
            return this;
        }

        @NotNull
        public final void b(@NotNull String impression) {
            Intrinsics.checkNotNullParameter(impression, "impression");
            LinkedHashMap linkedHashMap = this.f23699n;
            Object obj = linkedHashMap.get(com.ironsource.c9.f15701e);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(com.ironsource.c9.f15701e, obj);
            }
            ((List) obj).add(impression);
        }

        @NotNull
        public final a c(@Nullable String str) {
            this.f23689d = str;
            return this;
        }

        @NotNull
        public final a d(@Nullable String str) {
            this.f23690e = str;
            return this;
        }

        @NotNull
        public final a e(@Nullable String str) {
            this.f23691f = str;
            return this;
        }

        @NotNull
        public final a f(@Nullable String str) {
            this.f23696k = str;
            return this;
        }

        @NotNull
        public final a g(@Nullable String str) {
            this.f23692g = str;
            return this;
        }

        @NotNull
        public final a h(@Nullable String str) {
            this.f23693h = str;
            return this;
        }

        @NotNull
        public final a a(@Nullable ArrayList arrayList) {
            this.f23697l.addAll(arrayList);
            return this;
        }

        private a(boolean z4, gd2 gd2Var) {
            this.f23686a = z4;
            this.f23687b = gd2Var;
            this.f23697l = new ArrayList();
            this.f23698m = new ArrayList();
            MapsKt.emptyMap();
            this.f23699n = new LinkedHashMap();
            this.f23700o = new jb2.a().a();
        }

        @NotNull
        public final void a(@NotNull String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            LinkedHashMap linkedHashMap = this.f23699n;
            Object obj = linkedHashMap.get("error");
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put("error", obj);
            }
            ((List) obj).add(error);
        }

        @NotNull
        public final a a(@Nullable Map<String, ? extends List<String>> map) {
            if (map == null) {
                map = MapsKt.emptyMap();
            }
            for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (value == null) {
                    value = CollectionsKt.emptyList();
                }
                for (String str : CollectionsKt.filterNotNull(value)) {
                    LinkedHashMap linkedHashMap = this.f23699n;
                    Object obj = linkedHashMap.get(key);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(key, obj);
                    }
                    ((List) obj).add(str);
                }
            }
            return this;
        }

        @NotNull
        public final bb2 a() {
            return new bb2(this.f23686a, this.f23697l, this.f23699n, this.f23700o, this.f23689d, this.f23690e, this.f23691f, this.f23692g, this.f23693h, this.f23694i, this.f23695j, this.f23696k, this.f23688c, this.f23698m, this.f23687b.a(this.f23699n, this.f23694i));
        }

        @NotNull
        public final void a(@Nullable Integer num) {
            this.f23695j = num;
        }

        @NotNull
        public final a a(@NotNull jb2 videoAdExtensions) {
            Intrinsics.checkNotNullParameter(videoAdExtensions, "videoAdExtensions");
            this.f23700o = videoAdExtensions;
            return this;
        }

        @NotNull
        public final a a(@NotNull oh2 viewableImpression) {
            Intrinsics.checkNotNullParameter(viewableImpression, "viewableImpression");
            this.f23694i = viewableImpression;
            return this;
        }

        @NotNull
        public final a a(@Nullable kk2 kk2Var) {
            this.f23688c = kk2Var;
            return this;
        }
    }

    public bb2(boolean z4, @NotNull ArrayList creatives, @NotNull LinkedHashMap rawTrackingEvents, @NotNull jb2 videoAdExtensions, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable oh2 oh2Var, @Nullable Integer num, @Nullable String str6, @Nullable kk2 kk2Var, @NotNull ArrayList adVerifications, @NotNull Map trackingEvents) {
        Intrinsics.checkNotNullParameter(creatives, "creatives");
        Intrinsics.checkNotNullParameter(rawTrackingEvents, "rawTrackingEvents");
        Intrinsics.checkNotNullParameter(videoAdExtensions, "videoAdExtensions");
        Intrinsics.checkNotNullParameter(adVerifications, "adVerifications");
        Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
        this.f23671a = z4;
        this.f23672b = creatives;
        this.f23673c = rawTrackingEvents;
        this.f23674d = videoAdExtensions;
        this.f23675e = str;
        this.f23676f = str2;
        this.f23677g = str3;
        this.f23678h = str4;
        this.f23679i = str5;
        this.f23680j = oh2Var;
        this.f23681k = num;
        this.f23682l = str6;
        this.f23683m = kk2Var;
        this.f23684n = adVerifications;
        this.f23685o = trackingEvents;
    }

    @Override // com.yandex.mobile.ads.impl.yf2
    @NotNull
    public final Map<String, List<String>> a() {
        return this.f23685o;
    }

    @Nullable
    public final String b() {
        return this.f23675e;
    }

    @Nullable
    public final String c() {
        return this.f23676f;
    }

    @NotNull
    public final List<la2> d() {
        return this.f23684n;
    }

    @NotNull
    public final List<hu> e() {
        return this.f23672b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb2)) {
            return false;
        }
        bb2 bb2Var = (bb2) obj;
        return this.f23671a == bb2Var.f23671a && Intrinsics.areEqual(this.f23672b, bb2Var.f23672b) && Intrinsics.areEqual(this.f23673c, bb2Var.f23673c) && Intrinsics.areEqual(this.f23674d, bb2Var.f23674d) && Intrinsics.areEqual(this.f23675e, bb2Var.f23675e) && Intrinsics.areEqual(this.f23676f, bb2Var.f23676f) && Intrinsics.areEqual(this.f23677g, bb2Var.f23677g) && Intrinsics.areEqual(this.f23678h, bb2Var.f23678h) && Intrinsics.areEqual(this.f23679i, bb2Var.f23679i) && Intrinsics.areEqual(this.f23680j, bb2Var.f23680j) && Intrinsics.areEqual(this.f23681k, bb2Var.f23681k) && Intrinsics.areEqual(this.f23682l, bb2Var.f23682l) && Intrinsics.areEqual(this.f23683m, bb2Var.f23683m) && Intrinsics.areEqual(this.f23684n, bb2Var.f23684n) && Intrinsics.areEqual(this.f23685o, bb2Var.f23685o);
    }

    @Nullable
    public final String f() {
        return this.f23677g;
    }

    @Nullable
    public final String g() {
        return this.f23682l;
    }

    @NotNull
    public final Map<String, List<String>> h() {
        return this.f23673c;
    }

    public final int hashCode() {
        int hashCode = (this.f23674d.hashCode() + ((this.f23673c.hashCode() + C2039k9.a(this.f23672b, Boolean.hashCode(this.f23671a) * 31, 31)) * 31)) * 31;
        String str = this.f23675e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23676f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f23677g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f23678h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f23679i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        oh2 oh2Var = this.f23680j;
        int hashCode7 = (hashCode6 + (oh2Var == null ? 0 : oh2Var.hashCode())) * 31;
        Integer num = this.f23681k;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.f23682l;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        kk2 kk2Var = this.f23683m;
        return this.f23685o.hashCode() + C2039k9.a(this.f23684n, (hashCode9 + (kk2Var != null ? kk2Var.hashCode() : 0)) * 31, 31);
    }

    @Nullable
    public final Integer i() {
        return this.f23681k;
    }

    @Nullable
    public final String j() {
        return this.f23678h;
    }

    @Nullable
    public final String k() {
        return this.f23679i;
    }

    @NotNull
    public final jb2 l() {
        return this.f23674d;
    }

    @Nullable
    public final oh2 m() {
        return this.f23680j;
    }

    @Nullable
    public final kk2 n() {
        return this.f23683m;
    }

    public final boolean o() {
        return this.f23671a;
    }

    @NotNull
    public final String toString() {
        return "VideoAd(isWrapper=" + this.f23671a + ", creatives=" + this.f23672b + ", rawTrackingEvents=" + this.f23673c + ", videoAdExtensions=" + this.f23674d + ", adSystem=" + this.f23675e + ", adTitle=" + this.f23676f + ", description=" + this.f23677g + ", survey=" + this.f23678h + ", vastAdTagUri=" + this.f23679i + ", viewableImpression=" + this.f23680j + ", sequence=" + this.f23681k + ", id=" + this.f23682l + ", wrapperConfiguration=" + this.f23683m + ", adVerifications=" + this.f23684n + ", trackingEvents=" + this.f23685o + ")";
    }
}
