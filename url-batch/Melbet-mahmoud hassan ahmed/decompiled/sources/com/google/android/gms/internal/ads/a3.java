package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class a3 {

    /* renamed from: a, reason: collision with root package name */
    private final td4 f2572a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2573b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2574c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2575d;

    /* renamed from: e, reason: collision with root package name */
    private int f2576e;

    /* renamed from: f, reason: collision with root package name */
    private int f2577f;

    /* renamed from: g, reason: collision with root package name */
    private long f2578g;

    /* renamed from: h, reason: collision with root package name */
    private long f2579h;

    public a3(td4 td4Var) {
        this.f2572a = td4Var;
    }

    public final void a(byte[] bArr, int i7, int i8) {
        if (this.f2574c) {
            int i9 = this.f2577f;
            int i10 = (i7 + 1) - i9;
            if (i10 >= i8) {
                this.f2577f = i9 + (i8 - i7);
            } else {
                this.f2575d = ((bArr[i10] & 192) >> 6) == 0;
                this.f2574c = false;
            }
        }
    }

    public final void b(long j7, int i7, boolean z6) {
        if (this.f2576e == 182 && z6 && this.f2573b) {
            long j8 = this.f2579h;
            if (j8 != -9223372036854775807L) {
                long j9 = this.f2578g;
                this.f2572a.a(j8, this.f2575d ? 1 : 0, (int) (j7 - j9), i7, null);
            }
        }
        if (this.f2576e != 179) {
            this.f2578g = j7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i7, long j7) {
        boolean z6;
        this.f2576e = i7;
        this.f2575d = false;
        if (i7 != 182) {
            if (i7 != 179) {
                z6 = false;
                this.f2573b = z6;
                this.f2574c = i7 == 182;
                this.f2577f = 0;
                this.f2579h = j7;
            }
            i7 = 179;
        }
        z6 = true;
        this.f2573b = z6;
        this.f2574c = i7 == 182;
        this.f2577f = 0;
        this.f2579h = j7;
    }

    public final void d() {
        this.f2573b = false;
        this.f2574c = false;
        this.f2575d = false;
        this.f2576e = -1;
    }
}
