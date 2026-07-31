package p2;

import java.util.Arrays;

/* loaded from: classes.dex */
final class e {

    /* renamed from: c, reason: collision with root package name */
    private boolean f19990c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19991d;

    /* renamed from: f, reason: collision with root package name */
    private int f19993f;

    /* renamed from: a, reason: collision with root package name */
    private a f19988a = new a();

    /* renamed from: b, reason: collision with root package name */
    private a f19989b = new a();

    /* renamed from: e, reason: collision with root package name */
    private long f19992e = -9223372036854775807L;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f19994a;

        /* renamed from: b, reason: collision with root package name */
        private long f19995b;

        /* renamed from: c, reason: collision with root package name */
        private long f19996c;

        /* renamed from: d, reason: collision with root package name */
        private long f19997d;

        /* renamed from: e, reason: collision with root package name */
        private long f19998e;

        /* renamed from: f, reason: collision with root package name */
        private long f19999f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean[] f20000g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        private int f20001h;

        private static int c(long j7) {
            return (int) (j7 % 15);
        }

        public long a() {
            long j7 = this.f19998e;
            if (j7 == 0) {
                return 0L;
            }
            return this.f19999f / j7;
        }

        public long b() {
            return this.f19999f;
        }

        public boolean d() {
            long j7 = this.f19997d;
            if (j7 == 0) {
                return false;
            }
            return this.f20000g[c(j7 - 1)];
        }

        public boolean e() {
            return this.f19997d > 15 && this.f20001h == 0;
        }

        public void f(long j7) {
            int i7;
            long j8 = this.f19997d;
            if (j8 == 0) {
                this.f19994a = j7;
            } else if (j8 == 1) {
                long j9 = j7 - this.f19994a;
                this.f19995b = j9;
                this.f19999f = j9;
                this.f19998e = 1L;
            } else {
                long j10 = j7 - this.f19996c;
                int c7 = c(j8);
                if (Math.abs(j10 - this.f19995b) <= 1000000) {
                    this.f19998e++;
                    this.f19999f += j10;
                    boolean[] zArr = this.f20000g;
                    if (zArr[c7]) {
                        zArr[c7] = false;
                        i7 = this.f20001h - 1;
                        this.f20001h = i7;
                    }
                } else {
                    boolean[] zArr2 = this.f20000g;
                    if (!zArr2[c7]) {
                        zArr2[c7] = true;
                        i7 = this.f20001h + 1;
                        this.f20001h = i7;
                    }
                }
            }
            this.f19997d++;
            this.f19996c = j7;
        }

        public void g() {
            this.f19997d = 0L;
            this.f19998e = 0L;
            this.f19999f = 0L;
            this.f20001h = 0;
            Arrays.fill(this.f20000g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f19988a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (!e()) {
            return -1.0f;
        }
        double a7 = this.f19988a.a();
        Double.isNaN(a7);
        return (float) (1.0E9d / a7);
    }

    public int c() {
        return this.f19993f;
    }

    public long d() {
        if (e()) {
            return this.f19988a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f19988a.e();
    }

    public void f(long j7) {
        this.f19988a.f(j7);
        if (this.f19988a.e() && !this.f19991d) {
            this.f19990c = false;
        } else if (this.f19992e != -9223372036854775807L) {
            if (!this.f19990c || this.f19989b.d()) {
                this.f19989b.g();
                this.f19989b.f(this.f19992e);
            }
            this.f19990c = true;
            this.f19989b.f(j7);
        }
        if (this.f19990c && this.f19989b.e()) {
            a aVar = this.f19988a;
            this.f19988a = this.f19989b;
            this.f19989b = aVar;
            this.f19990c = false;
            this.f19991d = false;
        }
        this.f19992e = j7;
        this.f19993f = this.f19988a.e() ? 0 : this.f19993f + 1;
    }

    public void g() {
        this.f19988a.g();
        this.f19989b.g();
        this.f19990c = false;
        this.f19992e = -9223372036854775807L;
        this.f19993f = 0;
    }
}
