package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f14872a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    private boolean f14873b;

    /* renamed from: c, reason: collision with root package name */
    private int f14874c;

    /* renamed from: d, reason: collision with root package name */
    private long f14875d;

    /* renamed from: e, reason: collision with root package name */
    private int f14876e;

    /* renamed from: f, reason: collision with root package name */
    private int f14877f;

    /* renamed from: g, reason: collision with root package name */
    private int f14878g;

    public final void a(y yVar) {
        if (this.f14874c > 0) {
            yVar.X.a(this.f14875d, this.f14876e, this.f14877f, this.f14878g, yVar.f14455j);
            this.f14874c = 0;
        }
    }

    public final void b() {
        this.f14873b = false;
        this.f14874c = 0;
    }

    public final void c(y yVar, long j7, int i7, int i8, int i9) {
        if (this.f14873b) {
            int i10 = this.f14874c;
            int i11 = i10 + 1;
            this.f14874c = i11;
            if (i10 == 0) {
                this.f14875d = j7;
                this.f14876e = i7;
                this.f14877f = 0;
            }
            this.f14877f += i8;
            this.f14878g = i9;
            if (i11 >= 16) {
                a(yVar);
            }
        }
    }

    public final void d(pc4 pc4Var) {
        if (this.f14873b) {
            return;
        }
        ((jc4) pc4Var).n(this.f14872a, 0, 10, false);
        pc4Var.i();
        byte[] bArr = this.f14872a;
        int i7 = tb4.f12174g;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f14873b = true;
        }
    }
}
