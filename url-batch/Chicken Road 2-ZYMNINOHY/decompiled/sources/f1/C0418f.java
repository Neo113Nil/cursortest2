package f1;

import E1.C0036l;
import T.C0096n;
import T.C0097o;
import T.G;
import W.J;
import a.AbstractC0124a;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.KotlinVersion;
import y0.AbstractC1569a;

/* renamed from: f1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0418f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final W.u f8581a;

    /* renamed from: c, reason: collision with root package name */
    public final String f8583c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8584d;

    /* renamed from: f, reason: collision with root package name */
    public String f8586f;

    /* renamed from: g, reason: collision with root package name */
    public y0.F f8587g;

    /* renamed from: i, reason: collision with root package name */
    public int f8589i;

    /* renamed from: j, reason: collision with root package name */
    public int f8590j;

    /* renamed from: k, reason: collision with root package name */
    public long f8591k;

    /* renamed from: l, reason: collision with root package name */
    public C0097o f8592l;

    /* renamed from: m, reason: collision with root package name */
    public int f8593m;
    public int n;

    /* renamed from: h, reason: collision with root package name */
    public int f8588h = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f8595q = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f8582b = new AtomicInteger();
    public int o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f8594p = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String f8585e = "video/mp2t";

    public C0418f(String str, int i4, int i5) {
        this.f8581a = new W.u(new byte[i5]);
        this.f8583c = str;
        this.f8584d = i4;
    }

    @Override // f1.h
    public final void a(W.u uVar) {
        int i4;
        byte b4;
        int i5;
        byte b5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long j4;
        int i12;
        long j5;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f8587g.getClass();
        while (uVar.a() > 0) {
            int i17 = this.f8588h;
            W.u uVar2 = this.f8581a;
            switch (i17) {
                case 0:
                    while (true) {
                        if (uVar.a() > 0) {
                            int i18 = this.f8590j << 8;
                            this.f8590j = i18;
                            int z = i18 | uVar.z();
                            this.f8590j = z;
                            int l4 = AbstractC1569a.l(z);
                            this.n = l4;
                            if (l4 != 0) {
                                byte[] bArr = uVar2.f3351a;
                                int i19 = this.f8590j;
                                bArr[0] = (byte) ((i19 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                                bArr[1] = (byte) ((i19 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                                bArr[2] = (byte) ((i19 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                                bArr[3] = (byte) (i19 & KotlinVersion.MAX_COMPONENT_VALUE);
                                this.f8589i = 4;
                                this.f8590j = 0;
                                if (l4 != 3 && l4 != 4) {
                                    if (l4 == 1) {
                                        this.f8588h = 1;
                                        break;
                                    } else {
                                        this.f8588h = 2;
                                        break;
                                    }
                                } else {
                                    this.f8588h = 4;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    if (!f(uVar, uVar2.f3351a, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = uVar2.f3351a;
                        if (this.f8592l == null) {
                            String str = this.f8586f;
                            W.t n = AbstractC1569a.n(bArr2);
                            n.t(60);
                            int i20 = AbstractC1569a.f16104j[n.i(6)];
                            int i21 = AbstractC1569a.f16105k[n.i(4)];
                            int i22 = n.i(5);
                            int i23 = i22 >= 29 ? -1 : (AbstractC1569a.f16106l[i22] * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) / 2;
                            n.t(10);
                            int i24 = i20 + (n.i(2) > 0 ? 1 : 0);
                            C0096n c0096n = new C0096n();
                            c0096n.f2819a = str;
                            c0096n.f2830l = T.F.n(this.f8585e);
                            c0096n.f2831m = T.F.n("audio/vnd.dts");
                            c0096n.f2826h = i23;
                            c0096n.f2810E = i24;
                            c0096n.f2811F = i21;
                            c0096n.f2833q = null;
                            c0096n.f2822d = this.f8583c;
                            c0096n.f2824f = this.f8584d;
                            C0097o c0097o = new C0097o(c0096n);
                            this.f8592l = c0097o;
                            this.f8587g.d(c0097o);
                        }
                        this.f8593m = AbstractC1569a.j(bArr2);
                        byte b6 = bArr2[0];
                        if (b6 != -2) {
                            if (b6 == -1) {
                                i4 = (bArr2[4] & 7) << 4;
                                b5 = bArr2[7];
                            } else if (b6 != 31) {
                                i4 = (bArr2[4] & 1) << 6;
                                b4 = bArr2[5];
                            } else {
                                i4 = (bArr2[5] & 7) << 4;
                                b5 = bArr2[6];
                            }
                            i5 = b5 & 60;
                            this.f8591k = O3.d.g(J.S(this.f8592l.f2847G, (((i5 >> 2) | i4) + 1) * 32));
                            uVar2.M(0);
                            this.f8587g.a(18, uVar2);
                            this.f8588h = 6;
                            break;
                        } else {
                            i4 = (bArr2[5] & 1) << 6;
                            b4 = bArr2[4];
                        }
                        i5 = b4 & 252;
                        this.f8591k = O3.d.g(J.S(this.f8592l.f2847G, (((i5 >> 2) | i4) + 1) * 32));
                        uVar2.M(0);
                        this.f8587g.a(18, uVar2);
                        this.f8588h = 6;
                    }
                case 2:
                    if (f(uVar, uVar2.f3351a, 7)) {
                        W.t n4 = AbstractC1569a.n(uVar2.f3351a);
                        n4.t(42);
                        this.o = n4.i(n4.h() ? 12 : 8) + 1;
                        this.f8588h = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    int i25 = 8;
                    if (f(uVar, uVar2.f3351a, this.o)) {
                        W.t n5 = AbstractC1569a.n(uVar2.f3351a);
                        n5.t(40);
                        int i26 = n5.i(2);
                        if (n5.h()) {
                            i6 = 20;
                            i7 = 12;
                        } else {
                            i6 = 16;
                            i7 = 8;
                        }
                        n5.t(i7);
                        int i27 = n5.i(i6) + 1;
                        boolean h2 = n5.h();
                        if (h2) {
                            i8 = n5.i(2);
                            i9 = (n5.i(3) + 1) * 512;
                            if (n5.h()) {
                                n5.t(36);
                            }
                            int i28 = n5.i(3) + 1;
                            int i29 = n5.i(3) + 1;
                            if (i28 != 1 || i29 != 1) {
                                throw G.c("Multiple audio presentations or assets not supported");
                            }
                            int i30 = i26 + 1;
                            int i31 = n5.i(i30);
                            int i32 = 0;
                            while (i32 < i30) {
                                if (((i31 >> i32) & 1) == 1) {
                                    n5.t(i25);
                                }
                                i32++;
                                i25 = 8;
                            }
                            if (n5.h()) {
                                n5.t(2);
                                int i33 = (n5.i(2) + 1) << 2;
                                int i34 = n5.i(2) + 1;
                                for (int i35 = 0; i35 < i34; i35++) {
                                    n5.t(i33);
                                }
                            }
                        } else {
                            i8 = -1;
                            i9 = 0;
                        }
                        n5.t(i6);
                        n5.t(12);
                        if (h2) {
                            if (n5.h()) {
                                n5.t(4);
                            }
                            if (n5.h()) {
                                n5.t(24);
                            }
                            if (n5.h()) {
                                n5.u(n5.i(10) + 1);
                            }
                            n5.t(5);
                            i11 = AbstractC1569a.f16107m[n5.i(4)];
                            i10 = n5.i(8) + 1;
                        } else {
                            i10 = -1;
                            i11 = -2147483647;
                        }
                        if (h2) {
                            if (i8 == 0) {
                                i12 = 32000;
                            } else if (i8 == 1) {
                                i12 = 44100;
                            } else {
                                if (i8 != 2) {
                                    throw G.a(null, "Unsupported reference clock code in DTS HD header: " + i8);
                                }
                                i12 = 48000;
                            }
                            String str2 = J.f3263a;
                            j4 = J.U(i9, 1000000L, i12, RoundingMode.DOWN);
                        } else {
                            j4 = -9223372036854775807L;
                        }
                        g(new C0036l("audio/vnd.dts.hd;profile=lbr", i10, i11, i27, j4));
                        this.f8593m = i27;
                        this.f8591k = j4 == -9223372036854775807L ? 0L : j4;
                        uVar2.M(0);
                        this.f8587g.a(this.o, uVar2);
                        this.f8588h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (f(uVar, uVar2.f3351a, 6)) {
                        W.t n6 = AbstractC1569a.n(uVar2.f3351a);
                        n6.t(32);
                        int v = AbstractC1569a.v(n6, AbstractC1569a.f16110r) + 1;
                        this.f8594p = v;
                        int i36 = this.f8589i;
                        if (i36 > v) {
                            int i37 = i36 - v;
                            this.f8589i = i36 - i37;
                            uVar.M(uVar.f3352b - i37);
                        }
                        this.f8588h = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (f(uVar, uVar2.f3351a, this.f8594p)) {
                        byte[] bArr3 = uVar2.f3351a;
                        W.t n7 = AbstractC1569a.n(bArr3);
                        int i38 = n7.i(32) == 1078008818 ? 1 : 0;
                        int v4 = AbstractC1569a.v(n7, AbstractC1569a.n);
                        int i39 = v4 + 1;
                        if (i38 == 0) {
                            j5 = -9223372036854775807L;
                            i13 = -2147483647;
                        } else {
                            if (!n7.h()) {
                                throw G.c("Only supports full channel mask-based audio presentation");
                            }
                            int i40 = v4 - 1;
                            int i41 = ((bArr3[i40] << 8) & 65535) | (bArr3[v4] & 255);
                            String str3 = J.f3263a;
                            int i42 = 65535;
                            for (int i43 = 0; i43 < i40; i43++) {
                                byte b7 = bArr3[i43];
                                int i44 = (((b7 & 255) >> 4) ^ ((i42 >> 12) & KotlinVersion.MAX_COMPONENT_VALUE)) & KotlinVersion.MAX_COMPONENT_VALUE;
                                int[] iArr = J.f3273k;
                                int i45 = (iArr[i44] ^ ((i42 << 4) & 65535)) & 65535;
                                i42 = (iArr[((b7 & 15) ^ ((i45 >> 12) & KotlinVersion.MAX_COMPONENT_VALUE)) & KotlinVersion.MAX_COMPONENT_VALUE] ^ ((i45 << 4) & 65535)) & 65535;
                            }
                            if (i41 != i42) {
                                throw G.a(null, "CRC check failed");
                            }
                            int i46 = n7.i(2);
                            if (i46 != 0) {
                                if (i46 == 1) {
                                    i15 = 480;
                                } else {
                                    if (i46 != 2) {
                                        throw G.a(null, "Unsupported base duration index in DTS UHD header: " + i46);
                                    }
                                    i15 = 384;
                                }
                                i14 = 3;
                            } else {
                                i14 = 3;
                                i15 = 512;
                            }
                            int i47 = (n7.i(i14) + 1) * i15;
                            int i48 = n7.i(2);
                            if (i48 == 0) {
                                i16 = 32000;
                            } else if (i48 == 1) {
                                i16 = 44100;
                            } else {
                                if (i48 != 2) {
                                    throw G.a(null, "Unsupported clock rate index in DTS UHD header: " + i48);
                                }
                                i16 = 48000;
                            }
                            if (n7.h()) {
                                n7.t(36);
                            }
                            int i49 = i16 * (1 << n7.i(2));
                            j5 = J.U(i47, 1000000L, i16, RoundingMode.DOWN);
                            i13 = i49;
                        }
                        int i50 = 0;
                        for (int i51 = 0; i51 < i38; i51++) {
                            i50 += AbstractC1569a.v(n7, AbstractC1569a.o);
                        }
                        AtomicInteger atomicInteger = this.f8582b;
                        if (i38 != 0) {
                            atomicInteger.set(AbstractC1569a.v(n7, AbstractC1569a.f16108p));
                        }
                        int v5 = i50 + (atomicInteger.get() != 0 ? AbstractC1569a.v(n7, AbstractC1569a.f16109q) : 0) + i39;
                        C0036l c0036l = new C0036l("audio/vnd.dts.uhd;profile=p2", 2, i13, v5, j5);
                        if (this.n == 3) {
                            g(c0036l);
                        }
                        this.f8593m = v5;
                        this.f8591k = j5 == -9223372036854775807L ? 0L : j5;
                        uVar2.M(0);
                        this.f8587g.a(this.f8594p, uVar2);
                        this.f8588h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(uVar.a(), this.f8593m - this.f8589i);
                    this.f8587g.a(min, uVar);
                    int i52 = this.f8589i + min;
                    this.f8589i = i52;
                    if (i52 != this.f8593m) {
                        break;
                    } else {
                        AbstractC0124a.t(this.f8595q != -9223372036854775807L);
                        this.f8587g.e(this.f8595q, this.n == 4 ? 0 : 1, this.f8593m, 0, null);
                        this.f8595q += this.f8591k;
                        this.f8588h = 0;
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // f1.h
    public final void b() {
        this.f8588h = 0;
        this.f8589i = 0;
        this.f8590j = 0;
        this.f8595q = -9223372036854775807L;
        this.f8582b.set(0);
    }

    @Override // f1.h
    public final void d(int i4, long j4) {
        this.f8595q = j4;
    }

    @Override // f1.h
    public final void e(y0.p pVar, E e4) {
        e4.a();
        e4.c();
        this.f8586f = (String) e4.f8531e;
        e4.c();
        this.f8587g = pVar.z(e4.f8529c, 1);
    }

    public final boolean f(W.u uVar, byte[] bArr, int i4) {
        int min = Math.min(uVar.a(), i4 - this.f8589i);
        uVar.k(bArr, this.f8589i, min);
        int i5 = this.f8589i + min;
        this.f8589i = i5;
        return i5 == i4;
    }

    public final void g(C0036l c0036l) {
        int i4 = c0036l.f630a;
        String str = c0036l.f632c;
        int i5 = c0036l.f631b;
        if (i4 == -2147483647 || i5 == -1) {
            return;
        }
        C0097o c0097o = this.f8592l;
        if (c0097o != null && i5 == c0097o.f2846F && i4 == c0097o.f2847G && str.equals(c0097o.n)) {
            return;
        }
        C0097o c0097o2 = this.f8592l;
        C0096n c0096n = c0097o2 == null ? new C0096n() : c0097o2.a();
        c0096n.f2819a = this.f8586f;
        c0096n.f2830l = T.F.n(this.f8585e);
        c0096n.f2831m = T.F.n(str);
        c0096n.f2810E = i5;
        c0096n.f2811F = i4;
        c0096n.f2822d = this.f8583c;
        c0096n.f2824f = this.f8584d;
        C0097o c0097o3 = new C0097o(c0096n);
        this.f8592l = c0097o3;
        this.f8587g.d(c0097o3);
    }

    @Override // f1.h
    public final void c(boolean z) {
    }
}
