package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.ironsource.b9;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class mv {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f29239a;

    /* renamed from: b, reason: collision with root package name */
    public final long f29240b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29241c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f29242d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f29243e;

    /* renamed from: f, reason: collision with root package name */
    public final long f29244f;

    /* renamed from: g, reason: collision with root package name */
    public final long f29245g;

    /* renamed from: h, reason: collision with root package name */
    public final String f29246h;

    /* renamed from: i, reason: collision with root package name */
    public final int f29247i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f29248j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Uri f29249a;

        /* renamed from: b, reason: collision with root package name */
        private long f29250b;

        /* renamed from: c, reason: collision with root package name */
        private int f29251c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f29252d;

        /* renamed from: e, reason: collision with root package name */
        private Map<String, String> f29253e;

        /* renamed from: f, reason: collision with root package name */
        private long f29254f;

        /* renamed from: g, reason: collision with root package name */
        private long f29255g;

        /* renamed from: h, reason: collision with root package name */
        private String f29256h;

        /* renamed from: i, reason: collision with root package name */
        private int f29257i;

        /* renamed from: j, reason: collision with root package name */
        private Object f29258j;

        public final mv a() {
            if (this.f29249a != null) {
                return new mv(this.f29249a, this.f29250b, this.f29251c, this.f29252d, this.f29253e, this.f29254f, this.f29255g, this.f29256h, this.f29257i, this.f29258j);
            }
            throw new IllegalStateException("The uri must be set.");
        }

        public final a b() {
            this.f29251c = 2;
            return this;
        }

        public final a c(long j4) {
            this.f29250b = j4;
            return this;
        }

        public a() {
            this.f29251c = 1;
            this.f29253e = Collections.EMPTY_MAP;
            this.f29255g = -1L;
        }

        public final a b(long j4) {
            this.f29254f = j4;
            return this;
        }

        public final a b(String str) {
            this.f29249a = Uri.parse(str);
            return this;
        }

        public final a a(int i4) {
            this.f29257i = i4;
            return this;
        }

        public final a a(byte[] bArr) {
            this.f29252d = bArr;
            return this;
        }

        private a(mv mvVar) {
            this.f29249a = mvVar.f29239a;
            this.f29250b = mvVar.f29240b;
            this.f29251c = mvVar.f29241c;
            this.f29252d = mvVar.f29242d;
            this.f29253e = mvVar.f29243e;
            this.f29254f = mvVar.f29244f;
            this.f29255g = mvVar.f29245g;
            this.f29256h = mvVar.f29246h;
            this.f29257i = mvVar.f29247i;
            this.f29258j = mvVar.f29248j;
        }

        public final a a(Map<String, String> map) {
            this.f29253e = map;
            return this;
        }

        public final a a(String str) {
            this.f29256h = str;
            return this;
        }

        public final a a(long j4) {
            this.f29255g = j4;
            return this;
        }

        public final a a(Uri uri) {
            this.f29249a = uri;
            return this;
        }
    }

    static {
        k60.a("goog.exo.datasource");
    }

    public static String a(int i4) {
        if (i4 == 1) {
            return com.ironsource.jn.f16864a;
        }
        if (i4 == 2) {
            return com.ironsource.jn.f16865b;
        }
        if (i4 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return "DataSpec[" + a(this.f29241c) + " " + this.f29239a + ", " + this.f29244f + ", " + this.f29245g + ", " + this.f29246h + ", " + this.f29247i + b9.i.f15552e;
    }

    private mv(Uri uri, long j4, int i4, byte[] bArr, Map<String, String> map, long j5, long j6, String str, int i5, Object obj) {
        C2253tf.a(j4 + j5 >= 0);
        C2253tf.a(j5 >= 0);
        C2253tf.a(j6 > 0 || j6 == -1);
        this.f29239a = uri;
        this.f29240b = j4;
        this.f29241c = i4;
        this.f29242d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f29243e = Collections.unmodifiableMap(new HashMap(map));
        this.f29244f = j5;
        this.f29245g = j6;
        this.f29246h = str;
        this.f29247i = i5;
        this.f29248j = obj;
    }

    public final mv a(long j4) {
        return this.f29245g == j4 ? this : new mv(this.f29239a, this.f29240b, this.f29241c, this.f29242d, this.f29243e, this.f29244f, j4, this.f29246h, this.f29247i, this.f29248j);
    }

    public final a a() {
        return new a();
    }
}
