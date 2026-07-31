package androidx.compose.ui.focus;

import I.C0120t;
import M0.j;
import R.h;
import U.l;
import Z.c;
import Z.d;
import Z.e;
import Z.f;
import Z.g;
import Z.k;
import Z.n;
import Z.o;
import Z.q;
import Z.r;
import android.view.KeyEvent;
import e2.AbstractC0381e;
import f.AbstractC0382a;
import g2.i;
import h.AbstractC0416e;
import j.C0501s;
import java.util.ArrayList;
import k2.a0;
import l0.InterfaceC0573c;
import m.AbstractC0600j;
import t0.AbstractC0898f;
import t0.AbstractC0905m;
import t0.D;
import t0.T;
import t0.o0;
import u0.C0986n;
import u0.C0988o;

/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final C0986n f3705a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3706b;

    /* renamed from: c, reason: collision with root package name */
    public final C0988o f3707c;

    /* renamed from: e, reason: collision with root package name */
    public final e f3709e;

    /* renamed from: h, reason: collision with root package name */
    public C0501s f3712h;

    /* renamed from: d, reason: collision with root package name */
    public final q f3708d = new q();

    /* renamed from: f, reason: collision with root package name */
    public final r f3710f = new r();

    /* renamed from: g, reason: collision with root package name */
    public final l f3711g = new FocusPropertiesElement(new k()).e(new T() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // t0.T
        public final U.k h() {
            return a.this.f3708d;
        }

        public final int hashCode() {
            return a.this.f3708d.hashCode();
        }

        @Override // t0.T
        public final /* bridge */ /* synthetic */ void i(U.k kVar) {
        }
    });

    public a(a0 a0Var, C0986n c0986n, d dVar, C0988o c0988o) {
        this.f3705a = c0986n;
        this.f3706b = dVar;
        this.f3707c = c0988o;
        this.f3709e = new e(a0Var, new d(0, this, a.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0, 1));
    }

    public final boolean a(int i3, boolean z3, boolean z4) {
        boolean e3;
        int a3;
        r rVar = this.f3710f;
        f fVar = f.f3424g;
        try {
            if (rVar.f3453a) {
                r.a(rVar);
            }
            rVar.f3453a = true;
            ((K.d) rVar.f3455c).b(fVar);
            q qVar = this.f3708d;
            if (!z3 && ((a3 = AbstractC0600j.a(c.u(qVar, i3))) == 1 || a3 == 2 || a3 == 3)) {
                e3 = false;
                if (e3 && z4) {
                    this.f3706b.b();
                }
                return e3;
            }
            e3 = c.e(qVar, z3, true);
            if (e3) {
                this.f3706b.b();
            }
            return e3;
        } finally {
            r.b(rVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x03b0, code lost:
    
        if (r7 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x00a7, code lost:
    
        if (((((~r10) << 6) & r10) & (-9187201950435737472L)) == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x00a9, code lost:
    
        r4 = r5.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x00af, code lost:
    
        if (r5.f5205e != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x00c3, code lost:
    
        if (((r5.f5201a[r4 >> 3] >> ((r4 & 7) << r7)) & 255) != 254) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x00cb, code lost:
    
        r4 = r5.f5203c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x00cf, code lost:
    
        if (r4 <= 8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x00e7, code lost:
    
        if (java.lang.Long.compare((r5.f5204d * 32) ^ Long.MIN_VALUE, (r4 * 25) ^ Long.MIN_VALUE) > 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x00e9, code lost:
    
        r4 = r5.f5201a;
        r8 = r5.f5203c;
        r9 = r5.f5202b;
        j.AbstractC0478D.a(r4, r8);
        r10 = 0;
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x00f4, code lost:
    
        if (r10 == r8) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x00f6, code lost:
    
        r15 = r10 >> 3;
        r24 = (r10 & 7) << 3;
        r22 = (r4[r15] >> r24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0108, code lost:
    
        if (r22 != 128) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0116, code lost:
    
        if (r22 == 254) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x011b, code lost:
    
        r14 = java.lang.Long.hashCode(r9[r10]) * (-862048943);
        r14 = (r14 ^ (r14 << 16)) >>> 7;
        r23 = r5.b(r14);
        r14 = r14 & r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0140, code lost:
    
        if ((((r23 - r14) & r8) / 8) != (((r10 - r14) & r8) / 8)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0142, code lost:
    
        r4[r15] = ((r22 & 127) << r24) | (r4[r15] & (~(255 << r24)));
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r10 = r10 + 1;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x016b, code lost:
    
        r34 = r2;
        r0 = r23 >> 3;
        r1 = r4[r0];
        r3 = (r23 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x017f, code lost:
    
        if (((r1 >> r3) & 255) != 128) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0181, code lost:
    
        r36 = r12;
        r4[r0] = (r1 & (~(255 << r3))) | ((r22 & 127) << r3);
        r4[r15] = (r4[r15] & (~(255 << r24))) | (128 << r24);
        r9[r23] = r9[r10];
        r9[r10] = 0;
        r38 = r6;
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x01d1, code lost:
    
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r10 = r10 + 1;
        r2 = r34;
        r12 = r36;
        r6 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x01a8, code lost:
    
        r36 = r12;
        r38 = r6;
        r4[r0] = (r1 & (~(255 << r3))) | ((r22 & 127) << r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x01bb, code lost:
    
        if (r11 != (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x01bd, code lost:
    
        r11 = j.AbstractC0478D.b(r4, r10 + 1, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x01c3, code lost:
    
        r9[r11] = r9[r23];
        r9[r23] = r9[r10];
        r9[r10] = r9[r11];
        r10 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0118, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x010a, code lost:
    
        r11 = r10;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x01e9, code lost:
    
        r34 = r2;
        r38 = r6;
        r36 = r12;
        r5.f5205e = j.AbstractC0478D.c(r5.f5203c) - r5.f5204d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0273, code lost:
    
        r0 = r5.b(r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0279, code lost:
    
        r5.f5204d++;
        r1 = r5.f5205e;
        r2 = r5.f5201a;
        r3 = r0 >> 3;
        r6 = r2[r3];
        r4 = (r0 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0294, code lost:
    
        if (((r6 >> r4) & 255) != 128) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0296, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0299, code lost:
    
        r5.f5205e = r1 - r8;
        r1 = r5.f5203c;
        r6 = (r6 & (~(255 << r4))) | (r36 << r4);
        r2[r3] = r6;
        r2[(((r0 - 7) & r1) + (r1 & 7)) >> 3] = r6;
        r31 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0298, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x01fe, code lost:
    
        r34 = r2;
        r38 = r6;
        r36 = r12;
        r0 = j.AbstractC0478D.d(r5.f5203c);
        r1 = r5.f5201a;
        r2 = r5.f5202b;
        r3 = r5.f5203c;
        r5.c(r0);
        r0 = r5.f5201a;
        r4 = r5.f5202b;
        r6 = r5.f5203c;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x021a, code lost:
    
        if (r7 >= r3) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x022c, code lost:
    
        if (((r1[r7 >> 3] >> ((r7 & 7) << 3)) & 255) >= 128) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x022e, code lost:
    
        r8 = r2[r7];
        r10 = java.lang.Long.hashCode(r8) * (-862048943);
        r10 = r10 ^ (r10 << 16);
        r11 = r5.b(r10 >>> 7);
        r12 = r10 & 127;
        r10 = r11 >> 3;
        r15 = (r11 & 7) << 3;
        r22 = r1;
        r23 = r2;
        r1 = (r0[r10] & (~(255 << r15))) | (r12 << r15);
        r0[r10] = r1;
        r0[(((r11 - 7) & r6) + (r6 & 7)) >> 3] = r1;
        r4[r11] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x026c, code lost:
    
        r7 = r7 + 1;
        r1 = r22;
        r2 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0268, code lost:
    
        r22 = r1;
        r23 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x00c5, code lost:
    
        r34 = r2;
        r36 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0278, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0341, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0343, code lost:
    
        r12 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0662 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x04dd  */
    /* JADX WARN: Type inference failed for: r1v20, types: [U.k] */
    /* JADX WARN: Type inference failed for: r1v21, types: [U.k] */
    /* JADX WARN: Type inference failed for: r1v45, types: [U.k] */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r2v37, types: [U.k] */
    /* JADX WARN: Type inference failed for: r2v38, types: [U.k] */
    /* JADX WARN: Type inference failed for: r2v44, types: [U.k] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [U.k] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [U.k] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35, types: [U.k] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37, types: [U.k] */
    /* JADX WARN: Type inference failed for: r7v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(KeyEvent keyEvent, Y1.a aVar) {
        a aVar2;
        int i3;
        q g3;
        U.k kVar;
        AbstractC0905m abstractC0905m;
        U.k kVar2;
        C0120t c0120t;
        AbstractC0905m abstractC0905m2;
        C0120t c0120t2;
        KeyEvent keyEvent2;
        int size;
        C0120t c0120t3;
        long j3;
        int i4;
        if (this.f3709e.a()) {
            throw new IllegalStateException("Dispatching key event while focus system is invalidated.");
        }
        long d3 = AbstractC0416e.d(keyEvent.getKeyCode());
        int R2 = i.R(keyEvent);
        int i5 = 3;
        if (AbstractC0382a.i(R2, 2)) {
            C0501s c0501s = this.f3712h;
            if (c0501s == null) {
                c0501s = new C0501s(3);
                this.f3712h = c0501s;
            }
            C0501s c0501s2 = c0501s;
            int hashCode = Long.hashCode(d3) * (-862048943);
            int i6 = hashCode ^ (hashCode << 16);
            int i7 = i6 >>> 7;
            int i8 = i6 & 127;
            int i9 = c0501s2.f5203c;
            int i10 = i7 & i9;
            int i11 = 0;
            loop0: while (true) {
                long[] jArr = c0501s2.f5201a;
                int i12 = i10 >> 3;
                int i13 = (i10 & 7) << 3;
                long j4 = (jArr[i12] >>> i13) | ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63));
                long j5 = i8;
                int i14 = i9;
                long j6 = j4 ^ (j5 * 72340172838076673L);
                long j7 = (j6 - 72340172838076673L) & (~j6) & (-9187201950435737472L);
                while (true) {
                    if (j7 == 0) {
                        break;
                    }
                    i4 = (i10 + (Long.numberOfTrailingZeros(j7) >> 3)) & i14;
                    if (c0501s2.f5202b[i4] == d3) {
                        j3 = d3;
                        break loop0;
                    }
                    j7 &= j7 - 1;
                }
                i11 += 8;
                i10 = (i10 + i11) & i14;
                i9 = i14;
                i5 = 3;
            }
            c0501s2.f5202b[i4] = j3;
        } else if (AbstractC0382a.i(R2, 1)) {
            aVar2 = this;
            C0501s c0501s3 = aVar2.f3712h;
            if (c0501s3 == null || !c0501s3.a(d3)) {
                return false;
            }
            C0501s c0501s4 = aVar2.f3712h;
            if (c0501s4 != null) {
                int hashCode2 = Long.hashCode(d3) * (-862048943);
                int i15 = hashCode2 ^ (hashCode2 << 16);
                int i16 = i15 & 127;
                int i17 = c0501s4.f5203c;
                int i18 = (i15 >>> 7) & i17;
                int i19 = 0;
                loop23: while (true) {
                    long[] jArr2 = c0501s4.f5201a;
                    int i20 = i18 >> 3;
                    int i21 = (i18 & 7) << 3;
                    long j8 = ((jArr2[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr2[i20] >>> i21);
                    long j9 = (i16 * 72340172838076673L) ^ j8;
                    long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
                    while (true) {
                        if (j10 == 0) {
                            break;
                        }
                        i3 = ((Long.numberOfTrailingZeros(j10) >> 3) + i18) & i17;
                        if (c0501s4.f5202b[i3] == d3) {
                            break loop23;
                        }
                        j10 &= j10 - 1;
                    }
                    i19 += 8;
                    i18 = (i18 + i19) & i17;
                }
                if (i3 >= 0) {
                    c0501s4.f5204d--;
                    long[] jArr3 = c0501s4.f5201a;
                    int i22 = c0501s4.f5203c;
                    int i23 = i3 >> 3;
                    int i24 = (i3 & 7) << 3;
                    long j11 = (jArr3[i23] & (~(255 << i24))) | (254 << i24);
                    jArr3[i23] = j11;
                    jArr3[(((i3 - 7) & i22) + (i22 & 7)) >> 3] = j11;
                }
            }
            q qVar = aVar2.f3708d;
            g3 = c.g(qVar);
            if (g3 != null) {
                U.k kVar3 = g3.f3303d;
                if (!kVar3.p) {
                    AbstractC0381e.N("visitLocalDescendants called on an unattached node");
                    throw null;
                }
                if ((kVar3.f3306g & 9216) != 0) {
                    kVar2 = null;
                    for (U.k kVar4 = kVar3.f3308i; kVar4 != null; kVar4 = kVar4.f3308i) {
                        int i25 = kVar4.f3305f;
                        if ((i25 & 9216) != 0) {
                            if ((i25 & 1024) != 0) {
                                break;
                            }
                            kVar2 = kVar4;
                        }
                    }
                } else {
                    kVar2 = null;
                }
            }
            if (g3 != null) {
                U.k kVar5 = g3.f3303d;
                if (!kVar5.p) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                D t3 = AbstractC0898f.t(g3);
                loop13: while (true) {
                    if (t3 == null) {
                        abstractC0905m2 = 0;
                        break;
                    }
                    if ((((U.k) t3.f7735x.f2356f).f3306g & 8192) != 0) {
                        while (kVar5 != null) {
                            if ((kVar5.f3305f & 8192) != 0) {
                                K.d dVar = null;
                                abstractC0905m2 = kVar5;
                                while (abstractC0905m2 != 0) {
                                    if (abstractC0905m2 instanceof InterfaceC0573c) {
                                        break loop13;
                                    }
                                    if ((abstractC0905m2.f3305f & 8192) != 0 && (abstractC0905m2 instanceof AbstractC0905m)) {
                                        K.d dVar2 = dVar;
                                        U.k kVar6 = abstractC0905m2;
                                        int i26 = 0;
                                        for (U.k kVar7 = abstractC0905m2.f7937r; kVar7 != null; kVar7 = kVar7.f3308i) {
                                            if ((kVar7.f3305f & 8192) != 0) {
                                                i26++;
                                                if (i26 == 1) {
                                                    kVar6 = kVar7;
                                                } else {
                                                    if (dVar2 == null) {
                                                        dVar2 = new K.d(new U.k[16]);
                                                    }
                                                    if (kVar6 != null) {
                                                        dVar2.b(kVar6);
                                                        kVar6 = null;
                                                    }
                                                    dVar2.b(kVar7);
                                                }
                                            }
                                        }
                                        if (i26 == 1) {
                                            abstractC0905m2 = kVar6;
                                            dVar = dVar2;
                                        } else {
                                            dVar = dVar2;
                                        }
                                    }
                                    abstractC0905m2 = AbstractC0898f.f(dVar);
                                }
                            }
                            kVar5 = kVar5.f3307h;
                        }
                    }
                    t3 = t3.q();
                    kVar5 = (t3 == null || (c0120t2 = t3.f7735x) == null) ? null : (o0) c0120t2.f2355e;
                }
                Object obj = (InterfaceC0573c) abstractC0905m2;
                if (obj != null) {
                    kVar2 = ((U.k) obj).f3303d;
                    if (kVar2 != null) {
                        return false;
                    }
                    U.k kVar8 = kVar2.f3303d;
                    if (!kVar8.p) {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                    U.k kVar9 = kVar8.f3307h;
                    D t4 = AbstractC0898f.t(kVar2);
                    ArrayList arrayList = null;
                    while (t4 != null) {
                        if ((((U.k) t4.f7735x.f2356f).f3306g & 8192) != 0) {
                            while (kVar9 != null) {
                                if ((kVar9.f3305f & 8192) != 0) {
                                    U.k kVar10 = kVar9;
                                    K.d dVar3 = null;
                                    while (kVar10 != null) {
                                        if (kVar10 instanceof InterfaceC0573c) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(kVar10);
                                        } else if ((kVar10.f3305f & 8192) != 0 && (kVar10 instanceof AbstractC0905m)) {
                                            K.d dVar4 = dVar3;
                                            U.k kVar11 = kVar10;
                                            int i27 = 0;
                                            for (U.k kVar12 = ((AbstractC0905m) kVar10).f7937r; kVar12 != null; kVar12 = kVar12.f3308i) {
                                                if ((kVar12.f3305f & 8192) != 0) {
                                                    i27++;
                                                    if (i27 == 1) {
                                                        kVar11 = kVar12;
                                                    } else {
                                                        if (dVar4 == null) {
                                                            dVar4 = new K.d(new U.k[16]);
                                                        }
                                                        if (kVar11 != null) {
                                                            dVar4.b(kVar11);
                                                            kVar11 = null;
                                                        }
                                                        dVar4.b(kVar12);
                                                    }
                                                }
                                            }
                                            if (i27 == 1) {
                                                kVar10 = kVar11;
                                                dVar3 = dVar4;
                                            } else {
                                                dVar3 = dVar4;
                                            }
                                        }
                                        kVar10 = AbstractC0898f.f(dVar3);
                                    }
                                }
                                kVar9 = kVar9.f3307h;
                            }
                        }
                        t4 = t4.q();
                        kVar9 = (t4 == null || (c0120t3 = t4.f7735x) == null) ? null : (o0) c0120t3.f2355e;
                    }
                    if (arrayList == null || arrayList.size() - 1 < 0) {
                        keyEvent2 = keyEvent;
                    } else {
                        while (true) {
                            int i28 = size - 1;
                            keyEvent2 = keyEvent;
                            if (((InterfaceC0573c) arrayList.get(size)).n(keyEvent2)) {
                                return true;
                            }
                            if (i28 < 0) {
                                break;
                            }
                            size = i28;
                        }
                    }
                    AbstractC0905m abstractC0905m3 = kVar2.f3303d;
                    K.d dVar5 = null;
                    while (abstractC0905m3 != 0) {
                        if (abstractC0905m3 instanceof InterfaceC0573c) {
                            if (((InterfaceC0573c) abstractC0905m3).n(keyEvent2)) {
                                return true;
                            }
                        } else if ((abstractC0905m3.f3305f & 8192) != 0 && (abstractC0905m3 instanceof AbstractC0905m)) {
                            K.d dVar6 = dVar5;
                            U.k kVar13 = abstractC0905m3;
                            int i29 = 0;
                            for (U.k kVar14 = abstractC0905m3.f7937r; kVar14 != null; kVar14 = kVar14.f3308i) {
                                if ((kVar14.f3305f & 8192) != 0) {
                                    i29++;
                                    if (i29 == 1) {
                                        kVar13 = kVar14;
                                    } else {
                                        if (dVar6 == null) {
                                            dVar6 = new K.d(new U.k[16]);
                                        }
                                        if (kVar13 != null) {
                                            dVar6.b(kVar13);
                                            kVar13 = null;
                                        }
                                        dVar6.b(kVar14);
                                    }
                                }
                            }
                            if (i29 == 1) {
                                abstractC0905m3 = kVar13;
                                dVar5 = dVar6;
                            } else {
                                dVar5 = dVar6;
                            }
                        }
                        abstractC0905m3 = AbstractC0898f.f(dVar5);
                    }
                    if (((Boolean) aVar.b()).booleanValue()) {
                        return true;
                    }
                    boolean z3 = true;
                    AbstractC0905m abstractC0905m4 = kVar2.f3303d;
                    K.d dVar7 = null;
                    while (abstractC0905m4 != 0) {
                        if (abstractC0905m4 instanceof InterfaceC0573c) {
                            if (((InterfaceC0573c) abstractC0905m4).r(keyEvent2)) {
                                return z3;
                            }
                        } else if ((abstractC0905m4.f3305f & 8192) != 0 && (abstractC0905m4 instanceof AbstractC0905m)) {
                            K.d dVar8 = dVar7;
                            U.k kVar15 = abstractC0905m4;
                            int i30 = 0;
                            for (U.k kVar16 = abstractC0905m4.f7937r; kVar16 != null; kVar16 = kVar16.f3308i) {
                                if ((kVar16.f3305f & 8192) != 0) {
                                    i30++;
                                    if (i30 == 1) {
                                        kVar15 = kVar16;
                                    } else {
                                        if (dVar8 == null) {
                                            dVar8 = new K.d(new U.k[16]);
                                        }
                                        if (kVar15 != null) {
                                            dVar8.b(kVar15);
                                            kVar15 = null;
                                        }
                                        dVar8.b(kVar16);
                                    }
                                }
                            }
                            z3 = true;
                            if (i30 == 1) {
                                abstractC0905m4 = kVar15;
                                dVar7 = dVar8;
                            } else {
                                dVar7 = dVar8;
                            }
                        }
                        abstractC0905m4 = AbstractC0898f.f(dVar7);
                        z3 = true;
                    }
                    if (arrayList == null) {
                        return false;
                    }
                    int size2 = arrayList.size();
                    for (int i31 = 0; i31 < size2; i31++) {
                        if (((InterfaceC0573c) arrayList.get(i31)).r(keyEvent2)) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            kVar = qVar.f3303d;
            if (kVar.p) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            U.k kVar17 = kVar.f3307h;
            D t5 = AbstractC0898f.t(qVar);
            loop17: while (true) {
                if (t5 == null) {
                    abstractC0905m = 0;
                    break;
                }
                if ((((U.k) t5.f7735x.f2356f).f3306g & 8192) != 0) {
                    while (kVar17 != null) {
                        if ((kVar17.f3305f & 8192) != 0) {
                            abstractC0905m = kVar17;
                            K.d dVar9 = null;
                            while (abstractC0905m != 0) {
                                if (abstractC0905m instanceof InterfaceC0573c) {
                                    break loop17;
                                }
                                if ((abstractC0905m.f3305f & 8192) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                                    K.d dVar10 = dVar9;
                                    U.k kVar18 = abstractC0905m;
                                    int i32 = 0;
                                    for (U.k kVar19 = abstractC0905m.f7937r; kVar19 != null; kVar19 = kVar19.f3308i) {
                                        if ((kVar19.f3305f & 8192) != 0) {
                                            i32++;
                                            if (i32 == 1) {
                                                kVar18 = kVar19;
                                            } else {
                                                if (dVar10 == null) {
                                                    dVar10 = new K.d(new U.k[16]);
                                                }
                                                if (kVar18 != null) {
                                                    dVar10.b(kVar18);
                                                    kVar18 = null;
                                                }
                                                dVar10.b(kVar19);
                                            }
                                        }
                                    }
                                    if (i32 == 1) {
                                        abstractC0905m = kVar18;
                                        dVar9 = dVar10;
                                    } else {
                                        dVar9 = dVar10;
                                    }
                                }
                                abstractC0905m = AbstractC0898f.f(dVar9);
                            }
                        }
                        kVar17 = kVar17.f3307h;
                    }
                }
                t5 = t5.q();
                kVar17 = (t5 == null || (c0120t = t5.f7735x) == null) ? null : (o0) c0120t.f2355e;
            }
            Object obj2 = (InterfaceC0573c) abstractC0905m;
            kVar2 = obj2 != null ? ((U.k) obj2).f3303d : null;
            if (kVar2 != null) {
            }
        }
        aVar2 = this;
        q qVar2 = aVar2.f3708d;
        g3 = c.g(qVar2);
        if (g3 != null) {
        }
        if (g3 != null) {
        }
        kVar = qVar2.f3303d;
        if (kVar.p) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x00fe, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean c(int i3, a0.d dVar, Y1.c cVar) {
        C0120t c0120t;
        boolean a3;
        n nVar;
        n nVar2;
        boolean z3;
        q qVar = this.f3708d;
        q g3 = c.g(qVar);
        C0988o c0988o = this.f3707c;
        int i4 = 4;
        q qVar2 = null;
        if (g3 != null) {
            j jVar = (j) c0988o.get();
            Z.j v0 = g3.v0();
            if (Z.a.a(i3, 1)) {
                nVar = v0.f3432b;
            } else if (Z.a.a(i3, 2)) {
                nVar = v0.f3433c;
            } else if (Z.a.a(i3, 5)) {
                nVar = v0.f3434d;
            } else if (Z.a.a(i3, 6)) {
                nVar = v0.f3435e;
            } else if (Z.a.a(i3, 3)) {
                int ordinal = jVar.ordinal();
                if (ordinal == 0) {
                    nVar2 = v0.f3438h;
                } else {
                    if (ordinal != 1) {
                        throw new L1.f();
                    }
                    nVar2 = v0.f3439i;
                }
                if (nVar2 == n.f3443b) {
                    nVar2 = null;
                }
                if (nVar2 == null) {
                    nVar = v0.f3436f;
                }
                nVar = nVar2;
            } else if (Z.a.a(i3, 4)) {
                int ordinal2 = jVar.ordinal();
                if (ordinal2 == 0) {
                    nVar2 = v0.f3439i;
                } else {
                    if (ordinal2 != 1) {
                        throw new L1.f();
                    }
                    nVar2 = v0.f3438h;
                }
                if (nVar2 == n.f3443b) {
                    nVar2 = null;
                }
                if (nVar2 == null) {
                    nVar = v0.f3437g;
                }
                nVar = nVar2;
            } else if (Z.a.a(i3, 7)) {
                v0.f3440j.getClass();
                nVar = n.f3443b;
            } else {
                if (!Z.a.a(i3, 8)) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                v0.f3441k.getClass();
                nVar = n.f3443b;
            }
            n nVar3 = n.f3444c;
            if (Z1.i.a(nVar, nVar3)) {
                return null;
            }
            n nVar4 = n.f3443b;
            if (!Z1.i.a(nVar, nVar4)) {
                nVar.getClass();
                if (nVar == nVar4) {
                    throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                }
                if (nVar == nVar3) {
                    throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                }
                K.d dVar2 = nVar.f3445a;
                if (!dVar2.m()) {
                    throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                }
                int i5 = dVar2.f2642f;
                if (i5 > 0) {
                    Object[] objArr = dVar2.f2640d;
                    int i6 = 0;
                    boolean z4 = false;
                    do {
                        U.k kVar = ((U.k) ((o) objArr[i6])).f3303d;
                        if (!kVar.p) {
                            throw new IllegalStateException("visitChildren called on an unattached node");
                        }
                        K.d dVar3 = new K.d(new U.k[16]);
                        U.k kVar2 = kVar.f3308i;
                        if (kVar2 == null) {
                            AbstractC0898f.b(dVar3, kVar);
                        } else {
                            dVar3.b(kVar2);
                        }
                        while (true) {
                            if (!dVar3.m()) {
                                break;
                            }
                            U.k kVar3 = (U.k) dVar3.o(dVar3.f2642f - 1);
                            if ((kVar3.f3306g & 1024) == 0) {
                                AbstractC0898f.b(dVar3, kVar3);
                            } else {
                                while (true) {
                                    if (kVar3 == null) {
                                        break;
                                    }
                                    if ((kVar3.f3305f & 1024) != 0) {
                                        K.d dVar4 = null;
                                        while (kVar3 != null) {
                                            if (kVar3 instanceof q) {
                                                q qVar3 = (q) kVar3;
                                                if (qVar3.v0().f3431a ? ((Boolean) cVar.j(qVar3)).booleanValue() : c.i(qVar3, 7, cVar)) {
                                                    z4 = true;
                                                    break;
                                                }
                                            } else if (((kVar3.f3305f & 1024) != 0) && (kVar3 instanceof AbstractC0905m)) {
                                                int i7 = 0;
                                                for (U.k kVar4 = ((AbstractC0905m) kVar3).f7937r; kVar4 != null; kVar4 = kVar4.f3308i) {
                                                    if ((kVar4.f3305f & 1024) != 0) {
                                                        i7++;
                                                        if (i7 == 1) {
                                                            kVar3 = kVar4;
                                                        } else {
                                                            if (dVar4 == null) {
                                                                dVar4 = new K.d(new U.k[16]);
                                                            }
                                                            if (kVar3 != null) {
                                                                dVar4.b(kVar3);
                                                                kVar3 = null;
                                                            }
                                                            dVar4.b(kVar4);
                                                        }
                                                    }
                                                }
                                                if (i7 == 1) {
                                                }
                                            }
                                            kVar3 = AbstractC0898f.f(dVar4);
                                        }
                                    } else {
                                        kVar3 = kVar3.f3308i;
                                    }
                                }
                            }
                        }
                        i6++;
                    } while (i6 < i5);
                    z3 = z4;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            }
        } else {
            g3 = null;
        }
        j jVar2 = (j) c0988o.get();
        h hVar = new h(g3, this, cVar);
        if (Z.a.a(i3, 1) ? true : Z.a.a(i3, 2)) {
            if (Z.a.a(i3, 1)) {
                a3 = c.k(qVar, hVar);
            } else {
                if (!Z.a.a(i3, 2)) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                a3 = c.a(qVar, hVar);
            }
            return Boolean.valueOf(a3);
        }
        if (Z.a.a(i3, 3) ? true : Z.a.a(i3, 4) ? true : Z.a.a(i3, 5) ? true : Z.a.a(i3, 6)) {
            return c.K(i3, hVar, qVar, dVar);
        }
        if (Z.a.a(i3, 7)) {
            int ordinal3 = jVar2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    throw new L1.f();
                }
                i4 = 3;
            }
            q g4 = c.g(qVar);
            if (g4 != null) {
                return c.K(i4, hVar, g4, dVar);
            }
            return null;
        }
        if (!Z.a.a(i3, 8)) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) Z.a.b(i3))).toString());
        }
        q g5 = c.g(qVar);
        if (g5 != null) {
            U.k kVar5 = g5.f3303d;
            if (!kVar5.p) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            U.k kVar6 = kVar5.f3307h;
            D t3 = AbstractC0898f.t(g5);
            loop5: while (true) {
                if (t3 == null) {
                    break;
                }
                if ((((U.k) t3.f7735x.f2356f).f3306g & 1024) != 0) {
                    while (kVar6 != null) {
                        if ((kVar6.f3305f & 1024) != 0) {
                            U.k kVar7 = kVar6;
                            K.d dVar5 = null;
                            while (kVar7 != null) {
                                if (kVar7 instanceof q) {
                                    q qVar4 = (q) kVar7;
                                    if (qVar4.v0().f3431a) {
                                        qVar2 = qVar4;
                                        break loop5;
                                    }
                                } else if ((kVar7.f3305f & 1024) != 0 && (kVar7 instanceof AbstractC0905m)) {
                                    int i8 = 0;
                                    for (U.k kVar8 = ((AbstractC0905m) kVar7).f7937r; kVar8 != null; kVar8 = kVar8.f3308i) {
                                        if ((kVar8.f3305f & 1024) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                kVar7 = kVar8;
                                            } else {
                                                if (dVar5 == null) {
                                                    dVar5 = new K.d(new U.k[16]);
                                                }
                                                if (kVar7 != null) {
                                                    dVar5.b(kVar7);
                                                    kVar7 = null;
                                                }
                                                dVar5.b(kVar8);
                                            }
                                        }
                                    }
                                    if (i8 != 1) {
                                        kVar7 = AbstractC0898f.f(dVar5);
                                    }
                                }
                                kVar7 = AbstractC0898f.f(dVar5);
                            }
                        }
                        kVar6 = kVar6.f3307h;
                    }
                }
                t3 = t3.q();
                kVar6 = (t3 == null || (c0120t = t3.f7735x) == null) ? null : (o0) c0120t.f2355e;
            }
        }
        q qVar5 = qVar2;
        return Boolean.valueOf((qVar5 == null || qVar5.equals(qVar)) ? false : ((Boolean) hVar.j(qVar5)).booleanValue());
    }
}
