package androidx.compose.ui.focus;

import A.V;
import E.j;
import G.C0223t;
import I.d;
import M0.k;
import Q.u;
import S.n;
import S.o;
import W2.f0;
import X.f;
import X.g;
import X.h;
import X.l;
import X.m;
import X.p;
import android.view.KeyEvent;
import i.t;
import j0.c;
import java.util.ArrayList;
import k3.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import n.AbstractC0864b;
import r0.AbstractC1065f;
import r0.AbstractC1073n;
import r0.E;
import r0.InterfaceC1072m;
import r0.T;
import r0.o0;
import y2.C1338m;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final e f5174a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f5175b;

    /* renamed from: c, reason: collision with root package name */
    public final X.e f5176c;

    /* renamed from: d, reason: collision with root package name */
    public final X.e f5177d;

    /* renamed from: e, reason: collision with root package name */
    public final j f5178e;

    /* renamed from: g, reason: collision with root package name */
    public final f f5180g;

    /* renamed from: j, reason: collision with root package name */
    public t f5183j;

    /* renamed from: f, reason: collision with root package name */
    public final X.t f5179f = new X.t();

    /* renamed from: h, reason: collision with root package name */
    public final V f5181h = new V(3);

    /* renamed from: i, reason: collision with root package name */
    public final o f5182i = new FocusPropertiesElement(new m()).h(new T() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return b.this.f5179f.hashCode();
        }

        @Override // r0.T
        public final n l() {
            return b.this.f5179f;
        }

        @Override // r0.T
        public final /* bridge */ /* synthetic */ void m(n nVar) {
        }
    });

    public b(f0 f0Var, e eVar, f0 f0Var2, X.e eVar2, X.e eVar3, j jVar) {
        this.f5174a = eVar;
        this.f5175b = f0Var2;
        this.f5176c = eVar2;
        this.f5177d = eVar3;
        this.f5178e = jVar;
        this.f5180g = new f(f0Var, new X.e(0, this, b.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0, 1));
    }

    public final boolean a(int i2, boolean z4, boolean z5) {
        boolean e4;
        int d4;
        V v4 = this.f5181h;
        g gVar = g.f4322i;
        try {
            if (v4.f61b) {
                V.a(v4);
            }
            v4.f61b = true;
            ((d) v4.f63d).b(gVar);
            X.t tVar = this.f5179f;
            if (!z4 && ((d4 = AbstractC0784j.d(X.d.u(tVar, i2))) == 1 || d4 == 2 || d4 == 3)) {
                e4 = false;
                if (e4 && z5) {
                    this.f5176c.invoke();
                }
                return e4;
            }
            e4 = X.d.e(tVar, z4, true);
            if (e4) {
                this.f5176c.invoke();
            }
            return e4;
        } finally {
            V.b(v4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x03b0, code lost:
    
        if (r7 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x00a3, code lost:
    
        if (((((~r11) << 6) & r11) & (-9187201950435737472L)) == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x00a5, code lost:
    
        r5 = r9.b(r2);
        r7 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x00ad, code lost:
    
        if (r9.f6961e != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x00c0, code lost:
    
        if (((r9.f6957a[r5 >> 3] >> ((r5 & 7) << r4)) & 255) != 254) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x00c7, code lost:
    
        r5 = r9.f6959c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x00cb, code lost:
    
        if (r5 <= 8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x00cd, code lost:
    
        r10 = r9.f6960d;
        r6 = y2.y.f11688e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x00dd, code lost:
    
        if (java.lang.Long.compareUnsigned(r10 * 32, r5 * 25) > 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x00df, code lost:
    
        r5 = r9.f6957a;
        r6 = r9.f6959c;
        r10 = r9.f6958b;
        i.AbstractC0664E.a(r5, r6);
        r11 = 0;
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x00ea, code lost:
    
        if (r11 == r6) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x00ec, code lost:
    
        r15 = r11 >> 3;
        r18 = (r11 & 7) << 3;
        r16 = (r5[r15] >> r18) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x00fc, code lost:
    
        if (r16 != r7) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x010c, code lost:
    
        if (r16 == 254) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0110, code lost:
    
        r16 = java.lang.Long.hashCode(r10[r11]) * (-862048943);
        r3 = (r16 ^ (r16 << 16)) >>> 7;
        r21 = r9.b(r3);
        r3 = r3 & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x013b, code lost:
    
        if ((((r21 - r3) & r6) / 8) != (((r11 - r3) & r6) / 8)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x013d, code lost:
    
        r37 = r5;
        r37[r15] = ((r16 & 127) << r18) | (r5[r15] & (~(255 << r18)));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r37, "<this>");
        r37[r37.length - 1] = (r37[0] & 72057594037927935L) | Long.MIN_VALUE;
        r11 = r11 + 1;
        r5 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0165, code lost:
    
        r4 = 3;
        r7 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x016c, code lost:
    
        r1 = r4;
        r0 = r5;
        r4 = r21 >> 3;
        r33 = r0[r4];
        r5 = (r21 & 7) << r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x017f, code lost:
    
        if (((r33 >> r5) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0181, code lost:
    
        r17 = "<this>";
        r0[r4] = (r33 & (~(255 << r5))) | ((r16 & 127) << r5);
        r0[r15] = (r0[r15] & (~(255 << r18))) | (128 << r18);
        r10[r21] = r10[r11];
        r10[r11] = 0;
        r15 = r2;
        r12 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x01d5, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r17);
        r0[r0.length - 1] = (r0[0] & 72057594037927935L) | Long.MIN_VALUE;
        r11 = r11 + 1;
        r5 = r0;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x01aa, code lost:
    
        r17 = "<this>";
        r15 = r2;
        r0[r4] = (r33 & (~(255 << r5))) | ((r16 & 127) << r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x01be, code lost:
    
        if (r12 != (-1)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x01c0, code lost:
    
        r12 = i.AbstractC0664E.b(r0, r11 + 1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x01c7, code lost:
    
        r10[r12] = r10[r21];
        r10[r21] = r10[r11];
        r10[r11] = r10[r12];
        r11 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x010e, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x00fe, code lost:
    
        r12 = r11;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x01eb, code lost:
    
        r9.f6961e = i.AbstractC0664E.c(r9.f6959c) - r9.f6960d;
        r32 = r13;
        r0 = r2;
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0276, code lost:
    
        r0 = r9.b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x027c, code lost:
    
        r9.f6960d += r3;
        r1 = r9.f6961e;
        r2 = r9.f6957a;
        r5 = r0 >> 3;
        r10 = r2[r5];
        r6 = (r0 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0296, code lost:
    
        if (((r10 >> r6) & 255) != 128) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0298, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x029b, code lost:
    
        r9.f6961e = r1 - r4;
        r1 = r9.f6959c;
        r10 = (r10 & (~(255 << r6))) | (r32 << r6);
        r2[r5] = r10;
        r2[(((r0 - 7) & r1) + (r1 & 7)) >> 3] = r10;
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x029a, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x01fd, code lost:
    
        r0 = i.AbstractC0664E.d(r9.f6959c);
        r1 = r9.f6957a;
        r2 = r9.f6958b;
        r4 = r9.f6959c;
        r9.c(r0);
        r0 = r9.f6957a;
        r5 = r9.f6958b;
        r6 = r9.f6959c;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0214, code lost:
    
        if (r8 >= r4) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0227, code lost:
    
        if (((r1[r8 >> 3] >> ((r8 & 7) << 3)) & 255) >= 128) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0229, code lost:
    
        r10 = r2[r8];
        r12 = java.lang.Long.hashCode(r10) * (-862048943);
        r3 = r9.b((r12 ^ (r12 << 16)) >>> 7);
        r16 = r8;
        r18 = r3 >> 3;
        r19 = (r3 & 7) << 3;
        r32 = r13;
        r12 = (r0[r18] & (~(255 << r19))) | ((r12 & 127) << r19);
        r0[r18] = r12;
        r0[(((r3 - 7) & r6) + (r6 & 7)) >> 3] = r12;
        r5[r3] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x026d, code lost:
    
        r8 = r16 + 1;
        r13 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0268, code lost:
    
        r16 = r8;
        r32 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0272, code lost:
    
        r32 = r13;
        r3 = 1;
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x00c2, code lost:
    
        r32 = r13;
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x027b, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0344, code lost:
    
        if (((r3 & ((~r3) << 6)) & (-9187201950435737472L)) == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0346, code lost:
    
        r12 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x04df  */
    /* JADX WARN: Type inference failed for: r1v21, types: [S.n] */
    /* JADX WARN: Type inference failed for: r1v22, types: [S.n] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48, types: [S.n] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32, types: [S.n] */
    /* JADX WARN: Type inference failed for: r2v33, types: [S.n] */
    /* JADX WARN: Type inference failed for: r2v41, types: [S.n] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50, types: [I.d] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53, types: [I.d] */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [S.n] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [S.n] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30, types: [S.n] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32, types: [S.n] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42, types: [I.d] */
    /* JADX WARN: Type inference failed for: r7v77 */
    /* JADX WARN: Type inference failed for: r7v78 */
    /* JADX WARN: Type inference failed for: r7v79 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(KeyEvent keyEvent, Function0 function0) {
        b bVar;
        int i2;
        X.t g4;
        n nVar;
        AbstractC1073n abstractC1073n;
        n nVar2;
        C0223t c0223t;
        AbstractC1073n abstractC1073n2;
        C0223t c0223t2;
        KeyEvent keyEvent2;
        C0223t c0223t3;
        long j4;
        int i4;
        int i5 = 3;
        if (this.f5180g.a()) {
            throw new IllegalStateException("Dispatching key event while focus system is invalidated.");
        }
        long A4 = c.A(keyEvent);
        int C3 = c.C(keyEvent);
        if (c.w(C3, 2)) {
            t tVar = this.f5183j;
            if (tVar == null) {
                tVar = new t(3);
                this.f5183j = tVar;
            }
            t tVar2 = tVar;
            int hashCode = Long.hashCode(A4) * (-862048943);
            int i6 = hashCode ^ (hashCode << 16);
            int i7 = i6 >>> 7;
            int i8 = i6 & 127;
            int i9 = tVar2.f6959c;
            int i10 = i7 & i9;
            int i11 = 0;
            loop0: while (true) {
                long[] jArr = tVar2.f6957a;
                int i12 = i10 >> 3;
                int i13 = (i10 & 7) << 3;
                long j5 = (jArr[i12] >>> i13) | ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63));
                long j6 = i8;
                j4 = A4;
                long j7 = j5 ^ (j6 * 72340172838076673L);
                long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
                while (true) {
                    if (j8 == 0) {
                        break;
                    }
                    i4 = (i10 + (Long.numberOfTrailingZeros(j8) >> i5)) & i9;
                    if (tVar2.f6958b[i4] == j4) {
                        break loop0;
                    }
                    j8 &= j8 - 1;
                }
                i11 += 8;
                i10 = (i10 + i11) & i9;
                A4 = j4;
                i5 = 3;
            }
            tVar2.f6958b[i4] = j4;
        } else if (c.w(C3, 1)) {
            bVar = this;
            t tVar3 = bVar.f5183j;
            if (tVar3 == null) {
                return false;
            }
            long j9 = A4;
            if (!tVar3.a(j9)) {
                return false;
            }
            t tVar4 = bVar.f5183j;
            if (tVar4 != null) {
                int hashCode2 = Long.hashCode(j9) * (-862048943);
                int i14 = hashCode2 ^ (hashCode2 << 16);
                int i15 = i14 & 127;
                int i16 = tVar4.f6959c;
                int i17 = (i14 >>> 7) & i16;
                int i18 = 0;
                loop23: while (true) {
                    long[] jArr2 = tVar4.f6957a;
                    int i19 = i17 >> 3;
                    int i20 = (i17 & 7) << 3;
                    long j10 = j9;
                    long j11 = (((-i20) >> 63) & (jArr2[i19 + 1] << (64 - i20))) | (jArr2[i19] >>> i20);
                    long j12 = (i15 * 72340172838076673L) ^ j11;
                    long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
                    while (true) {
                        if (j13 == 0) {
                            break;
                        }
                        i2 = ((Long.numberOfTrailingZeros(j13) >> 3) + i17) & i16;
                        if (tVar4.f6958b[i2] == j10) {
                            break loop23;
                        }
                        j13 &= j13 - 1;
                    }
                    i18 += 8;
                    i17 = (i17 + i18) & i16;
                    j9 = j10;
                }
                if (i2 >= 0) {
                    tVar4.f6960d--;
                    long[] jArr3 = tVar4.f6957a;
                    int i21 = tVar4.f6959c;
                    int i22 = i2 >> 3;
                    int i23 = (i2 & 7) << 3;
                    long j14 = (jArr3[i22] & (~(255 << i23))) | (254 << i23);
                    jArr3[i22] = j14;
                    jArr3[(((i2 - 7) & i21) + (i21 & 7)) >> 3] = j14;
                }
            }
            X.t tVar5 = bVar.f5179f;
            g4 = X.d.g(tVar5);
            if (g4 != null) {
                n nVar3 = g4.f3978d;
                if (!nVar3.f3990s) {
                    AbstractC0864b.D("visitLocalDescendants called on an unattached node");
                    throw null;
                }
                if ((nVar3.f3981j & 9216) != 0) {
                    nVar2 = null;
                    for (n nVar4 = nVar3.f3983l; nVar4 != null; nVar4 = nVar4.f3983l) {
                        int i24 = nVar4.f3980i;
                        if ((i24 & 9216) != 0) {
                            if ((i24 & 1024) != 0) {
                                break;
                            }
                            nVar2 = nVar4;
                        }
                    }
                } else {
                    nVar2 = null;
                }
            }
            if (g4 != null) {
                n nVar5 = g4.f3978d;
                if (!nVar5.f3990s) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                E v4 = AbstractC1065f.v(g4);
                loop13: while (true) {
                    if (v4 == null) {
                        abstractC1073n2 = 0;
                        break;
                    }
                    if ((((n) v4.B.f2912f).f3981j & 8192) != 0) {
                        while (nVar5 != null) {
                            if ((nVar5.f3980i & 8192) != 0) {
                                d dVar = null;
                                abstractC1073n2 = nVar5;
                                while (abstractC1073n2 != 0) {
                                    if (abstractC1073n2 instanceof j0.d) {
                                        break loop13;
                                    }
                                    if ((abstractC1073n2.f3980i & 8192) != 0 && (abstractC1073n2 instanceof AbstractC1073n)) {
                                        d dVar2 = dVar;
                                        n nVar6 = abstractC1073n2;
                                        int i25 = 0;
                                        for (n nVar7 = abstractC1073n2.f9826u; nVar7 != null; nVar7 = nVar7.f3983l) {
                                            if ((nVar7.f3980i & 8192) != 0) {
                                                i25++;
                                                if (i25 == 1) {
                                                    nVar6 = nVar7;
                                                } else {
                                                    if (dVar2 == null) {
                                                        dVar2 = new d(new n[16]);
                                                    }
                                                    if (nVar6 != null) {
                                                        dVar2.b(nVar6);
                                                        nVar6 = null;
                                                    }
                                                    dVar2.b(nVar7);
                                                }
                                            }
                                        }
                                        if (i25 == 1) {
                                            abstractC1073n2 = nVar6;
                                            dVar = dVar2;
                                        } else {
                                            dVar = dVar2;
                                        }
                                    }
                                    abstractC1073n2 = AbstractC1065f.f(dVar);
                                }
                            }
                            nVar5 = nVar5.f3982k;
                        }
                    }
                    v4 = v4.s();
                    nVar5 = (v4 == null || (c0223t2 = v4.B) == null) ? null : (o0) c0223t2.f2911e;
                }
                InterfaceC1072m interfaceC1072m = (j0.d) abstractC1073n2;
                if (interfaceC1072m != null) {
                    nVar2 = ((n) interfaceC1072m).f3978d;
                    if (nVar2 != null) {
                        return false;
                    }
                    n nVar8 = nVar2.f3978d;
                    if (!nVar8.f3990s) {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                    n nVar9 = nVar8.f3982k;
                    E v5 = AbstractC1065f.v(nVar2);
                    ArrayList arrayList = null;
                    while (v5 != null) {
                        if ((((n) v5.B.f2912f).f3981j & 8192) != 0) {
                            while (nVar9 != null) {
                                if ((nVar9.f3980i & 8192) != 0) {
                                    n nVar10 = nVar9;
                                    d dVar3 = null;
                                    while (nVar10 != null) {
                                        if (nVar10 instanceof j0.d) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(nVar10);
                                        } else if ((nVar10.f3980i & 8192) != 0 && (nVar10 instanceof AbstractC1073n)) {
                                            d dVar4 = dVar3;
                                            n nVar11 = nVar10;
                                            int i26 = 0;
                                            for (n nVar12 = ((AbstractC1073n) nVar10).f9826u; nVar12 != null; nVar12 = nVar12.f3983l) {
                                                if ((nVar12.f3980i & 8192) != 0) {
                                                    i26++;
                                                    if (i26 == 1) {
                                                        nVar11 = nVar12;
                                                    } else {
                                                        if (dVar4 == null) {
                                                            dVar4 = new d(new n[16]);
                                                        }
                                                        if (nVar11 != null) {
                                                            dVar4.b(nVar11);
                                                            nVar11 = null;
                                                        }
                                                        dVar4.b(nVar12);
                                                    }
                                                }
                                            }
                                            if (i26 == 1) {
                                                nVar10 = nVar11;
                                                dVar3 = dVar4;
                                            } else {
                                                dVar3 = dVar4;
                                            }
                                        }
                                        nVar10 = AbstractC1065f.f(dVar3);
                                    }
                                }
                                nVar9 = nVar9.f3982k;
                            }
                        }
                        v5 = v5.s();
                        nVar9 = (v5 == null || (c0223t3 = v5.B) == null) ? null : (o0) c0223t3.f2911e;
                    }
                    if (arrayList != null) {
                        int size = arrayList.size() - 1;
                        if (size >= 0) {
                            while (true) {
                                int i27 = size - 1;
                                keyEvent2 = keyEvent;
                                if (((j0.d) arrayList.get(size)).n(keyEvent2)) {
                                    return true;
                                }
                                if (i27 < 0) {
                                    break;
                                }
                                size = i27;
                            }
                        } else {
                            keyEvent2 = keyEvent;
                        }
                        Unit unit = Unit.f7487a;
                    } else {
                        keyEvent2 = keyEvent;
                    }
                    AbstractC1073n abstractC1073n3 = nVar2.f3978d;
                    ?? r2 = 0;
                    while (abstractC1073n3 != 0) {
                        if (abstractC1073n3 instanceof j0.d) {
                            if (((j0.d) abstractC1073n3).n(keyEvent2)) {
                                return true;
                            }
                        } else if ((abstractC1073n3.f3980i & 8192) != 0 && (abstractC1073n3 instanceof AbstractC1073n)) {
                            n nVar13 = abstractC1073n3.f9826u;
                            int i28 = 0;
                            abstractC1073n3 = abstractC1073n3;
                            r2 = r2;
                            while (nVar13 != null) {
                                if ((nVar13.f3980i & 8192) != 0) {
                                    i28++;
                                    r2 = r2;
                                    if (i28 == 1) {
                                        abstractC1073n3 = nVar13;
                                    } else {
                                        if (r2 == 0) {
                                            r2 = new d(new n[16]);
                                        }
                                        if (abstractC1073n3 != 0) {
                                            r2.b(abstractC1073n3);
                                            abstractC1073n3 = 0;
                                        }
                                        r2.b(nVar13);
                                    }
                                }
                                nVar13 = nVar13.f3983l;
                                abstractC1073n3 = abstractC1073n3;
                                r2 = r2;
                            }
                            if (i28 == 1) {
                            }
                        }
                        abstractC1073n3 = AbstractC1065f.f(r2);
                    }
                    if (((Boolean) function0.invoke()).booleanValue()) {
                        return true;
                    }
                    boolean z4 = true;
                    AbstractC1073n abstractC1073n4 = nVar2.f3978d;
                    d dVar5 = null;
                    while (abstractC1073n4 != 0) {
                        if (abstractC1073n4 instanceof j0.d) {
                            if (((j0.d) abstractC1073n4).r(keyEvent2)) {
                                return z4;
                            }
                        } else if ((abstractC1073n4.f3980i & 8192) != 0 && (abstractC1073n4 instanceof AbstractC1073n)) {
                            n nVar14 = abstractC1073n4.f9826u;
                            ?? r7 = dVar5;
                            int i29 = 0;
                            abstractC1073n4 = abstractC1073n4;
                            while (nVar14 != null) {
                                abstractC1073n4 = abstractC1073n4;
                                if ((nVar14.f3980i & 8192) != 0) {
                                    i29++;
                                    if (i29 == 1) {
                                        abstractC1073n4 = nVar14;
                                    } else {
                                        r7 = r7 == 0 ? new d(new n[16]) : r7;
                                        if (abstractC1073n4 != 0) {
                                            r7.b(abstractC1073n4);
                                            abstractC1073n4 = 0;
                                        }
                                        r7.b(nVar14);
                                        nVar14 = nVar14.f3983l;
                                        abstractC1073n4 = abstractC1073n4;
                                        r7 = r7;
                                    }
                                }
                                nVar14 = nVar14.f3983l;
                                abstractC1073n4 = abstractC1073n4;
                                r7 = r7;
                            }
                            z4 = true;
                            if (i29 == 1) {
                                dVar5 = r7;
                            } else {
                                dVar5 = r7;
                                abstractC1073n4 = AbstractC1065f.f(dVar5);
                                z4 = true;
                            }
                        }
                        abstractC1073n4 = AbstractC1065f.f(dVar5);
                        z4 = true;
                    }
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        for (int i30 = 0; i30 < size2; i30++) {
                            if (((j0.d) arrayList.get(i30)).r(keyEvent2)) {
                                return true;
                            }
                        }
                        Unit unit2 = Unit.f7487a;
                    }
                    Unit unit3 = Unit.f7487a;
                    return false;
                }
            }
            nVar = tVar5.f3978d;
            if (nVar.f3990s) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            n nVar15 = nVar.f3982k;
            E v6 = AbstractC1065f.v(tVar5);
            loop17: while (true) {
                if (v6 == null) {
                    abstractC1073n = 0;
                    break;
                }
                if ((((n) v6.B.f2912f).f3981j & 8192) != 0) {
                    while (nVar15 != null) {
                        if ((nVar15.f3980i & 8192) != 0) {
                            abstractC1073n = nVar15;
                            d dVar6 = null;
                            while (abstractC1073n != 0) {
                                if (abstractC1073n instanceof j0.d) {
                                    break loop17;
                                }
                                if ((abstractC1073n.f3980i & 8192) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                                    d dVar7 = dVar6;
                                    n nVar16 = abstractC1073n;
                                    int i31 = 0;
                                    for (n nVar17 = abstractC1073n.f9826u; nVar17 != null; nVar17 = nVar17.f3983l) {
                                        if ((nVar17.f3980i & 8192) != 0) {
                                            i31++;
                                            if (i31 == 1) {
                                                nVar16 = nVar17;
                                            } else {
                                                if (dVar7 == null) {
                                                    dVar7 = new d(new n[16]);
                                                }
                                                if (nVar16 != null) {
                                                    dVar7.b(nVar16);
                                                    nVar16 = null;
                                                }
                                                dVar7.b(nVar17);
                                            }
                                        }
                                    }
                                    if (i31 == 1) {
                                        abstractC1073n = nVar16;
                                        dVar6 = dVar7;
                                    } else {
                                        dVar6 = dVar7;
                                    }
                                }
                                abstractC1073n = AbstractC1065f.f(dVar6);
                            }
                        }
                        nVar15 = nVar15.f3982k;
                    }
                }
                v6 = v6.s();
                nVar15 = (v6 == null || (c0223t = v6.B) == null) ? null : (o0) c0223t.f2911e;
            }
            InterfaceC1072m interfaceC1072m2 = (j0.d) abstractC1073n;
            nVar2 = interfaceC1072m2 != null ? ((n) interfaceC1072m2).f3978d : null;
            if (nVar2 != null) {
            }
        }
        bVar = this;
        X.t tVar52 = bVar.f5179f;
        g4 = X.d.g(tVar52);
        if (g4 != null) {
        }
        if (g4 != null) {
        }
        nVar = tVar52.f3978d;
        if (nVar.f3990s) {
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
    /* JADX WARN: Type inference failed for: r6v6, types: [I.d] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [I.d] */
    public final Boolean c(int i2, Y.d dVar, Function1 function1) {
        X.t tVar;
        X.t tVar2;
        C0223t c0223t;
        boolean a4;
        p pVar;
        p pVar2;
        X.t tVar3 = this.f5179f;
        X.t g4 = X.d.g(tVar3);
        j jVar = this.f5178e;
        int i4 = 4;
        if (g4 != null) {
            k kVar = (k) jVar.get();
            l B02 = g4.B0();
            if (X.b.a(i2, 1)) {
                pVar = B02.f4333b;
            } else if (X.b.a(i2, 2)) {
                pVar = B02.f4334c;
            } else if (X.b.a(i2, 5)) {
                pVar = B02.f4335d;
            } else if (X.b.a(i2, 6)) {
                pVar = B02.f4336e;
            } else if (X.b.a(i2, 3)) {
                int ordinal = kVar.ordinal();
                if (ordinal == 0) {
                    pVar2 = B02.f4339h;
                } else {
                    if (ordinal != 1) {
                        throw new C1338m();
                    }
                    pVar2 = B02.f4340i;
                }
                if (pVar2 == p.f4344b) {
                    pVar2 = null;
                }
                if (pVar2 == null) {
                    pVar = B02.f4337f;
                }
                pVar = pVar2;
            } else if (X.b.a(i2, 4)) {
                int ordinal2 = kVar.ordinal();
                if (ordinal2 == 0) {
                    pVar2 = B02.f4340i;
                } else {
                    if (ordinal2 != 1) {
                        throw new C1338m();
                    }
                    pVar2 = B02.f4339h;
                }
                if (pVar2 == p.f4344b) {
                    pVar2 = null;
                }
                if (pVar2 == null) {
                    pVar = B02.f4338g;
                }
                pVar = pVar2;
            } else if (X.b.a(i2, 7)) {
                B02.f4341j.getClass();
                pVar = p.f4344b;
            } else {
                if (!X.b.a(i2, 8)) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                B02.f4342k.getClass();
                pVar = p.f4344b;
            }
            if (Intrinsics.a(pVar, p.f4345c)) {
                return null;
            }
            tVar = null;
            if (!Intrinsics.a(pVar, p.f4344b)) {
                return Boolean.valueOf(pVar.a(function1));
            }
        } else {
            tVar = null;
            g4 = null;
        }
        k kVar2 = (k) jVar.get();
        P.h hVar = new P.h(g4, this, function1);
        if (X.b.a(i2, 1) ? true : X.b.a(i2, 2)) {
            if (X.b.a(i2, 1)) {
                a4 = X.d.k(tVar3, hVar);
            } else {
                if (!X.b.a(i2, 2)) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                a4 = X.d.a(tVar3, hVar);
            }
            return Boolean.valueOf(a4);
        }
        if (X.b.a(i2, 3) ? true : X.b.a(i2, 4) ? true : X.b.a(i2, 5) ? true : X.b.a(i2, 6)) {
            return X.d.L(i2, hVar, tVar3, dVar);
        }
        if (X.b.a(i2, 7)) {
            int ordinal3 = kVar2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    throw new C1338m();
                }
                i4 = 3;
            }
            X.t g5 = X.d.g(tVar3);
            return g5 != null ? X.d.L(i4, hVar, g5, dVar) : tVar;
        }
        if (!X.b.a(i2, 8)) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) X.b.b(i2))).toString());
        }
        X.t g6 = X.d.g(tVar3);
        boolean z4 = false;
        if (g6 != null) {
            n nVar = g6.f3978d;
            if (!nVar.f3990s) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            n nVar2 = nVar.f3982k;
            E v4 = AbstractC1065f.v(g6);
            loop0: while (v4 != null) {
                if ((((n) v4.B.f2912f).f3981j & 1024) != 0) {
                    while (nVar2 != null) {
                        if ((nVar2.f3980i & 1024) != 0) {
                            n nVar3 = nVar2;
                            ?? r6 = tVar;
                            while (nVar3 != null) {
                                if (nVar3 instanceof X.t) {
                                    X.t tVar4 = (X.t) nVar3;
                                    if (tVar4.B0().f4332a) {
                                        tVar2 = tVar4;
                                        break loop0;
                                    }
                                } else if ((nVar3.f3980i & 1024) != 0 && (nVar3 instanceof AbstractC1073n)) {
                                    n nVar4 = ((AbstractC1073n) nVar3).f9826u;
                                    int i5 = 0;
                                    r6 = r6;
                                    while (nVar4 != null) {
                                        if ((nVar4.f3980i & 1024) != 0) {
                                            i5++;
                                            r6 = r6;
                                            if (i5 == 1) {
                                                nVar3 = nVar4;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new d(new n[16]);
                                                }
                                                if (nVar3 != null) {
                                                    r6.b(nVar3);
                                                    nVar3 = tVar;
                                                }
                                                r6.b(nVar4);
                                            }
                                        }
                                        nVar4 = nVar4.f3983l;
                                        r6 = r6;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                nVar3 = AbstractC1065f.f(r6);
                            }
                        }
                        nVar2 = nVar2.f3982k;
                    }
                }
                v4 = v4.s();
                nVar2 = (v4 == null || (c0223t = v4.B) == null) ? tVar : (o0) c0223t.f2911e;
            }
        }
        tVar2 = tVar;
        if (tVar2 != null && !tVar2.equals(tVar3)) {
            z4 = ((Boolean) hVar.invoke(tVar2)).booleanValue();
        }
        return Boolean.valueOf(z4);
    }

    public final boolean d(int i2) {
        M2.E e4 = new M2.E();
        e4.f3580d = Boolean.FALSE;
        Boolean c4 = c(i2, (Y.d) this.f5177d.invoke(), new u(i2, 1, e4));
        if (c4 == null || e4.f3580d == null) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        if (c4.equals(bool) && Intrinsics.a(e4.f3580d, bool)) {
            return true;
        }
        if (!(X.b.a(i2, 1) ? true : X.b.a(i2, 2))) {
            return ((Boolean) this.f5175b.invoke(new X.b(i2))).booleanValue();
        }
        if (!a(i2, false, false)) {
            return false;
        }
        Boolean c5 = c(i2, null, new X.j(i2, 0));
        return c5 != null ? c5.booleanValue() : false;
    }
}
