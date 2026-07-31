package okhttp3;

import io.appmetrica.analytics.BuildConfig;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;

@Metadata
/* loaded from: classes3.dex */
public final class CacheControl {

    /* renamed from: n, reason: collision with root package name */
    public static final Companion f42164n = new Companion(null);

    /* renamed from: o, reason: collision with root package name */
    public static final CacheControl f42165o = new Builder().d().a();

    /* renamed from: p, reason: collision with root package name */
    public static final CacheControl f42166p = new Builder().f().c(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f42167a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f42168b;

    /* renamed from: c, reason: collision with root package name */
    private final int f42169c;

    /* renamed from: d, reason: collision with root package name */
    private final int f42170d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f42171e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f42172f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f42173g;

    /* renamed from: h, reason: collision with root package name */
    private final int f42174h;

    /* renamed from: i, reason: collision with root package name */
    private final int f42175i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f42176j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f42177k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f42178l;

    /* renamed from: m, reason: collision with root package name */
    private String f42179m;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private boolean f42180a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f42181b;

        /* renamed from: c, reason: collision with root package name */
        private int f42182c = -1;

        /* renamed from: d, reason: collision with root package name */
        private int f42183d = -1;

        /* renamed from: e, reason: collision with root package name */
        private int f42184e = -1;

        /* renamed from: f, reason: collision with root package name */
        private boolean f42185f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f42186g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f42187h;

        private final int b(long j4) {
            if (j4 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j4;
        }

        public final CacheControl a() {
            return new CacheControl(this.f42180a, this.f42181b, this.f42182c, -1, false, false, false, this.f42183d, this.f42184e, this.f42185f, this.f42186g, this.f42187h, null, null);
        }

        public final Builder c(int i4, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i4 >= 0) {
                this.f42183d = b(timeUnit.toSeconds(i4));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i4).toString());
        }

        public final Builder d() {
            this.f42180a = true;
            return this;
        }

        public final Builder e() {
            this.f42181b = true;
            return this;
        }

        public final Builder f() {
            this.f42185f = true;
            return this;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(String str, String str2, int i4) {
            int length = str.length();
            while (i4 < length) {
                if (StringsKt.O(str2, str.charAt(i4), false, 2, null)) {
                    return i4;
                }
                i4++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final CacheControl b(Headers headers) {
            int i4;
            int i5;
            String str;
            int i6;
            String str2;
            Headers headers2 = headers;
            Intrinsics.checkNotNullParameter(headers2, "headers");
            int size = headers2.size();
            boolean z4 = true;
            boolean z5 = true;
            int i7 = 0;
            String str3 = null;
            boolean z6 = false;
            boolean z7 = false;
            int i8 = -1;
            int i9 = -1;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            int i10 = -1;
            int i11 = -1;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            while (i7 < size) {
                String d4 = headers2.d(i7);
                String f4 = headers2.f(i7);
                if (StringsKt.w(d4, "Cache-Control", z4)) {
                    if (str3 == null) {
                        str3 = f4;
                        i4 = 0;
                        while (i4 < f4.length()) {
                            int a4 = a(f4, "=,;", i4);
                            String substring = f4.substring(i4, a4);
                            boolean z14 = z4;
                            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String obj = StringsKt.W0(substring).toString();
                            if (a4 != f4.length()) {
                                i5 = size;
                                if (f4.charAt(a4) != ',' && f4.charAt(a4) != ';') {
                                    int C4 = Util.C(f4, a4 + 1);
                                    if (C4 >= f4.length() || f4.charAt(C4) != '\"') {
                                        str = f4;
                                        i6 = a(str, ",;", C4);
                                        String substring2 = str.substring(C4, i6);
                                        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                        str2 = StringsKt.W0(substring2).toString();
                                    } else {
                                        int i12 = C4 + 1;
                                        String str4 = f4;
                                        int b02 = StringsKt.b0(str4, '\"', i12, false, 4, null);
                                        str = str4;
                                        String substring3 = str.substring(i12, b02);
                                        Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                        i6 = b02 + 1;
                                        str2 = substring3;
                                    }
                                    if (!StringsKt.w("no-cache", obj, z14)) {
                                        i4 = i6;
                                        z4 = z14;
                                        z6 = z4;
                                    } else if (StringsKt.w("no-store", obj, z14)) {
                                        i4 = i6;
                                        z4 = z14;
                                        z7 = z4;
                                    } else {
                                        if (StringsKt.w("max-age", obj, z14)) {
                                            i8 = Util.X(str2, -1);
                                        } else if (StringsKt.w("s-maxage", obj, z14)) {
                                            i9 = Util.X(str2, -1);
                                        } else if (StringsKt.w("private", obj, z14)) {
                                            i4 = i6;
                                            z4 = z14;
                                            z8 = z4;
                                        } else if (StringsKt.w(BuildConfig.SDK_BUILD_FLAVOR, obj, z14)) {
                                            i4 = i6;
                                            z4 = z14;
                                            z9 = z4;
                                        } else if (StringsKt.w("must-revalidate", obj, z14)) {
                                            i4 = i6;
                                            z4 = z14;
                                            z10 = z4;
                                        } else if (StringsKt.w("max-stale", obj, z14)) {
                                            i10 = Util.X(str2, Integer.MAX_VALUE);
                                        } else if (StringsKt.w("min-fresh", obj, z14)) {
                                            i11 = Util.X(str2, -1);
                                        } else if (StringsKt.w("only-if-cached", obj, z14)) {
                                            i4 = i6;
                                            z4 = z14;
                                            z11 = z4;
                                        } else if (StringsKt.w("no-transform", obj, z14)) {
                                            i4 = i6;
                                            z4 = z14;
                                            z12 = z4;
                                        } else if (StringsKt.w("immutable", obj, z14)) {
                                            i4 = i6;
                                            z4 = z14;
                                            z13 = z4;
                                        }
                                        i4 = i6;
                                        z4 = z14;
                                    }
                                    f4 = str;
                                    size = i5;
                                }
                            } else {
                                i5 = size;
                            }
                            str = f4;
                            i6 = a4 + 1;
                            str2 = null;
                            if (!StringsKt.w("no-cache", obj, z14)) {
                            }
                            f4 = str;
                            size = i5;
                        }
                        i7++;
                        headers2 = headers;
                        z4 = z4;
                        size = size;
                    }
                } else if (!StringsKt.w(d4, "Pragma", z4)) {
                    i7++;
                    headers2 = headers;
                    z4 = z4;
                    size = size;
                }
                z5 = false;
                i4 = 0;
                while (i4 < f4.length()) {
                }
                i7++;
                headers2 = headers;
                z4 = z4;
                size = size;
            }
            return new CacheControl(z6, z7, i8, i9, z8, z9, z10, i10, i11, z11, z12, z13, !z5 ? null : str3, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CacheControl(boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, int i6, int i7, boolean z9, boolean z10, boolean z11, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, z5, i4, i5, z6, z7, z8, i6, i7, z9, z10, z11, str);
    }

    public final boolean a() {
        return this.f42171e;
    }

    public final boolean b() {
        return this.f42172f;
    }

    public final int c() {
        return this.f42169c;
    }

    public final int d() {
        return this.f42174h;
    }

    public final int e() {
        return this.f42175i;
    }

    public final boolean f() {
        return this.f42173g;
    }

    public final boolean g() {
        return this.f42167a;
    }

    public final boolean h() {
        return this.f42168b;
    }

    public final boolean i() {
        return this.f42176j;
    }

    public String toString() {
        String str = this.f42179m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f42167a) {
            sb.append("no-cache, ");
        }
        if (this.f42168b) {
            sb.append("no-store, ");
        }
        if (this.f42169c != -1) {
            sb.append("max-age=");
            sb.append(this.f42169c);
            sb.append(", ");
        }
        if (this.f42170d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f42170d);
            sb.append(", ");
        }
        if (this.f42171e) {
            sb.append("private, ");
        }
        if (this.f42172f) {
            sb.append("public, ");
        }
        if (this.f42173g) {
            sb.append("must-revalidate, ");
        }
        if (this.f42174h != -1) {
            sb.append("max-stale=");
            sb.append(this.f42174h);
            sb.append(", ");
        }
        if (this.f42175i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f42175i);
            sb.append(", ");
        }
        if (this.f42176j) {
            sb.append("only-if-cached, ");
        }
        if (this.f42177k) {
            sb.append("no-transform, ");
        }
        if (this.f42178l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f42179m = sb2;
        return sb2;
    }

    private CacheControl(boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, int i6, int i7, boolean z9, boolean z10, boolean z11, String str) {
        this.f42167a = z4;
        this.f42168b = z5;
        this.f42169c = i4;
        this.f42170d = i5;
        this.f42171e = z6;
        this.f42172f = z7;
        this.f42173g = z8;
        this.f42174h = i6;
        this.f42175i = i7;
        this.f42176j = z9;
        this.f42177k = z10;
        this.f42178l = z11;
        this.f42179m = str;
    }
}
