package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class a0 implements oc4 {

    /* renamed from: b0, reason: collision with root package name */
    public static final vc4 f2511b0 = new vc4() { // from class: com.google.android.gms.internal.ads.u
        @Override // com.google.android.gms.internal.ads.vc4
        public final /* synthetic */ oc4[] a(Uri uri, Map map) {
            return uc4.a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.vc4
        public final oc4[] zza() {
            vc4 vc4Var = a0.f2511b0;
            return new oc4[]{new a0(0)};
        }
    };

    /* renamed from: c0, reason: collision with root package name */
    private static final byte[] f2512c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0, reason: collision with root package name */
    private static final byte[] f2513d0 = n13.w("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e0, reason: collision with root package name */
    private static final byte[] f2514e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: f0, reason: collision with root package name */
    private static final UUID f2515f0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: g0, reason: collision with root package name */
    private static final Map<String, Integer> f2516g0;
    private long A;
    private pd2 B;
    private pd2 C;
    private boolean D;
    private boolean E;
    private int F;
    private long G;
    private long H;
    private int I;
    private int J;
    private int[] K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private int Q;
    private int R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private int W;
    private byte X;
    private boolean Y;
    private rc4 Z;

    /* renamed from: a, reason: collision with root package name */
    private final d0 f2517a;

    /* renamed from: a0, reason: collision with root package name */
    private final s f2518a0;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<y> f2519b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2520c;

    /* renamed from: d, reason: collision with root package name */
    private final dr2 f2521d;

    /* renamed from: e, reason: collision with root package name */
    private final dr2 f2522e;

    /* renamed from: f, reason: collision with root package name */
    private final dr2 f2523f;

    /* renamed from: g, reason: collision with root package name */
    private final dr2 f2524g;

    /* renamed from: h, reason: collision with root package name */
    private final dr2 f2525h;

    /* renamed from: i, reason: collision with root package name */
    private final dr2 f2526i;

    /* renamed from: j, reason: collision with root package name */
    private final dr2 f2527j;

    /* renamed from: k, reason: collision with root package name */
    private final dr2 f2528k;

    /* renamed from: l, reason: collision with root package name */
    private final dr2 f2529l;

    /* renamed from: m, reason: collision with root package name */
    private final dr2 f2530m;

    /* renamed from: n, reason: collision with root package name */
    private ByteBuffer f2531n;

    /* renamed from: o, reason: collision with root package name */
    private long f2532o;

    /* renamed from: p, reason: collision with root package name */
    private long f2533p;

    /* renamed from: q, reason: collision with root package name */
    private long f2534q;

    /* renamed from: r, reason: collision with root package name */
    private long f2535r;

    /* renamed from: s, reason: collision with root package name */
    private long f2536s;

    /* renamed from: t, reason: collision with root package name */
    private y f2537t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f2538u;

    /* renamed from: v, reason: collision with root package name */
    private int f2539v;

    /* renamed from: w, reason: collision with root package name */
    private long f2540w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f2541x;

    /* renamed from: y, reason: collision with root package name */
    private long f2542y;

    /* renamed from: z, reason: collision with root package name */
    private long f2543z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f2516g0 = Collections.unmodifiableMap(hashMap);
    }

    public a0(int i7) {
        s sVar = new s();
        this.f2533p = -1L;
        this.f2534q = -9223372036854775807L;
        this.f2535r = -9223372036854775807L;
        this.f2536s = -9223372036854775807L;
        this.f2542y = -1L;
        this.f2543z = -1L;
        this.A = -9223372036854775807L;
        this.f2518a0 = sVar;
        sVar.a(new w(this, null));
        this.f2520c = true;
        this.f2517a = new d0();
        this.f2519b = new SparseArray<>();
        this.f2523f = new dr2(4);
        this.f2524g = new dr2(ByteBuffer.allocate(4).putInt(-1).array());
        this.f2525h = new dr2(4);
        this.f2521d = new dr2(th2.f12217a);
        this.f2522e = new dr2(4);
        this.f2526i = new dr2();
        this.f2527j = new dr2();
        this.f2528k = new dr2(8);
        this.f2529l = new dr2();
        this.f2530m = new dr2();
        this.K = new int[1];
    }

    protected static final int n(int i7) {
        switch (i7) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected static final boolean o(int i7) {
        return i7 == 357149030 || i7 == 524531317 || i7 == 475249515 || i7 == 374648427;
    }

    private final int p(pc4 pc4Var, y yVar, int i7) {
        int i8;
        if ("S_TEXT/UTF8".equals(yVar.f14447b)) {
            x(pc4Var, f2512c0, i7);
        } else if ("S_TEXT/ASS".equals(yVar.f14447b)) {
            x(pc4Var, f2514e0, i7);
        } else {
            td4 td4Var = yVar.X;
            if (!this.T) {
                if (yVar.f14453h) {
                    this.N &= -1073741825;
                    if (!this.U) {
                        ((jc4) pc4Var).m(this.f2523f.h(), 0, 1, false);
                        this.Q++;
                        if ((this.f2523f.h()[0] & 128) == 128) {
                            throw dz.a("Extension bit is set in signal byte", null);
                        }
                        this.X = this.f2523f.h()[0];
                        this.U = true;
                    }
                    byte b7 = this.X;
                    if ((b7 & 1) == 1) {
                        int i9 = b7 & 2;
                        this.N |= 1073741824;
                        if (!this.Y) {
                            ((jc4) pc4Var).m(this.f2528k.h(), 0, 8, false);
                            this.Q += 8;
                            this.Y = true;
                            this.f2523f.h()[0] = (byte) ((i9 != 2 ? 0 : 128) | 8);
                            this.f2523f.f(0);
                            td4Var.f(this.f2523f, 1, 1);
                            this.R++;
                            this.f2528k.f(0);
                            td4Var.f(this.f2528k, 8, 1);
                            this.R += 8;
                        }
                        if (i9 == 2) {
                            if (!this.V) {
                                ((jc4) pc4Var).m(this.f2523f.h(), 0, 1, false);
                                this.Q++;
                                this.f2523f.f(0);
                                this.W = this.f2523f.s();
                                this.V = true;
                            }
                            int i10 = this.W * 4;
                            this.f2523f.c(i10);
                            ((jc4) pc4Var).m(this.f2523f.h(), 0, i10, false);
                            this.Q += i10;
                            int i11 = (this.W >> 1) + 1;
                            int i12 = (i11 * 6) + 2;
                            ByteBuffer byteBuffer = this.f2531n;
                            if (byteBuffer == null || byteBuffer.capacity() < i12) {
                                this.f2531n = ByteBuffer.allocate(i12);
                            }
                            this.f2531n.position(0);
                            this.f2531n.putShort((short) i11);
                            int i13 = 0;
                            int i14 = 0;
                            while (true) {
                                i8 = this.W;
                                if (i13 >= i8) {
                                    break;
                                }
                                int v6 = this.f2523f.v();
                                if (i13 % 2 == 0) {
                                    this.f2531n.putShort((short) (v6 - i14));
                                } else {
                                    this.f2531n.putInt(v6 - i14);
                                }
                                i13++;
                                i14 = v6;
                            }
                            int i15 = (i7 - this.Q) - i14;
                            if ((i8 & 1) == 1) {
                                this.f2531n.putInt(i15);
                            } else {
                                this.f2531n.putShort((short) i15);
                                this.f2531n.putInt(0);
                            }
                            this.f2529l.d(this.f2531n.array(), i12);
                            td4Var.f(this.f2529l, i12, 1);
                            this.R += i12;
                        }
                    }
                } else {
                    byte[] bArr = yVar.f14454i;
                    if (bArr != null) {
                        this.f2526i.d(bArr, bArr.length);
                    }
                }
                if (yVar.f14451f > 0) {
                    this.N |= 268435456;
                    this.f2530m.c(0);
                    this.f2523f.c(4);
                    this.f2523f.h()[0] = (byte) ((i7 >> 24) & 255);
                    this.f2523f.h()[1] = (byte) ((i7 >> 16) & 255);
                    this.f2523f.h()[2] = (byte) ((i7 >> 8) & 255);
                    this.f2523f.h()[3] = (byte) (i7 & 255);
                    td4Var.f(this.f2523f, 4, 2);
                    this.R += 4;
                }
                this.T = true;
            }
            int l7 = i7 + this.f2526i.l();
            if (!"V_MPEG4/ISO/AVC".equals(yVar.f14447b) && !"V_MPEGH/ISO/HEVC".equals(yVar.f14447b)) {
                if (yVar.T != null) {
                    wu1.f(this.f2526i.l() == 0);
                    yVar.T.d(pc4Var);
                }
                while (true) {
                    int i16 = this.Q;
                    if (i16 >= l7) {
                        break;
                    }
                    int q7 = q(pc4Var, td4Var, l7 - i16);
                    this.Q += q7;
                    this.R += q7;
                }
            } else {
                byte[] h7 = this.f2522e.h();
                h7[0] = 0;
                h7[1] = 0;
                h7[2] = 0;
                int i17 = yVar.Y;
                int i18 = 4 - i17;
                while (this.Q < l7) {
                    int i19 = this.S;
                    if (i19 == 0) {
                        int min = Math.min(i17, this.f2526i.i());
                        ((jc4) pc4Var).m(h7, i18 + min, i17 - min, false);
                        if (min > 0) {
                            this.f2526i.b(h7, i18, min);
                        }
                        this.Q += i17;
                        this.f2522e.f(0);
                        this.S = this.f2522e.v();
                        this.f2521d.f(0);
                        rd4.b(td4Var, this.f2521d, 4);
                        this.R += 4;
                    } else {
                        int q8 = q(pc4Var, td4Var, i19);
                        this.Q += q8;
                        this.R += q8;
                        this.S -= q8;
                    }
                }
            }
            if ("A_VORBIS".equals(yVar.f14447b)) {
                this.f2524g.f(0);
                rd4.b(td4Var, this.f2524g, 4);
                this.R += 4;
            }
        }
        int i20 = this.R;
        w();
        return i20;
    }

    private final int q(pc4 pc4Var, td4 td4Var, int i7) {
        int i8 = this.f2526i.i();
        if (i8 <= 0) {
            return rd4.a(td4Var, pc4Var, i7, false);
        }
        int min = Math.min(i7, i8);
        rd4.b(td4Var, this.f2526i, min);
        return min;
    }

    private final long r(long j7) {
        long j8 = this.f2534q;
        if (j8 != -9223372036854775807L) {
            return n13.Z(j7, j8, 1000L);
        }
        throw dz.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void s(int i7) {
        if (this.B == null || this.C == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i7);
            sb.append(" must be in a Cues");
            throw dz.a(sb.toString(), null);
        }
    }

    private final void t(int i7) {
        if (this.f2537t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Element ");
        sb.append(i7);
        sb.append(" must be in a TrackEntry");
        throw dz.a(sb.toString(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7 A[EDGE_INSN: B:46:0x00b7->B:45:0x00b7 BREAK  A[LOOP:0: B:38:0x009c->B:42:0x00b4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void u(y yVar, long j7, int i7, int i8, int i9) {
        char c7;
        byte[] y6;
        int i10;
        int k7;
        int l7;
        String str;
        int i11;
        int i12;
        z zVar = yVar.T;
        if (zVar != null) {
            zVar.c(yVar, j7, i7, i8, i9);
        } else {
            if ("S_TEXT/UTF8".equals(yVar.f14447b) || "S_TEXT/ASS".equals(yVar.f14447b)) {
                if (this.J > 1) {
                    str = "Skipping subtitle sample in laced block.";
                } else {
                    long j8 = this.H;
                    if (j8 == -9223372036854775807L) {
                        str = "Skipping subtitle sample with no duration.";
                    } else {
                        String str2 = yVar.f14447b;
                        byte[] h7 = this.f2527j.h();
                        int hashCode = str2.hashCode();
                        if (hashCode != 738597099) {
                            if (hashCode == 1422270023 && str2.equals("S_TEXT/UTF8")) {
                                c7 = 0;
                                if (c7 != 0) {
                                    y6 = y(j8, "%02d:%02d:%02d,%03d", 1000L);
                                    i10 = 19;
                                } else {
                                    if (c7 != 1) {
                                        throw new IllegalArgumentException();
                                    }
                                    y6 = y(j8, "%01d:%02d:%02d:%02d", 10000L);
                                    i10 = 21;
                                }
                                System.arraycopy(y6, 0, h7, i10, y6.length);
                                k7 = this.f2527j.k();
                                while (true) {
                                    if (k7 >= this.f2527j.l()) {
                                        break;
                                    }
                                    if (this.f2527j.h()[k7] == 0) {
                                        this.f2527j.e(k7);
                                        break;
                                    }
                                    k7++;
                                }
                                td4 td4Var = yVar.X;
                                dr2 dr2Var = this.f2527j;
                                rd4.b(td4Var, dr2Var, dr2Var.l());
                                l7 = i8 + this.f2527j.l();
                                if ((i7 & 268435456) != 0) {
                                    if (this.J > 1) {
                                        i12 = l7;
                                        i11 = i7 & (-268435457);
                                        yVar.X.a(j7, i11, i12, i9, yVar.f14455j);
                                    } else {
                                        int l8 = this.f2530m.l();
                                        yVar.X.f(this.f2530m, l8, 2);
                                        l7 += l8;
                                    }
                                }
                                i11 = i7;
                                i12 = l7;
                                yVar.X.a(j7, i11, i12, i9, yVar.f14455j);
                            }
                            c7 = 65535;
                            if (c7 != 0) {
                            }
                            System.arraycopy(y6, 0, h7, i10, y6.length);
                            k7 = this.f2527j.k();
                            while (true) {
                                if (k7 >= this.f2527j.l()) {
                                }
                                k7++;
                            }
                            td4 td4Var2 = yVar.X;
                            dr2 dr2Var2 = this.f2527j;
                            rd4.b(td4Var2, dr2Var2, dr2Var2.l());
                            l7 = i8 + this.f2527j.l();
                            if ((i7 & 268435456) != 0) {
                            }
                            i11 = i7;
                            i12 = l7;
                            yVar.X.a(j7, i11, i12, i9, yVar.f14455j);
                        } else {
                            if (str2.equals("S_TEXT/ASS")) {
                                c7 = 1;
                                if (c7 != 0) {
                                }
                                System.arraycopy(y6, 0, h7, i10, y6.length);
                                k7 = this.f2527j.k();
                                while (true) {
                                    if (k7 >= this.f2527j.l()) {
                                    }
                                    k7++;
                                }
                                td4 td4Var22 = yVar.X;
                                dr2 dr2Var22 = this.f2527j;
                                rd4.b(td4Var22, dr2Var22, dr2Var22.l());
                                l7 = i8 + this.f2527j.l();
                                if ((i7 & 268435456) != 0) {
                                }
                                i11 = i7;
                                i12 = l7;
                                yVar.X.a(j7, i11, i12, i9, yVar.f14455j);
                            }
                            c7 = 65535;
                            if (c7 != 0) {
                            }
                            System.arraycopy(y6, 0, h7, i10, y6.length);
                            k7 = this.f2527j.k();
                            while (true) {
                                if (k7 >= this.f2527j.l()) {
                                }
                                k7++;
                            }
                            td4 td4Var222 = yVar.X;
                            dr2 dr2Var222 = this.f2527j;
                            rd4.b(td4Var222, dr2Var222, dr2Var222.l());
                            l7 = i8 + this.f2527j.l();
                            if ((i7 & 268435456) != 0) {
                            }
                            i11 = i7;
                            i12 = l7;
                            yVar.X.a(j7, i11, i12, i9, yVar.f14455j);
                        }
                    }
                }
                Log.w("MatroskaExtractor", str);
            }
            l7 = i8;
            if ((i7 & 268435456) != 0) {
            }
            i11 = i7;
            i12 = l7;
            yVar.X.a(j7, i11, i12, i9, yVar.f14455j);
        }
        this.E = true;
    }

    private final void v(pc4 pc4Var, int i7) {
        if (this.f2523f.l() >= i7) {
            return;
        }
        if (this.f2523f.j() < i7) {
            dr2 dr2Var = this.f2523f;
            int j7 = dr2Var.j();
            dr2Var.H(Math.max(j7 + j7, i7));
        }
        ((jc4) pc4Var).m(this.f2523f.h(), this.f2523f.l(), i7 - this.f2523f.l(), false);
        this.f2523f.e(i7);
    }

    private final void w() {
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = 0;
        this.X = (byte) 0;
        this.Y = false;
        this.f2526i.c(0);
    }

    private final void x(pc4 pc4Var, byte[] bArr, int i7) {
        int length = bArr.length;
        int i8 = i7 + 32;
        if (this.f2527j.j() < i8) {
            dr2 dr2Var = this.f2527j;
            byte[] copyOf = Arrays.copyOf(bArr, i8 + i7);
            dr2Var.d(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.f2527j.h(), 0, 32);
        }
        ((jc4) pc4Var).m(this.f2527j.h(), 32, i7, false);
        this.f2527j.f(0);
        this.f2527j.e(i8);
    }

    private static byte[] y(long j7, String str, long j8) {
        wu1.d(j7 != -9223372036854775807L);
        int i7 = (int) (j7 / 3600000000L);
        long j9 = j7 - ((i7 * 3600) * 1000000);
        int i8 = (int) (j9 / 60000000);
        long j10 = j9 - ((i8 * 60) * 1000000);
        int i9 = (int) (j10 / 1000000);
        return n13.w(String.format(Locale.US, str, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf((int) ((j10 - (i9 * 1000000)) / j8))));
    }

    private static int[] z(int[] iArr, int i7) {
        if (iArr == null) {
            return new int[i7];
        }
        int length = iArr.length;
        return length >= i7 ? iArr : new int[Math.max(length + length, i7)];
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final boolean c(pc4 pc4Var) {
        return new b0().a(pc4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0284, code lost:
    
        throw com.google.android.gms.internal.ads.dz.a("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void d(int i7, int i8, pc4 pc4Var) {
        long j7;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = i7;
        int i14 = 1;
        int i15 = 0;
        if (i13 != 161 && i13 != 163) {
            if (i13 == 165) {
                if (this.F != 2) {
                    return;
                }
                y yVar = this.f2519b.get(this.L);
                if (this.O != 4 || !"V_VP9".equals(yVar.f14447b)) {
                    ((jc4) pc4Var).p(i8, false);
                    return;
                }
                this.f2530m.c(i8);
                ((jc4) pc4Var).m(this.f2530m.h(), 0, i8, false);
                return;
            }
            if (i13 == 16877) {
                t(i7);
                y yVar2 = this.f2537t;
                if (yVar2.f14452g != 1685485123 && yVar2.f14452g != 1685480259) {
                    ((jc4) pc4Var).p(i8, false);
                    return;
                }
                byte[] bArr = new byte[i8];
                yVar2.N = bArr;
                ((jc4) pc4Var).m(bArr, 0, i8, false);
                return;
            }
            if (i13 == 16981) {
                t(i7);
                byte[] bArr2 = new byte[i8];
                this.f2537t.f14454i = bArr2;
                ((jc4) pc4Var).m(bArr2, 0, i8, false);
                return;
            }
            if (i13 == 18402) {
                byte[] bArr3 = new byte[i8];
                ((jc4) pc4Var).m(bArr3, 0, i8, false);
                t(i7);
                this.f2537t.f14455j = new sd4(1, bArr3, 0, 0);
                return;
            }
            if (i13 == 21419) {
                Arrays.fill(this.f2525h.h(), (byte) 0);
                ((jc4) pc4Var).m(this.f2525h.h(), 4 - i8, i8, false);
                this.f2525h.f(0);
                this.f2539v = (int) this.f2525h.A();
                return;
            }
            if (i13 == 25506) {
                t(i7);
                byte[] bArr4 = new byte[i8];
                this.f2537t.f14456k = bArr4;
                ((jc4) pc4Var).m(bArr4, 0, i8, false);
                return;
            }
            if (i13 != 30322) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unexpected id: ");
                sb.append(i13);
                throw dz.a(sb.toString(), null);
            }
            t(i7);
            byte[] bArr5 = new byte[i8];
            this.f2537t.f14467v = bArr5;
            ((jc4) pc4Var).m(bArr5, 0, i8, false);
            return;
        }
        int i16 = 8;
        if (this.F == 0) {
            this.L = (int) this.f2517a.d(pc4Var, false, true, 8);
            this.M = this.f2517a.a();
            this.H = -9223372036854775807L;
            this.F = 1;
            this.f2523f.c(0);
        }
        y yVar3 = this.f2519b.get(this.L);
        if (yVar3 == null) {
            ((jc4) pc4Var).p(i8 - this.M, false);
            this.F = 0;
            return;
        }
        y.d(yVar3);
        if (this.F == 1) {
            v(pc4Var, 3);
            int i17 = (this.f2523f.h()[2] & 6) >> 1;
            byte b7 = 255;
            if (i17 == 0) {
                this.J = 1;
                int[] z6 = z(this.K, 1);
                this.K = z6;
                z6[0] = (i8 - this.M) - 3;
            } else {
                v(pc4Var, 4);
                int i18 = (this.f2523f.h()[3] & 255) + 1;
                this.J = i18;
                int[] z7 = z(this.K, i18);
                this.K = z7;
                if (i17 == 2) {
                    int i19 = this.M;
                    int i20 = this.J;
                    Arrays.fill(z7, 0, i20, ((i8 - i19) - 4) / i20);
                } else if (i17 == 1) {
                    int i21 = 0;
                    int i22 = 0;
                    int i23 = 4;
                    while (true) {
                        i9 = this.J - 1;
                        if (i21 >= i9) {
                            break;
                        }
                        this.K[i21] = 0;
                        do {
                            i23++;
                            v(pc4Var, i23);
                            i10 = this.f2523f.h()[i23 - 1] & 255;
                            int[] iArr = this.K;
                            i11 = iArr[i21] + i10;
                            iArr[i21] = i11;
                        } while (i10 == 255);
                        i22 += i11;
                        i21++;
                    }
                    this.K[i9] = ((i8 - this.M) - i23) - i22;
                } else {
                    if (i17 != 3) {
                        throw dz.a("Unexpected lacing value: 2", null);
                    }
                    int i24 = 0;
                    int i25 = 4;
                    int i26 = 0;
                    while (true) {
                        int i27 = this.J - 1;
                        if (i24 >= i27) {
                            this.K[i27] = ((i8 - this.M) - i25) - i26;
                            break;
                        }
                        this.K[i24] = i15;
                        i25++;
                        v(pc4Var, i25);
                        int i28 = i25 - 1;
                        if (this.f2523f.h()[i28] == 0) {
                            throw dz.a("No valid varint length mask found", null);
                        }
                        int i29 = 0;
                        while (true) {
                            if (i29 >= i16) {
                                j7 = 0;
                                break;
                            }
                            int i30 = i14 << (7 - i29);
                            if ((this.f2523f.h()[i28] & i30) != 0) {
                                i25 += i29;
                                v(pc4Var, i25);
                                int i31 = i28 + 1;
                                j7 = this.f2523f.h()[i28] & b7 & (i30 ^ (-1));
                                while (i31 < i25) {
                                    j7 = (j7 << i16) | (this.f2523f.h()[i31] & 255);
                                    i31++;
                                    i16 = 8;
                                }
                                if (i24 > 0) {
                                    j7 -= (1 << ((i29 * 7) + 6)) - 1;
                                }
                            } else {
                                i29++;
                                i14 = 1;
                                i16 = 8;
                                b7 = 255;
                            }
                        }
                        if (j7 < -2147483648L || j7 > 2147483647L) {
                            break;
                        }
                        int i32 = (int) j7;
                        int[] iArr2 = this.K;
                        if (i24 != 0) {
                            i32 += iArr2[i24 - 1];
                        }
                        iArr2[i24] = i32;
                        i26 += i32;
                        i24++;
                        i14 = 1;
                        i15 = 0;
                        i16 = 8;
                        b7 = 255;
                    }
                }
            }
            this.G = this.A + r((this.f2523f.h()[0] << 8) | (this.f2523f.h()[1] & 255));
            if (yVar3.f14449d != 2) {
                if (i13 == 163) {
                    if ((this.f2523f.h()[2] & 128) == 128) {
                        i13 = 163;
                    } else {
                        i13 = 163;
                    }
                }
                i12 = 0;
                this.N = i12;
                this.F = 2;
                this.I = 0;
            }
            i12 = 1;
            this.N = i12;
            this.F = 2;
            this.I = 0;
        }
        if (i13 == 163) {
            while (true) {
                int i33 = this.I;
                if (i33 >= this.J) {
                    this.F = 0;
                    return;
                }
                u(yVar3, ((this.I * yVar3.f14450e) / 1000) + this.G, this.N, p(pc4Var, yVar3, this.K[i33]), 0);
                this.I++;
            }
        } else {
            while (true) {
                int i34 = this.I;
                if (i34 >= this.J) {
                    return;
                }
                int[] iArr3 = this.K;
                iArr3[i34] = p(pc4Var, yVar3, iArr3[i34]);
                this.I++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final int e(pc4 pc4Var, md4 md4Var) {
        this.E = false;
        while (!this.E) {
            if (!this.f2518a0.c(pc4Var)) {
                for (int i7 = 0; i7 < this.f2519b.size(); i7++) {
                    y valueAt = this.f2519b.valueAt(i7);
                    y.d(valueAt);
                    z zVar = valueAt.T;
                    if (zVar != null) {
                        zVar.a(valueAt);
                    }
                }
                return -1;
            }
            long b7 = pc4Var.b();
            if (this.f2541x) {
                this.f2543z = b7;
                md4Var.f8503a = this.f2542y;
                this.f2541x = false;
                return 1;
            }
            if (this.f2538u) {
                long j7 = this.f2543z;
                if (j7 != -1) {
                    md4Var.f8503a = j7;
                    this.f2543z = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0252, code lost:
    
        if (r3.equals("V_AV1") != false) goto L185;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void f(int i7) {
        int i8;
        int i9;
        pd4 od4Var;
        int i10;
        wu1.b(this.Z);
        char c7 = 2;
        if (i7 == 160) {
            if (this.F == 2) {
                int i11 = 0;
                for (int i12 = 0; i12 < this.J; i12++) {
                    i11 += this.K[i12];
                }
                y yVar = this.f2519b.get(this.L);
                y.d(yVar);
                int i13 = 0;
                while (i13 < this.J) {
                    long j7 = ((yVar.f14450e * i13) / 1000) + this.G;
                    int i14 = this.N;
                    if (i13 == 0) {
                        if (!this.P) {
                            i14 |= 1;
                        }
                        i9 = i14;
                        i8 = 0;
                    } else {
                        i8 = i13;
                        i9 = i14;
                    }
                    int i15 = this.K[i8];
                    int i16 = i11 - i15;
                    u(yVar, j7, i9, i15, i16);
                    i13 = i8 + 1;
                    i11 = i16;
                }
                this.F = 0;
                return;
            }
            return;
        }
        if (i7 != 174) {
            if (i7 == 19899) {
                int i17 = this.f2539v;
                if (i17 != -1) {
                    long j8 = this.f2540w;
                    if (j8 != -1) {
                        if (i17 == 475249515) {
                            this.f2542y = j8;
                            return;
                        }
                        return;
                    }
                }
                throw dz.a("Mandatory element SeekID or SeekPosition not found", null);
            }
            if (i7 == 25152) {
                t(i7);
                y yVar2 = this.f2537t;
                if (yVar2.f14453h) {
                    if (yVar2.f14455j == null) {
                        throw dz.a("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    yVar2.f14457l = new u74(null, new u64(nz3.f9405a, null, "video/webm", this.f2537t.f14455j.f11791b));
                    return;
                }
                return;
            }
            if (i7 == 28032) {
                t(i7);
                y yVar3 = this.f2537t;
                if (yVar3.f14453h && yVar3.f14454i != null) {
                    throw dz.a("Combining encryption and compression is not supported", null);
                }
                return;
            }
            if (i7 == 357149030) {
                if (this.f2534q == -9223372036854775807L) {
                    this.f2534q = 1000000L;
                }
                long j9 = this.f2535r;
                if (j9 != -9223372036854775807L) {
                    this.f2536s = r(j9);
                    return;
                }
                return;
            }
            if (i7 == 374648427) {
                if (this.f2519b.size() == 0) {
                    throw dz.a("No valid tracks were found", null);
                }
                this.Z.H();
                return;
            }
            if (i7 != 475249515) {
                return;
            }
            if (!this.f2538u) {
                rc4 rc4Var = this.Z;
                pd2 pd2Var = this.B;
                pd2 pd2Var2 = this.C;
                if (this.f2533p == -1 || this.f2536s == -9223372036854775807L || pd2Var == null || pd2Var.a() == 0 || pd2Var2 == null || pd2Var2.a() != pd2Var.a()) {
                    od4Var = new od4(this.f2536s, 0L);
                } else {
                    int a7 = pd2Var.a();
                    int[] iArr = new int[a7];
                    long[] jArr = new long[a7];
                    long[] jArr2 = new long[a7];
                    long[] jArr3 = new long[a7];
                    for (int i18 = 0; i18 < a7; i18++) {
                        jArr3[i18] = pd2Var.b(i18);
                        jArr[i18] = this.f2533p + pd2Var2.b(i18);
                    }
                    int i19 = 0;
                    while (true) {
                        i10 = a7 - 1;
                        if (i19 >= i10) {
                            break;
                        }
                        int i20 = i19 + 1;
                        iArr[i19] = (int) (jArr[i20] - jArr[i19]);
                        jArr2[i19] = jArr3[i20] - jArr3[i19];
                        i19 = i20;
                    }
                    iArr[i10] = (int) ((this.f2533p + this.f2532o) - jArr[i10]);
                    long j10 = this.f2536s - jArr3[i10];
                    jArr2[i10] = j10;
                    if (j10 <= 0) {
                        StringBuilder sb = new StringBuilder(72);
                        sb.append("Discarding last cue point with unexpected duration: ");
                        sb.append(j10);
                        Log.w("MatroskaExtractor", sb.toString());
                        iArr = Arrays.copyOf(iArr, i10);
                        jArr = Arrays.copyOf(jArr, i10);
                        jArr2 = Arrays.copyOf(jArr2, i10);
                        jArr3 = Arrays.copyOf(jArr3, i10);
                    }
                    od4Var = new hc4(iArr, jArr, jArr2, jArr3);
                }
                rc4Var.p(od4Var);
                this.f2538u = true;
            }
            this.B = null;
            this.C = null;
            return;
        }
        y yVar4 = this.f2537t;
        wu1.b(yVar4);
        String str = yVar4.f14447b;
        if (str == null) {
            throw dz.a("CodecId is missing in TrackEntry element", null);
        }
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c7 = 6;
                    break;
                }
                c7 = 65535;
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c7 = 23;
                    break;
                }
                c7 = 65535;
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c7 = 18;
                    break;
                }
                c7 = 65535;
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c7 = '\f';
                    break;
                }
                c7 = 65535;
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c7 = 14;
                    break;
                }
                c7 = 65535;
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c7 = 15;
                    break;
                }
                c7 = 65535;
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c7 = '\t';
                    break;
                }
                c7 = 65535;
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c7 = 31;
                    break;
                }
                c7 = 65535;
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c7 = 7;
                    break;
                }
                c7 = 65535;
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c7 = 29;
                    break;
                }
                c7 = 65535;
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c7 = 21;
                    break;
                }
                c7 = 65535;
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c7 = '\r';
                    break;
                }
                c7 = 65535;
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c7 = 16;
                    break;
                }
                c7 = 65535;
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c7 = 19;
                    break;
                }
                c7 = 65535;
                break;
            case 82318131:
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c7 = 30;
                    break;
                }
                c7 = 65535;
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c7 = '\n';
                    break;
                }
                c7 = 65535;
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c7 = 20;
                    break;
                }
                c7 = 65535;
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c7 = 26;
                    break;
                }
                c7 = 65535;
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c7 = 25;
                    break;
                }
                c7 = 65535;
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c7 = 24;
                    break;
                }
                c7 = 65535;
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c7 = 28;
                    break;
                }
                c7 = 65535;
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c7 = '\b';
                    break;
                }
                c7 = 65535;
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c7 = 27;
                    break;
                }
                c7 = 65535;
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c7 = 17;
                    break;
                }
                c7 = 65535;
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c7 = 22;
                    break;
                }
                c7 = 65535;
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c7 = 11;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        switch (c7) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case c4.w0.f2149o /* 7 */:
            case c4.w0.f2150p /* 8 */:
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                yVar4.e(this.Z, yVar4.f14448c);
                this.f2519b.put(yVar4.f14448c, yVar4);
                break;
        }
        this.f2537t = null;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void g(rc4 rc4Var) {
        this.Z = rc4Var;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void h(long j7, long j8) {
        this.A = -9223372036854775807L;
        this.F = 0;
        this.f2518a0.b();
        this.f2517a.e();
        w();
        for (int i7 = 0; i7 < this.f2519b.size(); i7++) {
            z zVar = this.f2519b.valueAt(i7).T;
            if (zVar != null) {
                zVar.b();
            }
        }
    }

    protected final void i(int i7, double d7) {
        if (i7 == 181) {
            t(i7);
            this.f2537t.Q = (int) d7;
            return;
        }
        if (i7 == 17545) {
            this.f2535r = (long) d7;
            return;
        }
        switch (i7) {
            case 21969:
                t(i7);
                this.f2537t.D = (float) d7;
                break;
            case 21970:
                t(i7);
                this.f2537t.E = (float) d7;
                break;
            case 21971:
                t(i7);
                this.f2537t.F = (float) d7;
                break;
            case 21972:
                t(i7);
                this.f2537t.G = (float) d7;
                break;
            case 21973:
                t(i7);
                this.f2537t.H = (float) d7;
                break;
            case 21974:
                t(i7);
                this.f2537t.I = (float) d7;
                break;
            case 21975:
                t(i7);
                this.f2537t.J = (float) d7;
                break;
            case 21976:
                t(i7);
                this.f2537t.K = (float) d7;
                break;
            case 21977:
                t(i7);
                this.f2537t.L = (float) d7;
                break;
            case 21978:
                t(i7);
                this.f2537t.M = (float) d7;
                break;
            default:
                switch (i7) {
                    case 30323:
                        t(i7);
                        this.f2537t.f14464s = (float) d7;
                        break;
                    case 30324:
                        t(i7);
                        this.f2537t.f14465t = (float) d7;
                        break;
                    case 30325:
                        t(i7);
                        this.f2537t.f14466u = (float) d7;
                        break;
                }
        }
    }

    protected final void j(int i7, long j7) {
        if (i7 == 20529) {
            if (j7 == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j7);
            sb.append(" not supported");
            throw dz.a(sb.toString(), null);
        }
        if (i7 == 20530) {
            if (j7 == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j7);
            sb2.append(" not supported");
            throw dz.a(sb2.toString(), null);
        }
        switch (i7) {
            case 131:
                t(i7);
                this.f2537t.f14449d = (int) j7;
                return;
            case 136:
                t(i7);
                this.f2537t.V = j7 == 1;
                return;
            case 155:
                this.H = r(j7);
                return;
            case 159:
                t(i7);
                this.f2537t.O = (int) j7;
                return;
            case 176:
                t(i7);
                this.f2537t.f14458m = (int) j7;
                return;
            case 179:
                s(i7);
                this.B.c(r(j7));
                return;
            case 186:
                t(i7);
                this.f2537t.f14459n = (int) j7;
                return;
            case 215:
                t(i7);
                this.f2537t.f14448c = (int) j7;
                return;
            case 231:
                this.A = r(j7);
                return;
            case 238:
                this.O = (int) j7;
                return;
            case 241:
                if (this.D) {
                    return;
                }
                s(i7);
                this.C.c(j7);
                this.D = true;
                return;
            case 251:
                this.P = true;
                return;
            case 16871:
                t(i7);
                this.f2537t.f14452g = (int) j7;
                return;
            case 16980:
                if (j7 == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("ContentCompAlgo ");
                sb3.append(j7);
                sb3.append(" not supported");
                throw dz.a(sb3.toString(), null);
            case 17029:
                if (j7 < 1 || j7 > 2) {
                    StringBuilder sb4 = new StringBuilder(53);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j7);
                    sb4.append(" not supported");
                    throw dz.a(sb4.toString(), null);
                }
                return;
            case 17143:
                if (j7 == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(50);
                sb5.append("EBMLReadVersion ");
                sb5.append(j7);
                sb5.append(" not supported");
                throw dz.a(sb5.toString(), null);
            case 18401:
                if (j7 == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(49);
                sb6.append("ContentEncAlgo ");
                sb6.append(j7);
                sb6.append(" not supported");
                throw dz.a(sb6.toString(), null);
            case 18408:
                if (j7 == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(56);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j7);
                sb7.append(" not supported");
                throw dz.a(sb7.toString(), null);
            case 21420:
                this.f2540w = j7 + this.f2533p;
                return;
            case 21432:
                t(i7);
                int i8 = (int) j7;
                if (i8 == 0) {
                    this.f2537t.f14468w = 0;
                    return;
                }
                if (i8 == 1) {
                    this.f2537t.f14468w = 2;
                    return;
                } else if (i8 == 3) {
                    this.f2537t.f14468w = 1;
                    return;
                } else {
                    if (i8 != 15) {
                        return;
                    }
                    this.f2537t.f14468w = 3;
                    return;
                }
            case 21680:
                t(i7);
                this.f2537t.f14460o = (int) j7;
                return;
            case 21682:
                t(i7);
                this.f2537t.f14462q = (int) j7;
                return;
            case 21690:
                t(i7);
                this.f2537t.f14461p = (int) j7;
                return;
            case 21930:
                t(i7);
                this.f2537t.U = j7 == 1;
                return;
            case 21998:
                t(i7);
                this.f2537t.f14451f = (int) j7;
                return;
            case 22186:
                t(i7);
                this.f2537t.R = j7;
                return;
            case 22203:
                t(i7);
                this.f2537t.S = j7;
                return;
            case 25188:
                t(i7);
                this.f2537t.P = (int) j7;
                return;
            case 30321:
                t(i7);
                int i9 = (int) j7;
                if (i9 == 0) {
                    this.f2537t.f14463r = 0;
                    return;
                }
                if (i9 == 1) {
                    this.f2537t.f14463r = 1;
                    return;
                } else if (i9 == 2) {
                    this.f2537t.f14463r = 2;
                    return;
                } else {
                    if (i9 != 3) {
                        return;
                    }
                    this.f2537t.f14463r = 3;
                    return;
                }
            case 2352003:
                t(i7);
                this.f2537t.f14450e = (int) j7;
                return;
            case 2807729:
                this.f2534q = j7;
                return;
            default:
                switch (i7) {
                    case 21945:
                        t(i7);
                        int i10 = (int) j7;
                        if (i10 == 1) {
                            this.f2537t.A = 2;
                            return;
                        } else {
                            if (i10 != 2) {
                                return;
                            }
                            this.f2537t.A = 1;
                            return;
                        }
                    case 21946:
                        t(i7);
                        int b7 = p14.b((int) j7);
                        if (b7 != -1) {
                            this.f2537t.f14471z = b7;
                            return;
                        }
                        return;
                    case 21947:
                        t(i7);
                        this.f2537t.f14469x = true;
                        int a7 = p14.a((int) j7);
                        if (a7 != -1) {
                            this.f2537t.f14470y = a7;
                            return;
                        }
                        return;
                    case 21948:
                        t(i7);
                        this.f2537t.B = (int) j7;
                        return;
                    case 21949:
                        t(i7);
                        this.f2537t.C = (int) j7;
                        return;
                    default:
                        return;
                }
        }
    }

    protected final void k(int i7, long j7, long j8) {
        wu1.b(this.Z);
        if (i7 == 160) {
            this.P = false;
            return;
        }
        x xVar = null;
        if (i7 == 174) {
            this.f2537t = new y(xVar);
            return;
        }
        if (i7 == 187) {
            this.D = false;
            return;
        }
        if (i7 == 19899) {
            this.f2539v = -1;
            this.f2540w = -1L;
            return;
        }
        if (i7 == 20533) {
            t(i7);
            this.f2537t.f14453h = true;
            return;
        }
        if (i7 == 21968) {
            t(i7);
            this.f2537t.f14469x = true;
            return;
        }
        if (i7 == 408125543) {
            long j9 = this.f2533p;
            if (j9 != -1 && j9 != j7) {
                throw dz.a("Multiple Segment elements not supported", null);
            }
            this.f2533p = j7;
            this.f2532o = j8;
            return;
        }
        if (i7 == 475249515) {
            this.B = new pd2(32);
            this.C = new pd2(32);
        } else if (i7 == 524531317 && !this.f2538u) {
            if (this.f2520c && this.f2542y != -1) {
                this.f2541x = true;
            } else {
                this.Z.p(new od4(this.f2536s, 0L));
                this.f2538u = true;
            }
        }
    }

    protected final void l(int i7, String str) {
        if (i7 == 134) {
            t(i7);
            this.f2537t.f14447b = str;
            return;
        }
        if (i7 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            StringBuilder sb = new StringBuilder(str.length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw dz.a(sb.toString(), null);
        }
        if (i7 == 21358) {
            t(i7);
            this.f2537t.f14446a = str;
        } else {
            if (i7 != 2274716) {
                return;
            }
            t(i7);
            this.f2537t.W = str;
        }
    }
}
