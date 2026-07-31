package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;

/* loaded from: classes.dex */
final class ve implements Handler.Callback, hk, nl, jk {
    private int B;
    private int C;
    private long D;
    private int E;
    private te F;
    private long G;
    private re H;
    private re I;
    private re J;
    private Cif K;
    private boolean L;
    private volatile int M;
    private volatile int N;
    private final qr0 O;

    /* renamed from: f, reason: collision with root package name */
    private final cf[] f13307f;

    /* renamed from: h, reason: collision with root package name */
    private final ol f13309h;

    /* renamed from: i, reason: collision with root package name */
    private final um f13310i;

    /* renamed from: j, reason: collision with root package name */
    private final Handler f13311j;

    /* renamed from: k, reason: collision with root package name */
    private final HandlerThread f13312k;

    /* renamed from: l, reason: collision with root package name */
    private final Handler f13313l;

    /* renamed from: m, reason: collision with root package name */
    private final me f13314m;

    /* renamed from: n, reason: collision with root package name */
    private final hf f13315n;

    /* renamed from: o, reason: collision with root package name */
    private final gf f13316o;

    /* renamed from: p, reason: collision with root package name */
    private se f13317p;

    /* renamed from: q, reason: collision with root package name */
    private bf f13318q;

    /* renamed from: r, reason: collision with root package name */
    private cf f13319r;

    /* renamed from: s, reason: collision with root package name */
    private nm f13320s;

    /* renamed from: t, reason: collision with root package name */
    private kk f13321t;

    /* renamed from: u, reason: collision with root package name */
    private cf[] f13322u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f13323v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f13324w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f13325x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f13326y;
    private int A = 0;

    /* renamed from: z, reason: collision with root package name */
    private int f13327z = 1;

    /* renamed from: g, reason: collision with root package name */
    private final df[] f13308g = new df[2];

    public ve(cf[] cfVarArr, ol olVar, qr0 qr0Var, boolean z6, int i7, Handler handler, se seVar, me meVar, byte[] bArr) {
        this.f13307f = cfVarArr;
        this.f13309h = olVar;
        this.O = qr0Var;
        this.f13324w = z6;
        this.f13313l = handler;
        this.f13317p = seVar;
        this.f13314m = meVar;
        for (int i8 = 0; i8 < 2; i8++) {
            cfVarArr[i8].Z(i8);
            this.f13308g[i8] = cfVarArr[i8].d();
        }
        this.f13310i = new um();
        this.f13322u = new cf[0];
        this.f13315n = new hf();
        this.f13316o = new gf();
        olVar.c(this);
        this.f13318q = bf.f3385d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f13312k = handlerThread;
        handlerThread.start();
        this.f13311j = new Handler(handlerThread.getLooper(), this);
    }

    private final int B(int i7, Cif cif, Cif cif2) {
        int b7 = cif.b();
        int i8 = -1;
        for (int i9 = 0; i9 < b7 && i8 == -1; i9++) {
            i7 = cif.f(i7, this.f13316o, this.f13315n, this.A);
            i8 = cif2.a(cif.d(i7, this.f13316o, true).f5594b);
        }
        return i8;
    }

    private final long C(int i7, long j7) {
        re reVar;
        l();
        this.f13325x = false;
        i(2);
        re reVar2 = this.J;
        if (reVar2 == null) {
            re reVar3 = this.H;
            if (reVar3 != null) {
                reVar3.c();
            }
            reVar = null;
        } else {
            reVar = null;
            while (reVar2 != null) {
                if (reVar2.f11119g == i7 && reVar2.f11122j) {
                    reVar = reVar2;
                } else {
                    reVar2.c();
                }
                reVar2 = reVar2.f11124l;
            }
        }
        re reVar4 = this.J;
        if (reVar4 != reVar || reVar4 != this.I) {
            for (cf cfVar : this.f13322u) {
                cfVar.i();
            }
            this.f13322u = new cf[0];
            this.f13320s = null;
            this.f13319r = null;
            this.J = null;
        }
        if (reVar != null) {
            reVar.f11124l = null;
            this.H = reVar;
            this.I = reVar;
            h(reVar);
            re reVar5 = this.J;
            if (reVar5.f11123k) {
                j7 = reVar5.f11113a.s(j7);
            }
            e(j7);
            J();
        } else {
            this.H = null;
            this.I = null;
            this.J = null;
            e(j7);
        }
        this.f13311j.sendEmptyMessage(2);
        return j7;
    }

    private final Pair<Integer, Long> D(int i7, long j7) {
        return E(this.K, 0, -9223372036854775807L);
    }

    private final Pair<Integer, Long> E(Cif cif, int i7, long j7) {
        return F(cif, 0, j7, 0L);
    }

    private final Pair<Integer, Long> F(Cif cif, int i7, long j7, long j8) {
        jm.a(0, 0, cif.c());
        cif.e(0, this.f13315n, false, j8);
        if (j7 == -9223372036854775807L) {
            j7 = 0;
        }
        long j9 = cif.d(0, this.f13316o, false).f5595c;
        if (j9 != -9223372036854775807L) {
            int i8 = (j7 > j9 ? 1 : (j7 == j9 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j7));
    }

    private final Pair<Integer, Long> G(te teVar) {
        Cif cif = teVar.f12183a;
        if (cif.h()) {
            cif = this.K;
        }
        try {
            Pair<Integer, Long> E = E(cif, 0, teVar.f12185c);
            Cif cif2 = this.K;
            if (cif2 == cif) {
                return E;
            }
            if (cif2.a(cif.d(((Integer) E.first).intValue(), this.f13316o, true).f5594b) != -1) {
                return Pair.create(0, (Long) E.second);
            }
            if (B(((Integer) E.first).intValue(), cif, this.K) == -1) {
                return null;
            }
            this.K.d(0, this.f13316o, false);
            return D(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new ze(this.K, 0, teVar.f12185c);
        }
    }

    private final void H(boolean[] zArr, int i7) {
        int i8;
        this.f13322u = new cf[i7];
        int i9 = 0;
        int i10 = 0;
        while (i9 < 2) {
            cf cfVar = this.f13307f[i9];
            el a7 = this.J.f11125m.f10265b.a(i9);
            if (a7 != null) {
                int i11 = i10 + 1;
                this.f13322u[i10] = cfVar;
                if (cfVar.a() == 0) {
                    ef efVar = this.J.f11125m.f10267d[i9];
                    boolean z6 = this.f13324w && this.f13327z == 3;
                    boolean z7 = !zArr[i9] && z6;
                    a7.b();
                    xe[] xeVarArr = new xe[1];
                    for (int i12 = 0; i12 <= 0; i12++) {
                        xeVarArr[i12] = a7.c(i12);
                    }
                    re reVar = this.J;
                    i8 = i9;
                    cfVar.W(efVar, xeVarArr, reVar.f11116d[i9], this.G, z7, reVar.f11118f - reVar.f11120h);
                    nm h7 = cfVar.h();
                    if (h7 != null) {
                        if (this.f13320s != null) {
                            throw ie.c(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                        this.f13320s = h7;
                        this.f13319r = cfVar;
                        h7.e(this.f13318q);
                    }
                    if (z6) {
                        cfVar.C();
                    }
                } else {
                    i8 = i9;
                }
                i10 = i11;
            } else {
                i8 = i9;
            }
            i9 = i8 + 1;
        }
    }

    private final void I(Object obj, int i7) {
        this.f13317p = new se(0, 0L);
        L(obj, i7);
        this.f13317p = new se(0, -9223372036854775807L);
        i(4);
        M(false);
    }

    private final void J() {
        re reVar = this.H;
        long zza = !reVar.f11122j ? 0L : reVar.f11113a.zza();
        if (zza == Long.MIN_VALUE) {
            g(false);
            return;
        }
        re reVar2 = this.H;
        long j7 = this.G - (reVar2.f11118f - reVar2.f11120h);
        boolean j8 = this.O.j(zza - j7);
        g(j8);
        if (j8) {
            this.H.f11113a.q(j7);
        }
    }

    private final void K() {
        re reVar = this.H;
        if (reVar == null || reVar.f11122j) {
            return;
        }
        re reVar2 = this.I;
        if (reVar2 == null || reVar2.f11124l == reVar) {
            for (cf cfVar : this.f13322u) {
                if (!cfVar.G()) {
                    return;
                }
            }
            this.H.f11113a.p();
        }
    }

    private final void L(Object obj, int i7) {
        this.f13313l.obtainMessage(6, new ue(this.K, obj, this.f13317p, i7)).sendToTarget();
    }

    private final void M(boolean z6) {
        this.f13311j.removeMessages(2);
        this.f13325x = false;
        this.f13310i.c();
        this.f13320s = null;
        this.f13319r = null;
        this.G = 60000000L;
        for (cf cfVar : this.f13322u) {
            try {
                p(cfVar);
                cfVar.i();
            } catch (ie | RuntimeException e7) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e7);
            }
        }
        this.f13322u = new cf[0];
        re reVar = this.J;
        if (reVar == null) {
            reVar = this.H;
        }
        q(reVar);
        this.H = null;
        this.I = null;
        this.J = null;
        g(false);
        if (z6) {
            kk kkVar = this.f13321t;
            if (kkVar != null) {
                kkVar.g();
                this.f13321t = null;
            }
            this.K = null;
        }
    }

    private final void e(long j7) {
        re reVar = this.J;
        long j8 = reVar == null ? j7 + 60000000 : j7 + (reVar.f11118f - reVar.f11120h);
        this.G = j8;
        this.f13310i.a(j8);
        for (cf cfVar : this.f13322u) {
            cfVar.a0(this.G);
        }
    }

    private final void f(long j7, long j8) {
        this.f13311j.removeMessages(2);
        long elapsedRealtime = (j7 + j8) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f13311j.sendEmptyMessage(2);
        } else {
            this.f13311j.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    private final void g(boolean z6) {
        if (this.f13326y != z6) {
            this.f13326y = z6;
            this.f13313l.obtainMessage(2, z6 ? 1 : 0, 0).sendToTarget();
        }
    }

    private final void h(re reVar) {
        if (this.J == reVar) {
            return;
        }
        boolean[] zArr = new boolean[2];
        int i7 = 0;
        for (int i8 = 0; i8 < 2; i8++) {
            cf cfVar = this.f13307f[i8];
            zArr[i8] = cfVar.a() != 0;
            el a7 = reVar.f11125m.f10265b.a(i8);
            if (a7 != null) {
                i7++;
            }
            if (zArr[i8] && (a7 == null || (cfVar.H() && cfVar.f() == this.J.f11116d[i8]))) {
                if (cfVar == this.f13319r) {
                    this.f13310i.d(this.f13320s);
                    this.f13320s = null;
                    this.f13319r = null;
                }
                p(cfVar);
                cfVar.i();
            }
        }
        this.J = reVar;
        this.f13313l.obtainMessage(3, reVar.f11125m).sendToTarget();
        H(zArr, i7);
    }

    private final void i(int i7) {
        if (this.f13327z != i7) {
            this.f13327z = i7;
            this.f13313l.obtainMessage(1, i7, 0).sendToTarget();
        }
    }

    private final void j() {
        this.f13325x = false;
        this.f13310i.b();
        for (cf cfVar : this.f13322u) {
            cfVar.C();
        }
    }

    private final void k() {
        M(true);
        this.O.c();
        i(1);
    }

    private final void l() {
        this.f13310i.c();
        for (cf cfVar : this.f13322u) {
            p(cfVar);
        }
    }

    private final void m() {
        re reVar = this.J;
        if (reVar == null) {
            return;
        }
        long f7 = reVar.f11113a.f();
        if (f7 != -9223372036854775807L) {
            e(f7);
        } else {
            cf cfVar = this.f13319r;
            if (cfVar == null || cfVar.M()) {
                this.G = this.f13310i.L();
            } else {
                long L = this.f13320s.L();
                this.G = L;
                this.f13310i.a(L);
            }
            re reVar2 = this.J;
            f7 = this.G - (reVar2.f11118f - reVar2.f11120h);
        }
        this.f13317p.f11796c = f7;
        this.D = SystemClock.elapsedRealtime() * 1000;
        long e7 = this.f13322u.length == 0 ? Long.MIN_VALUE : this.J.f11113a.e();
        se seVar = this.f13317p;
        if (e7 == Long.MIN_VALUE) {
            e7 = this.K.d(this.J.f11119g, this.f13316o, false).f5595c;
        }
        seVar.f11797d = e7;
    }

    private final boolean n(int i7) {
        this.K.d(i7, this.f13316o, false);
        this.K.g(0, this.f13315n, false);
        return this.K.f(i7, this.f13316o, this.f13315n, this.A) == -1;
    }

    private final boolean o(long j7) {
        re reVar;
        return j7 == -9223372036854775807L || this.f13317p.f11796c < j7 || ((reVar = this.J.f11124l) != null && reVar.f11122j);
    }

    private static final void p(cf cfVar) {
        if (cfVar.a() == 2) {
            cfVar.V();
        }
    }

    private static final void q(re reVar) {
        while (reVar != null) {
            reVar.c();
            reVar = reVar.f11124l;
        }
    }

    public final void A() {
        this.f13311j.sendEmptyMessage(5);
    }

    @Override // com.google.android.gms.internal.ads.hk
    public final void a(ik ikVar) {
        this.f13311j.obtainMessage(8, ikVar).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.vk
    public final /* bridge */ /* synthetic */ void b(ik ikVar) {
        this.f13311j.obtainMessage(9, ikVar).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.jk
    public final void c(Cif cif, Object obj) {
        this.f13311j.obtainMessage(7, Pair.create(cif, null)).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.nl
    public final void d() {
        this.f13311j.sendEmptyMessage(10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:221:0x0326, code lost:
    
        if (r2 != false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0328, code lost:
    
        r2 = r33.J.f11119g;
        r33.f13317p = new com.google.android.gms.internal.ads.se(r2, C(r2, r33.f13317p.f11796c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x033d, code lost:
    
        r33.H = r3;
        r3.f11124l = null;
        q(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x078e, code lost:
    
        if (o(r1) != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
    
        q(r12);
        r2.f11124l = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0266 A[Catch: IOException -> 0x0864, ie -> 0x086a, RuntimeException -> 0x0870, TryCatch #7 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019b, B:141:0x0178, B:142:0x017a, B:144:0x017e, B:146:0x0182, B:148:0x018a, B:96:0x01a7, B:100:0x01ae, B:153:0x01b4, B:155:0x01bc, B:157:0x01c0, B:159:0x01c4, B:161:0x01cc, B:164:0x01d1, B:166:0x01e2, B:167:0x01f0, B:169:0x01f4, B:171:0x0204, B:173:0x0208, B:175:0x0216, B:177:0x021b, B:178:0x0262, B:180:0x0266, B:182:0x026a, B:183:0x026f, B:185:0x0279, B:188:0x0284, B:189:0x02ac, B:191:0x02b0, B:195:0x02bb, B:199:0x02be, B:200:0x02ca, B:203:0x02d9, B:205:0x02df, B:207:0x02f0, B:209:0x02f4, B:211:0x0302, B:213:0x0314, B:217:0x0323, B:222:0x0328, B:223:0x033d, B:227:0x0233, B:229:0x023b, B:231:0x0241, B:232:0x0246, B:234:0x0347, B:235:0x0352, B:244:0x035d, B:245:0x035e, B:247:0x0362, B:249:0x036a, B:250:0x0374, B:252:0x036f, B:253:0x0380, B:255:0x0388, B:257:0x0391, B:259:0x0397, B:260:0x03b5, B:263:0x03be, B:270:0x03e0, B:271:0x03ed, B:277:0x03fd, B:281:0x040d, B:282:0x041e, B:284:0x041f, B:286:0x0429, B:287:0x066d, B:289:0x0673, B:292:0x067c, B:294:0x0697, B:296:0x06a2, B:299:0x06ab, B:301:0x06b1, B:306:0x06bd, B:311:0x06c7, B:318:0x06ce, B:319:0x06d1, B:321:0x06d5, B:323:0x06e1, B:324:0x06f4, B:328:0x070e, B:330:0x0716, B:332:0x071c, B:333:0x0720, B:334:0x07b5, B:336:0x07ba, B:338:0x07c0, B:340:0x07c8, B:342:0x07cc, B:344:0x07d6, B:346:0x07da, B:347:0x07e0, B:348:0x07fd, B:350:0x07d1, B:352:0x07e4, B:354:0x07e9, B:356:0x07ed, B:357:0x07f3, B:359:0x07f7, B:360:0x0725, B:362:0x072a, B:365:0x0731, B:367:0x0739, B:370:0x0748, B:373:0x0790, B:375:0x0798, B:376:0x074f, B:377:0x075c, B:379:0x0760, B:382:0x0776, B:383:0x073c, B:384:0x078a, B:388:0x079f, B:392:0x07ab, B:393:0x07a5, B:394:0x0431, B:396:0x0435, B:397:0x046f, B:399:0x0477, B:401:0x054a, B:403:0x054e, B:406:0x0555, B:408:0x0559, B:410:0x055d, B:411:0x0564, B:413:0x0568, B:415:0x056e, B:417:0x0578, B:419:0x059f, B:424:0x05a7, B:426:0x05b3, B:428:0x05b9, B:430:0x05bf, B:432:0x05c2, B:440:0x05c9, B:443:0x05db, B:447:0x05e1, B:451:0x05e4, B:453:0x05ea, B:455:0x05ee, B:457:0x05fe, B:461:0x0663, B:464:0x0618, B:465:0x061c, B:467:0x0622, B:469:0x0632, B:471:0x0638, B:473:0x0640, B:475:0x0649, B:477:0x065c, B:481:0x0561, B:482:0x047e, B:484:0x0482, B:486:0x04dc, B:488:0x04e0, B:490:0x04fa, B:493:0x0506, B:495:0x053c, B:496:0x053e, B:497:0x0501, B:498:0x04e7, B:499:0x0489, B:502:0x049a, B:504:0x04cb, B:505:0x043a, B:507:0x0440, B:509:0x0446, B:511:0x0454, B:513:0x0458, B:515:0x0463, B:516:0x0803, B:519:0x080a, B:521:0x0811, B:524:0x0819, B:526:0x081e, B:527:0x0824, B:530:0x082b, B:532:0x082f, B:534:0x0846, B:535:0x0852), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x026f A[Catch: IOException -> 0x0864, ie -> 0x086a, RuntimeException -> 0x0870, TryCatch #7 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019b, B:141:0x0178, B:142:0x017a, B:144:0x017e, B:146:0x0182, B:148:0x018a, B:96:0x01a7, B:100:0x01ae, B:153:0x01b4, B:155:0x01bc, B:157:0x01c0, B:159:0x01c4, B:161:0x01cc, B:164:0x01d1, B:166:0x01e2, B:167:0x01f0, B:169:0x01f4, B:171:0x0204, B:173:0x0208, B:175:0x0216, B:177:0x021b, B:178:0x0262, B:180:0x0266, B:182:0x026a, B:183:0x026f, B:185:0x0279, B:188:0x0284, B:189:0x02ac, B:191:0x02b0, B:195:0x02bb, B:199:0x02be, B:200:0x02ca, B:203:0x02d9, B:205:0x02df, B:207:0x02f0, B:209:0x02f4, B:211:0x0302, B:213:0x0314, B:217:0x0323, B:222:0x0328, B:223:0x033d, B:227:0x0233, B:229:0x023b, B:231:0x0241, B:232:0x0246, B:234:0x0347, B:235:0x0352, B:244:0x035d, B:245:0x035e, B:247:0x0362, B:249:0x036a, B:250:0x0374, B:252:0x036f, B:253:0x0380, B:255:0x0388, B:257:0x0391, B:259:0x0397, B:260:0x03b5, B:263:0x03be, B:270:0x03e0, B:271:0x03ed, B:277:0x03fd, B:281:0x040d, B:282:0x041e, B:284:0x041f, B:286:0x0429, B:287:0x066d, B:289:0x0673, B:292:0x067c, B:294:0x0697, B:296:0x06a2, B:299:0x06ab, B:301:0x06b1, B:306:0x06bd, B:311:0x06c7, B:318:0x06ce, B:319:0x06d1, B:321:0x06d5, B:323:0x06e1, B:324:0x06f4, B:328:0x070e, B:330:0x0716, B:332:0x071c, B:333:0x0720, B:334:0x07b5, B:336:0x07ba, B:338:0x07c0, B:340:0x07c8, B:342:0x07cc, B:344:0x07d6, B:346:0x07da, B:347:0x07e0, B:348:0x07fd, B:350:0x07d1, B:352:0x07e4, B:354:0x07e9, B:356:0x07ed, B:357:0x07f3, B:359:0x07f7, B:360:0x0725, B:362:0x072a, B:365:0x0731, B:367:0x0739, B:370:0x0748, B:373:0x0790, B:375:0x0798, B:376:0x074f, B:377:0x075c, B:379:0x0760, B:382:0x0776, B:383:0x073c, B:384:0x078a, B:388:0x079f, B:392:0x07ab, B:393:0x07a5, B:394:0x0431, B:396:0x0435, B:397:0x046f, B:399:0x0477, B:401:0x054a, B:403:0x054e, B:406:0x0555, B:408:0x0559, B:410:0x055d, B:411:0x0564, B:413:0x0568, B:415:0x056e, B:417:0x0578, B:419:0x059f, B:424:0x05a7, B:426:0x05b3, B:428:0x05b9, B:430:0x05bf, B:432:0x05c2, B:440:0x05c9, B:443:0x05db, B:447:0x05e1, B:451:0x05e4, B:453:0x05ea, B:455:0x05ee, B:457:0x05fe, B:461:0x0663, B:464:0x0618, B:465:0x061c, B:467:0x0622, B:469:0x0632, B:471:0x0638, B:473:0x0640, B:475:0x0649, B:477:0x065c, B:481:0x0561, B:482:0x047e, B:484:0x0482, B:486:0x04dc, B:488:0x04e0, B:490:0x04fa, B:493:0x0506, B:495:0x053c, B:496:0x053e, B:497:0x0501, B:498:0x04e7, B:499:0x0489, B:502:0x049a, B:504:0x04cb, B:505:0x043a, B:507:0x0440, B:509:0x0446, B:511:0x0454, B:513:0x0458, B:515:0x0463, B:516:0x0803, B:519:0x080a, B:521:0x0811, B:524:0x0819, B:526:0x081e, B:527:0x0824, B:530:0x082b, B:532:0x082f, B:534:0x0846, B:535:0x0852), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06bd A[Catch: IOException -> 0x0864, ie -> 0x086a, RuntimeException -> 0x0870, TryCatch #7 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019b, B:141:0x0178, B:142:0x017a, B:144:0x017e, B:146:0x0182, B:148:0x018a, B:96:0x01a7, B:100:0x01ae, B:153:0x01b4, B:155:0x01bc, B:157:0x01c0, B:159:0x01c4, B:161:0x01cc, B:164:0x01d1, B:166:0x01e2, B:167:0x01f0, B:169:0x01f4, B:171:0x0204, B:173:0x0208, B:175:0x0216, B:177:0x021b, B:178:0x0262, B:180:0x0266, B:182:0x026a, B:183:0x026f, B:185:0x0279, B:188:0x0284, B:189:0x02ac, B:191:0x02b0, B:195:0x02bb, B:199:0x02be, B:200:0x02ca, B:203:0x02d9, B:205:0x02df, B:207:0x02f0, B:209:0x02f4, B:211:0x0302, B:213:0x0314, B:217:0x0323, B:222:0x0328, B:223:0x033d, B:227:0x0233, B:229:0x023b, B:231:0x0241, B:232:0x0246, B:234:0x0347, B:235:0x0352, B:244:0x035d, B:245:0x035e, B:247:0x0362, B:249:0x036a, B:250:0x0374, B:252:0x036f, B:253:0x0380, B:255:0x0388, B:257:0x0391, B:259:0x0397, B:260:0x03b5, B:263:0x03be, B:270:0x03e0, B:271:0x03ed, B:277:0x03fd, B:281:0x040d, B:282:0x041e, B:284:0x041f, B:286:0x0429, B:287:0x066d, B:289:0x0673, B:292:0x067c, B:294:0x0697, B:296:0x06a2, B:299:0x06ab, B:301:0x06b1, B:306:0x06bd, B:311:0x06c7, B:318:0x06ce, B:319:0x06d1, B:321:0x06d5, B:323:0x06e1, B:324:0x06f4, B:328:0x070e, B:330:0x0716, B:332:0x071c, B:333:0x0720, B:334:0x07b5, B:336:0x07ba, B:338:0x07c0, B:340:0x07c8, B:342:0x07cc, B:344:0x07d6, B:346:0x07da, B:347:0x07e0, B:348:0x07fd, B:350:0x07d1, B:352:0x07e4, B:354:0x07e9, B:356:0x07ed, B:357:0x07f3, B:359:0x07f7, B:360:0x0725, B:362:0x072a, B:365:0x0731, B:367:0x0739, B:370:0x0748, B:373:0x0790, B:375:0x0798, B:376:0x074f, B:377:0x075c, B:379:0x0760, B:382:0x0776, B:383:0x073c, B:384:0x078a, B:388:0x079f, B:392:0x07ab, B:393:0x07a5, B:394:0x0431, B:396:0x0435, B:397:0x046f, B:399:0x0477, B:401:0x054a, B:403:0x054e, B:406:0x0555, B:408:0x0559, B:410:0x055d, B:411:0x0564, B:413:0x0568, B:415:0x056e, B:417:0x0578, B:419:0x059f, B:424:0x05a7, B:426:0x05b3, B:428:0x05b9, B:430:0x05bf, B:432:0x05c2, B:440:0x05c9, B:443:0x05db, B:447:0x05e1, B:451:0x05e4, B:453:0x05ea, B:455:0x05ee, B:457:0x05fe, B:461:0x0663, B:464:0x0618, B:465:0x061c, B:467:0x0622, B:469:0x0632, B:471:0x0638, B:473:0x0640, B:475:0x0649, B:477:0x065c, B:481:0x0561, B:482:0x047e, B:484:0x0482, B:486:0x04dc, B:488:0x04e0, B:490:0x04fa, B:493:0x0506, B:495:0x053c, B:496:0x053e, B:497:0x0501, B:498:0x04e7, B:499:0x0489, B:502:0x049a, B:504:0x04cb, B:505:0x043a, B:507:0x0440, B:509:0x0446, B:511:0x0454, B:513:0x0458, B:515:0x0463, B:516:0x0803, B:519:0x080a, B:521:0x0811, B:524:0x0819, B:526:0x081e, B:527:0x0824, B:530:0x082b, B:532:0x082f, B:534:0x0846, B:535:0x0852), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07ba A[Catch: IOException -> 0x0864, ie -> 0x086a, RuntimeException -> 0x0870, TryCatch #7 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019b, B:141:0x0178, B:142:0x017a, B:144:0x017e, B:146:0x0182, B:148:0x018a, B:96:0x01a7, B:100:0x01ae, B:153:0x01b4, B:155:0x01bc, B:157:0x01c0, B:159:0x01c4, B:161:0x01cc, B:164:0x01d1, B:166:0x01e2, B:167:0x01f0, B:169:0x01f4, B:171:0x0204, B:173:0x0208, B:175:0x0216, B:177:0x021b, B:178:0x0262, B:180:0x0266, B:182:0x026a, B:183:0x026f, B:185:0x0279, B:188:0x0284, B:189:0x02ac, B:191:0x02b0, B:195:0x02bb, B:199:0x02be, B:200:0x02ca, B:203:0x02d9, B:205:0x02df, B:207:0x02f0, B:209:0x02f4, B:211:0x0302, B:213:0x0314, B:217:0x0323, B:222:0x0328, B:223:0x033d, B:227:0x0233, B:229:0x023b, B:231:0x0241, B:232:0x0246, B:234:0x0347, B:235:0x0352, B:244:0x035d, B:245:0x035e, B:247:0x0362, B:249:0x036a, B:250:0x0374, B:252:0x036f, B:253:0x0380, B:255:0x0388, B:257:0x0391, B:259:0x0397, B:260:0x03b5, B:263:0x03be, B:270:0x03e0, B:271:0x03ed, B:277:0x03fd, B:281:0x040d, B:282:0x041e, B:284:0x041f, B:286:0x0429, B:287:0x066d, B:289:0x0673, B:292:0x067c, B:294:0x0697, B:296:0x06a2, B:299:0x06ab, B:301:0x06b1, B:306:0x06bd, B:311:0x06c7, B:318:0x06ce, B:319:0x06d1, B:321:0x06d5, B:323:0x06e1, B:324:0x06f4, B:328:0x070e, B:330:0x0716, B:332:0x071c, B:333:0x0720, B:334:0x07b5, B:336:0x07ba, B:338:0x07c0, B:340:0x07c8, B:342:0x07cc, B:344:0x07d6, B:346:0x07da, B:347:0x07e0, B:348:0x07fd, B:350:0x07d1, B:352:0x07e4, B:354:0x07e9, B:356:0x07ed, B:357:0x07f3, B:359:0x07f7, B:360:0x0725, B:362:0x072a, B:365:0x0731, B:367:0x0739, B:370:0x0748, B:373:0x0790, B:375:0x0798, B:376:0x074f, B:377:0x075c, B:379:0x0760, B:382:0x0776, B:383:0x073c, B:384:0x078a, B:388:0x079f, B:392:0x07ab, B:393:0x07a5, B:394:0x0431, B:396:0x0435, B:397:0x046f, B:399:0x0477, B:401:0x054a, B:403:0x054e, B:406:0x0555, B:408:0x0559, B:410:0x055d, B:411:0x0564, B:413:0x0568, B:415:0x056e, B:417:0x0578, B:419:0x059f, B:424:0x05a7, B:426:0x05b3, B:428:0x05b9, B:430:0x05bf, B:432:0x05c2, B:440:0x05c9, B:443:0x05db, B:447:0x05e1, B:451:0x05e4, B:453:0x05ea, B:455:0x05ee, B:457:0x05fe, B:461:0x0663, B:464:0x0618, B:465:0x061c, B:467:0x0622, B:469:0x0632, B:471:0x0638, B:473:0x0640, B:475:0x0649, B:477:0x065c, B:481:0x0561, B:482:0x047e, B:484:0x0482, B:486:0x04dc, B:488:0x04e0, B:490:0x04fa, B:493:0x0506, B:495:0x053c, B:496:0x053e, B:497:0x0501, B:498:0x04e7, B:499:0x0489, B:502:0x049a, B:504:0x04cb, B:505:0x043a, B:507:0x0440, B:509:0x0446, B:511:0x0454, B:513:0x0458, B:515:0x0463, B:516:0x0803, B:519:0x080a, B:521:0x0811, B:524:0x0819, B:526:0x081e, B:527:0x0824, B:530:0x082b, B:532:0x082f, B:534:0x0846, B:535:0x0852), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x07e9 A[Catch: IOException -> 0x0864, ie -> 0x086a, RuntimeException -> 0x0870, TryCatch #7 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019b, B:141:0x0178, B:142:0x017a, B:144:0x017e, B:146:0x0182, B:148:0x018a, B:96:0x01a7, B:100:0x01ae, B:153:0x01b4, B:155:0x01bc, B:157:0x01c0, B:159:0x01c4, B:161:0x01cc, B:164:0x01d1, B:166:0x01e2, B:167:0x01f0, B:169:0x01f4, B:171:0x0204, B:173:0x0208, B:175:0x0216, B:177:0x021b, B:178:0x0262, B:180:0x0266, B:182:0x026a, B:183:0x026f, B:185:0x0279, B:188:0x0284, B:189:0x02ac, B:191:0x02b0, B:195:0x02bb, B:199:0x02be, B:200:0x02ca, B:203:0x02d9, B:205:0x02df, B:207:0x02f0, B:209:0x02f4, B:211:0x0302, B:213:0x0314, B:217:0x0323, B:222:0x0328, B:223:0x033d, B:227:0x0233, B:229:0x023b, B:231:0x0241, B:232:0x0246, B:234:0x0347, B:235:0x0352, B:244:0x035d, B:245:0x035e, B:247:0x0362, B:249:0x036a, B:250:0x0374, B:252:0x036f, B:253:0x0380, B:255:0x0388, B:257:0x0391, B:259:0x0397, B:260:0x03b5, B:263:0x03be, B:270:0x03e0, B:271:0x03ed, B:277:0x03fd, B:281:0x040d, B:282:0x041e, B:284:0x041f, B:286:0x0429, B:287:0x066d, B:289:0x0673, B:292:0x067c, B:294:0x0697, B:296:0x06a2, B:299:0x06ab, B:301:0x06b1, B:306:0x06bd, B:311:0x06c7, B:318:0x06ce, B:319:0x06d1, B:321:0x06d5, B:323:0x06e1, B:324:0x06f4, B:328:0x070e, B:330:0x0716, B:332:0x071c, B:333:0x0720, B:334:0x07b5, B:336:0x07ba, B:338:0x07c0, B:340:0x07c8, B:342:0x07cc, B:344:0x07d6, B:346:0x07da, B:347:0x07e0, B:348:0x07fd, B:350:0x07d1, B:352:0x07e4, B:354:0x07e9, B:356:0x07ed, B:357:0x07f3, B:359:0x07f7, B:360:0x0725, B:362:0x072a, B:365:0x0731, B:367:0x0739, B:370:0x0748, B:373:0x0790, B:375:0x0798, B:376:0x074f, B:377:0x075c, B:379:0x0760, B:382:0x0776, B:383:0x073c, B:384:0x078a, B:388:0x079f, B:392:0x07ab, B:393:0x07a5, B:394:0x0431, B:396:0x0435, B:397:0x046f, B:399:0x0477, B:401:0x054a, B:403:0x054e, B:406:0x0555, B:408:0x0559, B:410:0x055d, B:411:0x0564, B:413:0x0568, B:415:0x056e, B:417:0x0578, B:419:0x059f, B:424:0x05a7, B:426:0x05b3, B:428:0x05b9, B:430:0x05bf, B:432:0x05c2, B:440:0x05c9, B:443:0x05db, B:447:0x05e1, B:451:0x05e4, B:453:0x05ea, B:455:0x05ee, B:457:0x05fe, B:461:0x0663, B:464:0x0618, B:465:0x061c, B:467:0x0622, B:469:0x0632, B:471:0x0638, B:473:0x0640, B:475:0x0649, B:477:0x065c, B:481:0x0561, B:482:0x047e, B:484:0x0482, B:486:0x04dc, B:488:0x04e0, B:490:0x04fa, B:493:0x0506, B:495:0x053c, B:496:0x053e, B:497:0x0501, B:498:0x04e7, B:499:0x0489, B:502:0x049a, B:504:0x04cb, B:505:0x043a, B:507:0x0440, B:509:0x0446, B:511:0x0454, B:513:0x0458, B:515:0x0463, B:516:0x0803, B:519:0x080a, B:521:0x0811, B:524:0x0819, B:526:0x081e, B:527:0x0824, B:530:0x082b, B:532:0x082f, B:534:0x0846, B:535:0x0852), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x07f7 A[Catch: IOException -> 0x0864, ie -> 0x086a, RuntimeException -> 0x0870, TryCatch #7 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019b, B:141:0x0178, B:142:0x017a, B:144:0x017e, B:146:0x0182, B:148:0x018a, B:96:0x01a7, B:100:0x01ae, B:153:0x01b4, B:155:0x01bc, B:157:0x01c0, B:159:0x01c4, B:161:0x01cc, B:164:0x01d1, B:166:0x01e2, B:167:0x01f0, B:169:0x01f4, B:171:0x0204, B:173:0x0208, B:175:0x0216, B:177:0x021b, B:178:0x0262, B:180:0x0266, B:182:0x026a, B:183:0x026f, B:185:0x0279, B:188:0x0284, B:189:0x02ac, B:191:0x02b0, B:195:0x02bb, B:199:0x02be, B:200:0x02ca, B:203:0x02d9, B:205:0x02df, B:207:0x02f0, B:209:0x02f4, B:211:0x0302, B:213:0x0314, B:217:0x0323, B:222:0x0328, B:223:0x033d, B:227:0x0233, B:229:0x023b, B:231:0x0241, B:232:0x0246, B:234:0x0347, B:235:0x0352, B:244:0x035d, B:245:0x035e, B:247:0x0362, B:249:0x036a, B:250:0x0374, B:252:0x036f, B:253:0x0380, B:255:0x0388, B:257:0x0391, B:259:0x0397, B:260:0x03b5, B:263:0x03be, B:270:0x03e0, B:271:0x03ed, B:277:0x03fd, B:281:0x040d, B:282:0x041e, B:284:0x041f, B:286:0x0429, B:287:0x066d, B:289:0x0673, B:292:0x067c, B:294:0x0697, B:296:0x06a2, B:299:0x06ab, B:301:0x06b1, B:306:0x06bd, B:311:0x06c7, B:318:0x06ce, B:319:0x06d1, B:321:0x06d5, B:323:0x06e1, B:324:0x06f4, B:328:0x070e, B:330:0x0716, B:332:0x071c, B:333:0x0720, B:334:0x07b5, B:336:0x07ba, B:338:0x07c0, B:340:0x07c8, B:342:0x07cc, B:344:0x07d6, B:346:0x07da, B:347:0x07e0, B:348:0x07fd, B:350:0x07d1, B:352:0x07e4, B:354:0x07e9, B:356:0x07ed, B:357:0x07f3, B:359:0x07f7, B:360:0x0725, B:362:0x072a, B:365:0x0731, B:367:0x0739, B:370:0x0748, B:373:0x0790, B:375:0x0798, B:376:0x074f, B:377:0x075c, B:379:0x0760, B:382:0x0776, B:383:0x073c, B:384:0x078a, B:388:0x079f, B:392:0x07ab, B:393:0x07a5, B:394:0x0431, B:396:0x0435, B:397:0x046f, B:399:0x0477, B:401:0x054a, B:403:0x054e, B:406:0x0555, B:408:0x0559, B:410:0x055d, B:411:0x0564, B:413:0x0568, B:415:0x056e, B:417:0x0578, B:419:0x059f, B:424:0x05a7, B:426:0x05b3, B:428:0x05b9, B:430:0x05bf, B:432:0x05c2, B:440:0x05c9, B:443:0x05db, B:447:0x05e1, B:451:0x05e4, B:453:0x05ea, B:455:0x05ee, B:457:0x05fe, B:461:0x0663, B:464:0x0618, B:465:0x061c, B:467:0x0622, B:469:0x0632, B:471:0x0638, B:473:0x0640, B:475:0x0649, B:477:0x065c, B:481:0x0561, B:482:0x047e, B:484:0x0482, B:486:0x04dc, B:488:0x04e0, B:490:0x04fa, B:493:0x0506, B:495:0x053c, B:496:0x053e, B:497:0x0501, B:498:0x04e7, B:499:0x0489, B:502:0x049a, B:504:0x04cb, B:505:0x043a, B:507:0x0440, B:509:0x0446, B:511:0x0454, B:513:0x0458, B:515:0x0463, B:516:0x0803, B:519:0x080a, B:521:0x0811, B:524:0x0819, B:526:0x081e, B:527:0x0824, B:530:0x082b, B:532:0x082f, B:534:0x0846, B:535:0x0852), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0798 A[Catch: IOException -> 0x0864, ie -> 0x086a, RuntimeException -> 0x0870, TryCatch #7 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019b, B:141:0x0178, B:142:0x017a, B:144:0x017e, B:146:0x0182, B:148:0x018a, B:96:0x01a7, B:100:0x01ae, B:153:0x01b4, B:155:0x01bc, B:157:0x01c0, B:159:0x01c4, B:161:0x01cc, B:164:0x01d1, B:166:0x01e2, B:167:0x01f0, B:169:0x01f4, B:171:0x0204, B:173:0x0208, B:175:0x0216, B:177:0x021b, B:178:0x0262, B:180:0x0266, B:182:0x026a, B:183:0x026f, B:185:0x0279, B:188:0x0284, B:189:0x02ac, B:191:0x02b0, B:195:0x02bb, B:199:0x02be, B:200:0x02ca, B:203:0x02d9, B:205:0x02df, B:207:0x02f0, B:209:0x02f4, B:211:0x0302, B:213:0x0314, B:217:0x0323, B:222:0x0328, B:223:0x033d, B:227:0x0233, B:229:0x023b, B:231:0x0241, B:232:0x0246, B:234:0x0347, B:235:0x0352, B:244:0x035d, B:245:0x035e, B:247:0x0362, B:249:0x036a, B:250:0x0374, B:252:0x036f, B:253:0x0380, B:255:0x0388, B:257:0x0391, B:259:0x0397, B:260:0x03b5, B:263:0x03be, B:270:0x03e0, B:271:0x03ed, B:277:0x03fd, B:281:0x040d, B:282:0x041e, B:284:0x041f, B:286:0x0429, B:287:0x066d, B:289:0x0673, B:292:0x067c, B:294:0x0697, B:296:0x06a2, B:299:0x06ab, B:301:0x06b1, B:306:0x06bd, B:311:0x06c7, B:318:0x06ce, B:319:0x06d1, B:321:0x06d5, B:323:0x06e1, B:324:0x06f4, B:328:0x070e, B:330:0x0716, B:332:0x071c, B:333:0x0720, B:334:0x07b5, B:336:0x07ba, B:338:0x07c0, B:340:0x07c8, B:342:0x07cc, B:344:0x07d6, B:346:0x07da, B:347:0x07e0, B:348:0x07fd, B:350:0x07d1, B:352:0x07e4, B:354:0x07e9, B:356:0x07ed, B:357:0x07f3, B:359:0x07f7, B:360:0x0725, B:362:0x072a, B:365:0x0731, B:367:0x0739, B:370:0x0748, B:373:0x0790, B:375:0x0798, B:376:0x074f, B:377:0x075c, B:379:0x0760, B:382:0x0776, B:383:0x073c, B:384:0x078a, B:388:0x079f, B:392:0x07ab, B:393:0x07a5, B:394:0x0431, B:396:0x0435, B:397:0x046f, B:399:0x0477, B:401:0x054a, B:403:0x054e, B:406:0x0555, B:408:0x0559, B:410:0x055d, B:411:0x0564, B:413:0x0568, B:415:0x056e, B:417:0x0578, B:419:0x059f, B:424:0x05a7, B:426:0x05b3, B:428:0x05b9, B:430:0x05bf, B:432:0x05c2, B:440:0x05c9, B:443:0x05db, B:447:0x05e1, B:451:0x05e4, B:453:0x05ea, B:455:0x05ee, B:457:0x05fe, B:461:0x0663, B:464:0x0618, B:465:0x061c, B:467:0x0622, B:469:0x0632, B:471:0x0638, B:473:0x0640, B:475:0x0649, B:477:0x065c, B:481:0x0561, B:482:0x047e, B:484:0x0482, B:486:0x04dc, B:488:0x04e0, B:490:0x04fa, B:493:0x0506, B:495:0x053c, B:496:0x053e, B:497:0x0501, B:498:0x04e7, B:499:0x0489, B:502:0x049a, B:504:0x04cb, B:505:0x043a, B:507:0x0440, B:509:0x0446, B:511:0x0454, B:513:0x0458, B:515:0x0463, B:516:0x0803, B:519:0x080a, B:521:0x0811, B:524:0x0819, B:526:0x081e, B:527:0x0824, B:530:0x082b, B:532:0x082f, B:534:0x0846, B:535:0x0852), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x054e A[Catch: IOException -> 0x0864, ie -> 0x086a, RuntimeException -> 0x0870, TryCatch #7 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019b, B:141:0x0178, B:142:0x017a, B:144:0x017e, B:146:0x0182, B:148:0x018a, B:96:0x01a7, B:100:0x01ae, B:153:0x01b4, B:155:0x01bc, B:157:0x01c0, B:159:0x01c4, B:161:0x01cc, B:164:0x01d1, B:166:0x01e2, B:167:0x01f0, B:169:0x01f4, B:171:0x0204, B:173:0x0208, B:175:0x0216, B:177:0x021b, B:178:0x0262, B:180:0x0266, B:182:0x026a, B:183:0x026f, B:185:0x0279, B:188:0x0284, B:189:0x02ac, B:191:0x02b0, B:195:0x02bb, B:199:0x02be, B:200:0x02ca, B:203:0x02d9, B:205:0x02df, B:207:0x02f0, B:209:0x02f4, B:211:0x0302, B:213:0x0314, B:217:0x0323, B:222:0x0328, B:223:0x033d, B:227:0x0233, B:229:0x023b, B:231:0x0241, B:232:0x0246, B:234:0x0347, B:235:0x0352, B:244:0x035d, B:245:0x035e, B:247:0x0362, B:249:0x036a, B:250:0x0374, B:252:0x036f, B:253:0x0380, B:255:0x0388, B:257:0x0391, B:259:0x0397, B:260:0x03b5, B:263:0x03be, B:270:0x03e0, B:271:0x03ed, B:277:0x03fd, B:281:0x040d, B:282:0x041e, B:284:0x041f, B:286:0x0429, B:287:0x066d, B:289:0x0673, B:292:0x067c, B:294:0x0697, B:296:0x06a2, B:299:0x06ab, B:301:0x06b1, B:306:0x06bd, B:311:0x06c7, B:318:0x06ce, B:319:0x06d1, B:321:0x06d5, B:323:0x06e1, B:324:0x06f4, B:328:0x070e, B:330:0x0716, B:332:0x071c, B:333:0x0720, B:334:0x07b5, B:336:0x07ba, B:338:0x07c0, B:340:0x07c8, B:342:0x07cc, B:344:0x07d6, B:346:0x07da, B:347:0x07e0, B:348:0x07fd, B:350:0x07d1, B:352:0x07e4, B:354:0x07e9, B:356:0x07ed, B:357:0x07f3, B:359:0x07f7, B:360:0x0725, B:362:0x072a, B:365:0x0731, B:367:0x0739, B:370:0x0748, B:373:0x0790, B:375:0x0798, B:376:0x074f, B:377:0x075c, B:379:0x0760, B:382:0x0776, B:383:0x073c, B:384:0x078a, B:388:0x079f, B:392:0x07ab, B:393:0x07a5, B:394:0x0431, B:396:0x0435, B:397:0x046f, B:399:0x0477, B:401:0x054a, B:403:0x054e, B:406:0x0555, B:408:0x0559, B:410:0x055d, B:411:0x0564, B:413:0x0568, B:415:0x056e, B:417:0x0578, B:419:0x059f, B:424:0x05a7, B:426:0x05b3, B:428:0x05b9, B:430:0x05bf, B:432:0x05c2, B:440:0x05c9, B:443:0x05db, B:447:0x05e1, B:451:0x05e4, B:453:0x05ea, B:455:0x05ee, B:457:0x05fe, B:461:0x0663, B:464:0x0618, B:465:0x061c, B:467:0x0622, B:469:0x0632, B:471:0x0638, B:473:0x0640, B:475:0x0649, B:477:0x065c, B:481:0x0561, B:482:0x047e, B:484:0x0482, B:486:0x04dc, B:488:0x04e0, B:490:0x04fa, B:493:0x0506, B:495:0x053c, B:496:0x053e, B:497:0x0501, B:498:0x04e7, B:499:0x0489, B:502:0x049a, B:504:0x04cb, B:505:0x043a, B:507:0x0440, B:509:0x0446, B:511:0x0454, B:513:0x0458, B:515:0x0463, B:516:0x0803, B:519:0x080a, B:521:0x0811, B:524:0x0819, B:526:0x081e, B:527:0x0824, B:530:0x082b, B:532:0x082f, B:534:0x0846, B:535:0x0852), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0568 A[Catch: IOException -> 0x0864, ie -> 0x086a, RuntimeException -> 0x0870, LOOP:9: B:413:0x0568->B:417:0x0578, LOOP_START, TryCatch #7 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019b, B:141:0x0178, B:142:0x017a, B:144:0x017e, B:146:0x0182, B:148:0x018a, B:96:0x01a7, B:100:0x01ae, B:153:0x01b4, B:155:0x01bc, B:157:0x01c0, B:159:0x01c4, B:161:0x01cc, B:164:0x01d1, B:166:0x01e2, B:167:0x01f0, B:169:0x01f4, B:171:0x0204, B:173:0x0208, B:175:0x0216, B:177:0x021b, B:178:0x0262, B:180:0x0266, B:182:0x026a, B:183:0x026f, B:185:0x0279, B:188:0x0284, B:189:0x02ac, B:191:0x02b0, B:195:0x02bb, B:199:0x02be, B:200:0x02ca, B:203:0x02d9, B:205:0x02df, B:207:0x02f0, B:209:0x02f4, B:211:0x0302, B:213:0x0314, B:217:0x0323, B:222:0x0328, B:223:0x033d, B:227:0x0233, B:229:0x023b, B:231:0x0241, B:232:0x0246, B:234:0x0347, B:235:0x0352, B:244:0x035d, B:245:0x035e, B:247:0x0362, B:249:0x036a, B:250:0x0374, B:252:0x036f, B:253:0x0380, B:255:0x0388, B:257:0x0391, B:259:0x0397, B:260:0x03b5, B:263:0x03be, B:270:0x03e0, B:271:0x03ed, B:277:0x03fd, B:281:0x040d, B:282:0x041e, B:284:0x041f, B:286:0x0429, B:287:0x066d, B:289:0x0673, B:292:0x067c, B:294:0x0697, B:296:0x06a2, B:299:0x06ab, B:301:0x06b1, B:306:0x06bd, B:311:0x06c7, B:318:0x06ce, B:319:0x06d1, B:321:0x06d5, B:323:0x06e1, B:324:0x06f4, B:328:0x070e, B:330:0x0716, B:332:0x071c, B:333:0x0720, B:334:0x07b5, B:336:0x07ba, B:338:0x07c0, B:340:0x07c8, B:342:0x07cc, B:344:0x07d6, B:346:0x07da, B:347:0x07e0, B:348:0x07fd, B:350:0x07d1, B:352:0x07e4, B:354:0x07e9, B:356:0x07ed, B:357:0x07f3, B:359:0x07f7, B:360:0x0725, B:362:0x072a, B:365:0x0731, B:367:0x0739, B:370:0x0748, B:373:0x0790, B:375:0x0798, B:376:0x074f, B:377:0x075c, B:379:0x0760, B:382:0x0776, B:383:0x073c, B:384:0x078a, B:388:0x079f, B:392:0x07ab, B:393:0x07a5, B:394:0x0431, B:396:0x0435, B:397:0x046f, B:399:0x0477, B:401:0x054a, B:403:0x054e, B:406:0x0555, B:408:0x0559, B:410:0x055d, B:411:0x0564, B:413:0x0568, B:415:0x056e, B:417:0x0578, B:419:0x059f, B:424:0x05a7, B:426:0x05b3, B:428:0x05b9, B:430:0x05bf, B:432:0x05c2, B:440:0x05c9, B:443:0x05db, B:447:0x05e1, B:451:0x05e4, B:453:0x05ea, B:455:0x05ee, B:457:0x05fe, B:461:0x0663, B:464:0x0618, B:465:0x061c, B:467:0x0622, B:469:0x0632, B:471:0x0638, B:473:0x0640, B:475:0x0649, B:477:0x065c, B:481:0x0561, B:482:0x047e, B:484:0x0482, B:486:0x04dc, B:488:0x04e0, B:490:0x04fa, B:493:0x0506, B:495:0x053c, B:496:0x053e, B:497:0x0501, B:498:0x04e7, B:499:0x0489, B:502:0x049a, B:504:0x04cb, B:505:0x043a, B:507:0x0440, B:509:0x0446, B:511:0x0454, B:513:0x0458, B:515:0x0463, B:516:0x0803, B:519:0x080a, B:521:0x0811, B:524:0x0819, B:526:0x081e, B:527:0x0824, B:530:0x082b, B:532:0x082f, B:534:0x0846, B:535:0x0852), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x04e0 A[Catch: IOException -> 0x0864, ie -> 0x086a, RuntimeException -> 0x0870, TryCatch #7 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019b, B:141:0x0178, B:142:0x017a, B:144:0x017e, B:146:0x0182, B:148:0x018a, B:96:0x01a7, B:100:0x01ae, B:153:0x01b4, B:155:0x01bc, B:157:0x01c0, B:159:0x01c4, B:161:0x01cc, B:164:0x01d1, B:166:0x01e2, B:167:0x01f0, B:169:0x01f4, B:171:0x0204, B:173:0x0208, B:175:0x0216, B:177:0x021b, B:178:0x0262, B:180:0x0266, B:182:0x026a, B:183:0x026f, B:185:0x0279, B:188:0x0284, B:189:0x02ac, B:191:0x02b0, B:195:0x02bb, B:199:0x02be, B:200:0x02ca, B:203:0x02d9, B:205:0x02df, B:207:0x02f0, B:209:0x02f4, B:211:0x0302, B:213:0x0314, B:217:0x0323, B:222:0x0328, B:223:0x033d, B:227:0x0233, B:229:0x023b, B:231:0x0241, B:232:0x0246, B:234:0x0347, B:235:0x0352, B:244:0x035d, B:245:0x035e, B:247:0x0362, B:249:0x036a, B:250:0x0374, B:252:0x036f, B:253:0x0380, B:255:0x0388, B:257:0x0391, B:259:0x0397, B:260:0x03b5, B:263:0x03be, B:270:0x03e0, B:271:0x03ed, B:277:0x03fd, B:281:0x040d, B:282:0x041e, B:284:0x041f, B:286:0x0429, B:287:0x066d, B:289:0x0673, B:292:0x067c, B:294:0x0697, B:296:0x06a2, B:299:0x06ab, B:301:0x06b1, B:306:0x06bd, B:311:0x06c7, B:318:0x06ce, B:319:0x06d1, B:321:0x06d5, B:323:0x06e1, B:324:0x06f4, B:328:0x070e, B:330:0x0716, B:332:0x071c, B:333:0x0720, B:334:0x07b5, B:336:0x07ba, B:338:0x07c0, B:340:0x07c8, B:342:0x07cc, B:344:0x07d6, B:346:0x07da, B:347:0x07e0, B:348:0x07fd, B:350:0x07d1, B:352:0x07e4, B:354:0x07e9, B:356:0x07ed, B:357:0x07f3, B:359:0x07f7, B:360:0x0725, B:362:0x072a, B:365:0x0731, B:367:0x0739, B:370:0x0748, B:373:0x0790, B:375:0x0798, B:376:0x074f, B:377:0x075c, B:379:0x0760, B:382:0x0776, B:383:0x073c, B:384:0x078a, B:388:0x079f, B:392:0x07ab, B:393:0x07a5, B:394:0x0431, B:396:0x0435, B:397:0x046f, B:399:0x0477, B:401:0x054a, B:403:0x054e, B:406:0x0555, B:408:0x0559, B:410:0x055d, B:411:0x0564, B:413:0x0568, B:415:0x056e, B:417:0x0578, B:419:0x059f, B:424:0x05a7, B:426:0x05b3, B:428:0x05b9, B:430:0x05bf, B:432:0x05c2, B:440:0x05c9, B:443:0x05db, B:447:0x05e1, B:451:0x05e4, B:453:0x05ea, B:455:0x05ee, B:457:0x05fe, B:461:0x0663, B:464:0x0618, B:465:0x061c, B:467:0x0622, B:469:0x0632, B:471:0x0638, B:473:0x0640, B:475:0x0649, B:477:0x065c, B:481:0x0561, B:482:0x047e, B:484:0x0482, B:486:0x04dc, B:488:0x04e0, B:490:0x04fa, B:493:0x0506, B:495:0x053c, B:496:0x053e, B:497:0x0501, B:498:0x04e7, B:499:0x0489, B:502:0x049a, B:504:0x04cb, B:505:0x043a, B:507:0x0440, B:509:0x0446, B:511:0x0454, B:513:0x0458, B:515:0x0463, B:516:0x0803, B:519:0x080a, B:521:0x0811, B:524:0x0819, B:526:0x081e, B:527:0x0824, B:530:0x082b, B:532:0x082f, B:534:0x0846, B:535:0x0852), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x053c A[Catch: IOException -> 0x0864, ie -> 0x086a, RuntimeException -> 0x0870, TryCatch #7 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019b, B:141:0x0178, B:142:0x017a, B:144:0x017e, B:146:0x0182, B:148:0x018a, B:96:0x01a7, B:100:0x01ae, B:153:0x01b4, B:155:0x01bc, B:157:0x01c0, B:159:0x01c4, B:161:0x01cc, B:164:0x01d1, B:166:0x01e2, B:167:0x01f0, B:169:0x01f4, B:171:0x0204, B:173:0x0208, B:175:0x0216, B:177:0x021b, B:178:0x0262, B:180:0x0266, B:182:0x026a, B:183:0x026f, B:185:0x0279, B:188:0x0284, B:189:0x02ac, B:191:0x02b0, B:195:0x02bb, B:199:0x02be, B:200:0x02ca, B:203:0x02d9, B:205:0x02df, B:207:0x02f0, B:209:0x02f4, B:211:0x0302, B:213:0x0314, B:217:0x0323, B:222:0x0328, B:223:0x033d, B:227:0x0233, B:229:0x023b, B:231:0x0241, B:232:0x0246, B:234:0x0347, B:235:0x0352, B:244:0x035d, B:245:0x035e, B:247:0x0362, B:249:0x036a, B:250:0x0374, B:252:0x036f, B:253:0x0380, B:255:0x0388, B:257:0x0391, B:259:0x0397, B:260:0x03b5, B:263:0x03be, B:270:0x03e0, B:271:0x03ed, B:277:0x03fd, B:281:0x040d, B:282:0x041e, B:284:0x041f, B:286:0x0429, B:287:0x066d, B:289:0x0673, B:292:0x067c, B:294:0x0697, B:296:0x06a2, B:299:0x06ab, B:301:0x06b1, B:306:0x06bd, B:311:0x06c7, B:318:0x06ce, B:319:0x06d1, B:321:0x06d5, B:323:0x06e1, B:324:0x06f4, B:328:0x070e, B:330:0x0716, B:332:0x071c, B:333:0x0720, B:334:0x07b5, B:336:0x07ba, B:338:0x07c0, B:340:0x07c8, B:342:0x07cc, B:344:0x07d6, B:346:0x07da, B:347:0x07e0, B:348:0x07fd, B:350:0x07d1, B:352:0x07e4, B:354:0x07e9, B:356:0x07ed, B:357:0x07f3, B:359:0x07f7, B:360:0x0725, B:362:0x072a, B:365:0x0731, B:367:0x0739, B:370:0x0748, B:373:0x0790, B:375:0x0798, B:376:0x074f, B:377:0x075c, B:379:0x0760, B:382:0x0776, B:383:0x073c, B:384:0x078a, B:388:0x079f, B:392:0x07ab, B:393:0x07a5, B:394:0x0431, B:396:0x0435, B:397:0x046f, B:399:0x0477, B:401:0x054a, B:403:0x054e, B:406:0x0555, B:408:0x0559, B:410:0x055d, B:411:0x0564, B:413:0x0568, B:415:0x056e, B:417:0x0578, B:419:0x059f, B:424:0x05a7, B:426:0x05b3, B:428:0x05b9, B:430:0x05bf, B:432:0x05c2, B:440:0x05c9, B:443:0x05db, B:447:0x05e1, B:451:0x05e4, B:453:0x05ea, B:455:0x05ee, B:457:0x05fe, B:461:0x0663, B:464:0x0618, B:465:0x061c, B:467:0x0622, B:469:0x0632, B:471:0x0638, B:473:0x0640, B:475:0x0649, B:477:0x065c, B:481:0x0561, B:482:0x047e, B:484:0x0482, B:486:0x04dc, B:488:0x04e0, B:490:0x04fa, B:493:0x0506, B:495:0x053c, B:496:0x053e, B:497:0x0501, B:498:0x04e7, B:499:0x0489, B:502:0x049a, B:504:0x04cb, B:505:0x043a, B:507:0x0440, B:509:0x0446, B:511:0x0454, B:513:0x0458, B:515:0x0463, B:516:0x0803, B:519:0x080a, B:521:0x0811, B:524:0x0819, B:526:0x081e, B:527:0x0824, B:530:0x082b, B:532:0x082f, B:534:0x0846, B:535:0x0852), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0501 A[Catch: IOException -> 0x0864, ie -> 0x086a, RuntimeException -> 0x0870, TryCatch #7 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019b, B:141:0x0178, B:142:0x017a, B:144:0x017e, B:146:0x0182, B:148:0x018a, B:96:0x01a7, B:100:0x01ae, B:153:0x01b4, B:155:0x01bc, B:157:0x01c0, B:159:0x01c4, B:161:0x01cc, B:164:0x01d1, B:166:0x01e2, B:167:0x01f0, B:169:0x01f4, B:171:0x0204, B:173:0x0208, B:175:0x0216, B:177:0x021b, B:178:0x0262, B:180:0x0266, B:182:0x026a, B:183:0x026f, B:185:0x0279, B:188:0x0284, B:189:0x02ac, B:191:0x02b0, B:195:0x02bb, B:199:0x02be, B:200:0x02ca, B:203:0x02d9, B:205:0x02df, B:207:0x02f0, B:209:0x02f4, B:211:0x0302, B:213:0x0314, B:217:0x0323, B:222:0x0328, B:223:0x033d, B:227:0x0233, B:229:0x023b, B:231:0x0241, B:232:0x0246, B:234:0x0347, B:235:0x0352, B:244:0x035d, B:245:0x035e, B:247:0x0362, B:249:0x036a, B:250:0x0374, B:252:0x036f, B:253:0x0380, B:255:0x0388, B:257:0x0391, B:259:0x0397, B:260:0x03b5, B:263:0x03be, B:270:0x03e0, B:271:0x03ed, B:277:0x03fd, B:281:0x040d, B:282:0x041e, B:284:0x041f, B:286:0x0429, B:287:0x066d, B:289:0x0673, B:292:0x067c, B:294:0x0697, B:296:0x06a2, B:299:0x06ab, B:301:0x06b1, B:306:0x06bd, B:311:0x06c7, B:318:0x06ce, B:319:0x06d1, B:321:0x06d5, B:323:0x06e1, B:324:0x06f4, B:328:0x070e, B:330:0x0716, B:332:0x071c, B:333:0x0720, B:334:0x07b5, B:336:0x07ba, B:338:0x07c0, B:340:0x07c8, B:342:0x07cc, B:344:0x07d6, B:346:0x07da, B:347:0x07e0, B:348:0x07fd, B:350:0x07d1, B:352:0x07e4, B:354:0x07e9, B:356:0x07ed, B:357:0x07f3, B:359:0x07f7, B:360:0x0725, B:362:0x072a, B:365:0x0731, B:367:0x0739, B:370:0x0748, B:373:0x0790, B:375:0x0798, B:376:0x074f, B:377:0x075c, B:379:0x0760, B:382:0x0776, B:383:0x073c, B:384:0x078a, B:388:0x079f, B:392:0x07ab, B:393:0x07a5, B:394:0x0431, B:396:0x0435, B:397:0x046f, B:399:0x0477, B:401:0x054a, B:403:0x054e, B:406:0x0555, B:408:0x0559, B:410:0x055d, B:411:0x0564, B:413:0x0568, B:415:0x056e, B:417:0x0578, B:419:0x059f, B:424:0x05a7, B:426:0x05b3, B:428:0x05b9, B:430:0x05bf, B:432:0x05c2, B:440:0x05c9, B:443:0x05db, B:447:0x05e1, B:451:0x05e4, B:453:0x05ea, B:455:0x05ee, B:457:0x05fe, B:461:0x0663, B:464:0x0618, B:465:0x061c, B:467:0x0622, B:469:0x0632, B:471:0x0638, B:473:0x0640, B:475:0x0649, B:477:0x065c, B:481:0x0561, B:482:0x047e, B:484:0x0482, B:486:0x04dc, B:488:0x04e0, B:490:0x04fa, B:493:0x0506, B:495:0x053c, B:496:0x053e, B:497:0x0501, B:498:0x04e7, B:499:0x0489, B:502:0x049a, B:504:0x04cb, B:505:0x043a, B:507:0x0440, B:509:0x0446, B:511:0x0454, B:513:0x0458, B:515:0x0463, B:516:0x0803, B:519:0x080a, B:521:0x0811, B:524:0x0819, B:526:0x081e, B:527:0x0824, B:530:0x082b, B:532:0x082f, B:534:0x0846, B:535:0x0852), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:498:0x04e7 A[Catch: IOException -> 0x0864, ie -> 0x086a, RuntimeException -> 0x0870, TryCatch #7 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:9:0x001a, B:11:0x0022, B:15:0x0028, B:18:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:30:0x0053, B:34:0x005b, B:40:0x006a, B:41:0x006f, B:43:0x0079, B:45:0x007d, B:47:0x0081, B:48:0x0092, B:51:0x0098, B:56:0x009c, B:66:0x00ba, B:75:0x00c8, B:78:0x00cb, B:82:0x00d5, B:87:0x00d9, B:88:0x00da, B:92:0x00e1, B:94:0x00e7, B:105:0x00ef, B:108:0x00f8, B:110:0x0117, B:111:0x011e, B:113:0x0124, B:116:0x0131, B:118:0x013b, B:120:0x013f, B:122:0x0145, B:125:0x014b, B:126:0x0152, B:127:0x0156, B:130:0x015d, B:132:0x0161, B:129:0x0166, B:138:0x0169, B:139:0x019b, B:141:0x0178, B:142:0x017a, B:144:0x017e, B:146:0x0182, B:148:0x018a, B:96:0x01a7, B:100:0x01ae, B:153:0x01b4, B:155:0x01bc, B:157:0x01c0, B:159:0x01c4, B:161:0x01cc, B:164:0x01d1, B:166:0x01e2, B:167:0x01f0, B:169:0x01f4, B:171:0x0204, B:173:0x0208, B:175:0x0216, B:177:0x021b, B:178:0x0262, B:180:0x0266, B:182:0x026a, B:183:0x026f, B:185:0x0279, B:188:0x0284, B:189:0x02ac, B:191:0x02b0, B:195:0x02bb, B:199:0x02be, B:200:0x02ca, B:203:0x02d9, B:205:0x02df, B:207:0x02f0, B:209:0x02f4, B:211:0x0302, B:213:0x0314, B:217:0x0323, B:222:0x0328, B:223:0x033d, B:227:0x0233, B:229:0x023b, B:231:0x0241, B:232:0x0246, B:234:0x0347, B:235:0x0352, B:244:0x035d, B:245:0x035e, B:247:0x0362, B:249:0x036a, B:250:0x0374, B:252:0x036f, B:253:0x0380, B:255:0x0388, B:257:0x0391, B:259:0x0397, B:260:0x03b5, B:263:0x03be, B:270:0x03e0, B:271:0x03ed, B:277:0x03fd, B:281:0x040d, B:282:0x041e, B:284:0x041f, B:286:0x0429, B:287:0x066d, B:289:0x0673, B:292:0x067c, B:294:0x0697, B:296:0x06a2, B:299:0x06ab, B:301:0x06b1, B:306:0x06bd, B:311:0x06c7, B:318:0x06ce, B:319:0x06d1, B:321:0x06d5, B:323:0x06e1, B:324:0x06f4, B:328:0x070e, B:330:0x0716, B:332:0x071c, B:333:0x0720, B:334:0x07b5, B:336:0x07ba, B:338:0x07c0, B:340:0x07c8, B:342:0x07cc, B:344:0x07d6, B:346:0x07da, B:347:0x07e0, B:348:0x07fd, B:350:0x07d1, B:352:0x07e4, B:354:0x07e9, B:356:0x07ed, B:357:0x07f3, B:359:0x07f7, B:360:0x0725, B:362:0x072a, B:365:0x0731, B:367:0x0739, B:370:0x0748, B:373:0x0790, B:375:0x0798, B:376:0x074f, B:377:0x075c, B:379:0x0760, B:382:0x0776, B:383:0x073c, B:384:0x078a, B:388:0x079f, B:392:0x07ab, B:393:0x07a5, B:394:0x0431, B:396:0x0435, B:397:0x046f, B:399:0x0477, B:401:0x054a, B:403:0x054e, B:406:0x0555, B:408:0x0559, B:410:0x055d, B:411:0x0564, B:413:0x0568, B:415:0x056e, B:417:0x0578, B:419:0x059f, B:424:0x05a7, B:426:0x05b3, B:428:0x05b9, B:430:0x05bf, B:432:0x05c2, B:440:0x05c9, B:443:0x05db, B:447:0x05e1, B:451:0x05e4, B:453:0x05ea, B:455:0x05ee, B:457:0x05fe, B:461:0x0663, B:464:0x0618, B:465:0x061c, B:467:0x0622, B:469:0x0632, B:471:0x0638, B:473:0x0640, B:475:0x0649, B:477:0x065c, B:481:0x0561, B:482:0x047e, B:484:0x0482, B:486:0x04dc, B:488:0x04e0, B:490:0x04fa, B:493:0x0506, B:495:0x053c, B:496:0x053e, B:497:0x0501, B:498:0x04e7, B:499:0x0489, B:502:0x049a, B:504:0x04cb, B:505:0x043a, B:507:0x0440, B:509:0x0446, B:511:0x0454, B:513:0x0458, B:515:0x0463, B:516:0x0803, B:519:0x080a, B:521:0x0811, B:524:0x0819, B:526:0x081e, B:527:0x0824, B:530:0x082b, B:532:0x082f, B:534:0x0846, B:535:0x0852), top: B:2:0x0005 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        boolean z6;
        int i7;
        IOException iOException;
        boolean z7;
        int i8;
        ie ieVar;
        int i9;
        Handler handler;
        re reVar;
        int f7;
        long j7;
        re reVar2;
        re reVar3;
        int i10;
        pl plVar;
        long j8;
        re reVar4;
        boolean k7;
        boolean z8;
        Message obtainMessage;
        int i11;
        re reVar5;
        re reVar6;
        int i12;
        int i13 = 1;
        try {
            try {
                long j9 = 0;
                try {
                    switch (message.what) {
                        case 0:
                            kk kkVar = (kk) message.obj;
                            int i14 = message.arg1;
                            this.f13313l.sendEmptyMessage(0);
                            M(true);
                            this.O.a();
                            if (i14 != 0) {
                                this.f13317p = new se(0, -9223372036854775807L);
                            }
                            this.f13321t = kkVar;
                            kkVar.a(this.f13314m, true, this);
                            i(2);
                            this.f13311j.sendEmptyMessage(2);
                            return true;
                        case 1:
                            boolean z9 = message.arg1 != 0;
                            this.f13325x = false;
                            this.f13324w = z9;
                            if (z9) {
                                int i15 = this.f13327z;
                                if (i15 == 3) {
                                    j();
                                    handler = this.f13311j;
                                    i9 = 2;
                                } else {
                                    i9 = 2;
                                    if (i15 == 2) {
                                        handler = this.f13311j;
                                    }
                                }
                                handler.sendEmptyMessage(i9);
                            } else {
                                l();
                                m();
                            }
                            return true;
                        case 2:
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (this.K == null) {
                                this.f13321t.zza();
                                j7 = elapsedRealtime;
                            } else {
                                re reVar7 = this.H;
                                if (reVar7 == null) {
                                    f7 = this.f13317p.f11794a;
                                } else {
                                    int i16 = reVar7.f11119g;
                                    if (!reVar7.f11121i && reVar7.d() && this.K.d(i16, this.f13316o, false).f5595c != -9223372036854775807L && ((reVar = this.J) == null || this.H.f11115c - reVar.f11115c != 100)) {
                                        f7 = this.K.f(i16, this.f13316o, this.f13315n, this.A);
                                    }
                                    j7 = elapsedRealtime;
                                    reVar2 = this.H;
                                    if (reVar2 != null && !reVar2.d()) {
                                        if (this.H != null && !this.f13326y) {
                                            J();
                                        }
                                        if (this.J != null) {
                                            while (true) {
                                                re reVar8 = this.J;
                                                reVar3 = this.I;
                                                if (reVar8 != reVar3 && this.G >= reVar8.f11124l.f11118f) {
                                                    reVar8.c();
                                                    h(this.J.f11124l);
                                                    re reVar9 = this.J;
                                                    this.f13317p = new se(reVar9.f11119g, reVar9.f11120h);
                                                    m();
                                                    this.f13313l.obtainMessage(5, this.f13317p).sendToTarget();
                                                }
                                            }
                                            if (reVar3.f11121i) {
                                                for (int i17 = 0; i17 < 2; i17++) {
                                                    cf cfVar = this.f13307f[i17];
                                                    uk ukVar = this.I.f11116d[i17];
                                                    if (ukVar != null && cfVar.f() == ukVar && cfVar.G()) {
                                                        cfVar.x();
                                                    }
                                                }
                                            } else {
                                                while (true) {
                                                    if (i10 < 2) {
                                                        cf cfVar2 = this.f13307f[i10];
                                                        uk ukVar2 = this.I.f11116d[i10];
                                                        i10 = (cfVar2.f() == ukVar2 && (ukVar2 == null || cfVar2.G())) ? i10 + 1 : 0;
                                                    } else {
                                                        re reVar10 = this.I;
                                                        re reVar11 = reVar10.f11124l;
                                                        if (reVar11 != null && reVar11.f11122j) {
                                                            pl plVar2 = reVar10.f11125m;
                                                            this.I = reVar11;
                                                            pl plVar3 = reVar11.f11125m;
                                                            long f8 = reVar11.f11113a.f();
                                                            int i18 = 0;
                                                            int i19 = 2;
                                                            while (i18 < i19) {
                                                                cf cfVar3 = this.f13307f[i18];
                                                                if (plVar2.f10265b.a(i18) != null) {
                                                                    if (f8 != -9223372036854775807L) {
                                                                        cfVar3.x();
                                                                    } else if (!cfVar3.H()) {
                                                                        el a7 = plVar3.f10265b.a(i18);
                                                                        ef efVar = plVar2.f10267d[i18];
                                                                        ef efVar2 = plVar3.f10267d[i18];
                                                                        if (a7 == null || !efVar2.equals(efVar)) {
                                                                            plVar = plVar3;
                                                                            j8 = f8;
                                                                            cfVar3.x();
                                                                        } else {
                                                                            a7.b();
                                                                            xe[] xeVarArr = new xe[i13];
                                                                            for (int i20 = 0; i20 <= 0; i20++) {
                                                                                xeVarArr[i20] = a7.c(i20);
                                                                            }
                                                                            re reVar12 = this.I;
                                                                            plVar = plVar3;
                                                                            j8 = f8;
                                                                            cfVar3.Y(xeVarArr, reVar12.f11116d[i18], reVar12.f11118f - reVar12.f11120h);
                                                                        }
                                                                        i18++;
                                                                        plVar3 = plVar;
                                                                        f8 = j8;
                                                                        i19 = 2;
                                                                        i13 = 1;
                                                                    }
                                                                }
                                                                plVar = plVar3;
                                                                j8 = f8;
                                                                i18++;
                                                                plVar3 = plVar;
                                                                f8 = j8;
                                                                i19 = 2;
                                                                i13 = 1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    g(false);
                                    if (this.J != null) {
                                    }
                                }
                                if (f7 >= this.K.b()) {
                                    this.f13321t.zza();
                                    j7 = elapsedRealtime;
                                    reVar2 = this.H;
                                    if (reVar2 != null) {
                                        if (this.H != null) {
                                            J();
                                        }
                                        if (this.J != null) {
                                        }
                                    }
                                    g(false);
                                    if (this.J != null) {
                                    }
                                } else {
                                    if (this.H == null) {
                                        j9 = this.f13317p.f11796c;
                                    } else {
                                        this.K.d(f7, this.f13316o, false);
                                        this.K.g(0, this.f13315n, false);
                                        if (f7 == 0) {
                                            re reVar13 = this.H;
                                            j7 = elapsedRealtime;
                                            Pair<Integer, Long> F = F(this.K, 0, -9223372036854775807L, Math.max(0L, ((reVar13.f11118f - reVar13.f11120h) + this.K.d(reVar13.f11119g, this.f13316o, false).f5595c) - this.G));
                                            if (F != null) {
                                                int intValue = ((Integer) F.first).intValue();
                                                j9 = ((Long) F.second).longValue();
                                                f7 = intValue;
                                                re reVar14 = this.H;
                                                long j10 = reVar14 != null ? 60000000 + j9 : (reVar14.f11118f - reVar14.f11120h) + this.K.d(reVar14.f11119g, this.f13316o, false).f5595c;
                                                re reVar15 = this.H;
                                                int i21 = reVar15 != null ? 0 : reVar15.f11115c + 1;
                                                boolean n7 = n(f7);
                                                this.K.d(f7, this.f13316o, true);
                                                re reVar16 = new re(this.f13307f, this.f13308g, j10, this.f13309h, this.O, this.f13321t, this.f13316o.f5594b, i21, f7, n7, j9, null);
                                                reVar4 = this.H;
                                                if (reVar4 != null) {
                                                    reVar4.f11124l = reVar16;
                                                }
                                                this.H = reVar16;
                                                reVar16.f11113a.u(this, j9);
                                                g(true);
                                            }
                                            reVar2 = this.H;
                                            if (reVar2 != null) {
                                            }
                                            g(false);
                                            if (this.J != null) {
                                            }
                                        }
                                    }
                                    j7 = elapsedRealtime;
                                    re reVar142 = this.H;
                                    long j102 = reVar142 != null ? 60000000 + j9 : (reVar142.f11118f - reVar142.f11120h) + this.K.d(reVar142.f11119g, this.f13316o, false).f5595c;
                                    re reVar152 = this.H;
                                    if (reVar152 != null) {
                                    }
                                    boolean n72 = n(f7);
                                    this.K.d(f7, this.f13316o, true);
                                    re reVar162 = new re(this.f13307f, this.f13308g, j102, this.f13309h, this.O, this.f13321t, this.f13316o.f5594b, i21, f7, n72, j9, null);
                                    reVar4 = this.H;
                                    if (reVar4 != null) {
                                    }
                                    this.H = reVar162;
                                    reVar162.f11113a.u(this, j9);
                                    g(true);
                                    reVar2 = this.H;
                                    if (reVar2 != null) {
                                    }
                                    g(false);
                                    if (this.J != null) {
                                    }
                                }
                            }
                            if (this.J == null) {
                                K();
                                f(j7, 10L);
                            } else {
                                wm.a("doSomeWork");
                                m();
                                this.J.f11113a.r(this.f13317p.f11796c);
                                boolean z10 = true;
                                boolean z11 = true;
                                for (cf cfVar4 : this.f13322u) {
                                    cfVar4.X(this.G, this.D);
                                    z11 = z11 && cfVar4.M();
                                    if (!cfVar4.A() && !cfVar4.M()) {
                                        z8 = false;
                                        if (!z8) {
                                            cfVar4.o();
                                        }
                                        z10 = !z10 && z8;
                                    }
                                    z8 = true;
                                    if (!z8) {
                                    }
                                    if (z10) {
                                    }
                                }
                                if (!z10) {
                                    K();
                                }
                                nm nmVar = this.f13320s;
                                if (nmVar != null) {
                                    bf v6 = nmVar.v();
                                    if (!v6.equals(this.f13318q)) {
                                        this.f13318q = v6;
                                        this.f13310i.d(this.f13320s);
                                        this.f13313l.obtainMessage(7, v6).sendToTarget();
                                    }
                                }
                                long j11 = this.K.d(this.J.f11119g, this.f13316o, false).f5595c;
                                if (!z11 || ((j11 != -9223372036854775807L && j11 > this.f13317p.f11796c) || !this.J.f11121i)) {
                                    int i22 = this.f13327z;
                                    if (i22 == 2) {
                                        if (this.f13322u.length <= 0) {
                                            break;
                                        } else if (z10) {
                                            boolean z12 = this.f13325x;
                                            re reVar17 = this.H;
                                            long e7 = !reVar17.f11122j ? reVar17.f11120h : reVar17.f11113a.e();
                                            if (e7 == Long.MIN_VALUE) {
                                                re reVar18 = this.H;
                                                if (reVar18.f11121i) {
                                                    i(3);
                                                    if (this.f13324w) {
                                                        j();
                                                    }
                                                } else {
                                                    e7 = this.K.d(reVar18.f11119g, this.f13316o, false).f5595c;
                                                }
                                            }
                                            if (this.L) {
                                                qr0 qr0Var = this.O;
                                                long j12 = this.f13317p.f11797d;
                                                re reVar19 = this.H;
                                                k7 = qr0Var.k(j12 - (this.G - (reVar19.f11118f - reVar19.f11120h)), z12);
                                            } else {
                                                qr0 qr0Var2 = this.O;
                                                re reVar20 = this.H;
                                                k7 = qr0Var2.k(e7 - (this.G - (reVar20.f11118f - reVar20.f11120h)), z12);
                                            }
                                            if (k7) {
                                                i(3);
                                                if (this.f13324w) {
                                                }
                                            }
                                        }
                                    } else if (i22 == 3) {
                                        if (this.f13322u.length <= 0) {
                                            z10 = o(j11);
                                        }
                                        if (!z10) {
                                            this.f13325x = this.f13324w;
                                            i(2);
                                        }
                                    }
                                    if (this.f13327z == 2) {
                                        for (cf cfVar5 : this.f13322u) {
                                            cfVar5.o();
                                        }
                                    }
                                    if ((!this.f13324w && this.f13327z == 3) || this.f13327z == 2) {
                                        f(j7, this.M > 0 ? this.M : 10L);
                                    } else if (this.f13322u.length == 0) {
                                        f(j7, this.N > 0 ? this.N : 1000L);
                                    } else {
                                        this.f13311j.removeMessages(2);
                                    }
                                    wm.b();
                                } else {
                                    i(4);
                                }
                                l();
                                if (this.f13327z == 2) {
                                }
                                if (!this.f13324w) {
                                }
                                if (this.f13322u.length == 0) {
                                }
                                wm.b();
                            }
                            return true;
                        case 3:
                            te teVar = (te) message.obj;
                            if (this.K == null) {
                                this.E++;
                                this.F = teVar;
                            } else {
                                Pair<Integer, Long> G = G(teVar);
                                if (G == null) {
                                    se seVar = new se(0, 0L);
                                    this.f13317p = seVar;
                                    this.f13313l.obtainMessage(4, 1, 0, seVar).sendToTarget();
                                    this.f13317p = new se(0, -9223372036854775807L);
                                    i(4);
                                    M(false);
                                } else {
                                    int i23 = teVar.f12185c == -9223372036854775807L ? 1 : 0;
                                    int intValue2 = ((Integer) G.first).intValue();
                                    long longValue = ((Long) G.second).longValue();
                                    try {
                                        se seVar2 = this.f13317p;
                                        if (intValue2 == seVar2.f11794a && longValue / 1000 == seVar2.f11796c / 1000) {
                                            se seVar3 = new se(intValue2, longValue);
                                            this.f13317p = seVar3;
                                            obtainMessage = this.f13313l.obtainMessage(4, i23, 0, seVar3);
                                        } else {
                                            long C = C(intValue2, longValue);
                                            int i24 = i23 | (longValue != C ? 1 : 0);
                                            se seVar4 = new se(intValue2, C);
                                            this.f13317p = seVar4;
                                            obtainMessage = this.f13313l.obtainMessage(4, i24, 0, seVar4);
                                        }
                                        obtainMessage.sendToTarget();
                                    } catch (Throwable th) {
                                        se seVar5 = new se(intValue2, longValue);
                                        this.f13317p = seVar5;
                                        this.f13313l.obtainMessage(4, i23, 0, seVar5).sendToTarget();
                                        throw th;
                                    }
                                }
                            }
                            return true;
                        case 4:
                            bf bfVar = (bf) message.obj;
                            nm nmVar2 = this.f13320s;
                            if (nmVar2 != null) {
                                bfVar = nmVar2.e(bfVar);
                            } else {
                                this.f13310i.e(bfVar);
                            }
                            this.f13318q = bfVar;
                            this.f13313l.obtainMessage(7, bfVar).sendToTarget();
                            return true;
                        case 5:
                            k();
                            return true;
                        case 6:
                            M(true);
                            this.O.b();
                            i(1);
                            synchronized (this) {
                                this.f13323v = true;
                                notifyAll();
                            }
                            return true;
                        case c4.w0.f2149o /* 7 */:
                            Pair pair = (Pair) message.obj;
                            Cif cif = this.K;
                            Cif cif2 = (Cif) pair.first;
                            this.K = cif2;
                            Object obj = pair.second;
                            if (cif == null) {
                                if (this.E > 0) {
                                    Pair<Integer, Long> G2 = G(this.F);
                                    i11 = this.E;
                                    this.E = 0;
                                    this.F = null;
                                    if (G2 != null) {
                                        this.f13317p = new se(((Integer) G2.first).intValue(), ((Long) G2.second).longValue());
                                        reVar5 = this.J;
                                        if (reVar5 == null) {
                                            reVar5 = this.H;
                                        }
                                        if (reVar5 != null) {
                                            int a8 = this.K.a(reVar5.f11114b);
                                            if (a8 != -1) {
                                                boolean n8 = n(0);
                                                reVar5.f11119g = 0;
                                                reVar5.f11121i = n8;
                                                boolean z13 = reVar5 == this.I;
                                                se seVar6 = this.f13317p;
                                                if (seVar6.f11794a != 0) {
                                                    se seVar7 = new se(0, seVar6.f11795b);
                                                    seVar7.f11796c = seVar6.f11796c;
                                                    seVar7.f11797d = seVar6.f11797d;
                                                    this.f13317p = seVar7;
                                                }
                                                while (true) {
                                                    re reVar21 = reVar5.f11124l;
                                                    if (reVar21 != null) {
                                                        a8 = this.K.f(a8, this.f13316o, this.f13315n, this.A);
                                                        if (a8 != -1 && reVar21.f11114b.equals(this.K.d(a8, this.f13316o, true).f5594b)) {
                                                            boolean n9 = n(a8);
                                                            reVar21.f11119g = a8;
                                                            reVar21.f11121i = n9;
                                                            z13 |= reVar21 == this.I;
                                                            reVar5 = reVar21;
                                                        }
                                                    }
                                                }
                                            } else if (B(reVar5.f11119g, cif, this.K) != -1) {
                                                this.K.d(0, this.f13316o, false);
                                                Pair<Integer, Long> D = D(0, -9223372036854775807L);
                                                int intValue3 = ((Integer) D.first).intValue();
                                                long longValue2 = ((Long) D.second).longValue();
                                                this.K.d(intValue3, this.f13316o, true);
                                                Object obj2 = this.f13316o.f5594b;
                                                reVar5.f11119g = -1;
                                                while (true) {
                                                    reVar5 = reVar5.f11124l;
                                                    if (reVar5 != null) {
                                                        reVar5.f11119g = true != reVar5.f11114b.equals(obj2) ? -1 : intValue3;
                                                    } else {
                                                        this.f13317p = new se(intValue3, C(intValue3, longValue2));
                                                    }
                                                }
                                            }
                                        }
                                        L(obj, i11);
                                        return true;
                                    }
                                    I(obj, i11);
                                    return true;
                                }
                                if (this.f13317p.f11795b == -9223372036854775807L) {
                                    if (cif2.h()) {
                                        I(obj, 0);
                                        return true;
                                    }
                                    Pair<Integer, Long> D2 = D(0, -9223372036854775807L);
                                    this.f13317p = new se(((Integer) D2.first).intValue(), ((Long) D2.second).longValue());
                                }
                            }
                            i11 = 0;
                            reVar5 = this.J;
                            if (reVar5 == null) {
                            }
                            if (reVar5 != null) {
                            }
                            L(obj, i11);
                            return true;
                        case c4.w0.f2150p /* 8 */:
                            ik ikVar = (ik) message.obj;
                            re reVar22 = this.H;
                            if (reVar22 != null && reVar22.f11113a == ikVar) {
                                reVar22.f11122j = true;
                                reVar22.e();
                                reVar22.f11120h = reVar22.a(reVar22.f11120h, false);
                                if (this.J == null) {
                                    re reVar23 = this.H;
                                    this.I = reVar23;
                                    e(reVar23.f11120h);
                                    h(this.I);
                                }
                                J();
                            }
                            return true;
                        case 9:
                            ik ikVar2 = (ik) message.obj;
                            re reVar24 = this.H;
                            if (reVar24 != null && reVar24.f11113a == ikVar2) {
                                J();
                            }
                            return true;
                        case 10:
                            re reVar25 = this.J;
                            if (reVar25 != null) {
                                boolean z14 = true;
                                while (true) {
                                    if (reVar25 != null && reVar25.f11122j) {
                                        if (reVar25.e()) {
                                            if (z14) {
                                                re reVar26 = this.I;
                                                re reVar27 = this.J;
                                                boolean z15 = reVar26 != reVar27;
                                                q(reVar27.f11124l);
                                                re reVar28 = this.J;
                                                reVar28.f11124l = null;
                                                this.H = reVar28;
                                                this.I = reVar28;
                                                boolean[] zArr = new boolean[2];
                                                long b7 = reVar28.b(this.f13317p.f11796c, z15, zArr);
                                                if (b7 != this.f13317p.f11796c) {
                                                    this.f13317p.f11796c = b7;
                                                    e(b7);
                                                }
                                                boolean[] zArr2 = new boolean[2];
                                                int i25 = 0;
                                                for (int i26 = 0; i26 < 2; i26++) {
                                                    cf cfVar6 = this.f13307f[i26];
                                                    boolean z16 = cfVar6.a() != 0;
                                                    zArr2[i26] = z16;
                                                    uk ukVar3 = this.J.f11116d[i26];
                                                    if (ukVar3 != null) {
                                                        i25++;
                                                    }
                                                    if (z16) {
                                                        if (ukVar3 != cfVar6.f()) {
                                                            if (cfVar6 == this.f13319r) {
                                                                if (ukVar3 == null) {
                                                                    this.f13310i.d(this.f13320s);
                                                                }
                                                                this.f13320s = null;
                                                                this.f13319r = null;
                                                            }
                                                            p(cfVar6);
                                                            cfVar6.i();
                                                        } else if (zArr[i26]) {
                                                            cfVar6.a0(this.G);
                                                        }
                                                    }
                                                }
                                                this.f13313l.obtainMessage(3, reVar25.f11125m).sendToTarget();
                                                H(zArr2, i25);
                                            } else {
                                                this.H = reVar25;
                                                while (true) {
                                                    reVar25 = reVar25.f11124l;
                                                    if (reVar25 != null) {
                                                        reVar25.c();
                                                    } else {
                                                        re reVar29 = this.H;
                                                        reVar29.f11124l = null;
                                                        if (reVar29.f11122j) {
                                                            long j13 = reVar29.f11120h;
                                                            this.H.a(Math.max(j13, this.G - (reVar29.f11118f - j13)), false);
                                                        }
                                                    }
                                                }
                                            }
                                            J();
                                            m();
                                            this.f13311j.sendEmptyMessage(2);
                                        } else {
                                            z14 &= reVar25 != this.I;
                                            reVar25 = reVar25.f11124l;
                                        }
                                    }
                                }
                            }
                            return true;
                        case 11:
                            try {
                                for (le leVar : (le[]) message.obj) {
                                    leVar.f7942a.j(leVar.f7943b, leVar.f7944c);
                                }
                                if (this.f13321t != null) {
                                    this.f13311j.sendEmptyMessage(2);
                                }
                                synchronized (this) {
                                    this.C++;
                                    notifyAll();
                                }
                                return true;
                            } catch (Throwable th2) {
                                synchronized (this) {
                                    this.C++;
                                    notifyAll();
                                    throw th2;
                                }
                            }
                        case 12:
                            int i27 = message.arg1;
                            this.A = i27;
                            re reVar30 = this.J;
                            if (reVar30 == null) {
                                reVar30 = this.H;
                            }
                            if (reVar30 != null) {
                                boolean z17 = reVar30 == this.I;
                                boolean z18 = reVar30 == this.H;
                                int f9 = this.K.f(reVar30.f11119g, this.f13316o, this.f13315n, i27);
                                while (true) {
                                    re reVar31 = reVar30.f11124l;
                                    if (reVar31 != null && f9 != -1 && (i12 = reVar31.f11119g) == f9) {
                                        z17 |= reVar31 == this.I;
                                        z18 |= reVar31 == this.H;
                                        f9 = this.K.f(i12, this.f13316o, this.f13315n, i27);
                                        reVar30 = reVar31;
                                    }
                                }
                                reVar30.f11121i = n(reVar30.f11119g);
                                if (!z18) {
                                    this.H = reVar30;
                                }
                                if (!z17 && (reVar6 = this.J) != null) {
                                    int i28 = reVar6.f11119g;
                                    this.f13317p = new se(i28, C(i28, this.f13317p.f11796c));
                                }
                                if (this.f13327z == 4 && i27 != 0) {
                                    i(2);
                                }
                            }
                            return true;
                        default:
                            return false;
                    }
                } catch (ie e8) {
                    ieVar = e8;
                    z7 = true;
                    i8 = 8;
                    Log.e("ExoPlayerImplInternal", "Renderer error.", ieVar);
                    this.f13313l.obtainMessage(i8, ieVar).sendToTarget();
                    k();
                    return z7;
                } catch (IOException e9) {
                    iOException = e9;
                    z6 = true;
                    i7 = 8;
                    Log.e("ExoPlayerImplInternal", "Source error.", iOException);
                    this.f13313l.obtainMessage(i7, ie.b(iOException)).sendToTarget();
                    k();
                    return z6;
                }
            } catch (RuntimeException e10) {
                Log.e("ExoPlayerImplInternal", "Internal runtime error.", e10);
                this.f13313l.obtainMessage(8, ie.c(e10)).sendToTarget();
                k();
                return true;
            }
        } catch (ie e11) {
            z7 = true;
            i8 = 8;
            ieVar = e11;
        } catch (IOException e12) {
            z6 = true;
            i7 = 8;
            iOException = e12;
        }
    }

    public final synchronized void r(le... leVarArr) {
        if (this.f13323v) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        int i7 = this.B;
        this.B = i7 + 1;
        this.f13311j.obtainMessage(11, leVarArr).sendToTarget();
        while (this.C <= i7) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void s() {
        this.L = true;
    }

    public final void t(kk kkVar, boolean z6) {
        this.f13311j.obtainMessage(0, 1, 0, kkVar).sendToTarget();
    }

    public final synchronized void u() {
        if (this.f13323v) {
            return;
        }
        this.f13311j.sendEmptyMessage(6);
        while (!this.f13323v) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.f13312k.quit();
    }

    public final void v(Cif cif, int i7, long j7) {
        this.f13311j.obtainMessage(3, new te(cif, 0, j7)).sendToTarget();
    }

    public final void w(le... leVarArr) {
        if (this.f13323v) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        } else {
            this.B++;
            this.f13311j.obtainMessage(11, leVarArr).sendToTarget();
        }
    }

    public final void x(int i7) {
        this.N = i7;
    }

    public final void y(int i7) {
        this.M = i7;
    }

    public final void z(boolean z6) {
        this.f13311j.obtainMessage(1, z6 ? 1 : 0, 0).sendToTarget();
    }
}
