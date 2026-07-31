package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class h3 {

    /* renamed from: a, reason: collision with root package name */
    private final td4 f6041a;

    /* renamed from: b, reason: collision with root package name */
    private long f6042b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6043c;

    /* renamed from: d, reason: collision with root package name */
    private int f6044d;

    /* renamed from: e, reason: collision with root package name */
    private long f6045e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6046f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6047g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6048h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6049i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6050j;

    /* renamed from: k, reason: collision with root package name */
    private long f6051k;

    /* renamed from: l, reason: collision with root package name */
    private long f6052l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6053m;

    public h3(td4 td4Var) {
        this.f6041a = td4Var;
    }

    private final void e(int i7) {
        long j7 = this.f6052l;
        if (j7 == -9223372036854775807L) {
            return;
        }
        boolean z6 = this.f6053m;
        long j8 = this.f6042b;
        long j9 = this.f6051k;
        this.f6041a.a(j7, z6 ? 1 : 0, (int) (j8 - j9), i7, null);
    }

    public final void a(long j7, int i7, boolean z6) {
        if (this.f6050j && this.f6047g) {
            this.f6053m = this.f6043c;
            this.f6050j = false;
        } else if (this.f6048h || this.f6047g) {
            if (z6 && this.f6049i) {
                e(i7 + ((int) (j7 - this.f6042b)));
            }
            this.f6051k = this.f6042b;
            this.f6052l = this.f6045e;
            this.f6053m = this.f6043c;
            this.f6049i = true;
        }
    }

    public final void b(byte[] bArr, int i7, int i8) {
        if (this.f6046f) {
            int i9 = this.f6044d;
            int i10 = (i7 + 2) - i9;
            if (i10 >= i8) {
                this.f6044d = i9 + (i8 - i7);
            } else {
                this.f6047g = (bArr[i10] & 128) != 0;
                this.f6046f = false;
            }
        }
    }

    public final void c() {
        this.f6046f = false;
        this.f6047g = false;
        this.f6048h = false;
        this.f6049i = false;
        this.f6050j = false;
    }

    public final void d(long j7, int i7, int i8, long j8, boolean z6) {
        this.f6047g = false;
        this.f6048h = false;
        this.f6045e = j8;
        this.f6044d = 0;
        this.f6042b = j7;
        if (i8 >= 32 && i8 != 40) {
            if (this.f6049i && !this.f6050j) {
                if (z6) {
                    e(i7);
                }
                this.f6049i = false;
            }
            if (i8 <= 35 || i8 == 39) {
                this.f6048h = !this.f6050j;
                this.f6050j = true;
            }
        }
        boolean z7 = i8 >= 16 && i8 <= 21;
        this.f6043c = z7;
        this.f6046f = z7 || i8 <= 9;
    }
}
