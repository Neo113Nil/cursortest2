package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class hu implements yf2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<mv0> f26921a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<sh0> f26922b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<a62> f26923c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final ku f26924d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f26925e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final hz1 f26926f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f26927g;

    /* renamed from: h, reason: collision with root package name */
    private final int f26928h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private final String f26929i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f26930a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList f26931b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ArrayList f26932c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        private ku f26933d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private String f26934e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        private hz1 f26935f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        private String f26936g;

        /* renamed from: h, reason: collision with root package name */
        private int f26937h;

        /* renamed from: i, reason: collision with root package name */
        @Nullable
        private String f26938i;

        @NotNull
        public final a a(@Nullable List list) {
            ArrayList arrayList = this.f26931b;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            arrayList.addAll(list);
            return this;
        }

        @NotNull
        public final a b(@Nullable List list) {
            ArrayList arrayList = this.f26930a;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            arrayList.addAll(list);
            return this;
        }

        @NotNull
        public final a c(@Nullable List<a62> list) {
            ArrayList arrayList = this.f26932c;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            arrayList.addAll(list);
            return this;
        }

        @NotNull
        public final void a(@NotNull a62 trackingEvent) {
            Intrinsics.checkNotNullParameter(trackingEvent, "trackingEvent");
            this.f26932c.add(trackingEvent);
        }

        @NotNull
        public final a b(@Nullable String str) {
            this.f26934e = str;
            return this;
        }

        @NotNull
        public final a c(@Nullable String str) {
            this.f26936g = str;
            return this;
        }

        @NotNull
        public final a a(@Nullable String str) {
            this.f26938i = str;
            return this;
        }

        @NotNull
        public final void a(@NotNull ku creativeExtensions) {
            Intrinsics.checkNotNullParameter(creativeExtensions, "creativeExtensions");
            this.f26933d = creativeExtensions;
        }

        @NotNull
        public final a a(int i4) {
            this.f26937h = i4;
            return this;
        }

        @NotNull
        public final a a(@Nullable hz1 hz1Var) {
            this.f26935f = hz1Var;
            return this;
        }

        @NotNull
        public final hu a() {
            return new hu(this.f26930a, this.f26931b, this.f26932c, this.f26933d, this.f26934e, this.f26935f, this.f26936g, this.f26937h, this.f26938i);
        }
    }

    public hu(@NotNull ArrayList mediaFiles, @NotNull ArrayList icons, @NotNull ArrayList trackingEventsList, @Nullable ku kuVar, @Nullable String str, @Nullable hz1 hz1Var, @Nullable String str2, int i4, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(trackingEventsList, "trackingEventsList");
        this.f26921a = mediaFiles;
        this.f26922b = icons;
        this.f26923c = trackingEventsList;
        this.f26924d = kuVar;
        this.f26925e = str;
        this.f26926f = hz1Var;
        this.f26927g = str2;
        this.f26928h = i4;
        this.f26929i = str3;
    }

    @Override // com.yandex.mobile.ads.impl.yf2
    @NotNull
    public final Map<String, List<String>> a() {
        List<a62> list = this.f26923c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (a62 a62Var : list) {
            String a4 = a62Var.a();
            Object obj = linkedHashMap.get(a4);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(a4, obj);
            }
            ((List) obj).add(a62Var.c());
        }
        return linkedHashMap;
    }

    @Nullable
    public final String b() {
        return this.f26929i;
    }

    @Nullable
    public final String c() {
        return this.f26925e;
    }

    @Nullable
    public final ku d() {
        return this.f26924d;
    }

    public final int e() {
        return this.f26928h;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu)) {
            return false;
        }
        hu huVar = (hu) obj;
        return Intrinsics.areEqual(this.f26921a, huVar.f26921a) && Intrinsics.areEqual(this.f26922b, huVar.f26922b) && Intrinsics.areEqual(this.f26923c, huVar.f26923c) && Intrinsics.areEqual(this.f26924d, huVar.f26924d) && Intrinsics.areEqual(this.f26925e, huVar.f26925e) && Intrinsics.areEqual(this.f26926f, huVar.f26926f) && Intrinsics.areEqual(this.f26927g, huVar.f26927g) && this.f26928h == huVar.f26928h && Intrinsics.areEqual(this.f26929i, huVar.f26929i);
    }

    @NotNull
    public final List<sh0> f() {
        return this.f26922b;
    }

    @Nullable
    public final String g() {
        return this.f26927g;
    }

    @NotNull
    public final List<mv0> h() {
        return this.f26921a;
    }

    public final int hashCode() {
        int a4 = C2039k9.a(this.f26923c, C2039k9.a(this.f26922b, this.f26921a.hashCode() * 31, 31), 31);
        ku kuVar = this.f26924d;
        int hashCode = (a4 + (kuVar == null ? 0 : kuVar.hashCode())) * 31;
        String str = this.f26925e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        hz1 hz1Var = this.f26926f;
        int hashCode3 = (hashCode2 + (hz1Var == null ? 0 : hz1Var.hashCode())) * 31;
        String str2 = this.f26927g;
        int a5 = sx1.a(this.f26928h, (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f26929i;
        return a5 + (str3 != null ? str3.hashCode() : 0);
    }

    @Nullable
    public final hz1 i() {
        return this.f26926f;
    }

    @NotNull
    public final List<a62> j() {
        return this.f26923c;
    }

    @NotNull
    public final String toString() {
        return "Creative(mediaFiles=" + this.f26921a + ", icons=" + this.f26922b + ", trackingEventsList=" + this.f26923c + ", creativeExtensions=" + this.f26924d + ", clickThroughUrl=" + this.f26925e + ", skipOffset=" + this.f26926f + ", id=" + this.f26927g + ", durationMillis=" + this.f26928h + ", adParameters=" + this.f26929i + ")";
    }
}
