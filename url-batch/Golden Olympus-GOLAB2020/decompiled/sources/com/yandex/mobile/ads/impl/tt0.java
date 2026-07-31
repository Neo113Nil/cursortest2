package com.yandex.mobile.ads.impl;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.yandex.mobile.ads.impl.C1790a;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import com.yandex.mobile.ads.impl.p52;
import com.yandex.mobile.ads.impl.tw1;
import com.yandex.mobile.ads.impl.u30;
import com.yandex.mobile.ads.impl.yb0;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class tt0 implements p70 {

    /* renamed from: c0, reason: collision with root package name */
    private static final byte[] f32573c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final byte[] f32574d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final byte[] f32575e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final byte[] f32576f0;

    /* renamed from: g0, reason: collision with root package name */
    private static final UUID f32577g0;

    /* renamed from: h0, reason: collision with root package name */
    private static final Map<String, Integer> f32578h0;

    /* renamed from: A, reason: collision with root package name */
    private long f32579A;

    /* renamed from: B, reason: collision with root package name */
    private long f32580B;

    /* renamed from: C, reason: collision with root package name */
    private os0 f32581C;

    /* renamed from: D, reason: collision with root package name */
    private os0 f32582D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f32583E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f32584F;

    /* renamed from: G, reason: collision with root package name */
    private int f32585G;

    /* renamed from: H, reason: collision with root package name */
    private long f32586H;

    /* renamed from: I, reason: collision with root package name */
    private long f32587I;

    /* renamed from: J, reason: collision with root package name */
    private int f32588J;

    /* renamed from: K, reason: collision with root package name */
    private int f32589K;

    /* renamed from: L, reason: collision with root package name */
    private int[] f32590L;

    /* renamed from: M, reason: collision with root package name */
    private int f32591M;

    /* renamed from: N, reason: collision with root package name */
    private int f32592N;

    /* renamed from: O, reason: collision with root package name */
    private int f32593O;

    /* renamed from: P, reason: collision with root package name */
    private int f32594P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f32595Q;

    /* renamed from: R, reason: collision with root package name */
    private long f32596R;

    /* renamed from: S, reason: collision with root package name */
    private int f32597S;

    /* renamed from: T, reason: collision with root package name */
    private int f32598T;

    /* renamed from: U, reason: collision with root package name */
    private int f32599U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f32600V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f32601W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f32602X;

    /* renamed from: Y, reason: collision with root package name */
    private int f32603Y;

    /* renamed from: Z, reason: collision with root package name */
    private byte f32604Z;

    /* renamed from: a, reason: collision with root package name */
    private final p40 f32605a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f32606a0;

    /* renamed from: b, reason: collision with root package name */
    private final f92 f32607b;

    /* renamed from: b0, reason: collision with root package name */
    private r70 f32608b0;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<b> f32609c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f32610d;

    /* renamed from: e, reason: collision with root package name */
    private final sf1 f32611e;

    /* renamed from: f, reason: collision with root package name */
    private final sf1 f32612f;

    /* renamed from: g, reason: collision with root package name */
    private final sf1 f32613g;

    /* renamed from: h, reason: collision with root package name */
    private final sf1 f32614h;

    /* renamed from: i, reason: collision with root package name */
    private final sf1 f32615i;

    /* renamed from: j, reason: collision with root package name */
    private final sf1 f32616j;

    /* renamed from: k, reason: collision with root package name */
    private final sf1 f32617k;

    /* renamed from: l, reason: collision with root package name */
    private final sf1 f32618l;

    /* renamed from: m, reason: collision with root package name */
    private final sf1 f32619m;

    /* renamed from: n, reason: collision with root package name */
    private final sf1 f32620n;

    /* renamed from: o, reason: collision with root package name */
    private ByteBuffer f32621o;

    /* renamed from: p, reason: collision with root package name */
    private long f32622p;

    /* renamed from: q, reason: collision with root package name */
    private long f32623q;

    /* renamed from: r, reason: collision with root package name */
    private long f32624r;

    /* renamed from: s, reason: collision with root package name */
    private long f32625s;

    /* renamed from: t, reason: collision with root package name */
    private long f32626t;

    /* renamed from: u, reason: collision with root package name */
    private b f32627u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f32628v;

    /* renamed from: w, reason: collision with root package name */
    private int f32629w;

    /* renamed from: x, reason: collision with root package name */
    private long f32630x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f32631y;

    /* renamed from: z, reason: collision with root package name */
    private long f32632z;

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements o40 {
        /* JADX WARN: Code restructure failed: missing block: B:139:0x02f1, code lost:
        
            throw com.yandex.mobile.ads.impl.wf1.a("EBML lacing sample size out of range.", (java.lang.Exception) null);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(int i4, int i5, lz lzVar) {
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            long j4;
            int i12;
            int i13;
            int i14;
            tt0 tt0Var = tt0.this;
            tt0Var.getClass();
            int i15 = 1;
            int i16 = 0;
            if (i4 != 161 && i4 != 163) {
                if (i4 == 165) {
                    if (tt0Var.f32585G != 2) {
                        return;
                    }
                    b bVar = (b) tt0Var.f32609c.get(tt0Var.f32591M);
                    if (tt0Var.f32594P != 4 || !"V_VP9".equals(bVar.f32660b)) {
                        lzVar.a(i5);
                        return;
                    } else {
                        tt0Var.f32620n.c(i5);
                        lzVar.a(tt0Var.f32620n.c(), 0, i5, false);
                        return;
                    }
                }
                if (i4 == 16877) {
                    tt0Var.a(i4);
                    b bVar2 = tt0Var.f32627u;
                    int i17 = bVar2.f32665g;
                    if (i17 != 1685485123 && i17 != 1685480259) {
                        lzVar.a(i5);
                        return;
                    }
                    byte[] bArr = new byte[i5];
                    bVar2.f32647N = bArr;
                    lzVar.a(bArr, 0, i5, false);
                    return;
                }
                if (i4 == 16981) {
                    tt0Var.a(i4);
                    b bVar3 = tt0Var.f32627u;
                    byte[] bArr2 = new byte[i5];
                    bVar3.f32667i = bArr2;
                    lzVar.a(bArr2, 0, i5, false);
                    return;
                }
                if (i4 == 18402) {
                    byte[] bArr3 = new byte[i5];
                    lzVar.a(bArr3, 0, i5, false);
                    tt0Var.a(i4);
                    tt0Var.f32627u.f32668j = new p52.a(1, 0, 0, bArr3);
                    return;
                }
                if (i4 == 21419) {
                    Arrays.fill(tt0Var.f32615i.c(), (byte) 0);
                    lzVar.a(tt0Var.f32615i.c(), 4 - i5, i5, false);
                    tt0Var.f32615i.e(0);
                    tt0Var.f32629w = (int) tt0Var.f32615i.v();
                    return;
                }
                if (i4 == 25506) {
                    tt0Var.a(i4);
                    b bVar4 = tt0Var.f32627u;
                    byte[] bArr4 = new byte[i5];
                    bVar4.f32669k = bArr4;
                    lzVar.a(bArr4, 0, i5, false);
                    return;
                }
                if (i4 != 30322) {
                    throw wf1.a("Unexpected id: " + i4, (Exception) null);
                }
                tt0Var.a(i4);
                b bVar5 = tt0Var.f32627u;
                byte[] bArr5 = new byte[i5];
                bVar5.f32680v = bArr5;
                lzVar.a(bArr5, 0, i5, false);
                return;
            }
            int i18 = 8;
            if (tt0Var.f32585G == 0) {
                tt0Var.f32591M = (int) tt0Var.f32607b.a(lzVar, false, true, 8);
                tt0Var.f32592N = tt0Var.f32607b.a();
                tt0Var.f32587I = -9223372036854775807L;
                tt0Var.f32585G = 1;
                tt0Var.f32613g.c(0);
            }
            b bVar6 = (b) tt0Var.f32609c.get(tt0Var.f32591M);
            if (bVar6 == null) {
                lzVar.a(i5 - tt0Var.f32592N);
                tt0Var.f32585G = 0;
                return;
            }
            bVar6.f32657X.getClass();
            if (tt0Var.f32585G == 1) {
                tt0Var.a(lzVar, 3);
                int i19 = (tt0Var.f32613g.c()[2] & 6) >> 1;
                if (i19 == 0) {
                    tt0Var.f32589K = 1;
                    int[] iArr = tt0Var.f32590L;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else if (iArr.length < 1) {
                        iArr = new int[Math.max(iArr.length * 2, 1)];
                    }
                    tt0Var.f32590L = iArr;
                    iArr[0] = (i5 - tt0Var.f32592N) - 3;
                } else {
                    tt0Var.a(lzVar, 4);
                    int i20 = (tt0Var.f32613g.c()[3] & KotlinVersion.MAX_COMPONENT_VALUE) + 1;
                    tt0Var.f32589K = i20;
                    int[] iArr2 = tt0Var.f32590L;
                    if (iArr2 == null) {
                        iArr2 = new int[i20];
                    } else if (iArr2.length < i20) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i20)];
                    }
                    tt0Var.f32590L = iArr2;
                    if (i19 == 2) {
                        int i21 = (i5 - tt0Var.f32592N) - 4;
                        int i22 = tt0Var.f32589K;
                        Arrays.fill(iArr2, 0, i22, i21 / i22);
                    } else if (i19 == 1) {
                        int i23 = 0;
                        int i24 = 0;
                        int i25 = 4;
                        while (true) {
                            i12 = tt0Var.f32589K - 1;
                            if (i23 >= i12) {
                                break;
                            }
                            tt0Var.f32590L[i23] = 0;
                            while (true) {
                                i13 = i25 + 1;
                                tt0Var.a(lzVar, i13);
                                int i26 = tt0Var.f32613g.c()[i25] & 255;
                                int[] iArr3 = tt0Var.f32590L;
                                i14 = iArr3[i23] + i26;
                                iArr3[i23] = i14;
                                if (i26 != 255) {
                                    break;
                                } else {
                                    i25 = i13;
                                }
                            }
                            i24 += i14;
                            i23++;
                            i25 = i13;
                        }
                        tt0Var.f32590L[i12] = ((i5 - tt0Var.f32592N) - i25) - i24;
                    } else {
                        if (i19 != 3) {
                            throw wf1.a("Unexpected lacing value: " + i19, (Exception) null);
                        }
                        int i27 = 0;
                        int i28 = 0;
                        int i29 = 4;
                        while (true) {
                            int i30 = tt0Var.f32589K - i15;
                            if (i27 >= i30) {
                                i6 = i15;
                                i8 = i16;
                                tt0Var.f32590L[i30] = ((i5 - tt0Var.f32592N) - i29) - i28;
                                break;
                            }
                            tt0Var.f32590L[i27] = i16;
                            int i31 = i29 + 1;
                            tt0Var.a(lzVar, i31);
                            if (tt0Var.f32613g.c()[i29] == 0) {
                                throw wf1.a("No valid varint length mask found", (Exception) null);
                            }
                            int i32 = i16;
                            while (true) {
                                if (i32 >= i18) {
                                    i9 = i18;
                                    i10 = i15;
                                    i11 = i16;
                                    j4 = 0;
                                    i29 = i31;
                                    break;
                                }
                                i9 = i18;
                                int i33 = i15 << (7 - i32);
                                if ((tt0Var.f32613g.c()[i29] & i33) != 0) {
                                    i10 = i15;
                                    int i34 = i31 + i32;
                                    tt0Var.a(lzVar, i34);
                                    int i35 = tt0Var.f32613g.c()[i29] & 255 & (~i33);
                                    i11 = i16;
                                    j4 = i35;
                                    for (int i36 = i31; i36 < i34; i36++) {
                                        j4 = (j4 << i9) | (tt0Var.f32613g.c()[i36] & 255);
                                    }
                                    if (i27 > 0) {
                                        j4 -= (1 << ((i32 * 7) + 6)) - 1;
                                    }
                                    i29 = i34;
                                } else {
                                    i32++;
                                    i18 = i9;
                                }
                            }
                            if (j4 < -2147483648L || j4 > 2147483647L) {
                                break;
                            }
                            int i37 = (int) j4;
                            int[] iArr4 = tt0Var.f32590L;
                            if (i27 != 0) {
                                i37 += iArr4[i27 - 1];
                            }
                            iArr4[i27] = i37;
                            i28 += i37;
                            i27++;
                            i15 = i10;
                            i18 = i9;
                            i16 = i11;
                        }
                        tt0Var.f32586H = tt0Var.f32580B + tt0Var.a((tt0Var.f32613g.c()[i8] << 8) | (tt0Var.f32613g.c()[i6] & 255));
                        tt0Var.f32593O = (bVar6.f32662d != 2 || (i4 == 163 && (tt0Var.f32613g.c()[2] & 128) == 128)) ? i6 : i8;
                        tt0Var.f32585G = 2;
                        tt0Var.f32588J = i8;
                        i7 = 163;
                    }
                }
                i6 = 1;
                i8 = 0;
                tt0Var.f32586H = tt0Var.f32580B + tt0Var.a((tt0Var.f32613g.c()[i8] << 8) | (tt0Var.f32613g.c()[i6] & 255));
                tt0Var.f32593O = (bVar6.f32662d != 2 || (i4 == 163 && (tt0Var.f32613g.c()[2] & 128) == 128)) ? i6 : i8;
                tt0Var.f32585G = 2;
                tt0Var.f32588J = i8;
                i7 = 163;
            } else {
                i6 = 1;
                i7 = 163;
            }
            if (i4 == i7) {
                while (true) {
                    int i38 = tt0Var.f32588J;
                    if (i38 >= tt0Var.f32589K) {
                        tt0Var.f32585G = 0;
                        return;
                    } else {
                        tt0Var.a(bVar6, ((tt0Var.f32588J * bVar6.f32663e) / 1000) + tt0Var.f32586H, tt0Var.f32593O, tt0Var.a(lzVar, bVar6, tt0Var.f32590L[i38], false), 0);
                        tt0Var.f32588J++;
                    }
                }
            } else {
                while (true) {
                    int i39 = tt0Var.f32588J;
                    if (i39 >= tt0Var.f32589K) {
                        return;
                    }
                    int[] iArr5 = tt0Var.f32590L;
                    boolean z4 = i6;
                    iArr5[i39] = tt0Var.a(lzVar, bVar6, iArr5[i39], z4);
                    tt0Var.f32588J += z4 ? 1 : 0;
                }
            }
        }

        private a() {
        }

        public final void a(int i4, double d4) {
            tt0 tt0Var = tt0.this;
            if (i4 == 181) {
                tt0Var.a(i4);
                tt0Var.f32627u.f32650Q = (int) d4;
                return;
            }
            if (i4 != 17545) {
                switch (i4) {
                    case 21969:
                        tt0Var.a(i4);
                        tt0Var.f32627u.f32637D = (float) d4;
                        break;
                    case 21970:
                        tt0Var.a(i4);
                        tt0Var.f32627u.f32638E = (float) d4;
                        break;
                    case 21971:
                        tt0Var.a(i4);
                        tt0Var.f32627u.f32639F = (float) d4;
                        break;
                    case 21972:
                        tt0Var.a(i4);
                        tt0Var.f32627u.f32640G = (float) d4;
                        break;
                    case 21973:
                        tt0Var.a(i4);
                        tt0Var.f32627u.f32641H = (float) d4;
                        break;
                    case 21974:
                        tt0Var.a(i4);
                        tt0Var.f32627u.f32642I = (float) d4;
                        break;
                    case 21975:
                        tt0Var.a(i4);
                        tt0Var.f32627u.f32643J = (float) d4;
                        break;
                    case 21976:
                        tt0Var.a(i4);
                        tt0Var.f32627u.f32644K = (float) d4;
                        break;
                    case 21977:
                        tt0Var.a(i4);
                        tt0Var.f32627u.f32645L = (float) d4;
                        break;
                    case 21978:
                        tt0Var.a(i4);
                        tt0Var.f32627u.f32646M = (float) d4;
                        break;
                    default:
                        switch (i4) {
                            case 30323:
                                tt0Var.a(i4);
                                tt0Var.f32627u.f32677s = (float) d4;
                                break;
                            case 30324:
                                tt0Var.a(i4);
                                tt0Var.f32627u.f32678t = (float) d4;
                                break;
                            case 30325:
                                tt0Var.a(i4);
                                tt0Var.f32627u.f32679u = (float) d4;
                                break;
                            default:
                                tt0Var.getClass();
                                break;
                        }
                }
                return;
            }
            tt0Var.f32625s = (long) d4;
        }

        public final void a(int i4, long j4) {
            os0 os0Var;
            tt0 tt0Var = tt0.this;
            tt0Var.getClass();
            if (i4 == 20529) {
                if (j4 == 0) {
                    return;
                }
                throw wf1.a("ContentEncodingOrder " + j4 + " not supported", (Exception) null);
            }
            if (i4 == 20530) {
                if (j4 == 1) {
                    return;
                }
                throw wf1.a("ContentEncodingScope " + j4 + " not supported", (Exception) null);
            }
            int i5 = 3;
            int i6 = 2;
            switch (i4) {
                case 131:
                    tt0Var.a(i4);
                    tt0Var.f32627u.f32662d = (int) j4;
                    return;
                case 136:
                    tt0Var.a(i4);
                    tt0Var.f32627u.f32655V = j4 == 1;
                    return;
                case 155:
                    tt0Var.f32587I = tt0Var.a(j4);
                    return;
                case 159:
                    tt0Var.a(i4);
                    tt0Var.f32627u.f32648O = (int) j4;
                    return;
                case 176:
                    tt0Var.a(i4);
                    tt0Var.f32627u.f32671m = (int) j4;
                    return;
                case 179:
                    os0 os0Var2 = tt0Var.f32581C;
                    if (os0Var2 != null && tt0Var.f32582D != null) {
                        os0Var2.a(tt0Var.a(j4));
                        return;
                    }
                    throw wf1.a("Element " + i4 + " must be in a Cues", (Exception) null);
                case 186:
                    tt0Var.a(i4);
                    tt0Var.f32627u.f32672n = (int) j4;
                    return;
                case 215:
                    tt0Var.a(i4);
                    tt0Var.f32627u.f32661c = (int) j4;
                    return;
                case 231:
                    tt0Var.f32580B = tt0Var.a(j4);
                    return;
                case 238:
                    tt0Var.f32594P = (int) j4;
                    return;
                case 241:
                    if (tt0Var.f32583E) {
                        return;
                    }
                    if (tt0Var.f32581C != null && (os0Var = tt0Var.f32582D) != null) {
                        os0Var.a(j4);
                        tt0Var.f32583E = true;
                        return;
                    } else {
                        throw wf1.a("Element " + i4 + " must be in a Cues", (Exception) null);
                    }
                case 251:
                    tt0Var.f32595Q = true;
                    return;
                case 16871:
                    tt0Var.a(i4);
                    tt0Var.f32627u.f32665g = (int) j4;
                    return;
                case 16980:
                    if (j4 == 3) {
                        return;
                    }
                    throw wf1.a("ContentCompAlgo " + j4 + " not supported", (Exception) null);
                case 17029:
                    if (j4 < 1 || j4 > 2) {
                        throw wf1.a("DocTypeReadVersion " + j4 + " not supported", (Exception) null);
                    }
                    return;
                case 17143:
                    if (j4 == 1) {
                        return;
                    }
                    throw wf1.a("EBMLReadVersion " + j4 + " not supported", (Exception) null);
                case 18401:
                    if (j4 == 5) {
                        return;
                    }
                    throw wf1.a("ContentEncAlgo " + j4 + " not supported", (Exception) null);
                case 18408:
                    if (j4 == 1) {
                        return;
                    }
                    throw wf1.a("AESSettingsCipherMode " + j4 + " not supported", (Exception) null);
                case 21420:
                    tt0Var.f32630x = j4 + tt0Var.f32623q;
                    return;
                case 21432:
                    int i7 = (int) j4;
                    tt0Var.a(i4);
                    if (i7 == 0) {
                        tt0Var.f32627u.f32681w = 0;
                        return;
                    }
                    if (i7 == 1) {
                        tt0Var.f32627u.f32681w = 2;
                        return;
                    } else if (i7 == 3) {
                        tt0Var.f32627u.f32681w = 1;
                        return;
                    } else {
                        if (i7 != 15) {
                            return;
                        }
                        tt0Var.f32627u.f32681w = 3;
                        return;
                    }
                case 21680:
                    tt0Var.a(i4);
                    tt0Var.f32627u.f32673o = (int) j4;
                    return;
                case 21682:
                    tt0Var.a(i4);
                    tt0Var.f32627u.f32675q = (int) j4;
                    return;
                case 21690:
                    tt0Var.a(i4);
                    tt0Var.f32627u.f32674p = (int) j4;
                    return;
                case 21930:
                    tt0Var.a(i4);
                    tt0Var.f32627u.f32654U = j4 == 1;
                    return;
                case 21998:
                    tt0Var.a(i4);
                    tt0Var.f32627u.f32664f = (int) j4;
                    return;
                case 22186:
                    tt0Var.a(i4);
                    tt0Var.f32627u.f32651R = j4;
                    return;
                case 22203:
                    tt0Var.a(i4);
                    tt0Var.f32627u.f32652S = j4;
                    return;
                case 25188:
                    tt0Var.a(i4);
                    tt0Var.f32627u.f32649P = (int) j4;
                    return;
                case 30114:
                    tt0Var.f32596R = j4;
                    return;
                case 30321:
                    tt0Var.a(i4);
                    int i8 = (int) j4;
                    if (i8 == 0) {
                        tt0Var.f32627u.f32676r = 0;
                        return;
                    }
                    if (i8 == 1) {
                        tt0Var.f32627u.f32676r = 1;
                        return;
                    } else if (i8 == 2) {
                        tt0Var.f32627u.f32676r = 2;
                        return;
                    } else {
                        if (i8 != 3) {
                            return;
                        }
                        tt0Var.f32627u.f32676r = 3;
                        return;
                    }
                case 2352003:
                    tt0Var.a(i4);
                    tt0Var.f32627u.f32663e = (int) j4;
                    return;
                case 2807729:
                    tt0Var.f32624r = j4;
                    return;
                default:
                    switch (i4) {
                        case 21945:
                            tt0Var.a(i4);
                            int i9 = (int) j4;
                            if (i9 == 1) {
                                tt0Var.f32627u.f32634A = 2;
                                return;
                            } else {
                                if (i9 != 2) {
                                    return;
                                }
                                tt0Var.f32627u.f32634A = 1;
                                return;
                            }
                        case 21946:
                            tt0Var.a(i4);
                            int i10 = (int) j4;
                            InterfaceC2259tl.a<eq> aVar = eq.f25385g;
                            if (i10 != 1) {
                                if (i10 == 16) {
                                    i5 = 6;
                                } else if (i10 == 18) {
                                    i5 = 7;
                                } else if (i10 != 6 && i10 != 7) {
                                    i5 = -1;
                                }
                            }
                            if (i5 != -1) {
                                tt0Var.f32627u.f32684z = i5;
                                return;
                            }
                            return;
                        case 21947:
                            tt0Var.a(i4);
                            b bVar = tt0Var.f32627u;
                            bVar.f32682x = true;
                            int i11 = (int) j4;
                            InterfaceC2259tl.a<eq> aVar2 = eq.f25385g;
                            if (i11 == 1) {
                                i6 = 1;
                            } else if (i11 == 9) {
                                i6 = 6;
                            } else if (i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
                                i6 = -1;
                            }
                            if (i6 != -1) {
                                bVar.f32683y = i6;
                                return;
                            }
                            return;
                        case 21948:
                            tt0Var.a(i4);
                            tt0Var.f32627u.f32635B = (int) j4;
                            return;
                        case 21949:
                            tt0Var.a(i4);
                            tt0Var.f32627u.f32636C = (int) j4;
                            return;
                        default:
                            return;
                    }
            }
        }

        public final void a(int i4, long j4, long j5) {
            tt0 tt0Var = tt0.this;
            r70 r70Var = tt0Var.f32608b0;
            if (r70Var == null) {
                throw new IllegalStateException();
            }
            if (i4 == 160) {
                tt0Var.f32595Q = false;
                tt0Var.f32596R = 0L;
                return;
            }
            if (i4 == 174) {
                tt0Var.f32627u = new b();
                return;
            }
            if (i4 == 187) {
                tt0Var.f32583E = false;
                return;
            }
            if (i4 == 19899) {
                tt0Var.f32629w = -1;
                tt0Var.f32630x = -1L;
                return;
            }
            if (i4 == 20533) {
                tt0Var.a(i4);
                tt0Var.f32627u.f32666h = true;
                return;
            }
            if (i4 == 21968) {
                tt0Var.a(i4);
                tt0Var.f32627u.f32682x = true;
                return;
            }
            if (i4 == 408125543) {
                long j6 = tt0Var.f32623q;
                if (j6 == -1 || j6 == j4) {
                    tt0Var.f32623q = j4;
                    tt0Var.f32622p = j5;
                    return;
                }
                throw wf1.a("Multiple Segment elements not supported", (Exception) null);
            }
            if (i4 != 475249515) {
                if (i4 == 524531317 && !tt0Var.f32628v) {
                    if (tt0Var.f32610d && tt0Var.f32632z != -1) {
                        tt0Var.f32631y = true;
                        return;
                    } else {
                        r70Var.a(new tw1.b(tt0Var.f32626t, 0L));
                        tt0Var.f32628v = true;
                        return;
                    }
                }
                return;
            }
            tt0Var.f32581C = new os0(0);
            tt0Var.f32582D = new os0(0);
        }

        public final void a(int i4, String str) {
            tt0 tt0Var = tt0.this;
            tt0Var.getClass();
            if (i4 == 134) {
                tt0Var.a(i4);
                tt0Var.f32627u.f32660b = str;
                return;
            }
            if (i4 == 17026) {
                if ("webm".equals(str) || "matroska".equals(str)) {
                    return;
                }
                throw wf1.a("DocType " + str + " not supported", (Exception) null);
            }
            if (i4 == 21358) {
                tt0Var.a(i4);
                tt0Var.f32627u.f32659a = str;
            } else {
                if (i4 != 2274716) {
                    return;
                }
                tt0Var.a(i4);
                tt0Var.f32627u.f32656W = str;
            }
        }
    }

    protected static final class b {

        /* renamed from: N, reason: collision with root package name */
        public byte[] f32647N;

        /* renamed from: T, reason: collision with root package name */
        public x62 f32653T;

        /* renamed from: U, reason: collision with root package name */
        public boolean f32654U;

        /* renamed from: X, reason: collision with root package name */
        public p52 f32657X;

        /* renamed from: Y, reason: collision with root package name */
        public int f32658Y;

        /* renamed from: a, reason: collision with root package name */
        public String f32659a;

        /* renamed from: b, reason: collision with root package name */
        public String f32660b;

        /* renamed from: c, reason: collision with root package name */
        public int f32661c;

        /* renamed from: d, reason: collision with root package name */
        public int f32662d;

        /* renamed from: e, reason: collision with root package name */
        public int f32663e;

        /* renamed from: f, reason: collision with root package name */
        public int f32664f;

        /* renamed from: g, reason: collision with root package name */
        private int f32665g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f32666h;

        /* renamed from: i, reason: collision with root package name */
        public byte[] f32667i;

        /* renamed from: j, reason: collision with root package name */
        public p52.a f32668j;

        /* renamed from: k, reason: collision with root package name */
        public byte[] f32669k;

        /* renamed from: l, reason: collision with root package name */
        public u30 f32670l;

        /* renamed from: m, reason: collision with root package name */
        public int f32671m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f32672n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f32673o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f32674p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f32675q = 0;

        /* renamed from: r, reason: collision with root package name */
        public int f32676r = -1;

        /* renamed from: s, reason: collision with root package name */
        public float f32677s = 0.0f;

        /* renamed from: t, reason: collision with root package name */
        public float f32678t = 0.0f;

        /* renamed from: u, reason: collision with root package name */
        public float f32679u = 0.0f;

        /* renamed from: v, reason: collision with root package name */
        public byte[] f32680v = null;

        /* renamed from: w, reason: collision with root package name */
        public int f32681w = -1;

        /* renamed from: x, reason: collision with root package name */
        public boolean f32682x = false;

        /* renamed from: y, reason: collision with root package name */
        public int f32683y = -1;

        /* renamed from: z, reason: collision with root package name */
        public int f32684z = -1;

        /* renamed from: A, reason: collision with root package name */
        public int f32634A = -1;

        /* renamed from: B, reason: collision with root package name */
        public int f32635B = 1000;

        /* renamed from: C, reason: collision with root package name */
        public int f32636C = 200;

        /* renamed from: D, reason: collision with root package name */
        public float f32637D = -1.0f;

        /* renamed from: E, reason: collision with root package name */
        public float f32638E = -1.0f;

        /* renamed from: F, reason: collision with root package name */
        public float f32639F = -1.0f;

        /* renamed from: G, reason: collision with root package name */
        public float f32640G = -1.0f;

        /* renamed from: H, reason: collision with root package name */
        public float f32641H = -1.0f;

        /* renamed from: I, reason: collision with root package name */
        public float f32642I = -1.0f;

        /* renamed from: J, reason: collision with root package name */
        public float f32643J = -1.0f;

        /* renamed from: K, reason: collision with root package name */
        public float f32644K = -1.0f;

        /* renamed from: L, reason: collision with root package name */
        public float f32645L = -1.0f;

        /* renamed from: M, reason: collision with root package name */
        public float f32646M = -1.0f;

        /* renamed from: O, reason: collision with root package name */
        public int f32648O = 1;

        /* renamed from: P, reason: collision with root package name */
        public int f32649P = -1;

        /* renamed from: Q, reason: collision with root package name */
        public int f32650Q = JosStatusCodes.RTN_CODE_COMMON_ERROR;

        /* renamed from: R, reason: collision with root package name */
        public long f32651R = 0;

        /* renamed from: S, reason: collision with root package name */
        public long f32652S = 0;

        /* renamed from: V, reason: collision with root package name */
        public boolean f32655V = true;

        /* renamed from: W, reason: collision with root package name */
        private String f32656W = "eng";

        protected b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] a(String str) {
            byte[] bArr = this.f32669k;
            if (bArr != null) {
                return bArr;
            }
            throw wf1.a("Missing CodecPrivate for codec " + str, (Exception) null);
        }
    }

    static {
        new t70() { // from class: com.yandex.mobile.ads.impl.Je
            @Override // com.yandex.mobile.ads.impl.t70
            public final p70[] a() {
                p70[] a4;
                a4 = tt0.a();
                return a4;
            }
        };
        f32573c0 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        f32574d0 = u82.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        f32575e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f32576f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f32577g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        st0.a(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        st0.a(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f32578h0 = Collections.unmodifiableMap(hashMap);
    }

    public tt0() {
        this(new jz());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i4) {
        if (this.f32627u != null) {
            return;
        }
        throw wf1.a("Element " + i4 + " must be in a TrackEntry", (Exception) null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0807, code lost:
    
        if (r2.p() == r5.getLeastSignificantBits()) goto L492;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0a67  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0887  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x09cf  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x09d1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0868  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void b(int i4) {
        char c4;
        int i5;
        List<byte[]> singletonList;
        int i6;
        int i7;
        String str;
        Pair pair;
        String str2;
        List<byte[]> a4;
        List<byte[]> list;
        String str3;
        int i8;
        byte[] bArr;
        String str4;
        yb0.a aVar;
        int i9;
        int i10;
        eq eqVar;
        int i11;
        int i12;
        byte[] bArr2;
        int i13;
        String str5;
        i30 a5;
        tw1 bVar;
        int i14;
        r70 r70Var = this.f32608b0;
        if (r70Var == null) {
            throw new IllegalStateException();
        }
        if (i4 == 160) {
            if (this.f32585G != 2) {
                return;
            }
            b bVar2 = this.f32609c.get(this.f32591M);
            bVar2.f32657X.getClass();
            if (this.f32596R > 0 && "A_OPUS".equals(bVar2.f32660b)) {
                this.f32620n.a(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f32596R).array());
            }
            int i15 = 0;
            for (int i16 = 0; i16 < this.f32589K; i16++) {
                i15 += this.f32590L[i16];
            }
            int i17 = 0;
            while (i17 < this.f32589K) {
                long j4 = this.f32586H + ((bVar2.f32663e * i17) / 1000);
                int i18 = this.f32593O;
                if (i17 == 0 && !this.f32595Q) {
                    i18 |= 1;
                }
                int i19 = this.f32590L[i17];
                int i20 = i15 - i19;
                a(bVar2, j4, i18, i19, i20);
                i17++;
                i15 = i20;
            }
            this.f32585G = 0;
            return;
        }
        if (i4 != 174) {
            if (i4 == 19899) {
                int i21 = this.f32629w;
                if (i21 != -1) {
                    long j5 = this.f32630x;
                    if (j5 != -1) {
                        if (i21 == 475249515) {
                            this.f32632z = j5;
                            return;
                        }
                        return;
                    }
                }
                throw wf1.a("Mandatory element SeekID or SeekPosition not found", (Exception) null);
            }
            if (i4 == 25152) {
                a(i4);
                b bVar3 = this.f32627u;
                if (bVar3.f32666h) {
                    p52.a aVar2 = bVar3.f32668j;
                    if (aVar2 == null) {
                        throw wf1.a("Encrypted Track found but ContentEncKeyID was not found", (Exception) null);
                    }
                    bVar3.f32670l = new u30(new u30.b(C1813am.f23358a, null, "video/webm", aVar2.f30346b));
                    return;
                }
                return;
            }
            if (i4 == 28032) {
                a(i4);
                b bVar4 = this.f32627u;
                if (bVar4.f32666h && bVar4.f32667i != null) {
                    throw wf1.a("Combining encryption and compression is not supported", (Exception) null);
                }
                return;
            }
            if (i4 == 357149030) {
                if (this.f32624r == -9223372036854775807L) {
                    this.f32624r = 1000000L;
                }
                long j6 = this.f32625s;
                if (j6 != -9223372036854775807L) {
                    this.f32626t = a(j6);
                    return;
                }
                return;
            }
            if (i4 == 374648427) {
                if (this.f32609c.size() == 0) {
                    throw wf1.a("No valid tracks were found", (Exception) null);
                }
                this.f32608b0.a();
                return;
            }
            if (i4 != 475249515) {
                return;
            }
            if (!this.f32628v) {
                os0 os0Var = this.f32581C;
                os0 os0Var2 = this.f32582D;
                if (this.f32623q == -1 || this.f32626t == -9223372036854775807L || os0Var == null || os0Var.a() == 0 || os0Var2 == null || os0Var2.a() != os0Var.a()) {
                    bVar = new tw1.b(this.f32626t, 0L);
                } else {
                    int a6 = os0Var.a();
                    int[] iArr = new int[a6];
                    long[] jArr = new long[a6];
                    long[] jArr2 = new long[a6];
                    long[] jArr3 = new long[a6];
                    for (int i22 = 0; i22 < a6; i22++) {
                        jArr3[i22] = os0Var.a(i22);
                        jArr[i22] = os0Var2.a(i22) + this.f32623q;
                    }
                    int i23 = 0;
                    while (true) {
                        i14 = a6 - 1;
                        if (i23 >= i14) {
                            break;
                        }
                        int i24 = i23 + 1;
                        iArr[i23] = (int) (jArr[i24] - jArr[i23]);
                        jArr2[i23] = jArr3[i24] - jArr3[i23];
                        i23 = i24;
                    }
                    iArr[i14] = (int) ((this.f32623q + this.f32622p) - jArr[i14]);
                    long j7 = this.f32626t - jArr3[i14];
                    jArr2[i14] = j7;
                    if (j7 <= 0) {
                        ms0.d("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j7);
                        iArr = Arrays.copyOf(iArr, i14);
                        jArr = Arrays.copyOf(jArr, i14);
                        jArr2 = Arrays.copyOf(jArr2, i14);
                        jArr3 = Arrays.copyOf(jArr3, i14);
                    }
                    bVar = new vn(iArr, jArr, jArr2, jArr3);
                }
                r70Var.a(bVar);
                this.f32628v = true;
            }
            this.f32581C = null;
            this.f32582D = null;
            return;
        }
        b bVar5 = this.f32627u;
        if (bVar5 == null) {
            throw new IllegalStateException();
        }
        String str6 = bVar5.f32660b;
        if (str6 == null) {
            throw wf1.a("CodecId is missing in TrackEntry element", (Exception) null);
        }
        switch (str6) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                int i25 = bVar5.f32661c;
                String str7 = "audio/raw";
                switch (str6.hashCode()) {
                    case -2095576542:
                        if (str6.equals("V_MPEG4/ISO/AP")) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -2095575984:
                        if (str6.equals("V_MPEG4/ISO/SP")) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1985379776:
                        if (str6.equals("A_MS/ACM")) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1784763192:
                        if (str6.equals("A_TRUEHD")) {
                            c4 = 3;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1730367663:
                        if (str6.equals("A_VORBIS")) {
                            c4 = 4;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1482641358:
                        if (str6.equals("A_MPEG/L2")) {
                            c4 = 5;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1482641357:
                        if (str6.equals("A_MPEG/L3")) {
                            c4 = 6;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1373388978:
                        if (str6.equals("V_MS/VFW/FOURCC")) {
                            c4 = 7;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -933872740:
                        if (str6.equals("S_DVBSUB")) {
                            c4 = '\b';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -538363189:
                        if (str6.equals("V_MPEG4/ISO/ASP")) {
                            c4 = '\t';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -538363109:
                        if (str6.equals("V_MPEG4/ISO/AVC")) {
                            c4 = '\n';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -425012669:
                        if (str6.equals("S_VOBSUB")) {
                            c4 = 11;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -356037306:
                        if (str6.equals("A_DTS/LOSSLESS")) {
                            c4 = '\f';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 62923557:
                        if (str6.equals("A_AAC")) {
                            c4 = '\r';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 62923603:
                        if (str6.equals("A_AC3")) {
                            c4 = 14;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 62927045:
                        if (str6.equals("A_DTS")) {
                            c4 = 15;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 82318131:
                        if (str6.equals("V_AV1")) {
                            c4 = 16;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 82338133:
                        if (str6.equals("V_VP8")) {
                            c4 = 17;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 82338134:
                        if (str6.equals("V_VP9")) {
                            c4 = 18;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 99146302:
                        if (str6.equals("S_HDMV/PGS")) {
                            c4 = 19;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 444813526:
                        if (str6.equals("V_THEORA")) {
                            c4 = 20;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 542569478:
                        if (str6.equals("A_DTS/EXPRESS")) {
                            c4 = 21;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 635596514:
                        if (str6.equals("A_PCM/FLOAT/IEEE")) {
                            c4 = 22;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 725948237:
                        if (str6.equals("A_PCM/INT/BIG")) {
                            c4 = 23;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 725957860:
                        if (str6.equals("A_PCM/INT/LIT")) {
                            c4 = 24;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 738597099:
                        if (str6.equals("S_TEXT/ASS")) {
                            c4 = 25;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 855502857:
                        if (str6.equals("V_MPEGH/ISO/HEVC")) {
                            c4 = 26;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1045209816:
                        if (str6.equals("S_TEXT/WEBVTT")) {
                            c4 = 27;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1422270023:
                        if (str6.equals("S_TEXT/UTF8")) {
                            c4 = 28;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1809237540:
                        if (str6.equals("V_MPEG2")) {
                            c4 = 29;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1950749482:
                        if (str6.equals("A_EAC3")) {
                            c4 = 30;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1950789798:
                        if (str6.equals("A_FLAC")) {
                            c4 = 31;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1951062397:
                        if (str6.equals("A_OPUS")) {
                            c4 = ' ';
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                switch (c4) {
                    case 0:
                    case 1:
                    case '\t':
                        i5 = 3;
                        byte[] bArr3 = bVar5.f32669k;
                        str7 = "video/mp4v-es";
                        if (bArr3 != null) {
                            singletonList = Collections.singletonList(bArr3);
                            i6 = -1;
                            i7 = -1;
                            str = null;
                            bArr = bVar5.f32647N;
                            if (bArr != null && (a5 = i30.a(new sf1(bArr))) != null) {
                                str = a5.f27079a;
                                str7 = "video/dolby-vision";
                            }
                            str4 = str7;
                            int i26 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                            aVar = new yb0.a();
                            if (!i01.d(str4)) {
                                aVar.c(bVar5.f32648O).l(bVar5.f32650Q).i(i7);
                                i9 = 1;
                            } else if (i01.f(str4)) {
                                if (bVar5.f32675q == 0) {
                                    int i27 = bVar5.f32673o;
                                    i10 = -1;
                                    if (i27 == -1) {
                                        i27 = bVar5.f32671m;
                                    }
                                    bVar5.f32673o = i27;
                                    int i28 = bVar5.f32674p;
                                    if (i28 == -1) {
                                        i28 = bVar5.f32672n;
                                    }
                                    bVar5.f32674p = i28;
                                } else {
                                    i10 = -1;
                                }
                                float f4 = (bVar5.f32673o == i10 || (i13 = bVar5.f32674p) == i10) ? -1.0f : (bVar5.f32672n * r3) / (bVar5.f32671m * i13);
                                if (bVar5.f32682x) {
                                    if (bVar5.f32637D == -1.0f || bVar5.f32638E == -1.0f || bVar5.f32639F == -1.0f || bVar5.f32640G == -1.0f || bVar5.f32641H == -1.0f || bVar5.f32642I == -1.0f || bVar5.f32643J == -1.0f || bVar5.f32644K == -1.0f || bVar5.f32645L == -1.0f || bVar5.f32646M == -1.0f) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = new byte[25];
                                        ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                        order.put((byte) 0);
                                        order.putShort((short) ((bVar5.f32637D * 50000.0f) + 0.5f));
                                        order.putShort((short) ((bVar5.f32638E * 50000.0f) + 0.5f));
                                        order.putShort((short) ((bVar5.f32639F * 50000.0f) + 0.5f));
                                        order.putShort((short) ((bVar5.f32640G * 50000.0f) + 0.5f));
                                        order.putShort((short) ((bVar5.f32641H * 50000.0f) + 0.5f));
                                        order.putShort((short) ((bVar5.f32642I * 50000.0f) + 0.5f));
                                        order.putShort((short) ((bVar5.f32643J * 50000.0f) + 0.5f));
                                        order.putShort((short) ((bVar5.f32644K * 50000.0f) + 0.5f));
                                        order.putShort((short) (bVar5.f32645L + 0.5f));
                                        order.putShort((short) (bVar5.f32646M + 0.5f));
                                        order.putShort((short) bVar5.f32635B);
                                        order.putShort((short) bVar5.f32636C);
                                    }
                                    eqVar = new eq(bVar5.f32683y, bVar5.f32634A, bVar5.f32684z, bArr2);
                                } else {
                                    eqVar = null;
                                }
                                String str8 = bVar5.f32659a;
                                if (str8 != null) {
                                    Map<String, Integer> map = f32578h0;
                                    if (map.containsKey(str8)) {
                                        i11 = map.get(bVar5.f32659a).intValue();
                                        if (bVar5.f32676r == 0 && Float.compare(bVar5.f32677s, 0.0f) == 0 && Float.compare(bVar5.f32678t, 0.0f) == 0) {
                                            if (Float.compare(bVar5.f32679u, 0.0f) != 0) {
                                                i12 = 0;
                                            } else if (Float.compare(bVar5.f32678t, 90.0f) == 0) {
                                                i12 = 90;
                                            } else if (Float.compare(bVar5.f32678t, -180.0f) == 0 || Float.compare(bVar5.f32678t, 180.0f) == 0) {
                                                i12 = 180;
                                            } else if (Float.compare(bVar5.f32678t, -90.0f) == 0) {
                                                i12 = 270;
                                            }
                                            aVar.o(bVar5.f32671m).f(bVar5.f32672n).b(f4).k(i12).a(bVar5.f32680v).n(bVar5.f32681w).a(eqVar);
                                            i9 = 2;
                                        }
                                        i12 = i11;
                                        aVar.o(bVar5.f32671m).f(bVar5.f32672n).b(f4).k(i12).a(bVar5.f32680v).n(bVar5.f32681w).a(eqVar);
                                        i9 = 2;
                                    }
                                }
                                i11 = -1;
                                if (bVar5.f32676r == 0) {
                                    if (Float.compare(bVar5.f32679u, 0.0f) != 0) {
                                    }
                                    aVar.o(bVar5.f32671m).f(bVar5.f32672n).b(f4).k(i12).a(bVar5.f32680v).n(bVar5.f32681w).a(eqVar);
                                    i9 = 2;
                                }
                                i12 = i11;
                                aVar.o(bVar5.f32671m).f(bVar5.f32672n).b(f4).k(i12).a(bVar5.f32680v).n(bVar5.f32681w).a(eqVar);
                                i9 = 2;
                            } else {
                                if (!"application/x-subrip".equals(str4) && !"text/x-ssa".equals(str4) && !"text/vtt".equals(str4) && !"application/vobsub".equals(str4) && !"application/pgs".equals(str4) && !"application/dvbsubs".equals(str4)) {
                                    throw wf1.a("Unexpected MIME type.", (Exception) null);
                                }
                                i9 = i5;
                            }
                            str5 = bVar5.f32659a;
                            if (str5 != null && !f32578h0.containsKey(str5)) {
                                aVar.c(bVar5.f32659a);
                            }
                            yb0 a7 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i26).a(singletonList).a(str).a(bVar5.f32670l).a();
                            p52 a8 = r70Var.a(bVar5.f32661c, i9);
                            bVar5.f32657X = a8;
                            a8.a(a7);
                            this.f32609c.put(bVar5.f32661c, bVar5);
                            break;
                        }
                        i6 = -1;
                        i7 = -1;
                        singletonList = null;
                        str = null;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                            str = a5.f27079a;
                            str7 = "video/dolby-vision";
                        }
                        str4 = str7;
                        int i262 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                            aVar.c(bVar5.f32659a);
                        }
                        yb0 a72 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i262).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a82 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a82;
                        a82.a(a72);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case 2:
                        i5 = 3;
                        sf1 sf1Var = new sf1(bVar5.a(str6));
                        try {
                            int o4 = sf1Var.o();
                            if (o4 != 1) {
                                if (o4 == 65534) {
                                    sf1Var.e(24);
                                    long p4 = sf1Var.p();
                                    UUID uuid = f32577g0;
                                    if (p4 == uuid.getMostSignificantBits()) {
                                        break;
                                    }
                                }
                                ms0.d("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                str7 = "audio/x-unknown";
                                i6 = -1;
                                i7 = -1;
                                singletonList = null;
                                str = null;
                                bArr = bVar5.f32647N;
                                if (bArr != null) {
                                }
                                str4 = str7;
                                int i2622 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                                aVar = new yb0.a();
                                if (!i01.d(str4)) {
                                }
                                str5 = bVar5.f32659a;
                                if (str5 != null) {
                                }
                                yb0 a722 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i2622).a(singletonList).a(str).a(bVar5.f32670l).a();
                                p52 a822 = r70Var.a(bVar5.f32661c, i9);
                                bVar5.f32657X = a822;
                                a822.a(a722);
                                this.f32609c.put(bVar5.f32661c, bVar5);
                                break;
                            }
                            int b4 = u82.b(bVar5.f32649P);
                            if (b4 == 0) {
                                ms0.d("MatroskaExtractor", "Unsupported PCM bit depth: " + bVar5.f32649P + ". Setting mimeType to audio/x-unknown");
                                str7 = "audio/x-unknown";
                                i6 = -1;
                                i7 = -1;
                                singletonList = null;
                                str = null;
                                bArr = bVar5.f32647N;
                                if (bArr != null) {
                                }
                                str4 = str7;
                                int i26222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                                aVar = new yb0.a();
                                if (!i01.d(str4)) {
                                }
                                str5 = bVar5.f32659a;
                                if (str5 != null) {
                                }
                                yb0 a7222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i26222).a(singletonList).a(str).a(bVar5.f32670l).a();
                                p52 a8222 = r70Var.a(bVar5.f32661c, i9);
                                bVar5.f32657X = a8222;
                                a8222.a(a7222);
                                this.f32609c.put(bVar5.f32661c, bVar5);
                            } else {
                                i7 = b4;
                                i6 = -1;
                                singletonList = null;
                                str = null;
                                bArr = bVar5.f32647N;
                                if (bArr != null) {
                                }
                                str4 = str7;
                                int i262222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                                aVar = new yb0.a();
                                if (!i01.d(str4)) {
                                }
                                str5 = bVar5.f32659a;
                                if (str5 != null) {
                                }
                                yb0 a72222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i262222).a(singletonList).a(str).a(bVar5.f32670l).a();
                                p52 a82222 = r70Var.a(bVar5.f32661c, i9);
                                bVar5.f32657X = a82222;
                                a82222.a(a72222);
                                this.f32609c.put(bVar5.f32661c, bVar5);
                            }
                        } catch (ArrayIndexOutOfBoundsException unused) {
                            throw wf1.a("Error parsing MS/ACM codec private", (Exception) null);
                        }
                        break;
                    case 3:
                        i5 = 3;
                        bVar5.f32653T = new x62();
                        str7 = "audio/true-hd";
                        i6 = -1;
                        i7 = -1;
                        singletonList = null;
                        str = null;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i2622222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a722222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i2622222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a822222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a822222;
                        a822222.a(a722222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case 4:
                        byte[] a9 = bVar5.a(str6);
                        try {
                            try {
                                if (a9[0] != 2) {
                                    throw wf1.a("Error parsing vorbis codec private", (Exception) null);
                                }
                                int i29 = 0;
                                int i30 = 1;
                                while (true) {
                                    int i31 = a9[i30] & KotlinVersion.MAX_COMPONENT_VALUE;
                                    if (i31 != 255) {
                                        int i32 = i30 + 1;
                                        int i33 = i29 + i31;
                                        int i34 = 0;
                                        while (true) {
                                            int i35 = a9[i32] & KotlinVersion.MAX_COMPONENT_VALUE;
                                            if (i35 != 255) {
                                                int i36 = i32 + 1;
                                                int i37 = i34 + i35;
                                                if (a9[i36] != 1) {
                                                    throw wf1.a("Error parsing vorbis codec private", (Exception) null);
                                                }
                                                byte[] bArr4 = new byte[i33];
                                                System.arraycopy(a9, i36, bArr4, 0, i33);
                                                int i38 = i36 + i33;
                                                i5 = 3;
                                                if (a9[i38] != 3) {
                                                    throw wf1.a("Error parsing vorbis codec private", (Exception) null);
                                                }
                                                int i39 = i38 + i37;
                                                if (a9[i39] != 5) {
                                                    throw wf1.a("Error parsing vorbis codec private", (Exception) null);
                                                }
                                                byte[] bArr5 = new byte[a9.length - i39];
                                                System.arraycopy(a9, i39, bArr5, 0, a9.length - i39);
                                                ArrayList arrayList = new ArrayList(2);
                                                arrayList.add(bArr4);
                                                arrayList.add(bArr5);
                                                str7 = "audio/vorbis";
                                                singletonList = arrayList;
                                                i6 = 8192;
                                                i7 = -1;
                                                str = null;
                                                bArr = bVar5.f32647N;
                                                if (bArr != null) {
                                                }
                                                str4 = str7;
                                                int i26222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                                                aVar = new yb0.a();
                                                if (!i01.d(str4)) {
                                                }
                                                str5 = bVar5.f32659a;
                                                if (str5 != null) {
                                                }
                                                yb0 a7222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i26222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                                                p52 a8222222 = r70Var.a(bVar5.f32661c, i9);
                                                bVar5.f32657X = a8222222;
                                                a8222222.a(a7222222);
                                                this.f32609c.put(bVar5.f32661c, bVar5);
                                                break;
                                            } else {
                                                i34 += KotlinVersion.MAX_COMPONENT_VALUE;
                                                i32++;
                                            }
                                        }
                                    } else {
                                        i29 += KotlinVersion.MAX_COMPONENT_VALUE;
                                        i30++;
                                    }
                                }
                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                throw wf1.a("Error parsing vorbis codec private", (Exception) null);
                            }
                        } catch (ArrayIndexOutOfBoundsException unused3) {
                        }
                        break;
                    case 5:
                        str7 = "audio/mpeg-L2";
                        i6 = Base64Utils.IO_BUFFER_SIZE;
                        i7 = -1;
                        singletonList = null;
                        str = null;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i262222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a72222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i262222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a82222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a82222222;
                        a82222222.a(a72222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case 6:
                        str7 = "audio/mpeg";
                        i6 = Base64Utils.IO_BUFFER_SIZE;
                        i7 = -1;
                        singletonList = null;
                        str = null;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i2622222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a722222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i2622222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a822222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a822222222;
                        a822222222.a(a722222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case 7:
                        sf1 sf1Var2 = new sf1(bVar5.a(str6));
                        try {
                            sf1Var2.f(16);
                            long n4 = sf1Var2.n();
                            if (n4 == 1482049860) {
                                pair = new Pair("video/divx", null);
                            } else if (n4 == 859189832) {
                                pair = new Pair("video/3gpp", null);
                            } else {
                                if (n4 == 826496599) {
                                    byte[] c5 = sf1Var2.c();
                                    for (int d4 = sf1Var2.d() + 20; d4 < c5.length - 4; d4++) {
                                        if (c5[d4] == 0) {
                                            if (c5[d4 + 1] == 0 && c5[d4 + 2] == 1) {
                                                if (c5[d4 + 3] == 15) {
                                                    pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(c5, d4, c5.length)));
                                                }
                                            }
                                        }
                                    }
                                    throw wf1.a("Failed to find FourCC VC1 initialization data", (Exception) null);
                                }
                                ms0.d("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                str2 = null;
                                pair = new Pair("video/x-unknown", null);
                                str7 = (String) pair.first;
                                singletonList = (List) pair.second;
                                str = str2;
                                i6 = -1;
                                i7 = -1;
                                i5 = 3;
                                bArr = bVar5.f32647N;
                                if (bArr != null) {
                                }
                                str4 = str7;
                                int i26222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                                aVar = new yb0.a();
                                if (!i01.d(str4)) {
                                }
                                str5 = bVar5.f32659a;
                                if (str5 != null) {
                                }
                                yb0 a7222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i26222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                                p52 a8222222222 = r70Var.a(bVar5.f32661c, i9);
                                bVar5.f32657X = a8222222222;
                                a8222222222.a(a7222222222);
                                this.f32609c.put(bVar5.f32661c, bVar5);
                                break;
                            }
                            str2 = null;
                            str7 = (String) pair.first;
                            singletonList = (List) pair.second;
                            str = str2;
                            i6 = -1;
                            i7 = -1;
                            i5 = 3;
                            bArr = bVar5.f32647N;
                            if (bArr != null) {
                            }
                            str4 = str7;
                            int i262222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                            aVar = new yb0.a();
                            if (!i01.d(str4)) {
                            }
                            str5 = bVar5.f32659a;
                            if (str5 != null) {
                            }
                            yb0 a72222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i262222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                            p52 a82222222222 = r70Var.a(bVar5.f32661c, i9);
                            bVar5.f32657X = a82222222222;
                            a82222222222.a(a72222222222);
                            this.f32609c.put(bVar5.f32661c, bVar5);
                        } catch (ArrayIndexOutOfBoundsException unused4) {
                            throw wf1.a("Error parsing FourCC private data", (Exception) null);
                        }
                        break;
                    case '\b':
                        byte[] bArr6 = new byte[4];
                        System.arraycopy(bVar5.a(str6), 0, bArr6, 0, 4);
                        a4 = sj0.a(bArr6);
                        str7 = "application/dvbsubs";
                        singletonList = a4;
                        i6 = -1;
                        i7 = -1;
                        str = null;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i2622222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a722222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i2622222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a822222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a822222222222;
                        a822222222222.a(a722222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case '\n':
                        C2278uh a10 = C2278uh.a(new sf1(bVar5.a(str6)));
                        list = a10.f33124a;
                        bVar5.f32658Y = a10.f33125b;
                        str3 = a10.f33129f;
                        str7 = "video/avc";
                        str = str3;
                        singletonList = list;
                        i6 = -1;
                        i7 = -1;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i26222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a7222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i26222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a8222222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a8222222222222;
                        a8222222222222.a(a7222222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case 11:
                        a4 = sj0.a(bVar5.a(str6));
                        str7 = "application/vobsub";
                        singletonList = a4;
                        i6 = -1;
                        i7 = -1;
                        str = null;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i262222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a72222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i262222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a82222222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a82222222222222;
                        a82222222222222.a(a72222222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case '\f':
                        str7 = "audio/vnd.dts.hd";
                        i6 = -1;
                        i7 = -1;
                        singletonList = null;
                        str = null;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i2622222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a722222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i2622222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a822222222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a822222222222222;
                        a822222222222222.a(a722222222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case '\r':
                        List<byte[]> singletonList2 = Collections.singletonList(bVar5.a(str6));
                        byte[] bArr7 = bVar5.f32669k;
                        C1790a.C0181a a11 = C1790a.a(new rf1(bArr7.length, bArr7), false);
                        bVar5.f32650Q = a11.f23102a;
                        bVar5.f32648O = a11.f23103b;
                        String str9 = a11.f23104c;
                        str7 = "audio/mp4a-latm";
                        singletonList = singletonList2;
                        str = str9;
                        i6 = -1;
                        i7 = -1;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i26222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a7222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i26222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a8222222222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a8222222222222222;
                        a8222222222222222.a(a7222222222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case 14:
                        str7 = "audio/ac3";
                        i6 = -1;
                        i7 = -1;
                        singletonList = null;
                        str = null;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i262222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a72222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i262222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a82222222222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a82222222222222222;
                        a82222222222222222.a(a72222222222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case 15:
                    case 21:
                        str7 = "audio/vnd.dts";
                        i6 = -1;
                        i7 = -1;
                        singletonList = null;
                        str = null;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i2622222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a722222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i2622222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a822222222222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a822222222222222222;
                        a822222222222222222.a(a722222222222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case 16:
                        str7 = "video/av01";
                        i6 = -1;
                        i7 = -1;
                        singletonList = null;
                        str = null;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i26222222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a7222222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i26222222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a8222222222222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a8222222222222222222;
                        a8222222222222222222.a(a7222222222222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case 17:
                        str7 = "video/x-vnd.on2.vp8";
                        i6 = -1;
                        i7 = -1;
                        singletonList = null;
                        str = null;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i262222222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a72222222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i262222222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a82222222222222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a82222222222222222222;
                        a82222222222222222222.a(a72222222222222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case 18:
                        str7 = "video/x-vnd.on2.vp9";
                        i6 = -1;
                        i7 = -1;
                        singletonList = null;
                        str = null;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i2622222222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a722222222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i2622222222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a822222222222222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a822222222222222222222;
                        a822222222222222222222.a(a722222222222222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case 19:
                        str7 = "application/pgs";
                        i6 = -1;
                        i7 = -1;
                        singletonList = null;
                        str = null;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i26222222222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a7222222222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i26222222222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a8222222222222222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a8222222222222222222222;
                        a8222222222222222222222.a(a7222222222222222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case 20:
                        str7 = "video/x-unknown";
                        i6 = -1;
                        i7 = -1;
                        singletonList = null;
                        str = null;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i262222222222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a72222222222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i262222222222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a82222222222222222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a82222222222222222222222;
                        a82222222222222222222222.a(a72222222222222222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case 22:
                        if (bVar5.f32649P == 32) {
                            i6 = -1;
                            i7 = 4;
                            singletonList = null;
                            str = null;
                            i5 = 3;
                            bArr = bVar5.f32647N;
                            if (bArr != null) {
                            }
                            str4 = str7;
                            int i2622222222222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                            aVar = new yb0.a();
                            if (!i01.d(str4)) {
                            }
                            str5 = bVar5.f32659a;
                            if (str5 != null) {
                            }
                            yb0 a722222222222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i2622222222222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                            p52 a822222222222222222222222 = r70Var.a(bVar5.f32661c, i9);
                            bVar5.f32657X = a822222222222222222222222;
                            a822222222222222222222222.a(a722222222222222222222222);
                            this.f32609c.put(bVar5.f32661c, bVar5);
                            break;
                        } else {
                            ms0.d("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + bVar5.f32649P + ". Setting mimeType to audio/x-unknown");
                            str7 = "audio/x-unknown";
                            i6 = -1;
                            i7 = -1;
                            singletonList = null;
                            str = null;
                            i5 = 3;
                            bArr = bVar5.f32647N;
                            if (bArr != null) {
                            }
                            str4 = str7;
                            int i26222222222222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                            aVar = new yb0.a();
                            if (!i01.d(str4)) {
                            }
                            str5 = bVar5.f32659a;
                            if (str5 != null) {
                            }
                            yb0 a7222222222222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i26222222222222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                            p52 a8222222222222222222222222 = r70Var.a(bVar5.f32661c, i9);
                            bVar5.f32657X = a8222222222222222222222222;
                            a8222222222222222222222222.a(a7222222222222222222222222);
                            this.f32609c.put(bVar5.f32661c, bVar5);
                        }
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        int i40 = bVar5.f32649P;
                        if (i40 == 8) {
                            i6 = -1;
                            i7 = 3;
                            singletonList = null;
                            str = null;
                            i5 = 3;
                            bArr = bVar5.f32647N;
                            if (bArr != null) {
                            }
                            str4 = str7;
                            int i262222222222222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                            aVar = new yb0.a();
                            if (!i01.d(str4)) {
                            }
                            str5 = bVar5.f32659a;
                            if (str5 != null) {
                            }
                            yb0 a72222222222222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i262222222222222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                            p52 a82222222222222222222222222 = r70Var.a(bVar5.f32661c, i9);
                            bVar5.f32657X = a82222222222222222222222222;
                            a82222222222222222222222222.a(a72222222222222222222222222);
                            this.f32609c.put(bVar5.f32661c, bVar5);
                            break;
                        } else if (i40 == 16) {
                            i8 = 268435456;
                            i7 = i8;
                            i6 = -1;
                            singletonList = null;
                            str = null;
                            i5 = 3;
                            bArr = bVar5.f32647N;
                            if (bArr != null) {
                            }
                            str4 = str7;
                            int i2622222222222222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                            aVar = new yb0.a();
                            if (!i01.d(str4)) {
                            }
                            str5 = bVar5.f32659a;
                            if (str5 != null) {
                            }
                            yb0 a722222222222222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i2622222222222222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                            p52 a822222222222222222222222222 = r70Var.a(bVar5.f32661c, i9);
                            bVar5.f32657X = a822222222222222222222222222;
                            a822222222222222222222222222.a(a722222222222222222222222222);
                            this.f32609c.put(bVar5.f32661c, bVar5);
                        } else {
                            ms0.d("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + bVar5.f32649P + ". Setting mimeType to audio/x-unknown");
                            str7 = "audio/x-unknown";
                            i6 = -1;
                            i7 = -1;
                            singletonList = null;
                            str = null;
                            i5 = 3;
                            bArr = bVar5.f32647N;
                            if (bArr != null) {
                            }
                            str4 = str7;
                            int i26222222222222222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                            aVar = new yb0.a();
                            if (!i01.d(str4)) {
                            }
                            str5 = bVar5.f32659a;
                            if (str5 != null) {
                            }
                            yb0 a7222222222222222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i26222222222222222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                            p52 a8222222222222222222222222222 = r70Var.a(bVar5.f32661c, i9);
                            bVar5.f32657X = a8222222222222222222222222222;
                            a8222222222222222222222222222.a(a7222222222222222222222222222);
                            this.f32609c.put(bVar5.f32661c, bVar5);
                        }
                        break;
                    case 24:
                        i8 = u82.b(bVar5.f32649P);
                        if (i8 == 0) {
                            ms0.d("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + bVar5.f32649P + ". Setting mimeType to audio/x-unknown");
                            str7 = "audio/x-unknown";
                            i6 = -1;
                            i7 = -1;
                            singletonList = null;
                            str = null;
                            i5 = 3;
                            bArr = bVar5.f32647N;
                            if (bArr != null) {
                            }
                            str4 = str7;
                            int i262222222222222222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                            aVar = new yb0.a();
                            if (!i01.d(str4)) {
                            }
                            str5 = bVar5.f32659a;
                            if (str5 != null) {
                            }
                            yb0 a72222222222222222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i262222222222222222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                            p52 a82222222222222222222222222222 = r70Var.a(bVar5.f32661c, i9);
                            bVar5.f32657X = a82222222222222222222222222222;
                            a82222222222222222222222222222.a(a72222222222222222222222222222);
                            this.f32609c.put(bVar5.f32661c, bVar5);
                            break;
                        }
                        i7 = i8;
                        i6 = -1;
                        singletonList = null;
                        str = null;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i2622222222222222222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a722222222222222222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i2622222222222222222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a822222222222222222222222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a822222222222222222222222222222;
                        a822222222222222222222222222222.a(a722222222222222222222222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case 25:
                        a4 = sj0.a(f32574d0, bVar5.a(str6));
                        str7 = "text/x-ssa";
                        singletonList = a4;
                        i6 = -1;
                        i7 = -1;
                        str = null;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i26222222222222222222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a7222222222222222222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i26222222222222222222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a8222222222222222222222222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a8222222222222222222222222222222;
                        a8222222222222222222222222222222.a(a7222222222222222222222222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case 26:
                        if0 a12 = if0.a(new sf1(bVar5.a(str6)));
                        list = a12.f27190a;
                        bVar5.f32658Y = a12.f27191b;
                        str3 = a12.f27193d;
                        str7 = "video/hevc";
                        str = str3;
                        singletonList = list;
                        i6 = -1;
                        i7 = -1;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i262222222222222222222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a72222222222222222222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i262222222222222222222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a82222222222222222222222222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a82222222222222222222222222222222;
                        a82222222222222222222222222222222.a(a72222222222222222222222222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case 27:
                        str7 = "text/vtt";
                        i6 = -1;
                        i7 = -1;
                        singletonList = null;
                        str = null;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i2622222222222222222222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a722222222222222222222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i2622222222222222222222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a822222222222222222222222222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a822222222222222222222222222222222;
                        a822222222222222222222222222222222.a(a722222222222222222222222222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        str7 = "application/x-subrip";
                        i6 = -1;
                        i7 = -1;
                        singletonList = null;
                        str = null;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i26222222222222222222222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a7222222222222222222222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i26222222222222222222222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a8222222222222222222222222222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a8222222222222222222222222222222222;
                        a8222222222222222222222222222222222.a(a7222222222222222222222222222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case 29:
                        str7 = "video/mpeg2";
                        i6 = -1;
                        i7 = -1;
                        singletonList = null;
                        str = null;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i262222222222222222222222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a72222222222222222222222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i262222222222222222222222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a82222222222222222222222222222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a82222222222222222222222222222222222;
                        a82222222222222222222222222222222222.a(a72222222222222222222222222222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        str7 = "audio/eac3";
                        i6 = -1;
                        i7 = -1;
                        singletonList = null;
                        str = null;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i2622222222222222222222222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a722222222222222222222222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i2622222222222222222222222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a822222222222222222222222222222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a822222222222222222222222222222222222;
                        a822222222222222222222222222222222222.a(a722222222222222222222222222222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        a4 = Collections.singletonList(bVar5.a(str6));
                        str7 = "audio/flac";
                        singletonList = a4;
                        i6 = -1;
                        i7 = -1;
                        str = null;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i26222222222222222222222222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a7222222222222222222222222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i26222222222222222222222222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a8222222222222222222222222222222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a8222222222222222222222222222222222222;
                        a8222222222222222222222222222222222222.a(a7222222222222222222222222222222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    case ' ':
                        ArrayList arrayList2 = new ArrayList(3);
                        arrayList2.add(bVar5.a(bVar5.f32660b));
                        ByteBuffer allocate = ByteBuffer.allocate(8);
                        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                        arrayList2.add(allocate.order(byteOrder).putLong(bVar5.f32651R).array());
                        arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(bVar5.f32652S).array());
                        str7 = "audio/opus";
                        singletonList = arrayList2;
                        i6 = 5760;
                        i7 = -1;
                        str = null;
                        i5 = 3;
                        bArr = bVar5.f32647N;
                        if (bArr != null) {
                        }
                        str4 = str7;
                        int i262222222222222222222222222222222222222 = (bVar5.f32655V ? 1 : 0) | (!bVar5.f32654U ? 2 : 0);
                        aVar = new yb0.a();
                        if (!i01.d(str4)) {
                        }
                        str5 = bVar5.f32659a;
                        if (str5 != null) {
                        }
                        yb0 a72222222222222222222222222222222222222 = aVar.g(i25).e(str4).h(i6).d(bVar5.f32656W).m(i262222222222222222222222222222222222222).a(singletonList).a(str).a(bVar5.f32670l).a();
                        p52 a82222222222222222222222222222222222222 = r70Var.a(bVar5.f32661c, i9);
                        bVar5.f32657X = a82222222222222222222222222222222222222;
                        a82222222222222222222222222222222222222.a(a72222222222222222222222222222222222222);
                        this.f32609c.put(bVar5.f32661c, bVar5);
                        break;
                    default:
                        throw wf1.a("Unrecognized codec identifier.", (Exception) null);
                }
        }
        this.f32627u = null;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void release() {
    }

    tt0(jz jzVar) {
        this.f32623q = -1L;
        this.f32624r = -9223372036854775807L;
        this.f32625s = -9223372036854775807L;
        this.f32626t = -9223372036854775807L;
        this.f32632z = -1L;
        this.f32579A = -1L;
        this.f32580B = -9223372036854775807L;
        this.f32605a = jzVar;
        jzVar.a(new a());
        this.f32610d = true;
        this.f32607b = new f92();
        this.f32609c = new SparseArray<>();
        this.f32613g = new sf1(4);
        this.f32614h = new sf1(ByteBuffer.allocate(4).putInt(-1).array());
        this.f32615i = new sf1(4);
        this.f32611e = new sf1(s31.f31556a);
        this.f32612f = new sf1(4);
        this.f32616j = new sf1();
        this.f32617k = new sf1();
        this.f32618l = new sf1(8);
        this.f32619m = new sf1();
        this.f32620n = new sf1();
        this.f32590L = new int[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(b bVar, long j4, int i4, int i5, int i6) {
        byte[] a4;
        int i7;
        int e4;
        x62 x62Var = bVar.f32653T;
        if (x62Var != null) {
            x62Var.a(bVar.f32657X, j4, i4, i5, i6, bVar.f32668j);
        } else {
            if ("S_TEXT/UTF8".equals(bVar.f32660b) || "S_TEXT/ASS".equals(bVar.f32660b) || "S_TEXT/WEBVTT".equals(bVar.f32660b)) {
                if (this.f32589K > 1) {
                    ms0.d("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j5 = this.f32587I;
                    if (j5 == -9223372036854775807L) {
                        ms0.d("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = bVar.f32660b;
                        byte[] c4 = this.f32617k.c();
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                a4 = a("%01d:%02d:%02d:%02d", j5, 10000L);
                                i7 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                a4 = a("%02d:%02d:%02d.%03d", j5, 1000L);
                                i7 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                a4 = a("%02d:%02d:%02d,%03d", j5, 1000L);
                                i7 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(a4, 0, c4, i7, a4.length);
                        int d4 = this.f32617k.d();
                        while (true) {
                            if (d4 < this.f32617k.e()) {
                                if (this.f32617k.c()[d4] == 0) {
                                    this.f32617k.d(d4);
                                } else {
                                    d4++;
                                }
                            }
                        }
                        p52 p52Var = bVar.f32657X;
                        sf1 sf1Var = this.f32617k;
                        p52Var.a(sf1Var.e(), sf1Var);
                        e4 = this.f32617k.e() + i5;
                        if ((i4 & 268435456) != 0) {
                            if (this.f32589K > 1) {
                                this.f32620n.c(0);
                            } else {
                                int e5 = this.f32620n.e();
                                bVar.f32657X.b(e5, this.f32620n);
                                e4 += e5;
                            }
                        }
                        bVar.f32657X.a(j4, i4, e4, i6, bVar.f32668j);
                    }
                }
            }
            e4 = i5;
            if ((i4 & 268435456) != 0) {
            }
            bVar.f32657X.a(j4, i4, e4, i6, bVar.f32668j);
        }
        this.f32584F = true;
    }

    private static byte[] a(String str, long j4, long j5) {
        if (j4 != -9223372036854775807L) {
            int i4 = (int) (j4 / 3600000000L);
            long j6 = j4 - (i4 * 3600000000L);
            int i5 = (int) (j6 / 60000000);
            long j7 = j6 - (i5 * 60000000);
            int i6 = (int) (j7 / 1000000);
            return u82.c(String.format(Locale.US, str, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf((int) ((j7 - (i6 * 1000000)) / j5))));
        }
        throw new IllegalArgumentException();
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(r70 r70Var) {
        this.f32608b0 = r70Var;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final int a(q70 q70Var, hj1 hj1Var) {
        this.f32584F = false;
        boolean z4 = true;
        while (z4 && !this.f32584F) {
            lz lzVar = (lz) q70Var;
            z4 = ((jz) this.f32605a).a(lzVar);
            if (z4) {
                long a4 = lzVar.a();
                if (this.f32631y) {
                    this.f32579A = a4;
                    hj1Var.f26771a = this.f32632z;
                    this.f32631y = false;
                } else if (this.f32628v) {
                    long j4 = this.f32579A;
                    if (j4 != -1) {
                        hj1Var.f26771a = j4;
                        this.f32579A = -1L;
                    }
                } else {
                    continue;
                }
                return 1;
            }
        }
        if (z4) {
            return 0;
        }
        for (int i4 = 0; i4 < this.f32609c.size(); i4++) {
            b valueAt = this.f32609c.valueAt(i4);
            valueAt.f32657X.getClass();
            x62 x62Var = valueAt.f32653T;
            if (x62Var != null) {
                x62Var.a(valueAt.f32657X, valueAt.f32668j);
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(lz lzVar, int i4) {
        if (this.f32613g.e() >= i4) {
            return;
        }
        if (this.f32613g.b() < i4) {
            sf1 sf1Var = this.f32613g;
            sf1Var.a(Math.max(sf1Var.b() * 2, i4));
        }
        lzVar.a(this.f32613g.c(), this.f32613g.e(), i4 - this.f32613g.e(), false);
        this.f32613g.d(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(long j4) {
        long j5 = this.f32624r;
        if (j5 != -9223372036854775807L) {
            return u82.a(j4, j5, 1000L);
        }
        throw wf1.a("Can't scale timecode prior to timecodeScale being set.", (Exception) null);
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(long j4, long j5) {
        this.f32580B = -9223372036854775807L;
        this.f32585G = 0;
        ((jz) this.f32605a).a();
        this.f32607b.b();
        b();
        for (int i4 = 0; i4 < this.f32609c.size(); i4++) {
            x62 x62Var = this.f32609c.valueAt(i4).f32653T;
            if (x62Var != null) {
                x62Var.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(lz lzVar, b bVar, int i4, boolean z4) {
        int b4;
        int b5;
        int i5;
        if ("S_TEXT/UTF8".equals(bVar.f32660b)) {
            a(lzVar, f32573c0, i4);
            int i6 = this.f32598T;
            b();
            return i6;
        }
        if ("S_TEXT/ASS".equals(bVar.f32660b)) {
            a(lzVar, f32575e0, i4);
            int i7 = this.f32598T;
            b();
            return i7;
        }
        if ("S_TEXT/WEBVTT".equals(bVar.f32660b)) {
            a(lzVar, f32576f0, i4);
            int i8 = this.f32598T;
            b();
            return i8;
        }
        p52 p52Var = bVar.f32657X;
        if (!this.f32600V) {
            if (bVar.f32666h) {
                this.f32593O &= -1073741825;
                boolean z5 = this.f32601W;
                int i9 = UserVerificationMethods.USER_VERIFY_PATTERN;
                if (!z5) {
                    lzVar.a(this.f32613g.c(), 0, 1, false);
                    this.f32597S++;
                    if ((this.f32613g.c()[0] & 128) != 128) {
                        this.f32604Z = this.f32613g.c()[0];
                        this.f32601W = true;
                    } else {
                        throw wf1.a("Extension bit is set in signal byte", (Exception) null);
                    }
                }
                byte b6 = this.f32604Z;
                if ((b6 & 1) == 1) {
                    boolean z6 = (b6 & 2) == 2;
                    this.f32593O |= 1073741824;
                    if (!this.f32606a0) {
                        lzVar.a(this.f32618l.c(), 0, 8, false);
                        this.f32597S += 8;
                        this.f32606a0 = true;
                        byte[] c4 = this.f32613g.c();
                        if (!z6) {
                            i9 = 0;
                        }
                        c4[0] = (byte) (i9 | 8);
                        this.f32613g.e(0);
                        p52Var.b(1, this.f32613g);
                        this.f32598T++;
                        this.f32618l.e(0);
                        p52Var.b(8, this.f32618l);
                        this.f32598T += 8;
                    }
                    if (z6) {
                        if (!this.f32602X) {
                            lzVar.a(this.f32613g.c(), 0, 1, false);
                            this.f32597S++;
                            this.f32613g.e(0);
                            this.f32603Y = this.f32613g.t();
                            this.f32602X = true;
                        }
                        int i10 = this.f32603Y * 4;
                        this.f32613g.c(i10);
                        lzVar.a(this.f32613g.c(), 0, i10, false);
                        this.f32597S += i10;
                        short s4 = (short) ((this.f32603Y / 2) + 1);
                        int i11 = (s4 * 6) + 2;
                        ByteBuffer byteBuffer = this.f32621o;
                        if (byteBuffer == null || byteBuffer.capacity() < i11) {
                            this.f32621o = ByteBuffer.allocate(i11);
                        }
                        this.f32621o.position(0);
                        this.f32621o.putShort(s4);
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            i5 = this.f32603Y;
                            if (i12 >= i5) {
                                break;
                            }
                            int x4 = this.f32613g.x();
                            if (i12 % 2 == 0) {
                                this.f32621o.putShort((short) (x4 - i13));
                            } else {
                                this.f32621o.putInt(x4 - i13);
                            }
                            i12++;
                            i13 = x4;
                        }
                        int i14 = (i4 - this.f32597S) - i13;
                        if (i5 % 2 == 1) {
                            this.f32621o.putInt(i14);
                        } else {
                            this.f32621o.putShort((short) i14);
                            this.f32621o.putInt(0);
                        }
                        this.f32619m.a(i11, this.f32621o.array());
                        p52Var.b(i11, this.f32619m);
                        this.f32598T += i11;
                    }
                }
            } else {
                byte[] bArr = bVar.f32667i;
                if (bArr != null) {
                    this.f32616j.a(bArr.length, bArr);
                }
            }
            if (!"A_OPUS".equals(bVar.f32660b) ? bVar.f32664f > 0 : z4) {
                this.f32593O |= 268435456;
                this.f32620n.c(0);
                int e4 = (this.f32616j.e() + i4) - this.f32597S;
                this.f32613g.c(4);
                this.f32613g.c()[0] = (byte) ((e4 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f32613g.c()[1] = (byte) ((e4 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f32613g.c()[2] = (byte) ((e4 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f32613g.c()[3] = (byte) (e4 & KotlinVersion.MAX_COMPONENT_VALUE);
                p52Var.b(4, this.f32613g);
                this.f32598T += 4;
            }
            this.f32600V = true;
        }
        int e5 = this.f32616j.e() + i4;
        if (!"V_MPEG4/ISO/AVC".equals(bVar.f32660b) && !"V_MPEGH/ISO/HEVC".equals(bVar.f32660b)) {
            if (bVar.f32653T != null) {
                if (this.f32616j.e() == 0) {
                    bVar.f32653T.a(lzVar);
                } else {
                    throw new IllegalStateException();
                }
            }
            while (true) {
                int i15 = this.f32597S;
                if (i15 >= e5) {
                    break;
                }
                int i16 = e5 - i15;
                int a4 = this.f32616j.a();
                if (a4 > 0) {
                    b5 = Math.min(i16, a4);
                    p52Var.a(b5, this.f32616j);
                } else {
                    b5 = p52Var.b(lzVar, i16, false);
                }
                this.f32597S += b5;
                this.f32598T += b5;
            }
        } else {
            byte[] c5 = this.f32612f.c();
            c5[0] = 0;
            c5[1] = 0;
            c5[2] = 0;
            int i17 = bVar.f32658Y;
            int i18 = 4 - i17;
            while (this.f32597S < e5) {
                int i19 = this.f32599U;
                if (i19 == 0) {
                    int min = Math.min(i17, this.f32616j.a());
                    lzVar.a(c5, i18 + min, i17 - min, false);
                    if (min > 0) {
                        this.f32616j.a(c5, i18, min);
                    }
                    this.f32597S += i17;
                    this.f32612f.e(0);
                    this.f32599U = this.f32612f.x();
                    this.f32611e.e(0);
                    p52Var.a(4, this.f32611e);
                    this.f32598T += 4;
                } else {
                    int a5 = this.f32616j.a();
                    if (a5 > 0) {
                        b4 = Math.min(i19, a5);
                        p52Var.a(b4, this.f32616j);
                    } else {
                        b4 = p52Var.b(lzVar, i19, false);
                    }
                    this.f32597S += b4;
                    this.f32598T += b4;
                    this.f32599U -= b4;
                }
            }
        }
        if ("A_VORBIS".equals(bVar.f32660b)) {
            this.f32614h.e(0);
            p52Var.a(4, this.f32614h);
            this.f32598T += 4;
        }
        int i20 = this.f32598T;
        b();
        return i20;
    }

    private void a(lz lzVar, byte[] bArr, int i4) {
        int length = bArr.length + i4;
        if (this.f32617k.b() < length) {
            this.f32617k.a(Arrays.copyOf(bArr, length + i4));
        } else {
            System.arraycopy(bArr, 0, this.f32617k.c(), 0, bArr.length);
        }
        lzVar.a(this.f32617k.c(), bArr.length, i4, false);
        this.f32617k.e(0);
        this.f32617k.d(length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p70[] a() {
        return new p70[]{new tt0(new jz())};
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final boolean a(q70 q70Var) {
        return new j02().b((lz) q70Var);
    }

    private void b() {
        this.f32597S = 0;
        this.f32598T = 0;
        this.f32599U = 0;
        this.f32600V = false;
        this.f32601W = false;
        this.f32602X = false;
        this.f32603Y = 0;
        this.f32604Z = (byte) 0;
        this.f32606a0 = false;
        this.f32616j.c(0);
    }
}
