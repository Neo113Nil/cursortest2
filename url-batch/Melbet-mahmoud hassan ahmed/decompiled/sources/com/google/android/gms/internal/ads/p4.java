package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class p4 implements q4 {

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f10076m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f10077n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    private final rc4 f10078a;

    /* renamed from: b, reason: collision with root package name */
    private final td4 f10079b;

    /* renamed from: c, reason: collision with root package name */
    private final t4 f10080c;

    /* renamed from: d, reason: collision with root package name */
    private final int f10081d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f10082e;

    /* renamed from: f, reason: collision with root package name */
    private final dr2 f10083f;

    /* renamed from: g, reason: collision with root package name */
    private final int f10084g;

    /* renamed from: h, reason: collision with root package name */
    private final c0 f10085h;

    /* renamed from: i, reason: collision with root package name */
    private int f10086i;

    /* renamed from: j, reason: collision with root package name */
    private long f10087j;

    /* renamed from: k, reason: collision with root package name */
    private int f10088k;

    /* renamed from: l, reason: collision with root package name */
    private long f10089l;

    public p4(rc4 rc4Var, td4 td4Var, t4 t4Var) {
        this.f10078a = rc4Var;
        this.f10079b = td4Var;
        this.f10080c = t4Var;
        int max = Math.max(1, t4Var.f12073c / 10);
        this.f10084g = max;
        dr2 dr2Var = new dr2(t4Var.f12076f);
        dr2Var.q();
        int q7 = dr2Var.q();
        this.f10081d = q7;
        int i7 = t4Var.f12072b;
        int i8 = (((t4Var.f12074d - (i7 * 4)) * 8) / (t4Var.f12075e * i7)) + 1;
        if (q7 != i8) {
            StringBuilder sb = new StringBuilder(56);
            sb.append("Expected frames per block: ");
            sb.append(i8);
            sb.append("; got: ");
            sb.append(q7);
            throw dz.a(sb.toString(), null);
        }
        int K = n13.K(max, q7);
        this.f10082e = new byte[t4Var.f12074d * K];
        this.f10083f = new dr2(K * (q7 + q7) * i7);
        int i9 = ((t4Var.f12073c * t4Var.f12074d) * 8) / q7;
        bf4 bf4Var = new bf4();
        bf4Var.s("audio/raw");
        bf4Var.d0(i9);
        bf4Var.o(i9);
        bf4Var.l((max + max) * i7);
        bf4Var.e0(t4Var.f12072b);
        bf4Var.t(t4Var.f12073c);
        bf4Var.n(2);
        this.f10085h = bf4Var.y();
    }

    private final int d(int i7) {
        int i8 = this.f10080c.f12072b;
        return i7 / (i8 + i8);
    }

    private final int e(int i7) {
        return (i7 + i7) * this.f10080c.f12072b;
    }

    private final void f(int i7) {
        long j7 = this.f10087j;
        long Z = n13.Z(this.f10089l, 1000000L, this.f10080c.f12073c);
        int e7 = e(i7);
        this.f10079b.a(j7 + Z, 1, e7, this.f10088k - e7, null);
        this.f10089l += i7;
        this.f10088k -= e7;
    }

    @Override // com.google.android.gms.internal.ads.q4
    public final void a(long j7) {
        this.f10086i = 0;
        this.f10087j = j7;
        this.f10088k = 0;
        this.f10089l = 0L;
    }

    @Override // com.google.android.gms.internal.ads.q4
    public final void b(int i7, long j7) {
        this.f10078a.p(new w4(this.f10080c, this.f10081d, i7, j7));
        this.f10079b.b(this.f10085h);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003b -> B:3:0x001f). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.q4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(pc4 pc4Var, long j7) {
        boolean z6;
        int i7;
        int d7;
        int K = n13.K(this.f10084g - d(this.f10088k), this.f10081d) * this.f10080c.f12074d;
        if (j7 != 0) {
            z6 = false;
            while (!z6) {
                if (this.f10086i >= K) {
                    break;
                }
                int a7 = pc4Var.a(this.f10082e, this.f10086i, (int) Math.min(K - r7, j7));
                if (a7 != -1) {
                    this.f10086i += a7;
                }
            }
            i7 = this.f10086i / this.f10080c.f12074d;
            if (i7 > 0) {
                byte[] bArr = this.f10082e;
                dr2 dr2Var = this.f10083f;
                for (int i8 = 0; i8 < i7; i8++) {
                    for (int i9 = 0; i9 < this.f10080c.f12072b; i9++) {
                        byte[] h7 = dr2Var.h();
                        t4 t4Var = this.f10080c;
                        int i10 = t4Var.f12074d;
                        int i11 = t4Var.f12072b;
                        int i12 = (i8 * i10) + (i9 * 4);
                        int i13 = (i11 * 4) + i12;
                        int i14 = (short) (((bArr[i12 + 1] & 255) << 8) | (bArr[i12] & 255));
                        int min = Math.min(bArr[i12 + 2] & 255, 88);
                        int i15 = f10077n[min];
                        int i16 = (this.f10081d * i8 * i11) + i9;
                        int i17 = i16 + i16;
                        h7[i17] = (byte) (i14 & 255);
                        h7[i17 + 1] = (byte) (i14 >> 8);
                        int i18 = 0;
                        for (int i19 = (i10 / i11) - 4; i18 < i19 + i19; i19 = i19) {
                            int i20 = bArr[((i18 / 8) * i11 * 4) + i13 + ((i18 / 2) % 4)] & 255;
                            int i21 = i18 % 2 == 0 ? i20 & 15 : i20 >> 4;
                            int i22 = i21 & 7;
                            int i23 = (i22 + i22 + 1) * i15;
                            byte[] bArr2 = bArr;
                            int i24 = i23 >> 3;
                            if ((i21 & 8) != 0) {
                                i24 = -i24;
                            }
                            i14 = n13.L(i14 + i24, -32768, 32767);
                            i17 += i11 + i11;
                            h7[i17] = (byte) (i14 & 255);
                            h7[i17 + 1] = (byte) (i14 >> 8);
                            min = n13.L(min + f10076m[i21], 0, 88);
                            i18++;
                            bArr = bArr2;
                            i15 = f10077n[min];
                        }
                    }
                }
                int e7 = e(this.f10081d * i7);
                dr2Var.f(0);
                dr2Var.e(e7);
                this.f10086i -= i7 * this.f10080c.f12074d;
                int l7 = this.f10083f.l();
                rd4.b(this.f10079b, this.f10083f, l7);
                int i25 = this.f10088k + l7;
                this.f10088k = i25;
                int d8 = d(i25);
                int i26 = this.f10084g;
                if (d8 >= i26) {
                    f(i26);
                }
            }
            if (z6 && (d7 = d(this.f10088k)) > 0) {
                f(d7);
            }
            return z6;
        }
        z6 = true;
        while (!z6) {
        }
        i7 = this.f10086i / this.f10080c.f12074d;
        if (i7 > 0) {
        }
        if (z6) {
            f(d7);
        }
        return z6;
    }
}
