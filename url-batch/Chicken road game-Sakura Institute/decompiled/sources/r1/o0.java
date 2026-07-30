package r1;

import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class o0 extends p1.n0 implements p1.h0, t0 {

    /* renamed from: k, reason: collision with root package name */
    public boolean f7863k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7864l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7865m;

    /* renamed from: n, reason: collision with root package name */
    public final p1.c0 f7866n = new p1.c0(0, this);

    /* renamed from: o, reason: collision with root package name */
    public i.t f7867o;

    /* renamed from: p, reason: collision with root package name */
    public i.t f7868p;

    public static void y0(a1 a1Var) {
        e0 e0Var;
        a1 a1Var2 = a1Var.f7701r;
        d0 d0Var = a1Var.f7700q;
        if (!r6.k.a(a1Var2 != null ? a1Var2.f7700q : null, d0Var)) {
            d0Var.B.f7848r.f7825y.f();
            return;
        }
        a A = d0Var.B.f7848r.A();
        if (A == null || (e0Var = ((j0) A).f7825y) == null) {
            return;
        }
        e0Var.f();
    }

    @Override // r1.t0
    public final void S(boolean z8) {
        this.f7863k = z8;
    }

    @Override // p1.n0
    public final int f0(p1.l lVar) {
        int p02;
        if (t0() && (p02 = p0(lVar)) != Integer.MIN_VALUE) {
            return p02 + ((int) (this.f7067j & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract int p0(p1.l lVar);

    @Override // p1.h0
    public final p1.g0 q(int i7, int i8, Map map, q6.c cVar) {
        if ((i7 & (-16777216)) == 0 && ((-16777216) & i8) == 0) {
            return new m0(i7, i8, map, cVar, this);
        }
        a.a.M("Size(" + i7 + " x " + i8 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02e0, code lost:
    
        r4 = r38 + 1;
        r5 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x029d, code lost:
    
        r37 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02dc, code lost:
    
        r38 = r4;
        r37 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0119, code lost:
    
        r43 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        r38 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fd, code lost:
    
        r4 = r2.b(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
    
        if (r2.f4797f != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0117, code lost:
    
        if (((r2.f4792a[r4 >> 3] >> ((r4 & 7) << 3)) & 255) != 254) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011d, code lost:
    
        r4 = r2.f4795d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0121, code lost:
    
        if (r4 <= 8) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013b, code lost:
    
        if (java.lang.Long.compare((r2.f4796e * 32) ^ Long.MIN_VALUE, (r4 * 25) ^ Long.MIN_VALUE) > 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013d, code lost:
    
        r4 = r2.f4792a;
        r5 = r2.f4795d;
        r6 = r2.f4793b;
        r11 = r2.f4794c;
        i.e0.a(r4, r5);
        r12 = 0;
        r6 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014d, code lost:
    
        if (r12 == r5) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014f, code lost:
    
        r39 = r12 >> 3;
        r44 = (r12 & 7) << 3;
        r42 = (r4[r39] >> r44) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015d, code lost:
    
        if (r42 != 128) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0169, code lost:
    
        if (r42 == 254) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016e, code lost:
    
        r42 = r6[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0170, code lost:
    
        if (r42 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0172, code lost:
    
        r42 = r42.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0179, code lost:
    
        r42 = r42 * (-862048943);
        r43 = r8;
        r8 = (r42 ^ (r42 << 16)) >>> 7;
        r45 = r2.b(r8);
        r8 = r8 & r5;
        r47 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019f, code lost:
    
        if ((((r45 - r8) & r5) / 8) != (((r12 - r8) & r5) / 8)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a1, code lost:
    
        r4[r39] = (r4[r39] & (~(255 << r44))) | ((r42 & 127) << r44);
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c2, code lost:
    
        r8 = r43;
        r11 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c7, code lost:
    
        r46 = r12;
        r8 = r45 >> 3;
        r11 = r4[r8];
        r50 = (r45 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d7, code lost:
    
        if (((r11 >> r50) & 255) != 128) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d9, code lost:
    
        r4[r8] = (r11 & (~(255 << r50))) | ((r42 & 127) << r50);
        r4[r39] = (r4[r39] & (~(255 << r44))) | (128 << r44);
        r6[r45] = r6[r46];
        r6[r46] = null;
        r47[r45] = r47[r46];
        r47[r46] = 0.0f;
        r6 = r46;
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0241, code lost:
    
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x020c, code lost:
    
        r4[r8] = (r11 & (~(255 << r50))) | ((r42 & 127) << r50);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x021f, code lost:
    
        if (r6 != (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0221, code lost:
    
        r6 = i.e0.b(r4, r46 + 1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0227, code lost:
    
        r6[r6] = r6[r45];
        r6[r45] = r6[r46];
        r6[r46] = r6[r6];
        r47[r6] = r47[r45];
        r47[r45] = r47[r46];
        r47[r46] = r47[r6];
        r12 = r46 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0177, code lost:
    
        r42 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016b, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015f, code lost:
    
        r55 = r12;
        r12 = r12 + 1;
        r6 = r55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0250, code lost:
    
        r43 = r8;
        r2.f4797f = i.e0.c(r2.f4795d) - r2.f4796e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02e5, code lost:
    
        r4 = r2.b(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02e9, code lost:
    
        r2.f4796e++;
        r5 = r2.f4797f;
        r6 = r2.f4792a;
        r8 = r4 >> 3;
        r11 = r6[r8];
        r15 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0301, code lost:
    
        if (((r11 >> r15) & 255) != 128) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0304, code lost:
    
        r33 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0306, code lost:
    
        r2.f4797f = r5 - r33;
        r5 = r2.f4795d;
        r5 = ((~(255 << r15)) & r11) | (r11 << r15);
        r6[r8] = r5;
        r6[(((r4 - 7) & r5) + (r5 & 7)) >> 3] = r5;
        r4 = ~r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x025f, code lost:
    
        r43 = r8;
        r4 = i.e0.d(r2.f4795d);
        r5 = r2.f4792a;
        r6 = r2.f4793b;
        r8 = r2.f4794c;
        r11 = r2.f4795d;
        r2.d(r4);
        r4 = r2.f4792a;
        r12 = r2.f4793b;
        r4 = r2.f4794c;
        r4 = r2.f4795d;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0282, code lost:
    
        if (r4 >= r11) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0292, code lost:
    
        if (((r5[r4 >> 3] >> ((r4 & 7) << 3)) & 255) >= 128) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0294, code lost:
    
        r36 = r6[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0296, code lost:
    
        if (r36 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0298, code lost:
    
        r37 = r36.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x029f, code lost:
    
        r37 = r37 * (-862048943);
        r37 = r37 ^ (r37 << 16);
        r38 = r4;
        r4 = r2.b(r37 >>> 7);
        r4 = r37 & 127;
        r37 = r5;
        r42 = r4 >> 3;
        r44 = (r4 & 7) << 3;
        r4 = (r4[r42] & (~(255 << r44))) | (r4 << r44);
        r4[r42] = r4;
        r4[(((r4 - 7) & r4) + (r4 & 7)) >> 3] = r4;
        r12[r4] = r36;
        r4[r4] = r8[r38];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0(k1 k1Var) {
        long j8;
        long j9;
        long j10;
        Object obj;
        Object obj2;
        Object obj3;
        o0 w02;
        i1 snapshotObserver;
        Object[] objArr;
        float[] fArr;
        long[] jArr;
        Object[] objArr2;
        float[] fArr2;
        long[] jArr2;
        long j11;
        int i7;
        int i8;
        Object obj4;
        int i9;
        if (this.f7865m || k1Var.f7829f.q() == null) {
            return;
        }
        i.t tVar = this.f7868p;
        if (tVar == null) {
            tVar = new i.t();
            this.f7868p = tVar;
        }
        i.t tVar2 = this.f7867o;
        if (tVar2 == null) {
            tVar2 = new i.t();
            this.f7867o = tVar2;
        }
        Object[] objArr3 = tVar2.f4793b;
        float[] fArr3 = tVar2.f4794c;
        long[] jArr3 = tVar2.f4792a;
        int length = jArr3.length - 2;
        int i10 = 8;
        if (length >= 0) {
            int i11 = 0;
            j8 = 255;
            j9 = 128;
            while (true) {
                long j12 = jArr3[i11];
                j10 = -9187201950435737472L;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j12 & 255) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj5 = objArr3[i14];
                            float f9 = fArr3[i14];
                            int hashCode = (obj5 != null ? obj5.hashCode() : 0) * (-862048943);
                            int i15 = hashCode ^ (hashCode << 16);
                            int i16 = i15 >>> 7;
                            objArr2 = objArr3;
                            int i17 = i15 & 127;
                            fArr2 = fArr3;
                            int i18 = tVar.f4795d;
                            int i19 = i16 & i18;
                            int i20 = 0;
                            while (true) {
                                long[] jArr4 = tVar.f4792a;
                                int i21 = i19 >> 3;
                                int i22 = (i19 & 7) << 3;
                                long j13 = jArr4[i21] >>> i22;
                                int i23 = 1;
                                long j14 = jArr4[i21 + 1] << (64 - i22);
                                jArr2 = jArr3;
                                long j15 = j13 | (j14 & ((-i22) >> 63));
                                j11 = j12;
                                long j16 = i17;
                                long j17 = j15 ^ (j16 * 72340172838076673L);
                                long j18 = (j17 - 72340172838076673L) & (~j17) & (-9187201950435737472L);
                                while (true) {
                                    if (j18 == 0) {
                                        break;
                                    }
                                    int numberOfTrailingZeros = (i19 + (Long.numberOfTrailingZeros(j18) >> 3)) & i18;
                                    int i24 = i17;
                                    if (r6.k.a(tVar.f4793b[numberOfTrailingZeros], obj5)) {
                                        obj4 = obj5;
                                        i9 = numberOfTrailingZeros;
                                        break;
                                    } else {
                                        j18 &= j18 - 1;
                                        i17 = i24;
                                    }
                                }
                                i20 += 8;
                                i19 = (i19 + i20) & i18;
                                jArr3 = jArr2;
                                j12 = j11;
                                i17 = i8;
                            }
                            if (i9 < 0) {
                                i9 = ~i9;
                            }
                            tVar.f4793b[i9] = obj4;
                            tVar.f4794c[i9] = f9;
                            i7 = 8;
                        } else {
                            objArr2 = objArr3;
                            fArr2 = fArr3;
                            jArr2 = jArr3;
                            j11 = j12;
                            i7 = i10;
                        }
                        j12 = j11 >> i7;
                        i13++;
                        i10 = i7;
                        fArr3 = fArr2;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                    }
                    objArr = objArr3;
                    fArr = fArr3;
                    jArr = jArr3;
                    obj = null;
                    if (i12 != i10) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                    fArr = fArr3;
                    jArr = jArr3;
                    obj = null;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                fArr3 = fArr;
                objArr3 = objArr;
                jArr3 = jArr;
                i10 = 8;
            }
        } else {
            j8 = 255;
            j9 = 128;
            j10 = -9187201950435737472L;
            obj = null;
        }
        tVar2.a();
        g1 g1Var = u0().f7727n;
        if (g1Var != null && (snapshotObserver = ((s1.r) g1Var).getSnapshotObserver()) != null) {
            snapshotObserver.a(k1Var, e.f7742i, new a0.b1(k1Var, 7, this));
        }
        Object[] objArr4 = tVar2.f4793b;
        long[] jArr5 = tVar2.f4792a;
        int length2 = jArr5.length - 2;
        if (length2 >= 0) {
            int i25 = 0;
            while (true) {
                long j19 = jArr5[i25];
                if ((((~j19) << 7) & j19 & j10) != j10) {
                    int i26 = 8 - ((~(i25 - length2)) >>> 31);
                    int i27 = 0;
                    while (i27 < i26) {
                        if ((j19 & j8) >= j9) {
                            obj3 = obj;
                        } else {
                            if (objArr4[(i25 << 3) + i27] != null) {
                                throw new ClassCastException();
                            }
                            obj3 = obj;
                            if (tVar.c(obj3) < 0 && (w02 = w0()) != null) {
                                do {
                                    i.t tVar3 = w02.f7867o;
                                    if (tVar3 != null && tVar3.c(obj3) >= 0) {
                                        break;
                                    } else {
                                        w02 = w02.w0();
                                    }
                                } while (w02 != null);
                            }
                        }
                        j19 >>= 8;
                        i27++;
                        obj = obj3;
                    }
                    obj2 = obj;
                    if (i26 != 8) {
                        break;
                    }
                } else {
                    obj2 = obj;
                }
                if (i25 == length2) {
                    break;
                }
                i25++;
                obj = obj2;
            }
        }
        tVar.a();
    }

    public abstract o0 r0();

    public abstract p1.p s0();

    public abstract boolean t0();

    public abstract d0 u0();

    @Override // p1.m
    public boolean v() {
        return false;
    }

    public abstract p1.g0 v0();

    public abstract o0 w0();

    public abstract long x0();

    public abstract void z0();
}
