package androidx.compose.ui.focus;

import a0.s0;
import android.view.KeyEvent;
import b.h0;
import c7.a1;
import e0.j;
import g0.t;
import i.s;
import j1.c;
import java.util.ArrayList;
import l.h;
import q7.d;
import r1.d0;
import r1.l;
import r1.m;
import r1.o1;
import r6.v;
import s0.n;
import s0.o;
import x0.e;
import x0.f;
import x0.g;
import x0.k;
import x0.r;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final d f711a;

    /* renamed from: b, reason: collision with root package name */
    public final a1 f712b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f713c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f714d;

    /* renamed from: e, reason: collision with root package name */
    public final j f715e;

    /* renamed from: g, reason: collision with root package name */
    public final e f717g;

    /* renamed from: j, reason: collision with root package name */
    public s f720j;

    /* renamed from: f, reason: collision with root package name */
    public final r f716f = new r();

    /* renamed from: h, reason: collision with root package name */
    public final s0 f718h = new s0(4);

    /* renamed from: i, reason: collision with root package name */
    public final o f719i = new FocusPropertiesElement(new k()).j(new r1.s0() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return b.this.f716f.hashCode();
        }

        @Override // r1.s0
        public final n l() {
            return b.this.f716f;
        }

        @Override // r1.s0
        public final /* bridge */ /* synthetic */ void m(n nVar) {
        }
    });

    public b(a1 a1Var, d dVar, a1 a1Var2, h0 h0Var, h0 h0Var2, j jVar) {
        this.f711a = dVar;
        this.f712b = a1Var2;
        this.f713c = h0Var;
        this.f714d = h0Var2;
        this.f715e = jVar;
        this.f717g = new e(a1Var, new h0(0, this, b.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0, 0, 6));
    }

    public final boolean a(int i7, boolean z8, boolean z9) {
        boolean e9;
        int d8;
        s0 s0Var = this.f718h;
        f fVar = f.f9604i;
        try {
            if (s0Var.f136b) {
                s0.a(s0Var);
            }
            s0Var.f136b = true;
            ((i0.d) s0Var.f138d).b(fVar);
            r rVar = this.f716f;
            if (!z8 && ((d8 = h.d(x0.d.u(rVar))) == 1 || d8 == 2 || d8 == 3)) {
                e9 = false;
                if (e9 && z9) {
                    this.f713c.a();
                }
                return e9;
            }
            e9 = x0.d.e(rVar, z8);
            if (e9) {
                this.f713c.a();
            }
            return e9;
        } finally {
            s0.b(s0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0385, code lost:
    
        if (r8 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x00a0, code lost:
    
        r35 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x00aa, code lost:
    
        if (((((~r12) << 6) & r12) & (-9187201950435737472L)) == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x00ac, code lost:
    
        r4 = r5.b(r9);
        r7 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x00b4, code lost:
    
        if (r5.f4791e != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x00c5, code lost:
    
        if (((r5.f4787a[r4 >> 3] >> ((r4 & 7) << 3)) & 255) != 254) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x00cb, code lost:
    
        r4 = r5.f4789c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x00cf, code lost:
    
        if (r4 <= 8) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x00e6, code lost:
    
        if (java.lang.Long.compare((r5.f4790d * 32) ^ Long.MIN_VALUE, (r4 * 25) ^ Long.MIN_VALUE) > 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x00e8, code lost:
    
        r4 = r5.f4787a;
        r6 = r5.f4789c;
        r10 = r5.f4788b;
        i.e0.a(r4, r6);
        r11 = 0;
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x00f4, code lost:
    
        if (r11 == r6) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x00f6, code lost:
    
        r13 = r11 >> 3;
        r25 = (r11 & 7) << 3;
        r20 = (r4[r13] >> r25) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0104, code lost:
    
        if (r20 != r7) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0110, code lost:
    
        if (r20 == 254) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0115, code lost:
    
        r20 = java.lang.Long.hashCode(r10[r11]) * r33;
        r27 = r7;
        r7 = (r20 ^ (r20 << 16)) >>> 7;
        r8 = r5.b(r7);
        r7 = r7 & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0141, code lost:
    
        if ((((r8 - r7) & r6) / 8) != (((r11 - r7) & r6) / 8)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0143, code lost:
    
        r4[r13] = (r4[r13] & (~(255 << r25))) | ((r20 & 127) << r25);
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0160, code lost:
    
        r11 = r11 + 1;
        r7 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0165, code lost:
    
        r7 = r8 >> 3;
        r40 = r4[r7];
        r8 = (r8 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0173, code lost:
    
        if (((r40 >> r8) & 255) != r27) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0175, code lost:
    
        r4[r7] = (r40 & (~(255 << r8))) | ((r20 & 127) << r8);
        r4[r13] = (r4[r13] & (~(255 << r25))) | (r27 << r25);
        r10[r8] = r10[r11];
        r10[r11] = 0;
        r12 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x01cb, code lost:
    
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x01a0, code lost:
    
        r4[r7] = (r40 & (~(255 << r8))) | ((r20 & 127) << r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x01b5, code lost:
    
        if (r12 != (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x01b7, code lost:
    
        r12 = i.e0.b(r4, r11 + 1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x01bd, code lost:
    
        r10[r12] = r10[r8];
        r10[r8] = r10[r11];
        r10[r11] = r10[r12];
        r11 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0112, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0106, code lost:
    
        r12 = r11;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x01d7, code lost:
    
        r27 = r7;
        r5.f4791e = i.e0.c(r5.f4789c) - r5.f4790d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x025e, code lost:
    
        r4 = r5.b(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0262, code lost:
    
        r34 = r4;
        r5.f4790d++;
        r4 = r5.f4791e;
        r6 = r5.f4787a;
        r7 = r34 >> 3;
        r8 = r6[r7];
        r10 = (r34 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x027c, code lost:
    
        if (((r8 >> r10) & 255) != r27) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x027e, code lost:
    
        r11 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0283, code lost:
    
        r5.f4791e = r4 - r11;
        r4 = r5.f4789c;
        r8 = (r8 & (~(255 << r10))) | (r14 << r10);
        r6[r7] = r8;
        r6[(((r34 - 7) & r4) + (r4 & 7)) >> 3] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0281, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x01e6, code lost:
    
        r27 = 128;
        r4 = i.e0.d(r5.f4789c);
        r6 = r5.f4787a;
        r7 = r5.f4788b;
        r8 = r5.f4789c;
        r5.c(r4);
        r4 = r5.f4787a;
        r10 = r5.f4788b;
        r11 = r5.f4789c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x01ff, code lost:
    
        if (r12 >= r8) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x020f, code lost:
    
        if (((r6[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0211, code lost:
    
        r16 = r7[r12];
        r13 = java.lang.Long.hashCode(r16) * r33;
        r13 = r13 ^ (r13 << 16);
        r18 = r4;
        r4 = r5.b(r13 >>> 7);
        r19 = r6;
        r20 = r7;
        r6 = r13 & 127;
        r13 = r4 >> 3;
        r21 = (r4 & 7) << 3;
        r6 = (r18[r13] & (~(255 << r21))) | (r6 << r21);
        r18[r13] = r6;
        r18[(((r4 - 7) & r11) + (r11 & 7)) >> 3] = r6;
        r10[r4] = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0255, code lost:
    
        r12 = r12 + 1;
        r4 = r18;
        r6 = r19;
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x024f, code lost:
    
        r18 = r4;
        r19 = r6;
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x00c7, code lost:
    
        r27 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0322, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0324, code lost:
    
        r7 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x04a6  */
    /* JADX WARN: Type inference failed for: r2v14, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r2v15, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r2v19, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r2v20, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r7v121 */
    /* JADX WARN: Type inference failed for: r7v122 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v66 */
    /* JADX WARN: Type inference failed for: r8v67 */
    /* JADX WARN: Type inference failed for: r8v68 */
    /* JADX WARN: Type inference failed for: r8v69 */
    /* JADX WARN: Type inference failed for: r8v70 */
    /* JADX WARN: Type inference failed for: r8v71 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(KeyEvent keyEvent, q6.a aVar) {
        int i7;
        m mVar;
        n nVar;
        t tVar;
        m mVar2;
        t tVar2;
        int size;
        t tVar3;
        int i8;
        int i9;
        if (this.f717g.a()) {
            throw new IllegalStateException("Dispatching key event while focus system is invalidated.");
        }
        long Y = c.Y(keyEvent);
        int e02 = c.e0(keyEvent);
        int i10 = 1;
        int i11 = -862048943;
        if (e02 == 2) {
            s sVar = this.f720j;
            if (sVar == null) {
                sVar = new s(3);
                this.f720j = sVar;
            }
            s sVar2 = sVar;
            int hashCode = Long.hashCode(Y) * (-862048943);
            int i12 = hashCode ^ (hashCode << 16);
            int i13 = i12 >>> 7;
            int i14 = i12 & 127;
            int i15 = sVar2.f4789c;
            int i16 = i13 & i15;
            int i17 = 0;
            loop0: while (true) {
                long[] jArr = sVar2.f4787a;
                int i18 = i16 >> 3;
                int i19 = i11;
                int i20 = (i16 & 7) << 3;
                long j8 = (jArr[i18] >>> i20) | ((jArr[i18 + 1] << (64 - i20)) & ((-i20) >> 63));
                long j9 = i14;
                long j10 = j8 ^ (j9 * 72340172838076673L);
                long j11 = (j10 - 72340172838076673L) & (~j10) & (-9187201950435737472L);
                while (true) {
                    if (j11 == 0) {
                        break;
                    }
                    i9 = (i16 + (Long.numberOfTrailingZeros(j11) >> 3)) & i15;
                    int i21 = i10;
                    if (sVar2.f4788b[i9] == Y) {
                        break loop0;
                    }
                    j11 &= j11 - 1;
                    i10 = i21;
                }
                i17 += 8;
                i16 = (i16 + i17) & i15;
                i11 = i19;
                i10 = i8;
            }
            sVar2.f4788b[i9] = Y;
        } else if (e02 == 1) {
            s sVar3 = this.f720j;
            if (sVar3 != null && sVar3.a(Y)) {
                s sVar4 = this.f720j;
                if (sVar4 != null) {
                    int hashCode2 = Long.hashCode(Y) * (-862048943);
                    int i22 = hashCode2 ^ (hashCode2 << 16);
                    int i23 = i22 & 127;
                    int i24 = sVar4.f4789c;
                    int i25 = (i22 >>> 7) & i24;
                    int i26 = 0;
                    loop23: while (true) {
                        long[] jArr2 = sVar4.f4787a;
                        int i27 = i25 >> 3;
                        int i28 = (i25 & 7) << 3;
                        long j12 = ((jArr2[i27 + 1] << (64 - i28)) & ((-i28) >> 63)) | (jArr2[i27] >>> i28);
                        long j13 = (i23 * 72340172838076673L) ^ j12;
                        long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
                        while (true) {
                            if (j14 == 0) {
                                break;
                            }
                            int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i25) & i24;
                            if (sVar4.f4788b[numberOfTrailingZeros] == Y) {
                                i7 = numberOfTrailingZeros;
                                break loop23;
                            }
                            j14 &= j14 - 1;
                        }
                        i26 += 8;
                        i25 = (i25 + i26) & i24;
                    }
                    if (i7 >= 0) {
                        sVar4.f4790d--;
                        long[] jArr3 = sVar4.f4787a;
                        int i29 = sVar4.f4789c;
                        int i30 = i7 >> 3;
                        int i31 = (i7 & 7) << 3;
                        long j15 = (254 << i31) | (jArr3[i30] & (~(255 << i31)));
                        jArr3[i30] = j15;
                        jArr3[(((i7 - 7) & i29) + (i29 & 7)) >> 3] = j15;
                    }
                }
            }
            return false;
        }
        r rVar = this.f716f;
        r g9 = x0.d.g(rVar);
        if (g9 != null) {
            n nVar2 = g9.f8104f;
            if (!nVar2.f8116r) {
                a.a.M("visitLocalDescendants called on an unattached node");
                throw null;
            }
            if ((nVar2.f8107i & 9216) != 0) {
                nVar = null;
                for (n nVar3 = nVar2.f8109k; nVar3 != null; nVar3 = nVar3.f8109k) {
                    int i32 = nVar3.f8106h;
                    if ((i32 & 9216) != 0) {
                        if ((i32 & 1024) != 0) {
                            break;
                        }
                        nVar = nVar3;
                    }
                }
            } else {
                nVar = null;
            }
        }
        if (g9 != null) {
            n nVar4 = g9.f8104f;
            if (!nVar4.f8116r) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            d0 t2 = r1.f.t(g9);
            loop13: while (true) {
                if (t2 == null) {
                    mVar2 = 0;
                    break;
                }
                if ((((n) t2.A.f3895f).f8107i & 8192) != 0) {
                    while (nVar4 != null) {
                        if ((nVar4.f8106h & 8192) != 0) {
                            ?? r9 = 0;
                            mVar2 = nVar4;
                            while (mVar2 != 0) {
                                if (mVar2 instanceof j1.d) {
                                    break loop13;
                                }
                                if ((mVar2.f8106h & 8192) != 0 && (mVar2 instanceof m)) {
                                    n nVar5 = mVar2.f7853t;
                                    int i33 = 0;
                                    mVar2 = mVar2;
                                    r9 = r9;
                                    while (nVar5 != null) {
                                        if ((nVar5.f8106h & 8192) != 0) {
                                            i33++;
                                            r9 = r9;
                                            if (i33 == 1) {
                                                mVar2 = nVar5;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new i0.d(new n[16]);
                                                }
                                                if (mVar2 != 0) {
                                                    r9.b(mVar2);
                                                    mVar2 = 0;
                                                }
                                                r9.b(nVar5);
                                            }
                                        }
                                        nVar5 = nVar5.f8109k;
                                        mVar2 = mVar2;
                                        r9 = r9;
                                    }
                                    if (i33 == 1) {
                                    }
                                }
                                mVar2 = r1.f.f(r9);
                            }
                        }
                        nVar4 = nVar4.f8108j;
                    }
                }
                t2 = t2.s();
                nVar4 = (t2 == null || (tVar2 = t2.A) == null) ? null : (o1) tVar2.f3894e;
            }
            l lVar = (j1.d) mVar2;
            if (lVar != null) {
                nVar = ((n) lVar).f8104f;
                if (nVar != null) {
                    n nVar6 = nVar.f8104f;
                    if (!nVar6.f8116r) {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                    n nVar7 = nVar6.f8108j;
                    d0 t8 = r1.f.t(nVar);
                    ArrayList arrayList = null;
                    while (t8 != null) {
                        if ((((n) t8.A.f3895f).f8107i & 8192) != 0) {
                            while (nVar7 != null) {
                                if ((nVar7.f8106h & 8192) != 0) {
                                    n nVar8 = nVar7;
                                    i0.d dVar = null;
                                    while (nVar8 != null) {
                                        if (nVar8 instanceof j1.d) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(nVar8);
                                        } else if ((nVar8.f8106h & 8192) != 0 && (nVar8 instanceof m)) {
                                            int i34 = 0;
                                            for (n nVar9 = ((m) nVar8).f7853t; nVar9 != null; nVar9 = nVar9.f8109k) {
                                                if ((nVar9.f8106h & 8192) != 0) {
                                                    i34++;
                                                    if (i34 == 1) {
                                                        nVar8 = nVar9;
                                                    } else {
                                                        if (dVar == null) {
                                                            dVar = new i0.d(new n[16]);
                                                        }
                                                        if (nVar8 != null) {
                                                            dVar.b(nVar8);
                                                            nVar8 = null;
                                                        }
                                                        dVar.b(nVar9);
                                                    }
                                                }
                                            }
                                            if (i34 == 1) {
                                            }
                                        }
                                        nVar8 = r1.f.f(dVar);
                                    }
                                }
                                nVar7 = nVar7.f8108j;
                            }
                        }
                        t8 = t8.s();
                        nVar7 = (t8 == null || (tVar3 = t8.A) == null) ? null : (o1) tVar3.f3894e;
                    }
                    if (arrayList != null && arrayList.size() - 1 >= 0) {
                        while (true) {
                            int i35 = size - 1;
                            if (((j1.d) arrayList.get(size)).l(keyEvent)) {
                                return true;
                            }
                            if (i35 < 0) {
                                break;
                            }
                            size = i35;
                        }
                    }
                    m mVar3 = nVar.f8104f;
                    ?? r32 = 0;
                    while (mVar3 != 0) {
                        if (mVar3 instanceof j1.d) {
                            if (((j1.d) mVar3).l(keyEvent)) {
                                return true;
                            }
                        } else if ((mVar3.f8106h & 8192) != 0 && (mVar3 instanceof m)) {
                            n nVar10 = mVar3.f7853t;
                            int i36 = 0;
                            mVar3 = mVar3;
                            r32 = r32;
                            while (nVar10 != null) {
                                if ((nVar10.f8106h & 8192) != 0) {
                                    i36++;
                                    r32 = r32;
                                    if (i36 == 1) {
                                        mVar3 = nVar10;
                                    } else {
                                        if (r32 == 0) {
                                            r32 = new i0.d(new n[16]);
                                        }
                                        if (mVar3 != 0) {
                                            r32.b(mVar3);
                                            mVar3 = 0;
                                        }
                                        r32.b(nVar10);
                                    }
                                }
                                nVar10 = nVar10.f8109k;
                                mVar3 = mVar3;
                                r32 = r32;
                            }
                            if (i36 == 1) {
                            }
                        }
                        mVar3 = r1.f.f(r32);
                    }
                    if (((Boolean) aVar.a()).booleanValue()) {
                        return true;
                    }
                    m mVar4 = nVar.f8104f;
                    ?? r33 = 0;
                    while (mVar4 != 0) {
                        if (mVar4 instanceof j1.d) {
                            if (((j1.d) mVar4).O(keyEvent)) {
                                return true;
                            }
                        } else if ((mVar4.f8106h & 8192) != 0 && (mVar4 instanceof m)) {
                            n nVar11 = mVar4.f7853t;
                            int i37 = 0;
                            mVar4 = mVar4;
                            r33 = r33;
                            while (nVar11 != null) {
                                if ((nVar11.f8106h & 8192) != 0) {
                                    i37++;
                                    r33 = r33;
                                    if (i37 == 1) {
                                        mVar4 = nVar11;
                                    } else {
                                        if (r33 == 0) {
                                            r33 = new i0.d(new n[16]);
                                        }
                                        if (mVar4 != 0) {
                                            r33.b(mVar4);
                                            mVar4 = 0;
                                        }
                                        r33.b(nVar11);
                                    }
                                }
                                nVar11 = nVar11.f8109k;
                                mVar4 = mVar4;
                                r33 = r33;
                            }
                            if (i37 == 1) {
                            }
                        }
                        mVar4 = r1.f.f(r33);
                    }
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        for (int i38 = 0; i38 < size2; i38++) {
                            if (((j1.d) arrayList.get(i38)).O(keyEvent)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        }
        n nVar12 = rVar.f8104f;
        if (!nVar12.f8116r) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        n nVar13 = nVar12.f8108j;
        d0 t9 = r1.f.t(rVar);
        loop17: while (true) {
            if (t9 == null) {
                mVar = 0;
                break;
            }
            if ((((n) t9.A.f3895f).f8107i & 8192) != 0) {
                while (nVar13 != null) {
                    if ((nVar13.f8106h & 8192) != 0) {
                        mVar = nVar13;
                        ?? r8 = 0;
                        while (mVar != 0) {
                            if (mVar instanceof j1.d) {
                                break loop17;
                            }
                            if ((mVar.f8106h & 8192) != 0 && (mVar instanceof m)) {
                                n nVar14 = mVar.f7853t;
                                int i39 = 0;
                                mVar = mVar;
                                r8 = r8;
                                while (nVar14 != null) {
                                    if ((nVar14.f8106h & 8192) != 0) {
                                        i39++;
                                        r8 = r8;
                                        if (i39 == 1) {
                                            mVar = nVar14;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new i0.d(new n[16]);
                                            }
                                            if (mVar != 0) {
                                                r8.b(mVar);
                                                mVar = 0;
                                            }
                                            r8.b(nVar14);
                                        }
                                    }
                                    nVar14 = nVar14.f8109k;
                                    mVar = mVar;
                                    r8 = r8;
                                }
                                if (i39 == 1) {
                                }
                            }
                            mVar = r1.f.f(r8);
                        }
                    }
                    nVar13 = nVar13.f8108j;
                }
            }
            t9 = t9.s();
            nVar13 = (t9 == null || (tVar = t9.A) == null) ? null : (o1) tVar.f3894e;
        }
        l lVar2 = (j1.d) mVar;
        nVar = lVar2 != null ? ((n) lVar2).f8104f : null;
        if (nVar != null) {
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [r1.o1] */
    /* JADX WARN: Type inference failed for: r3v5, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r5v13, types: [x0.r] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [i0.d] */
    public final Boolean c(int i7, y0.d dVar, q6.c cVar) {
        Boolean bool;
        boolean a3;
        Boolean bool2;
        t tVar;
        r rVar = this.f716f;
        r g9 = x0.d.g(rVar);
        int i8 = 4;
        j jVar = this.f715e;
        if (g9 != null) {
            m2.k kVar = (m2.k) jVar.get();
            bool = null;
            x0.j A0 = g9.A0();
            x0.n nVar = A0.f9619h;
            x0.n nVar2 = A0.f9620i;
            if (i7 == 1) {
                nVar = A0.f9613b;
            } else if (i7 == 2) {
                nVar = A0.f9614c;
            } else if (i7 == 5) {
                nVar = A0.f9615d;
            } else if (i7 == 6) {
                nVar = A0.f9616e;
            } else if (i7 == 3) {
                int ordinal = kVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        throw new b4.c();
                    }
                    nVar = nVar2;
                }
                if (nVar == x0.n.f9624b) {
                    nVar = null;
                }
                if (nVar == null) {
                    nVar = A0.f9617f;
                }
            } else if (i7 == 4) {
                int ordinal2 = kVar.ordinal();
                if (ordinal2 == 0) {
                    nVar = nVar2;
                } else if (ordinal2 != 1) {
                    throw new b4.c();
                }
                if (nVar == x0.n.f9624b) {
                    nVar = null;
                }
                if (nVar == null) {
                    nVar = A0.f9618g;
                }
            } else if (i7 == 7) {
                A0.f9621j.getClass();
                nVar = x0.n.f9624b;
            } else {
                if (i7 != 8) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                A0.f9622k.getClass();
                nVar = x0.n.f9624b;
            }
            if (!r6.k.a(nVar, x0.n.f9625c)) {
                if (!r6.k.a(nVar, x0.n.f9624b)) {
                    return Boolean.valueOf(nVar.a(cVar));
                }
            }
            return bool;
        }
        bool = null;
        g9 = null;
        m2.k kVar2 = (m2.k) jVar.get();
        c.h hVar = new c.h(g9, this, cVar);
        if (i7 == 1 || i7 == 2) {
            if (i7 == 1) {
                a3 = x0.d.k(rVar, hVar);
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                a3 = x0.d.a(rVar, hVar);
            }
            return Boolean.valueOf(a3);
        }
        if (i7 == 3 || i7 == 4 || i7 == 5 || i7 == 6) {
            return x0.d.K(i7, hVar, rVar, dVar);
        }
        if (i7 == 7) {
            int ordinal3 = kVar2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    throw new b4.c();
                }
                i8 = 3;
            }
            r g10 = x0.d.g(rVar);
            if (g10 != null) {
                return x0.d.K(i8, hVar, g10, dVar);
            }
            return bool;
        }
        if (i7 != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) x0.b.a(i7))).toString());
        }
        r g11 = x0.d.g(rVar);
        boolean z8 = false;
        if (g11 != null) {
            n nVar3 = g11.f8104f;
            if (!nVar3.f8116r) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            ?? r32 = nVar3.f8108j;
            d0 t2 = r1.f.t(g11);
            loop0: while (t2 != null) {
                if ((((n) t2.A.f3895f).f8107i & 1024) != 0) {
                    for (n nVar4 = r32; nVar4 != null; nVar4 = nVar4.f8108j) {
                        if ((nVar4.f8106h & 1024) != 0) {
                            m mVar = nVar4;
                            ?? r62 = bool;
                            while (mVar != 0) {
                                if (mVar instanceof r) {
                                    ?? r52 = (r) mVar;
                                    if (r52.A0().f9612a) {
                                        bool2 = r52;
                                        break loop0;
                                    }
                                } else if ((mVar.f8106h & 1024) != 0 && (mVar instanceof m)) {
                                    n nVar5 = mVar.f7853t;
                                    int i9 = 0;
                                    mVar = mVar;
                                    r62 = r62;
                                    while (nVar5 != null) {
                                        if ((nVar5.f8106h & 1024) != 0) {
                                            i9++;
                                            r62 = r62;
                                            if (i9 == 1) {
                                                mVar = nVar5;
                                            } else {
                                                if (r62 == 0) {
                                                    r62 = new i0.d(new n[16]);
                                                }
                                                if (mVar != 0) {
                                                    r62.b(mVar);
                                                    mVar = bool;
                                                }
                                                r62.b(nVar5);
                                            }
                                        }
                                        nVar5 = nVar5.f8109k;
                                        mVar = mVar;
                                        r62 = r62;
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                mVar = r1.f.f(r62);
                            }
                        }
                    }
                }
                t2 = t2.s();
                r32 = (t2 == null || (tVar = t2.A) == null) ? bool : (o1) tVar.f3894e;
            }
        }
        bool2 = bool;
        if (bool2 != null && !bool2.equals(rVar)) {
            z8 = ((Boolean) hVar.f(bool2)).booleanValue();
        }
        return Boolean.valueOf(z8);
    }

    public final boolean d(int i7) {
        v vVar = new v();
        vVar.f7968f = Boolean.FALSE;
        Boolean c4 = c(i7, (y0.d) this.f714d.a(), new l1.m(vVar, i7));
        if (c4 != null && vVar.f7968f != null) {
            Boolean bool = Boolean.TRUE;
            if (!c4.equals(bool) || !r6.k.a(vVar.f7968f, bool)) {
                if (i7 != 1 && i7 != 2) {
                    return ((Boolean) this.f712b.f(new x0.b(i7))).booleanValue();
                }
                if (a(i7, false, false)) {
                    Boolean c6 = c(i7, null, new x0.h(i7));
                    if (c6 != null ? c6.booleanValue() : false) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
