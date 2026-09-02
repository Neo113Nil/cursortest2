package D0;

import E.AbstractC0005f;
import M0.h;
import T.C0096n;
import T.C0097o;
import T.E;
import T.G;
import W.J;
import W.t;
import W.u;
import d2.C0389g;
import e1.C0397a;
import java.util.Arrays;
import v2.I;
import y0.AbstractC1569a;
import y0.F;
import y0.k;
import y0.n;
import y0.o;
import y0.p;
import y0.r;
import y0.y;

/* loaded from: classes.dex */
public final class e implements n {

    /* renamed from: e, reason: collision with root package name */
    public p f344e;

    /* renamed from: f, reason: collision with root package name */
    public F f345f;

    /* renamed from: h, reason: collision with root package name */
    public E f347h;

    /* renamed from: i, reason: collision with root package name */
    public r f348i;

    /* renamed from: j, reason: collision with root package name */
    public int f349j;

    /* renamed from: k, reason: collision with root package name */
    public int f350k;

    /* renamed from: l, reason: collision with root package name */
    public c f351l;

    /* renamed from: m, reason: collision with root package name */
    public int f352m;
    public long n;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f340a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final u f341b = new u(0, new byte[32768]);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f342c = false;

    /* renamed from: d, reason: collision with root package name */
    public final T.r f343d = new T.r();

    /* renamed from: g, reason: collision with root package name */
    public int f346g = 0;

    @Override // y0.n
    public final void a(long j4, long j5) {
        if (j4 == 0) {
            this.f346g = 0;
        } else {
            c cVar = this.f351l;
            if (cVar != null) {
                cVar.d(j5);
            }
        }
        this.n = j5 != 0 ? -1L : 0L;
        this.f352m = 0;
        this.f341b.J(0);
    }

    @Override // y0.n
    public final boolean b(o oVar) {
        E d4 = new C0397a(1).d(oVar, h.f1719l, 0);
        if (d4 != null) {
            int length = d4.f2655a.length;
        }
        u uVar = new u(4);
        ((k) oVar).l(uVar.f3351a, 0, 4, false);
        return uVar.B() == 1716281667;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    @Override // y0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(o oVar, T.r rVar) {
        r rVar2;
        int i4;
        y bVar;
        long j4;
        long j5;
        boolean z;
        long H4;
        long j6;
        int i5 = this.f346g;
        E e4 = null;
        int i6 = 0;
        if (i5 == 0) {
            oVar.u();
            long m4 = oVar.m();
            E d4 = new C0397a(1).d(oVar, !this.f342c ? null : h.f1719l, 0);
            if (d4 != null && d4.f2655a.length != 0) {
                e4 = d4;
            }
            oVar.v((int) (oVar.m() - m4));
            this.f347h = e4;
            this.f346g = 1;
            return 0;
        }
        byte[] bArr = this.f340a;
        if (i5 == 1) {
            oVar.E(bArr, 0, bArr.length);
            oVar.u();
            this.f346g = 2;
            return 0;
        }
        int i7 = 4;
        int i8 = 3;
        if (i5 == 2) {
            u uVar = new u(4);
            oVar.readFully(uVar.f3351a, 0, 4);
            if (uVar.B() != 1716281667) {
                throw G.a(null, "Failed to read FLAC stream marker.");
            }
            this.f346g = 3;
            return 0;
        }
        int i9 = 6;
        if (i5 == 3) {
            int i10 = 0;
            r rVar3 = this.f348i;
            boolean z4 = false;
            while (!z4) {
                oVar.u();
                byte[] bArr2 = new byte[i7];
                t tVar = new t(i7, bArr2);
                int i11 = i10;
                oVar.E(bArr2, i11, i7);
                boolean h2 = tVar.h();
                int i12 = tVar.i(r10);
                int i13 = tVar.i(24) + i7;
                if (i12 == 0) {
                    byte[] bArr3 = new byte[38];
                    oVar.readFully(bArr3, i11, 38);
                    rVar3 = new r(i7, bArr3);
                } else {
                    if (rVar3 == null) {
                        throw new IllegalArgumentException();
                    }
                    E e5 = rVar3.f16194l;
                    if (i12 == i8) {
                        u uVar2 = new u(i13);
                        oVar.readFully(uVar2.f3351a, i11, i13);
                        rVar3 = new r(rVar3.f16183a, rVar3.f16184b, rVar3.f16185c, rVar3.f16186d, rVar3.f16187e, rVar3.f16189g, rVar3.f16190h, rVar3.f16192j, AbstractC1569a.y(uVar2), rVar3.f16194l);
                    } else {
                        if (i12 == i7) {
                            u uVar3 = new u(i13);
                            oVar.readFully(uVar3.f3351a, 0, i13);
                            uVar3.N(i7);
                            E w4 = AbstractC1569a.w(Arrays.asList((String[]) AbstractC1569a.z(uVar3, false, false).f8416a));
                            if (e5 != null) {
                                w4 = e5.b(w4);
                            }
                            rVar2 = new r(rVar3.f16183a, rVar3.f16184b, rVar3.f16185c, rVar3.f16186d, rVar3.f16187e, rVar3.f16189g, rVar3.f16190h, rVar3.f16192j, rVar3.f16193k, w4);
                        } else if (i12 == i9) {
                            u uVar4 = new u(i13);
                            oVar.readFully(uVar4.f3351a, 0, i13);
                            uVar4.N(4);
                            E e6 = new E(I.o(K0.a.d(uVar4)));
                            if (e5 != null) {
                                e6 = e5.b(e6);
                            }
                            rVar2 = new r(rVar3.f16183a, rVar3.f16184b, rVar3.f16185c, rVar3.f16186d, rVar3.f16187e, rVar3.f16189g, rVar3.f16190h, rVar3.f16192j, rVar3.f16193k, e6);
                        } else {
                            oVar.v(i13);
                        }
                        rVar3 = rVar2;
                    }
                }
                String str = J.f3263a;
                this.f348i = rVar3;
                z4 = h2;
                i7 = 4;
                i8 = 3;
                r10 = 7;
                i9 = 6;
                i10 = 0;
            }
            this.f348i.getClass();
            this.f349j = Math.max(this.f348i.f16185c, 6);
            C0097o c4 = this.f348i.c(bArr, this.f347h);
            F f4 = this.f345f;
            C0096n a3 = c4.a();
            a3.f2830l = T.F.n("audio/flac");
            AbstractC0005f.w(a3, f4);
            this.f345f.c(this.f348i.b());
            this.f346g = 4;
            return 0;
        }
        long j7 = 0;
        if (i5 == 4) {
            oVar.u();
            u uVar5 = new u(2);
            oVar.E(uVar5.f3351a, 0, 2);
            int G4 = uVar5.G();
            if ((G4 >> 2) != 16382) {
                oVar.u();
                throw G.a(null, "First frame does not start with sync code.");
            }
            oVar.u();
            this.f350k = G4;
            p pVar = this.f344e;
            String str2 = J.f3263a;
            long position = oVar.getPosition();
            long length = oVar.getLength();
            this.f348i.getClass();
            r rVar4 = this.f348i;
            C0389g c0389g = rVar4.f16193k;
            if (c0389g != null && ((long[]) c0389g.f8264b).length > 0) {
                bVar = new A0.b(rVar4, position, 1);
                i4 = 0;
            } else if (length == -1 || rVar4.f16192j <= 0) {
                i4 = 0;
                bVar = new A0.b(rVar4.b());
            } else {
                int i14 = this.f350k;
                int i15 = rVar4.f16185c;
                a aVar = new a(i6, rVar4);
                b bVar2 = new b(rVar4, i14);
                long b4 = rVar4.b();
                long j8 = rVar4.f16192j;
                int i16 = rVar4.f16186d;
                if (i16 > 0) {
                    i4 = 0;
                    j4 = ((i16 + i15) / 2) + 1;
                } else {
                    i4 = 0;
                    int i17 = rVar4.f16183a;
                    j4 = 64 + (((((i17 != rVar4.f16184b || i17 <= 0) ? 4096L : i17) * rVar4.f16189g) * rVar4.f16190h) / 8);
                }
                c cVar = new c(aVar, bVar2, b4, j8, position, length, j4, Math.max(6, i15));
                this.f351l = cVar;
                bVar = cVar.f335a;
            }
            pVar.x(bVar);
            this.f346g = 5;
            return i4;
        }
        if (i5 != 5) {
            throw new IllegalStateException();
        }
        this.f345f.getClass();
        this.f348i.getClass();
        c cVar2 = this.f351l;
        if (cVar2 != null && cVar2.f337c != null) {
            return cVar2.b(oVar, rVar);
        }
        if (this.n == -1) {
            r rVar5 = this.f348i;
            oVar.u();
            oVar.o(1);
            byte[] bArr4 = new byte[1];
            oVar.E(bArr4, 0, 1);
            boolean z5 = (bArr4[0] & 1) == 1;
            oVar.o(2);
            r10 = z5 ? 7 : 6;
            u uVar6 = new u(r10);
            byte[] bArr5 = uVar6.f3351a;
            int i18 = 0;
            while (i18 < r10) {
                int s4 = oVar.s(bArr5, i18, r10 - i18);
                if (s4 == -1) {
                    break;
                }
                i18 += s4;
            }
            uVar6.L(i18);
            oVar.u();
            try {
                H4 = uVar6.H();
                if (!z5) {
                    H4 *= rVar5.f16184b;
                }
                j6 = rVar5.f16192j;
            } catch (NumberFormatException unused) {
            }
            if (j6 == 0 || H4 <= j6) {
                j7 = H4;
                if (r4) {
                    throw G.a(null, null);
                }
                this.n = j7;
            }
            r4 = false;
            if (r4) {
            }
        } else {
            u uVar7 = this.f341b;
            int i19 = uVar7.f3353c;
            if (i19 < 32768) {
                int read = oVar.read(uVar7.f3351a, i19, 32768 - i19);
                r4 = read == -1;
                if (!r4) {
                    uVar7.L(i19 + read);
                } else if (uVar7.a() == 0) {
                    long j9 = this.n * 1000000;
                    r rVar6 = this.f348i;
                    String str3 = J.f3263a;
                    this.f345f.e(j9 / rVar6.f16187e, 1, this.f352m, 0, null);
                    return -1;
                }
            } else {
                r4 = false;
            }
            int i20 = uVar7.f3352b;
            int i21 = this.f352m;
            int i22 = this.f349j;
            if (i21 < i22) {
                uVar7.N(Math.min(i22 - i21, uVar7.a()));
            }
            this.f348i.getClass();
            int i23 = uVar7.f3352b;
            while (true) {
                int i24 = uVar7.f3353c - 16;
                T.r rVar7 = this.f343d;
                if (i23 <= i24) {
                    uVar7.M(i23);
                    if (AbstractC1569a.d(uVar7, this.f348i, this.f350k, rVar7)) {
                        uVar7.M(i23);
                        j5 = rVar7.f2881a;
                        break;
                    }
                    i23++;
                } else {
                    if (r4) {
                        while (true) {
                            int i25 = uVar7.f3353c;
                            if (i23 > i25 - this.f349j) {
                                uVar7.M(i25);
                                break;
                            }
                            uVar7.M(i23);
                            try {
                                z = AbstractC1569a.d(uVar7, this.f348i, this.f350k, rVar7);
                            } catch (IndexOutOfBoundsException unused2) {
                                z = false;
                            }
                            if (uVar7.f3352b > uVar7.f3353c) {
                                z = false;
                            }
                            if (z) {
                                uVar7.M(i23);
                                j5 = rVar7.f2881a;
                                break;
                            }
                            i23++;
                        }
                    } else {
                        uVar7.M(i23);
                    }
                    j5 = -1;
                }
            }
            int i26 = uVar7.f3352b - i20;
            uVar7.M(i20);
            this.f345f.a(i26, uVar7);
            int i27 = this.f352m + i26;
            this.f352m = i27;
            if (j5 != -1) {
                long j10 = this.n * 1000000;
                r rVar8 = this.f348i;
                String str4 = J.f3263a;
                this.f345f.e(j10 / rVar8.f16187e, 1, i27, 0, null);
                this.f352m = 0;
                this.n = j5;
            }
            int length2 = uVar7.f3351a.length - uVar7.f3353c;
            if (uVar7.a() < 16 && length2 < 16) {
                int a4 = uVar7.a();
                byte[] bArr6 = uVar7.f3351a;
                System.arraycopy(bArr6, uVar7.f3352b, bArr6, 0, a4);
                uVar7.M(0);
                uVar7.L(a4);
            }
        }
        return 0;
    }

    @Override // y0.n
    public final void e(p pVar) {
        this.f344e = pVar;
        this.f345f = pVar.z(0, 1);
        pVar.r();
    }

    @Override // y0.n
    public final void release() {
    }
}
