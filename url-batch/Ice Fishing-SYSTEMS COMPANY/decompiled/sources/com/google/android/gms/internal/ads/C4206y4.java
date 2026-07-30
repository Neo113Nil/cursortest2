package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* renamed from: com.google.android.gms.internal.ads.y4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4206y4 implements O0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f35307e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35308f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f35309g;

    /* renamed from: h, reason: collision with root package name */
    public long f35310h;
    public A1 i;

    /* renamed from: j, reason: collision with root package name */
    public PQ f35311j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f35312k;

    /* renamed from: a, reason: collision with root package name */
    public final It f35303a = new It();

    /* renamed from: c, reason: collision with root package name */
    public final Lr f35305c = new Lr(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f35304b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final C4098w4 f35306d = new C4098w4(0);

    static {
        int i = AbstractC2655Lg.f26181Q;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        this.f35311j = (PQ) q02;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final boolean b(P0 p02) {
        byte[] bArr = new byte[14];
        J0 j02 = (J0) p02;
        j02.I(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            j02.d(bArr[13] & 7, false);
            j02.I(bArr, 0, 3, false);
            if ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255)) == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r0 != r7) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035 A[LOOP:0: B:18:0x002d->B:20:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j9, long j10) {
        long j11;
        A1 a12;
        int i;
        SparseArray sparseArray;
        It it = this.f35303a;
        synchronized (it) {
            j11 = it.f25648b;
        }
        if (j11 != com.anythink.basead.exoplayer.b.f6539b) {
            long a9 = it.a();
            if (a9 != com.anythink.basead.exoplayer.b.f6539b) {
                if (a9 != 0) {
                }
            }
            a12 = this.i;
            if (a12 != null) {
                a12.a(j10);
            }
            i = 0;
            while (true) {
                sparseArray = this.f35304b;
                if (i < sparseArray.size()) {
                    return;
                }
                C4152x4 c4152x4 = (C4152x4) sparseArray.valueAt(i);
                c4152x4.f35124f = false;
                c4152x4.f35119a.a();
                i++;
            }
        }
        it.b(j10);
        a12 = this.i;
        if (a12 != null) {
        }
        i = 0;
        while (true) {
            sparseArray = this.f35304b;
            if (i < sparseArray.size()) {
            }
            C4152x4 c4152x42 = (C4152x4) sparseArray.valueAt(i);
            c4152x42.f35124f = false;
            c4152x42.f35119a.a();
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0222  */
    @Override // com.google.android.gms.internal.ads.O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(P0 p02, S0 s02) {
        long j9;
        int i;
        long j10;
        InterfaceC3291h4 c3397j4;
        PQ pq = this.f35311j;
        pq.getClass();
        long j11 = ((J0) p02).f25674v;
        long j12 = com.anythink.basead.exoplayer.b.f6539b;
        C4098w4 c4098w4 = this.f35306d;
        if (j11 != -1 && !c4098w4.f34922c) {
            boolean z8 = c4098w4.f34924e;
            Lr lr = c4098w4.f34921b;
            if (!z8) {
                J0 j02 = (J0) p02;
                long j13 = j02.f25674v;
                int min = (int) Math.min(20000L, j13);
                long j14 = j13 - min;
                if (j02.f25675w != j14) {
                    s02.f27467n = j14;
                    return 1;
                }
                lr.y(min);
                j02.f25677y = 0;
                j02.I(lr.f26233a, 0, min, false);
                int i4 = lr.f26234b;
                int i9 = lr.f26235c - 4;
                while (true) {
                    if (i9 < i4) {
                        break;
                    }
                    if (C4098w4.c(i9, lr.f26233a) == 442) {
                        lr.E(i9 + 4);
                        long a9 = C4098w4.a(lr);
                        if (a9 != com.anythink.basead.exoplayer.b.f6539b) {
                            j12 = a9;
                            break;
                        }
                    }
                    i9--;
                }
                c4098w4.f34926g = j12;
                c4098w4.f34924e = true;
                return 0;
            }
            if (c4098w4.f34926g == com.anythink.basead.exoplayer.b.f6539b) {
                byte[] bArr = AbstractC3548lu.f32614b;
                int length = bArr.length;
                lr.z(0, bArr);
                c4098w4.f34922c = true;
                ((J0) p02).f25677y = 0;
                return 0;
            }
            if (c4098w4.f34923d) {
                long j15 = c4098w4.f34925f;
                if (j15 == com.anythink.basead.exoplayer.b.f6539b) {
                    byte[] bArr2 = AbstractC3548lu.f32614b;
                    int length2 = bArr2.length;
                    lr.z(0, bArr2);
                    c4098w4.f34922c = true;
                    ((J0) p02).f25677y = 0;
                    return 0;
                }
                It it = c4098w4.f34920a;
                c4098w4.f34927h = it.d(c4098w4.f34926g) - it.c(j15);
                byte[] bArr3 = AbstractC3548lu.f32614b;
                int length3 = bArr3.length;
                lr.z(0, bArr3);
                c4098w4.f34922c = true;
                ((J0) p02).f25677y = 0;
                return 0;
            }
            J0 j03 = (J0) p02;
            int min2 = (int) Math.min(20000L, j03.f25674v);
            if (j03.f25675w != 0) {
                s02.f27467n = 0L;
                return 1;
            }
            lr.y(min2);
            j03.f25677y = 0;
            j03.I(lr.f26233a, 0, min2, false);
            int i10 = lr.f26234b;
            int i11 = lr.f26235c;
            while (true) {
                if (i10 >= i11 - 3) {
                    break;
                }
                if (C4098w4.c(i10, lr.f26233a) == 442) {
                    lr.E(i10 + 4);
                    long a10 = C4098w4.a(lr);
                    if (a10 != com.anythink.basead.exoplayer.b.f6539b) {
                        j12 = a10;
                        break;
                    }
                }
                i10++;
            }
            c4098w4.f34925f = j12;
            c4098w4.f34923d = true;
            return 0;
        }
        if (!this.f35312k) {
            this.f35312k = true;
            long j16 = c4098w4.f34927h;
            if (j16 != com.anythink.basead.exoplayer.b.f6539b) {
                A1 a12 = new A1(new T2(11), new C2881Yl(c4098w4.f34920a), j16, j16 + 1, 0L, j11, 188L, 1000);
                this.i = a12;
                this.f35311j.w(a12.f23798a);
            } else {
                pq.w(new T0(j16, 0L));
            }
        }
        A1 a13 = this.i;
        if (a13 != null && a13.f23800c != null) {
            return a13.b((J0) p02, s02);
        }
        J0 j04 = (J0) p02;
        j04.f25677y = 0;
        long m8 = j11 != -1 ? j11 - j04.m() : -1L;
        if (m8 != -1 && m8 < 4) {
            return -1;
        }
        Lr lr2 = this.f35305c;
        if (!j04.I(lr2.f26233a, 0, 4, true)) {
            return -1;
        }
        lr2.E(0);
        int b9 = lr2.b();
        if (b9 == 441) {
            return -1;
        }
        if (b9 == 442) {
            j04.I(lr2.f26233a, 0, 10, false);
            lr2.E(9);
            j04.b((lr2.K() & 7) + 14, false);
            return 0;
        }
        if (b9 == 443) {
            j04.I(lr2.f26233a, 0, 2, false);
            lr2.E(0);
            j04.b(lr2.L() + 6, false);
            return 0;
        }
        if ((b9 >> 8) != 1) {
            j04.b(1, false);
            return 0;
        }
        int i12 = b9 & com.anythink.basead.exoplayer.k.p.f8630b;
        SparseArray sparseArray = this.f35304b;
        C4152x4 c4152x4 = (C4152x4) sparseArray.get(i12);
        if (!this.f35307e) {
            if (c4152x4 == null) {
                InterfaceC3291h4 interfaceC3291h4 = null;
                if (i12 == 189) {
                    c3397j4 = new C2964b4(0, 0, null, "video/mp2p");
                    this.f35308f = true;
                    this.f35310h = j04.f25675w;
                } else if ((b9 & 224) == 192) {
                    c3397j4 = new C3882s4(null, 0, "video/mp2p");
                    this.f35308f = true;
                    this.f35310h = j04.f25675w;
                } else {
                    if ((b9 & 240) == 224) {
                        c3397j4 = new C3397j4(null, "video/mp2p");
                        this.f35309g = true;
                        this.f35310h = j04.f25675w;
                    }
                    if (interfaceC3291h4 != null) {
                        interfaceC3291h4.e(this.f35311j, new D4(Integer.MIN_VALUE, i12, 256));
                        c4152x4 = new C4152x4(interfaceC3291h4, this.f35303a);
                        sparseArray.put(i12, c4152x4);
                    }
                }
                interfaceC3291h4 = c3397j4;
                if (interfaceC3291h4 != null) {
                }
            }
            long j17 = 1048576;
            if (this.f35308f && this.f35309g) {
                j17 = 8192 + this.f35310h;
            }
            if (j04.f25675w > j17) {
                this.f35307e = true;
                this.f35311j.v();
            }
        }
        j04.I(lr2.f26233a, 0, 2, false);
        lr2.E(0);
        int L8 = lr2.L() + 6;
        if (c4152x4 == null) {
            j04.b(L8, false);
            return 0;
        }
        lr2.y(L8);
        j04.E(lr2.f26233a, 0, L8, false);
        lr2.E(6);
        Er er = c4152x4.f35121c;
        lr2.H(er.f24829a, 0, 3);
        er.d(0);
        er.f(8);
        c4152x4.f35122d = er.g();
        c4152x4.f35123e = er.g();
        er.f(6);
        lr2.H(er.f24829a, 0, er.h(8));
        er.d(0);
        if (c4152x4.f35122d) {
            er.f(4);
            long h9 = er.h(3);
            er.f(1);
            int h10 = er.h(15) << 15;
            er.f(1);
            long h11 = er.h(15);
            er.f(1);
            boolean z9 = c4152x4.f35124f;
            It it2 = c4152x4.f35120b;
            if (z9 || !c4152x4.f35123e) {
                i = h10;
                j10 = h9;
            } else {
                er.f(4);
                j10 = h9;
                er.f(1);
                int h12 = er.h(15) << 15;
                er.f(1);
                i = h10;
                long h13 = er.h(15);
                er.f(1);
                it2.c(h12 | (er.h(3) << 30) | h13);
                c4152x4.f35124f = true;
            }
            j9 = it2.c((j10 << 30) | i | h11);
        } else {
            j9 = 0;
        }
        InterfaceC3291h4 interfaceC3291h42 = c4152x4.f35119a;
        interfaceC3291h42.d(4, j9);
        interfaceC3291h42.c(lr2);
        interfaceC3291h42.b(false);
        lr2.C(lr2.f26233a.length);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
    }
}
