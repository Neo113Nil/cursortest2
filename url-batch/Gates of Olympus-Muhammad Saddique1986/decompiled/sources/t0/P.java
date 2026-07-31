package t0;

import e2.InterfaceC0424c;
import j.C0546t;
import java.util.Map;
import n.z0;
import r0.AbstractC0893O;
import r0.C0882D;
import r0.C0915l;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import r0.InterfaceC0919p;
import u0.C1123s;

/* loaded from: classes.dex */
public abstract class P extends AbstractC0893O implements InterfaceC0887I, V {

    /* renamed from: i, reason: collision with root package name */
    public boolean f8652i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8653j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8654k;

    /* renamed from: l, reason: collision with root package name */
    public final C0882D f8655l = new C0882D(0, this);

    /* renamed from: m, reason: collision with root package name */
    public C0546t f8656m;

    /* renamed from: n, reason: collision with root package name */
    public C0546t f8657n;

    public static void w0(b0 b0Var) {
        F f3;
        b0 b0Var2 = b0Var.f8712p;
        E e3 = b0Var2 != null ? b0Var2.f8711o : null;
        E e4 = b0Var.f8711o;
        if (!f2.j.a(e3, e4)) {
            e4.f8562z.f8642r.f8619w.f();
            return;
        }
        InterfaceC0988a g3 = e4.f8562z.f8642r.g();
        if (g3 == null || (f3 = ((K) g3).f8619w) == null) {
            return;
        }
        f3.f();
    }

    @Override // t0.V
    public final void C(boolean z3) {
        this.f8652i = z3;
    }

    @Override // r0.InterfaceC0916m
    public boolean D() {
        return false;
    }

    @Override // r0.AbstractC0893O
    public final int W(C0915l c0915l) {
        int n02;
        if (r0() && (n02 = n0(c0915l)) != Integer.MIN_VALUE) {
            return n02 + ((int) (this.f8130h & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract int n0(C0915l c0915l);

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
    
        if (r2.f6329f != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011c, code lost:
    
        if (((r2.f6324a[r4 >> 3] >> ((r4 & 7) << 3)) & 255) != 254) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012a, code lost:
    
        r4 = r2.f6327d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012e, code lost:
    
        if (r4 <= 8) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0146, code lost:
    
        if (java.lang.Long.compare((r2.f6328e * 32) ^ Long.MIN_VALUE, (r4 * 25) ^ Long.MIN_VALUE) > 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0148, code lost:
    
        r4 = r2.f6324a;
        r5 = r2.f6327d;
        r6 = r2.f6325b;
        r13 = r2.f6326c;
        j.AbstractC0522D.a(r4, r5);
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
    
        r3 = j.AbstractC0522D.b(r4, r15 + 1, r5);
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
        r1.f6329f = j.AbstractC0522D.c(r1.f6327d) - r1.f6328e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0318, code lost:
    
        r4 = r1.b(r40);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x031c, code lost:
    
        r1.f6328e++;
        r0 = r1.f6329f;
        r2 = r1.f6324a;
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
    
        r1.f6329f = r0 - r32;
        r0 = r1.f6327d;
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
        r0 = j.AbstractC0522D.d(r1.f6327d);
        r2 = r1.f6324a;
        r3 = r1.f6325b;
        r4 = r1.f6326c;
        r5 = r1.f6327d;
        r1.d(r0);
        r0 = r1.f6324a;
        r6 = r1.f6325b;
        r8 = r1.f6326c;
        r10 = r1.f6327d;
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
    public final void o0(l0 l0Var) {
        C0546t c0546t;
        C0546t c0546t2;
        P u02;
        j0 snapshotObserver;
        Object[] objArr;
        float[] fArr;
        long[] jArr;
        C0546t c0546t3;
        C0546t c0546t4;
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
        if (!this.f8654k && l0Var.f8768d.k() != null) {
            C0546t c0546t5 = this.f8657n;
            if (c0546t5 == null) {
                c0546t5 = new C0546t();
                this.f8657n = c0546t5;
            }
            C0546t c0546t6 = this.f8656m;
            if (c0546t6 == null) {
                c0546t6 = new C0546t();
                this.f8656m = c0546t6;
            }
            Object[] objArr3 = c0546t6.f6325b;
            float[] fArr3 = c0546t6.f6326c;
            long[] jArr3 = c0546t6.f6324a;
            int length = jArr3.length - 2;
            char c2 = 7;
            long j4 = -9187201950435737472L;
            int i10 = 8;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j5 = jArr3[i11];
                    if ((((~j5) << c2) & j5 & j4) != j4) {
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
                                int i18 = c0546t5.f6327d;
                                int i19 = i16 & i18;
                                fArr2 = fArr3;
                                int i20 = 0;
                                while (true) {
                                    long[] jArr4 = c0546t5.f6324a;
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
                                        if (f2.j.a(c0546t5.f6325b[numberOfTrailingZeros], obj)) {
                                            c0546t3 = c0546t5;
                                            c0546t4 = c0546t6;
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
                                    c0546t5 = c0546t5;
                                    i12 = i5;
                                    jArr3 = jArr2;
                                    i17 = i8;
                                    i13 = i6;
                                }
                                if (i9 < 0) {
                                    i9 = ~i9;
                                }
                                c0546t3.f6325b[i9] = obj;
                                c0546t3.f6326c[i9] = f3;
                                i4 = 8;
                            } else {
                                c0546t3 = c0546t5;
                                c0546t4 = c0546t6;
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
                            c0546t6 = c0546t4;
                            length = i3;
                            i13 = i6 + 1;
                            c0546t5 = c0546t3;
                        }
                        c0546t = c0546t5;
                        c0546t2 = c0546t6;
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
                        c0546t = c0546t5;
                        c0546t2 = c0546t6;
                        objArr = objArr3;
                        fArr = fArr3;
                        jArr = jArr3;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    c0546t5 = c0546t;
                    objArr3 = objArr;
                    fArr3 = fArr;
                    jArr3 = jArr;
                    c0546t6 = c0546t2;
                    i10 = 8;
                    c2 = 7;
                    j4 = -9187201950435737472L;
                }
            } else {
                c0546t = c0546t5;
                c0546t2 = c0546t6;
            }
            c0546t2.a();
            C1123s c1123s = s0().f8548l;
            if (c1123s != null && (snapshotObserver = c1123s.getSnapshotObserver()) != null) {
                snapshotObserver.a(l0Var, C0992e.f8729g, new B.f0(l0Var, 9, this));
            }
            C0546t c0546t7 = c0546t2;
            Object[] objArr4 = c0546t7.f6325b;
            long[] jArr5 = c0546t7.f6324a;
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
                                if (c0546t.c(null) < 0 && (u02 = u0()) != null) {
                                    do {
                                        C0546t c0546t8 = u02.f8656m;
                                        if (c0546t8 != null && c0546t8.c(null) >= 0) {
                                            break;
                                        } else {
                                            u02 = u02.u0();
                                        }
                                    } while (u02 != null);
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
            c0546t.a();
        }
    }

    public abstract P p0();

    @Override // r0.InterfaceC0887I
    public final InterfaceC0886H q(int i3, int i4, Map map, InterfaceC0424c interfaceC0424c) {
        if ((i3 & (-16777216)) == 0 && ((-16777216) & i4) == 0) {
            return new N(i3, i4, map, interfaceC0424c, this);
        }
        z0.o("Size(" + i3 + " x " + i4 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    public abstract InterfaceC0919p q0();

    public abstract boolean r0();

    public abstract E s0();

    public abstract InterfaceC0886H t0();

    public abstract P u0();

    public abstract long v0();

    public abstract void x0();
}
