package okhttp3;

import com.google.common.net.HttpHeaders;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.t;
import okhttp3.internal.Util;

/* loaded from: classes5.dex */
public final class CacheControl {
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;
    public static final Companion Companion = new Companion(null);
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j8) {
            if (j8 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j8;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final Builder maxAge(int i8, TimeUnit timeUnit) {
            s.checkNotNullParameter(timeUnit, "timeUnit");
            if (i8 < 0) {
                throw new IllegalArgumentException(s.stringPlus("maxAge < 0: ", Integer.valueOf(i8)).toString());
            }
            this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(i8));
            return this;
        }

        public final Builder maxStale(int i8, TimeUnit timeUnit) {
            s.checkNotNullParameter(timeUnit, "timeUnit");
            if (i8 < 0) {
                throw new IllegalArgumentException(s.stringPlus("maxStale < 0: ", Integer.valueOf(i8)).toString());
            }
            this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(i8));
            return this;
        }

        public final Builder minFresh(int i8, TimeUnit timeUnit) {
            s.checkNotNullParameter(timeUnit, "timeUnit");
            if (i8 < 0) {
                throw new IllegalArgumentException(s.stringPlus("minFresh < 0: ", Integer.valueOf(i8)).toString());
            }
            this.minFreshSeconds = clampToInt(timeUnit.toSeconds(i8));
            return this;
        }

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        private final int indexOfElement(String str, String str2, int i8) {
            boolean contains$default;
            int length = str.length();
            while (i8 < length) {
                int i9 = i8 + 1;
                contains$default = StringsKt__StringsKt.contains$default((CharSequence) str2, str.charAt(i8), false, 2, (Object) null);
                if (contains$default) {
                    return i8;
                }
                i8 = i9;
            }
            return str.length();
        }

        static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i8, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                i8 = 0;
            }
            return companion.indexOfElement(str, str2, i8);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final CacheControl parse(Headers headers) {
            int i8;
            int i9;
            String str;
            Headers headers2 = headers;
            s.checkNotNullParameter(headers2, "headers");
            int size = headers.size();
            boolean z7 = true;
            int i10 = 0;
            boolean z8 = true;
            String str2 = null;
            boolean z9 = false;
            boolean z10 = false;
            int i11 = -1;
            int i12 = -1;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            int i13 = -1;
            int i14 = -1;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            while (i10 < size) {
                int i15 = i10 + 1;
                String name = headers2.name(i10);
                String value = headers2.value(i10);
                if (t.equals(name, "Cache-Control", z7)) {
                    if (str2 == null) {
                        str2 = value;
                        i8 = 0;
                        while (i8 < value.length()) {
                            int indexOfElement = indexOfElement(value, "=,;", i8);
                            String substring = value.substring(i8, indexOfElement);
                            s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String obj = StringsKt__StringsKt.trim((CharSequence) substring).toString();
                            if (indexOfElement == value.length() || value.charAt(indexOfElement) == ',' || value.charAt(indexOfElement) == ';') {
                                i9 = indexOfElement + 1;
                                str = null;
                            } else {
                                int indexOfNonWhitespace = Util.indexOfNonWhitespace(value, indexOfElement + 1);
                                if (indexOfNonWhitespace >= value.length() || value.charAt(indexOfNonWhitespace) != '\"') {
                                    i9 = indexOfElement(value, ",;", indexOfNonWhitespace);
                                    String substring2 = value.substring(indexOfNonWhitespace, i9);
                                    s.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    str = StringsKt__StringsKt.trim((CharSequence) substring2).toString();
                                } else {
                                    int i16 = indexOfNonWhitespace + 1;
                                    int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) value, '\"', i16, false, 4, (Object) null);
                                    str = value.substring(i16, indexOf$default);
                                    s.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
                                    i9 = indexOf$default + 1;
                                }
                            }
                            if (t.equals("no-cache", obj, true)) {
                                i8 = i9;
                                z7 = true;
                                z9 = true;
                            } else if (t.equals("no-store", obj, true)) {
                                i8 = i9;
                                z7 = true;
                                z10 = true;
                            } else {
                                if (t.equals("max-age", obj, true)) {
                                    i11 = Util.toNonNegativeInt(str, -1);
                                } else if (t.equals("s-maxage", obj, true)) {
                                    i12 = Util.toNonNegativeInt(str, -1);
                                } else if (t.equals("private", obj, true)) {
                                    i8 = i9;
                                    z7 = true;
                                    z11 = true;
                                } else if (t.equals("public", obj, true)) {
                                    i8 = i9;
                                    z7 = true;
                                    z12 = true;
                                } else if (t.equals("must-revalidate", obj, true)) {
                                    i8 = i9;
                                    z7 = true;
                                    z13 = true;
                                } else if (t.equals("max-stale", obj, true)) {
                                    i13 = Util.toNonNegativeInt(str, Integer.MAX_VALUE);
                                } else if (t.equals("min-fresh", obj, true)) {
                                    i14 = Util.toNonNegativeInt(str, -1);
                                } else if (t.equals("only-if-cached", obj, true)) {
                                    i8 = i9;
                                    z7 = true;
                                    z14 = true;
                                } else if (t.equals("no-transform", obj, true)) {
                                    i8 = i9;
                                    z7 = true;
                                    z15 = true;
                                } else if (t.equals("immutable", obj, true)) {
                                    i8 = i9;
                                    z7 = true;
                                    z16 = true;
                                }
                                i8 = i9;
                                z7 = true;
                            }
                        }
                        headers2 = headers;
                        i10 = i15;
                    }
                } else if (!t.equals(name, HttpHeaders.PRAGMA, z7)) {
                    headers2 = headers;
                    i10 = i15;
                }
                z8 = false;
                i8 = 0;
                while (i8 < value.length()) {
                }
                headers2 = headers;
                i10 = i15;
            }
            return new CacheControl(z9, z10, i11, i12, z11, z12, z13, i13, i14, z14, z15, z16, !z8 ? null : str2, null);
        }
    }

    public /* synthetic */ CacheControl(boolean z7, boolean z8, int i8, int i9, boolean z9, boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, String str, o oVar) {
        this(z7, z8, i8, i9, z9, z10, z11, i10, i11, z12, z13, z14, str);
    }

    public static final CacheControl parse(Headers headers) {
        return Companion.parse(headers);
    }

    /* renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m1312deprecated_immutable() {
        return this.immutable;
    }

    /* renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m1313deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /* renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m1314deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m1315deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m1316deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    /* renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m1317deprecated_noCache() {
        return this.noCache;
    }

    /* renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m1318deprecated_noStore() {
        return this.noStore;
    }

    /* renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m1319deprecated_noTransform() {
        return this.noTransform;
    }

    /* renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m1320deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    /* renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m1321deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (noCache()) {
            sb.append("no-cache, ");
        }
        if (noStore()) {
            sb.append("no-store, ");
        }
        if (maxAgeSeconds() != -1) {
            sb.append("max-age=");
            sb.append(maxAgeSeconds());
            sb.append(", ");
        }
        if (sMaxAgeSeconds() != -1) {
            sb.append("s-maxage=");
            sb.append(sMaxAgeSeconds());
            sb.append(", ");
        }
        if (isPrivate()) {
            sb.append("private, ");
        }
        if (isPublic()) {
            sb.append("public, ");
        }
        if (mustRevalidate()) {
            sb.append("must-revalidate, ");
        }
        if (maxStaleSeconds() != -1) {
            sb.append("max-stale=");
            sb.append(maxStaleSeconds());
            sb.append(", ");
        }
        if (minFreshSeconds() != -1) {
            sb.append("min-fresh=");
            sb.append(minFreshSeconds());
            sb.append(", ");
        }
        if (onlyIfCached()) {
            sb.append("only-if-cached, ");
        }
        if (noTransform()) {
            sb.append("no-transform, ");
        }
        if (immutable()) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        s.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = sb2;
        return sb2;
    }

    private CacheControl(boolean z7, boolean z8, int i8, int i9, boolean z9, boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, String str) {
        this.noCache = z7;
        this.noStore = z8;
        this.maxAgeSeconds = i8;
        this.sMaxAgeSeconds = i9;
        this.isPrivate = z9;
        this.isPublic = z10;
        this.mustRevalidate = z11;
        this.maxStaleSeconds = i10;
        this.minFreshSeconds = i11;
        this.onlyIfCached = z12;
        this.noTransform = z13;
        this.immutable = z14;
        this.headerValue = str;
    }
}
