package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.BuildConfig;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.dm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1885dm {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f24664n = 0;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24665a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24666b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24667c;

    /* renamed from: d, reason: collision with root package name */
    private final int f24668d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f24669e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f24670f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f24671g;

    /* renamed from: h, reason: collision with root package name */
    private final int f24672h;

    /* renamed from: i, reason: collision with root package name */
    private final int f24673i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f24674j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f24675k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f24676l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private String f24677m;

    /* renamed from: com.yandex.mobile.ads.impl.dm$a */
    public static final class a {
        @NotNull
        public final a a() {
            return this;
        }

        @NotNull
        public final a b() {
            return this;
        }

        @NotNull
        public final a a(@NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            timeUnit.toSeconds(Integer.MAX_VALUE);
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dm$b */
    public static final class b {
        /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static C1885dm a(@NotNull ff0 ff0Var) {
            int i4;
            boolean z4;
            int i5;
            int i6;
            int i7;
            int length;
            boolean z5;
            String str;
            String str2;
            int length2;
            ff0 headers = ff0Var;
            Intrinsics.checkNotNullParameter(headers, "headers");
            int size = headers.size();
            boolean z6 = true;
            boolean z7 = true;
            int i8 = 0;
            String str3 = null;
            boolean z8 = false;
            boolean z9 = false;
            int i9 = -1;
            int i10 = -1;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            int i11 = -1;
            int i12 = -1;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            while (i8 < size) {
                String a4 = headers.a(i8);
                String b4 = headers.b(i8);
                if (StringsKt.w(a4, "Cache-Control", z6)) {
                    if (str3 == null) {
                        str3 = b4;
                        i5 = 0;
                        while (i5 < b4.length()) {
                            int length3 = b4.length();
                            boolean z16 = z6;
                            int i13 = i5;
                            while (true) {
                                if (i13 >= length3) {
                                    i6 = size;
                                    i7 = i8;
                                    length = b4.length();
                                    break;
                                }
                                i6 = size;
                                int i14 = i13;
                                int i15 = length3;
                                i7 = i8;
                                if (StringsKt.O("=,;", b4.charAt(i13), false, 2, null)) {
                                    length = i14;
                                    break;
                                }
                                i13 = i14 + 1;
                                length3 = i15;
                                size = i6;
                                i8 = i7;
                            }
                            String substring = b4.substring(i5, length);
                            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                            String obj = StringsKt.W0(substring).toString();
                            if (length == b4.length() || b4.charAt(length) == ',' || b4.charAt(length) == ';') {
                                z5 = z7;
                                str = str3;
                                i5 = length + 1;
                                str2 = null;
                            } else {
                                int i16 = length + 1;
                                byte[] bArr = v82.f33550a;
                                Intrinsics.checkNotNullParameter(b4, "<this>");
                                int length4 = b4.length();
                                while (true) {
                                    if (i16 < length4) {
                                        char charAt = b4.charAt(i16);
                                        if (charAt != ' ' && charAt != '\t') {
                                            break;
                                        }
                                        i16++;
                                    } else {
                                        i16 = b4.length();
                                        break;
                                    }
                                }
                                if (i16 >= b4.length() || b4.charAt(i16) != '\"') {
                                    int length5 = b4.length();
                                    int i17 = i16;
                                    while (true) {
                                        if (i17 >= length5) {
                                            z5 = z7;
                                            str = str3;
                                            length2 = b4.length();
                                            break;
                                        }
                                        int i18 = length5;
                                        int i19 = i17;
                                        z5 = z7;
                                        str = str3;
                                        if (StringsKt.O(",;", b4.charAt(i17), false, 2, null)) {
                                            length2 = i19;
                                            break;
                                        }
                                        i17 = i19 + 1;
                                        z7 = z5;
                                        length5 = i18;
                                        str3 = str;
                                    }
                                    String substring2 = b4.substring(i16, length2);
                                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                                    str2 = StringsKt.W0(substring2).toString();
                                    i5 = length2;
                                } else {
                                    int i20 = i16 + 1;
                                    int b02 = StringsKt.b0(b4, '\"', i20, false, 4, null);
                                    str2 = b4.substring(i20, b02);
                                    Intrinsics.checkNotNullExpressionValue(str2, "substring(...)");
                                    i5 = b02 + 1;
                                    z5 = z7;
                                    str = str3;
                                }
                            }
                            z6 = z16;
                            if (StringsKt.w("no-cache", obj, z6)) {
                                z8 = z6;
                            } else if (StringsKt.w("no-store", obj, z6)) {
                                z9 = z6;
                            } else if (StringsKt.w("max-age", obj, z6)) {
                                i9 = v82.a(-1, str2);
                            } else if (StringsKt.w("s-maxage", obj, z6)) {
                                i10 = v82.a(-1, str2);
                            } else if (StringsKt.w("private", obj, z6)) {
                                z10 = z6;
                            } else if (StringsKt.w(BuildConfig.SDK_BUILD_FLAVOR, obj, z6)) {
                                z11 = z6;
                            } else if (StringsKt.w("must-revalidate", obj, z6)) {
                                z12 = z6;
                            } else if (StringsKt.w("max-stale", obj, z6)) {
                                i11 = v82.a(Integer.MAX_VALUE, str2);
                            } else if (StringsKt.w("min-fresh", obj, z6)) {
                                i12 = v82.a(-1, str2);
                            } else if (StringsKt.w("only-if-cached", obj, z6)) {
                                z13 = z6;
                            } else if (StringsKt.w("no-transform", obj, z6)) {
                                z14 = z6;
                            } else if (StringsKt.w("immutable", obj, z6)) {
                                z15 = z6;
                            }
                            z7 = z5;
                            str3 = str;
                            size = i6;
                            i8 = i7;
                        }
                        i4 = size;
                        z4 = z7;
                        i8++;
                        headers = ff0Var;
                        z7 = z4;
                        size = i4;
                    }
                } else if (!StringsKt.w(a4, "Pragma", z6)) {
                    i4 = size;
                    z4 = z7;
                    i8++;
                    headers = ff0Var;
                    z7 = z4;
                    size = i4;
                }
                z7 = false;
                i5 = 0;
                while (i5 < b4.length()) {
                }
                i4 = size;
                z4 = z7;
                i8++;
                headers = ff0Var;
                z7 = z4;
                size = i4;
            }
            return new C1885dm(z8, z9, i9, i10, z10, z11, z12, i11, i12, z13, z14, z15, !z7 ? null : str3, 0);
        }
    }

    static {
        new a().a();
        new a().b().a(TimeUnit.SECONDS);
    }

    private C1885dm(boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, int i6, int i7, boolean z9, boolean z10, boolean z11, String str) {
        this.f24665a = z4;
        this.f24666b = z5;
        this.f24667c = i4;
        this.f24668d = i5;
        this.f24669e = z6;
        this.f24670f = z7;
        this.f24671g = z8;
        this.f24672h = i6;
        this.f24673i = i7;
        this.f24674j = z9;
        this.f24675k = z10;
        this.f24676l = z11;
        this.f24677m = str;
    }

    public final boolean a() {
        return this.f24674j;
    }

    @NotNull
    public final String toString() {
        String str = this.f24677m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f24665a) {
            sb.append("no-cache, ");
        }
        if (this.f24666b) {
            sb.append("no-store, ");
        }
        if (this.f24667c != -1) {
            sb.append("max-age=");
            sb.append(this.f24667c);
            sb.append(", ");
        }
        if (this.f24668d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f24668d);
            sb.append(", ");
        }
        if (this.f24669e) {
            sb.append("private, ");
        }
        if (this.f24670f) {
            sb.append("public, ");
        }
        if (this.f24671g) {
            sb.append("must-revalidate, ");
        }
        if (this.f24672h != -1) {
            sb.append("max-stale=");
            sb.append(this.f24672h);
            sb.append(", ");
        }
        if (this.f24673i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f24673i);
            sb.append(", ");
        }
        if (this.f24674j) {
            sb.append("only-if-cached, ");
        }
        if (this.f24675k) {
            sb.append("no-transform, ");
        }
        if (this.f24676l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        this.f24677m = sb2;
        return sb2;
    }

    public /* synthetic */ C1885dm(boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, int i6, int i7, boolean z9, boolean z10, boolean z11, String str, int i8) {
        this(z4, z5, i4, i5, z6, z7, z8, i6, i7, z9, z10, z11, str);
    }
}
