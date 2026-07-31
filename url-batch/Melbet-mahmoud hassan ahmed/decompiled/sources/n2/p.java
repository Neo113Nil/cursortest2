package n2;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r0.p1;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f19496a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19497b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19498c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f19499d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f19500e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public final long f19501f;

    /* renamed from: g, reason: collision with root package name */
    public final long f19502g;

    /* renamed from: h, reason: collision with root package name */
    public final long f19503h;

    /* renamed from: i, reason: collision with root package name */
    public final String f19504i;

    /* renamed from: j, reason: collision with root package name */
    public final int f19505j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f19506k;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Uri f19507a;

        /* renamed from: b, reason: collision with root package name */
        private long f19508b;

        /* renamed from: c, reason: collision with root package name */
        private int f19509c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f19510d;

        /* renamed from: e, reason: collision with root package name */
        private Map<String, String> f19511e;

        /* renamed from: f, reason: collision with root package name */
        private long f19512f;

        /* renamed from: g, reason: collision with root package name */
        private long f19513g;

        /* renamed from: h, reason: collision with root package name */
        private String f19514h;

        /* renamed from: i, reason: collision with root package name */
        private int f19515i;

        /* renamed from: j, reason: collision with root package name */
        private Object f19516j;

        public b() {
            this.f19509c = 1;
            this.f19511e = Collections.emptyMap();
            this.f19513g = -1L;
        }

        private b(p pVar) {
            this.f19507a = pVar.f19496a;
            this.f19508b = pVar.f19497b;
            this.f19509c = pVar.f19498c;
            this.f19510d = pVar.f19499d;
            this.f19511e = pVar.f19500e;
            this.f19512f = pVar.f19502g;
            this.f19513g = pVar.f19503h;
            this.f19514h = pVar.f19504i;
            this.f19515i = pVar.f19505j;
            this.f19516j = pVar.f19506k;
        }

        public p a() {
            o2.a.i(this.f19507a, "The uri must be set.");
            return new p(this.f19507a, this.f19508b, this.f19509c, this.f19510d, this.f19511e, this.f19512f, this.f19513g, this.f19514h, this.f19515i, this.f19516j);
        }

        public b b(int i7) {
            this.f19515i = i7;
            return this;
        }

        public b c(byte[] bArr) {
            this.f19510d = bArr;
            return this;
        }

        public b d(int i7) {
            this.f19509c = i7;
            return this;
        }

        public b e(Map<String, String> map) {
            this.f19511e = map;
            return this;
        }

        public b f(String str) {
            this.f19514h = str;
            return this;
        }

        public b g(long j7) {
            this.f19513g = j7;
            return this;
        }

        public b h(long j7) {
            this.f19512f = j7;
            return this;
        }

        public b i(Uri uri) {
            this.f19507a = uri;
            return this;
        }

        public b j(String str) {
            this.f19507a = Uri.parse(str);
            return this;
        }
    }

    static {
        p1.a("goog.exo.datasource");
    }

    public p(Uri uri) {
        this(uri, 0L, -1L);
    }

    private p(Uri uri, long j7, int i7, byte[] bArr, Map<String, String> map, long j8, long j9, String str, int i8, Object obj) {
        byte[] bArr2 = bArr;
        long j10 = j7 + j8;
        boolean z6 = true;
        o2.a.a(j10 >= 0);
        o2.a.a(j8 >= 0);
        if (j9 <= 0 && j9 != -1) {
            z6 = false;
        }
        o2.a.a(z6);
        this.f19496a = uri;
        this.f19497b = j7;
        this.f19498c = i7;
        this.f19499d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f19500e = Collections.unmodifiableMap(new HashMap(map));
        this.f19502g = j8;
        this.f19501f = j10;
        this.f19503h = j9;
        this.f19504i = str;
        this.f19505j = i8;
        this.f19506k = obj;
    }

    public p(Uri uri, long j7, long j8) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j7, j8, null, 0, null);
    }

    public static String c(int i7) {
        if (i7 == 1) {
            return "GET";
        }
        if (i7 == 2) {
            return "POST";
        }
        if (i7 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f19498c);
    }

    public boolean d(int i7) {
        return (this.f19505j & i7) == i7;
    }

    public p e(long j7) {
        long j8 = this.f19503h;
        return f(j7, j8 != -1 ? j8 - j7 : -1L);
    }

    public p f(long j7, long j8) {
        return (j7 == 0 && this.f19503h == j8) ? this : new p(this.f19496a, this.f19497b, this.f19498c, this.f19499d, this.f19500e, this.f19502g + j7, j8, this.f19504i, this.f19505j, this.f19506k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f19496a + ", " + this.f19502g + ", " + this.f19503h + ", " + this.f19504i + ", " + this.f19505j + "]";
    }
}
