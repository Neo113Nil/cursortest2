package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
final class j2 extends h2 {

    /* renamed from: n, reason: collision with root package name */
    private i2 f6933n;

    /* renamed from: o, reason: collision with root package name */
    private int f6934o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f6935p;

    /* renamed from: q, reason: collision with root package name */
    private xd4 f6936q;

    /* renamed from: r, reason: collision with root package name */
    private vd4 f6937r;

    j2() {
    }

    @Override // com.google.android.gms.internal.ads.h2
    protected final long a(dr2 dr2Var) {
        if ((dr2Var.h()[0] & 1) == 1) {
            return -1L;
        }
        byte b7 = dr2Var.h()[0];
        i2 i2Var = this.f6933n;
        wu1.b(i2Var);
        int i7 = !i2Var.f6493d[(b7 >> 1) & (255 >>> (8 - i2Var.f6494e))].f13801a ? i2Var.f6490a.f14157e : i2Var.f6490a.f14158f;
        long j7 = this.f6935p ? (this.f6934o + i7) / 4 : 0;
        if (dr2Var.j() < dr2Var.l() + 4) {
            byte[] copyOf = Arrays.copyOf(dr2Var.h(), dr2Var.l() + 4);
            dr2Var.d(copyOf, copyOf.length);
        } else {
            dr2Var.e(dr2Var.l() + 4);
        }
        byte[] h7 = dr2Var.h();
        h7[dr2Var.l() - 4] = (byte) (j7 & 255);
        h7[dr2Var.l() - 3] = (byte) ((j7 >>> 8) & 255);
        h7[dr2Var.l() - 2] = (byte) ((j7 >>> 16) & 255);
        h7[dr2Var.l() - 1] = (byte) ((j7 >>> 24) & 255);
        this.f6935p = true;
        this.f6934o = i7;
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.h2
    protected final void b(boolean z6) {
        super.b(z6);
        if (z6) {
            this.f6933n = null;
            this.f6936q = null;
            this.f6937r = null;
        }
        this.f6934o = 0;
        this.f6935p = false;
    }

    @Override // com.google.android.gms.internal.ads.h2
    protected final boolean c(dr2 dr2Var, long j7, d2 d2Var) {
        i2 i2Var;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this.f6933n != null) {
            Objects.requireNonNull(d2Var.f4046a);
            return false;
        }
        xd4 xd4Var = this.f6936q;
        if (xd4Var == null) {
            yd4.c(1, dr2Var, false);
            int p7 = dr2Var.p();
            int s7 = dr2Var.s();
            int p8 = dr2Var.p();
            int o7 = dr2Var.o();
            int i11 = o7 <= 0 ? -1 : o7;
            int o8 = dr2Var.o();
            int i12 = o8 <= 0 ? -1 : o8;
            int o9 = dr2Var.o();
            int i13 = o9 <= 0 ? -1 : o9;
            int s8 = dr2Var.s();
            this.f6936q = new xd4(p7, s7, p8, i11, i12, i13, (int) Math.pow(2.0d, s8 & 15), (int) Math.pow(2.0d, (s8 & 240) >> 4), 1 == (dr2Var.s() & 1), Arrays.copyOf(dr2Var.h(), dr2Var.l()));
        } else {
            vd4 vd4Var = this.f6937r;
            if (vd4Var == null) {
                this.f6937r = yd4.b(dr2Var, true, true);
            } else {
                byte[] bArr = new byte[dr2Var.l()];
                System.arraycopy(dr2Var.h(), 0, bArr, 0, dr2Var.l());
                int i14 = xd4Var.f14153a;
                int i15 = 5;
                yd4.c(5, dr2Var, false);
                int s9 = dr2Var.s() + 1;
                ud4 ud4Var = new ud4(dr2Var.h());
                ud4Var.c(dr2Var.k() * 8);
                int i16 = 0;
                while (i16 < s9) {
                    if (ud4Var.b(24) != 5653314) {
                        int a7 = ud4Var.a();
                        StringBuilder sb = new StringBuilder(66);
                        sb.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                        sb.append(a7);
                        throw dz.a(sb.toString(), null);
                    }
                    int b7 = ud4Var.b(16);
                    int b8 = ud4Var.b(24);
                    long[] jArr = new long[b8];
                    long j8 = 0;
                    if (ud4Var.d()) {
                        i9 = s9;
                        int b9 = ud4Var.b(5) + 1;
                        int i17 = 0;
                        while (i17 < b8) {
                            int b10 = ud4Var.b(yd4.a(b8 - i17));
                            int i18 = 0;
                            while (i18 < b10 && i17 < b8) {
                                jArr[i17] = b9;
                                i17++;
                                i18++;
                                vd4Var = vd4Var;
                                bArr = bArr;
                            }
                            b9++;
                            vd4Var = vd4Var;
                            bArr = bArr;
                        }
                    } else {
                        boolean d7 = ud4Var.d();
                        int i19 = 0;
                        while (i19 < b8) {
                            if (!d7) {
                                i10 = s9;
                                jArr[i19] = ud4Var.b(5) + 1;
                            } else if (ud4Var.d()) {
                                i10 = s9;
                                jArr[i19] = ud4Var.b(i15) + 1;
                            } else {
                                i10 = s9;
                                jArr[i19] = 0;
                            }
                            i19++;
                            s9 = i10;
                            i15 = 5;
                        }
                        i9 = s9;
                    }
                    vd4 vd4Var2 = vd4Var;
                    byte[] bArr2 = bArr;
                    int b11 = ud4Var.b(4);
                    if (b11 > 2) {
                        StringBuilder sb2 = new StringBuilder(53);
                        sb2.append("lookup type greater than 2 not decodable: ");
                        sb2.append(b11);
                        throw dz.a(sb2.toString(), null);
                    }
                    if (b11 != 1) {
                        if (b11 == 2) {
                            b11 = 2;
                        } else {
                            i16++;
                            vd4Var = vd4Var2;
                            s9 = i9;
                            bArr = bArr2;
                            i15 = 5;
                        }
                    }
                    ud4Var.c(32);
                    ud4Var.c(32);
                    int b12 = ud4Var.b(4) + 1;
                    ud4Var.c(1);
                    if (b11 != 1) {
                        j8 = b8 * b7;
                    } else if (b7 != 0) {
                        double d8 = b7;
                        Double.isNaN(d8);
                        j8 = (long) Math.floor(Math.pow(b8, 1.0d / d8));
                    }
                    ud4Var.c((int) (b12 * j8));
                    i16++;
                    vd4Var = vd4Var2;
                    s9 = i9;
                    bArr = bArr2;
                    i15 = 5;
                }
                vd4 vd4Var3 = vd4Var;
                byte[] bArr3 = bArr;
                int i20 = 6;
                int b13 = ud4Var.b(6) + 1;
                for (int i21 = 0; i21 < b13; i21++) {
                    if (ud4Var.b(16) != 0) {
                        throw dz.a("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i22 = 1;
                int b14 = ud4Var.b(6) + 1;
                int i23 = 0;
                while (true) {
                    int i24 = 3;
                    if (i23 < b14) {
                        int b15 = ud4Var.b(16);
                        if (b15 == 0) {
                            int i25 = 8;
                            ud4Var.c(8);
                            ud4Var.c(16);
                            ud4Var.c(16);
                            ud4Var.c(6);
                            ud4Var.c(8);
                            int b16 = ud4Var.b(4) + 1;
                            int i26 = 0;
                            while (i26 < b16) {
                                ud4Var.c(i25);
                                i26++;
                                i25 = 8;
                            }
                        } else {
                            if (b15 != i22) {
                                StringBuilder sb3 = new StringBuilder(52);
                                sb3.append("floor type greater than 1 not decodable: ");
                                sb3.append(b15);
                                throw dz.a(sb3.toString(), null);
                            }
                            int b17 = ud4Var.b(5);
                            int[] iArr = new int[b17];
                            int i27 = -1;
                            for (int i28 = 0; i28 < b17; i28++) {
                                int b18 = ud4Var.b(4);
                                iArr[i28] = b18;
                                if (b18 > i27) {
                                    i27 = b18;
                                }
                            }
                            int i29 = i27 + 1;
                            int[] iArr2 = new int[i29];
                            int i30 = 0;
                            while (i30 < i29) {
                                iArr2[i30] = ud4Var.b(i24) + 1;
                                int b19 = ud4Var.b(2);
                                int i31 = 8;
                                if (b19 > 0) {
                                    ud4Var.c(8);
                                }
                                int i32 = 0;
                                for (int i33 = 1; i32 < (i33 << b19); i33 = 1) {
                                    ud4Var.c(i31);
                                    i32++;
                                    i31 = 8;
                                }
                                i30++;
                                i24 = 3;
                            }
                            ud4Var.c(2);
                            int b20 = ud4Var.b(4);
                            int i34 = 0;
                            int i35 = 0;
                            for (int i36 = 0; i36 < b17; i36++) {
                                i34 += iArr2[iArr[i36]];
                                while (i35 < i34) {
                                    ud4Var.c(b20);
                                    i35++;
                                }
                            }
                        }
                        i23++;
                        i20 = 6;
                        i22 = 1;
                    } else {
                        int i37 = 1;
                        int b21 = ud4Var.b(i20) + 1;
                        int i38 = 0;
                        while (i38 < b21) {
                            if (ud4Var.b(16) > 2) {
                                throw dz.a("residueType greater than 2 is not decodable", null);
                            }
                            ud4Var.c(24);
                            ud4Var.c(24);
                            ud4Var.c(24);
                            int b22 = ud4Var.b(i20) + i37;
                            int i39 = 8;
                            ud4Var.c(8);
                            int[] iArr3 = new int[b22];
                            for (int i40 = 0; i40 < b22; i40++) {
                                iArr3[i40] = ((ud4Var.d() ? ud4Var.b(5) : 0) * 8) + ud4Var.b(3);
                            }
                            int i41 = 0;
                            while (i41 < b22) {
                                int i42 = 0;
                                while (i42 < i39) {
                                    if ((iArr3[i41] & (1 << i42)) != 0) {
                                        ud4Var.c(i39);
                                    }
                                    i42++;
                                    i39 = 8;
                                }
                                i41++;
                                i39 = 8;
                            }
                            i38++;
                            i20 = 6;
                            i37 = 1;
                        }
                        int b23 = ud4Var.b(i20) + 1;
                        for (int i43 = 0; i43 < b23; i43++) {
                            int b24 = ud4Var.b(16);
                            if (b24 != 0) {
                                StringBuilder sb4 = new StringBuilder(52);
                                sb4.append("mapping type other than 0 not supported: ");
                                sb4.append(b24);
                                Log.e("VorbisUtil", sb4.toString());
                            } else {
                                if (ud4Var.d()) {
                                    i7 = 1;
                                    i8 = ud4Var.b(4) + 1;
                                } else {
                                    i7 = 1;
                                    i8 = 1;
                                }
                                if (ud4Var.d()) {
                                    int b25 = ud4Var.b(8) + i7;
                                    for (int i44 = 0; i44 < b25; i44++) {
                                        int i45 = i14 - 1;
                                        ud4Var.c(yd4.a(i45));
                                        ud4Var.c(yd4.a(i45));
                                    }
                                }
                                if (ud4Var.b(2) != 0) {
                                    throw dz.a("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (i8 > 1) {
                                    for (int i46 = 0; i46 < i14; i46++) {
                                        ud4Var.c(4);
                                    }
                                }
                                for (int i47 = 0; i47 < i8; i47++) {
                                    ud4Var.c(8);
                                    ud4Var.c(8);
                                    ud4Var.c(8);
                                }
                            }
                        }
                        int b26 = ud4Var.b(6) + 1;
                        wd4[] wd4VarArr = new wd4[b26];
                        for (int i48 = 0; i48 < b26; i48++) {
                            wd4VarArr[i48] = new wd4(ud4Var.d(), ud4Var.b(16), ud4Var.b(16), ud4Var.b(8));
                        }
                        if (!ud4Var.d()) {
                            throw dz.a("framing bit after modes not set as expected", null);
                        }
                        i2Var = new i2(xd4Var, vd4Var3, bArr3, wd4VarArr, yd4.a(b26 - 1));
                    }
                }
            }
        }
        i2Var = null;
        this.f6933n = i2Var;
        if (i2Var == null) {
            return true;
        }
        xd4 xd4Var2 = i2Var.f6490a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(xd4Var2.f14159g);
        arrayList.add(i2Var.f6492c);
        bf4 bf4Var = new bf4();
        bf4Var.s("audio/vorbis");
        bf4Var.d0(xd4Var2.f14156d);
        bf4Var.o(xd4Var2.f14155c);
        bf4Var.e0(xd4Var2.f14153a);
        bf4Var.t(xd4Var2.f14154b);
        bf4Var.i(arrayList);
        d2Var.f4046a = bf4Var.y();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.h2
    protected final void h(long j7) {
        super.h(j7);
        this.f6935p = j7 != 0;
        xd4 xd4Var = this.f6936q;
        this.f6934o = xd4Var != null ? xd4Var.f14157e : 0;
    }
}
