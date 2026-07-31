package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mobile.ads.impl.AbstractC2346xg;
import com.yandex.mobile.ads.impl.C1790a;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import com.yandex.mobile.ads.impl.eb0;
import com.yandex.mobile.ads.impl.yb0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;

/* renamed from: com.yandex.mobile.ads.impl.yg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2369yg {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f35100a = u82.c("OpusHead");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f35101b = 0;

    /* renamed from: com.yandex.mobile.ads.impl.yg$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f35102a;

        /* renamed from: b, reason: collision with root package name */
        public int f35103b;

        /* renamed from: c, reason: collision with root package name */
        public int f35104c;

        /* renamed from: d, reason: collision with root package name */
        public long f35105d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f35106e;

        /* renamed from: f, reason: collision with root package name */
        private final sf1 f35107f;

        /* renamed from: g, reason: collision with root package name */
        private final sf1 f35108g;

        /* renamed from: h, reason: collision with root package name */
        private int f35109h;

        /* renamed from: i, reason: collision with root package name */
        private int f35110i;

        public a(sf1 sf1Var, sf1 sf1Var2, boolean z4) {
            this.f35108g = sf1Var;
            this.f35107f = sf1Var2;
            this.f35106e = z4;
            sf1Var2.e(12);
            this.f35102a = sf1Var2.x();
            sf1Var.e(12);
            this.f35110i = sf1Var.x();
            s70.a(sf1Var.h() == 1);
            this.f35103b = -1;
        }

        public final boolean a() {
            int i4 = this.f35103b + 1;
            this.f35103b = i4;
            if (i4 == this.f35102a) {
                return false;
            }
            this.f35105d = this.f35106e ? this.f35107f.y() : this.f35107f.v();
            if (this.f35103b == this.f35109h) {
                this.f35104c = this.f35108g.x();
                this.f35108g.f(4);
                int i5 = this.f35110i - 1;
                this.f35110i = i5;
                this.f35109h = i5 > 0 ? this.f35108g.x() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.yg$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f35111a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f35112b;

        /* renamed from: c, reason: collision with root package name */
        private final long f35113c;

        /* renamed from: d, reason: collision with root package name */
        private final long f35114d;

        public b(String str, byte[] bArr, long j4, long j5) {
            this.f35111a = str;
            this.f35112b = bArr;
            this.f35113c = j4;
            this.f35114d = j5;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.yg$c */
    private interface c {
        int a();

        int b();

        int c();
    }

    /* renamed from: com.yandex.mobile.ads.impl.yg$d */
    static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        private final int f35115a;

        /* renamed from: b, reason: collision with root package name */
        private final int f35116b;

        /* renamed from: c, reason: collision with root package name */
        private final sf1 f35117c;

        public d(AbstractC2346xg.b bVar, yb0 yb0Var) {
            sf1 sf1Var = bVar.f34556b;
            this.f35117c = sf1Var;
            sf1Var.e(12);
            int x4 = sf1Var.x();
            if ("audio/raw".equals(yb0Var.f34991m)) {
                int b4 = u82.b(yb0Var.f34974B, yb0Var.f35004z);
                if (x4 == 0 || x4 % b4 != 0) {
                    ms0.d("AtomParsers", "Audio sample size mismatch. stsd sample size: " + b4 + ", stsz sample size: " + x4);
                    x4 = b4;
                }
            }
            this.f35115a = x4 == 0 ? -1 : x4;
            this.f35116b = sf1Var.x();
        }

        @Override // com.yandex.mobile.ads.impl.C2369yg.c
        public final int a() {
            return this.f35115a;
        }

        @Override // com.yandex.mobile.ads.impl.C2369yg.c
        public final int b() {
            return this.f35116b;
        }

        @Override // com.yandex.mobile.ads.impl.C2369yg.c
        public final int c() {
            int i4 = this.f35115a;
            return i4 == -1 ? this.f35117c.x() : i4;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.yg$e */
    static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        private final sf1 f35118a;

        /* renamed from: b, reason: collision with root package name */
        private final int f35119b;

        /* renamed from: c, reason: collision with root package name */
        private final int f35120c;

        /* renamed from: d, reason: collision with root package name */
        private int f35121d;

        /* renamed from: e, reason: collision with root package name */
        private int f35122e;

        public e(AbstractC2346xg.b bVar) {
            sf1 sf1Var = bVar.f34556b;
            this.f35118a = sf1Var;
            sf1Var.e(12);
            this.f35120c = sf1Var.x() & KotlinVersion.MAX_COMPONENT_VALUE;
            this.f35119b = sf1Var.x();
        }

        @Override // com.yandex.mobile.ads.impl.C2369yg.c
        public final int a() {
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.C2369yg.c
        public final int b() {
            return this.f35119b;
        }

        @Override // com.yandex.mobile.ads.impl.C2369yg.c
        public final int c() {
            int i4 = this.f35120c;
            if (i4 == 8) {
                return this.f35118a.t();
            }
            if (i4 == 16) {
                return this.f35118a.z();
            }
            int i5 = this.f35121d;
            this.f35121d = i5 + 1;
            if (i5 % 2 != 0) {
                return this.f35122e & 15;
            }
            int t4 = this.f35118a.t();
            this.f35122e = t4;
            return (t4 & 240) >> 4;
        }
    }

    private static b a(int i4, sf1 sf1Var) {
        sf1Var.e(i4 + 12);
        sf1Var.f(1);
        a(sf1Var);
        sf1Var.f(2);
        int t4 = sf1Var.t();
        if ((t4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            sf1Var.f(2);
        }
        if ((t4 & 64) != 0) {
            sf1Var.f(sf1Var.t());
        }
        if ((t4 & 32) != 0) {
            sf1Var.f(2);
        }
        sf1Var.f(1);
        a(sf1Var);
        String a4 = i01.a(sf1Var.t());
        if ("audio/mpeg".equals(a4) || "audio/vnd.dts".equals(a4) || "audio/vnd.dts.hd".equals(a4)) {
            return new b(a4, null, -1L, -1L);
        }
        sf1Var.f(4);
        long v4 = sf1Var.v();
        long v5 = sf1Var.v();
        sf1Var.f(1);
        int a5 = a(sf1Var);
        long j4 = v5;
        byte[] bArr = new byte[a5];
        sf1Var.a(bArr, 0, a5);
        if (j4 <= 0) {
            j4 = -1;
        }
        return new b(a4, bArr, j4, v4 > 0 ? v4 : -1L);
    }

    private static int a(sf1 sf1Var) {
        int t4 = sf1Var.t();
        int i4 = t4 & 127;
        while ((t4 & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            t4 = sf1Var.t();
            i4 = (i4 << 7) | (t4 & 127);
        }
        return i4;
    }

    private static Pair a(int i4, int i5, sf1 sf1Var) {
        Integer num;
        l52 l52Var;
        Pair create;
        int i6;
        int i7;
        Integer num2;
        boolean z4;
        byte[] bArr;
        int d4 = sf1Var.d();
        while (d4 - i4 < i5) {
            sf1Var.e(d4);
            int h4 = sf1Var.h();
            if (h4 > 0) {
                if (sf1Var.h() == 1936289382) {
                    int i8 = d4 + 8;
                    int i9 = 0;
                    int i10 = -1;
                    Integer num3 = null;
                    String str = null;
                    while (i8 - d4 < h4) {
                        sf1Var.e(i8);
                        int h5 = sf1Var.h();
                        int h6 = sf1Var.h();
                        if (h6 == 1718775137) {
                            num3 = Integer.valueOf(sf1Var.h());
                        } else if (h6 == 1935894637) {
                            sf1Var.f(4);
                            str = sf1Var.a(4, un.f33183c);
                        } else if (h6 == 1935894633) {
                            i10 = i8;
                            i9 = h5;
                        }
                        i8 += h5;
                    }
                    if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                        if (!(num3 != null)) {
                            throw wf1.a("frma atom is mandatory", (Exception) null);
                        }
                        if (!(i10 != -1)) {
                            throw wf1.a("schi atom is mandatory", (Exception) null);
                        }
                        int i11 = i10 + 8;
                        while (true) {
                            if (i11 - i10 >= i9) {
                                num = num3;
                                l52Var = null;
                                break;
                            }
                            sf1Var.e(i11);
                            int h7 = sf1Var.h();
                            if (sf1Var.h() == 1952804451) {
                                int h8 = (sf1Var.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                                sf1Var.f(1);
                                if (h8 == 0) {
                                    sf1Var.f(1);
                                    i7 = 0;
                                    i6 = 0;
                                } else {
                                    int t4 = sf1Var.t();
                                    i6 = t4 & 15;
                                    i7 = (t4 & 240) >> 4;
                                }
                                if (sf1Var.t() == 1) {
                                    num2 = num3;
                                    z4 = true;
                                } else {
                                    num2 = num3;
                                    z4 = false;
                                }
                                int t5 = sf1Var.t();
                                byte[] bArr2 = new byte[16];
                                sf1Var.a(bArr2, 0, 16);
                                if (z4 && t5 == 0) {
                                    int t6 = sf1Var.t();
                                    byte[] bArr3 = new byte[t6];
                                    sf1Var.a(bArr3, 0, t6);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                l52Var = new l52(z4, str, t5, bArr2, i7, i6, bArr);
                            } else {
                                i11 += h7;
                            }
                        }
                        if (l52Var != null) {
                            int i12 = u82.f32873a;
                            create = Pair.create(num, l52Var);
                        } else {
                            throw wf1.a("tenc atom is mandatory", (Exception) null);
                        }
                    } else {
                        create = null;
                    }
                    if (create != null) {
                        return create;
                    }
                }
                d4 += h4;
            } else {
                throw wf1.a("childAtomSize must be positive", (Exception) null);
            }
        }
        return null;
    }

    private static q52 a(k52 k52Var, AbstractC2346xg.a aVar, xd0 xd0Var) {
        c eVar;
        boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        long[] jArr;
        long j4;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        long[] jArr2;
        long j5;
        int i11;
        int[] iArr2;
        int i12;
        int[] iArr3;
        int[] iArr4;
        int i13;
        int i14;
        int i15;
        AbstractC2346xg.b c4 = aVar.c(1937011578);
        if (c4 != null) {
            eVar = new d(c4, k52Var.f28066f);
        } else {
            AbstractC2346xg.b c5 = aVar.c(1937013298);
            if (c5 != null) {
                eVar = new e(c5);
            } else {
                throw wf1.a("Track has no sample table size information", (Exception) null);
            }
        }
        int b4 = eVar.b();
        if (b4 == 0) {
            return new q52(k52Var, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        AbstractC2346xg.b c6 = aVar.c(1937007471);
        if (c6 == null) {
            c6 = aVar.c(1668232756);
            c6.getClass();
            z4 = true;
        } else {
            z4 = false;
        }
        sf1 sf1Var = c6.f34556b;
        AbstractC2346xg.b c7 = aVar.c(1937011555);
        c7.getClass();
        sf1 sf1Var2 = c7.f34556b;
        AbstractC2346xg.b c8 = aVar.c(1937011827);
        c8.getClass();
        sf1 sf1Var3 = c8.f34556b;
        AbstractC2346xg.b c9 = aVar.c(1937011571);
        sf1 sf1Var4 = c9 != null ? c9.f34556b : null;
        AbstractC2346xg.b c10 = aVar.c(1668576371);
        sf1 sf1Var5 = c10 != null ? c10.f34556b : null;
        a aVar2 = new a(sf1Var2, sf1Var, z4);
        sf1Var3.e(12);
        int x4 = sf1Var3.x() - 1;
        int x5 = sf1Var3.x();
        int x6 = sf1Var3.x();
        if (sf1Var5 != null) {
            sf1Var5.e(12);
            i4 = sf1Var5.x();
        } else {
            i4 = 0;
        }
        if (sf1Var4 != null) {
            sf1Var4.e(12);
            i6 = sf1Var4.x();
            if (i6 > 0) {
                i5 = sf1Var4.x() - 1;
                i7 = 0;
            } else {
                i5 = -1;
                i7 = 0;
                sf1Var4 = null;
            }
        } else {
            i5 = -1;
            i6 = 0;
            i7 = 0;
        }
        int a4 = eVar.a();
        String str = k52Var.f28066f.f34991m;
        int i16 = (a4 == -1 || !(("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && x4 == 0 && i4 == 0 && i6 == 0)) ? i7 : 1;
        c cVar = eVar;
        if (i16 != 0) {
            int i17 = aVar2.f35102a;
            long[] jArr3 = new long[i17];
            int[] iArr5 = new int[i17];
            while (aVar2.a()) {
                int i18 = aVar2.f35103b;
                jArr3[i18] = aVar2.f35105d;
                iArr5[i18] = aVar2.f35104c;
            }
            eb0.a a5 = eb0.a(a4, jArr3, iArr5, x6);
            jArr = a5.f25172a;
            iArr2 = a5.f25173b;
            int i19 = a5.f25174c;
            jArr2 = a5.f25175d;
            iArr = a5.f25176e;
            j5 = a5.f25177f;
            i12 = i19;
            j4 = 0;
        } else {
            jArr = new long[b4];
            j4 = 0;
            int[] iArr6 = new int[b4];
            long[] jArr4 = new long[b4];
            sf1 sf1Var6 = sf1Var5;
            int[] iArr7 = new int[b4];
            int i20 = i5;
            sf1 sf1Var7 = sf1Var4;
            int i21 = i4;
            int i22 = i7;
            int i23 = i22;
            int i24 = i23;
            int i25 = i24;
            int i26 = i25;
            long j6 = 0;
            long j7 = 0;
            while (true) {
                if (i22 >= b4) {
                    i8 = x4;
                    i9 = x5;
                    iArr = iArr7;
                    i10 = i25;
                    break;
                }
                long j8 = j7;
                int i27 = i25;
                boolean z5 = true;
                while (i27 == 0) {
                    z5 = aVar2.a();
                    if (!z5) {
                        break;
                    }
                    int i28 = x4;
                    long j9 = aVar2.f35105d;
                    i27 = aVar2.f35104c;
                    j8 = j9;
                    x4 = i28;
                    x5 = x5;
                    b4 = b4;
                }
                int i29 = b4;
                i8 = x4;
                i9 = x5;
                if (!z5) {
                    ms0.d("AtomParsers", "Unexpected end of chunk data");
                    long[] copyOf = Arrays.copyOf(jArr, i22);
                    iArr6 = Arrays.copyOf(iArr6, i22);
                    jArr4 = Arrays.copyOf(jArr4, i22);
                    iArr = Arrays.copyOf(iArr7, i22);
                    jArr = copyOf;
                    b4 = i22;
                    i10 = i27;
                    break;
                }
                if (sf1Var6 != null) {
                    int i30 = i26;
                    while (i30 == 0 && i21 > 0) {
                        i30 = sf1Var6.x();
                        i23 = sf1Var6.h();
                        i21--;
                    }
                    i26 = i30 - 1;
                }
                jArr[i22] = j8;
                int c11 = cVar.c();
                iArr6[i22] = c11;
                if (c11 > i24) {
                    i24 = c11;
                }
                jArr4[i22] = j6 + i23;
                iArr7[i22] = sf1Var7 == null ? 1 : i7;
                if (i22 == i20) {
                    iArr7[i22] = 1;
                    i6--;
                    if (i6 > 0) {
                        sf1Var7.getClass();
                        i20 = sf1Var7.x() - 1;
                    }
                }
                j6 += x6;
                x5 = i9 - 1;
                if (x5 != 0 || i8 <= 0) {
                    x4 = i8;
                } else {
                    x4 = i8 - 1;
                    x5 = sf1Var3.x();
                    x6 = sf1Var3.h();
                }
                long j10 = j8 + iArr6[i22];
                i25 = i27 - 1;
                i22++;
                j7 = j10;
                b4 = i29;
            }
            jArr2 = jArr4;
            j5 = j6 + i23;
            if (sf1Var6 != null) {
                while (i21 > 0) {
                    if (sf1Var6.x() != 0) {
                        i11 = i7;
                        break;
                    }
                    sf1Var6.h();
                    i21--;
                }
            }
            i11 = 1;
            if (i6 != 0 || i9 != 0 || i10 != 0 || i8 != 0 || i26 != 0 || i11 == 0) {
                StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                sb.append(k52Var.f28061a);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i6);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i9);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i10);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i8);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i26);
                sb.append(i11 == 0 ? ", ctts invalid" : "");
                ms0.d("AtomParsers", sb.toString());
            }
            iArr2 = iArr6;
            i12 = i24;
        }
        long[] jArr5 = jArr;
        long[] jArr6 = jArr2;
        int[] iArr8 = iArr;
        long j11 = j5;
        long a6 = u82.a(j11, 1000000L, k52Var.f28063c);
        long[] jArr7 = k52Var.f28068h;
        if (jArr7 == null) {
            u82.a(jArr6, k52Var.f28063c);
            return new q52(k52Var, jArr5, iArr2, i12, jArr6, iArr8, a6);
        }
        int[] iArr9 = iArr2;
        int i31 = b4;
        int[] iArr10 = iArr9;
        if (jArr7.length == 1 && k52Var.f28062b == 1 && jArr6.length >= 2) {
            long[] jArr8 = k52Var.f28069i;
            jArr8.getClass();
            long j12 = jArr8[i7];
            long a7 = u82.a(k52Var.f28068h[i7], k52Var.f28063c, k52Var.f28064d) + j12;
            int length = jArr6.length - 1;
            int max = Math.max(i7, Math.min(4, length));
            int max2 = Math.max(0, Math.min(jArr6.length - 4, length));
            long j13 = jArr6[0];
            if (j13 <= j12 && j12 < jArr6[max] && jArr6[max2] < a7 && a7 <= j11) {
                long a8 = u82.a(j12 - j13, k52Var.f28066f.f34973A, k52Var.f28063c);
                long a9 = u82.a(j11 - a7, k52Var.f28066f.f34973A, k52Var.f28063c);
                if ((a8 != j4 || a9 != j4) && a8 <= 2147483647L && a9 <= 2147483647L) {
                    xd0Var.f34517a = (int) a8;
                    xd0Var.f34518b = (int) a9;
                    u82.a(jArr6, k52Var.f28063c);
                    return new q52(k52Var, jArr5, iArr10, i12, jArr6, iArr8, u82.a(k52Var.f28068h[0], 1000000L, k52Var.f28064d));
                }
            }
        }
        long[] jArr9 = k52Var.f28068h;
        if (jArr9.length == 1 && jArr9[0] == j4) {
            long[] jArr10 = k52Var.f28069i;
            jArr10.getClass();
            long j14 = jArr10[0];
            for (int i32 = 0; i32 < jArr6.length; i32++) {
                jArr6[i32] = u82.a(jArr6[i32] - j14, 1000000L, k52Var.f28063c);
            }
            return new q52(k52Var, jArr5, iArr10, i12, jArr6, iArr8, u82.a(j11 - j14, 1000000L, k52Var.f28063c));
        }
        boolean z6 = k52Var.f28062b == 1;
        int[] iArr11 = new int[jArr9.length];
        int[] iArr12 = new int[jArr9.length];
        long[] jArr11 = k52Var.f28069i;
        jArr11.getClass();
        int i33 = 0;
        boolean z7 = false;
        int i34 = 0;
        int i35 = 0;
        while (true) {
            long[] jArr12 = k52Var.f28068h;
            iArr3 = iArr12;
            if (i35 >= jArr12.length) {
                break;
            }
            int[] iArr13 = iArr11;
            long[] jArr13 = jArr11;
            long j15 = jArr13[i35];
            if (j15 != -1) {
                i13 = i35;
                long a10 = u82.a(jArr12[i35], k52Var.f28063c, k52Var.f28064d);
                iArr4 = iArr13;
                iArr4[i13] = u82.b(jArr6, j15, true);
                iArr3[i13] = u82.a(jArr6, j15 + a10, z6);
                while (true) {
                    i14 = iArr4[i13];
                    i15 = iArr3[i13];
                    if (i14 >= i15 || (iArr8[i14] & 1) != 0) {
                        break;
                    }
                    iArr4[i13] = i14 + 1;
                }
                int i36 = (i15 - i14) + i33;
                z7 = (i34 != i14) | z7;
                i34 = i15;
                i33 = i36;
            } else {
                iArr4 = iArr13;
                i13 = i35;
            }
            i35 = i13 + 1;
            iArr11 = iArr4;
            iArr12 = iArr3;
            jArr11 = jArr13;
        }
        int[] iArr14 = iArr11;
        boolean z8 = z7 | (i33 != i31);
        long[] jArr14 = z8 ? new long[i33] : jArr5;
        int[] iArr15 = z8 ? new int[i33] : iArr10;
        if (z8) {
            i12 = 0;
        }
        int[] iArr16 = z8 ? new int[i33] : iArr8;
        long[] jArr15 = new long[i33];
        int i37 = 0;
        int i38 = 0;
        long j16 = j4;
        while (i37 < k52Var.f28068h.length) {
            long j17 = k52Var.f28069i[i37];
            int i39 = iArr14[i37];
            boolean z9 = z8;
            int i40 = iArr3[i37];
            int i41 = i12;
            if (z9) {
                int i42 = i40 - i39;
                System.arraycopy(jArr5, i39, jArr14, i38, i42);
                System.arraycopy(iArr10, i39, iArr15, i38, i42);
                System.arraycopy(iArr8, i39, iArr16, i38, i42);
            }
            i12 = i41;
            while (i39 < i40) {
                long[] jArr16 = jArr5;
                int[] iArr17 = iArr10;
                long a11 = u82.a(j16, 1000000L, k52Var.f28064d);
                long j18 = jArr6[i39] - j17;
                long[] jArr17 = jArr6;
                int[] iArr18 = iArr8;
                long j19 = j4;
                jArr15[i38] = a11 + u82.a(Math.max(j19, j18), 1000000L, k52Var.f28063c);
                if (z9 && iArr15[i38] > i12) {
                    i12 = iArr17[i39];
                }
                i38++;
                i39++;
                j4 = j19;
                jArr5 = jArr16;
                iArr8 = iArr18;
                jArr6 = jArr17;
                iArr10 = iArr17;
            }
            j16 += k52Var.f28068h[i37];
            i37++;
            z8 = z9;
            jArr5 = jArr5;
            iArr8 = iArr8;
            jArr6 = jArr6;
            iArr10 = iArr10;
        }
        return new q52(k52Var, jArr14, iArr15, i12, jArr15, iArr16, u82.a(j16, 1000000L, k52Var.f28064d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:314:0x0948, code lost:
    
        r71 = r0;
        r66 = r1;
        r62 = r2;
        r65 = r3;
        r59 = r5;
        r64 = r12;
        r63 = r14;
        r11 = r18;
        r14 = r24;
        r12 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0cd9, code lost:
    
        if (r10 != null) goto L637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0cdb, code lost:
    
        r2 = r50;
        r38 = r56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0ce2, code lost:
    
        r2 = r50;
        r0 = new com.yandex.mobile.ads.impl.yb0.a().g(r4).e(r10).a(r7).o(r71).f(r66).b(r65).k(r2).a(r64).n(r63).a(r62).a(r60);
        r3 = r57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0d26, code lost:
    
        if (r3 != (-1)) goto L644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0d28, code lost:
    
        r5 = r55;
        r7 = r54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0d2c, code lost:
    
        if (r5 != (-1)) goto L645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0d2e, code lost:
    
        if (r7 != (-1)) goto L645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0d30, code lost:
    
        if (r21 == null) goto L650;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0d47, code lost:
    
        if (r23 == null) goto L652;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0d49, code lost:
    
        r0.b(com.yandex.mobile.ads.impl.pp0.b(r23.f35113c)).j(com.yandex.mobile.ads.impl.pp0.b(r23.f35114d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0d60, code lost:
    
        r35 = r0.a();
        r38 = r56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0d39, code lost:
    
        if (r21 == null) goto L648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0d3b, code lost:
    
        r10 = r21.array();
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0d41, code lost:
    
        r0.a(new com.yandex.mobile.ads.impl.eq(r3, r5, r7, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0d40, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0d33, code lost:
    
        r7 = r54;
        r5 = r55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f9, code lost:
    
        if (r14 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fb, code lost:
    
        r14 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:469:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0827 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x0dac  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x0e30  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0e24  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList a(AbstractC2346xg.a aVar, xd0 xd0Var, long j4, u30 u30Var, boolean z4, boolean z5, ud0 ud0Var) {
        long j5;
        int i4;
        int i5;
        int h4;
        int i6;
        yb0 yb0Var;
        ArrayList arrayList;
        int i7;
        int i8;
        int i9;
        k52 k52Var;
        int i10;
        long[] jArr;
        long[] jArr2;
        Pair create;
        int i11;
        int i12;
        int i13;
        Pair pair;
        ArrayList arrayList2;
        AbstractC2346xg.a aVar2;
        long j6;
        boolean z6;
        int i14;
        int i15;
        String str;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        u30 u30Var2;
        String str2;
        u30 u30Var3;
        int i22;
        int i23;
        List<byte[]> list;
        float f4;
        int i24;
        byte[] bArr;
        int i25;
        int i26;
        int i27;
        int i28;
        List<byte[]> list2;
        int i29;
        String str3;
        String str4;
        int i30;
        int z7;
        int i31;
        int i32;
        u30 u30Var4;
        String str5;
        String str6;
        int i33;
        int i34;
        yb0 yb0Var2;
        List<byte[]> list3;
        int i35;
        int d4;
        yb0 a4;
        yb0 b4;
        int i36;
        u30 a5;
        String str7;
        long j7;
        sj0 sj0Var;
        int i37;
        ArrayList arrayList3;
        AbstractC2346xg.a aVar3 = aVar;
        u30 u30Var5 = u30Var;
        int i38 = 5;
        int i39 = 1835297121;
        int i40 = 1;
        int i41 = 16;
        int i42 = 8;
        ArrayList arrayList4 = new ArrayList();
        int i43 = 0;
        while (i43 < aVar3.f34555d.size()) {
            AbstractC2346xg.a aVar4 = (AbstractC2346xg.a) aVar3.f34555d.get(i43);
            if (aVar4.f34552a != 1953653099) {
                i37 = i39;
                i9 = i41;
                i10 = i42;
                arrayList3 = arrayList4;
                i7 = i43;
                i8 = i38;
            } else {
                AbstractC2346xg.b c4 = aVar3.c(1836476516);
                c4.getClass();
                AbstractC2346xg.a b5 = aVar4.b(i39);
                b5.getClass();
                AbstractC2346xg.b c5 = b5.c(1751411826);
                c5.getClass();
                sf1 sf1Var = c5.f34556b;
                sf1Var.e(i41);
                int h5 = sf1Var.h();
                int i44 = 3;
                int i45 = h5 == 1936684398 ? i40 : h5 == 1986618469 ? 2 : (h5 == 1952807028 || h5 == 1935832172 || h5 == 1937072756 || h5 == 1668047728) ? 3 : h5 == 1835365473 ? i38 : -1;
                if (i45 == -1) {
                    i9 = i41;
                    i10 = i42;
                    arrayList = arrayList4;
                    i7 = i43;
                    i8 = i38;
                    k52Var = null;
                } else {
                    AbstractC2346xg.b c6 = aVar4.c(1953196132);
                    c6.getClass();
                    sf1 sf1Var2 = c6.f34556b;
                    sf1Var2.e(i42);
                    int h6 = (sf1Var2.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                    sf1Var2.f(h6 == 0 ? i42 : i41);
                    int h7 = sf1Var2.h();
                    sf1Var2.f(4);
                    int d5 = sf1Var2.d();
                    int i46 = h6 == 0 ? 4 : i42;
                    int i47 = 0;
                    while (true) {
                        if (i47 < i46) {
                            if (sf1Var2.c()[d5 + i47] != -1) {
                                j5 = h6 == 0 ? sf1Var2.v() : sf1Var2.y();
                            } else {
                                i47++;
                            }
                        } else {
                            sf1Var2.f(i46);
                            break;
                        }
                    }
                    sf1Var2.f(i41);
                    int h8 = sf1Var2.h();
                    int h9 = sf1Var2.h();
                    sf1Var2.f(4);
                    int h10 = sf1Var2.h();
                    int h11 = sf1Var2.h();
                    int i48 = i41;
                    if (h8 == 0 && h9 == 65536) {
                        i4 = -65536;
                        if (h10 == -65536 && h11 == 0) {
                            i5 = 90;
                            long j8 = j4 == -9223372036854775807L ? j5 : j4;
                            sf1 sf1Var3 = c4.f34556b;
                            sf1Var3.e(8);
                            sf1Var3.f(((sf1Var3.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) == 0 ? 8 : i48);
                            long v4 = sf1Var3.v();
                            long a6 = j8 != -9223372036854775807L ? u82.a(j8, 1000000L, v4) : -9223372036854775807L;
                            AbstractC2346xg.a b6 = b5.b(1835626086);
                            b6.getClass();
                            AbstractC2346xg.a b7 = b6.b(1937007212);
                            b7.getClass();
                            AbstractC2346xg.b c7 = b5.c(1835296868);
                            c7.getClass();
                            sf1 sf1Var4 = c7.f34556b;
                            sf1Var4.e(8);
                            int h12 = (sf1Var4.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                            sf1Var4.f(h12 == 0 ? 8 : i48);
                            long v5 = sf1Var4.v();
                            sf1Var4.f(h12 == 0 ? 4 : 8);
                            int z8 = sf1Var4.z();
                            Pair create2 = Pair.create(Long.valueOf(v5), "" + ((char) (((z8 >> 10) & 31) + 96)) + ((char) (((z8 >> 5) & 31) + 96)) + ((char) ((z8 & 31) + 96)));
                            AbstractC2346xg.b c8 = b7.c(1937011556);
                            c8.getClass();
                            sf1 sf1Var5 = c8.f34556b;
                            String str8 = (String) create2.second;
                            sf1Var5.e(12);
                            h4 = sf1Var5.h();
                            l52[] l52VarArr = new l52[h4];
                            long j9 = v4;
                            i6 = 0;
                            yb0Var = null;
                            int i49 = 0;
                            int i50 = 0;
                            while (i6 < h4) {
                                int d6 = sf1Var5.d();
                                int i51 = i45;
                                int h13 = sf1Var5.h();
                                int i52 = i43;
                                if ((h13 > 0 ? i40 : 0) != 0) {
                                    int i53 = h4;
                                    int h14 = sf1Var5.h();
                                    l52[] l52VarArr2 = l52VarArr;
                                    int i54 = i6;
                                    if (h14 == 1635148593 || h14 == 1635148595 || h14 == 1701733238 || h14 == 1831958048 || h14 == 1836070006 || h14 == 1752589105 || h14 == 1751479857 || h14 == 1932670515 || h14 == 1211250227 || h14 == 1987063864 || h14 == 1987063865 || h14 == 1635135537 || h14 == 1685479798 || h14 == 1685479729 || h14 == 1685481573) {
                                        i11 = d6;
                                        i12 = i5;
                                        i13 = h13;
                                        pair = create2;
                                        arrayList2 = arrayList4;
                                        aVar2 = aVar4;
                                        j6 = j9;
                                        z6 = false;
                                        i14 = 16;
                                    } else if (h14 == 1685481521) {
                                        i11 = d6;
                                        i12 = i5;
                                        i13 = h13;
                                        pair = create2;
                                        arrayList2 = arrayList4;
                                        aVar2 = aVar4;
                                        j6 = j9;
                                        i14 = i48;
                                        z6 = false;
                                    } else {
                                        if (h14 == 1836069985 || h14 == 1701733217 || h14 == 1633889587 || h14 == 1700998451 || h14 == 1633889588 || h14 == 1835823201 || h14 == 1685353315 || h14 == 1685353317 || h14 == 1685353320 || h14 == 1685353324 || h14 == 1685353336 || h14 == 1935764850 || h14 == 1935767394 || h14 == 1819304813 || h14 == 1936684916 || h14 == 1953984371 || h14 == 778924082 || h14 == 778924083 || h14 == 1835557169 || h14 == 1835560241 || h14 == 1634492771 || h14 == 1634492791 || h14 == 1970037111 || h14 == 1332770163 || h14 == 1716281667) {
                                            j6 = j9;
                                            sf1Var5.e(d6 + 16);
                                            if (z5) {
                                                i30 = sf1Var5.z();
                                                sf1Var5.f(6);
                                            } else {
                                                sf1Var5.f(8);
                                                i30 = 0;
                                            }
                                            if (i30 == 0 || i30 == i40) {
                                                z7 = sf1Var5.z();
                                                sf1Var5.f(6);
                                                int u4 = sf1Var5.u();
                                                sf1Var5.e(sf1Var5.d() - 4);
                                                int h15 = sf1Var5.h();
                                                if (i30 == 1) {
                                                    sf1Var5.f(16);
                                                }
                                                i31 = u4;
                                                i32 = h15;
                                            } else if (i30 == 2) {
                                                sf1Var5.f(i48);
                                                i31 = (int) Math.round(Double.longBitsToDouble(sf1Var5.p()));
                                                z7 = sf1Var5.x();
                                                sf1Var5.f(20);
                                                i32 = 0;
                                            }
                                            int d7 = sf1Var5.d();
                                            int i55 = i31;
                                            if (h14 == 1701733217) {
                                                Pair a7 = a(d6, h13, sf1Var5);
                                                if (a7 != null) {
                                                    int intValue = ((Integer) a7.first).intValue();
                                                    if (u30Var5 == null) {
                                                        i36 = intValue;
                                                        a5 = null;
                                                    } else {
                                                        i36 = intValue;
                                                        a5 = u30Var5.a(((l52) a7.second).f28427b);
                                                    }
                                                    l52VarArr2[i54] = (l52) a7.second;
                                                    u30Var4 = a5;
                                                    h14 = i36;
                                                } else {
                                                    u30Var4 = u30Var5;
                                                }
                                                sf1Var5.e(d7);
                                            } else {
                                                u30Var4 = u30Var5;
                                            }
                                            int i56 = z7;
                                            if (h14 == 1633889587) {
                                                str5 = "audio/ac3";
                                            } else if (h14 == 1700998451) {
                                                str5 = "audio/eac3";
                                            } else if (h14 == 1633889588) {
                                                str5 = "audio/ac4";
                                            } else if (h14 == 1685353315) {
                                                str5 = "audio/vnd.dts";
                                            } else {
                                                if (h14 == 1685353320 || h14 == 1685353324) {
                                                    str5 = "audio/vnd.dts.hd";
                                                } else if (h14 == 1685353317) {
                                                    str5 = "audio/vnd.dts.hd;profile=lbr";
                                                } else if (h14 == 1685353336) {
                                                    str5 = "audio/vnd.dts.uhd;profile=p2";
                                                } else if (h14 == 1935764850) {
                                                    str5 = "audio/3gpp";
                                                } else if (h14 == 1935767394) {
                                                    str5 = "audio/amr-wb";
                                                } else {
                                                    if (h14 == 1819304813 || h14 == 1936684916) {
                                                        str6 = "audio/raw";
                                                        i33 = 2;
                                                    } else if (h14 == 1953984371) {
                                                        str6 = "audio/raw";
                                                        i33 = 268435456;
                                                    } else if (h14 == 778924082 || h14 == 778924083) {
                                                        str5 = "audio/mpeg";
                                                    } else if (h14 == 1835557169) {
                                                        str5 = "audio/mha1";
                                                    } else if (h14 == 1835560241) {
                                                        str5 = "audio/mhm1";
                                                    } else if (h14 == 1634492771) {
                                                        str5 = "audio/alac";
                                                    } else if (h14 == 1634492791) {
                                                        str5 = "audio/g711-alaw";
                                                    } else if (h14 == 1970037111) {
                                                        str5 = "audio/g711-mlaw";
                                                    } else if (h14 == 1332770163) {
                                                        str5 = "audio/opus";
                                                    } else if (h14 == 1716281667) {
                                                        str5 = "audio/flac";
                                                    } else if (h14 == 1835823201) {
                                                        str5 = "audio/true-hd";
                                                    } else {
                                                        i33 = -1;
                                                        str6 = null;
                                                    }
                                                    int i57 = i5;
                                                    pair = create2;
                                                    aVar2 = aVar4;
                                                    i34 = d7;
                                                    int i58 = i56;
                                                    int i59 = i55;
                                                    List<byte[]> list4 = null;
                                                    String str9 = null;
                                                    arrayList2 = arrayList4;
                                                    String str10 = str6;
                                                    yb0Var2 = yb0Var;
                                                    b bVar = null;
                                                    while (i34 - d6 < h13) {
                                                        sf1Var5.e(i34);
                                                        int h16 = sf1Var5.h();
                                                        if (h16 > 0) {
                                                            int i60 = d6;
                                                            int h17 = sf1Var5.h();
                                                            int i61 = h13;
                                                            if (h17 == 1835557187) {
                                                                int i62 = h16 - 13;
                                                                byte[] bArr2 = new byte[i62];
                                                                sf1Var5.e(i34 + 13);
                                                                sf1Var5.a(bArr2, 0, i62);
                                                                list4 = sj0.a(bArr2);
                                                            } else {
                                                                int i63 = 1702061171;
                                                                if (h17 != 1702061171) {
                                                                    if (z5 && h17 == 2002876005) {
                                                                        i63 = 1702061171;
                                                                    } else {
                                                                        if (h17 == 1684103987) {
                                                                            sf1Var5.e(i34 + 8);
                                                                            b4 = C2146p.a(sf1Var5, Integer.toString(h7), str8, u30Var4);
                                                                        } else if (h17 == 1684366131) {
                                                                            sf1Var5.e(i34 + 8);
                                                                            b4 = C2146p.b(sf1Var5, Integer.toString(h7), str8, u30Var4);
                                                                        } else {
                                                                            if (h17 == 1684103988) {
                                                                                sf1Var5.e(i34 + 8);
                                                                                String num = Integer.toString(h7);
                                                                                sf1Var5.f(1);
                                                                                list3 = list4;
                                                                                a4 = new yb0.a().b(num).e("audio/ac4").c(2).l(((sf1Var5.t() & 32) >> 5) == 1 ? 48000 : 44100).a(u30Var4).d(str8).a();
                                                                            } else {
                                                                                list3 = list4;
                                                                                if (h17 == 1684892784) {
                                                                                    if (i32 <= 0) {
                                                                                        throw wf1.a("Invalid sample rate for Dolby TrueHD MLP stream: " + i32, (Exception) null);
                                                                                    }
                                                                                    i59 = i32;
                                                                                    i35 = i59;
                                                                                    list4 = list3;
                                                                                    i58 = 2;
                                                                                } else if (h17 == 1684305011) {
                                                                                    a4 = new yb0.a().g(h7).e(str10).c(i58).l(i59).a(u30Var4).d(str8).a();
                                                                                } else if (h17 == 1682927731) {
                                                                                    int i64 = h16 - 8;
                                                                                    byte[] bArr3 = f35100a;
                                                                                    byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i64);
                                                                                    i35 = i32;
                                                                                    sf1Var5.e(i34 + 8);
                                                                                    sf1Var5.a(copyOf, bArr3.length, i64);
                                                                                    list4 = af1.a(copyOf);
                                                                                } else {
                                                                                    i35 = i32;
                                                                                    if (h17 == 1684425825) {
                                                                                        byte[] bArr4 = new byte[h16 - 8];
                                                                                        bArr4[0] = 102;
                                                                                        bArr4[1] = 76;
                                                                                        bArr4[2] = 97;
                                                                                        bArr4[i44] = 67;
                                                                                        sf1Var5.e(i34 + 12);
                                                                                        sf1Var5.a(bArr4, 4, h16 - 12);
                                                                                        list4 = sj0.a(bArr4);
                                                                                    } else {
                                                                                        if (h17 == 1634492771) {
                                                                                            int i65 = h16 - 12;
                                                                                            byte[] bArr5 = new byte[i65];
                                                                                            sf1Var5.e(i34 + 12);
                                                                                            sf1Var5.a(bArr5, 0, i65);
                                                                                            sf1 sf1Var6 = new sf1(bArr5);
                                                                                            sf1Var6.e(9);
                                                                                            int t4 = sf1Var6.t();
                                                                                            sf1Var6.e(20);
                                                                                            Pair create3 = Pair.create(Integer.valueOf(sf1Var6.x()), Integer.valueOf(t4));
                                                                                            int intValue2 = ((Integer) create3.first).intValue();
                                                                                            int intValue3 = ((Integer) create3.second).intValue();
                                                                                            list4 = sj0.a(bArr5);
                                                                                            i59 = intValue2;
                                                                                            i58 = intValue3;
                                                                                        }
                                                                                        list4 = list3;
                                                                                    }
                                                                                    i34 += h16;
                                                                                    d6 = i60;
                                                                                    h13 = i61;
                                                                                    i32 = i35;
                                                                                }
                                                                                i34 += h16;
                                                                                d6 = i60;
                                                                                h13 = i61;
                                                                                i32 = i35;
                                                                            }
                                                                            yb0Var2 = a4;
                                                                            i35 = i32;
                                                                            list4 = list3;
                                                                            i34 += h16;
                                                                            d6 = i60;
                                                                            h13 = i61;
                                                                            i32 = i35;
                                                                        }
                                                                        yb0Var2 = b4;
                                                                    }
                                                                }
                                                                list3 = list4;
                                                                i35 = i32;
                                                                if (h17 == i63) {
                                                                    d4 = i34;
                                                                } else {
                                                                    d4 = sf1Var5.d();
                                                                    if (!(d4 >= i34)) {
                                                                        throw wf1.a((String) null, (Exception) null);
                                                                    }
                                                                    while (true) {
                                                                        if (d4 - i34 >= h16) {
                                                                            d4 = -1;
                                                                            break;
                                                                        }
                                                                        sf1Var5.e(d4);
                                                                        int h18 = sf1Var5.h();
                                                                        if (h18 > 0) {
                                                                            if (sf1Var5.h() == 1702061171) {
                                                                                break;
                                                                            }
                                                                            d4 += h18;
                                                                        } else {
                                                                            throw wf1.a("childAtomSize must be positive", (Exception) null);
                                                                        }
                                                                    }
                                                                }
                                                                if (d4 != -1) {
                                                                    b a8 = a(d4, sf1Var5);
                                                                    String str11 = a8.f35111a;
                                                                    byte[] bArr6 = a8.f35112b;
                                                                    if (bArr6 != null) {
                                                                        if ("audio/mp4a-latm".equals(str11)) {
                                                                            C1790a.C0181a a9 = C1790a.a(new rf1(bArr6.length, bArr6), false);
                                                                            i59 = a9.f23102a;
                                                                            int i66 = a9.f23103b;
                                                                            str9 = a9.f23104c;
                                                                            i58 = i66;
                                                                        }
                                                                        bVar = a8;
                                                                        str10 = str11;
                                                                        list4 = sj0.a(bArr6);
                                                                        i34 += h16;
                                                                        d6 = i60;
                                                                        h13 = i61;
                                                                        i32 = i35;
                                                                    } else {
                                                                        bVar = a8;
                                                                        str10 = str11;
                                                                        list4 = list3;
                                                                        i34 += h16;
                                                                        d6 = i60;
                                                                        h13 = i61;
                                                                        i32 = i35;
                                                                    }
                                                                }
                                                                list4 = list3;
                                                                i34 += h16;
                                                                d6 = i60;
                                                                h13 = i61;
                                                                i32 = i35;
                                                            }
                                                            i35 = i32;
                                                            i34 += h16;
                                                            d6 = i60;
                                                            h13 = i61;
                                                            i32 = i35;
                                                        } else {
                                                            throw wf1.a("childAtomSize must be positive", (Exception) null);
                                                        }
                                                    }
                                                    int i67 = d6;
                                                    List<byte[]> list5 = list4;
                                                    int i68 = h13;
                                                    if (yb0Var2 == null || str10 == null) {
                                                        str = str8;
                                                        i19 = i38;
                                                        i17 = i44;
                                                        yb0Var = yb0Var2;
                                                    } else {
                                                        yb0.a d8 = new yb0.a().g(h7).e(str10).a(str9).c(i58).l(i59).i(i33).a(list5).a(u30Var4).d(str8);
                                                        if (bVar != null) {
                                                            d8.b(pp0.b(bVar.f35113c)).j(pp0.b(bVar.f35114d));
                                                        }
                                                        yb0Var = d8.a();
                                                        str = str8;
                                                        i19 = i38;
                                                        i17 = i44;
                                                    }
                                                    i5 = i57;
                                                    i16 = i67;
                                                    i15 = i68;
                                                    i18 = 16;
                                                    sf1Var5.e(i16 + i15);
                                                    i6 = i54 + 1;
                                                    u30Var5 = u30Var;
                                                    i38 = i19;
                                                    i48 = i18;
                                                    i44 = i17;
                                                    arrayList4 = arrayList2;
                                                    i45 = i51;
                                                    h4 = i53;
                                                    l52VarArr = l52VarArr2;
                                                    i43 = i52;
                                                    j9 = j6;
                                                    create2 = pair;
                                                    aVar4 = aVar2;
                                                    str8 = str;
                                                    i40 = 1;
                                                }
                                                str6 = str5;
                                                i33 = -1;
                                                int i572 = i5;
                                                pair = create2;
                                                aVar2 = aVar4;
                                                i34 = d7;
                                                int i582 = i56;
                                                int i592 = i55;
                                                List<byte[]> list42 = null;
                                                String str92 = null;
                                                arrayList2 = arrayList4;
                                                String str102 = str6;
                                                yb0Var2 = yb0Var;
                                                b bVar2 = null;
                                                while (i34 - d6 < h13) {
                                                }
                                                int i672 = d6;
                                                List<byte[]> list52 = list42;
                                                int i682 = h13;
                                                if (yb0Var2 == null) {
                                                }
                                                str = str8;
                                                i19 = i38;
                                                i17 = i44;
                                                yb0Var = yb0Var2;
                                                i5 = i572;
                                                i16 = i672;
                                                i15 = i682;
                                                i18 = 16;
                                                sf1Var5.e(i16 + i15);
                                                i6 = i54 + 1;
                                                u30Var5 = u30Var;
                                                i38 = i19;
                                                i48 = i18;
                                                i44 = i17;
                                                arrayList4 = arrayList2;
                                                i45 = i51;
                                                h4 = i53;
                                                l52VarArr = l52VarArr2;
                                                i43 = i52;
                                                j9 = j6;
                                                create2 = pair;
                                                aVar4 = aVar2;
                                                str8 = str;
                                                i40 = 1;
                                            }
                                            str6 = str5;
                                            i33 = -1;
                                            int i5722 = i5;
                                            pair = create2;
                                            aVar2 = aVar4;
                                            i34 = d7;
                                            int i5822 = i56;
                                            int i5922 = i55;
                                            List<byte[]> list422 = null;
                                            String str922 = null;
                                            arrayList2 = arrayList4;
                                            String str1022 = str6;
                                            yb0Var2 = yb0Var;
                                            b bVar22 = null;
                                            while (i34 - d6 < h13) {
                                            }
                                            int i6722 = d6;
                                            List<byte[]> list522 = list422;
                                            int i6822 = h13;
                                            if (yb0Var2 == null) {
                                            }
                                            str = str8;
                                            i19 = i38;
                                            i17 = i44;
                                            yb0Var = yb0Var2;
                                            i5 = i5722;
                                            i16 = i6722;
                                            i15 = i6822;
                                            i18 = 16;
                                            sf1Var5.e(i16 + i15);
                                            i6 = i54 + 1;
                                            u30Var5 = u30Var;
                                            i38 = i19;
                                            i48 = i18;
                                            i44 = i17;
                                            arrayList4 = arrayList2;
                                            i45 = i51;
                                            h4 = i53;
                                            l52VarArr = l52VarArr2;
                                            i43 = i52;
                                            j9 = j6;
                                            create2 = pair;
                                            aVar4 = aVar2;
                                            str8 = str;
                                            i40 = 1;
                                        } else {
                                            if (h14 == 1414810956 || h14 == 1954034535 || h14 == 2004251764 || h14 == 1937010800 || h14 == 1664495672) {
                                                sf1Var5.e(d6 + 16);
                                                if (h14 == 1414810956) {
                                                    str7 = "application/ttml+xml";
                                                } else if (h14 == 1954034535) {
                                                    int i69 = h13 - 16;
                                                    byte[] bArr7 = new byte[i69];
                                                    sf1Var5.a(bArr7, 0, i69);
                                                    sj0Var = sj0.a(bArr7);
                                                    str7 = "application/x-quicktime-tx3g";
                                                    j6 = j9;
                                                    j7 = Long.MAX_VALUE;
                                                    yb0Var = new yb0.a().g(h7).e(str7).d(str8).a(j7).a(sj0Var).a();
                                                    i16 = d6;
                                                    i15 = h13;
                                                    pair = create2;
                                                    arrayList2 = arrayList4;
                                                    aVar2 = aVar4;
                                                    str = str8;
                                                } else if (h14 == 2004251764) {
                                                    str7 = "application/x-mp4-vtt";
                                                } else if (h14 == 1937010800) {
                                                    str7 = "application/ttml+xml";
                                                    j6 = j9;
                                                    j7 = 0;
                                                    sj0Var = null;
                                                    yb0Var = new yb0.a().g(h7).e(str7).d(str8).a(j7).a(sj0Var).a();
                                                    i16 = d6;
                                                    i15 = h13;
                                                    pair = create2;
                                                    arrayList2 = arrayList4;
                                                    aVar2 = aVar4;
                                                    str = str8;
                                                } else if (h14 == 1664495672) {
                                                    str7 = "application/x-mp4-cea-608";
                                                    j6 = j9;
                                                    i49 = i40;
                                                    sj0Var = null;
                                                    j7 = Long.MAX_VALUE;
                                                    yb0Var = new yb0.a().g(h7).e(str7).d(str8).a(j7).a(sj0Var).a();
                                                    i16 = d6;
                                                    i15 = h13;
                                                    pair = create2;
                                                    arrayList2 = arrayList4;
                                                    aVar2 = aVar4;
                                                    str = str8;
                                                } else {
                                                    throw new IllegalStateException();
                                                }
                                                j6 = j9;
                                                sj0Var = null;
                                                j7 = Long.MAX_VALUE;
                                                yb0Var = new yb0.a().g(h7).e(str7).d(str8).a(j7).a(sj0Var).a();
                                                i16 = d6;
                                                i15 = h13;
                                                pair = create2;
                                                arrayList2 = arrayList4;
                                                aVar2 = aVar4;
                                                str = str8;
                                            } else {
                                                if (h14 == 1835365492) {
                                                    sf1Var5.e(d6 + 16);
                                                    if (h14 == 1835365492) {
                                                        sf1Var5.q();
                                                        String q4 = sf1Var5.q();
                                                        if (q4 != null) {
                                                            yb0Var = new yb0.a().g(h7).e(q4).a();
                                                            i16 = d6;
                                                            i15 = h13;
                                                            pair = create2;
                                                            arrayList2 = arrayList4;
                                                            aVar2 = aVar4;
                                                            str = str8;
                                                            j6 = j9;
                                                        }
                                                    }
                                                    j6 = j9;
                                                } else {
                                                    if (h14 == 1667329389) {
                                                        yb0Var = new yb0.a().g(h7).e("application/x-camera-motion").a();
                                                        i16 = d6;
                                                        i15 = h13;
                                                        pair = create2;
                                                        arrayList2 = arrayList4;
                                                        aVar2 = aVar4;
                                                        str = str8;
                                                        j6 = j9;
                                                    }
                                                    j6 = j9;
                                                }
                                                sf1Var5.e(i16 + i15);
                                                i6 = i54 + 1;
                                                u30Var5 = u30Var;
                                                i38 = i19;
                                                i48 = i18;
                                                i44 = i17;
                                                arrayList4 = arrayList2;
                                                i45 = i51;
                                                h4 = i53;
                                                l52VarArr = l52VarArr2;
                                                i43 = i52;
                                                j9 = j6;
                                                create2 = pair;
                                                aVar4 = aVar2;
                                                str8 = str;
                                                i40 = 1;
                                            }
                                            i19 = i38;
                                            i17 = i44;
                                            i18 = i48;
                                            sf1Var5.e(i16 + i15);
                                            i6 = i54 + 1;
                                            u30Var5 = u30Var;
                                            i38 = i19;
                                            i48 = i18;
                                            i44 = i17;
                                            arrayList4 = arrayList2;
                                            i45 = i51;
                                            h4 = i53;
                                            l52VarArr = l52VarArr2;
                                            i43 = i52;
                                            j9 = j6;
                                            create2 = pair;
                                            aVar4 = aVar2;
                                            str8 = str;
                                            i40 = 1;
                                        }
                                        i16 = d6;
                                        i15 = h13;
                                        pair = create2;
                                        arrayList2 = arrayList4;
                                        aVar2 = aVar4;
                                        str = str8;
                                        i19 = i38;
                                        i17 = i44;
                                        i18 = 16;
                                        sf1Var5.e(i16 + i15);
                                        i6 = i54 + 1;
                                        u30Var5 = u30Var;
                                        i38 = i19;
                                        i48 = i18;
                                        i44 = i17;
                                        arrayList4 = arrayList2;
                                        i45 = i51;
                                        h4 = i53;
                                        l52VarArr = l52VarArr2;
                                        i43 = i52;
                                        j9 = j6;
                                        create2 = pair;
                                        aVar4 = aVar2;
                                        str8 = str;
                                        i40 = 1;
                                    }
                                    sf1Var5.e(i11 + 16);
                                    sf1Var5.f(i14);
                                    int z9 = sf1Var5.z();
                                    int z10 = sf1Var5.z();
                                    sf1Var5.f(50);
                                    int d9 = sf1Var5.d();
                                    if (h14 == 1701733238) {
                                        i20 = i11;
                                        i21 = i13;
                                        Pair a10 = a(i20, i21, sf1Var5);
                                        if (a10 != null) {
                                            h14 = ((Integer) a10.first).intValue();
                                            u30Var2 = u30Var == null ? null : u30Var.a(((l52) a10.second).f28427b);
                                            l52VarArr2[i54] = (l52) a10.second;
                                        } else {
                                            u30Var2 = u30Var;
                                        }
                                        sf1Var5.e(d9);
                                    } else {
                                        i20 = i11;
                                        i21 = i13;
                                        u30Var2 = u30Var;
                                    }
                                    if (h14 == 1831958048) {
                                        str2 = "video/mpeg";
                                    } else {
                                        str2 = h14 == 1211250227 ? "video/3gpp" : null;
                                    }
                                    i16 = i20;
                                    str = str8;
                                    String str12 = str2;
                                    float f5 = 1.0f;
                                    int i70 = i50;
                                    String str13 = null;
                                    byte[] bArr8 = null;
                                    int i71 = -1;
                                    ByteBuffer byteBuffer = null;
                                    b bVar3 = null;
                                    int i72 = -1;
                                    int i73 = -1;
                                    int i74 = -1;
                                    boolean z11 = z6;
                                    int i75 = d9;
                                    List<byte[]> list6 = null;
                                    while (true) {
                                        if (i75 - i16 >= i21) {
                                            u30Var3 = u30Var2;
                                            break;
                                        }
                                        sf1Var5.e(i75);
                                        int d10 = sf1Var5.d();
                                        int i76 = i75;
                                        int h19 = sf1Var5.h();
                                        if (h19 == 0) {
                                            u30Var3 = u30Var2;
                                            if (sf1Var5.d() - i16 == i21) {
                                                break;
                                            }
                                        } else {
                                            u30Var3 = u30Var2;
                                        }
                                        if (h19 > 0) {
                                            int h20 = sf1Var5.h();
                                            int i77 = i21;
                                            if (h20 == 1635148611) {
                                                if (str12 == null) {
                                                    sf1Var5.e(d10 + 8);
                                                    C2278uh a11 = C2278uh.a(sf1Var5);
                                                    list2 = a11.f33124a;
                                                    i29 = a11.f33125b;
                                                    if (!z11) {
                                                        f5 = a11.f33128e;
                                                    }
                                                    str3 = a11.f33129f;
                                                    str4 = "video/avc";
                                                } else {
                                                    throw wf1.a((String) null, (Exception) null);
                                                }
                                            } else if (h20 != 1752589123) {
                                                if (h20 == 1685480259 || h20 == 1685485123) {
                                                    i22 = z9;
                                                    i23 = z10;
                                                    list = list6;
                                                    f4 = f5;
                                                    i24 = h14;
                                                    bArr = bArr8;
                                                    i25 = i71;
                                                    i26 = i38;
                                                    i27 = i44;
                                                    i30 a12 = i30.a(sf1Var5);
                                                    if (a12 != null) {
                                                        str13 = a12.f27079a;
                                                        str12 = "video/dolby-vision";
                                                    }
                                                } else {
                                                    if (h20 == 1987076931) {
                                                        if (str12 == null) {
                                                            i22 = z9;
                                                            i23 = z10;
                                                            f4 = f5;
                                                            str12 = h14 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                        } else {
                                                            throw wf1.a((String) null, (Exception) null);
                                                        }
                                                    } else if (h20 == 1635135811) {
                                                        if (str12 == null) {
                                                            i22 = z9;
                                                            i23 = z10;
                                                            f4 = f5;
                                                            str12 = "video/av01";
                                                        } else {
                                                            throw wf1.a((String) null, (Exception) null);
                                                        }
                                                    } else if (h20 == 1668050025) {
                                                        if (byteBuffer == null) {
                                                            byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                        }
                                                        ByteBuffer byteBuffer2 = byteBuffer;
                                                        byteBuffer2.position(21);
                                                        byteBuffer2.putShort(sf1Var5.r());
                                                        byteBuffer2.putShort(sf1Var5.r());
                                                        i22 = z9;
                                                        i23 = z10;
                                                        f4 = f5;
                                                        byteBuffer = byteBuffer2;
                                                    } else {
                                                        if (h20 == 1835295606) {
                                                            if (byteBuffer == null) {
                                                                byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                            }
                                                            ByteBuffer byteBuffer3 = byteBuffer;
                                                            short r4 = sf1Var5.r();
                                                            short r5 = sf1Var5.r();
                                                            i24 = h14;
                                                            short r6 = sf1Var5.r();
                                                            list = list6;
                                                            short r7 = sf1Var5.r();
                                                            i25 = i71;
                                                            short r8 = sf1Var5.r();
                                                            bArr = bArr8;
                                                            short r9 = sf1Var5.r();
                                                            f4 = f5;
                                                            short r10 = sf1Var5.r();
                                                            i23 = z10;
                                                            short r11 = sf1Var5.r();
                                                            long v6 = sf1Var5.v();
                                                            long v7 = sf1Var5.v();
                                                            i22 = z9;
                                                            byteBuffer3.position(1);
                                                            byteBuffer3.putShort(r8);
                                                            byteBuffer3.putShort(r9);
                                                            byteBuffer3.putShort(r4);
                                                            byteBuffer3.putShort(r5);
                                                            byteBuffer3.putShort(r6);
                                                            byteBuffer3.putShort(r7);
                                                            byteBuffer3.putShort(r10);
                                                            byteBuffer3.putShort(r11);
                                                            byteBuffer3.putShort((short) (v6 / 10000));
                                                            byteBuffer3.putShort((short) (v7 / 10000));
                                                            byteBuffer = byteBuffer3;
                                                        } else {
                                                            i22 = z9;
                                                            i23 = z10;
                                                            list = list6;
                                                            f4 = f5;
                                                            i24 = h14;
                                                            bArr = bArr8;
                                                            i25 = i71;
                                                            if (h20 != 1681012275) {
                                                                if (h20 != 1702061171) {
                                                                    if (h20 == 1885434736) {
                                                                        sf1Var5.e(d10 + 8);
                                                                        f4 = sf1Var5.x() / sf1Var5.x();
                                                                        i26 = i38;
                                                                        i27 = i44;
                                                                        list6 = list;
                                                                        z11 = true;
                                                                    } else if (h20 == 1937126244) {
                                                                        int i78 = d10 + 8;
                                                                        while (i78 - d10 < h19) {
                                                                            sf1Var5.e(i78);
                                                                            int h21 = sf1Var5.h();
                                                                            if (sf1Var5.h() == 1886547818) {
                                                                                bArr = Arrays.copyOfRange(sf1Var5.c(), i78, h21 + i78);
                                                                                i26 = i38;
                                                                                i27 = i44;
                                                                                list6 = list;
                                                                            } else {
                                                                                i78 += h21;
                                                                            }
                                                                        }
                                                                        i26 = i38;
                                                                        i27 = i44;
                                                                        list6 = list;
                                                                        bArr = null;
                                                                    } else {
                                                                        if (h20 == 1936995172) {
                                                                            int t5 = sf1Var5.t();
                                                                            i27 = i44;
                                                                            sf1Var5.f(i27);
                                                                            if (t5 == 0) {
                                                                                int t6 = sf1Var5.t();
                                                                                if (t6 == 0) {
                                                                                    i26 = i38;
                                                                                    list6 = list;
                                                                                    i25 = 0;
                                                                                } else if (t6 == 1) {
                                                                                    i26 = i38;
                                                                                    list6 = list;
                                                                                    i25 = 1;
                                                                                } else if (t6 == 2) {
                                                                                    i26 = i38;
                                                                                    list6 = list;
                                                                                    i25 = 2;
                                                                                } else if (t6 == i27) {
                                                                                    i25 = i27;
                                                                                    i26 = i38;
                                                                                    list6 = list;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            i27 = i44;
                                                                            if (h20 == 1668246642) {
                                                                                int h22 = sf1Var5.h();
                                                                                if (h22 == 1852009592 || h22 == 1852009571) {
                                                                                    int z12 = sf1Var5.z();
                                                                                    int z13 = sf1Var5.z();
                                                                                    sf1Var5.f(2);
                                                                                    boolean z14 = h19 == 19 && (sf1Var5.t() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
                                                                                    InterfaceC2259tl.a<eq> aVar5 = eq.f25385g;
                                                                                    int i79 = 7;
                                                                                    if (z12 == 1) {
                                                                                        i26 = i38;
                                                                                        i28 = 1;
                                                                                    } else if (z12 != 9) {
                                                                                        i26 = i38;
                                                                                        i28 = (z12 == 4 || z12 == i26 || z12 == 6 || z12 == 7) ? 2 : -1;
                                                                                    } else {
                                                                                        i26 = i38;
                                                                                        i28 = 6;
                                                                                    }
                                                                                    int i80 = z14 ? 1 : 2;
                                                                                    if (z13 != 1) {
                                                                                        if (z13 == 16) {
                                                                                            i79 = 6;
                                                                                        } else if (z13 != 18) {
                                                                                            if (z13 != 6 && z13 != 7) {
                                                                                                i79 = -1;
                                                                                            }
                                                                                        }
                                                                                        i74 = i28;
                                                                                        i73 = i80;
                                                                                        i72 = i79;
                                                                                    }
                                                                                    i79 = i27;
                                                                                    i74 = i28;
                                                                                    i73 = i80;
                                                                                    i72 = i79;
                                                                                } else {
                                                                                    ms0.d("AtomParsers", "Unsupported color type: " + AbstractC2346xg.a(h22));
                                                                                }
                                                                            }
                                                                        }
                                                                        i26 = i38;
                                                                    }
                                                                    i75 = i76 + h19;
                                                                    i38 = i26;
                                                                    i44 = i27;
                                                                    i21 = i77;
                                                                    u30Var2 = u30Var3;
                                                                    h14 = i24;
                                                                    i71 = i25;
                                                                    bArr8 = bArr;
                                                                    f5 = f4;
                                                                    z10 = i23;
                                                                    z9 = i22;
                                                                } else if (str12 == null) {
                                                                    b a13 = a(d10, sf1Var5);
                                                                    String str14 = a13.f35111a;
                                                                    byte[] bArr9 = a13.f35112b;
                                                                    list6 = bArr9 != null ? sj0.a(bArr9) : list;
                                                                    bVar3 = a13;
                                                                    str12 = str14;
                                                                    i26 = i38;
                                                                    i27 = i44;
                                                                } else {
                                                                    throw wf1.a((String) null, (Exception) null);
                                                                }
                                                                i75 = i76 + h19;
                                                                i38 = i26;
                                                                i44 = i27;
                                                                i21 = i77;
                                                                u30Var2 = u30Var3;
                                                                h14 = i24;
                                                                i71 = i25;
                                                                bArr8 = bArr;
                                                                f5 = f4;
                                                                z10 = i23;
                                                                z9 = i22;
                                                            } else if (str12 == null) {
                                                                str12 = "video/3gpp";
                                                            } else {
                                                                throw wf1.a((String) null, (Exception) null);
                                                            }
                                                        }
                                                        i26 = i38;
                                                        i27 = i44;
                                                        list6 = list;
                                                        i75 = i76 + h19;
                                                        i38 = i26;
                                                        i44 = i27;
                                                        i21 = i77;
                                                        u30Var2 = u30Var3;
                                                        h14 = i24;
                                                        i71 = i25;
                                                        bArr8 = bArr;
                                                        f5 = f4;
                                                        z10 = i23;
                                                        z9 = i22;
                                                    }
                                                    i24 = h14;
                                                    bArr = bArr8;
                                                    i25 = i71;
                                                    i26 = i38;
                                                    i27 = i44;
                                                    i75 = i76 + h19;
                                                    i38 = i26;
                                                    i44 = i27;
                                                    i21 = i77;
                                                    u30Var2 = u30Var3;
                                                    h14 = i24;
                                                    i71 = i25;
                                                    bArr8 = bArr;
                                                    f5 = f4;
                                                    z10 = i23;
                                                    z9 = i22;
                                                }
                                                list6 = list;
                                                i75 = i76 + h19;
                                                i38 = i26;
                                                i44 = i27;
                                                i21 = i77;
                                                u30Var2 = u30Var3;
                                                h14 = i24;
                                                i71 = i25;
                                                bArr8 = bArr;
                                                f5 = f4;
                                                z10 = i23;
                                                z9 = i22;
                                            } else if (str12 == null) {
                                                sf1Var5.e(d10 + 8);
                                                if0 a14 = if0.a(sf1Var5);
                                                list2 = a14.f27190a;
                                                i29 = a14.f27191b;
                                                if (!z11) {
                                                    f5 = a14.f27192c;
                                                }
                                                str3 = a14.f27193d;
                                                str4 = "video/hevc";
                                            } else {
                                                throw wf1.a((String) null, (Exception) null);
                                            }
                                            i22 = z9;
                                            i23 = z10;
                                            f4 = f5;
                                            i70 = i29;
                                            str12 = str4;
                                            i24 = h14;
                                            bArr = bArr8;
                                            i25 = i71;
                                            i26 = i38;
                                            i27 = i44;
                                            str13 = str3;
                                            list6 = list2;
                                            i75 = i76 + h19;
                                            i38 = i26;
                                            i44 = i27;
                                            i21 = i77;
                                            u30Var2 = u30Var3;
                                            h14 = i24;
                                            i71 = i25;
                                            bArr8 = bArr;
                                            f5 = f4;
                                            z10 = i23;
                                            z9 = i22;
                                        } else {
                                            throw wf1.a("childAtomSize must be positive", (Exception) null);
                                        }
                                    }
                                } else {
                                    throw wf1.a("childAtomSize must be positive", (Exception) null);
                                }
                            }
                            int i81 = i45;
                            Pair pair2 = create2;
                            arrayList = arrayList4;
                            i7 = i43;
                            AbstractC2346xg.a aVar6 = aVar4;
                            l52[] l52VarArr3 = l52VarArr;
                            long j10 = j9;
                            i8 = i38;
                            i9 = i48;
                            k52Var = null;
                            if (z4) {
                                aVar4 = aVar6;
                            } else {
                                aVar4 = aVar6;
                                AbstractC2346xg.a b8 = aVar4.b(1701082227);
                                if (b8 != null) {
                                    AbstractC2346xg.b c9 = b8.c(1701606260);
                                    if (c9 == null) {
                                        create = null;
                                        i10 = 8;
                                    } else {
                                        sf1 sf1Var7 = c9.f34556b;
                                        i10 = 8;
                                        sf1Var7.e(8);
                                        int h23 = (sf1Var7.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                                        int x4 = sf1Var7.x();
                                        long[] jArr3 = new long[x4];
                                        long[] jArr4 = new long[x4];
                                        for (int i82 = 0; i82 < x4; i82++) {
                                            jArr3[i82] = h23 == 1 ? sf1Var7.y() : sf1Var7.v();
                                            jArr4[i82] = h23 == 1 ? sf1Var7.p() : sf1Var7.h();
                                            if (sf1Var7.r() == 1) {
                                                sf1Var7.f(2);
                                            } else {
                                                throw new IllegalArgumentException("Unsupported media rate.");
                                            }
                                        }
                                        create = Pair.create(jArr3, jArr4);
                                    }
                                    if (create != null) {
                                        long[] jArr5 = (long[]) create.first;
                                        jArr2 = (long[]) create.second;
                                        jArr = jArr5;
                                        if (yb0Var != null) {
                                            k52Var = new k52(h7, i81, ((Long) pair2.first).longValue(), j10, a6, yb0Var, i49, l52VarArr3, i50, jArr, jArr2);
                                        }
                                    }
                                    jArr = null;
                                    jArr2 = null;
                                    if (yb0Var != null) {
                                    }
                                }
                            }
                            i10 = 8;
                            jArr = null;
                            jArr2 = null;
                            if (yb0Var != null) {
                            }
                        }
                    } else {
                        i4 = -65536;
                    }
                    if (h8 == 0 && h9 == i4) {
                        if (h10 == 65536 && h11 == 0) {
                            i5 = 270;
                            if (j4 == -9223372036854775807L) {
                            }
                            sf1 sf1Var32 = c4.f34556b;
                            sf1Var32.e(8);
                            sf1Var32.f(((sf1Var32.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) == 0 ? 8 : i48);
                            long v42 = sf1Var32.v();
                            long a62 = j8 != -9223372036854775807L ? u82.a(j8, 1000000L, v42) : -9223372036854775807L;
                            AbstractC2346xg.a b62 = b5.b(1835626086);
                            b62.getClass();
                            AbstractC2346xg.a b72 = b62.b(1937007212);
                            b72.getClass();
                            AbstractC2346xg.b c72 = b5.c(1835296868);
                            c72.getClass();
                            sf1 sf1Var42 = c72.f34556b;
                            sf1Var42.e(8);
                            int h122 = (sf1Var42.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                            sf1Var42.f(h122 == 0 ? 8 : i48);
                            long v52 = sf1Var42.v();
                            sf1Var42.f(h122 == 0 ? 4 : 8);
                            int z82 = sf1Var42.z();
                            Pair create22 = Pair.create(Long.valueOf(v52), "" + ((char) (((z82 >> 10) & 31) + 96)) + ((char) (((z82 >> 5) & 31) + 96)) + ((char) ((z82 & 31) + 96)));
                            AbstractC2346xg.b c82 = b72.c(1937011556);
                            c82.getClass();
                            sf1 sf1Var52 = c82.f34556b;
                            String str82 = (String) create22.second;
                            sf1Var52.e(12);
                            h4 = sf1Var52.h();
                            l52[] l52VarArr4 = new l52[h4];
                            long j92 = v42;
                            i6 = 0;
                            yb0Var = null;
                            int i492 = 0;
                            int i502 = 0;
                            while (i6 < h4) {
                            }
                            int i812 = i45;
                            Pair pair22 = create22;
                            arrayList = arrayList4;
                            i7 = i43;
                            AbstractC2346xg.a aVar62 = aVar4;
                            l52[] l52VarArr32 = l52VarArr4;
                            long j102 = j92;
                            i8 = i38;
                            i9 = i48;
                            k52Var = null;
                            if (z4) {
                            }
                            i10 = 8;
                            jArr = null;
                            jArr2 = null;
                            if (yb0Var != null) {
                            }
                        } else {
                            i4 = -65536;
                        }
                    }
                    i5 = (h8 == i4 && h9 == 0 && h10 == 0 && h11 == i4) ? 180 : 0;
                    if (j4 == -9223372036854775807L) {
                    }
                    sf1 sf1Var322 = c4.f34556b;
                    sf1Var322.e(8);
                    sf1Var322.f(((sf1Var322.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) == 0 ? 8 : i48);
                    long v422 = sf1Var322.v();
                    long a622 = j8 != -9223372036854775807L ? u82.a(j8, 1000000L, v422) : -9223372036854775807L;
                    AbstractC2346xg.a b622 = b5.b(1835626086);
                    b622.getClass();
                    AbstractC2346xg.a b722 = b622.b(1937007212);
                    b722.getClass();
                    AbstractC2346xg.b c722 = b5.c(1835296868);
                    c722.getClass();
                    sf1 sf1Var422 = c722.f34556b;
                    sf1Var422.e(8);
                    int h1222 = (sf1Var422.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                    sf1Var422.f(h1222 == 0 ? 8 : i48);
                    long v522 = sf1Var422.v();
                    sf1Var422.f(h1222 == 0 ? 4 : 8);
                    int z822 = sf1Var422.z();
                    Pair create222 = Pair.create(Long.valueOf(v522), "" + ((char) (((z822 >> 10) & 31) + 96)) + ((char) (((z822 >> 5) & 31) + 96)) + ((char) ((z822 & 31) + 96)));
                    AbstractC2346xg.b c822 = b722.c(1937011556);
                    c822.getClass();
                    sf1 sf1Var522 = c822.f34556b;
                    String str822 = (String) create222.second;
                    sf1Var522.e(12);
                    h4 = sf1Var522.h();
                    l52[] l52VarArr42 = new l52[h4];
                    long j922 = v422;
                    i6 = 0;
                    yb0Var = null;
                    int i4922 = 0;
                    int i5022 = 0;
                    while (i6 < h4) {
                    }
                    int i8122 = i45;
                    Pair pair222 = create222;
                    arrayList = arrayList4;
                    i7 = i43;
                    AbstractC2346xg.a aVar622 = aVar4;
                    l52[] l52VarArr322 = l52VarArr42;
                    long j1022 = j922;
                    i8 = i38;
                    i9 = i48;
                    k52Var = null;
                    if (z4) {
                    }
                    i10 = 8;
                    jArr = null;
                    jArr2 = null;
                    if (yb0Var != null) {
                    }
                }
                k52 k52Var2 = (k52) ud0Var.apply(k52Var);
                if (k52Var2 == null) {
                    arrayList3 = arrayList;
                    i37 = 1835297121;
                } else {
                    i37 = 1835297121;
                    AbstractC2346xg.a b9 = aVar4.b(1835297121);
                    b9.getClass();
                    AbstractC2346xg.a b10 = b9.b(1835626086);
                    b10.getClass();
                    AbstractC2346xg.a b11 = b10.b(1937007212);
                    b11.getClass();
                    q52 a15 = a(k52Var2, b11, xd0Var);
                    arrayList3 = arrayList;
                    arrayList3.add(a15);
                }
                i40 = 1;
            }
            i43 = i7 + 1;
            aVar3 = aVar;
            u30Var5 = u30Var;
            arrayList4 = arrayList3;
            i42 = i10;
            i38 = i8;
            i41 = i9;
            i39 = i37;
        }
        return arrayList4;
    }
}
