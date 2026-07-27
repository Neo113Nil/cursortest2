package r0;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import p0.AbstractC0954O;
import p0.C0942C;
import p0.C0976l;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import p0.InterfaceC0980p;
import s0.C1166s;

/* loaded from: classes.dex */
public abstract class O extends AbstractC0954O implements U, InterfaceC0947H {

    /* renamed from: l, reason: collision with root package name */
    public boolean f9701l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9702m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9703n;

    /* renamed from: o, reason: collision with root package name */
    public final C0942C f9704o = new C0942C(0, this);

    /* renamed from: p, reason: collision with root package name */
    public i.u f9705p;

    /* renamed from: q, reason: collision with root package name */
    public i.u f9706q;

    public static void A0(a0 a0Var) {
        F f4;
        a0 a0Var2 = a0Var.f9763s;
        E e4 = a0Var2 != null ? a0Var2.f9762r : null;
        E e5 = a0Var.f9762r;
        if (!Intrinsics.a(e4, e5)) {
            e5.f9584C.f9691r.f9673z.f();
            return;
        }
        InterfaceC1060a d4 = e5.f9584C.f9691r.d();
        if (d4 == null || (f4 = ((K) d4).f9673z) == null) {
            return;
        }
        f4.f();
    }

    @Override // p0.InterfaceC0977m
    public boolean A() {
        return false;
    }

    public abstract void B0();

    @Override // p0.InterfaceC0947H
    public final InterfaceC0946G b0(int i2, int i4, Map map, Function1 function1) {
        if ((i2 & (-16777216)) == 0 && ((-16777216) & i4) == 0) {
            return new M(i2, i4, map, function1, this);
        }
        AbstractC0864b.D("Size(" + i2 + " x " + i4 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // p0.AbstractC0954O
    public final int e0(C0976l c0976l) {
        int r02;
        if (v0() && (r02 = r0(c0976l)) != Integer.MIN_VALUE) {
            return r02 + ((int) (this.f9009k & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract int r0(C0976l c0976l);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02f6, code lost:
    
        r14 = r13.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02fc, code lost:
    
        r14 = r14 * (-862048943);
        r14 = r14 ^ (r14 << 16);
        r0 = r5.b(r14 >>> 7);
        r19 = r4;
        r3 = r14 & 127;
        r14 = r0 >> 3;
        r16 = (r0 & 7) << 3;
        r36 = r2;
        r1 = (r2[r14] & (~(255 << r16))) | (r3 << r16);
        r36[r14] = r1;
        r36[(((r0 - 7) & r11) + (r11 & 7)) >> 3] = r1;
        r9[r0] = r13;
        r10[r0] = r7[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x033a, code lost:
    
        r12 = r12 + 1;
        r4 = r19;
        r2 = r36;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02fb, code lost:
    
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0335, code lost:
    
        r36 = r2;
        r19 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0342, code lost:
    
        r0 = 1;
        r1 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0120, code lost:
    
        r51 = r0;
        r42 = r2;
        r41 = r3;
        r37 = r6;
        r47 = r12;
        r34 = r14;
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f6, code lost:
    
        r36 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0100, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0102, code lost:
    
        r4 = r5.b(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0108, code lost:
    
        if (r5.f6967f != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011e, code lost:
    
        if (((r5.f6962a[r4 >> 3] >> ((r4 & 7) << 3)) & 255) != 254) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012f, code lost:
    
        r4 = r5.f6965d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0133, code lost:
    
        if (r4 <= 8) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0135, code lost:
    
        r7 = r5.f6966e;
        r11 = y2.y.f11688e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0147, code lost:
    
        if (java.lang.Long.compareUnsigned(r7 * 32, r4 * 25) > 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
    
        r4 = r5.f6962a;
        r7 = r5.f6965d;
        r8 = r5.f6963b;
        r9 = r5.f6964c;
        i.AbstractC0664E.a(r4, r7);
        r10 = 0;
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0156, code lost:
    
        if (r10 == r7) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0158, code lost:
    
        r33 = r10 >> 3;
        r34 = (r10 & 7) << 3;
        r36 = (r4[r33] >> r34) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016c, code lost:
    
        if (r36 != 128) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017e, code lost:
    
        if (r36 == 254) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0183, code lost:
    
        r36 = r8[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0185, code lost:
    
        if (r36 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0187, code lost:
    
        r36 = r36.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018e, code lost:
    
        r36 = r36 * (-862048943);
        r37 = r6;
        r6 = (r36 ^ (r36 << 16)) >>> 7;
        r40 = r5.b(r6);
        r6 = r6 & r7;
        r42 = r2;
        r41 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b9, code lost:
    
        if ((((r40 - r6) & r7) / 8) != (((r10 - r6) & r7) / 8)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01bb, code lost:
    
        r51 = r0;
        r4[r33] = (r4[r33] & (~(255 << r34))) | ((r36 & 127) << r34);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "<this>");
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r10 = r10 + 1;
        r6 = r37;
        r3 = r41;
        r2 = r42;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e8, code lost:
    
        r0 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ec, code lost:
    
        r51 = r0;
        r47 = r12;
        r1 = r40 >> 3;
        r12 = r4[r1];
        r2 = (r40 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0203, code lost:
    
        if (((r12 >> r2) & 255) != 128) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0205, code lost:
    
        r50 = r15;
        r4[r1] = ((r36 & 127) << r2) | (r12 & (~(255 << r2)));
        r4[r33] = (r4[r33] & (~(255 << r34))) | (128 << r34);
        r8[r40] = r8[r10];
        r8[r10] = null;
        r9[r40] = r9[r10];
        r9[r10] = 0.0f;
        r33 = r5;
        r34 = r14;
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0272, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "<this>");
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r10 = r10 + 1;
        r5 = r33;
        r14 = r34;
        r6 = r37;
        r3 = r41;
        r2 = r42;
        r12 = r47;
        r15 = r50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0238, code lost:
    
        r50 = r15;
        r33 = r5;
        r34 = r14;
        r4[r1] = ((r36 & 127) << r2) | ((~(255 << r2)) & r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x024f, code lost:
    
        if (r11 != (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0251, code lost:
    
        r11 = i.AbstractC0664E.b(r4, r10 + 1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0258, code lost:
    
        r8[r11] = r8[r40];
        r8[r40] = r8[r10];
        r8[r10] = r8[r11];
        r9[r11] = r9[r40];
        r9[r40] = r9[r10];
        r9[r10] = r9[r11];
        r10 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018c, code lost:
    
        r36 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0180, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016e, code lost:
    
        r11 = r10;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0292, code lost:
    
        r51 = r0;
        r42 = r2;
        r41 = r3;
        r37 = r6;
        r47 = r12;
        r34 = r14;
        r5.f6967f = i.AbstractC0664E.c(r5.f6965d) - r5.f6966e;
        r1 = r15;
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0345, code lost:
    
        r4 = r5.b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0349, code lost:
    
        r5.f6966e += r0;
        r1 = r5.f6967f;
        r2 = r5.f6962a;
        r3 = r4 >> 3;
        r6 = r2[r3];
        r8 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0364, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0366, code lost:
    
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0369, code lost:
    
        r5.f6967f = r1 - r14;
        r1 = r5.f6965d;
        r6 = (r6 & (~(255 << r8))) | (r51 << r8);
        r2[r3] = r6;
        r2[(((r4 - 7) & r1) + (r1 & 7)) >> 3] = r6;
        r1 = ~r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0368, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02b2, code lost:
    
        r51 = r0;
        r42 = r2;
        r41 = r3;
        r37 = r6;
        r47 = r12;
        r34 = r14;
        r3 = 0;
        r2 = i.AbstractC0664E.d(r5.f6965d);
        r4 = r5.f6962a;
        r6 = r5.f6963b;
        r7 = r5.f6964c;
        r8 = r5.f6965d;
        r5.d(r2);
        r2 = r5.f6962a;
        r9 = r5.f6963b;
        r10 = r5.f6964c;
        r11 = r5.f6965d;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02dc, code lost:
    
        if (r12 >= r8) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02f0, code lost:
    
        if (((r4[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02f2, code lost:
    
        r13 = r6[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02f4, code lost:
    
        if (r13 == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0(k0 k0Var) {
        i.u uVar;
        int i2;
        O y02;
        i0 snapshotObserver;
        Object[] objArr;
        float[] fArr;
        long[] jArr;
        int i4;
        int i5;
        int i6;
        i.u uVar2;
        Object[] objArr2;
        float[] fArr2;
        long[] jArr2;
        int i7;
        int i8;
        long j4;
        int i9;
        Object obj;
        int i10;
        char c4 = 7;
        if (!this.f9703n && k0Var.f9823d.m() != null) {
            i.u uVar3 = this.f9706q;
            if (uVar3 == null) {
                uVar3 = new i.u();
                this.f9706q = uVar3;
            }
            i.u from = this.f9705p;
            if (from == null) {
                from = new i.u();
                this.f9705p = from;
            }
            Intrinsics.checkNotNullParameter(from, "from");
            Object[] objArr3 = from.f6963b;
            float[] fArr3 = from.f6964c;
            long[] jArr3 = from.f6962a;
            int length = jArr3.length - 2;
            long j5 = 255;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j6 = jArr3[i11];
                    if ((((~j6) << c4) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j6 & j5) < 128) {
                                int i14 = (i11 << 3) + i13;
                                Object obj2 = objArr3[i14];
                                float f4 = fArr3[i14];
                                int hashCode = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i15 = hashCode ^ (hashCode << 16);
                                int i16 = i15 >>> 7;
                                int i17 = i15 & 127;
                                objArr2 = objArr3;
                                int i18 = uVar3.f6965d;
                                int i19 = i16 & i18;
                                fArr2 = fArr3;
                                int i20 = 0;
                                while (true) {
                                    long[] jArr4 = uVar3.f6962a;
                                    int i21 = i19 >> 3;
                                    jArr2 = jArr3;
                                    int i22 = (i19 & 7) << 3;
                                    long j7 = (jArr4[i21] >>> i22) | ((jArr4[i21 + 1] << (64 - i22)) & ((-i22) >> 63));
                                    long j8 = i17;
                                    i7 = length;
                                    i8 = i11;
                                    long j9 = j7 ^ (j8 * 72340172838076673L);
                                    long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L);
                                    while (true) {
                                        if (j10 == 0) {
                                            break;
                                        }
                                        int numberOfTrailingZeros = (i19 + (Long.numberOfTrailingZeros(j10) >> 3)) & i18;
                                        int i23 = i17;
                                        if (Intrinsics.a(uVar3.f6963b[numberOfTrailingZeros], obj2)) {
                                            i5 = i12;
                                            i6 = i13;
                                            uVar2 = from;
                                            j4 = j6;
                                            obj = obj2;
                                            i10 = numberOfTrailingZeros;
                                            break;
                                        }
                                        j10 &= j10 - 1;
                                        i17 = i23;
                                    }
                                    i20 += 8;
                                    i19 = (i19 + i20) & i18;
                                    jArr3 = jArr2;
                                    i17 = i9;
                                    length = i7;
                                    i11 = i8;
                                    i12 = i12;
                                }
                                if (i10 < 0) {
                                    i10 = ~i10;
                                }
                                uVar3.f6963b[i10] = obj;
                                uVar3.f6964c[i10] = f4;
                            } else {
                                i5 = i12;
                                i6 = i13;
                                uVar2 = from;
                                objArr2 = objArr3;
                                fArr2 = fArr3;
                                jArr2 = jArr3;
                                i7 = length;
                                i8 = i11;
                                j4 = j6;
                            }
                            j6 = j4 >> 8;
                            i13 = i6 + 1;
                            objArr3 = objArr2;
                            fArr3 = fArr2;
                            jArr3 = jArr2;
                            from = uVar2;
                            length = i7;
                            i11 = i8;
                            i12 = i5;
                            j5 = 255;
                        }
                        uVar = from;
                        objArr = objArr3;
                        fArr = fArr3;
                        jArr = jArr3;
                        int i24 = length;
                        int i25 = i11;
                        if (i12 != 8) {
                            break;
                        }
                        length = i24;
                        i4 = i25;
                    } else {
                        uVar = from;
                        objArr = objArr3;
                        fArr = fArr3;
                        jArr = jArr3;
                        i4 = i11;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i11 = i4 + 1;
                    objArr3 = objArr;
                    fArr3 = fArr;
                    jArr3 = jArr;
                    from = uVar;
                    c4 = 7;
                    j5 = 255;
                }
            } else {
                uVar = from;
            }
            uVar.a();
            C1166s c1166s = w0().f9602o;
            if (c1166s != null && (snapshotObserver = c1166s.getSnapshotObserver()) != null) {
                snapshotObserver.a(k0Var, C1064e.f9780i, new A.f0(k0Var, 9, this));
            }
            i.u uVar4 = uVar;
            Object[] objArr4 = uVar4.f6963b;
            long[] jArr5 = uVar4.f6962a;
            int length2 = jArr5.length - 2;
            if (length2 >= 0) {
                int i26 = 0;
                while (true) {
                    long j11 = jArr5[i26];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i27 = 8 - ((~(i26 - length2)) >>> 31);
                        long j12 = j11;
                        for (int i28 = 0; i28 < i27; i28++) {
                            if ((j12 & 255) < 128) {
                                if (objArr4[(i26 << 3) + i28] != null) {
                                    throw new ClassCastException();
                                }
                                if (uVar3.c(null) < 0 && (y02 = y0()) != null) {
                                    do {
                                        i.u uVar5 = y02.f9705p;
                                        if (uVar5 != null && uVar5.c(null) >= 0) {
                                            break;
                                        } else {
                                            y02 = y02.y0();
                                        }
                                    } while (y02 != null);
                                }
                            }
                            j12 >>= 8;
                        }
                        i2 = 1;
                        if (i27 != 8) {
                            break;
                        }
                    } else {
                        i2 = 1;
                    }
                    if (i26 == length2) {
                        break;
                    } else {
                        i26 += i2;
                    }
                }
            }
            uVar3.a();
        }
    }

    public abstract O t0();

    public abstract InterfaceC0980p u0();

    public abstract boolean v0();

    public abstract E w0();

    public abstract InterfaceC0946G x0();

    public abstract O y0();

    @Override // r0.U
    public final void z(boolean z4) {
        this.f9701l = z4;
    }

    public abstract long z0();
}
