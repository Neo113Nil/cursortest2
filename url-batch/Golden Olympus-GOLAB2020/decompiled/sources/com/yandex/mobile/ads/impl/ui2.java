package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n22;
import com.yandex.mobile.ads.impl.vi2;
import com.yandex.mobile.ads.impl.yb0;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
final class ui2 extends n22 {

    /* renamed from: n, reason: collision with root package name */
    private a f33142n;

    /* renamed from: o, reason: collision with root package name */
    private int f33143o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f33144p;

    /* renamed from: q, reason: collision with root package name */
    private vi2.c f33145q;

    /* renamed from: r, reason: collision with root package name */
    private vi2.a f33146r;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final vi2.c f33147a;

        /* renamed from: b, reason: collision with root package name */
        public final vi2.a f33148b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f33149c;

        /* renamed from: d, reason: collision with root package name */
        public final vi2.b[] f33150d;

        /* renamed from: e, reason: collision with root package name */
        public final int f33151e;

        public a(vi2.c cVar, vi2.a aVar, byte[] bArr, vi2.b[] bVarArr, int i4) {
            this.f33147a = cVar;
            this.f33148b = aVar;
            this.f33149c = bArr;
            this.f33150d = bVarArr;
            this.f33151e = i4;
        }
    }

    ui2() {
    }

    @Override // com.yandex.mobile.ads.impl.n22
    protected final long a(sf1 sf1Var) {
        if ((sf1Var.c()[0] & 1) == 1) {
            return -1L;
        }
        byte b4 = sf1Var.c()[0];
        a aVar = this.f33142n;
        if (aVar == null) {
            throw new IllegalStateException();
        }
        int i4 = !aVar.f33150d[(b4 >> 1) & (KotlinVersion.MAX_COMPONENT_VALUE >>> (8 - aVar.f33151e))].f33647a ? aVar.f33147a.f33652e : aVar.f33147a.f33653f;
        long j4 = this.f33144p ? (this.f33143o + i4) / 4 : 0;
        if (sf1Var.b() < sf1Var.e() + 4) {
            sf1Var.a(Arrays.copyOf(sf1Var.c(), sf1Var.e() + 4));
        } else {
            sf1Var.d(sf1Var.e() + 4);
        }
        byte[] c4 = sf1Var.c();
        c4[sf1Var.e() - 4] = (byte) (j4 & 255);
        c4[sf1Var.e() - 3] = (byte) ((j4 >>> 8) & 255);
        c4[sf1Var.e() - 2] = (byte) ((j4 >>> 16) & 255);
        c4[sf1Var.e() - 1] = (byte) ((j4 >>> 24) & 255);
        this.f33144p = true;
        this.f33143o = i4;
        return j4;
    }

    @Override // com.yandex.mobile.ads.impl.n22
    protected final void c(long j4) {
        super.c(j4);
        this.f33144p = j4 != 0;
        vi2.c cVar = this.f33145q;
        this.f33143o = cVar != null ? cVar.f33652e : 0;
    }

    @Override // com.yandex.mobile.ads.impl.n22
    protected final boolean a(sf1 sf1Var, long j4, n22.a aVar) {
        a aVar2;
        int i4;
        int i5;
        int i6;
        if (this.f33142n != null) {
            aVar.f29380a.getClass();
            return false;
        }
        vi2.c cVar = this.f33145q;
        int i7 = 1;
        if (cVar == null) {
            this.f33145q = vi2.a(sf1Var);
        } else {
            vi2.a aVar3 = this.f33146r;
            if (aVar3 == null) {
                this.f33146r = vi2.a(sf1Var, true, true);
            } else {
                byte[] bArr = new byte[sf1Var.e()];
                System.arraycopy(sf1Var.c(), 0, bArr, 0, sf1Var.e());
                int i8 = cVar.f33648a;
                int i9 = 5;
                vi2.a(5, sf1Var, false);
                int t4 = sf1Var.t() + 1;
                ri2 ri2Var = new ri2(sf1Var.c());
                ri2Var.b(sf1Var.d() * 8);
                int i10 = 0;
                while (true) {
                    int i11 = 16;
                    if (i10 < t4) {
                        int i12 = i7;
                        if (ri2Var.a(24) == 5653314) {
                            int a4 = ri2Var.a(16);
                            int a5 = ri2Var.a(24);
                            long[] jArr = new long[a5];
                            long j5 = 0;
                            if (!ri2Var.b()) {
                                boolean b4 = ri2Var.b();
                                int i13 = 0;
                                while (i13 < a5) {
                                    if (b4) {
                                        if (ri2Var.b()) {
                                            i6 = t4;
                                            jArr[i13] = ri2Var.a(i9) + 1;
                                        } else {
                                            i6 = t4;
                                            jArr[i13] = 0;
                                        }
                                        i5 = 5;
                                    } else {
                                        i5 = i9;
                                        i6 = t4;
                                        jArr[i13] = ri2Var.a(i5) + 1;
                                    }
                                    i13++;
                                    i9 = i5;
                                    t4 = i6;
                                }
                                i4 = t4;
                            } else {
                                i4 = t4;
                                int a6 = ri2Var.a(i9) + 1;
                                int i14 = 0;
                                while (i14 < a5) {
                                    int i15 = 0;
                                    for (int i16 = a5 - i14; i16 > 0; i16 >>>= 1) {
                                        i15++;
                                    }
                                    int a7 = ri2Var.a(i15);
                                    int i17 = 0;
                                    while (i17 < a7 && i14 < a5) {
                                        jArr[i14] = a6;
                                        i14++;
                                        i17++;
                                        cVar = cVar;
                                        aVar3 = aVar3;
                                    }
                                    a6++;
                                    cVar = cVar;
                                    aVar3 = aVar3;
                                }
                            }
                            vi2.c cVar2 = cVar;
                            vi2.a aVar4 = aVar3;
                            int a8 = ri2Var.a(4);
                            if (a8 > 2) {
                                throw wf1.a("lookup type greater than 2 not decodable: " + a8, (Exception) null);
                            }
                            if (a8 == i12 || a8 == 2) {
                                ri2Var.b(32);
                                ri2Var.b(32);
                                int a9 = ri2Var.a(4) + i12;
                                ri2Var.b(i12);
                                if (a8 != i12) {
                                    j5 = a5 * a4;
                                } else if (a4 != 0) {
                                    j5 = (long) Math.floor(Math.pow(a5, 1.0d / a4));
                                }
                                ri2Var.b((int) (a9 * j5));
                            }
                            i10++;
                            cVar = cVar2;
                            t4 = i4;
                            aVar3 = aVar4;
                            i9 = 5;
                            i7 = 1;
                        } else {
                            throw wf1.a("expected code book to start with [0x56, 0x43, 0x42] at " + ri2Var.a(), (Exception) null);
                        }
                    } else {
                        vi2.c cVar3 = cVar;
                        vi2.a aVar5 = aVar3;
                        int i18 = 6;
                        int a10 = ri2Var.a(6) + 1;
                        for (int i19 = 0; i19 < a10; i19++) {
                            if (ri2Var.a(16) != 0) {
                                throw wf1.a("placeholder of time domain transforms not zeroed out", (Exception) null);
                            }
                        }
                        int i20 = 1;
                        int a11 = ri2Var.a(6) + 1;
                        int i21 = 0;
                        while (true) {
                            int i22 = 3;
                            if (i21 < a11) {
                                int a12 = ri2Var.a(i11);
                                if (a12 == 0) {
                                    int i23 = 8;
                                    ri2Var.b(8);
                                    ri2Var.b(16);
                                    ri2Var.b(16);
                                    ri2Var.b(6);
                                    ri2Var.b(8);
                                    int a13 = ri2Var.a(4) + 1;
                                    int i24 = 0;
                                    while (i24 < a13) {
                                        ri2Var.b(i23);
                                        i24++;
                                        i23 = 8;
                                    }
                                } else {
                                    if (a12 != i20) {
                                        throw wf1.a("floor type greater than 1 not decodable: " + a12, (Exception) null);
                                    }
                                    int a14 = ri2Var.a(5);
                                    int[] iArr = new int[a14];
                                    int i25 = -1;
                                    for (int i26 = 0; i26 < a14; i26++) {
                                        int a15 = ri2Var.a(4);
                                        iArr[i26] = a15;
                                        if (a15 > i25) {
                                            i25 = a15;
                                        }
                                    }
                                    int i27 = i25 + 1;
                                    int[] iArr2 = new int[i27];
                                    int i28 = 0;
                                    while (i28 < i27) {
                                        iArr2[i28] = ri2Var.a(i22) + 1;
                                        int a16 = ri2Var.a(2);
                                        int i29 = 8;
                                        if (a16 > 0) {
                                            ri2Var.b(8);
                                        }
                                        int i30 = 0;
                                        for (int i31 = 1; i30 < (i31 << a16); i31 = 1) {
                                            ri2Var.b(i29);
                                            i30++;
                                            i29 = 8;
                                        }
                                        i28++;
                                        i22 = 3;
                                    }
                                    ri2Var.b(2);
                                    int a17 = ri2Var.a(4);
                                    int i32 = 0;
                                    int i33 = 0;
                                    for (int i34 = 0; i34 < a14; i34++) {
                                        i32 += iArr2[iArr[i34]];
                                        while (i33 < i32) {
                                            ri2Var.b(a17);
                                            i33++;
                                        }
                                    }
                                }
                                i21++;
                                i18 = 6;
                                i20 = 1;
                                i11 = 16;
                            } else {
                                int a18 = ri2Var.a(i18) + 1;
                                int i35 = 0;
                                while (i35 < a18) {
                                    if (ri2Var.a(16) <= 2) {
                                        ri2Var.b(24);
                                        ri2Var.b(24);
                                        ri2Var.b(24);
                                        int a19 = ri2Var.a(i18) + 1;
                                        int i36 = 8;
                                        ri2Var.b(8);
                                        int[] iArr3 = new int[a19];
                                        for (int i37 = 0; i37 < a19; i37++) {
                                            iArr3[i37] = ((ri2Var.b() ? ri2Var.a(5) : 0) * 8) + ri2Var.a(3);
                                        }
                                        int i38 = 0;
                                        while (i38 < a19) {
                                            int i39 = 0;
                                            while (i39 < i36) {
                                                if ((iArr3[i38] & (1 << i39)) != 0) {
                                                    ri2Var.b(i36);
                                                }
                                                i39++;
                                                i36 = 8;
                                            }
                                            i38++;
                                            i36 = 8;
                                        }
                                        i35++;
                                        i18 = 6;
                                    } else {
                                        throw wf1.a("residueType greater than 2 is not decodable", (Exception) null);
                                    }
                                }
                                int a20 = ri2Var.a(i18) + 1;
                                for (int i40 = 0; i40 < a20; i40++) {
                                    int a21 = ri2Var.a(16);
                                    if (a21 != 0) {
                                        ms0.b("VorbisUtil", "mapping type other than 0 not supported: " + a21);
                                    } else {
                                        int a22 = ri2Var.b() ? ri2Var.a(4) + 1 : 1;
                                        if (ri2Var.b()) {
                                            int a23 = ri2Var.a(8) + 1;
                                            for (int i41 = 0; i41 < a23; i41++) {
                                                int i42 = i8 - 1;
                                                int i43 = 0;
                                                for (int i44 = i42; i44 > 0; i44 >>>= 1) {
                                                    i43++;
                                                }
                                                ri2Var.b(i43);
                                                int i45 = 0;
                                                while (i42 > 0) {
                                                    i45++;
                                                    i42 >>>= 1;
                                                }
                                                ri2Var.b(i45);
                                            }
                                        }
                                        if (ri2Var.a(2) != 0) {
                                            throw wf1.a("to reserved bits must be zero after mapping coupling steps", (Exception) null);
                                        }
                                        if (a22 > 1) {
                                            for (int i46 = 0; i46 < i8; i46++) {
                                                ri2Var.b(4);
                                            }
                                        }
                                        for (int i47 = 0; i47 < a22; i47++) {
                                            ri2Var.b(8);
                                            ri2Var.b(8);
                                            ri2Var.b(8);
                                        }
                                    }
                                }
                                int a24 = ri2Var.a(6);
                                int i48 = a24 + 1;
                                vi2.b[] bVarArr = new vi2.b[i48];
                                for (int i49 = 0; i49 < i48; i49++) {
                                    boolean b5 = ri2Var.b();
                                    ri2Var.a(16);
                                    ri2Var.a(16);
                                    ri2Var.a(8);
                                    bVarArr[i49] = new vi2.b(b5);
                                }
                                if (ri2Var.b()) {
                                    int i50 = 0;
                                    while (a24 > 0) {
                                        i50++;
                                        a24 >>>= 1;
                                    }
                                    aVar2 = new a(cVar3, aVar5, bArr, bVarArr, i50);
                                } else {
                                    throw wf1.a("framing bit after modes not set as expected", (Exception) null);
                                }
                            }
                        }
                    }
                }
            }
        }
        aVar2 = null;
        this.f33142n = aVar2;
        if (aVar2 == null) {
            return true;
        }
        vi2.c cVar4 = aVar2.f33147a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar4.f33654g);
        arrayList.add(aVar2.f33149c);
        aVar.f29380a = new yb0.a().e("audio/vorbis").b(cVar4.f33651d).j(cVar4.f33650c).c(cVar4.f33648a).l(cVar4.f33649b).a(arrayList).a(vi2.a(sj0.b(aVar2.f33148b.f33646a))).a();
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.n22
    protected final void a(boolean z4) {
        super.a(z4);
        if (z4) {
            this.f33142n = null;
            this.f33145q = null;
            this.f33146r = null;
        }
        this.f33143o = 0;
        this.f33144p = false;
    }
}
