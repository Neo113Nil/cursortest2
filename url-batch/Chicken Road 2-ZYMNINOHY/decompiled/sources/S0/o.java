package S0;

import E.AbstractC0005f;
import T.C0093k;
import T.C0094l;
import T.C0096n;
import T.C0097o;
import T.E;
import W.AbstractC0108a;
import W.G;
import W.J;
import a.AbstractC0124a;
import android.util.Pair;
import android.util.SparseArray;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.UUID;
import q.C1351b;
import v2.I;
import v2.a0;
import y0.C;
import y0.F;

/* loaded from: classes.dex */
public final class o implements y0.n {

    /* renamed from: P, reason: collision with root package name */
    public static final byte[] f2450P = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: Q, reason: collision with root package name */
    public static final C0097o f2451Q;

    /* renamed from: A, reason: collision with root package name */
    public long f2452A;

    /* renamed from: B, reason: collision with root package name */
    public long f2453B;

    /* renamed from: C, reason: collision with root package name */
    public long f2454C;

    /* renamed from: D, reason: collision with root package name */
    public n f2455D;

    /* renamed from: E, reason: collision with root package name */
    public int f2456E;

    /* renamed from: F, reason: collision with root package name */
    public int f2457F;

    /* renamed from: G, reason: collision with root package name */
    public int f2458G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2459H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2460I;

    /* renamed from: J, reason: collision with root package name */
    public y0.p f2461J;

    /* renamed from: K, reason: collision with root package name */
    public F[] f2462K;
    public F[] L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f2463M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f2464N;

    /* renamed from: O, reason: collision with root package name */
    public long f2465O;

    /* renamed from: a, reason: collision with root package name */
    public final V0.j f2466a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2467b;

    /* renamed from: c, reason: collision with root package name */
    public final x f2468c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2469d;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f2474i;

    /* renamed from: j, reason: collision with root package name */
    public final W.u f2475j;

    /* renamed from: k, reason: collision with root package name */
    public final G f2476k;

    /* renamed from: p, reason: collision with root package name */
    public final K3.n f2479p;

    /* renamed from: q, reason: collision with root package name */
    public final F f2480q;

    /* renamed from: r, reason: collision with root package name */
    public final C1351b f2481r;

    /* renamed from: s, reason: collision with root package name */
    public a0 f2482s;

    /* renamed from: t, reason: collision with root package name */
    public int f2483t;

    /* renamed from: u, reason: collision with root package name */
    public int f2484u;
    public long v;

    /* renamed from: w, reason: collision with root package name */
    public int f2485w;

    /* renamed from: x, reason: collision with root package name */
    public W.u f2486x;

    /* renamed from: y, reason: collision with root package name */
    public long f2487y;
    public int z;

    /* renamed from: l, reason: collision with root package name */
    public final l2.e f2477l = new l2.e(8);

    /* renamed from: m, reason: collision with root package name */
    public final W.u f2478m = new W.u(16);

    /* renamed from: f, reason: collision with root package name */
    public final W.u f2471f = new W.u(X.p.f3552a);

    /* renamed from: g, reason: collision with root package name */
    public final W.u f2472g = new W.u(6);

    /* renamed from: h, reason: collision with root package name */
    public final W.u f2473h = new W.u();
    public final ArrayDeque n = new ArrayDeque();
    public final ArrayDeque o = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f2470e = new SparseArray();

    static {
        C0096n c0096n = new C0096n();
        c0096n.f2831m = T.F.n("application/x-emsg");
        f2451Q = new C0097o(c0096n);
    }

    public o(V0.j jVar, int i4, G g4, x xVar, List list, d0.o oVar) {
        this.f2466a = jVar;
        this.f2467b = i4;
        this.f2476k = g4;
        this.f2468c = xVar;
        this.f2469d = Collections.unmodifiableList(list);
        this.f2480q = oVar;
        byte[] bArr = new byte[16];
        this.f2474i = bArr;
        this.f2475j = new W.u(bArr);
        v2.G g5 = I.f15571b;
        this.f2482s = a0.f15605e;
        this.f2453B = -9223372036854775807L;
        this.f2452A = -9223372036854775807L;
        this.f2454C = -9223372036854775807L;
        this.f2461J = y0.p.f16182y0;
        this.f2462K = new F[0];
        this.L = new F[0];
        this.f2479p = new K3.n(new l(this));
        this.f2481r = new C1351b(1);
        this.f2465O = -1L;
    }

    public static C0094l g(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            X.d dVar = (X.d) list.get(i4);
            if (dVar.f3496b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = dVar.f3494c.f3351a;
                t1.h i5 = w.i(bArr);
                UUID uuid = i5 == null ? null : (UUID) i5.f15398b;
                if (uuid == null) {
                    AbstractC0108a.s("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C0093k(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C0094l(null, false, (C0093k[]) arrayList.toArray(new C0093k[0]));
    }

    public static void h(W.u uVar, int i4, z zVar) {
        uVar.M(i4 + 8);
        int m4 = uVar.m();
        byte[] bArr = j.f2428a;
        if ((m4 & 1) != 0) {
            throw T.G.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (m4 & 2) != 0;
        int D3 = uVar.D();
        if (D3 == 0) {
            Arrays.fill(zVar.f2565l, 0, zVar.f2558e, false);
            return;
        }
        int i5 = zVar.f2558e;
        W.u uVar2 = zVar.n;
        if (D3 != i5) {
            StringBuilder r4 = AbstractC0005f.r(D3, "Senc sample count ", " is different from fragment sample count");
            r4.append(zVar.f2558e);
            throw T.G.a(null, r4.toString());
        }
        Arrays.fill(zVar.f2565l, 0, D3, z);
        uVar2.J(uVar.a());
        zVar.f2564k = true;
        zVar.o = true;
        uVar.k(uVar2.f3351a, 0, uVar2.f3353c);
        uVar2.M(0);
        zVar.o = false;
    }

    public static Pair i(long j4, W.u uVar) {
        long F4;
        long F5;
        W.u uVar2 = uVar;
        uVar2.M(8);
        int e4 = j.e(uVar2.m());
        uVar2.N(4);
        long B4 = uVar2.B();
        if (e4 == 0) {
            F4 = uVar2.B();
            F5 = uVar2.B();
        } else {
            F4 = uVar2.F();
            F5 = uVar2.F();
        }
        long j5 = F5 + j4;
        String str = J.f3263a;
        long U4 = J.U(F4, 1000000L, B4, RoundingMode.DOWN);
        uVar2.N(2);
        int G4 = uVar2.G();
        int[] iArr = new int[G4];
        long[] jArr = new long[G4];
        long[] jArr2 = new long[G4];
        long[] jArr3 = new long[G4];
        long j6 = j5;
        long j7 = U4;
        int i4 = 0;
        while (i4 < G4) {
            int m4 = uVar2.m();
            if ((Integer.MIN_VALUE & m4) != 0) {
                throw T.G.a(null, "Unhandled indirect reference");
            }
            long B5 = uVar2.B();
            iArr[i4] = m4 & Integer.MAX_VALUE;
            jArr[i4] = j6;
            jArr3[i4] = j7;
            F4 += B5;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long U5 = J.U(F4, 1000000L, B4, RoundingMode.DOWN);
            jArr4[i4] = U5 - jArr5[i4];
            uVar2.N(4);
            j6 += iArr[i4];
            i4++;
            G4 = G4;
            uVar2 = uVar;
            j7 = U5;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(U4), new y0.j(iArr, jArr, jArr2, jArr3));
    }

    @Override // y0.n
    public final void a(long j4, long j5) {
        SparseArray sparseArray = this.f2470e;
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((n) sparseArray.valueAt(i4)).e();
        }
        this.o.clear();
        this.z = 0;
        ((PriorityQueue) this.f2479p.f1595a).clear();
        this.f2452A = j5;
        this.n.clear();
        f();
    }

    @Override // y0.n
    public final boolean b(y0.o oVar) {
        a0 a0Var;
        C l4 = w.l(oVar, true, false);
        if (l4 != null) {
            a0Var = I.o(l4);
        } else {
            v2.G g4 = I.f15571b;
            a0Var = a0.f15605e;
        }
        this.f2482s = a0Var;
        return l4 == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x06ec, code lost:
    
        throw T.G.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x00ce, code lost:
    
        r5 = r2.f2438b;
        r11 = "video/avc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x00d9, code lost:
    
        if (r32.f2483t != 3) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x00dd, code lost:
    
        if (r2.f2449m != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x00df, code lost:
    
        r6 = r2.f2440d.f2385d[r2.f2442f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x00ee, code lost:
    
        r32.f2456E = r6;
        r6 = r2.f2440d.f2382a.f2543g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x00fc, code lost:
    
        if (java.util.Objects.equals(r6.n, "video/avc") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0100, code lost:
    
        if ((r4 & 64) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0102, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0115, code lost:
    
        r32.f2459H = !r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x011d, code lost:
    
        if (r2.f2442f >= r2.f2445i) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x011f, code lost:
    
        r33.v(r32.f2456E);
        r1 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0128, code lost:
    
        if (r1 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x012b, code lost:
    
        r3 = r5.n;
        r1 = r1.f2552d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x012f, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0131, code lost:
    
        r3.N(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0134, code lost:
    
        r1 = r2.f2442f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0138, code lost:
    
        if (r5.f2564k == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x013e, code lost:
    
        if (r5.f2565l[r1] == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0140, code lost:
    
        r3.N(r3.G() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x014c, code lost:
    
        if (r2.c() != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x014e, code lost:
    
        r32.f2455D = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0151, code lost:
    
        r32.f2483t = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0154, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x015d, code lost:
    
        if (r2.f2440d.f2382a.f2544h != r21) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x015f, code lost:
    
        r32.f2456E -= 8;
        r33.v(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0178, code lost:
    
        if ("audio/ac4".equals(r2.f2440d.f2382a.f2543g.n) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x017a, code lost:
    
        r32.f2457F = r2.d(r32.f2456E, 7);
        y0.AbstractC1569a.i(r32.f2456E, r8);
        r2.f2437a.a(7, r8);
        r32.f2457F += 7;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x019f, code lost:
    
        r32.f2456E += r32.f2457F;
        r32.f2483t = 4;
        r32.f2458G = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0195, code lost:
    
        r6 = 0;
        r32.f2457F = r2.d(r32.f2456E, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0105, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x010e, code lost:
    
        if (java.util.Objects.equals(r6.n, "video/hevc") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0112, code lost:
    
        if ((r4 & 128) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x00e8, code lost:
    
        r6 = r5.f2561h[r2.f2442f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x01aa, code lost:
    
        r4 = r2.f2440d;
        r6 = r4.f2382a;
        r8 = r2.f2437a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x01b2, code lost:
    
        if (r2.f2449m != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x01b4, code lost:
    
        r15 = r4.f2387f[r2.f2442f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x01ba, code lost:
    
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x01c3, code lost:
    
        if (r14 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x01c5, code lost:
    
        r4 = r14.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x01c9, code lost:
    
        r13 = r6.f2547k;
        r6 = r6.f2543g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x01cd, code lost:
    
        if (r13 == 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x01cf, code lost:
    
        r15 = r32.f2472g;
        r9 = r15.f3351a;
        r9[0] = 0;
        r9[1] = 0;
        r9[r20] = 0;
        r12 = 4 - r13;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x01e1, code lost:
    
        r22 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x01e7, code lost:
    
        if (r32.f2457F >= r32.f2456E) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x01e9, code lost:
    
        r2 = r32.f2458G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x01eb, code lost:
    
        if (r2 != 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x01f0, code lost:
    
        if (r32.L.length > 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x01f4, code lost:
    
        if (r32.f2459H != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x020b, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x020c, code lost:
    
        r33.readFully(r9, r12, r22 + r2);
        r15.M(0);
        r19 = r15.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0219, code lost:
    
        if (r19 < 0) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x021b, code lost:
    
        r32.f2458G = r19 - r2;
        r13 = r32.f2471f;
        r25 = r12;
        r13.M(0);
        r8.a(4, r13);
        r32.f2457F += 4;
        r32.f2456E += r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0239, code lost:
    
        if (r32.L.length <= 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x023b, code lost:
    
        if (r2 <= 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x023d, code lost:
    
        r13 = r9[4];
        r12 = X.p.c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0247, code lost:
    
        if (java.util.Objects.equals(r12, r11) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0249, code lost:
    
        r26 = r11;
        r20 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0250, code lost:
    
        if ((r13 & 31) == 6) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0268, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x026e, code lost:
    
        r32.f2460I = r11;
        r8.a(r2, r15);
        r32.f2457F += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0278, code lost:
    
        if (r2 <= 0) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x027c, code lost:
    
        if (r32.f2459H != false) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0282, code lost:
    
        if (X.p.d(r9, r2, r6) == false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0284, code lost:
    
        r32.f2459H = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0287, code lost:
    
        r13 = r22;
        r12 = r25;
        r11 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x025c, code lost:
    
        if (java.util.Objects.equals(r12, "video/hevc") == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0266, code lost:
    
        if (((r20 & 126) >> 1) != 39) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x026d, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0253, code lost:
    
        r26 = r11;
        r20 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x026a, code lost:
    
        r26 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0296, code lost:
    
        throw T.G.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x01f6, code lost:
    
        r2 = X.p.e(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0206, code lost:
    
        if ((r22 + r2) > (r32.f2456E - r32.f2457F)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0208, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0297, code lost:
    
        r26 = r11;
        r25 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x029e, code lost:
    
        if (r32.f2460I == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x02a0, code lost:
    
        r11 = r32.f2473h;
        r11.J(r2);
        r33.readFully(r11.f3351a, 0, r32.f2458G);
        r8.a(r32.f2458G, r11);
        r2 = r32.f2458G;
        r2 = X.p.n(r11.f3353c, r11.f3351a);
        r11.M(0);
        r11.L(r2);
        r2 = r6.f2869p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x02c7, code lost:
    
        if (r2 != (-1)) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x02cb, code lost:
    
        if (r7.f1596b == 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x02cd, code lost:
    
        r7.i(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x02d8, code lost:
    
        r7.a(r4, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x02e4, code lost:
    
        if ((r17.a() & 4) == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x02e6, code lost:
    
        r7.c(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x02e9, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x02f3, code lost:
    
        r32.f2457F += r2;
        r32.f2458G -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x02d3, code lost:
    
        if (r7.f1596b == r2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x02d5, code lost:
    
        r7.i(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x02ec, code lost:
    
        r2 = r8.g(r33, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0312, code lost:
    
        r1 = r17.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0318, code lost:
    
        if (r32.f2459H != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x031a, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x031d, code lost:
    
        r28 = r1;
        r1 = r17.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0323, code lost:
    
        if (r1 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0325, code lost:
    
        r31 = r1.f2551c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x032c, code lost:
    
        r26 = r4;
        r8.e(r26, r28, r32.f2456E, 0, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x033d, code lost:
    
        if (r3.isEmpty() != false) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x033f, code lost:
    
        r1 = (S0.m) r3.removeFirst();
        r32.z -= r1.f2436c;
        r4 = r1.f2434a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0350, code lost:
    
        if (r1.f2435b == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0352, code lost:
    
        r4 = r4 + r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0354, code lost:
    
        if (r14 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0356, code lost:
    
        r4 = r14.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x035a, code lost:
    
        r7 = r4;
        r2 = r32.f2462K;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x035f, code lost:
    
        if (r5 >= r4) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0361, code lost:
    
        r2[r5].e(r7, 1, r1.f2436c, r32.z, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0373, code lost:
    
        if (r17.c() != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0375, code lost:
    
        r32.f2455D = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0378, code lost:
    
        r32.f2483t = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x037d, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x032a, code lost:
    
        r31 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x02fe, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0300, code lost:
    
        r2 = r32.f2457F;
        r6 = r32.f2456E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0304, code lost:
    
        if (r2 >= r6) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0306, code lost:
    
        r32.f2457F += r8.g(r33, r6 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x01bc, code lost:
    
        r15 = r5.f2562i[r2.f2442f];
     */
    @Override // y0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(y0.o oVar, T.r rVar) {
        char c4;
        boolean z;
        int i4;
        int i5;
        String u4;
        String u5;
        long j4;
        long j5;
        long U4;
        long B4;
        while (true) {
            int i6 = this.f2483t;
            ArrayDeque arrayDeque = this.n;
            K3.n nVar = this.f2479p;
            W.u uVar = this.f2475j;
            C1351b c1351b = this.f2481r;
            SparseArray sparseArray = this.f2470e;
            boolean z4 = true;
            if (i6 != 0) {
                ArrayDeque arrayDeque2 = this.o;
                int i7 = this.f2467b;
                G g4 = this.f2476k;
                if (i6 != 1) {
                    long j6 = Long.MAX_VALUE;
                    if (i6 != 2) {
                        n nVar2 = this.f2455D;
                        if (nVar2 != null) {
                            c4 = 2;
                            z = true;
                            i4 = 8;
                            break;
                        }
                        int size = sparseArray.size();
                        c4 = 2;
                        int i8 = 0;
                        n nVar3 = null;
                        while (i8 < size) {
                            n nVar4 = (n) sparseArray.valueAt(i8);
                            boolean z5 = z4;
                            boolean z6 = nVar4.f2449m;
                            z zVar = nVar4.f2438b;
                            if (z6) {
                                i5 = size;
                            } else {
                                i5 = size;
                                if (nVar4.f2442f == nVar4.f2440d.f2383b) {
                                    i8++;
                                    z4 = z5;
                                    size = i5;
                                }
                            }
                            if (!z6 || nVar4.f2444h != zVar.f2557d) {
                                long j7 = !z6 ? nVar4.f2440d.f2384c[nVar4.f2442f] : zVar.f2559f[nVar4.f2444h];
                                if (j7 < j6) {
                                    nVar3 = nVar4;
                                    j6 = j7;
                                }
                            }
                            i8++;
                            z4 = z5;
                            size = i5;
                        }
                        z = z4;
                        i4 = 8;
                        if (nVar3 == null) {
                            int position = (int) (this.f2487y - oVar.getPosition());
                            if (position < 0) {
                                throw T.G.a(null, "Offset to end of mdat was negative.");
                            }
                            oVar.v(position);
                            f();
                        } else {
                            int position2 = (int) ((!nVar3.f2449m ? nVar3.f2440d.f2384c[nVar3.f2442f] : nVar3.f2438b.f2559f[nVar3.f2444h]) - oVar.getPosition());
                            if (position2 < 0) {
                                AbstractC0108a.s("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                position2 = 0;
                            }
                            oVar.v(position2);
                            this.f2455D = nVar3;
                            nVar2 = nVar3;
                        }
                    } else {
                        int size2 = sparseArray.size();
                        n nVar5 = null;
                        for (int i9 = 0; i9 < size2; i9++) {
                            z zVar2 = ((n) sparseArray.valueAt(i9)).f2438b;
                            if (zVar2.o) {
                                long j8 = zVar2.f2556c;
                                if (j8 < j6) {
                                    nVar5 = (n) sparseArray.valueAt(i9);
                                    j6 = j8;
                                }
                            }
                        }
                        if (nVar5 == null) {
                            this.f2483t = 3;
                        } else {
                            int position3 = (int) (j6 - oVar.getPosition());
                            if (position3 < 0) {
                                throw T.G.a(null, "Offset to encryption data was negative.");
                            }
                            oVar.v(position3);
                            z zVar3 = nVar5.f2438b;
                            W.u uVar2 = zVar3.n;
                            oVar.readFully(uVar2.f3351a, 0, uVar2.f3353c);
                            uVar2.M(0);
                            zVar3.o = false;
                        }
                    }
                } else {
                    int i10 = (int) (this.v - this.f2485w);
                    W.u uVar3 = this.f2486x;
                    if (uVar3 != null) {
                        oVar.readFully(uVar3.f3351a, 8, i10);
                        int i11 = this.f2484u;
                        X.d dVar = new X.d(i11, uVar3);
                        if (!arrayDeque.isEmpty()) {
                            ((X.c) arrayDeque.peek()).f3492d.add(dVar);
                        } else if (i11 == 1936286840) {
                            Pair i12 = i(oVar.getPosition(), uVar3);
                            c1351b.a((y0.j) i12.second);
                            if (!this.f2463M) {
                                this.f2454C = ((Long) i12.first).longValue();
                                this.f2461J.x((y0.y) i12.second);
                                this.f2463M = true;
                            } else if ((i7 & 256) != 0 && !this.f2464N && c1351b.f14811a.size() > 1) {
                                this.f2465O = oVar.getPosition();
                            }
                        } else if (i11 == 1701671783 && this.f2462K.length != 0) {
                            uVar3.M(8);
                            int e4 = j.e(uVar3.m());
                            long j9 = -9223372036854775807L;
                            if (e4 == 0) {
                                u4 = uVar3.u();
                                u4.getClass();
                                u5 = uVar3.u();
                                u5.getClass();
                                long B5 = uVar3.B();
                                long B6 = uVar3.B();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long U5 = J.U(B6, 1000000L, B5, roundingMode);
                                long j10 = this.f2454C;
                                long j11 = j10 != -9223372036854775807L ? j10 + U5 : -9223372036854775807L;
                                j4 = U5;
                                j5 = j11;
                                U4 = J.U(uVar3.B(), 1000L, B5, roundingMode);
                                B4 = uVar3.B();
                            } else if (e4 != 1) {
                                AbstractC0005f.u(e4, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long B7 = uVar3.B();
                                long F4 = uVar3.F();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                j5 = J.U(F4, 1000000L, B7, roundingMode2);
                                long U6 = J.U(uVar3.B(), 1000L, B7, roundingMode2);
                                long B8 = uVar3.B();
                                u4 = uVar3.u();
                                u4.getClass();
                                u5 = uVar3.u();
                                u5.getClass();
                                U4 = U6;
                                B4 = B8;
                                j4 = -9223372036854775807L;
                            }
                            String str = u4;
                            String str2 = u5;
                            byte[] bArr = new byte[uVar3.a()];
                            uVar3.k(bArr, 0, uVar3.a());
                            W.u uVar4 = new W.u(this.f2477l.o(new J0.a(str, str2, U4, B4, bArr)));
                            int a3 = uVar4.a();
                            F[] fArr = this.f2462K;
                            int length = fArr.length;
                            int i13 = 0;
                            while (i13 < length) {
                                F f4 = fArr[i13];
                                uVar4.M(0);
                                f4.a(a3, uVar4);
                                i13++;
                                j9 = j9;
                            }
                            if (j5 == j9) {
                                arrayDeque2.addLast(new m(a3, j4, true));
                                this.z += a3;
                            } else if (!arrayDeque2.isEmpty()) {
                                arrayDeque2.addLast(new m(a3, j5, false));
                                this.z += a3;
                            } else if (g4 == null || g4.e()) {
                                if (g4 != null) {
                                    j5 = g4.a(j5);
                                }
                                long j12 = j5;
                                for (F f5 : this.f2462K) {
                                    f5.e(j12, 1, a3, 0, null);
                                }
                            } else {
                                arrayDeque2.addLast(new m(a3, j5, false));
                                this.z += a3;
                            }
                        }
                    } else {
                        oVar.v(i10);
                    }
                    j(oVar.getPosition());
                }
            } else {
                int i14 = this.f2485w;
                long j13 = 0;
                W.u uVar5 = this.f2478m;
                if (i14 == 0) {
                    if (!oVar.d(uVar5.f3351a, 0, 8, true)) {
                        long j14 = this.f2465O;
                        if (j14 == -1) {
                            nVar.c(0);
                            return -1;
                        }
                        rVar.f2881a = j14;
                        this.f2465O = -1L;
                        y0.p pVar = this.f2461J;
                        c1351b.getClass();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        for (y0.j jVar : c1351b.f14811a.values()) {
                            arrayList.add(jVar.f16161b);
                            arrayList2.add(jVar.f16162c);
                            arrayList3.add(jVar.f16163d);
                            arrayList4.add(jVar.f16164e);
                        }
                        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
                        for (int[] iArr2 : iArr) {
                            j13 += iArr2.length;
                        }
                        int i15 = (int) j13;
                        AbstractC0124a.i(j13 == ((long) i15), "the total number of elements (%s) in the arrays must fit in an int", j13);
                        int[] iArr3 = new int[i15];
                        int i16 = 0;
                        for (int[] iArr4 : iArr) {
                            System.arraycopy(iArr4, 0, iArr3, i16, iArr4.length);
                            i16 += iArr4.length;
                        }
                        pVar.x(new y0.j(iArr3, O3.l.f((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), O3.l.f((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), O3.l.f((long[][]) arrayList4.toArray(new long[arrayList4.size()][]))));
                        this.f2464N = true;
                        return 1;
                    }
                    this.f2485w = 8;
                    uVar5.M(0);
                    this.v = uVar5.B();
                    this.f2484u = uVar5.m();
                }
                long j15 = this.v;
                if (j15 == 1) {
                    oVar.readFully(uVar5.f3351a, 8, 8);
                    this.f2485w += 8;
                    this.v = uVar5.F();
                } else if (j15 == 0) {
                    long length2 = oVar.getLength();
                    if (length2 == -1 && !arrayDeque.isEmpty()) {
                        length2 = ((X.c) arrayDeque.peek()).f3491c;
                    }
                    if (length2 != -1) {
                        this.v = (length2 - oVar.getPosition()) + this.f2485w;
                    }
                }
                long j16 = this.v;
                int i17 = this.f2485w;
                long j17 = i17;
                if (j16 < j17) {
                    if (this.f2484u != 1718773093 || i17 != 8) {
                        break;
                    }
                    this.v = j17;
                }
                if (this.f2465O != -1) {
                    if (this.f2484u == 1936286840) {
                        uVar.J((int) this.v);
                        System.arraycopy(uVar5.f3351a, 0, uVar.f3351a, 0, 8);
                        oVar.readFully(uVar.f3351a, 8, (int) (this.v - this.f2485w));
                        c1351b.a((y0.j) i(oVar.m(), uVar).second);
                    } else {
                        oVar.k((int) (this.v - j17), true);
                    }
                    f();
                } else {
                    long position4 = oVar.getPosition() - this.f2485w;
                    int i18 = this.f2484u;
                    if ((i18 == 1836019558 || i18 == 1835295092) && !this.f2463M) {
                        this.f2461J.x(new A0.b(this.f2453B, position4));
                        this.f2463M = true;
                    }
                    if (this.f2484u == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i19 = 0; i19 < size3; i19++) {
                            z zVar4 = ((n) sparseArray.valueAt(i19)).f2438b;
                            zVar4.getClass();
                            zVar4.f2556c = position4;
                            zVar4.f2555b = position4;
                        }
                    }
                    int i20 = this.f2484u;
                    if (i20 == 1835295092) {
                        this.f2455D = null;
                        this.f2487y = position4 + this.v;
                        this.f2483t = 2;
                    } else if (i20 == 1836019574 || i20 == 1953653099 || i20 == 1835297121 || i20 == 1835626086 || i20 == 1937007212 || i20 == 1836019558 || i20 == 1953653094 || i20 == 1836475768 || i20 == 1701082227 || i20 == 1835365473) {
                        long position5 = oVar.getPosition();
                        long j18 = this.v;
                        long j19 = (position5 + j18) - 8;
                        if (j18 != this.f2485w && this.f2484u == 1835365473) {
                            uVar.J(8);
                            oVar.E(uVar.f3351a, 0, 8);
                            j.a(uVar);
                            oVar.v(uVar.f3352b);
                            oVar.u();
                        }
                        arrayDeque.push(new X.c(this.f2484u, j19));
                        if (this.v == this.f2485w) {
                            j(j19);
                        } else {
                            f();
                        }
                    } else if (i20 == 1751411826 || i20 == 1835296868 || i20 == 1836476516 || i20 == 1936286840 || i20 == 1937011556 || i20 == 1937011827 || i20 == 1668576371 || i20 == 1937011555 || i20 == 1937011578 || i20 == 1937013298 || i20 == 1937007471 || i20 == 1668232756 || i20 == 1937011571 || i20 == 1952867444 || i20 == 1952868452 || i20 == 1953196132 || i20 == 1953654136 || i20 == 1953658222 || i20 == 1886614376 || i20 == 1935763834 || i20 == 1935763823 || i20 == 1936027235 || i20 == 1970628964 || i20 == 1935828848 || i20 == 1936158820 || i20 == 1701606260 || i20 == 1835362404 || i20 == 1701671783 || i20 == 1969517665 || i20 == 1801812339 || i20 == 1768715124) {
                        if (this.f2485w != 8) {
                            throw T.G.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.v > 2147483647L) {
                            throw T.G.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        W.u uVar6 = new W.u((int) this.v);
                        System.arraycopy(uVar5.f3351a, 0, uVar6.f3351a, 0, 8);
                        this.f2486x = uVar6;
                        this.f2483t = 1;
                    } else {
                        if (this.v > 2147483647L) {
                            throw T.G.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.f2486x = null;
                        this.f2483t = 1;
                    }
                }
            }
        }
    }

    @Override // y0.n
    public final List d() {
        return this.f2482s;
    }

    @Override // y0.n
    public final void e(y0.p pVar) {
        int i4;
        String str;
        int i5 = this.f2467b;
        this.f2461J = (i5 & 32) == 0 ? new U.b(pVar, this.f2466a) : pVar;
        f();
        F[] fArr = new F[2];
        this.f2462K = fArr;
        F f4 = this.f2480q;
        if (f4 != null) {
            fArr[0] = f4;
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i6 = 100;
        if ((i5 & 4) != 0) {
            fArr[i4] = this.f2461J.z(100, 5);
            i6 = 101;
            i4++;
        }
        F[] fArr2 = (F[]) J.O(i4, this.f2462K);
        this.f2462K = fArr2;
        for (F f5 : fArr2) {
            f5.d(f2451Q);
        }
        List list = this.f2469d;
        this.L = new F[list.size()];
        int i7 = 0;
        while (i7 < this.L.length) {
            F z = this.f2461J.z(i6, 3);
            z.d((C0097o) list.get(i7));
            this.L[i7] = z;
            i7++;
            i6++;
        }
        x xVar = this.f2468c;
        if (xVar != null) {
            C0097o c0097o = xVar.f2543g;
            C0096n a3 = c0097o.a();
            String str2 = c0097o.n;
            if (T.F.m(str2)) {
                str = "video/mp4";
            } else if (T.F.i(str2)) {
                str = "audio/mp4";
            } else {
                if (T.F.k(str2)) {
                    if (Objects.equals(str2, "image/heic")) {
                        str = "image/heif";
                    } else if (Objects.equals(str2, "image/avif")) {
                        str = "image/avif";
                    }
                }
                str = "application/mp4";
            }
            a3.f2830l = T.F.n(str);
            this.f2470e.put(0, new n(this.f2461J.z(0, xVar.f2538b), new A(this.f2468c, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0), new k(0, 0, 0, 0), new C0097o(a3)));
            this.f2461J.r();
        }
    }

    public final void f() {
        this.f2483t = 0;
        this.f2485w = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:424:0x07ff, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0802, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0443, code lost:
    
        if ((W.J.U(r42, 1000000, r5, r48) + W.J.U(r6[0], 1000000, r2.f2539c, r48)) >= r2.f2541e) goto L173;
     */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0720  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(long j4) {
        E e4;
        int i4;
        long j5;
        k kVar;
        int i5;
        k kVar2;
        ArrayList arrayList;
        int i6;
        int i7;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i8;
        int i9;
        int i10;
        int i11;
        int size;
        int i12;
        byte[] bArr;
        int i13;
        boolean z;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        k kVar3;
        int i20;
        while (true) {
            ArrayDeque arrayDeque = this.n;
            if (arrayDeque.isEmpty() || ((X.c) arrayDeque.peek()).f3491c != j4) {
                break;
            }
            X.c cVar = (X.c) arrayDeque.pop();
            int i21 = cVar.f3496b;
            ArrayList arrayList4 = cVar.f3493e;
            ArrayList arrayList5 = cVar.f3492d;
            int i22 = this.f2467b;
            int i23 = 12;
            x xVar = this.f2468c;
            SparseArray sparseArray = this.f2470e;
            if (i21 == 1836019574) {
                AbstractC0124a.s("Unexpected moov box.", xVar == null);
                C0094l g4 = g(arrayList5);
                X.c h2 = cVar.h(1836475768);
                h2.getClass();
                ArrayList arrayList6 = h2.f3492d;
                SparseArray sparseArray2 = new SparseArray();
                int size2 = arrayList6.size();
                long j6 = -9223372036854775807L;
                int i24 = 0;
                while (i24 < size2) {
                    X.d dVar = (X.d) arrayList6.get(i24);
                    int i25 = dVar.f3496b;
                    W.u uVar = dVar.f3494c;
                    if (i25 == 1953654136) {
                        uVar.M(i23);
                        arrayList = arrayList6;
                        Pair create = Pair.create(Integer.valueOf(uVar.m()), new k(uVar.m() - 1, uVar.m(), uVar.m(), uVar.m()));
                        sparseArray2.put(((Integer) create.first).intValue(), (k) create.second);
                    } else {
                        arrayList = arrayList6;
                        if (i25 == 1835362404) {
                            uVar.M(8);
                            j6 = j.e(uVar.m()) == 0 ? uVar.B() : uVar.F();
                        }
                    }
                    i24++;
                    arrayList6 = arrayList;
                    i23 = 12;
                }
                int i26 = 0;
                X.c h4 = cVar.h(1835365473);
                E f4 = h4 != null ? j.f(h4) : null;
                y0.t tVar = new y0.t();
                X.d i27 = cVar.i(1969517665);
                if (i27 != null) {
                    E k4 = j.k(i27);
                    tVar.b(k4);
                    e4 = k4;
                } else {
                    e4 = null;
                }
                X.d i28 = cVar.i(1836476516);
                i28.getClass();
                E e5 = new E(j.g(i28.f3494c));
                ArrayList j7 = j.j(cVar, tVar, j6, g4, (i22 & 16) != 0, false, new l(this), false);
                int size3 = j7.size();
                if (sparseArray.size() == 0) {
                    String b4 = w.b(j7);
                    int i29 = 0;
                    while (i29 < size3) {
                        A a3 = (A) j7.get(i29);
                        x xVar2 = a3.f2382a;
                        y0.p pVar = this.f2461J;
                        int i30 = xVar2.f2538b;
                        int i31 = xVar2.f2537a;
                        String str = b4;
                        C0097o c0097o = xVar2.f2543g;
                        long j8 = xVar2.f2541e;
                        F z4 = pVar.z(i29, i30);
                        z4.c(j8);
                        int i32 = i29;
                        C0096n a4 = c0097o.a();
                        ArrayList arrayList7 = j7;
                        a4.f2830l = T.F.n(str);
                        if (i30 == 1) {
                            int i33 = tVar.f16197a;
                            i4 = size3;
                            j5 = j8;
                            if (i33 != -1 && (i5 = tVar.f16198b) != -1) {
                                a4.f2813H = i33;
                                a4.f2814I = i5;
                            }
                        } else {
                            i4 = size3;
                            j5 = j8;
                        }
                        w.k(i30, f4, a4, c0097o.f2867l, e4, e5);
                        if (sparseArray2.size() == 1) {
                            kVar = (k) sparseArray2.valueAt(i26);
                        } else {
                            kVar = (k) sparseArray2.get(i31);
                            kVar.getClass();
                        }
                        sparseArray.put(i31, new n(z4, a3, kVar, new C0097o(a4)));
                        this.f2453B = Math.max(this.f2453B, j5);
                        i29 = i32 + 1;
                        b4 = str;
                        j7 = arrayList7;
                        size3 = i4;
                        i26 = 0;
                    }
                    this.f2461J.r();
                } else {
                    ArrayList arrayList8 = j7;
                    AbstractC0124a.t(sparseArray.size() == size3);
                    int i34 = 0;
                    while (i34 < size3) {
                        ArrayList arrayList9 = arrayList8;
                        A a5 = (A) arrayList9.get(i34);
                        x xVar3 = a5.f2382a;
                        n nVar = (n) sparseArray.get(xVar3.f2537a);
                        int i35 = xVar3.f2537a;
                        if (sparseArray2.size() == 1) {
                            kVar2 = (k) sparseArray2.valueAt(0);
                        } else {
                            kVar2 = (k) sparseArray2.get(i35);
                            kVar2.getClass();
                        }
                        nVar.f2440d = a5;
                        nVar.f2441e = kVar2;
                        nVar.f2437a.d(nVar.f2446j);
                        nVar.e();
                        i34++;
                        arrayList8 = arrayList9;
                    }
                }
            } else if (i21 == 1836019558) {
                boolean z5 = xVar != null;
                int size4 = arrayList4.size();
                int i36 = 0;
                while (i36 < size4) {
                    X.c cVar2 = (X.c) arrayList4.get(i36);
                    if (cVar2.f3496b == 1953653094) {
                        X.d i37 = cVar2.i(1952868452);
                        ArrayList arrayList10 = cVar2.f3492d;
                        i37.getClass();
                        W.u uVar2 = i37.f3494c;
                        uVar2.M(8);
                        int m4 = uVar2.m();
                        byte[] bArr2 = j.f2428a;
                        n nVar2 = (n) (z5 ? sparseArray.valueAt(0) : sparseArray.get(uVar2.m()));
                        if (nVar2 == null) {
                            i6 = size4;
                            i7 = i36;
                            arrayList2 = arrayList4;
                            arrayList3 = arrayList5;
                            nVar2 = null;
                        } else {
                            z zVar = nVar2.f2438b;
                            if ((m4 & 1) != 0) {
                                i6 = size4;
                                i7 = i36;
                                long F4 = uVar2.F();
                                zVar.f2555b = F4;
                                zVar.f2556c = F4;
                            } else {
                                i6 = size4;
                                i7 = i36;
                            }
                            k kVar4 = nVar2.f2441e;
                            int m5 = (m4 & 2) != 0 ? uVar2.m() - 1 : kVar4.f2429a;
                            if ((m4 & 8) != 0) {
                                arrayList2 = arrayList4;
                                i9 = uVar2.m();
                            } else {
                                arrayList2 = arrayList4;
                                i9 = kVar4.f2430b;
                            }
                            if ((m4 & 16) != 0) {
                                arrayList3 = arrayList5;
                                i10 = uVar2.m();
                            } else {
                                arrayList3 = arrayList5;
                                i10 = kVar4.f2431c;
                            }
                            zVar.f2554a = new k(m5, i9, i10, (m4 & 32) != 0 ? uVar2.m() : kVar4.f2432d);
                        }
                        if (nVar2 == null) {
                            i8 = i22;
                        } else {
                            z zVar2 = nVar2.f2438b;
                            long j9 = zVar2.f2567p;
                            boolean z6 = zVar2.f2568q;
                            nVar2.e();
                            nVar2.f2449m = true;
                            X.d i38 = cVar2.i(1952867444);
                            if (i38 == null || (i22 & 2) != 0) {
                                zVar2.f2567p = j9;
                                zVar2.f2568q = z6;
                            } else {
                                W.u uVar3 = i38.f3494c;
                                uVar3.M(8);
                                zVar2.f2567p = j.e(uVar3.m()) == 1 ? uVar3.F() : uVar3.B();
                                zVar2.f2568q = true;
                            }
                            int size5 = arrayList10.size();
                            int i39 = 0;
                            int i40 = 0;
                            int i41 = 0;
                            while (true) {
                                i11 = 1953658222;
                                if (i39 >= size5) {
                                    break;
                                }
                                X.d dVar2 = (X.d) arrayList10.get(i39);
                                int i42 = i39;
                                if (dVar2.f3496b == 1953658222) {
                                    W.u uVar4 = dVar2.f3494c;
                                    uVar4.M(12);
                                    int D3 = uVar4.D();
                                    if (D3 > 0) {
                                        i41 += D3;
                                        i40++;
                                    }
                                }
                                i39 = i42 + 1;
                            }
                            nVar2.f2444h = 0;
                            nVar2.f2443g = 0;
                            nVar2.f2442f = 0;
                            zVar2.f2557d = i40;
                            zVar2.f2558e = i41;
                            if (zVar2.f2560g.length < i40) {
                                zVar2.f2559f = new long[i40];
                                zVar2.f2560g = new int[i40];
                            }
                            if (zVar2.f2561h.length < i41) {
                                int i43 = (i41 * 125) / 100;
                                zVar2.f2561h = new int[i43];
                                zVar2.f2562i = new long[i43];
                                zVar2.f2563j = new boolean[i43];
                                zVar2.f2565l = new boolean[i43];
                            }
                            int i44 = 0;
                            int i45 = 0;
                            int i46 = 0;
                            while (true) {
                                long j10 = 0;
                                if (i44 < size5) {
                                    X.d dVar3 = (X.d) arrayList10.get(i44);
                                    int i47 = size5;
                                    if (dVar3.f3496b == i11) {
                                        int i48 = i45 + 1;
                                        W.u uVar5 = dVar3.f3494c;
                                        uVar5.M(8);
                                        int m6 = uVar5.m();
                                        byte[] bArr3 = j.f2428a;
                                        x xVar4 = nVar2.f2440d.f2382a;
                                        i14 = i44;
                                        k kVar5 = zVar2.f2554a;
                                        String str2 = J.f3263a;
                                        int i49 = i45;
                                        zVar2.f2560g[i49] = uVar5.D();
                                        long[] jArr = zVar2.f2559f;
                                        int i50 = i46;
                                        long j11 = zVar2.f2555b;
                                        jArr[i49] = j11;
                                        if ((m6 & 1) != 0) {
                                            jArr[i49] = j11 + uVar5.m();
                                        }
                                        boolean z7 = (m6 & 4) != 0;
                                        int i51 = kVar5.f2432d;
                                        if (z7) {
                                            i51 = uVar5.m();
                                        }
                                        boolean z8 = z7;
                                        boolean z9 = (m6 & 256) != 0;
                                        boolean z10 = (m6 & 512) != 0;
                                        boolean z11 = (m6 & 1024) != 0;
                                        boolean z12 = (m6 & 2048) != 0;
                                        boolean z13 = z11;
                                        long[] jArr2 = xVar4.f2545i;
                                        int i52 = i51;
                                        long[] jArr3 = xVar4.f2546j;
                                        if (jArr2 != null && jArr2.length == 1 && jArr3 != null) {
                                            long j12 = jArr2[0];
                                            if (j12 != 0) {
                                                long j13 = xVar4.f2540d;
                                                RoundingMode roundingMode = RoundingMode.DOWN;
                                            }
                                            j10 = jArr3[0];
                                        }
                                        int[] iArr = zVar2.f2561h;
                                        long[] jArr4 = zVar2.f2562i;
                                        boolean[] zArr = zVar2.f2563j;
                                        boolean z14 = xVar4.f2538b == 2 && (i22 & 1) != 0;
                                        i46 = i50 + zVar2.f2560g[i49];
                                        i15 = i22;
                                        boolean z15 = z12;
                                        long j14 = xVar4.f2539c;
                                        long j15 = zVar2.f2567p;
                                        int i53 = i50;
                                        while (i53 < i46) {
                                            if (z9) {
                                                i16 = i53;
                                                i17 = uVar5.m();
                                            } else {
                                                i16 = i53;
                                                i17 = kVar5.f2430b;
                                            }
                                            boolean z16 = z14;
                                            if (i17 < 0) {
                                                throw T.G.a(null, "Unexpected negative value: " + i17);
                                            }
                                            if (z10) {
                                                i18 = i46;
                                                i19 = uVar5.m();
                                            } else {
                                                i18 = i46;
                                                i19 = kVar5.f2431c;
                                            }
                                            if (i19 < 0) {
                                                throw T.G.a(null, "Unexpected negative value: " + i19);
                                            }
                                            int m7 = z13 ? uVar5.m() : (i16 == 0 && z8) ? i52 : kVar5.f2432d;
                                            if (z15) {
                                                kVar3 = kVar5;
                                                i20 = uVar5.m();
                                            } else {
                                                kVar3 = kVar5;
                                                i20 = 0;
                                            }
                                            int i54 = m7;
                                            long U4 = J.U((i20 + j15) - j10, 1000000L, j14, RoundingMode.DOWN);
                                            jArr4[i16] = U4;
                                            if (!zVar2.f2568q) {
                                                jArr4[i16] = U4 + nVar2.f2440d.f2390i;
                                            }
                                            iArr[i16] = i19;
                                            zArr[i16] = ((i54 >> 16) & 1) == 0 && (!z16 || i16 == 0);
                                            j15 += i17;
                                            i53 = i16 + 1;
                                            z14 = z16;
                                            i46 = i18;
                                            kVar5 = kVar3;
                                        }
                                        zVar2.f2567p = j15;
                                        i45 = i48;
                                    } else {
                                        i14 = i44;
                                        i15 = i22;
                                    }
                                    i44 = i14 + 1;
                                    size5 = i47;
                                    i22 = i15;
                                    i11 = 1953658222;
                                } else {
                                    i8 = i22;
                                    x xVar5 = nVar2.f2440d.f2382a;
                                    k kVar6 = zVar2.f2554a;
                                    kVar6.getClass();
                                    int i55 = kVar6.f2429a;
                                    y[] yVarArr = xVar5.f2548l;
                                    y yVar = yVarArr == null ? null : yVarArr[i55];
                                    X.d i56 = cVar2.i(1935763834);
                                    if (i56 != null) {
                                        yVar.getClass();
                                        W.u uVar6 = i56.f3494c;
                                        int i57 = yVar.f2552d;
                                        uVar6.M(8);
                                        int m8 = uVar6.m();
                                        byte[] bArr4 = j.f2428a;
                                        if ((m8 & 1) == 1) {
                                            uVar6.N(8);
                                        }
                                        int z17 = uVar6.z();
                                        int D4 = uVar6.D();
                                        if (D4 > zVar2.f2558e) {
                                            StringBuilder r4 = AbstractC0005f.r(D4, "Saiz sample count ", " is greater than fragment sample count");
                                            r4.append(zVar2.f2558e);
                                            throw T.G.a(null, r4.toString());
                                        }
                                        if (z17 == 0) {
                                            boolean[] zArr2 = zVar2.f2565l;
                                            i13 = 0;
                                            for (int i58 = 0; i58 < D4; i58++) {
                                                int z18 = uVar6.z();
                                                i13 += z18;
                                                zArr2[i58] = z18 > i57;
                                            }
                                            z = false;
                                        } else {
                                            i13 = z17 * D4;
                                            z = false;
                                            Arrays.fill(zVar2.f2565l, 0, D4, z17 > i57);
                                        }
                                        Arrays.fill(zVar2.f2565l, D4, zVar2.f2558e, z);
                                        if (i13 > 0) {
                                            zVar2.n.J(i13);
                                            zVar2.f2564k = true;
                                            zVar2.o = true;
                                        }
                                    }
                                    X.d i59 = cVar2.i(1935763823);
                                    if (i59 != null) {
                                        W.u uVar7 = i59.f3494c;
                                        uVar7.M(8);
                                        int m9 = uVar7.m();
                                        byte[] bArr5 = j.f2428a;
                                        if ((m9 & 1) == 1) {
                                            uVar7.N(8);
                                        }
                                        int D5 = uVar7.D();
                                        if (D5 != 1) {
                                            throw T.G.a(null, "Unexpected saio entry count: " + D5);
                                        }
                                        zVar2.f2556c += j.e(m9) == 0 ? uVar7.B() : uVar7.F();
                                    }
                                    X.d i60 = cVar2.i(1936027235);
                                    if (i60 != null) {
                                        h(i60.f3494c, 0, zVar2);
                                    }
                                    String str3 = yVar != null ? yVar.f2550b : null;
                                    W.u uVar8 = null;
                                    W.u uVar9 = null;
                                    for (int i61 = 0; i61 < arrayList10.size(); i61++) {
                                        X.d dVar4 = (X.d) arrayList10.get(i61);
                                        W.u uVar10 = dVar4.f3494c;
                                        int i62 = dVar4.f3496b;
                                        if (i62 == 1935828848) {
                                            uVar10.M(12);
                                            if (uVar10.m() == 1936025959) {
                                                uVar8 = uVar10;
                                            }
                                        } else if (i62 == 1936158820) {
                                            uVar10.M(12);
                                            if (uVar10.m() == 1936025959) {
                                                uVar9 = uVar10;
                                            }
                                        }
                                    }
                                    if (uVar8 != null && uVar9 != null) {
                                        uVar8.M(8);
                                        int e6 = j.e(uVar8.m());
                                        uVar8.N(4);
                                        if (e6 == 1) {
                                            uVar8.N(4);
                                        }
                                        if (uVar8.m() != 1) {
                                            throw T.G.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        uVar9.M(8);
                                        int e7 = j.e(uVar9.m());
                                        uVar9.N(4);
                                        if (e7 == 1) {
                                            if (uVar9.B() == 0) {
                                                throw T.G.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (e7 >= 2) {
                                            uVar9.N(4);
                                        }
                                        if (uVar9.B() != 1) {
                                            throw T.G.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        uVar9.N(1);
                                        int z19 = uVar9.z();
                                        int i63 = (z19 & 240) >> 4;
                                        int i64 = z19 & 15;
                                        boolean z20 = uVar9.z() == 1;
                                        if (z20) {
                                            int z21 = uVar9.z();
                                            byte[] bArr6 = new byte[16];
                                            uVar9.k(bArr6, 0, 16);
                                            if (z21 == 0) {
                                                int z22 = uVar9.z();
                                                byte[] bArr7 = new byte[z22];
                                                uVar9.k(bArr7, 0, z22);
                                                bArr = bArr7;
                                            } else {
                                                bArr = null;
                                            }
                                            zVar2.f2564k = true;
                                            zVar2.f2566m = new y(z20, str3, z21, bArr6, i63, i64, bArr);
                                            size = arrayList10.size();
                                            for (i12 = 0; i12 < size; i12++) {
                                                X.d dVar5 = (X.d) arrayList10.get(i12);
                                                if (dVar5.f3496b == 1970628964) {
                                                    W.u uVar11 = dVar5.f3494c;
                                                    uVar11.M(8);
                                                    byte[] bArr8 = this.f2474i;
                                                    uVar11.k(bArr8, 0, 16);
                                                    if (Arrays.equals(bArr8, f2450P)) {
                                                        h(uVar11, 16, zVar2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    size = arrayList10.size();
                                    while (i12 < size) {
                                    }
                                }
                            }
                        }
                    } else {
                        i6 = size4;
                        i7 = i36;
                        arrayList2 = arrayList4;
                        arrayList3 = arrayList5;
                        i8 = i22;
                    }
                    i36 = i7 + 1;
                    size4 = i6;
                    arrayList4 = arrayList2;
                    arrayList5 = arrayList3;
                    i22 = i8;
                }
                C0094l g5 = g(arrayList5);
                if (g5 != null) {
                    int size6 = sparseArray.size();
                    for (int i65 = 0; i65 < size6; i65++) {
                        n nVar3 = (n) sparseArray.valueAt(i65);
                        x xVar6 = nVar3.f2440d.f2382a;
                        k kVar7 = nVar3.f2438b.f2554a;
                        String str4 = J.f3263a;
                        int i66 = kVar7.f2429a;
                        y[] yVarArr2 = xVar6.f2548l;
                        y yVar2 = yVarArr2 == null ? null : yVarArr2[i66];
                        C0094l a6 = g5.a(yVar2 != null ? yVar2.f2550b : null);
                        C0096n a7 = nVar3.f2446j.a();
                        a7.f2833q = a6;
                        nVar3.f2437a.d(new C0097o(a7));
                    }
                }
                if (this.f2452A != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i67 = 0; i67 < size7; i67++) {
                        n nVar4 = (n) sparseArray.valueAt(i67);
                        long j16 = this.f2452A;
                        int i68 = nVar4.f2442f;
                        while (true) {
                            z zVar3 = nVar4.f2438b;
                            if (i68 < zVar3.f2558e && zVar3.f2562i[i68] <= j16) {
                                if (zVar3.f2563j[i68]) {
                                    nVar4.f2445i = i68;
                                }
                                i68++;
                            }
                        }
                    }
                    this.f2452A = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((X.c) arrayDeque.peek()).f3493e.add(cVar);
            }
        }
    }

    @Override // y0.n
    public final void release() {
    }
}
