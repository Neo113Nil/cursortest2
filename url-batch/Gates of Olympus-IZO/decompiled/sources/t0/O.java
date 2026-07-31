package t0;

import I.C0125v0;
import e2.AbstractC0381e;
import j.C0502t;
import java.util.Map;
import r0.C0837j;
import r0.InterfaceC0838k;
import u0.C0997t;

/* loaded from: classes.dex */
public abstract class O extends r0.H implements r0.C, U {

    /* renamed from: i, reason: collision with root package name */
    public boolean f7823i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7824j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7825k;

    /* renamed from: l, reason: collision with root package name */
    public final r0.x f7826l = new r0.x(0, this);

    /* renamed from: m, reason: collision with root package name */
    public C0502t f7827m;

    /* renamed from: n, reason: collision with root package name */
    public C0502t f7828n;

    public static void n0(a0 a0Var) {
        E e3;
        a0 a0Var2 = a0Var.p;
        D d3 = a0Var2 != null ? a0Var2.f7877o : null;
        D d4 = a0Var.f7877o;
        if (!Z1.i.a(d3, d4)) {
            d4.f7736y.f7813r.f7791w.f();
            return;
        }
        InterfaceC0893a d5 = d4.f7736y.f7813r.d();
        if (d5 == null || (e3 = ((J) d5).f7791w) == null) {
            return;
        }
        e3.f();
    }

    @Override // r0.C
    public boolean B() {
        return false;
    }

    @Override // r0.C
    public final r0.B I(int i3, int i4, Map map, Y1.c cVar) {
        if ((i3 & (-16777216)) == 0 && ((-16777216) & i4) == 0) {
            return new M(i3, i4, map, cVar, this);
        }
        AbstractC0381e.N("Size(" + i3 + " x " + i4 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // r0.H
    public final int L(C0837j c0837j) {
        int W2;
        if (f0() && (W2 = W(c0837j)) != Integer.MIN_VALUE) {
            return W2 + ((int) (this.f7118h & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract int W(C0837j c0837j);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02c8, code lost:
    
        r13 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02ce, code lost:
    
        r13 = r13 * (-862048943);
        r13 = r13 ^ (r13 << 16);
        r15 = r1.b(r13 >>> 7);
        r24 = r8;
        r7 = r13 & 127;
        r13 = r15 >> 3;
        r29 = (r15 & 7) << 3;
        r36 = r2;
        r37 = r3;
        r2 = (r0[r13] & (~(255 << r29))) | (r7 << r29);
        r0[r13] = r2;
        r0[(((r15 - 7) & r10) + (r10 & 7)) >> 3] = r2;
        r6[r15] = r12;
        r24[r15] = r4[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x030e, code lost:
    
        r11 = r11 + 1;
        r8 = r24;
        r2 = r36;
        r3 = r37;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02cd, code lost:
    
        r13 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0308, code lost:
    
        r36 = r2;
        r37 = r3;
        r24 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x011e, code lost:
    
        r49 = r0;
        r1 = r2;
        r39 = r3;
        r44 = r7;
        r14 = r10;
        r47 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        r36 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ff, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0101, code lost:
    
        r4 = r2.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0107, code lost:
    
        if (r2.f5211f != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011c, code lost:
    
        if (((r2.f5206a[r4 >> 3] >> ((r4 & 7) << 3)) & 255) != 254) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012a, code lost:
    
        r4 = r2.f5209d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012e, code lost:
    
        if (r4 <= 8) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0146, code lost:
    
        if (java.lang.Long.compare((r2.f5210e * 32) ^ Long.MIN_VALUE, (r4 * 25) ^ Long.MIN_VALUE) > 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0148, code lost:
    
        r4 = r2.f5206a;
        r5 = r2.f5209d;
        r6 = r2.f5207b;
        r13 = r2.f5208c;
        j.AbstractC0478D.a(r4, r5);
        r39 = r3;
        r3 = -1;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0157, code lost:
    
        if (r15 == r5) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0159, code lost:
    
        r24 = r15 >> 3;
        r29 = (r15 & 7) << 3;
        r40 = (r4[r24] >> r29) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016b, code lost:
    
        if (r40 != 128) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0179, code lost:
    
        if (r40 == 254) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017e, code lost:
    
        r40 = r6[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0180, code lost:
    
        if (r40 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0182, code lost:
    
        r40 = r40.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0189, code lost:
    
        r40 = r40 * (-862048943);
        r40 = r40 ^ (r40 << 16);
        r14 = r40 >>> 7;
        r42 = r2.b(r14);
        r14 = r14 & r5;
        r44 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01aa, code lost:
    
        if ((((r42 - r14) & r5) / 8) != (((r15 - r14) & r5) / 8)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ac, code lost:
    
        r47 = r11;
        r49 = r0;
        r4[r24] = (r4[r24] & (~(255 << r29))) | ((r40 & 127) << r29);
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r15 + 1;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d1, code lost:
    
        r7 = r44;
        r11 = r47;
        r0 = r49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d9, code lost:
    
        r49 = r0;
        r14 = r10;
        r47 = r11;
        r0 = r42 >> 3;
        r10 = r4[r0];
        r1 = (r42 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f0, code lost:
    
        if (((r10 >> r1) & 255) != 128) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f2, code lost:
    
        r43 = r2;
        r4[r0] = ((~(255 << r1)) & r10) | ((r40 & 127) << r1);
        r4[r24] = (r4[r24] & (~(255 << r29))) | (128 << r29);
        r6[r42] = r6[r15];
        r6[r15] = null;
        r13[r42] = r13[r15];
        r13[r15] = 0.0f;
        r40 = r8;
        r2 = r13;
        r3 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0258, code lost:
    
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r15 + 1;
        r13 = r2;
        r10 = r14;
        r8 = r40;
        r2 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0222, code lost:
    
        r43 = r2;
        r7 = r40 & 127;
        r40 = r8;
        r2 = r13;
        r4[r0] = (r7 << r1) | (r10 & (~(255 << r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0236, code lost:
    
        if (r3 != (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0238, code lost:
    
        r3 = j.AbstractC0478D.b(r4, r15 + 1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x023e, code lost:
    
        r6[r3] = r6[r42];
        r6[r42] = r6[r15];
        r6[r15] = r6[r3];
        r2[r3] = r2[r42];
        r2[r42] = r2[r15];
        r2[r15] = r2[r3];
        r15 = r15 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0187, code lost:
    
        r40 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017b, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016d, code lost:
    
        r53 = r15;
        r15 = r15 + 1;
        r3 = r53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x026e, code lost:
    
        r49 = r0;
        r1 = r2;
        r44 = r7;
        r40 = r8;
        r14 = r10;
        r47 = r11;
        r1.f5211f = j.AbstractC0478D.c(r1.f5209d) - r1.f5210e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0318, code lost:
    
        r4 = r1.b(r40);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x031c, code lost:
    
        r1.f5210e++;
        r0 = r1.f5211f;
        r2 = r1.f5206a;
        r3 = r4 >> 3;
        r5 = r2[r3];
        r7 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0337, code lost:
    
        if (((r5 >> r7) & 255) != 128) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x033a, code lost:
    
        r32 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x033c, code lost:
    
        r1.f5211f = r0 - r32;
        r0 = r1.f5209d;
        r5 = (r5 & (~(255 << r7))) | (r49 << r7);
        r2[r3] = r5;
        r2[(((r4 - 7) & r0) + (r0 & 7)) >> 3] = r5;
        r0 = ~r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0288, code lost:
    
        r49 = r0;
        r1 = r2;
        r39 = r3;
        r44 = r7;
        r40 = r8;
        r14 = r10;
        r47 = r11;
        r7 = 0;
        r0 = j.AbstractC0478D.d(r1.f5209d);
        r2 = r1.f5206a;
        r3 = r1.f5207b;
        r4 = r1.f5208c;
        r5 = r1.f5209d;
        r1.d(r0);
        r0 = r1.f5206a;
        r6 = r1.f5207b;
        r8 = r1.f5208c;
        r10 = r1.f5209d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02af, code lost:
    
        if (r11 >= r5) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02c2, code lost:
    
        if (((r2[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= 128) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02c4, code lost:
    
        r12 = r3[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02c6, code lost:
    
        if (r12 == null) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(k0 k0Var) {
        C0502t c0502t;
        C0502t c0502t2;
        O l02;
        i0 snapshotObserver;
        Object[] objArr;
        float[] fArr;
        long[] jArr;
        C0502t c0502t3;
        C0502t c0502t4;
        Object[] objArr2;
        float[] fArr2;
        long[] jArr2;
        int i3;
        int i4;
        long j3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (!this.f7825k && k0Var.f7934d.k() != null) {
            C0502t c0502t5 = this.f7828n;
            if (c0502t5 == null) {
                c0502t5 = new C0502t();
                this.f7828n = c0502t5;
            }
            C0502t c0502t6 = this.f7827m;
            if (c0502t6 == null) {
                c0502t6 = new C0502t();
                this.f7827m = c0502t6;
            }
            Object[] objArr3 = c0502t6.f5207b;
            float[] fArr3 = c0502t6.f5208c;
            long[] jArr3 = c0502t6.f5206a;
            int length = jArr3.length - 2;
            char c3 = 7;
            long j4 = -9187201950435737472L;
            int i10 = 8;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j5 = jArr3[i11];
                    if ((((~j5) << c3) & j5 & j4) != j4) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j5 & 255) < 128) {
                                int i14 = (i11 << 3) + i13;
                                Object obj = objArr3[i14];
                                float f3 = fArr3[i14];
                                int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                                int i15 = hashCode ^ (hashCode << 16);
                                int i16 = i15 >>> 7;
                                int i17 = i15 & 127;
                                objArr2 = objArr3;
                                int i18 = c0502t5.f5209d;
                                int i19 = i16 & i18;
                                fArr2 = fArr3;
                                int i20 = 0;
                                while (true) {
                                    long[] jArr4 = c0502t5.f5206a;
                                    int i21 = i19 >> 3;
                                    jArr2 = jArr3;
                                    int i22 = (i19 & 7) << 3;
                                    int i23 = 1;
                                    long j6 = (jArr4[i21] >>> i22) | ((jArr4[i21 + 1] << (64 - i22)) & ((-i22) >> 63));
                                    long j7 = i17;
                                    i5 = i12;
                                    i6 = i13;
                                    long j8 = j6 ^ (j7 * 72340172838076673L);
                                    long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L);
                                    while (true) {
                                        if (j9 == 0) {
                                            break;
                                        }
                                        int numberOfTrailingZeros = (i19 + (Long.numberOfTrailingZeros(j9) >> 3)) & i18;
                                        int i24 = i17;
                                        if (Z1.i.a(c0502t5.f5207b[numberOfTrailingZeros], obj)) {
                                            c0502t3 = c0502t5;
                                            c0502t4 = c0502t6;
                                            i3 = length;
                                            i7 = i11;
                                            j3 = j5;
                                            i9 = numberOfTrailingZeros;
                                            break;
                                        }
                                        j9 &= j9 - 1;
                                        i17 = i24;
                                    }
                                    i20 += 8;
                                    i19 = (i19 + i20) & i18;
                                    c0502t5 = c0502t5;
                                    i12 = i5;
                                    jArr3 = jArr2;
                                    i17 = i8;
                                    i13 = i6;
                                }
                                if (i9 < 0) {
                                    i9 = ~i9;
                                }
                                c0502t3.f5207b[i9] = obj;
                                c0502t3.f5208c[i9] = f3;
                                i4 = 8;
                            } else {
                                c0502t3 = c0502t5;
                                c0502t4 = c0502t6;
                                objArr2 = objArr3;
                                fArr2 = fArr3;
                                jArr2 = jArr3;
                                i3 = length;
                                i4 = i10;
                                j3 = j5;
                                i5 = i12;
                                i6 = i13;
                                i7 = i11;
                            }
                            j5 = j3 >> i4;
                            i10 = i4;
                            i11 = i7;
                            objArr3 = objArr2;
                            fArr3 = fArr2;
                            i12 = i5;
                            jArr3 = jArr2;
                            c0502t6 = c0502t4;
                            length = i3;
                            i13 = i6 + 1;
                            c0502t5 = c0502t3;
                        }
                        c0502t = c0502t5;
                        c0502t2 = c0502t6;
                        objArr = objArr3;
                        fArr = fArr3;
                        jArr = jArr3;
                        int i25 = length;
                        int i26 = i11;
                        if (i12 != i10) {
                            break;
                        }
                        i11 = i26;
                        length = i25;
                    } else {
                        c0502t = c0502t5;
                        c0502t2 = c0502t6;
                        objArr = objArr3;
                        fArr = fArr3;
                        jArr = jArr3;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    c0502t5 = c0502t;
                    objArr3 = objArr;
                    fArr3 = fArr;
                    jArr3 = jArr;
                    c0502t6 = c0502t2;
                    i10 = 8;
                    c3 = 7;
                    j4 = -9187201950435737472L;
                }
            } else {
                c0502t = c0502t5;
                c0502t2 = c0502t6;
            }
            c0502t2.a();
            C0997t c0997t = j0().f7724l;
            if (c0997t != null && (snapshotObserver = c0997t.getSnapshotObserver()) != null) {
                snapshotObserver.a(k0Var, C0897e.f7897g, new C0125v0(k0Var, 10, this));
            }
            C0502t c0502t7 = c0502t2;
            Object[] objArr4 = c0502t7.f5207b;
            long[] jArr5 = c0502t7.f5206a;
            int length2 = jArr5.length - 2;
            if (length2 >= 0) {
                int i27 = 0;
                while (true) {
                    long j10 = jArr5[i27];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i28 = 8 - ((~(i27 - length2)) >>> 31);
                        long j11 = j10;
                        for (int i29 = 0; i29 < i28; i29++) {
                            if ((j11 & 255) < 128) {
                                if (objArr4[(i27 << 3) + i29] != null) {
                                    throw new ClassCastException();
                                }
                                if (c0502t.c(null) < 0 && (l02 = l0()) != null) {
                                    do {
                                        C0502t c0502t8 = l02.f7827m;
                                        if (c0502t8 != null && c0502t8.c(null) >= 0) {
                                            break;
                                        } else {
                                            l02 = l02.l0();
                                        }
                                    } while (l02 != null);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i28 != 8) {
                            break;
                        }
                    }
                    if (i27 == length2) {
                        break;
                    } else {
                        i27++;
                    }
                }
            }
            c0502t.a();
        }
    }

    public abstract O d0();

    public abstract InterfaceC0838k e0();

    public abstract boolean f0();

    public abstract D j0();

    public abstract r0.B k0();

    public abstract O l0();

    public abstract long m0();

    public abstract void o0();

    @Override // t0.U
    public final void v(boolean z3) {
        this.f7823i = z3;
    }
}
