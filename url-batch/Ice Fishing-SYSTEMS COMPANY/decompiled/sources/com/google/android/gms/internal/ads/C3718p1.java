package com.google.android.gms.internal.ads;

import O.C0357t;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3718p1 implements O0 {

    /* renamed from: d, reason: collision with root package name */
    public final T2 f33252d;

    /* renamed from: e, reason: collision with root package name */
    public int f33253e;

    /* renamed from: g, reason: collision with root package name */
    public C3772q1 f33255g;

    /* renamed from: j, reason: collision with root package name */
    public long f33257j;

    /* renamed from: k, reason: collision with root package name */
    public C3879s1 f33258k;

    /* renamed from: o, reason: collision with root package name */
    public int f33262o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f33263p;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33251c = true;

    /* renamed from: a, reason: collision with root package name */
    public final Lr f33249a = new Lr(12);

    /* renamed from: b, reason: collision with root package name */
    public final C0357t f33250b = new C0357t();

    /* renamed from: f, reason: collision with root package name */
    public Q0 f33254f = new T2(15);
    public C3879s1[] i = new C3879s1[0];

    /* renamed from: m, reason: collision with root package name */
    public long f33260m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f33261n = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f33259l = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f33256h = com.anythink.basead.exoplayer.b.f6539b;

    public C3718p1(T2 t22) {
        this.f33252d = t22;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        this.f33253e = 0;
        if (this.f33251c) {
            q02 = new com.bumptech.glide.manager.n(q02, (InterfaceC3720p3) this.f33252d);
        }
        this.f33254f = q02;
        this.f33257j = -1L;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final boolean b(P0 p02) {
        Lr lr = this.f33249a;
        ((J0) p02).I(lr.f26233a, 0, 12, false);
        lr.E(0);
        if (lr.c() == 1179011410) {
            lr.G(4);
            if (lr.c() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void c(long j9, long j10) {
        this.f33257j = -1L;
        this.f33258k = null;
        for (C3879s1 c3879s1 : this.i) {
            if (c3879s1.f34167k == 0) {
                c3879s1.i = 0;
            } else {
                c3879s1.i = c3879s1.f34170n[AbstractC3548lu.s(c3879s1.f34169m, j9, true)];
            }
        }
        if (j9 == 0) {
            this.f33253e = this.i.length != 0 ? 3 : 0;
        } else {
            this.f33253e = 6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03be  */
    @Override // com.google.android.gms.internal.ads.O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(P0 p02, S0 s02) {
        boolean z8;
        C3879s1 c3879s1;
        int i;
        long j9;
        int i4;
        C3879s1 c3879s12;
        long j10 = this.f33257j;
        if (j10 != -1) {
            long j11 = ((J0) p02).f25675w;
            if (j10 < j11 || j10 > 262144 + j11) {
                s02.f27467n = j10;
                z8 = true;
                this.f33257j = -1L;
                if (!z8) {
                    return 1;
                }
                int i9 = this.f33253e;
                C3879s1 c3879s13 = null;
                if (i9 == 0) {
                    if (!b(p02)) {
                        throw W4.a(null, "AVI Header List not found");
                    }
                    ((J0) p02).b(12, false);
                    this.f33253e = 1;
                    return 0;
                }
                C0357t c0357t = this.f33250b;
                Lr lr = this.f33249a;
                if (i9 == 1) {
                    ((J0) p02).E(lr.f26233a, 0, 12, false);
                    lr.E(0);
                    c0357t.getClass();
                    c0357t.f2319a = lr.c();
                    c0357t.f2320b = lr.c();
                    int i10 = c0357t.f2319a;
                    if (i10 != 1414744396) {
                        StringBuilder sb = new StringBuilder(CL.b(i10, 22));
                        sb.append("LIST expected, found: ");
                        sb.append(i10);
                        throw W4.a(null, sb.toString());
                    }
                    int c4 = lr.c();
                    if (c4 == 1819436136) {
                        this.f33259l = c0357t.f2320b;
                        this.f33253e = 2;
                        return 0;
                    }
                    StringBuilder sb2 = new StringBuilder(CL.b(c4, 22));
                    sb2.append("hdrl expected, found: ");
                    sb2.append(c4);
                    throw W4.a(null, sb2.toString());
                }
                if (i9 == 2) {
                    int i11 = 2;
                    int i12 = this.f33259l - 4;
                    Lr lr2 = new Lr(i12);
                    ((J0) p02).E(lr2.f26233a, 0, i12, false);
                    C3933t1 b9 = C3933t1.b(1819436136, lr2);
                    int i13 = b9.f34335b;
                    if (i13 != 1819436136) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i13).length() + 28);
                        sb3.append("Unexpected header list type ");
                        sb3.append(i13);
                        throw W4.a(null, sb3.toString());
                    }
                    C3772q1 c3772q1 = (C3772q1) b9.c(C3772q1.class);
                    if (c3772q1 == null) {
                        throw W4.a(null, "AviHeader not found");
                    }
                    this.f33255g = c3772q1;
                    this.f33256h = c3772q1.f33564c * c3772q1.f33562a;
                    ArrayList arrayList = new ArrayList();
                    C3675oC c3675oC = b9.f34334a;
                    int i14 = c3675oC.f33117w;
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < i14) {
                        InterfaceC3664o1 interfaceC3664o1 = (InterfaceC3664o1) c3675oC.get(i15);
                        if (interfaceC3664o1.a() == 1819440243) {
                            C3933t1 c3933t1 = (C3933t1) interfaceC3664o1;
                            int i17 = i16 + 1;
                            C3825r1 c3825r1 = (C3825r1) c3933t1.c(C3825r1.class);
                            C4041v1 c4041v1 = (C4041v1) c3933t1.c(C4041v1.class);
                            if (c3825r1 == null) {
                                AbstractC3217fl.I("AviExtractor", "Missing Stream Header");
                            } else if (c4041v1 == null) {
                                AbstractC3217fl.I("AviExtractor", "Missing Stream Format");
                            } else {
                                long w9 = AbstractC3548lu.w(c3825r1.f33930d, c3825r1.f33928b * 1000000, c3825r1.f33929c, RoundingMode.DOWN);
                                TP tp = c4041v1.f34697a;
                                C4065vP c4065vP = new C4065vP(tp);
                                c4065vP.c(i16);
                                int i18 = c3825r1.f33931e;
                                if (i18 != 0) {
                                    c4065vP.f34786o = i18;
                                }
                                C4095w1 c4095w1 = (C4095w1) c3933t1.c(C4095w1.class);
                                if (c4095w1 != null) {
                                    c4065vP.f34774b = c4095w1.f34914a;
                                }
                                int f6 = K4.f(tp.f27776o);
                                if (f6 != 1) {
                                    if (f6 == i11) {
                                        f6 = 2;
                                    }
                                }
                                InterfaceC3448k1 x3 = this.f33254f.x(i16, f6);
                                x3.e(new TP(c4065vP));
                                this.f33256h = Math.max(this.f33256h, w9);
                                c3879s1 = new C3879s1(i16, c3825r1, x3);
                                if (c3879s1 != null) {
                                    arrayList.add(c3879s1);
                                }
                                i16 = i17;
                            }
                            c3879s1 = null;
                            if (c3879s1 != null) {
                            }
                            i16 = i17;
                        }
                        i15++;
                        i11 = 2;
                    }
                    this.i = (C3879s1[]) arrayList.toArray(new C3879s1[0]);
                    this.f33254f.v();
                    this.f33253e = 3;
                    return 0;
                }
                int i19 = 4;
                if (i9 == 3) {
                    long j12 = this.f33260m;
                    if (j12 != -1 && ((J0) p02).f25675w != j12) {
                        this.f33257j = j12;
                        return 0;
                    }
                    ((J0) p02).I(lr.f26233a, 0, 12, false);
                    J0 j02 = (J0) p02;
                    j02.f25677y = 0;
                    lr.E(0);
                    c0357t.getClass();
                    c0357t.f2319a = lr.c();
                    c0357t.f2320b = lr.c();
                    int c9 = lr.c();
                    int i20 = c0357t.f2319a;
                    if (i20 == 1179011410) {
                        j02.b(12, false);
                        return 0;
                    }
                    if (i20 != 1414744396 || c9 != 1769369453) {
                        this.f33257j = j02.f25675w + c0357t.f2320b + 8;
                        return 0;
                    }
                    long j13 = j02.f25675w;
                    this.f33260m = j13;
                    long j14 = j13 + c0357t.f2320b + 8;
                    this.f33261n = j14;
                    if (!this.f33263p) {
                        C3772q1 c3772q12 = this.f33255g;
                        c3772q12.getClass();
                        if ((c3772q12.f33563b & 16) == 16) {
                            this.f33253e = 4;
                            this.f33257j = j14;
                            return 0;
                        }
                        this.f33254f.w(new T0(this.f33256h, 0L));
                        this.f33263p = true;
                    }
                    this.f33257j = j02.f25675w + 12;
                    this.f33253e = 6;
                    return 0;
                }
                if (i9 == 4) {
                    ((J0) p02).E(lr.f26233a, 0, 8, false);
                    lr.E(0);
                    int c10 = lr.c();
                    int c11 = lr.c();
                    if (c10 != 829973609) {
                        this.f33257j = ((J0) p02).f25675w + c11;
                        return 0;
                    }
                    this.f33253e = 5;
                    this.f33262o = c11;
                    return 0;
                }
                if (i9 != 5) {
                    if (((J0) p02).f25675w >= this.f33261n) {
                        return -1;
                    }
                    C3879s1 c3879s14 = this.f33258k;
                    if (c3879s14 != null) {
                        int i21 = c3879s14.f34165h;
                        InterfaceC3448k1 interfaceC3448k1 = c3879s14.f34159b;
                        int d2 = i21 - interfaceC3448k1.d(p02, i21, false);
                        c3879s14.f34165h = d2;
                        boolean z9 = d2 == 0;
                        if (z9) {
                            if (c3879s14.f34164g > 0) {
                                int i22 = c3879s14.i;
                                interfaceC3448k1.b((c3879s14.f34162e * i22) / c3879s14.f34163f, Arrays.binarySearch(c3879s14.f34170n, i22) >= 0 ? 1 : 0, c3879s14.f34164g, 0, null);
                            }
                            c3879s14.i++;
                        }
                        if (!z9) {
                            return 0;
                        }
                        this.f33258k = null;
                        return 0;
                    }
                    J0 j03 = (J0) p02;
                    if ((j03.f25675w & 1) == 1) {
                        j03.b(1, false);
                    }
                    j03.I(lr.f26233a, 0, 12, false);
                    lr.E(0);
                    int c12 = lr.c();
                    if (c12 == 1414744396) {
                        lr.E(8);
                        j03.b(lr.c() != 1769369453 ? 8 : 12, false);
                        j03.f25677y = 0;
                        return 0;
                    }
                    int c13 = lr.c();
                    if (c12 == 1263424842) {
                        this.f33257j = j03.f25675w + c13 + 8;
                        return 0;
                    }
                    j03.b(8, false);
                    j03.f25677y = 0;
                    for (C3879s1 c3879s15 : this.i) {
                        if (c3879s15.f34160c == c12 || c3879s15.f34161d == c12) {
                            c3879s13 = c3879s15;
                            break;
                        }
                    }
                    if (c3879s13 == null) {
                        this.f33257j = j03.f25675w + c13;
                        return 0;
                    }
                    c3879s13.f34164g = c13;
                    c3879s13.f34165h = c13;
                    this.f33258k = c3879s13;
                    return 0;
                }
                Lr lr3 = new Lr(this.f33262o);
                ((J0) p02).E(lr3.f26233a, 0, this.f33262o, false);
                if (lr3.B() < 16) {
                    i = 0;
                    j9 = 0;
                } else {
                    int i23 = lr3.f26234b;
                    lr3.G(8);
                    long c14 = lr3.c();
                    i = 0;
                    long j15 = this.f33260m;
                    j9 = c14 > j15 ? 0L : j15 + 8;
                    lr3.E(i23);
                }
                while (lr3.B() >= 16) {
                    int c15 = lr3.c();
                    int c16 = lr3.c();
                    long c17 = lr3.c() + j9;
                    lr3.G(i19);
                    C3879s1[] c3879s1Arr = this.i;
                    int length = c3879s1Arr.length;
                    int i24 = i;
                    while (true) {
                        if (i24 >= length) {
                            c3879s12 = null;
                            break;
                        }
                        c3879s12 = c3879s1Arr[i24];
                        if (c3879s12.f34160c == c15 || c3879s12.f34161d == c15) {
                            break;
                        }
                        i24++;
                    }
                    if (c3879s12 != null) {
                        int i25 = (c16 & 16) == 16 ? 1 : i;
                        if (c3879s12.f34168l == -1) {
                            c3879s12.f34168l = c17;
                        }
                        if (i25 != 0) {
                            if (c3879s12.f34167k == c3879s12.f34170n.length) {
                                long[] jArr = c3879s12.f34169m;
                                c3879s12.f34169m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = c3879s12.f34170n;
                                c3879s12.f34170n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = c3879s12.f34169m;
                            int i26 = c3879s12.f34167k;
                            jArr2[i26] = c17;
                            c3879s12.f34170n[i26] = c3879s12.f34166j;
                            c3879s12.f34167k = i26 + 1;
                        }
                        c3879s12.f34166j++;
                    }
                    i19 = 4;
                }
                C3879s1[] c3879s1Arr2 = this.i;
                int length2 = c3879s1Arr2.length;
                for (int i27 = i; i27 < length2; i27++) {
                    C3879s1 c3879s16 = c3879s1Arr2[i27];
                    c3879s16.f34169m = Arrays.copyOf(c3879s16.f34169m, c3879s16.f34167k);
                    c3879s16.f34170n = Arrays.copyOf(c3879s16.f34170n, c3879s16.f34167k);
                    if ((c3879s16.f34160c & 1651965952) == 1651965952 && c3879s16.f34158a.f33932f != 0 && (i4 = c3879s16.f34167k) > 0) {
                        c3879s16.f34163f = i4;
                    }
                }
                this.f33263p = true;
                if (this.i.length == 0) {
                    this.f33254f.w(new T0(this.f33256h, 0L));
                } else {
                    this.f33254f.w(new T0(this, this.f33256h));
                }
                this.f33253e = 6;
                this.f33257j = this.f33260m;
                return i;
            }
            ((J0) p02).b((int) (j10 - j11), false);
        }
        z8 = false;
        this.f33257j = -1L;
        if (!z8) {
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
    }
}
