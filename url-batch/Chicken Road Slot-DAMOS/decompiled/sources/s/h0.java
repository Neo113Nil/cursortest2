package s;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8312a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f8313b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f8314c;

    /* renamed from: d, reason: collision with root package name */
    public int f8315d;

    /* renamed from: e, reason: collision with root package name */
    public int f8316e;

    /* renamed from: f, reason: collision with root package name */
    public int f8317f;

    public h0(int i3) {
        this.f8312a = p0.f8356a;
        Object[] objArr = t.a.f9195c;
        this.f8313b = objArr;
        this.f8314c = objArr;
        if (i3 >= 0) {
            h(p0.d(i3));
        } else {
            a1.e("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f8316e = 0;
        long[] jArr = this.f8312a;
        if (jArr != p0.f8356a) {
            kotlin.collections.v.j(jArr, -9187201950435737472L);
            long[] jArr2 = this.f8312a;
            int i3 = this.f8315d;
            int i10 = i3 >> 3;
            long j = 255 << ((i3 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j)) | j;
        }
        kotlin.collections.v.i(this.f8314c, 0, this.f8315d);
        kotlin.collections.v.i(this.f8313b, 0, this.f8315d);
        this.f8317f = p0.a(this.f8315d) - this.f8316e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Object obj) {
        int i3;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f8315d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f8312a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j3 = (i11 * 72340172838076673L) ^ j;
            long j10 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i3 = ((Long.numberOfTrailingZeros(j10) >> 3) + i13) & i12;
                if (Intrinsics.a(this.f8313b[i3], obj)) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return i3 >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Object obj) {
        int i3;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f8315d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f8312a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j3 = (i11 * 72340172838076673L) ^ j;
            long j10 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i3 = ((Long.numberOfTrailingZeros(j10) >> 3) + i13) & i12;
                if (Intrinsics.a(this.f8313b[i3], obj)) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return i3 >= 0;
    }

    public final boolean d(Object obj) {
        Object[] objArr = this.f8314c;
        long[] jArr = this.f8312a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128 && Intrinsics.a(obj, objArr[(i3 << 3) + i11])) {
                            return true;
                        }
                        j >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    public final int e(int i3) {
        int i10 = this.f8315d;
        int i11 = i3 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f8312a;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (h0Var.f8316e != this.f8316e) {
            return false;
        }
        Object[] objArr = this.f8313b;
        Object[] objArr2 = this.f8314c;
        long[] jArr = this.f8312a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128) {
                            int i12 = (i3 << 3) + i11;
                            Object obj2 = objArr[i12];
                            Object obj3 = objArr2[i12];
                            if (obj3 == null) {
                                if (h0Var.g(obj2) != null || !h0Var.c(obj2)) {
                                    break loop0;
                                }
                            } else if (!obj3.equals(h0Var.g(obj2))) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
            return false;
        }
        return true;
    }

    public final int f(Object obj) {
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
        int i14 = this.f8315d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr3 = this.f8312a;
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
                if (Intrinsics.a(this.f8313b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i10 = i20;
            }
            int i21 = i10;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int e2 = e(i12);
                long j15 = 255;
                if (this.f8317f != 0 || ((this.f8312a[e2 >> 3] >> ((e2 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j3 = j12;
                    j10 = 128;
                } else {
                    int i22 = this.f8315d;
                    if (i22 > 8) {
                        int i23 = 8;
                        long j16 = this.f8316e;
                        hd.z zVar = hd.a0.f4495e;
                        if (Long.compare((j16 * 32) ^ Long.MIN_VALUE, (i22 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f8312a;
                            int i24 = this.f8315d;
                            Object[] objArr2 = this.f8313b;
                            Object[] objArr3 = this.f8314c;
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
                            jArr4[i28] = (jArr4[i28] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[o6] = jArr4[0];
                            int i29 = 0;
                            while (i29 != i24) {
                                int i30 = i29 >> 3;
                                int i31 = (i29 & 7) << 3;
                                long j19 = (jArr4[i30] >> i31) & j;
                                if (j19 != 128 && j19 == 254) {
                                    Object obj2 = objArr2[i29];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i21;
                                    int i32 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e9 = e(i32);
                                    int i33 = i32 & i24;
                                    if (((e9 - i33) & i24) / i27 == ((i29 - i33) & i24) / i27) {
                                        jArr4[i30] = ((r8 & 127) << i31) | (jArr4[i30] & (~(j << i31)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i29++;
                                        i27 = i27;
                                    } else {
                                        int i34 = i27;
                                        int i35 = e9 >> 3;
                                        long j20 = jArr4[i35];
                                        int i36 = (e9 & 7) << 3;
                                        if (((j20 >> i36) & j) == 128) {
                                            i3 = i24;
                                            objArr = objArr2;
                                            jArr4[i35] = ((~(j << i36)) & j20) | ((r8 & 127) << i36);
                                            jArr4[i30] = (jArr4[i30] & (~(j << i31))) | (128 << i31);
                                            objArr[e9] = objArr[i29];
                                            objArr[i29] = null;
                                            objArr3[e9] = objArr3[i29];
                                            objArr3[i29] = null;
                                        } else {
                                            i3 = i24;
                                            objArr = objArr2;
                                            jArr4[i35] = ((r8 & 127) << i36) | ((~(j << i36)) & j20);
                                            Object obj3 = objArr[e9];
                                            objArr[e9] = objArr[i29];
                                            objArr[i29] = obj3;
                                            Object obj4 = objArr3[e9];
                                            objArr3[e9] = objArr3[i29];
                                            objArr3[i29] = obj4;
                                            i29--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i29++;
                                        i27 = i34;
                                        i24 = i3;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i29++;
                                }
                            }
                            this.f8317f = p0.a(this.f8315d) - this.f8316e;
                            e2 = e(i12);
                        }
                    }
                    j = 255;
                    j3 = j12;
                    j10 = 128;
                    int b10 = p0.b(this.f8315d);
                    long[] jArr5 = this.f8312a;
                    Object[] objArr4 = this.f8313b;
                    Object[] objArr5 = this.f8314c;
                    int i37 = this.f8315d;
                    h(b10);
                    long[] jArr6 = this.f8312a;
                    Object[] objArr6 = this.f8313b;
                    Object[] objArr7 = this.f8314c;
                    int i38 = this.f8315d;
                    int i39 = 0;
                    while (i39 < i37) {
                        if (((jArr5[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i39];
                            int hashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i21;
                            int i40 = hashCode3 ^ (hashCode3 << 16);
                            int e10 = e(i40 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j21 = i40 & 127;
                            int i41 = e10 >> 3;
                            int i42 = (e10 & 7) << 3;
                            long j22 = (jArr[i41] & (~(255 << i42))) | (j21 << i42);
                            jArr[i41] = j22;
                            jArr[(((e10 - 7) & i38) + (i38 & 7)) >> 3] = j22;
                            objArr6[e10] = obj5;
                            objArr7[e10] = objArr5[i39];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i39++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e2 = e(i12);
                }
                this.f8316e++;
                int i43 = this.f8317f;
                long[] jArr7 = this.f8312a;
                int i44 = e2 >> 3;
                long j23 = jArr7[i44];
                int i45 = (e2 & 7) << 3;
                this.f8317f = i43 - (((j23 >> i45) & j) == j10 ? 1 : 0);
                int i46 = this.f8315d;
                long j24 = (j23 & (~(j << i45))) | (j3 << i45);
                jArr7[i44] = j24;
                jArr7[(((e2 - 7) & i46) + (i46 & 7)) >> 3] = j24;
                return ~e2;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
            i10 = i21;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        int i3;
        int i10 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f8315d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f8312a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j3 = (i12 * 72340172838076673L) ^ j;
            long j10 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i3 = ((Long.numberOfTrailingZeros(j10) >> 3) + i15) & i13;
                if (Intrinsics.a(this.f8313b[i3], obj)) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (i3 >= 0) {
            return this.f8314c[i3];
        }
        return null;
    }

    public final void h(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, p0.c(i3)) : 0;
        this.f8315d = max;
        if (max == 0) {
            jArr = p0.f8356a;
        } else {
            int i10 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i10];
            Arrays.fill(jArr2, 0, i10, -9187201950435737472L);
            int i11 = max >> 3;
            long j = 255 << ((max & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
            jArr = jArr2;
        }
        this.f8312a = jArr;
        this.f8317f = p0.a(this.f8315d) - this.f8316e;
        Object[] objArr = t.a.f9195c;
        this.f8313b = max == 0 ? objArr : new Object[max];
        if (max != 0) {
            objArr = new Object[max];
        }
        this.f8314c = objArr;
    }

    public final int hashCode() {
        Object[] objArr = this.f8313b;
        Object[] objArr2 = this.f8314c;
        long[] jArr = this.f8312a;
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
                        Object obj2 = objArr2[i13];
                        i10 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final boolean i() {
        return this.f8316e == 0;
    }

    public final boolean j() {
        return this.f8316e != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        int i3;
        int i10 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f8315d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f8312a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j3 = (i12 * 72340172838076673L) ^ j;
            long j10 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i3 = ((Long.numberOfTrailingZeros(j10) >> 3) + i15) & i13;
                if (Intrinsics.a(this.f8313b[i3], obj)) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (i3 >= 0) {
            return l(i3);
        }
        return null;
    }

    public final Object l(int i3) {
        this.f8316e--;
        long[] jArr = this.f8312a;
        int i10 = this.f8315d;
        int i11 = i3 >> 3;
        int i12 = (i3 & 7) << 3;
        long j = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j;
        jArr[(((i3 - 7) & i10) + (i10 & 7)) >> 3] = j;
        this.f8313b[i3] = null;
        Object[] objArr = this.f8314c;
        Object obj = objArr[i3];
        objArr[i3] = null;
        return obj;
    }

    public final void m(Object obj, Object obj2) {
        int f3 = f(obj);
        if (f3 < 0) {
            f3 = ~f3;
        }
        this.f8313b[f3] = obj;
        this.f8314c[f3] = obj2;
    }

    public final String toString() {
        if (i()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f8313b;
        Object[] objArr2 = this.f8314c;
        long[] jArr = this.f8312a;
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
                            Object obj2 = objArr2[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb2.append(obj2);
                            i10++;
                            if (i10 < this.f8316e) {
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

    public /* synthetic */ h0() {
        this(6);
    }
}
