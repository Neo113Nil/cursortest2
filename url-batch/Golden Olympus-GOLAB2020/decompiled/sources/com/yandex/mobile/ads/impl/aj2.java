package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.ironsource.InterfaceC1490j3;
import com.yandex.mobile.ads.impl.cj2;
import com.yandex.mobile.ads.impl.yb0;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class aj2 implements p70 {

    /* renamed from: a, reason: collision with root package name */
    private r70 f23298a;

    /* renamed from: b, reason: collision with root package name */
    private p52 f23299b;

    /* renamed from: e, reason: collision with root package name */
    private b f23302e;

    /* renamed from: c, reason: collision with root package name */
    private int f23300c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f23301d = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f23303f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f23304g = -1;

    private static final class a implements b {

        /* renamed from: m, reason: collision with root package name */
        private static final int[] f23305m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n, reason: collision with root package name */
        private static final int[] f23306n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, InterfaceC1490j3.a.b.f16793h, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        private final r70 f23307a;

        /* renamed from: b, reason: collision with root package name */
        private final p52 f23308b;

        /* renamed from: c, reason: collision with root package name */
        private final bj2 f23309c;

        /* renamed from: d, reason: collision with root package name */
        private final int f23310d;

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f23311e;

        /* renamed from: f, reason: collision with root package name */
        private final sf1 f23312f;

        /* renamed from: g, reason: collision with root package name */
        private final int f23313g;

        /* renamed from: h, reason: collision with root package name */
        private final yb0 f23314h;

        /* renamed from: i, reason: collision with root package name */
        private int f23315i;

        /* renamed from: j, reason: collision with root package name */
        private long f23316j;

        /* renamed from: k, reason: collision with root package name */
        private int f23317k;

        /* renamed from: l, reason: collision with root package name */
        private long f23318l;

        public a(r70 r70Var, p52 p52Var, bj2 bj2Var) {
            this.f23307a = r70Var;
            this.f23308b = p52Var;
            this.f23309c = bj2Var;
            int max = Math.max(1, bj2Var.f23836c / 10);
            this.f23313g = max;
            sf1 sf1Var = new sf1(bj2Var.f23839f);
            sf1Var.o();
            int o4 = sf1Var.o();
            this.f23310d = o4;
            int i4 = bj2Var.f23835b;
            int i5 = (((bj2Var.f23837d - (i4 * 4)) * 8) / (bj2Var.f23838e * i4)) + 1;
            if (o4 != i5) {
                throw wf1.a("Expected frames per block: " + i5 + "; got: " + o4, (Exception) null);
            }
            int a4 = u82.a(max, o4);
            this.f23311e = new byte[bj2Var.f23837d * a4];
            this.f23312f = new sf1(a4 * a(o4, i4));
            int i6 = ((bj2Var.f23836c * bj2Var.f23837d) * 8) / o4;
            this.f23314h = new yb0.a().e("audio/raw").b(i6).j(i6).h(a(max, i4)).c(bj2Var.f23835b).l(bj2Var.f23836c).i(2).a();
        }

        private static int a(int i4, int i5) {
            return i4 * 2 * i5;
        }

        @Override // com.yandex.mobile.ads.impl.aj2.b
        public final void a(int i4, long j4) {
            this.f23307a.a(new dj2(this.f23309c, this.f23310d, i4, j4));
            this.f23308b.a(this.f23314h);
        }

        @Override // com.yandex.mobile.ads.impl.aj2.b
        public final void a(long j4) {
            this.f23315i = 0;
            this.f23316j = j4;
            this.f23317k = 0;
            this.f23318l = 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x018b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003e -> B:4:0x0040). Please report as a decompilation issue!!! */
        @Override // com.yandex.mobile.ads.impl.aj2.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(lz lzVar, long j4) {
            lz lzVar2;
            boolean z4;
            int i4;
            int i5 = this.f23313g;
            int i6 = this.f23317k;
            bj2 bj2Var = this.f23309c;
            int i7 = i5 - (i6 / (bj2Var.f23835b * 2));
            int i8 = this.f23310d;
            int i9 = u82.f32873a;
            boolean z5 = true;
            int i10 = (((i7 + i8) - 1) / i8) * bj2Var.f23837d;
            if (j4 == 0) {
                lzVar2 = lzVar;
                z4 = true;
                while (!z4) {
                    if (this.f23315i >= i10) {
                        break;
                    }
                    int read = lzVar2.read(this.f23311e, this.f23315i, (int) Math.min(i10 - r8, j4));
                    if (read == -1) {
                        z4 = true;
                        while (!z4) {
                        }
                    } else {
                        this.f23315i += read;
                    }
                }
                i4 = this.f23315i / this.f23309c.f23837d;
                if (i4 > 0) {
                    byte[] bArr = this.f23311e;
                    sf1 sf1Var = this.f23312f;
                    for (int i11 = 0; i11 < i4; i11++) {
                        int i12 = 0;
                        while (i12 < this.f23309c.f23835b) {
                            byte[] c4 = sf1Var.c();
                            bj2 bj2Var2 = this.f23309c;
                            int i13 = bj2Var2.f23837d;
                            int i14 = bj2Var2.f23835b;
                            int i15 = (i12 * 4) + (i11 * i13);
                            int i16 = (i14 * 4) + i15;
                            int i17 = (i13 / i14) - 4;
                            int i18 = (short) (((bArr[i15 + 1] & 255) << 8) | (bArr[i15] & 255));
                            int min = Math.min(bArr[i15 + 2] & 255, 88);
                            int i19 = f23306n[min];
                            boolean z6 = z5;
                            int i20 = ((this.f23310d * i11 * i14) + i12) * 2;
                            c4[i20] = (byte) (i18 & KotlinVersion.MAX_COMPONENT_VALUE);
                            c4[i20 + 1] = (byte) (i18 >> 8);
                            int i21 = 0;
                            while (i21 < i17 * 2) {
                                byte b4 = bArr[((i21 / 8) * i14 * 4) + i16 + ((i21 / 2) % 4)];
                                int i22 = i4;
                                int i23 = i21 % 2 == 0 ? b4 & 15 : (b4 & 255) >> 4;
                                int i24 = ((((i23 & 7) * 2) + 1) * i19) >> 3;
                                if ((i23 & 8) != 0) {
                                    i24 = -i24;
                                }
                                int i25 = i18 + i24;
                                int i26 = u82.f32873a;
                                i18 = Math.max(-32768, Math.min(i25, 32767));
                                i20 += i14 * 2;
                                c4[i20] = (byte) (i18 & KotlinVersion.MAX_COMPONENT_VALUE);
                                c4[i20 + 1] = (byte) (i18 >> 8);
                                int i27 = min + f23305m[i23];
                                int[] iArr = f23306n;
                                min = Math.max(0, Math.min(i27, 88));
                                i19 = iArr[min];
                                i21++;
                                i4 = i22;
                            }
                            i12++;
                            z5 = z6;
                        }
                    }
                    int i28 = i4;
                    int i29 = this.f23310d * i28 * 2 * this.f23309c.f23835b;
                    sf1Var.e(0);
                    sf1Var.d(i29);
                    this.f23315i -= this.f23309c.f23837d * i28;
                    int e4 = this.f23312f.e();
                    this.f23308b.a(e4, this.f23312f);
                    int i30 = this.f23317k + e4;
                    this.f23317k = i30;
                    int i31 = i30 / (this.f23309c.f23835b * 2);
                    int i32 = this.f23313g;
                    if (i31 >= i32) {
                        long a4 = this.f23316j + u82.a(this.f23318l, 1000000L, r1.f23836c);
                        int i33 = i32 * 2 * this.f23309c.f23835b;
                        this.f23308b.a(a4, 1, i33, this.f23317k - i33, null);
                        this.f23318l += i32;
                        this.f23317k -= i33;
                    }
                }
                if (z4) {
                    int i34 = this.f23317k / (this.f23309c.f23835b * 2);
                    if (i34 > 0) {
                        long a5 = this.f23316j + u82.a(this.f23318l, 1000000L, r2.f23836c);
                        int i35 = i34 * 2 * this.f23309c.f23835b;
                        this.f23308b.a(a5, 1, i35, this.f23317k - i35, null);
                        this.f23318l += i34;
                        this.f23317k -= i35;
                    }
                }
                return z4;
            }
            lzVar2 = lzVar;
            z4 = false;
            while (!z4) {
            }
            i4 = this.f23315i / this.f23309c.f23837d;
            if (i4 > 0) {
            }
            if (z4) {
            }
            return z4;
        }
    }

    private interface b {
        void a(int i4, long j4);

        void a(long j4);

        boolean a(lz lzVar, long j4);
    }

    static {
        new t70() { // from class: com.yandex.mobile.ads.impl.G
            @Override // com.yandex.mobile.ads.impl.t70
            public final p70[] a() {
                p70[] a4;
                a4 = aj2.a();
                return a4;
            }
        };
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(r70 r70Var) {
        this.f23298a = r70Var;
        this.f23299b = r70Var.a(0, 1);
        r70Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void release() {
    }

    private static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final r70 f23319a;

        /* renamed from: b, reason: collision with root package name */
        private final p52 f23320b;

        /* renamed from: c, reason: collision with root package name */
        private final bj2 f23321c;

        /* renamed from: d, reason: collision with root package name */
        private final yb0 f23322d;

        /* renamed from: e, reason: collision with root package name */
        private final int f23323e;

        /* renamed from: f, reason: collision with root package name */
        private long f23324f;

        /* renamed from: g, reason: collision with root package name */
        private int f23325g;

        /* renamed from: h, reason: collision with root package name */
        private long f23326h;

        public c(r70 r70Var, p52 p52Var, bj2 bj2Var, String str, int i4) {
            this.f23319a = r70Var;
            this.f23320b = p52Var;
            this.f23321c = bj2Var;
            int i5 = (bj2Var.f23835b * bj2Var.f23838e) / 8;
            if (bj2Var.f23837d != i5) {
                throw wf1.a("Expected block size: " + i5 + "; got: " + bj2Var.f23837d, (Exception) null);
            }
            int i6 = bj2Var.f23836c * i5;
            int i7 = i6 * 8;
            int max = Math.max(i5, i6 / 10);
            this.f23323e = max;
            this.f23322d = new yb0.a().e(str).b(i7).j(i7).h(max).c(bj2Var.f23835b).l(bj2Var.f23836c).i(i4).a();
        }

        @Override // com.yandex.mobile.ads.impl.aj2.b
        public final void a(int i4, long j4) {
            this.f23319a.a(new dj2(this.f23321c, 1, i4, j4));
            this.f23320b.a(this.f23322d);
        }

        @Override // com.yandex.mobile.ads.impl.aj2.b
        public final void a(long j4) {
            this.f23324f = j4;
            this.f23325g = 0;
            this.f23326h = 0L;
        }

        @Override // com.yandex.mobile.ads.impl.aj2.b
        public final boolean a(lz lzVar, long j4) {
            int i4;
            int i5;
            long j5 = j4;
            while (j5 > 0 && (i4 = this.f23325g) < (i5 = this.f23323e)) {
                int b4 = this.f23320b.b(lzVar, (int) Math.min(i5 - i4, j5), true);
                if (b4 == -1) {
                    j5 = 0;
                } else {
                    this.f23325g += b4;
                    j5 -= b4;
                }
            }
            int i6 = this.f23321c.f23837d;
            int i7 = this.f23325g / i6;
            if (i7 > 0) {
                long a4 = this.f23324f + u82.a(this.f23326h, 1000000L, r1.f23836c);
                int i8 = i7 * i6;
                int i9 = this.f23325g - i8;
                this.f23320b.a(a4, 1, i8, i9, null);
                this.f23326h += i7;
                this.f23325g = i9;
            }
            return j5 <= 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f7, code lost:
    
        if (r1 != 65534) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fc, code lost:
    
        if (r2 == 32) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    @Override // com.yandex.mobile.ads.impl.p70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(q70 q70Var, hj1 hj1Var) {
        int i4;
        if (this.f23299b != null) {
            int i5 = u82.f32873a;
            int i6 = this.f23300c;
            int i7 = 4;
            if (i6 == 0) {
                lz lzVar = (lz) q70Var;
                if (lzVar.a() == 0) {
                    int i8 = this.f23303f;
                    if (i8 != -1) {
                        lzVar.a(i8);
                        this.f23300c = 4;
                    } else if (cj2.a(lzVar)) {
                        lzVar.a((int) (lzVar.d() - lzVar.a()));
                        this.f23300c = 1;
                    } else {
                        throw wf1.a("Unsupported or unrecognized wav file type.", (Exception) null);
                    }
                    return 0;
                }
                throw new IllegalStateException();
            }
            long j4 = -1;
            if (i6 == 1) {
                sf1 sf1Var = new sf1(8);
                lz lzVar2 = (lz) q70Var;
                cj2.a a4 = cj2.a.a(lzVar2, sf1Var);
                if (a4.f24229a != 1685272116) {
                    lzVar2.c();
                } else {
                    lzVar2.a(false, 8);
                    sf1Var.e(0);
                    lzVar2.b(sf1Var.c(), 0, 8, false);
                    j4 = sf1Var.l();
                    lzVar2.a(((int) a4.f24230b) + 8);
                }
                this.f23301d = j4;
                this.f23300c = 2;
                return 0;
            }
            if (i6 == 2) {
                bj2 b4 = cj2.b((lz) q70Var);
                int i9 = b4.f23834a;
                if (i9 == 17) {
                    this.f23302e = new a(this.f23298a, this.f23299b, b4);
                } else if (i9 == 6) {
                    this.f23302e = new c(this.f23298a, this.f23299b, b4, "audio/g711-alaw", -1);
                } else if (i9 == 7) {
                    this.f23302e = new c(this.f23298a, this.f23299b, b4, "audio/g711-mlaw", -1);
                } else {
                    int i10 = b4.f23838e;
                    if (i9 != 1) {
                        if (i9 != 3) {
                        }
                        i4 = 0;
                        if (i4 == 0) {
                            this.f23302e = new c(this.f23298a, this.f23299b, b4, "audio/raw", i4);
                        } else {
                            throw wf1.a("Unsupported WAV format type: " + b4.f23834a);
                        }
                    }
                    i7 = u82.b(i10);
                    i4 = i7;
                    if (i4 == 0) {
                    }
                }
                this.f23300c = 3;
                return 0;
            }
            if (i6 != 3) {
                if (i6 == 4) {
                    long j5 = this.f23304g;
                    if (j5 != -1) {
                        lz lzVar3 = (lz) q70Var;
                        long a5 = j5 - lzVar3.a();
                        b bVar = this.f23302e;
                        bVar.getClass();
                        return bVar.a(lzVar3, a5) ? -1 : 0;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
            lz lzVar4 = (lz) q70Var;
            Pair c4 = cj2.c(lzVar4);
            this.f23303f = ((Long) c4.first).intValue();
            long longValue = ((Long) c4.second).longValue();
            long j6 = this.f23301d;
            if (j6 != -1 && longValue == 4294967295L) {
                longValue = j6;
            }
            this.f23304g = this.f23303f + longValue;
            long b5 = lzVar4.b();
            if (b5 != -1 && this.f23304g > b5) {
                ms0.d("WavExtractor", "Data exceeds input length: " + this.f23304g + ", " + b5);
                this.f23304g = b5;
            }
            b bVar2 = this.f23302e;
            bVar2.getClass();
            bVar2.a(this.f23303f, this.f23304g);
            this.f23300c = 4;
            return 0;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(long j4, long j5) {
        this.f23300c = j4 == 0 ? 0 : 4;
        b bVar = this.f23302e;
        if (bVar != null) {
            bVar.a(j5);
        }
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final boolean a(q70 q70Var) {
        return cj2.a((lz) q70Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p70[] a() {
        return new p70[]{new aj2()};
    }
}
