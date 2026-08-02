package E0;

import E.AbstractC0005f;
import E1.C0036l;
import T.C0096n;
import T.r;
import W.t;
import W.u;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import y0.AbstractC1569a;
import y0.C1572d;
import y0.F;
import y0.k;
import y0.m;
import y0.n;
import y0.o;
import y0.p;
import y0.v;

/* loaded from: classes.dex */
public final class b implements n {

    /* renamed from: a, reason: collision with root package name */
    public final u f454a = new u(4);

    /* renamed from: b, reason: collision with root package name */
    public final u f455b = new u(9);

    /* renamed from: c, reason: collision with root package name */
    public final u f456c = new u(11);

    /* renamed from: d, reason: collision with root package name */
    public final u f457d = new u();

    /* renamed from: e, reason: collision with root package name */
    public final c f458e;

    /* renamed from: f, reason: collision with root package name */
    public p f459f;

    /* renamed from: g, reason: collision with root package name */
    public int f460g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f461h;

    /* renamed from: i, reason: collision with root package name */
    public long f462i;

    /* renamed from: j, reason: collision with root package name */
    public int f463j;

    /* renamed from: k, reason: collision with root package name */
    public int f464k;

    /* renamed from: l, reason: collision with root package name */
    public int f465l;

    /* renamed from: m, reason: collision with root package name */
    public long f466m;
    public boolean n;
    public a o;

    /* renamed from: p, reason: collision with root package name */
    public f f467p;

    public b() {
        c cVar = new c(new m());
        cVar.f468c = -9223372036854775807L;
        cVar.f469d = new long[0];
        cVar.f470e = new long[0];
        this.f458e = cVar;
        this.f460g = 1;
    }

    @Override // y0.n
    public final void a(long j4, long j5) {
        if (j4 == 0) {
            this.f460g = 1;
            this.f461h = false;
        } else {
            this.f460g = 3;
        }
        this.f463j = 0;
    }

    @Override // y0.n
    public final boolean b(o oVar) {
        u uVar = this.f454a;
        k kVar = (k) oVar;
        kVar.l(uVar.f3351a, 0, 3, false);
        uVar.M(0);
        if (uVar.C() == 4607062) {
            kVar.l(uVar.f3351a, 0, 2, false);
            uVar.M(0);
            if ((uVar.G() & 250) == 0) {
                kVar.l(uVar.f3351a, 0, 4, false);
                uVar.M(0);
                int m4 = uVar.m();
                kVar.f16171f = 0;
                kVar.a(m4, false);
                kVar.l(uVar.f3351a, 0, 4, false);
                uVar.M(0);
                if (uVar.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0009 A[SYNTHETIC] */
    @Override // y0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(o oVar, r rVar) {
        long j4;
        long j5;
        int i4;
        int i5;
        long j6;
        boolean z;
        boolean z4;
        boolean z5;
        this.f459f.getClass();
        while (true) {
            int i6 = this.f460g;
            if (i6 == 1) {
                u uVar = this.f455b;
                if (!oVar.d(uVar.f3351a, 0, 9, true)) {
                    return -1;
                }
                uVar.M(0);
                uVar.N(4);
                int z6 = uVar.z();
                boolean z7 = (z6 & 4) != 0;
                boolean z8 = (z6 & 1) != 0;
                if (z7 && this.o == null) {
                    this.o = new a(this.f459f.z(8, 1));
                }
                if (z8 && this.f467p == null) {
                    this.f467p = new f(this.f459f.z(9, 2));
                }
                this.f459f.r();
                this.f463j = uVar.m() - 5;
                this.f460g = 2;
            } else if (i6 == 2) {
                oVar.v(this.f463j);
                this.f463j = 0;
                this.f460g = 3;
            } else if (i6 == 3) {
                u uVar2 = this.f456c;
                if (!oVar.d(uVar2.f3351a, 0, 11, true)) {
                    return -1;
                }
                uVar2.M(0);
                this.f464k = uVar2.z();
                this.f465l = uVar2.C();
                this.f466m = uVar2.C();
                this.f466m = ((uVar2.z() << 24) | this.f466m) * 1000;
                uVar2.N(3);
                this.f460g = 4;
            } else {
                if (i6 != 4) {
                    throw new IllegalStateException();
                }
                boolean z9 = this.f461h;
                c cVar = this.f458e;
                if (z9) {
                    j4 = this.f462i + this.f466m;
                } else if (cVar.f468c == -9223372036854775807L) {
                    j5 = 0;
                    i4 = this.f464k;
                    if (i4 == 8 || this.o == null) {
                        i5 = 0;
                        if (i4 == 9 || this.f467p == null) {
                            j6 = -9223372036854775807L;
                            if (i4 == 18 || this.n) {
                                oVar.v(this.f465l);
                                z = false;
                                z4 = false;
                            } else {
                                u f4 = f(oVar);
                                cVar.getClass();
                                cVar.getClass();
                                if (f4.z() == 2 && "onMetaData".equals(c.j(f4)) && f4.a() != 0 && f4.z() == 8) {
                                    HashMap i7 = c.i(f4);
                                    Object obj = i7.get("duration");
                                    double d4 = 1000000.0d;
                                    if (obj instanceof Double) {
                                        double doubleValue = ((Double) obj).doubleValue();
                                        if (doubleValue > 0.0d) {
                                            cVar.f468c = (long) (doubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = i7.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            cVar.f469d = new long[size];
                                            cVar.f470e = new long[size];
                                            int i8 = 0;
                                            while (i8 < size) {
                                                Object obj5 = list.get(i8);
                                                Object obj6 = list2.get(i8);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    cVar.f469d = new long[0];
                                                    cVar.f470e = new long[0];
                                                    break;
                                                }
                                                double d5 = d4;
                                                cVar.f469d[i8] = (long) (((Double) obj6).doubleValue() * d5);
                                                cVar.f470e[i8] = ((Double) obj5).longValue();
                                                i8++;
                                                d4 = d5;
                                            }
                                        }
                                    }
                                }
                                long j7 = cVar.f468c;
                                if (j7 != -9223372036854775807L) {
                                    this.f459f.x(new v(j7, cVar.f470e, cVar.f469d));
                                    this.n = true;
                                }
                            }
                        } else {
                            if (!this.n) {
                                this.f459f.x(new A0.b(-9223372036854775807L));
                                this.n = true;
                            }
                            f fVar = this.f467p;
                            u f5 = f(oVar);
                            fVar.getClass();
                            int z10 = f5.z();
                            int i9 = (z10 >> 4) & 15;
                            int i10 = z10 & 15;
                            if (i10 != 7) {
                                throw new d(AbstractC0005f.j(i10, "Video format not supported: "), 0);
                            }
                            fVar.f477h = i9;
                            if (i9 != 5) {
                                u uVar3 = fVar.f472c;
                                F f6 = (F) fVar.f471b;
                                u uVar4 = fVar.f473d;
                                int z11 = f5.z();
                                f5.f(3);
                                byte[] bArr = f5.f3351a;
                                j6 = -9223372036854775807L;
                                int i11 = f5.f3352b;
                                int i12 = i11 + 1;
                                f5.f3352b = i12;
                                int i13 = ((bArr[i11] & 255) << 24) >> 8;
                                f5.f3352b = i11 + 2;
                                int i14 = ((bArr[i12] & 255) << 8) | i13;
                                f5.f3352b = i11 + 3;
                                long j8 = (((bArr[r5] & 255) | i14) * 1000) + j5;
                                boolean z12 = false;
                                if (z11 == 0 && !fVar.f475f) {
                                    byte[] bArr2 = new byte[f5.a()];
                                    u uVar5 = new u(bArr2);
                                    f5.k(bArr2, 0, f5.a());
                                    C1572d a3 = C1572d.a(uVar5);
                                    fVar.f474e = a3.f16131b;
                                    C0096n c0096n = new C0096n();
                                    c0096n.f2830l = T.F.n("video/x-flv");
                                    c0096n.f2831m = T.F.n("video/avc");
                                    c0096n.f2828j = a3.f16141l;
                                    c0096n.f2836t = a3.f16132c;
                                    c0096n.f2837u = a3.f16133d;
                                    c0096n.z = a3.f16140k;
                                    c0096n.f2832p = a3.f16130a;
                                    AbstractC0005f.w(c0096n, f6);
                                    fVar.f475f = true;
                                } else if (z11 == 1 && fVar.f475f) {
                                    int i15 = fVar.f477h == 1 ? 1 : 0;
                                    if (fVar.f476g || i15 != 0) {
                                        byte[] bArr3 = uVar4.f3351a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i16 = 4 - fVar.f474e;
                                        int i17 = 0;
                                        while (f5.a() > 0) {
                                            f5.k(uVar4.f3351a, i16, fVar.f474e);
                                            uVar4.M(0);
                                            int D3 = uVar4.D();
                                            uVar3.M(0);
                                            f6.a(4, uVar3);
                                            f6.a(D3, f5);
                                            i17 = i17 + 4 + D3;
                                        }
                                        ((F) fVar.f471b).e(j8, i15, i17, 0, null);
                                        fVar.f476g = true;
                                        z12 = true;
                                    }
                                }
                                if (z12) {
                                    z = true;
                                    z4 = true;
                                }
                            } else {
                                j6 = -9223372036854775807L;
                            }
                        }
                        z = false;
                        z4 = true;
                    } else {
                        if (!this.n) {
                            this.f459f.x(new A0.b(-9223372036854775807L));
                            this.n = true;
                        }
                        a aVar = this.o;
                        u f7 = f(oVar);
                        F f8 = (F) aVar.f471b;
                        if (aVar.f451c) {
                            i5 = 0;
                            f7.N(1);
                        } else {
                            int z13 = f7.z();
                            int i18 = (z13 >> 4) & 15;
                            aVar.f453e = i18;
                            i5 = 0;
                            if (i18 == 2) {
                                int i19 = a.f450f[(z13 >> 2) & 3];
                                C0096n c0096n2 = new C0096n();
                                c0096n2.f2830l = T.F.n("video/x-flv");
                                c0096n2.f2831m = T.F.n("audio/mpeg");
                                c0096n2.f2810E = 1;
                                c0096n2.f2811F = i19;
                                AbstractC0005f.w(c0096n2, f8);
                                aVar.f452d = true;
                            } else if (i18 == 7 || i18 == 8) {
                                String str = i18 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                C0096n c0096n3 = new C0096n();
                                c0096n3.f2830l = T.F.n("video/x-flv");
                                c0096n3.f2831m = T.F.n(str);
                                c0096n3.f2810E = 1;
                                c0096n3.f2811F = 8000;
                                AbstractC0005f.w(c0096n3, f8);
                                aVar.f452d = true;
                            } else if (i18 != 10) {
                                throw new d("Audio format not supported: " + aVar.f453e, 0);
                            }
                            aVar.f451c = true;
                        }
                        F f9 = (F) aVar.f471b;
                        if (aVar.f453e == 2) {
                            int a4 = f7.a();
                            f9.a(a4, f7);
                            ((F) aVar.f471b).e(j5, 1, a4, 0, null);
                        } else {
                            int z14 = f7.z();
                            z5 = false;
                            if (z14 == 0 && !aVar.f452d) {
                                int a5 = f7.a();
                                byte[] bArr4 = new byte[a5];
                                f7.k(bArr4, 0, a5);
                                C0036l s4 = AbstractC1569a.s(new t(a5, bArr4), false);
                                C0096n c0096n4 = new C0096n();
                                c0096n4.f2830l = T.F.n("video/x-flv");
                                c0096n4.f2831m = T.F.n("audio/mp4a-latm");
                                c0096n4.f2828j = s4.f632c;
                                c0096n4.f2810E = s4.f631b;
                                c0096n4.f2811F = s4.f630a;
                                c0096n4.f2832p = Collections.singletonList(bArr4);
                                AbstractC0005f.w(c0096n4, f9);
                                aVar.f452d = true;
                            } else if (aVar.f453e != 10 || z14 == 1) {
                                int a6 = f7.a();
                                f9.a(a6, f7);
                                ((F) aVar.f471b).e(j5, 1, a6, 0, null);
                            }
                            z4 = true;
                            j6 = -9223372036854775807L;
                            z = z5;
                        }
                        z5 = true;
                        z4 = true;
                        j6 = -9223372036854775807L;
                        z = z5;
                    }
                    if (!this.f461h && z) {
                        this.f461h = true;
                        this.f462i = cVar.f468c != j6 ? -this.f466m : 0L;
                    }
                    this.f463j = 4;
                    this.f460g = 2;
                    if (!z4) {
                        return i5;
                    }
                } else {
                    j4 = this.f466m;
                }
                j5 = j4;
                i4 = this.f464k;
                if (i4 == 8) {
                }
                i5 = 0;
                if (i4 == 9) {
                }
                j6 = -9223372036854775807L;
                if (i4 == 18) {
                }
                oVar.v(this.f465l);
                z = false;
                z4 = false;
                if (!this.f461h) {
                    this.f461h = true;
                    this.f462i = cVar.f468c != j6 ? -this.f466m : 0L;
                }
                this.f463j = 4;
                this.f460g = 2;
                if (!z4) {
                }
            }
        }
    }

    @Override // y0.n
    public final void e(p pVar) {
        this.f459f = pVar;
    }

    public final u f(o oVar) {
        int i4 = this.f465l;
        u uVar = this.f457d;
        byte[] bArr = uVar.f3351a;
        if (i4 > bArr.length) {
            uVar.K(0, new byte[Math.max(bArr.length * 2, i4)]);
        } else {
            uVar.M(0);
        }
        uVar.L(this.f465l);
        oVar.readFully(uVar.f3351a, 0, this.f465l);
        return uVar;
    }

    @Override // y0.n
    public final void release() {
    }
}
