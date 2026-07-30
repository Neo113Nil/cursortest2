package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class B4 implements O0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f23970a;

    /* renamed from: b, reason: collision with root package name */
    public final Lr f23971b = new Lr(new byte[9400], 0);

    /* renamed from: c, reason: collision with root package name */
    public final SparseIntArray f23972c;

    /* renamed from: d, reason: collision with root package name */
    public final Rx f23973d;

    /* renamed from: e, reason: collision with root package name */
    public final T2 f23974e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f23975f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f23976g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f23977h;
    public final C4098w4 i;

    /* renamed from: j, reason: collision with root package name */
    public A1 f23978j;

    /* renamed from: k, reason: collision with root package name */
    public Q0 f23979k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f23980l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f23981m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f23982n;

    /* renamed from: o, reason: collision with root package name */
    public int f23983o;

    static {
        int i = AbstractC3217fl.f30872K;
    }

    public B4(T2 t22, It it, Rx rx) {
        this.f23973d = rx;
        this.f23974e = t22;
        this.f23970a = Collections.singletonList(it);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f23976g = sparseBooleanArray;
        this.f23977h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f23975f = sparseArray;
        this.f23972c = new SparseIntArray();
        this.i = new C4098w4(1);
        this.f23979k = Q0.f27098l0;
        this.f23983o = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            this.f23975f.put(sparseArray2.keyAt(i), (E4) sparseArray2.valueAt(i));
        }
        this.f23975f.put(0, new A4(new C2881Yl(this)));
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        this.f23979k = new com.bumptech.glide.manager.n(q02, (InterfaceC3720p3) this.f23974e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // com.google.android.gms.internal.ads.O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(P0 p02) {
        byte[] bArr = this.f23971b.f26233a;
        J0 j02 = (J0) p02;
        j02.I(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i4 = 0; i4 < 5; i4++) {
                if (bArr[(i4 * 188) + i] != 71) {
                    break;
                }
            }
            j02.b(i, false);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void c(long j9, long j10) {
        A1 a12;
        long j11;
        List list = this.f23970a;
        int size = list.size();
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            It it = (It) list.get(i4);
            synchronized (it) {
                j11 = it.f25648b;
            }
            if (j11 != com.anythink.basead.exoplayer.b.f6539b) {
                long a9 = it.a();
                if (a9 != com.anythink.basead.exoplayer.b.f6539b) {
                    if (a9 != 0) {
                        if (a9 == j10) {
                        }
                    }
                }
            }
            it.b(j10);
        }
        if (j10 != 0 && (a12 = this.f23978j) != null) {
            a12.a(j10);
        }
        this.f23971b.y(0);
        this.f23972c.clear();
        while (true) {
            SparseArray sparseArray = this.f23975f;
            if (i >= sparseArray.size()) {
                return;
            }
            ((E4) sparseArray.valueAt(i)).d();
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // com.google.android.gms.internal.ads.O0
    public final int e(P0 p02, S0 s02) {
        ?? r15;
        long j9;
        long j10;
        long j11 = ((J0) p02).f25674v;
        if (this.f23980l) {
            long j12 = com.anythink.basead.exoplayer.b.f6539b;
            C4098w4 c4098w4 = this.i;
            if (j11 != -1 && !c4098w4.f34922c) {
                int i = this.f23983o;
                if (i <= 0) {
                    c4098w4.b((J0) p02);
                    return 0;
                }
                boolean z8 = c4098w4.f34924e;
                Lr lr = c4098w4.f34921b;
                if (z8) {
                    if (c4098w4.f34926g == com.anythink.basead.exoplayer.b.f6539b) {
                        c4098w4.b((J0) p02);
                        return 0;
                    }
                    if (c4098w4.f34923d) {
                        long j13 = c4098w4.f34925f;
                        if (j13 == com.anythink.basead.exoplayer.b.f6539b) {
                            c4098w4.b((J0) p02);
                            return 0;
                        }
                        It it = c4098w4.f34920a;
                        c4098w4.f34927h = it.d(c4098w4.f34926g) - it.c(j13);
                        c4098w4.b((J0) p02);
                        return 0;
                    }
                    J0 j02 = (J0) p02;
                    int min = (int) Math.min(112800L, j02.f25674v);
                    if (j02.f25675w != 0) {
                        s02.f27467n = 0L;
                        return 1;
                    }
                    lr.y(min);
                    j02.f25677y = 0;
                    j02.I(lr.f26233a, 0, min, false);
                    int i4 = lr.f26234b;
                    int i9 = lr.f26235c;
                    while (true) {
                        if (i4 >= i9) {
                            j10 = -9223372036854775807L;
                            break;
                        }
                        if (lr.f26233a[i4] == 71) {
                            j10 = PA.p(lr, i4, i);
                            if (j10 != com.anythink.basead.exoplayer.b.f6539b) {
                                break;
                            }
                        }
                        i4++;
                    }
                    c4098w4.f34925f = j10;
                    c4098w4.f34923d = true;
                    return 0;
                }
                J0 j03 = (J0) p02;
                long j14 = j03.f25674v;
                int min2 = (int) Math.min(112800L, j14);
                long j15 = j14 - min2;
                if (j03.f25675w != j15) {
                    s02.f27467n = j15;
                    return 1;
                }
                lr.y(min2);
                j03.f25677y = 0;
                j03.I(lr.f26233a, 0, min2, false);
                int i10 = lr.f26234b;
                int i11 = lr.f26235c;
                int i12 = i11 - 188;
                while (true) {
                    if (i12 < i10) {
                        break;
                    }
                    byte[] bArr = lr.f26233a;
                    int i13 = -4;
                    int i14 = 0;
                    while (true) {
                        if (i13 > 4) {
                            break;
                        }
                        int i15 = (i13 * 188) + i12;
                        if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                            i14 = 0;
                        } else {
                            i14++;
                            if (i14 == 5) {
                                long p6 = PA.p(lr, i12, i);
                                if (p6 != com.anythink.basead.exoplayer.b.f6539b) {
                                    j12 = p6;
                                    break;
                                }
                            }
                        }
                        i13++;
                    }
                    i12--;
                }
                c4098w4.f34926g = j12;
                c4098w4.f34924e = true;
                return 0;
            }
            if (this.f23981m) {
                j9 = 0;
            } else {
                this.f23981m = true;
                long j16 = c4098w4.f34927h;
                if (j16 != com.anythink.basead.exoplayer.b.f6539b) {
                    int i16 = this.f23983o;
                    T2 t22 = new T2(11);
                    It it2 = c4098w4.f34920a;
                    C3398j5 c3398j5 = new C3398j5();
                    c3398j5.f32083n = i16;
                    c3398j5.f32084u = it2;
                    c3398j5.f32085v = new Lr();
                    j9 = 0;
                    A1 a12 = new A1(t22, c3398j5, j16, j16 + 1, 0L, j11, 188L, 940);
                    this.f23978j = a12;
                    this.f23979k.w(a12.f23798a);
                } else {
                    j9 = 0;
                    this.f23979k.w(new T0(j16, 0L));
                }
            }
            if (this.f23982n) {
                this.f23982n = false;
                c(j9, j9);
                if (((J0) p02).f25675w != j9) {
                    s02.f27467n = j9;
                    return 1;
                }
            }
            r15 = 1;
            r15 = 1;
            A1 a13 = this.f23978j;
            if (a13 != null && a13.f23800c != null) {
                return a13.b((J0) p02, s02);
            }
        } else {
            r15 = 1;
        }
        Lr lr2 = this.f23971b;
        byte[] bArr2 = lr2.f26233a;
        if (9400 - lr2.f26234b < 188) {
            int B8 = lr2.B();
            if (B8 > 0) {
                System.arraycopy(bArr2, lr2.f26234b, bArr2, 0, B8);
            }
            lr2.z(B8, bArr2);
        }
        while (true) {
            int B9 = lr2.B();
            SparseArray sparseArray = this.f23975f;
            if (B9 >= 188) {
                int i17 = lr2.f26234b;
                int i18 = lr2.f26235c;
                byte[] bArr3 = lr2.f26233a;
                while (i17 < i18 && bArr3[i17] != 71) {
                    i17++;
                }
                lr2.E(i17);
                int i19 = i17 + 188;
                int i20 = lr2.f26235c;
                if (i19 > i20) {
                    return 0;
                }
                int b9 = lr2.b();
                if ((8388608 & b9) != 0) {
                    lr2.E(i19);
                    return 0;
                }
                int i21 = (4194304 & b9) != 0 ? r15 : 0;
                int i22 = b9 & 32;
                int i23 = (b9 >> 8) & 8191;
                E4 e42 = (b9 & 16) != 0 ? (E4) sparseArray.get(i23) : null;
                if (e42 == null) {
                    lr2.E(i19);
                    return 0;
                }
                int i24 = b9 & 15;
                SparseIntArray sparseIntArray = this.f23972c;
                int i25 = sparseIntArray.get(i23, i24 - 1);
                sparseIntArray.put(i23, i24);
                if (i25 == i24) {
                    lr2.E(i19);
                    return 0;
                }
                if (i24 != ((i25 + r15) & 15)) {
                    e42.d();
                }
                if (i22 != 0) {
                    int K8 = lr2.K();
                    i21 |= (lr2.K() & 64) != 0 ? 2 : 0;
                    lr2.G(K8 - 1);
                }
                boolean z9 = this.f23980l;
                if (z9 || !this.f23977h.get(i23, false)) {
                    lr2.C(i19);
                    e42.a(i21, lr2);
                    lr2.C(i20);
                }
                if (!z9 && this.f23980l && j11 != -1) {
                    this.f23982n = r15;
                }
                lr2.E(i19);
                return 0;
            }
            int i26 = lr2.f26235c;
            int z10 = ((J0) p02).z(bArr2, i26, 9400 - i26);
            if (z10 == -1) {
                for (int i27 = 0; i27 < sparseArray.size(); i27++) {
                    E4 e43 = (E4) sparseArray.valueAt(i27);
                    if (e43 instanceof C4044v4) {
                        C4044v4 c4044v4 = (C4044v4) e43;
                        if (c4044v4.f34703c == 3 && c4044v4.f34709j == -1) {
                            c4044v4.a(r15, new Lr());
                        }
                    }
                }
                return -1;
            }
            lr2.C(i26 + z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
    }
}
