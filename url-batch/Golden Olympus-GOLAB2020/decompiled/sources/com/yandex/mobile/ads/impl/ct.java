package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ct {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final jt f24305a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final et f24306b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final et f24307c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final et f24308d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final ot f24309e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f24310f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f24311g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private final String f24312h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private final String f24313i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private final String f24314j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private final Float f24315k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private final String f24316l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private final String f24317m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    private final String f24318n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    private final String f24319o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f24320p;

    public ct() {
        this(0);
    }

    @Nullable
    public final String a() {
        return this.f24310f;
    }

    @Nullable
    public final String b() {
        return this.f24311g;
    }

    @Nullable
    public final String c() {
        return this.f24312h;
    }

    @Nullable
    public final String d() {
        return this.f24313i;
    }

    @Nullable
    public final et e() {
        return this.f24306b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct)) {
            return false;
        }
        ct ctVar = (ct) obj;
        return Intrinsics.areEqual(this.f24305a, ctVar.f24305a) && Intrinsics.areEqual(this.f24306b, ctVar.f24306b) && Intrinsics.areEqual(this.f24307c, ctVar.f24307c) && Intrinsics.areEqual(this.f24308d, ctVar.f24308d) && Intrinsics.areEqual(this.f24309e, ctVar.f24309e) && Intrinsics.areEqual(this.f24310f, ctVar.f24310f) && Intrinsics.areEqual(this.f24311g, ctVar.f24311g) && Intrinsics.areEqual(this.f24312h, ctVar.f24312h) && Intrinsics.areEqual(this.f24313i, ctVar.f24313i) && Intrinsics.areEqual(this.f24314j, ctVar.f24314j) && Intrinsics.areEqual((Object) this.f24315k, (Object) ctVar.f24315k) && Intrinsics.areEqual(this.f24316l, ctVar.f24316l) && Intrinsics.areEqual(this.f24317m, ctVar.f24317m) && Intrinsics.areEqual(this.f24318n, ctVar.f24318n) && Intrinsics.areEqual(this.f24319o, ctVar.f24319o) && this.f24320p == ctVar.f24320p;
    }

    public final boolean f() {
        return this.f24320p;
    }

    @Nullable
    public final et g() {
        return this.f24307c;
    }

    @Nullable
    public final et h() {
        return this.f24308d;
    }

    public final int hashCode() {
        jt jtVar = this.f24305a;
        int hashCode = (jtVar == null ? 0 : jtVar.hashCode()) * 31;
        et etVar = this.f24306b;
        int hashCode2 = (hashCode + (etVar == null ? 0 : etVar.hashCode())) * 31;
        et etVar2 = this.f24307c;
        int hashCode3 = (hashCode2 + (etVar2 == null ? 0 : etVar2.hashCode())) * 31;
        et etVar3 = this.f24308d;
        int hashCode4 = (hashCode3 + (etVar3 == null ? 0 : etVar3.hashCode())) * 31;
        ot otVar = this.f24309e;
        int hashCode5 = (hashCode4 + (otVar == null ? 0 : otVar.hashCode())) * 31;
        String str = this.f24310f;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24311g;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f24312h;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f24313i;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f24314j;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f4 = this.f24315k;
        int hashCode11 = (hashCode10 + (f4 == null ? 0 : f4.hashCode())) * 31;
        String str6 = this.f24316l;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f24317m;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f24318n;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f24319o;
        return Boolean.hashCode(this.f24320p) + ((hashCode14 + (str9 != null ? str9.hashCode() : 0)) * 31);
    }

    @Nullable
    public final jt i() {
        return this.f24305a;
    }

    @Nullable
    public final String j() {
        return this.f24314j;
    }

    @Nullable
    public final Float k() {
        return this.f24315k;
    }

    @Nullable
    public final String l() {
        return this.f24316l;
    }

    @Nullable
    public final String m() {
        return this.f24317m;
    }

    @Nullable
    public final String n() {
        return this.f24318n;
    }

    @Nullable
    public final String o() {
        return this.f24319o;
    }

    @NotNull
    public final String toString() {
        return "CoreNativeAdAssets(media=" + this.f24305a + ", favicon=" + this.f24306b + ", icon=" + this.f24307c + ", image=" + this.f24308d + ", closeButton=" + this.f24309e + ", age=" + this.f24310f + ", body=" + this.f24311g + ", callToAction=" + this.f24312h + ", domain=" + this.f24313i + ", price=" + this.f24314j + ", rating=" + this.f24315k + ", reviewCount=" + this.f24316l + ", sponsored=" + this.f24317m + ", title=" + this.f24318n + ", warning=" + this.f24319o + ", feedbackAvailable=" + this.f24320p + ")";
    }

    public /* synthetic */ ct(int i4) {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false);
    }

    public ct(@Nullable jt jtVar, @Nullable et etVar, @Nullable et etVar2, @Nullable et etVar3, @Nullable ot otVar, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Float f4, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, boolean z4) {
        this.f24305a = jtVar;
        this.f24306b = etVar;
        this.f24307c = etVar2;
        this.f24308d = etVar3;
        this.f24309e = otVar;
        this.f24310f = str;
        this.f24311g = str2;
        this.f24312h = str3;
        this.f24313i = str4;
        this.f24314j = str5;
        this.f24315k = f4;
        this.f24316l = str6;
        this.f24317m = str7;
        this.f24318n = str8;
        this.f24319o = str9;
        this.f24320p = z4;
    }
}
