package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;

/* renamed from: com.yandex.mobile.ads.impl.sk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2235sk {

    /* renamed from: a, reason: collision with root package name */
    protected final a f31794a;

    /* renamed from: b, reason: collision with root package name */
    protected final f f31795b;

    /* renamed from: c, reason: collision with root package name */
    protected c f31796c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31797d;

    /* renamed from: com.yandex.mobile.ads.impl.sk$a */
    public static class a implements tw1 {

        /* renamed from: a, reason: collision with root package name */
        private final d f31798a;

        /* renamed from: b, reason: collision with root package name */
        private final long f31799b;

        /* renamed from: c, reason: collision with root package name */
        private final long f31800c = 0;

        /* renamed from: d, reason: collision with root package name */
        private final long f31801d;

        /* renamed from: e, reason: collision with root package name */
        private final long f31802e;

        /* renamed from: f, reason: collision with root package name */
        private final long f31803f;

        /* renamed from: g, reason: collision with root package name */
        private final long f31804g;

        public a(d dVar, long j4, long j5, long j6, long j7, long j8) {
            this.f31798a = dVar;
            this.f31799b = j4;
            this.f31801d = j5;
            this.f31802e = j6;
            this.f31803f = j7;
            this.f31804g = j8;
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final boolean b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final long c() {
            return this.f31799b;
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final tw1.a b(long j4) {
            vw1 vw1Var = new vw1(j4, c.a(this.f31798a.a(j4), this.f31800c, this.f31801d, this.f31802e, this.f31803f, this.f31804g));
            return new tw1.a(vw1Var, vw1Var);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sk$b */
    public static final class b implements d {
        @Override // com.yandex.mobile.ads.impl.AbstractC2235sk.d
        public final long a(long j4) {
            return j4;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sk$c */
    protected static class c {

        /* renamed from: a, reason: collision with root package name */
        private final long f31805a;

        /* renamed from: b, reason: collision with root package name */
        private final long f31806b;

        /* renamed from: c, reason: collision with root package name */
        private final long f31807c;

        /* renamed from: d, reason: collision with root package name */
        private long f31808d;

        /* renamed from: e, reason: collision with root package name */
        private long f31809e;

        /* renamed from: f, reason: collision with root package name */
        private long f31810f;

        /* renamed from: g, reason: collision with root package name */
        private long f31811g;

        /* renamed from: h, reason: collision with root package name */
        private long f31812h;

        protected c(long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
            this.f31805a = j4;
            this.f31806b = j5;
            this.f31808d = j6;
            this.f31809e = j7;
            this.f31810f = j8;
            this.f31811g = j9;
            this.f31807c = j10;
            this.f31812h = a(j5, j6, j7, j8, j9, j10);
        }

        protected static long a(long j4, long j5, long j6, long j7, long j8, long j9) {
            if (j7 + 1 >= j8 || j5 + 1 >= j6) {
                return j7;
            }
            long j10 = (long) ((j4 - j5) * ((j8 - j7) / (j6 - j5)));
            long j11 = j10 / 20;
            int i4 = u82.f32873a;
            return Math.max(j7, Math.min(((j10 + j7) - j9) - j11, j8 - 1));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sk$d */
    protected interface d {
        long a(long j4);
    }

    /* renamed from: com.yandex.mobile.ads.impl.sk$e */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f31813d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a, reason: collision with root package name */
        private final int f31814a;

        /* renamed from: b, reason: collision with root package name */
        private final long f31815b;

        /* renamed from: c, reason: collision with root package name */
        private final long f31816c;

        private e(int i4, long j4, long j5) {
            this.f31814a = i4;
            this.f31815b = j4;
            this.f31816c = j5;
        }

        public static e a(long j4, long j5) {
            return new e(-1, j4, j5);
        }

        public static e b(long j4, long j5) {
            return new e(-2, j4, j5);
        }

        public static e a(long j4) {
            return new e(0, -9223372036854775807L, j4);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sk$f */
    protected interface f {
        e a(lz lzVar, long j4);

        default void a() {
        }
    }

    protected AbstractC2235sk(d dVar, f fVar, long j4, long j5, long j6, long j7, long j8, int i4) {
        this.f31795b = fVar;
        this.f31797d = i4;
        this.f31794a = new a(dVar, j4, j5, j6, j7, j8);
    }

    public final a a() {
        return this.f31794a;
    }

    public final boolean b() {
        return this.f31796c != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0102, code lost:
    
        if (r8 != r19.a()) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0104, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0105, code lost:
    
        r20.f26771a = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0107, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(lz lzVar, hj1 hj1Var) {
        while (true) {
            c cVar = this.f31796c;
            if (cVar == null) {
                throw new IllegalStateException();
            }
            long j4 = cVar.f31810f;
            long j5 = cVar.f31811g;
            long j6 = cVar.f31812h;
            if (j5 - j4 <= this.f31797d) {
                this.f31796c = null;
                this.f31795b.a();
                if (j4 == lzVar.a()) {
                    return 0;
                }
                hj1Var.f26771a = j4;
                return 1;
            }
            long a4 = j6 - lzVar.a();
            if (a4 < 0 || a4 > 262144) {
                break;
            }
            lzVar.a((int) a4);
            lzVar.c();
            e a5 = this.f31795b.a(lzVar, cVar.f31806b);
            int i4 = a5.f31814a;
            if (i4 == -3) {
                this.f31796c = null;
                this.f31795b.a();
                if (j6 == lzVar.a()) {
                    return 0;
                }
                hj1Var.f26771a = j6;
                return 1;
            }
            if (i4 == -2) {
                long j7 = a5.f31815b;
                long j8 = a5.f31816c;
                cVar.f31808d = j7;
                cVar.f31810f = j8;
                cVar.f31812h = c.a(cVar.f31806b, j7, cVar.f31809e, j8, cVar.f31811g, cVar.f31807c);
            } else {
                if (i4 != -1) {
                    if (i4 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long a6 = a5.f31816c - lzVar.a();
                    if (a6 >= 0 && a6 <= 262144) {
                        lzVar.a((int) a6);
                    }
                    this.f31796c = null;
                    this.f31795b.a();
                    long j9 = a5.f31816c;
                    if (j9 == lzVar.a()) {
                        return 0;
                    }
                    hj1Var.f26771a = j9;
                    return 1;
                }
                long j10 = a5.f31815b;
                long j11 = a5.f31816c;
                cVar.f31809e = j10;
                cVar.f31811g = j11;
                cVar.f31812h = c.a(cVar.f31806b, cVar.f31808d, j10, cVar.f31810f, j11, cVar.f31807c);
            }
        }
    }

    public final void a(long j4) {
        c cVar = this.f31796c;
        if (cVar == null || cVar.f31805a != j4) {
            long a4 = this.f31794a.f31798a.a(j4);
            a aVar = this.f31794a;
            this.f31796c = new c(j4, a4, aVar.f31800c, aVar.f31801d, aVar.f31802e, aVar.f31803f, aVar.f31804g);
        }
    }
}
