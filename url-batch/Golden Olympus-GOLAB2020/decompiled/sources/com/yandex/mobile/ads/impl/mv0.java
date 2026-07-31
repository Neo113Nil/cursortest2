package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class mv0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f29259a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f29260b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final b f29261c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f29262d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f29263e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final Float f29264f;

    /* renamed from: g, reason: collision with root package name */
    private final int f29265g;

    /* renamed from: h, reason: collision with root package name */
    private final int f29266h;

    /* renamed from: i, reason: collision with root package name */
    private final int f29267i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private final String f29268j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f29269a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private String f29270b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private b f29271c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        private String f29272d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private String f29273e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        private Float f29274f;

        /* renamed from: g, reason: collision with root package name */
        private int f29275g;

        /* renamed from: h, reason: collision with root package name */
        private int f29276h;

        /* renamed from: i, reason: collision with root package name */
        private int f29277i;

        /* renamed from: j, reason: collision with root package name */
        @Nullable
        private String f29278j;

        public a(@NotNull String uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f29269a = uri;
        }

        @NotNull
        public final a a(@Nullable String str) {
            this.f29278j = str;
            return this;
        }

        @NotNull
        public final a b(@Nullable String str) {
            Integer intOrNull;
            if (str != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
                this.f29277i = intOrNull.intValue();
            }
            return this;
        }

        @NotNull
        public final a c(@Nullable String str) {
            this.f29273e = str;
            return this;
        }

        @NotNull
        public final a d(@Nullable String str) {
            b bVar;
            b[] values = b.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    bVar = null;
                    break;
                }
                bVar = values[i4];
                if (Intrinsics.areEqual(bVar.a(), str)) {
                    break;
                }
                i4++;
            }
            this.f29271c = bVar;
            return this;
        }

        @NotNull
        public final a e(@Nullable String str) {
            Integer intOrNull;
            if (str != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
                this.f29275g = intOrNull.intValue();
            }
            return this;
        }

        @NotNull
        public final a f(@Nullable String str) {
            this.f29270b = str;
            return this;
        }

        @NotNull
        public final a g(@Nullable String str) {
            this.f29272d = str;
            return this;
        }

        @NotNull
        public final a h(@Nullable String str) {
            this.f29274f = str != null ? StringsKt.k(str) : null;
            return this;
        }

        @NotNull
        public final a i(@Nullable String str) {
            Integer intOrNull;
            if (str != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
                this.f29276h = intOrNull.intValue();
            }
            return this;
        }

        @NotNull
        public final mv0 a() {
            return new mv0(this.f29269a, this.f29270b, this.f29271c, this.f29272d, this.f29273e, this.f29274f, this.f29275g, this.f29276h, this.f29277i, this.f29278j);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f29279c;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f29280b;

        static {
            b[] bVarArr = {new b(0, "STREAMING", "streaming"), new b(1, "PROGRESSIVE", "progressive")};
            f29279c = bVarArr;
            AbstractC1372b.a(bVarArr);
        }

        private b(int i4, String str, String str2) {
            this.f29280b = str2;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f29279c.clone();
        }

        @NotNull
        public final String a() {
            return this.f29280b;
        }
    }

    public mv0(@NotNull String uri, @Nullable String str, @Nullable b bVar, @Nullable String str2, @Nullable String str3, @Nullable Float f4, int i4, int i5, int i6, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f29259a = uri;
        this.f29260b = str;
        this.f29261c = bVar;
        this.f29262d = str2;
        this.f29263e = str3;
        this.f29264f = f4;
        this.f29265g = i4;
        this.f29266h = i5;
        this.f29267i = i6;
        this.f29268j = str4;
    }

    @Nullable
    public final String a() {
        return this.f29268j;
    }

    public final int b() {
        return this.f29267i;
    }

    @Nullable
    public final String c() {
        return this.f29263e;
    }

    public final int d() {
        return this.f29265g;
    }

    @Nullable
    public final String e() {
        return this.f29262d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv0)) {
            return false;
        }
        mv0 mv0Var = (mv0) obj;
        return Intrinsics.areEqual(this.f29259a, mv0Var.f29259a) && Intrinsics.areEqual(this.f29260b, mv0Var.f29260b) && this.f29261c == mv0Var.f29261c && Intrinsics.areEqual(this.f29262d, mv0Var.f29262d) && Intrinsics.areEqual(this.f29263e, mv0Var.f29263e) && Intrinsics.areEqual((Object) this.f29264f, (Object) mv0Var.f29264f) && this.f29265g == mv0Var.f29265g && this.f29266h == mv0Var.f29266h && this.f29267i == mv0Var.f29267i && Intrinsics.areEqual(this.f29268j, mv0Var.f29268j);
    }

    @NotNull
    public final String f() {
        return this.f29259a;
    }

    @Nullable
    public final Float g() {
        return this.f29264f;
    }

    public final int h() {
        return this.f29266h;
    }

    public final int hashCode() {
        int hashCode = this.f29259a.hashCode() * 31;
        String str = this.f29260b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.f29261c;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.f29262d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f29263e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f4 = this.f29264f;
        int a4 = sx1.a(this.f29267i, sx1.a(this.f29266h, sx1.a(this.f29265g, (hashCode5 + (f4 == null ? 0 : f4.hashCode())) * 31, 31), 31), 31);
        String str4 = this.f29268j;
        return a4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "MediaFile(uri=" + this.f29259a + ", id=" + this.f29260b + ", deliveryMethod=" + this.f29261c + ", mimeType=" + this.f29262d + ", codec=" + this.f29263e + ", vmafMetric=" + this.f29264f + ", height=" + this.f29265g + ", width=" + this.f29266h + ", bitrate=" + this.f29267i + ", apiFramework=" + this.f29268j + ")";
    }
}
