package androidx.compose.ui.focus;

import B.U;
import E2.d;
import G.o;
import I.C0174t;
import O0.k;
import S.s;
import U.p;
import U.q;
import Z.e;
import Z.f;
import Z.g;
import Z.h;
import Z.l;
import Z.m;
import Z.t;
import a0.C0239d;
import android.view.KeyEvent;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import f2.j;
import f2.u;
import h2.AbstractC0508a;
import j.C0545s;
import java.util.ArrayList;
import l0.c;
import m.AbstractC0625j;
import n.z0;
import q2.a0;
import t0.AbstractC0993f;
import t0.AbstractC1000m;
import t0.E;
import t0.p0;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final d f4899a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f4900b;

    /* renamed from: c, reason: collision with root package name */
    public final e f4901c;

    /* renamed from: d, reason: collision with root package name */
    public final e f4902d;

    /* renamed from: e, reason: collision with root package name */
    public final o f4903e;

    /* renamed from: g, reason: collision with root package name */
    public final f f4905g;

    /* renamed from: j, reason: collision with root package name */
    public C0545s f4908j;

    /* renamed from: f, reason: collision with root package name */
    public final t f4904f = new t();

    /* renamed from: h, reason: collision with root package name */
    public final U f4906h = new U();

    /* renamed from: i, reason: collision with root package name */
    public final q f4907i = new FocusPropertiesElement(new m()).i(new t0.U() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return b.this.f4904f.hashCode();
        }

        @Override // t0.U
        public final p l() {
            return b.this.f4904f;
        }

        @Override // t0.U
        public final /* bridge */ /* synthetic */ void m(p pVar) {
        }
    });

    public b(a0 a0Var, d dVar, a0 a0Var2, e eVar, e eVar2, o oVar) {
        this.f4899a = dVar;
        this.f4900b = a0Var2;
        this.f4901c = eVar;
        this.f4902d = eVar2;
        this.f4903e = oVar;
        this.f4905g = new f(a0Var, new e(0, this, b.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0, 1));
    }

    public final boolean a(int i3, boolean z3, boolean z4) {
        boolean e3;
        int b3;
        U u3 = this.f4906h;
        g gVar = g.f4676g;
        try {
            if (u3.f318b) {
                U.a(u3);
            }
            u3.f318b = true;
            ((K.d) u3.f320d).b(gVar);
            t tVar = this.f4904f;
            if (!z3 && ((b3 = AbstractC0625j.b(Z.d.u(tVar, i3))) == 1 || b3 == 2 || b3 == 3)) {
                e3 = false;
                if (e3 && z4) {
                    this.f4901c.b();
                }
                return e3;
            }
            e3 = Z.d.e(tVar, z3, true);
            if (e3) {
                this.f4901c.b();
            }
            return e3;
        } finally {
            U.b(u3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x03ac, code lost:
    
        if (r7 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x00a3, code lost:
    
        if (((((~r10) << 6) & r10) & (-9187201950435737472L)) == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x00a5, code lost:
    
        r4 = r5.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x00ab, code lost:
    
        if (r5.f6323e != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x00bf, code lost:
    
        if (((r5.f6319a[r4 >> 3] >> ((r4 & 7) << r7)) & 255) != 254) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x00c7, code lost:
    
        r4 = r5.f6321c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x00cb, code lost:
    
        if (r4 <= 8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x00e3, code lost:
    
        if (java.lang.Long.compare((r5.f6322d * 32) ^ Long.MIN_VALUE, (r4 * 25) ^ Long.MIN_VALUE) > 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x00e5, code lost:
    
        r4 = r5.f6319a;
        r8 = r5.f6321c;
        r9 = r5.f6320b;
        j.AbstractC0522D.a(r4, r8);
        r10 = 0;
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x00f0, code lost:
    
        if (r10 == r8) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x00f2, code lost:
    
        r15 = r10 >> 3;
        r24 = (r10 & 7) << 3;
        r22 = (r4[r15] >> r24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0104, code lost:
    
        if (r22 != 128) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0112, code lost:
    
        if (r22 == 254) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0117, code lost:
    
        r14 = java.lang.Long.hashCode(r9[r10]) * (-862048943);
        r14 = (r14 ^ (r14 << 16)) >>> 7;
        r23 = r5.b(r14);
        r14 = r14 & r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x013c, code lost:
    
        if ((((r23 - r14) & r8) / 8) != (((r10 - r14) & r8) / 8)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x013e, code lost:
    
        r4[r15] = ((r22 & 127) << r24) | (r4[r15] & (~(255 << r24)));
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r10 = r10 + 1;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0167, code lost:
    
        r34 = r2;
        r0 = r23 >> 3;
        r1 = r4[r0];
        r3 = (r23 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x017b, code lost:
    
        if (((r1 >> r3) & 255) != 128) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x017d, code lost:
    
        r36 = r12;
        r4[r0] = (r1 & (~(255 << r3))) | ((r22 & 127) << r3);
        r4[r15] = (r4[r15] & (~(255 << r24))) | (128 << r24);
        r9[r23] = r9[r10];
        r9[r10] = 0;
        r38 = r6;
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x01cd, code lost:
    
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r10 = r10 + 1;
        r2 = r34;
        r12 = r36;
        r6 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x01a4, code lost:
    
        r36 = r12;
        r38 = r6;
        r4[r0] = (r1 & (~(255 << r3))) | ((r22 & 127) << r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x01b7, code lost:
    
        if (r11 != (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x01b9, code lost:
    
        r11 = j.AbstractC0522D.b(r4, r10 + 1, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x01bf, code lost:
    
        r9[r11] = r9[r23];
        r9[r23] = r9[r10];
        r9[r10] = r9[r11];
        r10 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0114, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0106, code lost:
    
        r11 = r10;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x01e5, code lost:
    
        r34 = r2;
        r38 = r6;
        r36 = r12;
        r5.f6323e = j.AbstractC0522D.c(r5.f6321c) - r5.f6322d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x026f, code lost:
    
        r0 = r5.b(r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0275, code lost:
    
        r5.f6322d++;
        r1 = r5.f6323e;
        r2 = r5.f6319a;
        r3 = r0 >> 3;
        r6 = r2[r3];
        r4 = (r0 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0290, code lost:
    
        if (((r6 >> r4) & 255) != 128) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0292, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0295, code lost:
    
        r5.f6323e = r1 - r8;
        r1 = r5.f6321c;
        r6 = (r6 & (~(255 << r4))) | (r36 << r4);
        r2[r3] = r6;
        r2[(((r0 - 7) & r1) + (r1 & 7)) >> 3] = r6;
        r31 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0294, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x01fa, code lost:
    
        r34 = r2;
        r38 = r6;
        r36 = r12;
        r0 = j.AbstractC0522D.d(r5.f6321c);
        r1 = r5.f6319a;
        r2 = r5.f6320b;
        r3 = r5.f6321c;
        r5.c(r0);
        r0 = r5.f6319a;
        r4 = r5.f6320b;
        r6 = r5.f6321c;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0216, code lost:
    
        if (r7 >= r3) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0228, code lost:
    
        if (((r1[r7 >> 3] >> ((r7 & 7) << 3)) & 255) >= 128) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x022a, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0268, code lost:
    
        r7 = r7 + 1;
        r1 = r22;
        r2 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0264, code lost:
    
        r22 = r1;
        r23 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x00c1, code lost:
    
        r34 = r2;
        r36 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0274, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x033d, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x033f, code lost:
    
        r12 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x065e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x04d9  */
    /* JADX WARN: Type inference failed for: r1v20, types: [U.p] */
    /* JADX WARN: Type inference failed for: r1v21, types: [U.p] */
    /* JADX WARN: Type inference failed for: r1v45, types: [U.p] */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r2v36, types: [U.p] */
    /* JADX WARN: Type inference failed for: r2v37, types: [U.p] */
    /* JADX WARN: Type inference failed for: r2v43, types: [U.p] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [U.p] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [U.p] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35, types: [U.p] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37, types: [U.p] */
    /* JADX WARN: Type inference failed for: r7v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(KeyEvent keyEvent, InterfaceC0422a interfaceC0422a) {
        b bVar;
        int i3;
        t g3;
        p pVar;
        AbstractC1000m abstractC1000m;
        p pVar2;
        C0174t c0174t;
        AbstractC1000m abstractC1000m2;
        C0174t c0174t2;
        KeyEvent keyEvent2;
        int size;
        C0174t c0174t3;
        long j3;
        int i4;
        if (this.f4905g.a()) {
            throw new IllegalStateException("Dispatching key event while focus system is invalidated.");
        }
        long y3 = c.y(keyEvent);
        int z3 = c.z(keyEvent);
        int i5 = 3;
        if (AbstractC0508a.y(z3, 2)) {
            C0545s c0545s = this.f4908j;
            if (c0545s == null) {
                c0545s = new C0545s(3);
                this.f4908j = c0545s;
            }
            C0545s c0545s2 = c0545s;
            int hashCode = Long.hashCode(y3) * (-862048943);
            int i6 = hashCode ^ (hashCode << 16);
            int i7 = i6 >>> 7;
            int i8 = i6 & 127;
            int i9 = c0545s2.f6321c;
            int i10 = i7 & i9;
            int i11 = 0;
            loop0: while (true) {
                long[] jArr = c0545s2.f6319a;
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
                    if (c0545s2.f6320b[i4] == y3) {
                        j3 = y3;
                        break loop0;
                    }
                    j7 &= j7 - 1;
                }
                i11 += 8;
                i10 = (i10 + i11) & i14;
                i9 = i14;
                i5 = 3;
            }
            c0545s2.f6320b[i4] = j3;
        } else if (AbstractC0508a.y(z3, 1)) {
            bVar = this;
            C0545s c0545s3 = bVar.f4908j;
            if (c0545s3 == null || !c0545s3.a(y3)) {
                return false;
            }
            C0545s c0545s4 = bVar.f4908j;
            if (c0545s4 != null) {
                int hashCode2 = Long.hashCode(y3) * (-862048943);
                int i15 = hashCode2 ^ (hashCode2 << 16);
                int i16 = i15 & 127;
                int i17 = c0545s4.f6321c;
                int i18 = (i15 >>> 7) & i17;
                int i19 = 0;
                loop23: while (true) {
                    long[] jArr2 = c0545s4.f6319a;
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
                        if (c0545s4.f6320b[i3] == y3) {
                            break loop23;
                        }
                        j10 &= j10 - 1;
                    }
                    i19 += 8;
                    i18 = (i18 + i19) & i17;
                }
                if (i3 >= 0) {
                    c0545s4.f6322d--;
                    long[] jArr3 = c0545s4.f6319a;
                    int i22 = c0545s4.f6321c;
                    int i23 = i3 >> 3;
                    int i24 = (i3 & 7) << 3;
                    long j11 = (jArr3[i23] & (~(255 << i24))) | (254 << i24);
                    jArr3[i23] = j11;
                    jArr3[(((i3 - 7) & i22) + (i22 & 7)) >> 3] = j11;
                }
            }
            t tVar = bVar.f4904f;
            g3 = Z.d.g(tVar);
            if (g3 != null) {
                p pVar3 = g3.f4489d;
                if (!pVar3.f4501p) {
                    z0.o("visitLocalDescendants called on an unattached node");
                    throw null;
                }
                if ((pVar3.f4492g & 9216) != 0) {
                    pVar2 = null;
                    for (p pVar4 = pVar3.f4494i; pVar4 != null; pVar4 = pVar4.f4494i) {
                        int i25 = pVar4.f4491f;
                        if ((i25 & 9216) != 0) {
                            if ((i25 & 1024) != 0) {
                                break;
                            }
                            pVar2 = pVar4;
                        }
                    }
                } else {
                    pVar2 = null;
                }
            }
            if (g3 != null) {
                p pVar5 = g3.f4489d;
                if (!pVar5.f4501p) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                E t3 = AbstractC0993f.t(g3);
                loop13: while (true) {
                    if (t3 == null) {
                        abstractC1000m2 = 0;
                        break;
                    }
                    if ((((p) t3.f8561y.f2915f).f4492g & 8192) != 0) {
                        while (pVar5 != null) {
                            if ((pVar5.f4491f & 8192) != 0) {
                                K.d dVar = null;
                                abstractC1000m2 = pVar5;
                                while (abstractC1000m2 != 0) {
                                    if (abstractC1000m2 instanceof l0.d) {
                                        break loop13;
                                    }
                                    if ((abstractC1000m2.f4491f & 8192) != 0 && (abstractC1000m2 instanceof AbstractC1000m)) {
                                        K.d dVar2 = dVar;
                                        p pVar6 = abstractC1000m2;
                                        int i26 = 0;
                                        for (p pVar7 = abstractC1000m2.f8771r; pVar7 != null; pVar7 = pVar7.f4494i) {
                                            if ((pVar7.f4491f & 8192) != 0) {
                                                i26++;
                                                if (i26 == 1) {
                                                    pVar6 = pVar7;
                                                } else {
                                                    if (dVar2 == null) {
                                                        dVar2 = new K.d(new p[16]);
                                                    }
                                                    if (pVar6 != null) {
                                                        dVar2.b(pVar6);
                                                        pVar6 = null;
                                                    }
                                                    dVar2.b(pVar7);
                                                }
                                            }
                                        }
                                        if (i26 == 1) {
                                            abstractC1000m2 = pVar6;
                                            dVar = dVar2;
                                        } else {
                                            dVar = dVar2;
                                        }
                                    }
                                    abstractC1000m2 = AbstractC0993f.f(dVar);
                                }
                            }
                            pVar5 = pVar5.f4493h;
                        }
                    }
                    t3 = t3.s();
                    pVar5 = (t3 == null || (c0174t2 = t3.f8561y) == null) ? null : (p0) c0174t2.f2914e;
                }
                Object obj = (l0.d) abstractC1000m2;
                if (obj != null) {
                    pVar2 = ((p) obj).f4489d;
                    if (pVar2 != null) {
                        return false;
                    }
                    p pVar8 = pVar2.f4489d;
                    if (!pVar8.f4501p) {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                    p pVar9 = pVar8.f4493h;
                    E t4 = AbstractC0993f.t(pVar2);
                    ArrayList arrayList = null;
                    while (t4 != null) {
                        if ((((p) t4.f8561y.f2915f).f4492g & 8192) != 0) {
                            while (pVar9 != null) {
                                if ((pVar9.f4491f & 8192) != 0) {
                                    p pVar10 = pVar9;
                                    K.d dVar3 = null;
                                    while (pVar10 != null) {
                                        if (pVar10 instanceof l0.d) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(pVar10);
                                        } else if ((pVar10.f4491f & 8192) != 0 && (pVar10 instanceof AbstractC1000m)) {
                                            K.d dVar4 = dVar3;
                                            p pVar11 = pVar10;
                                            int i27 = 0;
                                            for (p pVar12 = ((AbstractC1000m) pVar10).f8771r; pVar12 != null; pVar12 = pVar12.f4494i) {
                                                if ((pVar12.f4491f & 8192) != 0) {
                                                    i27++;
                                                    if (i27 == 1) {
                                                        pVar11 = pVar12;
                                                    } else {
                                                        if (dVar4 == null) {
                                                            dVar4 = new K.d(new p[16]);
                                                        }
                                                        if (pVar11 != null) {
                                                            dVar4.b(pVar11);
                                                            pVar11 = null;
                                                        }
                                                        dVar4.b(pVar12);
                                                    }
                                                }
                                            }
                                            if (i27 == 1) {
                                                pVar10 = pVar11;
                                                dVar3 = dVar4;
                                            } else {
                                                dVar3 = dVar4;
                                            }
                                        }
                                        pVar10 = AbstractC0993f.f(dVar3);
                                    }
                                }
                                pVar9 = pVar9.f4493h;
                            }
                        }
                        t4 = t4.s();
                        pVar9 = (t4 == null || (c0174t3 = t4.f8561y) == null) ? null : (p0) c0174t3.f2914e;
                    }
                    if (arrayList == null || arrayList.size() - 1 < 0) {
                        keyEvent2 = keyEvent;
                    } else {
                        while (true) {
                            int i28 = size - 1;
                            keyEvent2 = keyEvent;
                            if (((l0.d) arrayList.get(size)).o(keyEvent2)) {
                                return true;
                            }
                            if (i28 < 0) {
                                break;
                            }
                            size = i28;
                        }
                    }
                    AbstractC1000m abstractC1000m3 = pVar2.f4489d;
                    K.d dVar5 = null;
                    while (abstractC1000m3 != 0) {
                        if (abstractC1000m3 instanceof l0.d) {
                            if (((l0.d) abstractC1000m3).o(keyEvent2)) {
                                return true;
                            }
                        } else if ((abstractC1000m3.f4491f & 8192) != 0 && (abstractC1000m3 instanceof AbstractC1000m)) {
                            K.d dVar6 = dVar5;
                            p pVar13 = abstractC1000m3;
                            int i29 = 0;
                            for (p pVar14 = abstractC1000m3.f8771r; pVar14 != null; pVar14 = pVar14.f4494i) {
                                if ((pVar14.f4491f & 8192) != 0) {
                                    i29++;
                                    if (i29 == 1) {
                                        pVar13 = pVar14;
                                    } else {
                                        if (dVar6 == null) {
                                            dVar6 = new K.d(new p[16]);
                                        }
                                        if (pVar13 != null) {
                                            dVar6.b(pVar13);
                                            pVar13 = null;
                                        }
                                        dVar6.b(pVar14);
                                    }
                                }
                            }
                            if (i29 == 1) {
                                abstractC1000m3 = pVar13;
                                dVar5 = dVar6;
                            } else {
                                dVar5 = dVar6;
                            }
                        }
                        abstractC1000m3 = AbstractC0993f.f(dVar5);
                    }
                    if (((Boolean) interfaceC0422a.b()).booleanValue()) {
                        return true;
                    }
                    boolean z4 = true;
                    AbstractC1000m abstractC1000m4 = pVar2.f4489d;
                    K.d dVar7 = null;
                    while (abstractC1000m4 != 0) {
                        if (abstractC1000m4 instanceof l0.d) {
                            if (((l0.d) abstractC1000m4).t(keyEvent2)) {
                                return z4;
                            }
                        } else if ((abstractC1000m4.f4491f & 8192) != 0 && (abstractC1000m4 instanceof AbstractC1000m)) {
                            K.d dVar8 = dVar7;
                            p pVar15 = abstractC1000m4;
                            int i30 = 0;
                            for (p pVar16 = abstractC1000m4.f8771r; pVar16 != null; pVar16 = pVar16.f4494i) {
                                if ((pVar16.f4491f & 8192) != 0) {
                                    i30++;
                                    if (i30 == 1) {
                                        pVar15 = pVar16;
                                    } else {
                                        if (dVar8 == null) {
                                            dVar8 = new K.d(new p[16]);
                                        }
                                        if (pVar15 != null) {
                                            dVar8.b(pVar15);
                                            pVar15 = null;
                                        }
                                        dVar8.b(pVar16);
                                    }
                                }
                            }
                            z4 = true;
                            if (i30 == 1) {
                                abstractC1000m4 = pVar15;
                                dVar7 = dVar8;
                            } else {
                                dVar7 = dVar8;
                            }
                        }
                        abstractC1000m4 = AbstractC0993f.f(dVar7);
                        z4 = true;
                    }
                    if (arrayList == null) {
                        return false;
                    }
                    int size2 = arrayList.size();
                    for (int i31 = 0; i31 < size2; i31++) {
                        if (((l0.d) arrayList.get(i31)).t(keyEvent2)) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            pVar = tVar.f4489d;
            if (pVar.f4501p) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            p pVar17 = pVar.f4493h;
            E t5 = AbstractC0993f.t(tVar);
            loop17: while (true) {
                if (t5 == null) {
                    abstractC1000m = 0;
                    break;
                }
                if ((((p) t5.f8561y.f2915f).f4492g & 8192) != 0) {
                    while (pVar17 != null) {
                        if ((pVar17.f4491f & 8192) != 0) {
                            abstractC1000m = pVar17;
                            K.d dVar9 = null;
                            while (abstractC1000m != 0) {
                                if (abstractC1000m instanceof l0.d) {
                                    break loop17;
                                }
                                if ((abstractC1000m.f4491f & 8192) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                                    K.d dVar10 = dVar9;
                                    p pVar18 = abstractC1000m;
                                    int i32 = 0;
                                    for (p pVar19 = abstractC1000m.f8771r; pVar19 != null; pVar19 = pVar19.f4494i) {
                                        if ((pVar19.f4491f & 8192) != 0) {
                                            i32++;
                                            if (i32 == 1) {
                                                pVar18 = pVar19;
                                            } else {
                                                if (dVar10 == null) {
                                                    dVar10 = new K.d(new p[16]);
                                                }
                                                if (pVar18 != null) {
                                                    dVar10.b(pVar18);
                                                    pVar18 = null;
                                                }
                                                dVar10.b(pVar19);
                                            }
                                        }
                                    }
                                    if (i32 == 1) {
                                        abstractC1000m = pVar18;
                                        dVar9 = dVar10;
                                    } else {
                                        dVar9 = dVar10;
                                    }
                                }
                                abstractC1000m = AbstractC0993f.f(dVar9);
                            }
                        }
                        pVar17 = pVar17.f4493h;
                    }
                }
                t5 = t5.s();
                pVar17 = (t5 == null || (c0174t = t5.f8561y) == null) ? null : (p0) c0174t.f2914e;
            }
            Object obj2 = (l0.d) abstractC1000m;
            pVar2 = obj2 != null ? ((p) obj2).f4489d : null;
            if (pVar2 != null) {
            }
        }
        bVar = this;
        t tVar2 = bVar.f4904f;
        g3 = Z.d.g(tVar2);
        if (g3 != null) {
        }
        if (g3 != null) {
        }
        pVar = tVar2.f4489d;
        if (pVar.f4501p) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [K.d] */
    public final Boolean c(int i3, C0239d c0239d, InterfaceC0424c interfaceC0424c) {
        t tVar;
        t tVar2;
        C0174t c0174t;
        boolean a3;
        Z.p pVar;
        Z.p pVar2;
        t tVar3 = this.f4904f;
        t g3 = Z.d.g(tVar3);
        o oVar = this.f4903e;
        int i4 = 4;
        if (g3 != null) {
            k kVar = (k) oVar.get();
            l y02 = g3.y0();
            if (Z.b.a(i3, 1)) {
                pVar = y02.f4687b;
            } else if (Z.b.a(i3, 2)) {
                pVar = y02.f4688c;
            } else if (Z.b.a(i3, 5)) {
                pVar = y02.f4689d;
            } else if (Z.b.a(i3, 6)) {
                pVar = y02.f4690e;
            } else if (Z.b.a(i3, 3)) {
                int ordinal = kVar.ordinal();
                if (ordinal == 0) {
                    pVar2 = y02.f4693h;
                } else {
                    if (ordinal != 1) {
                        throw new C1.c();
                    }
                    pVar2 = y02.f4694i;
                }
                if (pVar2 == Z.p.f4698b) {
                    pVar2 = null;
                }
                if (pVar2 == null) {
                    pVar = y02.f4691f;
                }
                pVar = pVar2;
            } else if (Z.b.a(i3, 4)) {
                int ordinal2 = kVar.ordinal();
                if (ordinal2 == 0) {
                    pVar2 = y02.f4694i;
                } else {
                    if (ordinal2 != 1) {
                        throw new C1.c();
                    }
                    pVar2 = y02.f4693h;
                }
                if (pVar2 == Z.p.f4698b) {
                    pVar2 = null;
                }
                if (pVar2 == null) {
                    pVar = y02.f4692g;
                }
                pVar = pVar2;
            } else if (Z.b.a(i3, 7)) {
                y02.f4695j.getClass();
                pVar = Z.p.f4698b;
            } else {
                if (!Z.b.a(i3, 8)) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                y02.f4696k.getClass();
                pVar = Z.p.f4698b;
            }
            if (j.a(pVar, Z.p.f4699c)) {
                return null;
            }
            tVar = null;
            if (!j.a(pVar, Z.p.f4698b)) {
                return Boolean.valueOf(pVar.a(interfaceC0424c));
            }
        } else {
            tVar = null;
            g3 = null;
        }
        k kVar2 = (k) oVar.get();
        R.h hVar = new R.h(g3, this, interfaceC0424c);
        if (Z.b.a(i3, 1) ? true : Z.b.a(i3, 2)) {
            if (Z.b.a(i3, 1)) {
                a3 = Z.d.k(tVar3, hVar);
            } else {
                if (!Z.b.a(i3, 2)) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                a3 = Z.d.a(tVar3, hVar);
            }
            return Boolean.valueOf(a3);
        }
        if (Z.b.a(i3, 3) ? true : Z.b.a(i3, 4) ? true : Z.b.a(i3, 5) ? true : Z.b.a(i3, 6)) {
            return Z.d.L(i3, hVar, tVar3, c0239d);
        }
        if (Z.b.a(i3, 7)) {
            int ordinal3 = kVar2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    throw new C1.c();
                }
                i4 = 3;
            }
            t g4 = Z.d.g(tVar3);
            return g4 != null ? Z.d.L(i4, hVar, g4, c0239d) : tVar;
        }
        if (!Z.b.a(i3, 8)) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) Z.b.b(i3))).toString());
        }
        t g5 = Z.d.g(tVar3);
        boolean z3 = false;
        if (g5 != null) {
            p pVar3 = g5.f4489d;
            if (!pVar3.f4501p) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            p pVar4 = pVar3.f4493h;
            E t3 = AbstractC0993f.t(g5);
            loop0: while (t3 != null) {
                if ((((p) t3.f8561y.f2915f).f4492g & 1024) != 0) {
                    while (pVar4 != null) {
                        if ((pVar4.f4491f & 1024) != 0) {
                            p pVar5 = pVar4;
                            ?? r6 = tVar;
                            while (pVar5 != null) {
                                if (pVar5 instanceof t) {
                                    t tVar4 = (t) pVar5;
                                    if (tVar4.y0().f4686a) {
                                        tVar2 = tVar4;
                                        break loop0;
                                    }
                                } else if ((pVar5.f4491f & 1024) != 0 && (pVar5 instanceof AbstractC1000m)) {
                                    p pVar6 = ((AbstractC1000m) pVar5).f8771r;
                                    int i5 = 0;
                                    r6 = r6;
                                    while (pVar6 != null) {
                                        if ((pVar6.f4491f & 1024) != 0) {
                                            i5++;
                                            r6 = r6;
                                            if (i5 == 1) {
                                                pVar5 = pVar6;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new K.d(new p[16]);
                                                }
                                                if (pVar5 != null) {
                                                    r6.b(pVar5);
                                                    pVar5 = tVar;
                                                }
                                                r6.b(pVar6);
                                            }
                                        }
                                        pVar6 = pVar6.f4494i;
                                        r6 = r6;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                pVar5 = AbstractC0993f.f(r6);
                            }
                        }
                        pVar4 = pVar4.f4493h;
                    }
                }
                t3 = t3.s();
                pVar4 = (t3 == null || (c0174t = t3.f8561y) == null) ? tVar : (p0) c0174t.f2914e;
            }
        }
        tVar2 = tVar;
        if (tVar2 != null && !tVar2.equals(tVar3)) {
            z3 = ((Boolean) hVar.n(tVar2)).booleanValue();
        }
        return Boolean.valueOf(z3);
    }

    public final boolean d(int i3) {
        u uVar = new u();
        uVar.f5832d = Boolean.FALSE;
        Boolean c2 = c(i3, (C0239d) this.f4902d.b(), new s(i3, 1, uVar));
        if (c2 == null || uVar.f5832d == null) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        if (c2.equals(bool) && j.a(uVar.f5832d, bool)) {
            return true;
        }
        if (!(Z.b.a(i3, 1) ? true : Z.b.a(i3, 2))) {
            return ((Boolean) this.f4900b.n(new Z.b(i3))).booleanValue();
        }
        if (!a(i3, false, false)) {
            return false;
        }
        Boolean c3 = c(i3, null, new Z.j(i3, 0));
        return c3 != null ? c3.booleanValue() : false;
    }
}
