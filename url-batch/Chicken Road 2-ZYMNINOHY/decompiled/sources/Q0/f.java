package Q0;

import C3.v;
import E.AbstractC0005f;
import E1.C0036l;
import E1.P;
import T.AbstractC0088f;
import T.C0089g;
import T.C0093k;
import T.C0094l;
import T.C0096n;
import T.C0097o;
import T.D;
import T.E;
import T.F;
import T.r;
import V0.j;
import W.AbstractC0108a;
import W.J;
import W.t;
import W.u;
import a.AbstractC0124a;
import android.util.Pair;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C0583e9;
import io.flutter.Build;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.KotlinVersion;
import t1.h;
import v2.I;
import y0.AbstractC1569a;
import y0.C1572d;
import y0.G;
import y0.k;
import y0.n;
import y0.o;
import y0.p;

/* loaded from: classes.dex */
public final class f implements n {

    /* renamed from: k0, reason: collision with root package name */
    public static final byte[] f2189k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: l0, reason: collision with root package name */
    public static final byte[] f2190l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final byte[] f2191m0;

    /* renamed from: n0, reason: collision with root package name */
    public static final byte[] f2192n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final UUID f2193o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final Map f2194p0;

    /* renamed from: A, reason: collision with root package name */
    public int f2195A;

    /* renamed from: B, reason: collision with root package name */
    public long f2196B;

    /* renamed from: C, reason: collision with root package name */
    public final SparseArray f2197C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2198D;

    /* renamed from: E, reason: collision with root package name */
    public long f2199E;

    /* renamed from: F, reason: collision with root package name */
    public int f2200F;

    /* renamed from: G, reason: collision with root package name */
    public long f2201G;

    /* renamed from: H, reason: collision with root package name */
    public long f2202H;

    /* renamed from: I, reason: collision with root package name */
    public int f2203I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2204J;

    /* renamed from: K, reason: collision with root package name */
    public long f2205K;
    public long L;

    /* renamed from: M, reason: collision with root package name */
    public long f2206M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f2207N;

    /* renamed from: O, reason: collision with root package name */
    public int f2208O;

    /* renamed from: P, reason: collision with root package name */
    public long f2209P;

    /* renamed from: Q, reason: collision with root package name */
    public long f2210Q;

    /* renamed from: R, reason: collision with root package name */
    public int f2211R;

    /* renamed from: S, reason: collision with root package name */
    public int f2212S;

    /* renamed from: T, reason: collision with root package name */
    public int[] f2213T;

    /* renamed from: U, reason: collision with root package name */
    public int f2214U;

    /* renamed from: V, reason: collision with root package name */
    public int f2215V;

    /* renamed from: W, reason: collision with root package name */
    public int f2216W;

    /* renamed from: X, reason: collision with root package name */
    public int f2217X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f2218Y;

    /* renamed from: Z, reason: collision with root package name */
    public long f2219Z;

    /* renamed from: a, reason: collision with root package name */
    public final b f2220a;

    /* renamed from: a0, reason: collision with root package name */
    public int f2221a0;

    /* renamed from: b, reason: collision with root package name */
    public final g f2222b;

    /* renamed from: b0, reason: collision with root package name */
    public int f2223b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f2224c;

    /* renamed from: c0, reason: collision with root package name */
    public int f2225c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2226d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f2227d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2228e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f2229e0;

    /* renamed from: f, reason: collision with root package name */
    public final j f2230f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f2231f0;

    /* renamed from: g, reason: collision with root package name */
    public final u f2232g;

    /* renamed from: g0, reason: collision with root package name */
    public int f2233g0;

    /* renamed from: h, reason: collision with root package name */
    public final u f2234h;

    /* renamed from: h0, reason: collision with root package name */
    public byte f2235h0;

    /* renamed from: i, reason: collision with root package name */
    public final u f2236i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f2237i0;

    /* renamed from: j, reason: collision with root package name */
    public final u f2238j;

    /* renamed from: j0, reason: collision with root package name */
    public p f2239j0;

    /* renamed from: k, reason: collision with root package name */
    public final u f2240k;

    /* renamed from: l, reason: collision with root package name */
    public final u f2241l;

    /* renamed from: m, reason: collision with root package name */
    public final u f2242m;
    public final u n;
    public final u o;

    /* renamed from: p, reason: collision with root package name */
    public final u f2243p;

    /* renamed from: q, reason: collision with root package name */
    public ByteBuffer f2244q;

    /* renamed from: r, reason: collision with root package name */
    public long f2245r;

    /* renamed from: s, reason: collision with root package name */
    public long f2246s;

    /* renamed from: t, reason: collision with root package name */
    public long f2247t;

    /* renamed from: u, reason: collision with root package name */
    public long f2248u;
    public long v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2249w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2250x;

    /* renamed from: y, reason: collision with root package name */
    public e f2251y;
    public boolean z;

    static {
        String str = J.f3263a;
        f2190l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f2191m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f2192n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f2193o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        AbstractC0005f.v(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC0005f.v(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f2194p0 = Collections.unmodifiableMap(hashMap);
    }

    public f(j jVar, int i4) {
        b bVar = new b();
        this.f2246s = -1L;
        this.f2247t = -9223372036854775807L;
        this.f2248u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f2199E = -9223372036854775807L;
        this.f2200F = -1;
        this.f2201G = -1L;
        this.f2202H = -1L;
        this.f2203I = -1;
        this.f2205K = -1L;
        this.L = -1L;
        this.f2206M = -9223372036854775807L;
        this.f2220a = bVar;
        bVar.f2128d = new h(17, this);
        this.f2230f = jVar;
        this.f2197C = new SparseArray();
        this.f2226d = (i4 & 1) == 0;
        this.f2228e = (i4 & 2) == 0;
        this.f2222b = new g();
        this.f2224c = new SparseArray();
        this.f2236i = new u(4);
        this.f2238j = new u(ByteBuffer.allocate(4).putInt(-1).array());
        this.f2240k = new u(4);
        this.f2232g = new u(X.p.f3552a);
        this.f2234h = new u(4);
        this.f2241l = new u();
        this.f2242m = new u();
        this.n = new u(8);
        this.o = new u();
        this.f2243p = new u();
        this.f2213T = new int[1];
        this.f2250x = true;
    }

    public static byte[] i(long j4, long j5, String str) {
        AbstractC0124a.h(j4 != -9223372036854775807L);
        int i4 = (int) (j4 / 3600000000L);
        long j6 = j4 - (i4 * 3600000000L);
        int i5 = (int) (j6 / 60000000);
        long j7 = j6 - (i5 * 60000000);
        int i6 = (int) (j7 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf((int) ((j7 - (i6 * 1000000)) / j5)));
        String str2 = J.f3263a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override // y0.n
    public final void a(long j4, long j5) {
        this.f2206M = -9223372036854775807L;
        this.f2208O = 0;
        b bVar = this.f2220a;
        bVar.f2129e = 0;
        bVar.f2126b.clear();
        g gVar = bVar.f2127c;
        gVar.f2254b = 0;
        gVar.f2255c = 0;
        g gVar2 = this.f2222b;
        gVar2.f2254b = 0;
        gVar2.f2255c = 0;
        l();
        this.f2198D = false;
        this.f2199E = -9223372036854775807L;
        this.f2200F = -1;
        this.f2201G = -1L;
        this.f2202H = -1L;
        if (!this.z) {
            this.f2197C.clear();
        }
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f2224c;
            if (i4 >= sparseArray.size()) {
                return;
            }
            G g4 = ((e) sparseArray.valueAt(i4)).f2159V;
            if (g4 != null) {
                g4.f16089b = false;
                g4.f16090c = 0;
            }
            i4++;
        }
    }

    @Override // y0.n
    public final boolean b(o oVar) {
        P p2 = new P();
        u uVar = (u) p2.f519c;
        k kVar = (k) oVar;
        long j4 = kVar.f16168c;
        long j5 = 1024;
        if (j4 != -1 && j4 <= 1024) {
            j5 = j4;
        }
        int i4 = (int) j5;
        kVar.l(uVar.f3351a, 0, 4, false);
        long B4 = uVar.B();
        p2.f518b = 4;
        while (true) {
            if (B4 != 440786851) {
                int i5 = p2.f518b + 1;
                p2.f518b = i5;
                if (i5 == i4) {
                    break;
                }
                kVar.l(uVar.f3351a, 0, 1, false);
                B4 = ((B4 << 8) & (-256)) | (uVar.f3351a[0] & 255);
            } else {
                long f4 = p2.f(kVar);
                long j6 = p2.f518b;
                if (f4 != Long.MIN_VALUE && (j4 == -1 || j6 + f4 < j4)) {
                    while (true) {
                        long j7 = p2.f518b;
                        long j8 = j6 + f4;
                        if (j7 < j8) {
                            if (p2.f(kVar) != Long.MIN_VALUE) {
                                long f5 = p2.f(kVar);
                                if (f5 < 0 || f5 > 2147483647L) {
                                    break;
                                }
                                if (f5 != 0) {
                                    int i6 = (int) f5;
                                    kVar.a(i6, false);
                                    p2.f518b += i6;
                                }
                            } else {
                                break;
                            }
                        } else if (j7 == j8) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0f6e, code lost:
    
        if (r0.z == false) goto L927;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0f70, code lost:
    
        r6 = r0.L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0f74, code lost:
    
        if (r6 == (-1)) goto L928;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0f76, code lost:
    
        r45.f2881a = r6;
        r0.L = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0f7c, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0f83, code lost:
    
        r4 = r35;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0f83, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0f5b, code lost:
    
        r0.L = r2;
        r45.f2881a = r0.f2205K;
        r0.f2204J = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0f67, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0f7d, code lost:
    
        r35 = true;
        r0 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0a0a, code lost:
    
        if (r0.t() == r4.getLeastSignificantBits()) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0d27, code lost:
    
        r5 = true;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0f4f, code lost:
    
        if (r5 == false) goto L879;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0f51, code lost:
    
        r2 = r1.getPosition();
        r0 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0f59, code lost:
    
        if (r0.f2204J == false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0f68, code lost:
    
        r35 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0a51  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0a7e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0c49  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0c5d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0c60  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0191  */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r4v112 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v100, types: [int] */
    /* JADX WARN: Type inference failed for: r6v102 */
    /* JADX WARN: Type inference failed for: r6v103, types: [int] */
    /* JADX WARN: Type inference failed for: r6v116 */
    /* JADX WARN: Type inference failed for: r6v117, types: [int] */
    /* JADX WARN: Type inference failed for: r6v122 */
    /* JADX WARN: Type inference failed for: r6v123 */
    /* JADX WARN: Type inference failed for: r6v124 */
    /* JADX WARN: Type inference failed for: r6v99 */
    /* JADX WARN: Type inference failed for: r8v0, types: [Q0.g] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.util.SparseArray] */
    @Override // y0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(o oVar, r rVar) {
        boolean z;
        int i4;
        boolean z4;
        ?? r15;
        String str;
        int i5;
        int a3;
        o oVar2;
        char c4;
        List singletonList;
        int B4;
        ?? r22;
        int i6;
        ArrayList arrayList;
        RuntimeException runtimeException;
        Pair pair;
        String str2;
        List list;
        List o;
        String str3;
        List list2;
        List list3;
        C0096n c0096n;
        boolean i7;
        int i8;
        C0089g c0089g;
        byte[] bArr;
        int i9;
        String str4;
        v d4;
        List list4;
        int i10;
        List list5;
        int i11;
        long j4;
        int i12;
        long j5;
        long j6;
        E a4;
        f fVar = this;
        boolean z5 = false;
        fVar.f2207N = false;
        boolean z6 = true;
        boolean z7 = true;
        while (z7 && !fVar.f2207N) {
            b bVar = fVar.f2220a;
            ?? r8 = bVar.f2127c;
            ArrayDeque arrayDeque = bVar.f2126b;
            bVar.f2128d.getClass();
            ?? r4 = z6;
            while (true) {
                a aVar = (a) arrayDeque.peek();
                if (aVar == null || oVar.getPosition() < aVar.f2124b) {
                    ?? r42 = z5;
                    o oVar3 = oVar;
                    if (bVar.f2129e == 0) {
                        int i13 = 4;
                        long b4 = r8.b(oVar3, true, r42, 4);
                        if (b4 == -2) {
                            byte[] bArr2 = bVar.f2125a;
                            oVar3.u();
                            int i14 = r42;
                            while (true) {
                                oVar3.E(bArr2, i14, i13);
                                byte b5 = bArr2[i14];
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= 8) {
                                        i5 = -1;
                                    } else if ((g.f2252d[i15] & b5) != 0) {
                                        i5 = i15 + 1;
                                    } else {
                                        i15++;
                                    }
                                }
                                if (i5 != -1 && i5 <= 4) {
                                    a3 = (int) g.a(i5, bArr2, false);
                                    Object obj = bVar.f2128d.f15398b;
                                    if (a3 == 357149030 || a3 == 524531317 || a3 == 475249515 || a3 == 374648427) {
                                    }
                                }
                                oVar3.v(1);
                                i13 = 4;
                                i14 = 0;
                            }
                            oVar3.v(i5);
                            b4 = a3;
                        }
                        z = true;
                        if (b4 == -1) {
                            z4 = false;
                            z7 = false;
                            o oVar4 = oVar3;
                        } else {
                            bVar.f2130f = (int) b4;
                            bVar.f2129e = 1;
                        }
                    } else {
                        z = true;
                    }
                    if (bVar.f2129e == z) {
                        bVar.f2131g = r8.b(oVar3, false, z, 8);
                        bVar.f2129e = 2;
                    }
                    h hVar = bVar.f2128d;
                    int i16 = bVar.f2130f;
                    Object obj2 = hVar.f15398b;
                    switch (i16) {
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
                        case 240:
                        case 241:
                        case 247:
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
                        case 21938:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            i4 = 2;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i4 = 3;
                            break;
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
                            i4 = 1;
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i4 = 4;
                            break;
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
                            i4 = 5;
                            break;
                        default:
                            i4 = 0;
                            break;
                    }
                    if (i4 == 0) {
                        oVar3.v((int) bVar.f2131g);
                        bVar.f2129e = 0;
                        z5 = false;
                        r4 = 1;
                    } else if (i4 == 1) {
                        long position = oVar3.getPosition();
                        arrayDeque.push(new a(bVar.f2130f, bVar.f2131g + position));
                        bVar.f2128d.m(bVar.f2130f, position, bVar.f2131g);
                        z4 = false;
                        bVar.f2129e = 0;
                        oVar2 = oVar3;
                    } else if (i4 == 2) {
                        long j7 = bVar.f2131g;
                        if (j7 > 8) {
                            throw T.G.a(null, "Invalid integer size: " + bVar.f2131g);
                        }
                        hVar.k(i16, bVar.a(oVar3, (int) j7));
                        z4 = false;
                        bVar.f2129e = 0;
                        oVar2 = oVar3;
                    } else if (i4 == 3) {
                        long j8 = bVar.f2131g;
                        if (j8 > 2147483647L) {
                            throw T.G.a(null, "String element size: " + bVar.f2131g);
                        }
                        int i17 = (int) j8;
                        if (i17 == 0) {
                            str = "";
                            r15 = 0;
                        } else {
                            byte[] bArr3 = new byte[i17];
                            oVar3.readFully(bArr3, 0, i17);
                            while (i17 > 0 && bArr3[i17 - 1] == 0) {
                                i17--;
                            }
                            r15 = 0;
                            str = new String(bArr3, 0, i17);
                        }
                        hVar.n(i16, str);
                        bVar.f2129e = r15;
                        z4 = r15;
                        oVar2 = oVar3;
                    } else if (i4 == 4) {
                        hVar.i(i16, (int) bVar.f2131g, oVar3);
                        z4 = false;
                        bVar.f2129e = 0;
                        oVar2 = oVar3;
                    } else {
                        if (i4 != 5) {
                            throw T.G.a(null, "Invalid element type " + i4);
                        }
                        long j9 = bVar.f2131g;
                        if (j9 != 4 && j9 != 8) {
                            throw T.G.a(null, "Invalid float size: " + bVar.f2131g);
                        }
                        int i18 = (int) j9;
                        double intBitsToFloat = i18 == 4 ? Float.intBitsToFloat((int) r4) : Double.longBitsToDouble(bVar.a(oVar3, i18));
                        f fVar2 = (f) hVar.f15398b;
                        if (i16 == 181) {
                            fVar2.g(i16);
                            fVar2.f2251y.f2156S = (int) intBitsToFloat;
                        } else if (i16 != 17545) {
                            switch (i16) {
                                case 21969:
                                    fVar2.g(i16);
                                    fVar2.f2251y.f2144F = (float) intBitsToFloat;
                                    break;
                                case 21970:
                                    fVar2.g(i16);
                                    fVar2.f2251y.f2145G = (float) intBitsToFloat;
                                    break;
                                case 21971:
                                    fVar2.g(i16);
                                    fVar2.f2251y.f2146H = (float) intBitsToFloat;
                                    break;
                                case 21972:
                                    fVar2.g(i16);
                                    fVar2.f2251y.f2147I = (float) intBitsToFloat;
                                    break;
                                case 21973:
                                    fVar2.g(i16);
                                    fVar2.f2251y.f2148J = (float) intBitsToFloat;
                                    break;
                                case 21974:
                                    fVar2.g(i16);
                                    fVar2.f2251y.f2149K = (float) intBitsToFloat;
                                    break;
                                case 21975:
                                    fVar2.g(i16);
                                    fVar2.f2251y.L = (float) intBitsToFloat;
                                    break;
                                case 21976:
                                    fVar2.g(i16);
                                    fVar2.f2251y.f2150M = (float) intBitsToFloat;
                                    break;
                                case 21977:
                                    fVar2.g(i16);
                                    fVar2.f2251y.f2151N = (float) intBitsToFloat;
                                    break;
                                case 21978:
                                    fVar2.g(i16);
                                    fVar2.f2251y.f2152O = (float) intBitsToFloat;
                                    break;
                                default:
                                    switch (i16) {
                                        case 30323:
                                            fVar2.g(i16);
                                            fVar2.f2251y.f2185u = (float) intBitsToFloat;
                                            break;
                                        case 30324:
                                            fVar2.g(i16);
                                            fVar2.f2251y.v = (float) intBitsToFloat;
                                            break;
                                        case 30325:
                                            fVar2.g(i16);
                                            fVar2.f2251y.f2186w = (float) intBitsToFloat;
                                            break;
                                    }
                            }
                        } else {
                            fVar2.f2248u = (long) intBitsToFloat;
                        }
                        z4 = false;
                        bVar.f2129e = 0;
                        oVar2 = oVar3;
                    }
                } else {
                    h hVar2 = bVar.f2128d;
                    int i19 = ((a) arrayDeque.pop()).f2123a;
                    f fVar3 = (f) hVar2.f15398b;
                    ?? r82 = fVar3.f2197C;
                    ?? r9 = fVar3.f2224c;
                    fVar3.f2239j0.getClass();
                    if (i19 != 160) {
                        if (i19 == 174) {
                            e eVar = fVar3.f2251y;
                            eVar.getClass();
                            String str5 = eVar.f2168c;
                            if (str5 == null) {
                                throw T.G.a(null, "CodecId is missing in TrackEntry element");
                            }
                            switch (str5) {
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
                                case "S_TEXT/SSA":
                                case "V_MPEGH/ISO/HEVC":
                                case "S_TEXT/WEBVTT":
                                case "S_TEXT/UTF8":
                                case "V_MPEG2":
                                case "A_EAC3":
                                case "A_FLAC":
                                case "A_OPUS":
                                    int i20 = eVar.f2170d;
                                    switch (str5.hashCode()) {
                                        case -2095576542:
                                            if (str5.equals("V_MPEG4/ISO/AP")) {
                                                c4 = 0;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -2095575984:
                                            if (str5.equals("V_MPEG4/ISO/SP")) {
                                                c4 = 1;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1985379776:
                                            if (str5.equals("A_MS/ACM")) {
                                                c4 = 2;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1784763192:
                                            if (str5.equals("A_TRUEHD")) {
                                                c4 = 3;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1730367663:
                                            if (str5.equals("A_VORBIS")) {
                                                c4 = 4;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1482641358:
                                            if (str5.equals("A_MPEG/L2")) {
                                                c4 = 5;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1482641357:
                                            if (str5.equals("A_MPEG/L3")) {
                                                c4 = 6;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1373388978:
                                            if (str5.equals("V_MS/VFW/FOURCC")) {
                                                c4 = 7;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -933872740:
                                            if (str5.equals("S_DVBSUB")) {
                                                c4 = '\b';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -538363189:
                                            if (str5.equals("V_MPEG4/ISO/ASP")) {
                                                c4 = '\t';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -538363109:
                                            if (str5.equals("V_MPEG4/ISO/AVC")) {
                                                c4 = '\n';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -425012669:
                                            if (str5.equals("S_VOBSUB")) {
                                                c4 = 11;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -356037306:
                                            if (str5.equals("A_DTS/LOSSLESS")) {
                                                c4 = '\f';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 62923557:
                                            if (str5.equals("A_AAC")) {
                                                c4 = '\r';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 62923603:
                                            if (str5.equals("A_AC3")) {
                                                c4 = 14;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 62927045:
                                            if (str5.equals("A_DTS")) {
                                                c4 = 15;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 82318131:
                                            if (str5.equals("V_AV1")) {
                                                c4 = 16;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 82338133:
                                            if (str5.equals("V_VP8")) {
                                                c4 = 17;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 82338134:
                                            if (str5.equals("V_VP9")) {
                                                c4 = 18;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 99146302:
                                            if (str5.equals("S_HDMV/PGS")) {
                                                c4 = 19;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 444813526:
                                            if (str5.equals("V_THEORA")) {
                                                c4 = 20;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 542569478:
                                            if (str5.equals("A_DTS/EXPRESS")) {
                                                c4 = 21;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 635596514:
                                            if (str5.equals("A_PCM/FLOAT/IEEE")) {
                                                c4 = 22;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 725948237:
                                            if (str5.equals("A_PCM/INT/BIG")) {
                                                c4 = 23;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 725957860:
                                            if (str5.equals("A_PCM/INT/LIT")) {
                                                c4 = 24;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 738597099:
                                            if (str5.equals("S_TEXT/ASS")) {
                                                c4 = 25;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 738614379:
                                            if (str5.equals("S_TEXT/SSA")) {
                                                c4 = 26;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 855502857:
                                            if (str5.equals("V_MPEGH/ISO/HEVC")) {
                                                c4 = 27;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1045209816:
                                            if (str5.equals("S_TEXT/WEBVTT")) {
                                                c4 = 28;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1422270023:
                                            if (str5.equals("S_TEXT/UTF8")) {
                                                c4 = 29;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1809237540:
                                            if (str5.equals("V_MPEG2")) {
                                                c4 = 30;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1950749482:
                                            if (str5.equals("A_EAC3")) {
                                                c4 = 31;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1950789798:
                                            if (str5.equals("A_FLAC")) {
                                                c4 = ' ';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1951062397:
                                            if (str5.equals("A_OPUS")) {
                                                c4 = '!';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        default:
                                            c4 = 65535;
                                            break;
                                    }
                                    String str6 = "video/x-unknown";
                                    switch (c4) {
                                        case 0:
                                        case 1:
                                        case '\t':
                                            byte[] bArr4 = eVar.f2178l;
                                            singletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            str6 = "video/mp4v-es";
                                            o = singletonList;
                                            B4 = -1;
                                            i6 = -1;
                                            list4 = o;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.f2153P != null && (d4 = v.d(new u(eVar.f2153P))) != null) {
                                                str2 = d4.f321b;
                                                str6 = "video/dolby-vision";
                                            }
                                            int i21 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map = f2194p0;
                                            if (!i7) {
                                                c0096n.f2810E = eVar.f2154Q;
                                                c0096n.f2811F = eVar.f2156S;
                                                c0096n.f2812G = B4;
                                            } else if (F.m(str6)) {
                                                if (eVar.f2183s == 0) {
                                                    int i22 = eVar.f2181q;
                                                    i8 = -1;
                                                    if (i22 == -1) {
                                                        i22 = eVar.n;
                                                    }
                                                    eVar.f2181q = i22;
                                                    int i23 = eVar.f2182r;
                                                    if (i23 == -1) {
                                                        i23 = eVar.o;
                                                    }
                                                    eVar.f2182r = i23;
                                                } else {
                                                    i8 = -1;
                                                }
                                                float f4 = (eVar.f2181q == i8 || (i9 = eVar.f2182r) == i8) ? -1.0f : (eVar.o * r0) / (eVar.n * i9);
                                                if (eVar.z) {
                                                    if (eVar.f2144F == -1.0f || eVar.f2145G == -1.0f || eVar.f2146H == -1.0f || eVar.f2147I == -1.0f || eVar.f2148J == -1.0f || eVar.f2149K == -1.0f || eVar.L == -1.0f || eVar.f2150M == -1.0f || eVar.f2151N == -1.0f || eVar.f2152O == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        byte[] bArr5 = new byte[25];
                                                        ByteBuffer order = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                                                        order.put((byte) 0);
                                                        order.putShort((short) ((eVar.f2144F * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((eVar.f2145G * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((eVar.f2146H * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((eVar.f2147I * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((eVar.f2148J * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((eVar.f2149K * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((eVar.L * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((eVar.f2150M * 50000.0f) + 0.5f));
                                                        order.putShort((short) (eVar.f2151N + 0.5f));
                                                        order.putShort((short) (eVar.f2152O + 0.5f));
                                                        order.putShort((short) eVar.f2142D);
                                                        order.putShort((short) eVar.f2143E);
                                                        bArr = bArr5;
                                                    }
                                                    int i24 = eVar.f2139A;
                                                    int i25 = eVar.f2141C;
                                                    int i26 = eVar.f2140B;
                                                    int i27 = eVar.f2180p;
                                                    c0089g = new C0089g(i24, i25, i26, bArr, i27, i27);
                                                } else {
                                                    c0089g = null;
                                                }
                                                String str7 = eVar.f2166b;
                                                int intValue = (str7 == null || !map.containsKey(str7)) ? -1 : ((Integer) map.get(eVar.f2166b)).intValue();
                                                if (eVar.f2184t == 0 && Float.compare(eVar.f2185u, 0.0f) == 0 && Float.compare(eVar.v, 0.0f) == 0) {
                                                    if (Float.compare(eVar.f2186w, 0.0f) == 0) {
                                                        intValue = 0;
                                                    } else if (Float.compare(eVar.f2186w, 90.0f) == 0) {
                                                        intValue = 90;
                                                    } else if (Float.compare(eVar.f2186w, -180.0f) == 0 || Float.compare(eVar.f2186w, 180.0f) == 0) {
                                                        intValue = 180;
                                                    } else if (Float.compare(eVar.f2186w, -90.0f) == 0) {
                                                        intValue = 270;
                                                    }
                                                }
                                                c0096n.f2836t = eVar.n;
                                                c0096n.f2837u = eVar.o;
                                                c0096n.z = f4;
                                                c0096n.f2840y = intValue;
                                                c0096n.f2806A = eVar.f2187x;
                                                c0096n.f2807B = eVar.f2188y;
                                                c0096n.f2808C = c0089g;
                                            } else if (!"application/x-subrip".equals(str6) && !"text/x-ssa".equals(str6) && !"text/vtt".equals(str6) && !"application/vobsub".equals(str6) && !"application/pgs".equals(str6) && !"application/dvbsubs".equals(str6)) {
                                                throw T.G.a(null, "Unexpected MIME type.");
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null && !map.containsKey(str4)) {
                                                c0096n.f2820b = eVar.f2166b;
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i21;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case 2:
                                            u uVar = new u(eVar.a(eVar.f2168c));
                                            try {
                                                int s4 = uVar.s();
                                                if (s4 != 1) {
                                                    if (s4 == 65534) {
                                                        uVar.M(24);
                                                        long t4 = uVar.t();
                                                        UUID uuid = f2193o0;
                                                        if (t4 == uuid.getMostSignificantBits()) {
                                                            break;
                                                        }
                                                    }
                                                    AbstractC0108a.s("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str6 = "audio/x-unknown";
                                                    B4 = -1;
                                                    i6 = -1;
                                                    str2 = null;
                                                    list3 = null;
                                                    if (eVar.f2153P != null) {
                                                        str2 = d4.f321b;
                                                        str6 = "video/dolby-vision";
                                                        break;
                                                    }
                                                    int i212 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                                    c0096n = new C0096n();
                                                    i7 = F.i(str6);
                                                    Map map2 = f2194p0;
                                                    if (!i7) {
                                                    }
                                                    str4 = eVar.f2166b;
                                                    if (str4 != null) {
                                                        c0096n.f2820b = eVar.f2166b;
                                                        break;
                                                    }
                                                    c0096n.f2819a = Integer.toString(i20);
                                                    c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                                    c0096n.f2831m = F.n(str6);
                                                    c0096n.n = i6;
                                                    c0096n.f2822d = eVar.f2163Z;
                                                    c0096n.f2823e = i212;
                                                    c0096n.f2832p = list3;
                                                    c0096n.f2828j = str2;
                                                    c0096n.f2833q = eVar.f2179m;
                                                    eVar.f2167b0 = c0096n.a();
                                                    eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                                    r9.put(eVar.f2170d, eVar);
                                                }
                                                int i28 = eVar.f2155R;
                                                String str8 = J.f3263a;
                                                B4 = J.B(i28, ByteOrder.LITTLE_ENDIAN);
                                                if (B4 == 0) {
                                                    AbstractC0108a.s("MatroskaExtractor", "Unsupported PCM bit depth: " + eVar.f2155R + ". Setting mimeType to audio/x-unknown");
                                                    str6 = "audio/x-unknown";
                                                    B4 = -1;
                                                    i6 = -1;
                                                    str2 = null;
                                                    list3 = null;
                                                    if (eVar.f2153P != null) {
                                                    }
                                                    int i2122 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                                    c0096n = new C0096n();
                                                    i7 = F.i(str6);
                                                    Map map22 = f2194p0;
                                                    if (!i7) {
                                                    }
                                                    str4 = eVar.f2166b;
                                                    if (str4 != null) {
                                                    }
                                                    c0096n.f2819a = Integer.toString(i20);
                                                    c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                                    c0096n.f2831m = F.n(str6);
                                                    c0096n.n = i6;
                                                    c0096n.f2822d = eVar.f2163Z;
                                                    c0096n.f2823e = i2122;
                                                    c0096n.f2832p = list3;
                                                    c0096n.f2828j = str2;
                                                    c0096n.f2833q = eVar.f2179m;
                                                    eVar.f2167b0 = c0096n.a();
                                                    eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                                    r9.put(eVar.f2170d, eVar);
                                                }
                                                str6 = "audio/raw";
                                                i6 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.f2153P != null) {
                                                }
                                                int i21222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                                c0096n = new C0096n();
                                                i7 = F.i(str6);
                                                Map map222 = f2194p0;
                                                if (!i7) {
                                                }
                                                str4 = eVar.f2166b;
                                                if (str4 != null) {
                                                }
                                                c0096n.f2819a = Integer.toString(i20);
                                                c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                                c0096n.f2831m = F.n(str6);
                                                c0096n.n = i6;
                                                c0096n.f2822d = eVar.f2163Z;
                                                c0096n.f2823e = i21222;
                                                c0096n.f2832p = list3;
                                                c0096n.f2828j = str2;
                                                c0096n.f2833q = eVar.f2179m;
                                                eVar.f2167b0 = c0096n.a();
                                                eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                                r9.put(eVar.f2170d, eVar);
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw T.G.a(null, "Error parsing MS/ACM codec private");
                                            }
                                            break;
                                        case 3:
                                            eVar.f2159V = new G();
                                            str6 = "audio/true-hd";
                                            B4 = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i212222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map2222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i212222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case 4:
                                            byte[] a5 = eVar.a(str5);
                                            try {
                                                r22 = a5[0];
                                                try {
                                                    if (r22 != 2) {
                                                        throw T.G.a(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i29 = 0;
                                                    int i30 = 1;
                                                    while (true) {
                                                        int i31 = a5[i30] & KotlinVersion.MAX_COMPONENT_VALUE;
                                                        if (i31 == 255) {
                                                            i29 += KotlinVersion.MAX_COMPONENT_VALUE;
                                                            i30++;
                                                        } else {
                                                            int i32 = i30 + 1;
                                                            int i33 = i29 + i31;
                                                            int i34 = 0;
                                                            while (true) {
                                                                int i35 = a5[i32] & KotlinVersion.MAX_COMPONENT_VALUE;
                                                                if (i35 == 255) {
                                                                    i34 += KotlinVersion.MAX_COMPONENT_VALUE;
                                                                    i32++;
                                                                } else {
                                                                    int i36 = i32 + 1;
                                                                    int i37 = i34 + i35;
                                                                    if (a5[i36] != 1) {
                                                                        throw T.G.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr6 = new byte[i33];
                                                                    System.arraycopy(a5, i36, bArr6, 0, i33);
                                                                    int i38 = i36 + i33;
                                                                    if (a5[i38] != 3) {
                                                                        throw T.G.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    int i39 = i38 + i37;
                                                                    if (a5[i39] != 5) {
                                                                        throw T.G.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr7 = new byte[a5.length - i39];
                                                                    System.arraycopy(a5, i39, bArr7, 0, a5.length - i39);
                                                                    ArrayList arrayList2 = new ArrayList(2);
                                                                    arrayList2.add(bArr6);
                                                                    arrayList2.add(bArr7);
                                                                    str6 = "audio/vorbis";
                                                                    i6 = 8192;
                                                                    arrayList = arrayList2;
                                                                    B4 = -1;
                                                                    list4 = arrayList;
                                                                    str2 = null;
                                                                    list3 = list4;
                                                                    if (eVar.f2153P != null) {
                                                                    }
                                                                    int i2122222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                                                    c0096n = new C0096n();
                                                                    i7 = F.i(str6);
                                                                    Map map22222 = f2194p0;
                                                                    if (!i7) {
                                                                    }
                                                                    str4 = eVar.f2166b;
                                                                    if (str4 != null) {
                                                                    }
                                                                    c0096n.f2819a = Integer.toString(i20);
                                                                    c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                                                    c0096n.f2831m = F.n(str6);
                                                                    c0096n.n = i6;
                                                                    c0096n.f2822d = eVar.f2163Z;
                                                                    c0096n.f2823e = i2122222;
                                                                    c0096n.f2832p = list3;
                                                                    c0096n.f2828j = str2;
                                                                    c0096n.f2833q = eVar.f2179m;
                                                                    eVar.f2167b0 = c0096n.a();
                                                                    eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                                                    r9.put(eVar.f2170d, eVar);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw T.G.a(r22, "Error parsing vorbis codec private");
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                r22 = 0;
                                            }
                                            break;
                                        case 5:
                                            str6 = "audio/mpeg-L2";
                                            B4 = -1;
                                            i6 = 4096;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i21222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i21222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case 6:
                                            str6 = "audio/mpeg";
                                            B4 = -1;
                                            i6 = 4096;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i212222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map2222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i212222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case 7:
                                            u uVar2 = new u(eVar.a(eVar.f2168c));
                                            try {
                                                uVar2.N(16);
                                                long q4 = uVar2.q();
                                                if (q4 == 1482049860) {
                                                    runtimeException = null;
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                        str2 = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        throw T.G.a(runtimeException, "Error parsing FourCC private data");
                                                    }
                                                } else {
                                                    if (q4 == 859189832) {
                                                        pair = new Pair("video/3gpp", null);
                                                    } else {
                                                        if (q4 == 826496599) {
                                                            byte[] bArr8 = uVar2.f3351a;
                                                            for (int i40 = uVar2.f3352b + 20; i40 < bArr8.length - 4; i40++) {
                                                                if (bArr8[i40] == 0 && bArr8[i40 + 1] == 0 && bArr8[i40 + 2] == 1) {
                                                                    if (bArr8[i40 + 3] == 15) {
                                                                        pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr8, i40, bArr8.length)));
                                                                    }
                                                                }
                                                            }
                                                            runtimeException = null;
                                                            throw T.G.a(null, "Failed to find FourCC VC1 initialization data");
                                                        }
                                                        AbstractC0108a.s("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str2 = null;
                                                        pair = new Pair("video/x-unknown", null);
                                                    }
                                                    str2 = null;
                                                }
                                                str6 = (String) pair.first;
                                                list = (List) pair.second;
                                                B4 = -1;
                                                i6 = -1;
                                                list3 = list;
                                                if (eVar.f2153P != null) {
                                                }
                                                int i2122222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                                c0096n = new C0096n();
                                                i7 = F.i(str6);
                                                Map map22222222 = f2194p0;
                                                if (!i7) {
                                                }
                                                str4 = eVar.f2166b;
                                                if (str4 != null) {
                                                }
                                                c0096n.f2819a = Integer.toString(i20);
                                                c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                                c0096n.f2831m = F.n(str6);
                                                c0096n.n = i6;
                                                c0096n.f2822d = eVar.f2163Z;
                                                c0096n.f2823e = i2122222222;
                                                c0096n.f2832p = list3;
                                                c0096n.f2828j = str2;
                                                c0096n.f2833q = eVar.f2179m;
                                                eVar.f2167b0 = c0096n.a();
                                                eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                                r9.put(eVar.f2170d, eVar);
                                            } catch (ArrayIndexOutOfBoundsException unused5) {
                                                runtimeException = null;
                                            }
                                            break;
                                        case '\b':
                                            byte[] bArr9 = new byte[4];
                                            System.arraycopy(eVar.a(str5), 0, bArr9, 0, 4);
                                            o = I.o(bArr9);
                                            str6 = "application/dvbsubs";
                                            B4 = -1;
                                            i6 = -1;
                                            list4 = o;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i21222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i21222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case '\n':
                                            C1572d a6 = C1572d.a(new u(eVar.a(eVar.f2168c)));
                                            ArrayList arrayList3 = a6.f16130a;
                                            eVar.f2169c0 = a6.f16131b;
                                            str3 = a6.f16141l;
                                            str6 = "video/avc";
                                            list2 = arrayList3;
                                            str2 = str3;
                                            list = list2;
                                            B4 = -1;
                                            i6 = -1;
                                            list3 = list;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i212222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map2222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i212222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case 11:
                                            o = I.o(eVar.a(str5));
                                            str6 = "application/vobsub";
                                            B4 = -1;
                                            i6 = -1;
                                            list4 = o;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i2122222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map22222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i2122222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case '\f':
                                            str6 = "audio/vnd.dts.hd";
                                            B4 = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i21222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map222222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i21222222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case '\r':
                                            List singletonList2 = Collections.singletonList(eVar.a(str5));
                                            byte[] bArr10 = eVar.f2178l;
                                            C0036l s5 = AbstractC1569a.s(new t(bArr10.length, bArr10), false);
                                            eVar.f2156S = s5.f630a;
                                            eVar.f2154Q = s5.f631b;
                                            str6 = "audio/mp4a-latm";
                                            list = singletonList2;
                                            str2 = s5.f632c;
                                            B4 = -1;
                                            i6 = -1;
                                            list3 = list;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i212222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map2222222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i212222222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case 14:
                                            str6 = "audio/ac3";
                                            B4 = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i2122222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map22222222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i2122222222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case 15:
                                        case 21:
                                            eVar.f2160W = true;
                                            str6 = "audio/vnd.dts";
                                            B4 = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i21222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map222222222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i21222222222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case 16:
                                            byte[] bArr11 = eVar.f2178l;
                                            singletonList = bArr11 == null ? null : I.o(bArr11);
                                            str6 = "video/av01";
                                            o = singletonList;
                                            B4 = -1;
                                            i6 = -1;
                                            list4 = o;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i212222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map2222222222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i212222222222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case 17:
                                            str6 = "video/x-vnd.on2.vp8";
                                            B4 = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i2122222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map22222222222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i2122222222222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case 18:
                                            byte[] bArr12 = eVar.f2178l;
                                            singletonList = bArr12 == null ? null : I.o(bArr12);
                                            str6 = "video/x-vnd.on2.vp9";
                                            o = singletonList;
                                            B4 = -1;
                                            i6 = -1;
                                            list4 = o;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i21222222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map222222222222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i21222222222222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case C0583e9.f11743C /* 19 */:
                                            str6 = "application/pgs";
                                            B4 = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i212222222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map2222222222222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i212222222222222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case C0583e9.f11744D /* 20 */:
                                            B4 = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i2122222222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map22222222222222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i2122222222222222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case Build.API_LEVELS.API_22 /* 22 */:
                                            if (eVar.f2155R == 32) {
                                                str6 = "audio/raw";
                                                B4 = 4;
                                                i6 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.f2153P != null) {
                                                }
                                                int i21222222222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                                c0096n = new C0096n();
                                                i7 = F.i(str6);
                                                Map map222222222222222222222 = f2194p0;
                                                if (!i7) {
                                                }
                                                str4 = eVar.f2166b;
                                                if (str4 != null) {
                                                }
                                                c0096n.f2819a = Integer.toString(i20);
                                                c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                                c0096n.f2831m = F.n(str6);
                                                c0096n.n = i6;
                                                c0096n.f2822d = eVar.f2163Z;
                                                c0096n.f2823e = i21222222222222222222222;
                                                c0096n.f2832p = list3;
                                                c0096n.f2828j = str2;
                                                c0096n.f2833q = eVar.f2179m;
                                                eVar.f2167b0 = c0096n.a();
                                                eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                                r9.put(eVar.f2170d, eVar);
                                            } else {
                                                AbstractC0108a.s("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + eVar.f2155R + ". Setting mimeType to audio/x-unknown");
                                                str6 = "audio/x-unknown";
                                                B4 = -1;
                                                i6 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.f2153P != null) {
                                                }
                                                int i212222222222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                                c0096n = new C0096n();
                                                i7 = F.i(str6);
                                                Map map2222222222222222222222 = f2194p0;
                                                if (!i7) {
                                                }
                                                str4 = eVar.f2166b;
                                                if (str4 != null) {
                                                }
                                                c0096n.f2819a = Integer.toString(i20);
                                                c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                                c0096n.f2831m = F.n(str6);
                                                c0096n.n = i6;
                                                c0096n.f2822d = eVar.f2163Z;
                                                c0096n.f2823e = i212222222222222222222222;
                                                c0096n.f2832p = list3;
                                                c0096n.f2828j = str2;
                                                c0096n.f2833q = eVar.f2179m;
                                                eVar.f2167b0 = c0096n.a();
                                                eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                                r9.put(eVar.f2170d, eVar);
                                            }
                                            break;
                                        case Build.API_LEVELS.API_23 /* 23 */:
                                            int i41 = eVar.f2155R;
                                            if (i41 == 8) {
                                                str6 = "audio/raw";
                                                B4 = 3;
                                                i6 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.f2153P != null) {
                                                }
                                                int i2122222222222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                                c0096n = new C0096n();
                                                i7 = F.i(str6);
                                                Map map22222222222222222222222 = f2194p0;
                                                if (!i7) {
                                                }
                                                str4 = eVar.f2166b;
                                                if (str4 != null) {
                                                }
                                                c0096n.f2819a = Integer.toString(i20);
                                                c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                                c0096n.f2831m = F.n(str6);
                                                c0096n.n = i6;
                                                c0096n.f2822d = eVar.f2163Z;
                                                c0096n.f2823e = i2122222222222222222222222;
                                                c0096n.f2832p = list3;
                                                c0096n.f2828j = str2;
                                                c0096n.f2833q = eVar.f2179m;
                                                eVar.f2167b0 = c0096n.a();
                                                eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                                r9.put(eVar.f2170d, eVar);
                                            } else {
                                                if (i41 == 16) {
                                                    B4 = 268435456;
                                                } else if (i41 == 24) {
                                                    B4 = 1342177280;
                                                } else if (i41 == 32) {
                                                    B4 = 1610612736;
                                                } else {
                                                    AbstractC0108a.s("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + eVar.f2155R + ". Setting mimeType to audio/x-unknown");
                                                    str6 = "audio/x-unknown";
                                                    B4 = -1;
                                                    i6 = -1;
                                                    str2 = null;
                                                    list3 = null;
                                                    if (eVar.f2153P != null) {
                                                    }
                                                    int i21222222222222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                                    c0096n = new C0096n();
                                                    i7 = F.i(str6);
                                                    Map map222222222222222222222222 = f2194p0;
                                                    if (!i7) {
                                                    }
                                                    str4 = eVar.f2166b;
                                                    if (str4 != null) {
                                                    }
                                                    c0096n.f2819a = Integer.toString(i20);
                                                    c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                                    c0096n.f2831m = F.n(str6);
                                                    c0096n.n = i6;
                                                    c0096n.f2822d = eVar.f2163Z;
                                                    c0096n.f2823e = i21222222222222222222222222;
                                                    c0096n.f2832p = list3;
                                                    c0096n.f2828j = str2;
                                                    c0096n.f2833q = eVar.f2179m;
                                                    eVar.f2167b0 = c0096n.a();
                                                    eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                                    r9.put(eVar.f2170d, eVar);
                                                }
                                                str6 = "audio/raw";
                                                i6 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.f2153P != null) {
                                                }
                                                int i212222222222222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                                c0096n = new C0096n();
                                                i7 = F.i(str6);
                                                Map map2222222222222222222222222 = f2194p0;
                                                if (!i7) {
                                                }
                                                str4 = eVar.f2166b;
                                                if (str4 != null) {
                                                }
                                                c0096n.f2819a = Integer.toString(i20);
                                                c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                                c0096n.f2831m = F.n(str6);
                                                c0096n.n = i6;
                                                c0096n.f2822d = eVar.f2163Z;
                                                c0096n.f2823e = i212222222222222222222222222;
                                                c0096n.f2832p = list3;
                                                c0096n.f2828j = str2;
                                                c0096n.f2833q = eVar.f2179m;
                                                eVar.f2167b0 = c0096n.a();
                                                eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                                r9.put(eVar.f2170d, eVar);
                                            }
                                            break;
                                        case 24:
                                            int i42 = eVar.f2155R;
                                            String str9 = J.f3263a;
                                            B4 = J.B(i42, ByteOrder.LITTLE_ENDIAN);
                                            if (B4 == 0) {
                                                AbstractC0108a.s("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + eVar.f2155R + ". Setting mimeType to audio/x-unknown");
                                                str6 = "audio/x-unknown";
                                                B4 = -1;
                                                i6 = -1;
                                                str2 = null;
                                                list3 = null;
                                                if (eVar.f2153P != null) {
                                                }
                                                int i2122222222222222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                                c0096n = new C0096n();
                                                i7 = F.i(str6);
                                                Map map22222222222222222222222222 = f2194p0;
                                                if (!i7) {
                                                }
                                                str4 = eVar.f2166b;
                                                if (str4 != null) {
                                                }
                                                c0096n.f2819a = Integer.toString(i20);
                                                c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                                c0096n.f2831m = F.n(str6);
                                                c0096n.n = i6;
                                                c0096n.f2822d = eVar.f2163Z;
                                                c0096n.f2823e = i2122222222222222222222222222;
                                                c0096n.f2832p = list3;
                                                c0096n.f2828j = str2;
                                                c0096n.f2833q = eVar.f2179m;
                                                eVar.f2167b0 = c0096n.a();
                                                eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                                r9.put(eVar.f2170d, eVar);
                                            }
                                            str6 = "audio/raw";
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i21222222222222222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map222222222222222222222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i21222222222222222222222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case 25:
                                        case 26:
                                            o = I.p(f2190l0, eVar.a(str5));
                                            str6 = "text/x-ssa";
                                            B4 = -1;
                                            i6 = -1;
                                            list4 = o;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i212222222222222222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map2222222222222222222222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i212222222222222222222222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case 27:
                                            y0.u a7 = y0.u.a(new u(eVar.a(eVar.f2168c)), false, null);
                                            List list6 = a7.f16199a;
                                            eVar.f2169c0 = a7.f16200b;
                                            str3 = a7.n;
                                            str6 = "video/hevc";
                                            list2 = list6;
                                            str2 = str3;
                                            list = list2;
                                            B4 = -1;
                                            i6 = -1;
                                            list3 = list;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i2122222222222222222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map22222222222222222222222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i2122222222222222222222222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case Build.API_LEVELS.API_28 /* 28 */:
                                            str6 = "text/vtt";
                                            B4 = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i21222222222222222222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map222222222222222222222222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i21222222222222222222222222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case 29:
                                            str6 = "application/x-subrip";
                                            B4 = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i212222222222222222222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map2222222222222222222222222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i212222222222222222222222222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case Build.API_LEVELS.API_30 /* 30 */:
                                            str6 = "video/mpeg2";
                                            B4 = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i2122222222222222222222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map22222222222222222222222222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i2122222222222222222222222222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case Build.API_LEVELS.API_31 /* 31 */:
                                            str6 = "audio/eac3";
                                            B4 = -1;
                                            i6 = -1;
                                            str2 = null;
                                            list3 = null;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i21222222222222222222222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map222222222222222222222222222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i21222222222222222222222222222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case Build.API_LEVELS.API_32 /* 32 */:
                                            singletonList = Collections.singletonList(eVar.a(str5));
                                            str6 = "audio/flac";
                                            o = singletonList;
                                            B4 = -1;
                                            i6 = -1;
                                            list4 = o;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i212222222222222222222222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map2222222222222222222222222222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i212222222222222222222222222222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        case Build.API_LEVELS.API_33 /* 33 */:
                                            ArrayList arrayList4 = new ArrayList(3);
                                            arrayList4.add(eVar.a(eVar.f2168c));
                                            ByteBuffer allocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            arrayList4.add(allocate.order(byteOrder).putLong(eVar.f2157T).array());
                                            arrayList4.add(ByteBuffer.allocate(8).order(byteOrder).putLong(eVar.f2158U).array());
                                            str6 = "audio/opus";
                                            i6 = 5760;
                                            arrayList = arrayList4;
                                            B4 = -1;
                                            list4 = arrayList;
                                            str2 = null;
                                            list3 = list4;
                                            if (eVar.f2153P != null) {
                                            }
                                            int i2122222222222222222222222222222222222 = (eVar.f2162Y ? 1 : 0) | (!eVar.f2161X ? 2 : 0);
                                            c0096n = new C0096n();
                                            i7 = F.i(str6);
                                            Map map22222222222222222222222222222222222 = f2194p0;
                                            if (!i7) {
                                            }
                                            str4 = eVar.f2166b;
                                            if (str4 != null) {
                                            }
                                            c0096n.f2819a = Integer.toString(i20);
                                            c0096n.f2830l = F.n(!eVar.f2164a ? "video/webm" : "video/x-matroska");
                                            c0096n.f2831m = F.n(str6);
                                            c0096n.n = i6;
                                            c0096n.f2822d = eVar.f2163Z;
                                            c0096n.f2823e = i2122222222222222222222222222222222222;
                                            c0096n.f2832p = list3;
                                            c0096n.f2828j = str2;
                                            c0096n.f2833q = eVar.f2179m;
                                            eVar.f2167b0 = c0096n.a();
                                            eVar.f2165a0 = fVar3.f2239j0.z(eVar.f2170d, eVar.f2171e);
                                            r9.put(eVar.f2170d, eVar);
                                            break;
                                        default:
                                            throw T.G.a(null, "Unrecognized codec identifier.");
                                    }
                                default:
                                    fVar3.f2251y = null;
                                    break;
                            }
                        } else if (i19 != 183) {
                            if (i19 == 19899) {
                                int i43 = fVar3.f2195A;
                                if (i43 != -1) {
                                    long j10 = fVar3.f2196B;
                                    if (j10 != -1) {
                                        if (i43 == 475249515) {
                                            fVar3.f2205K = j10;
                                        }
                                    }
                                }
                                throw T.G.a(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i19 == 25152) {
                                fVar3.g(i19);
                                e eVar2 = fVar3.f2251y;
                                if (eVar2.f2175i) {
                                    y0.E e4 = eVar2.f2177k;
                                    if (e4 == null) {
                                        throw T.G.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    eVar2.f2179m = new C0094l(new C0093k(AbstractC0088f.f2779a, null, "video/webm", e4.f16085b));
                                }
                            } else if (i19 == 28032) {
                                fVar3.g(i19);
                                e eVar3 = fVar3.f2251y;
                                if (eVar3.f2175i && eVar3.f2176j != null) {
                                    throw T.G.a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i19 == 357149030) {
                                if (fVar3.f2247t == -9223372036854775807L) {
                                    fVar3.f2247t = 1000000L;
                                }
                                long j11 = fVar3.f2248u;
                                if (j11 != -9223372036854775807L) {
                                    fVar3.v = fVar3.m(j11);
                                }
                            } else if (i19 == 374648427) {
                                boolean z8 = z5;
                                if (r9.size() == 0) {
                                    throw T.G.a(null, "No valid tracks were found");
                                }
                                boolean z9 = (!fVar3.f2226d || fVar3.f2205K == -1) ? true : z8 ? 1 : 0;
                                int i44 = -1;
                                int i45 = -1;
                                int i46 = -1;
                                int i47 = -1;
                                for (int i48 = z8 ? 1 : 0; i48 < r9.size(); i48++) {
                                    e eVar4 = (e) r9.valueAt(i48);
                                    int i49 = eVar4.f2171e;
                                    if (i49 == 2) {
                                        if (eVar4.f2162Y) {
                                            i44 = eVar4.f2170d;
                                        }
                                        if (i45 == -1) {
                                            i45 = eVar4.f2170d;
                                        }
                                    } else if (i49 == 1) {
                                        if (eVar4.f2162Y) {
                                            i46 = eVar4.f2170d;
                                        }
                                        if (i47 == -1) {
                                            i47 = eVar4.f2170d;
                                        }
                                    }
                                    if (z9) {
                                        eVar4.f2165a0.getClass();
                                        if (!eVar4.f2160W) {
                                            y0.F f5 = eVar4.f2165a0;
                                            C0097o c0097o = eVar4.f2167b0;
                                            c0097o.getClass();
                                            f5.d(c0097o);
                                        }
                                    }
                                }
                                if (i44 != -1) {
                                    fVar3.f2203I = i44;
                                } else if (i45 != -1) {
                                    fVar3.f2203I = i45;
                                } else if (i46 != -1) {
                                    fVar3.f2203I = i46;
                                } else if (i47 != -1) {
                                    fVar3.f2203I = i47;
                                } else {
                                    fVar3.f2203I = r9.size() > 0 ? ((e) r9.valueAt(z8 ? 1 : 0)).f2170d : -1;
                                }
                                if (z9) {
                                    fVar3.j();
                                }
                            } else if (i19 == 475249515 && !fVar3.z) {
                                ?? r6 = z5;
                                while (true) {
                                    if (r6 < r82.size()) {
                                        if (((List) r82.valueAt(r6)).isEmpty()) {
                                            r6++;
                                        } else if (fVar3.v != -9223372036854775807L) {
                                            for (?? r62 = z5; r62 < r82.size(); r62++) {
                                                Collections.sort((List) r82.valueAt(r62));
                                            }
                                            fVar3.f2239j0.x(new d(r82, fVar3.v, fVar3.f2203I, fVar3.f2246s, fVar3.f2245r));
                                        }
                                    }
                                }
                                fVar3.f2239j0.x(new A0.b(fVar3.v));
                                fVar3.z = r4;
                                fVar3.f2198D = z5;
                                int i50 = r4;
                                for (?? r63 = z5; r63 < r9.size(); r63 = i11 + 1) {
                                    e eVar5 = (e) r9.valueAt(r63);
                                    long j12 = fVar3.v;
                                    long j13 = fVar3.f2246s;
                                    long j14 = fVar3.f2245r;
                                    boolean z10 = z5;
                                    int i51 = i50;
                                    if (eVar5.f2171e != 2 || (list5 = (List) r82.get(eVar5.f2170d)) == null || list5.isEmpty()) {
                                        i11 = r63;
                                    } else {
                                        if (list5.isEmpty()) {
                                            i11 = r63;
                                        } else {
                                            i11 = r63;
                                            int min = Math.min(list5.size(), 20);
                                            double d5 = 0.0d;
                                            int i52 = z10 ? 1 : 0;
                                            int i53 = -1;
                                            while (i52 < min) {
                                                c cVar = (c) list5.get(i52);
                                                long j15 = j13;
                                                long j16 = cVar.f2132a;
                                                long j17 = cVar.f2134c;
                                                long j18 = cVar.f2133b;
                                                if (j16 <= 10000000) {
                                                    if (i52 < list5.size() - 1) {
                                                        c cVar2 = (c) list5.get(i52 + 1);
                                                        i12 = i52;
                                                        j5 = (cVar2.f2133b + cVar2.f2134c) - (j18 + j17);
                                                        j6 = cVar2.f2132a - j16;
                                                    } else {
                                                        i12 = i52;
                                                        j5 = (j15 + j14) - (j18 + j17);
                                                        j6 = j12 - j16;
                                                    }
                                                    if (j6 > 0) {
                                                        double d6 = j5 / j6;
                                                        if (d6 > d5) {
                                                            d5 = d6;
                                                            i53 = i12;
                                                        }
                                                    }
                                                    i52 = i12 + 1;
                                                    j13 = j15;
                                                } else if (i53 != -1) {
                                                    j4 = ((c) list5.get(i53)).f2132a;
                                                    if (j4 != -9223372036854775807L) {
                                                        C0097o c0097o2 = eVar5.f2167b0;
                                                        c0097o2.getClass();
                                                        E e5 = c0097o2.f2867l;
                                                        H0.c cVar3 = new H0.c(j4);
                                                        if (e5 == null) {
                                                            D[] dArr = new D[i51];
                                                            dArr[z10 ? 1 : 0] = cVar3;
                                                            a4 = new E(dArr);
                                                        } else {
                                                            D[] dArr2 = new D[i51];
                                                            dArr2[z10 ? 1 : 0] = cVar3;
                                                            a4 = e5.a(dArr2);
                                                        }
                                                        C0096n a8 = eVar5.f2167b0.a();
                                                        a8.f2829k = a4;
                                                        eVar5.f2167b0 = new C0097o(a8);
                                                    }
                                                }
                                            }
                                            if (i53 != -1) {
                                            }
                                        }
                                        j4 = -9223372036854775807L;
                                        if (j4 != -9223372036854775807L) {
                                        }
                                    }
                                    if (!eVar5.f2160W) {
                                        eVar5.f2165a0.getClass();
                                        y0.F f6 = eVar5.f2165a0;
                                        C0097o c0097o3 = eVar5.f2167b0;
                                        c0097o3.getClass();
                                        f6.d(c0097o3);
                                    }
                                    z5 = z10 ? 1 : 0;
                                    i50 = 1;
                                }
                                fVar3.j();
                                z4 = z5;
                                oVar2 = oVar;
                            }
                        } else if (!fVar3.z) {
                            fVar3.f(i19);
                            if (fVar3.f2199E != -9223372036854775807L && (i10 = fVar3.f2200F) != -1 && fVar3.f2201G != -1) {
                                List list7 = (List) r82.get(i10);
                                if (list7 == null) {
                                    list7 = new ArrayList();
                                    r82.put(fVar3.f2200F, list7);
                                }
                                list7.add(new c(fVar3.f2199E, fVar3.f2246s + fVar3.f2201G, fVar3.f2202H));
                            }
                        }
                        z4 = false;
                        oVar2 = oVar;
                    } else {
                        if (fVar3.f2208O == 2) {
                            e eVar6 = (e) r9.get(fVar3.f2214U);
                            eVar6.f2165a0.getClass();
                            if (fVar3.f2219Z > 0 && "A_OPUS".equals(eVar6.f2168c)) {
                                u uVar3 = fVar3.f2243p;
                                byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(fVar3.f2219Z).array();
                                uVar3.getClass();
                                uVar3.K(array.length, array);
                            }
                            int i54 = 0;
                            for (int i55 = 0; i55 < fVar3.f2212S; i55++) {
                                i54 += fVar3.f2213T[i55];
                            }
                            int i56 = 0;
                            while (i56 < fVar3.f2212S) {
                                long j19 = fVar3.f2209P + ((eVar6.f2172f * i56) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
                                int i57 = fVar3.f2216W;
                                if (i56 == 0 && !fVar3.f2218Y) {
                                    i57 |= 1;
                                }
                                int i58 = fVar3.f2213T[i56];
                                int i59 = i54 - i58;
                                fVar3.h(eVar6, j19, i57, i58, i59);
                                i56++;
                                i54 = i59;
                            }
                            z4 = false;
                            fVar3.f2208O = 0;
                            oVar2 = oVar;
                        }
                        z4 = false;
                        oVar2 = oVar;
                    }
                }
            }
        }
        if (z7) {
            return 0;
        }
        int i60 = 0;
        while (true) {
            SparseArray sparseArray = fVar.f2224c;
            if (i60 >= sparseArray.size()) {
                return -1;
            }
            e eVar7 = (e) sparseArray.valueAt(i60);
            eVar7.f2165a0.getClass();
            G g4 = eVar7.f2159V;
            if (g4 != null) {
                g4.a(eVar7.f2165a0, eVar7.f2177k);
            }
            i60++;
        }
    }

    @Override // y0.n
    public final void e(p pVar) {
        if (this.f2228e) {
            pVar = new U.b(pVar, this.f2230f);
        }
        this.f2239j0 = pVar;
    }

    public final void f(int i4) {
        if (this.f2198D) {
            return;
        }
        throw T.G.a(null, "Element " + i4 + " must be in a Cues");
    }

    public final void g(int i4) {
        if (this.f2251y != null) {
            return;
        }
        throw T.G.a(null, "Element " + i4 + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(e eVar, long j4, int i4, int i5, int i6) {
        byte[] i7;
        int i8;
        int i9;
        G g4 = eVar.f2159V;
        if (g4 != null) {
            g4.b(eVar.f2165a0, j4, i4, i5, i6, eVar.f2177k);
        } else {
            if ("S_TEXT/UTF8".equals(eVar.f2168c) || "S_TEXT/ASS".equals(eVar.f2168c) || "S_TEXT/SSA".equals(eVar.f2168c) || "S_TEXT/WEBVTT".equals(eVar.f2168c)) {
                if (this.f2212S > 1) {
                    AbstractC0108a.s("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j5 = this.f2210Q;
                    if (j5 == -9223372036854775807L) {
                        AbstractC0108a.s("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = eVar.f2168c;
                        u uVar = this.f2242m;
                        byte[] bArr = uVar.f3351a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                i7 = i(j5, 10000L, "%01d:%02d:%02d:%02d");
                                i8 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                i7 = i(j5, 1000L, "%02d:%02d:%02d.%03d");
                                i8 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                i7 = i(j5, 1000L, "%02d:%02d:%02d,%03d");
                                i8 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(i7, 0, bArr, i8, i7.length);
                        int i10 = uVar.f3352b;
                        while (true) {
                            if (i10 < uVar.f3353c) {
                                if (uVar.f3351a[i10] == 0) {
                                    uVar.L(i10);
                                } else {
                                    i10++;
                                }
                            }
                        }
                        eVar.f2165a0.a(uVar.f3353c, uVar);
                        i9 = i5 + uVar.f3353c;
                        if ((i4 & 268435456) != 0) {
                            int i11 = this.f2212S;
                            u uVar2 = this.f2243p;
                            if (i11 > 1) {
                                uVar2.J(0);
                            } else {
                                int i12 = uVar2.f3353c;
                                eVar.f2165a0.b(uVar2, i12, 2);
                                i9 += i12;
                            }
                        }
                        eVar.f2165a0.e(j4, i4, i9, i6, eVar.f2177k);
                    }
                }
            }
            i9 = i5;
            if ((i4 & 268435456) != 0) {
            }
            eVar.f2165a0.e(j4, i4, i9, i6, eVar.f2177k);
        }
        this.f2207N = true;
    }

    public final void j() {
        if (!this.f2250x) {
            return;
        }
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f2224c;
            if (i4 >= sparseArray.size()) {
                p pVar = this.f2239j0;
                pVar.getClass();
                pVar.r();
                this.f2250x = false;
                return;
            }
            if (((e) sparseArray.valueAt(i4)).f2160W) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final void k(o oVar, int i4) {
        u uVar = this.f2236i;
        if (uVar.f3353c >= i4) {
            return;
        }
        byte[] bArr = uVar.f3351a;
        if (bArr.length < i4) {
            uVar.c(Math.max(bArr.length * 2, i4));
        }
        byte[] bArr2 = uVar.f3351a;
        int i5 = uVar.f3353c;
        oVar.readFully(bArr2, i5, i4 - i5);
        uVar.L(i4);
    }

    public final void l() {
        this.f2221a0 = 0;
        this.f2223b0 = 0;
        this.f2225c0 = 0;
        this.f2227d0 = false;
        this.f2229e0 = false;
        this.f2231f0 = false;
        this.f2233g0 = 0;
        this.f2235h0 = (byte) 0;
        this.f2237i0 = false;
        this.f2241l.J(0);
    }

    public final long m(long j4) {
        long j5 = this.f2247t;
        if (j5 == -9223372036854775807L) {
            throw T.G.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = J.f3263a;
        return J.U(j4, j5, 1000L, RoundingMode.DOWN);
    }

    public final int n(o oVar, e eVar, int i4, boolean z) {
        int g4;
        int g5;
        int i5;
        if ("S_TEXT/UTF8".equals(eVar.f2168c)) {
            o(oVar, f2189k0, i4);
            int i6 = this.f2223b0;
            l();
            return i6;
        }
        if ("S_TEXT/ASS".equals(eVar.f2168c) || "S_TEXT/SSA".equals(eVar.f2168c)) {
            o(oVar, f2191m0, i4);
            int i7 = this.f2223b0;
            l();
            return i7;
        }
        if ("S_TEXT/WEBVTT".equals(eVar.f2168c)) {
            o(oVar, f2192n0, i4);
            int i8 = this.f2223b0;
            l();
            return i8;
        }
        if (eVar.f2160W) {
            eVar.f2167b0.getClass();
            u uVar = new u(i4);
            if (oVar.l(uVar.f3351a, 0, i4, true)) {
                oVar.u();
                if (AbstractC1569a.l(uVar.i()) == 1 && uVar.a() >= 10) {
                    byte[] bArr = new byte[10];
                    uVar.k(bArr, 0, 10);
                    uVar.M(0);
                    int j4 = AbstractC1569a.j(bArr);
                    if (j4 > 0 && uVar.a() >= j4 + 4) {
                        uVar.N(j4);
                        if (AbstractC1569a.l(uVar.m()) == 2) {
                            C0096n a3 = eVar.f2167b0.a();
                            a3.f2831m = F.n("audio/vnd.dts.hd");
                            eVar.f2167b0 = new C0097o(a3);
                        }
                    }
                }
            }
            eVar.f2165a0.d(eVar.f2167b0);
            eVar.f2160W = false;
            j();
        }
        y0.F f4 = eVar.f2165a0;
        boolean z4 = this.f2227d0;
        u uVar2 = this.f2241l;
        if (!z4) {
            boolean z5 = eVar.f2175i;
            u uVar3 = this.f2236i;
            if (z5) {
                this.f2216W &= -1073741825;
                if (!this.f2229e0) {
                    oVar.readFully(uVar3.f3351a, 0, 1);
                    this.f2221a0++;
                    byte b4 = uVar3.f3351a[0];
                    if ((b4 & 128) == 128) {
                        throw T.G.a(null, "Extension bit is set in signal byte");
                    }
                    this.f2235h0 = b4;
                    this.f2229e0 = true;
                }
                byte b5 = this.f2235h0;
                if ((b5 & 1) == 1) {
                    boolean z6 = (b5 & 2) == 2;
                    this.f2216W |= 1073741824;
                    if (!this.f2237i0) {
                        u uVar4 = this.n;
                        oVar.readFully(uVar4.f3351a, 0, 8);
                        this.f2221a0 += 8;
                        this.f2237i0 = true;
                        uVar3.f3351a[0] = (byte) ((z6 ? 128 : 0) | 8);
                        uVar3.M(0);
                        f4.b(uVar3, 1, 1);
                        this.f2223b0++;
                        uVar4.M(0);
                        f4.b(uVar4, 8, 1);
                        this.f2223b0 += 8;
                    }
                    if (z6) {
                        if (!this.f2231f0) {
                            oVar.readFully(uVar3.f3351a, 0, 1);
                            this.f2221a0++;
                            uVar3.M(0);
                            this.f2233g0 = uVar3.z();
                            this.f2231f0 = true;
                        }
                        int i9 = this.f2233g0 * 4;
                        uVar3.J(i9);
                        oVar.readFully(uVar3.f3351a, 0, i9);
                        this.f2221a0 += i9;
                        short s4 = (short) ((this.f2233g0 / 2) + 1);
                        int i10 = (s4 * 6) + 2;
                        ByteBuffer byteBuffer = this.f2244q;
                        if (byteBuffer == null || byteBuffer.capacity() < i10) {
                            this.f2244q = ByteBuffer.allocate(i10);
                        }
                        this.f2244q.position(0);
                        this.f2244q.putShort(s4);
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            i5 = this.f2233g0;
                            if (i11 >= i5) {
                                break;
                            }
                            int D3 = uVar3.D();
                            if (i11 % 2 == 0) {
                                this.f2244q.putShort((short) (D3 - i12));
                            } else {
                                this.f2244q.putInt(D3 - i12);
                            }
                            i11++;
                            i12 = D3;
                        }
                        int i13 = (i4 - this.f2221a0) - i12;
                        if (i5 % 2 == 1) {
                            this.f2244q.putInt(i13);
                        } else {
                            this.f2244q.putShort((short) i13);
                            this.f2244q.putInt(0);
                        }
                        byte[] array = this.f2244q.array();
                        u uVar5 = this.o;
                        uVar5.K(i10, array);
                        f4.b(uVar5, i10, 1);
                        this.f2223b0 += i10;
                    }
                }
            } else {
                byte[] bArr2 = eVar.f2176j;
                if (bArr2 != null) {
                    uVar2.K(bArr2.length, bArr2);
                }
            }
            if ("A_OPUS".equals(eVar.f2168c) ? z : eVar.f2173g > 0) {
                this.f2216W |= 268435456;
                this.f2243p.J(0);
                int i14 = (uVar2.f3353c + i4) - this.f2221a0;
                uVar3.J(4);
                byte[] bArr3 = uVar3.f3351a;
                bArr3[0] = (byte) ((i14 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr3[1] = (byte) ((i14 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr3[2] = (byte) ((i14 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr3[3] = (byte) (i14 & KotlinVersion.MAX_COMPONENT_VALUE);
                f4.b(uVar3, 4, 2);
                this.f2223b0 += 4;
            }
            this.f2227d0 = true;
        }
        int i15 = i4 + uVar2.f3353c;
        if (!"V_MPEG4/ISO/AVC".equals(eVar.f2168c) && !"V_MPEGH/ISO/HEVC".equals(eVar.f2168c)) {
            if (eVar.f2159V != null) {
                AbstractC0124a.t(uVar2.f3353c == 0);
                eVar.f2159V.c(oVar);
            }
            while (true) {
                int i16 = this.f2221a0;
                if (i16 >= i15) {
                    break;
                }
                int i17 = i15 - i16;
                int a4 = uVar2.a();
                if (a4 > 0) {
                    g5 = Math.min(i17, a4);
                    f4.a(g5, uVar2);
                } else {
                    g5 = f4.g(oVar, i17, false);
                }
                this.f2221a0 += g5;
                this.f2223b0 += g5;
            }
        } else {
            u uVar6 = this.f2234h;
            byte[] bArr4 = uVar6.f3351a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i18 = eVar.f2169c0;
            int i19 = 4 - i18;
            while (this.f2221a0 < i15) {
                int i20 = this.f2225c0;
                if (i20 == 0) {
                    int min = Math.min(i18, uVar2.a());
                    oVar.readFully(bArr4, i19 + min, i18 - min);
                    if (min > 0) {
                        uVar2.k(bArr4, i19, min);
                    }
                    this.f2221a0 += i18;
                    uVar6.M(0);
                    this.f2225c0 = uVar6.D();
                    u uVar7 = this.f2232g;
                    uVar7.M(0);
                    f4.a(4, uVar7);
                    this.f2223b0 += 4;
                } else {
                    int a5 = uVar2.a();
                    if (a5 > 0) {
                        g4 = Math.min(i20, a5);
                        f4.a(g4, uVar2);
                    } else {
                        g4 = f4.g(oVar, i20, false);
                    }
                    this.f2221a0 += g4;
                    this.f2223b0 += g4;
                    this.f2225c0 -= g4;
                }
            }
        }
        if ("A_VORBIS".equals(eVar.f2168c)) {
            u uVar8 = this.f2238j;
            uVar8.M(0);
            f4.a(4, uVar8);
            this.f2223b0 += 4;
        }
        int i21 = this.f2223b0;
        l();
        return i21;
    }

    public final void o(o oVar, byte[] bArr, int i4) {
        int length = bArr.length + i4;
        u uVar = this.f2242m;
        byte[] bArr2 = uVar.f3351a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i4);
            uVar.getClass();
            uVar.K(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        oVar.readFully(uVar.f3351a, bArr.length, i4);
        uVar.M(0);
        uVar.L(length);
    }

    @Override // y0.n
    public final void release() {
    }
}
