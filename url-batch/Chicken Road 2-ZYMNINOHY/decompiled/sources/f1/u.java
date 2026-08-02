package f1;

import S0.C0082a;
import T.C0096n;
import T.C0097o;
import T.G;
import W.J;
import a.AbstractC0124a;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import io.appmetrica.analytics.impl.C0583e9;
import io.flutter.Build;
import v2.I;
import v2.a0;

/* loaded from: classes.dex */
public final class u implements h {

    /* renamed from: e, reason: collision with root package name */
    public String f8756e;

    /* renamed from: f, reason: collision with root package name */
    public y0.F f8757f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8760i;

    /* renamed from: k, reason: collision with root package name */
    public int f8762k;

    /* renamed from: l, reason: collision with root package name */
    public int f8763l;
    public int n;
    public int o;

    /* renamed from: s, reason: collision with root package name */
    public int f8768s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8770u;

    /* renamed from: d, reason: collision with root package name */
    public int f8755d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final W.u f8752a = new W.u(2, new byte[15]);

    /* renamed from: b, reason: collision with root package name */
    public final W.t f8753b = new W.t();

    /* renamed from: c, reason: collision with root package name */
    public final W.u f8754c = new W.u();

    /* renamed from: p, reason: collision with root package name */
    public final C0082a f8765p = new C0082a();

    /* renamed from: q, reason: collision with root package name */
    public int f8766q = -2147483647;

    /* renamed from: r, reason: collision with root package name */
    public int f8767r = -1;

    /* renamed from: t, reason: collision with root package name */
    public long f8769t = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8761j = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8764m = true;

    /* renamed from: g, reason: collision with root package name */
    public double f8758g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    public double f8759h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0483 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x046a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x041d  */
    @Override // f1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(W.u uVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char c4;
        byte[] bArr;
        long j4;
        long j5;
        int i9;
        long j6;
        boolean z;
        int i10;
        this.f8757f.getClass();
        while (uVar.a() > 0) {
            int i11 = this.f8755d;
            int i12 = 8;
            int i13 = 3;
            int i14 = 1;
            if (i11 != 0) {
                W.u uVar2 = this.f8754c;
                C0082a c0082a = this.f8765p;
                if (i11 == 1) {
                    int a3 = uVar.a();
                    W.u uVar3 = this.f8752a;
                    int min = Math.min(a3, uVar3.a());
                    uVar.k(uVar3.f3351a, uVar3.f3352b, min);
                    uVar3.N(min);
                    if (uVar3.a() == 0) {
                        int i15 = uVar3.f3353c;
                        byte[] bArr2 = uVar3.f3351a;
                        W.t tVar = this.f8753b;
                        tVar.o(i15, bArr2);
                        tVar.f();
                        int v = U.i.v(tVar, 3, 8, 8);
                        c0082a.f2393b = v;
                        if (v != -1) {
                            AbstractC0124a.h(Math.max(Math.max(2, 8), 32) <= 63);
                            AbstractC0347t0.c(AbstractC0347t0.c(3L, 255L), 4294967296L);
                            if (tVar.b() >= 2) {
                                long k4 = tVar.k(2);
                                if (k4 == 3) {
                                    if (tVar.b() >= 8) {
                                        long k5 = tVar.k(8);
                                        k4 += k5;
                                        if (k5 == 255) {
                                            if (tVar.b() >= 32) {
                                                k4 = tVar.k(32) + k4;
                                            }
                                        }
                                    }
                                }
                                j6 = k4;
                                c0082a.f2394c = j6;
                                if (j6 != -1) {
                                    if (j6 > 16) {
                                        throw G.c("Contains sub-stream with an invalid packet label " + c0082a.f2394c);
                                    }
                                    if (j6 == 0) {
                                        int i16 = c0082a.f2393b;
                                        if (i16 == 1) {
                                            throw G.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                        }
                                        if (i16 == 2) {
                                            throw G.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                        }
                                        if (i16 == 17) {
                                            throw G.a(null, "AudioTruncation packet with invalid packet label 0");
                                        }
                                    }
                                    int v4 = U.i.v(tVar, 11, 24, 24);
                                    c0082a.f2395d = v4;
                                    if (v4 != -1) {
                                        z = true;
                                        if (z) {
                                            i10 = 0;
                                        } else {
                                            i10 = 0;
                                            this.n = 0;
                                            this.o = c0082a.f2395d + i15 + this.o;
                                        }
                                        if (z) {
                                            int i17 = uVar3.f3353c;
                                            if (i17 < 15) {
                                                uVar3.L(i17 + 1);
                                                this.f8764m = false;
                                            }
                                        } else {
                                            uVar3.M(i10);
                                            this.f8757f.a(uVar3.f3353c, uVar3);
                                            uVar3.J(2);
                                            uVar2.J(c0082a.f2395d);
                                            this.f8764m = true;
                                            this.f8755d = 2;
                                        }
                                    }
                                }
                            }
                            j6 = -1;
                            c0082a.f2394c = j6;
                            if (j6 != -1) {
                            }
                        }
                        z = false;
                        if (z) {
                        }
                        if (z) {
                        }
                    } else {
                        this.f8764m = false;
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException();
                    }
                    int i18 = c0082a.f2393b;
                    if (i18 == 1 || i18 == 17) {
                        int i19 = uVar.f3352b;
                        int min2 = Math.min(uVar.a(), uVar2.a());
                        uVar.k(uVar2.f3351a, uVar2.f3352b, min2);
                        uVar2.N(min2);
                        uVar.M(i19);
                    }
                    int min3 = Math.min(uVar.a(), c0082a.f2395d - this.n);
                    this.f8757f.a(min3, uVar);
                    int i20 = this.n + min3;
                    this.n = i20;
                    if (i20 != c0082a.f2395d) {
                        continue;
                    } else {
                        int i21 = c0082a.f2393b;
                        if (i21 == 1) {
                            byte[] bArr3 = uVar2.f3351a;
                            W.t tVar2 = new W.t(bArr3.length, bArr3);
                            int i22 = tVar2.i(8);
                            int i23 = tVar2.i(5);
                            if (i23 != 31) {
                                switch (i23) {
                                    case 0:
                                        i7 = 96000;
                                        break;
                                    case 1:
                                        i7 = 88200;
                                        break;
                                    case 2:
                                        i7 = 64000;
                                        break;
                                    case 3:
                                        i7 = 48000;
                                        break;
                                    case 4:
                                        i7 = 44100;
                                        break;
                                    case 5:
                                        i7 = 32000;
                                        break;
                                    case 6:
                                        i7 = 24000;
                                        break;
                                    case 7:
                                        i7 = 22050;
                                        break;
                                    case 8:
                                        i7 = 16000;
                                        break;
                                    case 9:
                                        i7 = 12000;
                                        break;
                                    case 10:
                                        i7 = 11025;
                                        break;
                                    case 11:
                                        i7 = 8000;
                                        break;
                                    case 12:
                                        i7 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw G.c("Unsupported sampling rate index " + i23);
                                    case 15:
                                        i7 = 57600;
                                        break;
                                    case 16:
                                        i7 = 51200;
                                        break;
                                    case 17:
                                        i7 = 40000;
                                        break;
                                    case 18:
                                        i7 = 38400;
                                        break;
                                    case C0583e9.f11743C /* 19 */:
                                        i7 = 34150;
                                        break;
                                    case C0583e9.f11744D /* 20 */:
                                        i7 = 28800;
                                        break;
                                    case 21:
                                        i7 = 25600;
                                        break;
                                    case Build.API_LEVELS.API_22 /* 22 */:
                                        i7 = 20000;
                                        break;
                                    case Build.API_LEVELS.API_23 /* 23 */:
                                        i7 = 19200;
                                        break;
                                    case 24:
                                        i7 = 17075;
                                        break;
                                    case 25:
                                        i7 = 14400;
                                        break;
                                    case 26:
                                        i7 = 12800;
                                        break;
                                    case 27:
                                        i7 = 9600;
                                        break;
                                }
                            } else {
                                i7 = tVar2.i(24);
                            }
                            int i24 = tVar2.i(3);
                            if (i24 == 0) {
                                i8 = 768;
                            } else if (i24 == 1) {
                                i8 = 1024;
                            } else if (i24 == 2 || i24 == 3) {
                                i8 = 2048;
                            } else {
                                if (i24 != 4) {
                                    throw G.c("Unsupported coreSbrFrameLengthIndex " + i24);
                                }
                                i8 = 4096;
                            }
                            int i25 = i8;
                            if (i24 == 0 || i24 == 1) {
                                c4 = 0;
                            } else if (i24 == 2) {
                                c4 = 2;
                            } else if (i24 == 3) {
                                c4 = 3;
                            } else {
                                if (i24 != 4) {
                                    throw G.c("Unsupported coreSbrFrameLengthIndex " + i24);
                                }
                                c4 = 1;
                            }
                            tVar2.t(2);
                            U.i.A(tVar2);
                            int i26 = tVar2.i(5);
                            int i27 = 0;
                            int i28 = 0;
                            while (true) {
                                int i29 = i14;
                                int i30 = 16;
                                if (i27 < i26 + 1) {
                                    int i31 = tVar2.i(3);
                                    i28 = U.i.v(tVar2, 5, 8, 16) + 1 + i28;
                                    if ((i31 == 0 || i31 == 2) && tVar2.h()) {
                                        U.i.A(tVar2);
                                    }
                                    i27++;
                                    i14 = i29;
                                } else {
                                    int v5 = U.i.v(tVar2, 4, 8, 16) + 1;
                                    tVar2.s();
                                    int i32 = 0;
                                    while (true) {
                                        double d4 = 2.0d;
                                        if (i32 < v5) {
                                            int i33 = tVar2.i(2);
                                            if (i33 == 0) {
                                                tVar2.t(i13);
                                                if (tVar2.h()) {
                                                    tVar2.t(13);
                                                }
                                                if (c4 > 0) {
                                                    U.i.z(tVar2);
                                                }
                                            } else if (i33 == i29) {
                                                tVar2.t(i13);
                                                boolean h2 = tVar2.h();
                                                if (h2) {
                                                    tVar2.t(13);
                                                }
                                                if (h2) {
                                                    tVar2.s();
                                                }
                                                if (c4 > 0) {
                                                    U.i.z(tVar2);
                                                    i9 = tVar2.i(2);
                                                } else {
                                                    i9 = 0;
                                                }
                                                if (i9 > 0) {
                                                    tVar2.t(6);
                                                    int i34 = tVar2.i(2);
                                                    tVar2.t(4);
                                                    if (tVar2.h()) {
                                                        tVar2.t(5);
                                                    }
                                                    if (i9 == 2 || i9 == i13) {
                                                        tVar2.t(6);
                                                    }
                                                    if (i34 == 2) {
                                                        tVar2.s();
                                                    }
                                                }
                                                int floor = ((int) Math.floor(Math.log(i28 - 1) / Math.log(2.0d))) + 1;
                                                int i35 = tVar2.i(2);
                                                if (i35 > 0 && tVar2.h()) {
                                                    tVar2.t(floor);
                                                }
                                                if (tVar2.h()) {
                                                    tVar2.t(floor);
                                                }
                                                if (c4 == 0 && i35 == 0) {
                                                    tVar2.s();
                                                }
                                            } else if (i33 == i13) {
                                                U.i.v(tVar2, 4, i12, i30);
                                                int v6 = U.i.v(tVar2, 4, i12, i30);
                                                if (tVar2.h()) {
                                                    U.i.v(tVar2, i12, i30, 0);
                                                }
                                                tVar2.s();
                                                if (v6 > 0) {
                                                    tVar2.t(v6 * 8);
                                                }
                                            }
                                            i32++;
                                            i12 = 8;
                                            i13 = 3;
                                            i30 = 16;
                                            i29 = 1;
                                        } else {
                                            if (tVar2.h()) {
                                                int i36 = 8;
                                                int v7 = U.i.v(tVar2, 2, 4, 8) + 1;
                                                int i37 = 0;
                                                bArr = null;
                                                while (i37 < v7) {
                                                    int v8 = U.i.v(tVar2, 4, i36, 16);
                                                    int v9 = U.i.v(tVar2, 4, i36, 16);
                                                    if (v8 == 7) {
                                                        int i38 = tVar2.i(4) + 1;
                                                        tVar2.t(4);
                                                        byte[] bArr4 = new byte[i38];
                                                        for (int i39 = 0; i39 < i38; i39++) {
                                                            bArr4[i39] = (byte) tVar2.i(i36);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        tVar2.t(v9 * i36);
                                                    }
                                                    i37++;
                                                    i36 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (i7) {
                                                case 14700:
                                                case 16000:
                                                    d4 = 3.0d;
                                                    this.f8766q = (int) (i7 * d4);
                                                    this.f8767r = (int) (i25 * d4);
                                                    j4 = this.f8769t;
                                                    j5 = c0082a.f2394c;
                                                    if (j4 != j5) {
                                                        this.f8769t = j5;
                                                        String concat = i22 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i22))) : "mhm1";
                                                        a0 p2 = (bArr == null || bArr.length <= 0) ? null : I.p(J.f3264b, bArr);
                                                        C0096n c0096n = new C0096n();
                                                        c0096n.f2819a = this.f8756e;
                                                        c0096n.f2830l = T.F.n("video/mp2t");
                                                        c0096n.f2831m = T.F.n("audio/mhm1");
                                                        c0096n.f2811F = this.f8766q;
                                                        c0096n.f2828j = concat;
                                                        c0096n.f2832p = p2;
                                                        this.f8757f.d(new C0097o(c0096n));
                                                    }
                                                    i5 = 1;
                                                    this.f8770u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.f8766q = (int) (i7 * d4);
                                                    this.f8767r = (int) (i25 * d4);
                                                    j4 = this.f8769t;
                                                    j5 = c0082a.f2394c;
                                                    if (j4 != j5) {
                                                    }
                                                    i5 = 1;
                                                    this.f8770u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d4 = 1.5d;
                                                    this.f8766q = (int) (i7 * d4);
                                                    this.f8767r = (int) (i25 * d4);
                                                    j4 = this.f8769t;
                                                    j5 = c0082a.f2394c;
                                                    if (j4 != j5) {
                                                    }
                                                    i5 = 1;
                                                    this.f8770u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d4 = 1.0d;
                                                    this.f8766q = (int) (i7 * d4);
                                                    this.f8767r = (int) (i25 * d4);
                                                    j4 = this.f8769t;
                                                    j5 = c0082a.f2394c;
                                                    if (j4 != j5) {
                                                    }
                                                    i5 = 1;
                                                    this.f8770u = true;
                                                    break;
                                                default:
                                                    throw G.c("Unsupported sampling rate " + i7);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i21 == 17) {
                                byte[] bArr5 = uVar2.f3351a;
                                W.t tVar3 = new W.t(bArr5.length, bArr5);
                                if (tVar3.h()) {
                                    tVar3.t(2);
                                    i6 = tVar3.i(13);
                                } else {
                                    i6 = 0;
                                }
                                this.f8768s = i6;
                            } else if (i21 == 2) {
                                if (this.f8770u) {
                                    this.f8761j = false;
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                double d5 = ((this.f8767r - this.f8768s) * 1000000.0d) / this.f8766q;
                                long round = Math.round(this.f8758g);
                                if (this.f8760i) {
                                    this.f8760i = false;
                                    this.f8758g = this.f8759h;
                                } else {
                                    this.f8758g += d5;
                                }
                                this.f8757f.e(round, i4, this.o, 0, null);
                                this.f8770u = false;
                                this.f8768s = 0;
                                this.o = 0;
                            }
                            i5 = 1;
                        }
                        this.f8755d = i5;
                    }
                }
            } else {
                int i40 = this.f8762k;
                if ((i40 & 2) == 0) {
                    uVar.M(uVar.f3353c);
                } else {
                    if ((i40 & 4) == 0) {
                        while (uVar.a() > 0) {
                            int i41 = this.f8763l << 8;
                            this.f8763l = i41;
                            int z4 = i41 | uVar.z();
                            this.f8763l = z4;
                            if ((z4 & 16777215) == 12583333) {
                                uVar.M(uVar.f3352b - 3);
                                this.f8763l = 0;
                            }
                        }
                    }
                    this.f8755d = 1;
                }
            }
        }
    }

    @Override // f1.h
    public final void b() {
        this.f8755d = 0;
        this.f8763l = 0;
        this.f8752a.J(2);
        this.n = 0;
        this.o = 0;
        this.f8766q = -2147483647;
        this.f8767r = -1;
        this.f8768s = 0;
        this.f8769t = -1L;
        this.f8770u = false;
        this.f8760i = false;
        this.f8764m = true;
        this.f8761j = true;
        this.f8758g = -9.223372036854776E18d;
        this.f8759h = -9.223372036854776E18d;
    }

    @Override // f1.h
    public final void d(int i4, long j4) {
        this.f8762k = i4;
        if (!this.f8761j && (this.o != 0 || !this.f8764m)) {
            this.f8760i = true;
        }
        if (j4 != -9223372036854775807L) {
            if (this.f8760i) {
                this.f8759h = j4;
            } else {
                this.f8758g = j4;
            }
        }
    }

    @Override // f1.h
    public final void e(y0.p pVar, E e4) {
        e4.a();
        e4.c();
        this.f8756e = (String) e4.f8531e;
        e4.c();
        this.f8757f = pVar.z(e4.f8529c, 1);
    }

    @Override // f1.h
    public final void c(boolean z) {
    }
}
