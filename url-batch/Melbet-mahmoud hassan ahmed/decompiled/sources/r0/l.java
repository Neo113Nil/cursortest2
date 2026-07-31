package r0;

/* loaded from: classes.dex */
public class l implements y1 {

    /* renamed from: a, reason: collision with root package name */
    private final n2.q f20740a;

    /* renamed from: b, reason: collision with root package name */
    private final long f20741b;

    /* renamed from: c, reason: collision with root package name */
    private final long f20742c;

    /* renamed from: d, reason: collision with root package name */
    private final long f20743d;

    /* renamed from: e, reason: collision with root package name */
    private final long f20744e;

    /* renamed from: f, reason: collision with root package name */
    private final int f20745f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f20746g;

    /* renamed from: h, reason: collision with root package name */
    private final long f20747h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f20748i;

    /* renamed from: j, reason: collision with root package name */
    private int f20749j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f20750k;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private n2.q f20751a;

        /* renamed from: b, reason: collision with root package name */
        private int f20752b = 50000;

        /* renamed from: c, reason: collision with root package name */
        private int f20753c = 50000;

        /* renamed from: d, reason: collision with root package name */
        private int f20754d = 2500;

        /* renamed from: e, reason: collision with root package name */
        private int f20755e = 5000;

        /* renamed from: f, reason: collision with root package name */
        private int f20756f = -1;

        /* renamed from: g, reason: collision with root package name */
        private boolean f20757g = false;

        /* renamed from: h, reason: collision with root package name */
        private int f20758h = 0;

        /* renamed from: i, reason: collision with root package name */
        private boolean f20759i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f20760j;

        public l a() {
            o2.a.f(!this.f20760j);
            this.f20760j = true;
            if (this.f20751a == null) {
                this.f20751a = new n2.q(true, 65536);
            }
            return new l(this.f20751a, this.f20752b, this.f20753c, this.f20754d, this.f20755e, this.f20756f, this.f20757g, this.f20758h, this.f20759i);
        }

        public a b(int i7, boolean z6) {
            o2.a.f(!this.f20760j);
            l.k(i7, 0, "backBufferDurationMs", "0");
            this.f20758h = i7;
            this.f20759i = z6;
            return this;
        }

        public a c(int i7, int i8, int i9, int i10) {
            o2.a.f(!this.f20760j);
            l.k(i9, 0, "bufferForPlaybackMs", "0");
            l.k(i10, 0, "bufferForPlaybackAfterRebufferMs", "0");
            l.k(i7, i9, "minBufferMs", "bufferForPlaybackMs");
            l.k(i7, i10, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            l.k(i8, i7, "maxBufferMs", "minBufferMs");
            this.f20752b = i7;
            this.f20753c = i8;
            this.f20754d = i9;
            this.f20755e = i10;
            return this;
        }

        public a d(boolean z6) {
            o2.a.f(!this.f20760j);
            this.f20757g = z6;
            return this;
        }

        public a e(int i7) {
            o2.a.f(!this.f20760j);
            this.f20756f = i7;
            return this;
        }
    }

    public l() {
        this(new n2.q(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    protected l(n2.q qVar, int i7, int i8, int i9, int i10, int i11, boolean z6, int i12, boolean z7) {
        k(i9, 0, "bufferForPlaybackMs", "0");
        k(i10, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k(i7, i9, "minBufferMs", "bufferForPlaybackMs");
        k(i7, i10, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k(i8, i7, "maxBufferMs", "minBufferMs");
        k(i12, 0, "backBufferDurationMs", "0");
        this.f20740a = qVar;
        this.f20741b = o2.m0.B0(i7);
        this.f20742c = o2.m0.B0(i8);
        this.f20743d = o2.m0.B0(i9);
        this.f20744e = o2.m0.B0(i10);
        this.f20745f = i11;
        this.f20749j = i11 == -1 ? 13107200 : i11;
        this.f20746g = z6;
        this.f20747h = o2.m0.B0(i12);
        this.f20748i = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(int i7, int i8, String str, String str2) {
        o2.a.b(i7 >= i8, str + " cannot be less than " + str2);
    }

    private static int m(int i7) {
        switch (i7) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    private void n(boolean z6) {
        int i7 = this.f20745f;
        if (i7 == -1) {
            i7 = 13107200;
        }
        this.f20749j = i7;
        this.f20750k = false;
        if (z6) {
            this.f20740a.g();
        }
    }

    @Override // r0.y1
    public void b() {
        n(false);
    }

    @Override // r0.y1
    public boolean c() {
        return this.f20748i;
    }

    @Override // r0.y1
    public void d(e3[] e3VarArr, t1.z0 z0Var, m2.t[] tVarArr) {
        int i7 = this.f20745f;
        if (i7 == -1) {
            i7 = l(e3VarArr, tVarArr);
        }
        this.f20749j = i7;
        this.f20740a.h(i7);
    }

    @Override // r0.y1
    public void e() {
        n(true);
    }

    @Override // r0.y1
    public boolean f(long j7, float f7, boolean z6, long j8) {
        long e02 = o2.m0.e0(j7, f7);
        long j9 = z6 ? this.f20744e : this.f20743d;
        if (j8 != -9223372036854775807L) {
            j9 = Math.min(j8 / 2, j9);
        }
        return j9 <= 0 || e02 >= j9 || (!this.f20746g && this.f20740a.f() >= this.f20749j);
    }

    @Override // r0.y1
    public boolean g(long j7, long j8, float f7) {
        boolean z6 = true;
        boolean z7 = this.f20740a.f() >= this.f20749j;
        long j9 = this.f20741b;
        if (f7 > 1.0f) {
            j9 = Math.min(o2.m0.Z(j9, f7), this.f20742c);
        }
        if (j8 < Math.max(j9, 500000L)) {
            if (!this.f20746g && z7) {
                z6 = false;
            }
            this.f20750k = z6;
            if (!z6 && j8 < 500000) {
                o2.r.i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j8 >= this.f20742c || z7) {
            this.f20750k = false;
        }
        return this.f20750k;
    }

    @Override // r0.y1
    public n2.b h() {
        return this.f20740a;
    }

    @Override // r0.y1
    public void i() {
        n(true);
    }

    @Override // r0.y1
    public long j() {
        return this.f20747h;
    }

    protected int l(e3[] e3VarArr, m2.t[] tVarArr) {
        int i7 = 0;
        for (int i8 = 0; i8 < e3VarArr.length; i8++) {
            if (tVarArr[i8] != null) {
                i7 += m(e3VarArr[i8].j());
            }
        }
        return Math.max(13107200, i7);
    }
}
