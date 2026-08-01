package s;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8277a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f8278b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f8279c;

    /* renamed from: d, reason: collision with root package name */
    public int f8280d;

    /* renamed from: e, reason: collision with root package name */
    public int f8281e;

    /* renamed from: f, reason: collision with root package name */
    public int f8282f;

    public c0(int i3) {
        this.f8277a = p0.f8356a;
        this.f8278b = t.a.f9195c;
        this.f8279c = m.f8345a;
        if (i3 >= 0) {
            d(p0.d(i3));
        } else {
            a1.e("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i3) {
        int i10 = this.f8280d;
        int i11 = i3 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f8277a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j3 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j3 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j3) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    public final int b(Object obj) {
        long j;
        long j3;
        long j10;
        long[] jArr;
        long[] jArr2;
        int i3;
        Object[] objArr;
        int i10 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f8280d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr3 = this.f8277a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j11 = ((jArr3[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr3[i17] >>> i18);
            long j12 = i13;
            int i19 = i13;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (j14 != 0) {
                int numberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j14) >> 3)) & i14;
                int i20 = i10;
                if (Intrinsics.a(this.f8278b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i10 = i20;
            }
            int i21 = i10;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int a9 = a(i12);
                long j15 = 255;
                if (this.f8282f != 0 || ((this.f8277a[a9 >> 3] >> ((a9 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j3 = j12;
                    j10 = 128;
                } else {
                    int i22 = this.f8280d;
                    if (i22 > 8) {
                        int i23 = 8;
                        long j16 = this.f8281e;
                        hd.z zVar = hd.a0.f4495e;
                        if (Long.compare((j16 * 32) ^ Long.MIN_VALUE, (i22 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f8277a;
                            int i24 = this.f8280d;
                            Object[] objArr2 = this.f8278b;
                            int[] iArr = this.f8279c;
                            j10 = 128;
                            int i25 = (i24 + 7) >> 3;
                            int i26 = 0;
                            while (i26 < i25) {
                                long j17 = j15;
                                long j18 = jArr4[i26] & (-9187201950435737472L);
                                jArr4[i26] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                                i26++;
                                i23 = i23;
                                j12 = j12;
                                j15 = j17;
                            }
                            j = j15;
                            j3 = j12;
                            int i27 = i23;
                            int o6 = kotlin.collections.w.o(jArr4);
                            int i28 = o6 - 1;
                            long j19 = 72057594037927935L;
                            jArr4[i28] = (jArr4[i28] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[o6] = jArr4[0];
                            int i29 = 0;
                            while (i29 != i24) {
                                int i30 = i29 >> 3;
                                int i31 = (i29 & 7) << 3;
                                long j20 = (jArr4[i30] >> i31) & j;
                                if (j20 != 128 && j20 == 254) {
                                    Object obj2 = objArr2[i29];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i21;
                                    int i32 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int a10 = a(i32);
                                    int i33 = i32 & i24;
                                    long j21 = j19;
                                    if (((a10 - i33) & i24) / 8 == ((i29 - i33) & i24) / i27) {
                                        jArr4[i30] = ((r8 & 127) << i31) | (jArr4[i30] & (~(j << i31)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j21) | Long.MIN_VALUE;
                                        i29++;
                                        j19 = j21;
                                        i27 = i27;
                                    } else {
                                        int i34 = i27;
                                        int i35 = a10 >> 3;
                                        long j22 = jArr4[i35];
                                        int i36 = (a10 & 7) << 3;
                                        if (((j22 >> i36) & j) == 128) {
                                            i3 = i24;
                                            objArr = objArr2;
                                            jArr4[i35] = ((~(j << i36)) & j22) | ((r8 & 127) << i36);
                                            jArr4[i30] = (jArr4[i30] & (~(j << i31))) | (128 << i31);
                                            objArr[a10] = objArr[i29];
                                            objArr[i29] = null;
                                            iArr[a10] = iArr[i29];
                                            iArr[i29] = 0;
                                        } else {
                                            i3 = i24;
                                            objArr = objArr2;
                                            jArr4[i35] = ((r8 & 127) << i36) | ((~(j << i36)) & j22);
                                            Object obj3 = objArr[a10];
                                            objArr[a10] = objArr[i29];
                                            objArr[i29] = obj3;
                                            int i37 = iArr[a10];
                                            iArr[a10] = iArr[i29];
                                            iArr[i29] = i37;
                                            i29--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j21) | Long.MIN_VALUE;
                                        i29++;
                                        i24 = i3;
                                        j19 = j21;
                                        i27 = i34;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i29++;
                                }
                            }
                            this.f8282f = p0.a(this.f8280d) - this.f8281e;
                            a9 = a(i12);
                        }
                    }
                    j = 255;
                    j3 = j12;
                    j10 = 128;
                    int b10 = p0.b(this.f8280d);
                    long[] jArr5 = this.f8277a;
                    Object[] objArr3 = this.f8278b;
                    int[] iArr2 = this.f8279c;
                    int i38 = this.f8280d;
                    d(b10);
                    long[] jArr6 = this.f8277a;
                    Object[] objArr4 = this.f8278b;
                    int[] iArr3 = this.f8279c;
                    int i39 = this.f8280d;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr5[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i40];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i21;
                            int i41 = hashCode3 ^ (hashCode3 << 16);
                            int a11 = a(i41 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j23 = i41 & 127;
                            int i42 = a11 >> 3;
                            int i43 = (a11 & 7) << 3;
                            long j24 = (jArr[i42] & (~(255 << i43))) | (j23 << i43);
                            jArr[i42] = j24;
                            jArr[(((a11 - 7) & i39) + (i39 & 7)) >> 3] = j24;
                            objArr4[a11] = obj4;
                            iArr3[a11] = iArr2[i40];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i40++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    a9 = a(i12);
                }
                this.f8281e++;
                int i44 = this.f8282f;
                long[] jArr7 = this.f8277a;
                int i45 = a9 >> 3;
                long j25 = jArr7[i45];
                int i46 = (a9 & 7) << 3;
                this.f8282f = i44 - (((j25 >> i46) & j) == j10 ? 1 : 0);
                int i47 = this.f8280d;
                long j26 = (j25 & (~(j << i46))) | (j3 << i46);
                jArr7[i45] = j26;
                jArr7[(((a9 - 7) & i47) + (i47 & 7)) >> 3] = j26;
                return ~a9;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
            i10 = i21;
        }
    }

    public final int c(Object obj) {
        int i3 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f8280d;
        int i13 = i10 >>> 7;
        while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f8277a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j3 = (i11 * 72340172838076673L) ^ j;
            for (long j10 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i14) & i12;
                if (Intrinsics.a(this.f8278b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i3 += 8;
            i13 = i14 + i3;
        }
    }

    public final void d(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, p0.c(i3)) : 0;
        this.f8280d = max;
        if (max == 0) {
            jArr = p0.f8356a;
        } else {
            int i10 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i10];
            Arrays.fill(jArr2, 0, i10, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f8277a = jArr;
        int i11 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f8282f = p0.a(this.f8280d) - this.f8281e;
        this.f8278b = new Object[max];
        this.f8279c = new int[max];
    }

    public final void e(int i3) {
        this.f8281e--;
        long[] jArr = this.f8277a;
        int i10 = this.f8280d;
        int i11 = i3 >> 3;
        int i12 = (i3 & 7) << 3;
        long j = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j;
        jArr[(((i3 - 7) & i10) + (i10 & 7)) >> 3] = j;
        this.f8278b[i3] = null;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (c0Var.f8281e != this.f8281e) {
            return false;
        }
        Object[] objArr = this.f8278b;
        int[] iArr = this.f8279c;
        long[] jArr = this.f8277a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i3 = 0;
        loop0: while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i3 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((255 & j) < 128) {
                        int i12 = (i3 << 3) + i11;
                        Object obj2 = objArr[i12];
                        int i13 = iArr[i12];
                        int c10 = c0Var.c(obj2);
                        if (c10 < 0) {
                            break loop0;
                        }
                        z11 = z12;
                        if (i13 != c0Var.f8279c[c10]) {
                            break loop0;
                        }
                    } else {
                        z11 = z12;
                    }
                    j >>= 8;
                    i11++;
                    z12 = z11;
                }
                z10 = z12;
                if (i10 != 8) {
                    return z10;
                }
            } else {
                z10 = z12;
            }
            if (i3 == length) {
                return z10;
            }
            i3++;
            z12 = z10;
        }
        return false;
    }

    public final void f(int i3, Object obj) {
        int b10 = b(obj);
        if (b10 < 0) {
            b10 = ~b10;
        }
        this.f8278b[b10] = obj;
        this.f8279c[b10] = i3;
    }

    public final int hashCode() {
        Object[] objArr = this.f8278b;
        int[] iArr = this.f8279c;
        long[] jArr = this.f8277a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i3 = 0;
        int i10 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i3 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        int i13 = (i3 << 3) + i12;
                        Object obj = objArr[i13];
                        i10 += Integer.hashCode(iArr[i13]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return i10;
                }
            }
            if (i3 == length) {
                return i10;
            }
            i3++;
        }
    }

    public final String toString() {
        if (this.f8281e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f8278b;
        int[] iArr = this.f8279c;
        long[] jArr = this.f8277a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i10 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            int i13 = (i3 << 3) + i12;
                            Object obj = objArr[i13];
                            int i14 = iArr[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(i14);
                            i10++;
                            if (i10 < this.f8281e) {
                                sb2.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public /* synthetic */ c0() {
        this(6);
    }
}
