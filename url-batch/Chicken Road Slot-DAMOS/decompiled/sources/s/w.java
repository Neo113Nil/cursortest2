package s;

import java.util.Arrays;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w extends k {

    /* renamed from: f, reason: collision with root package name */
    public int f8391f;

    public w(int i3) {
        this.f8336a = p0.f8356a;
        this.f8337b = m.f8345a;
        this.f8338c = t.a.f9195c;
        if (i3 >= 0) {
            f(p0.d(i3));
        } else {
            a1.e("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f8340e = 0;
        long[] jArr = this.f8336a;
        if (jArr != p0.f8356a) {
            kotlin.collections.v.j(jArr, -9187201950435737472L);
            long[] jArr2 = this.f8336a;
            int i3 = this.f8339d;
            int i10 = i3 >> 3;
            long j = 255 << ((i3 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j)) | j;
        }
        kotlin.collections.v.i(this.f8338c, 0, this.f8339d);
        this.f8391f = p0.a(this.f8339d) - this.f8340e;
    }

    public final int d(int i3) {
        long j;
        long j3;
        int i10;
        long j10;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        Object[] objArr;
        int i11;
        int i12 = -862048943;
        int hashCode = Integer.hashCode(i3) * (-862048943);
        int i13 = hashCode ^ (hashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f8339d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr3 = this.f8336a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = 1;
            long j11 = ((jArr3[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr3[i19] >>> i20);
            long j12 = i15;
            int i22 = i18;
            int i23 = 0;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (j14 != 0) {
                int numberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j14) >> 3)) & i16;
                int i24 = i12;
                int i25 = i23;
                if (this.f8337b[numberOfTrailingZeros] == i3) {
                    return numberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i12 = i24;
                i23 = i25;
            }
            int i26 = i12;
            int i27 = i23;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int e2 = e(i14);
                long j15 = 255;
                if (this.f8391f != 0 || ((this.f8336a[e2 >> 3] >> ((e2 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j3 = j12;
                    i10 = 1;
                    j10 = 128;
                } else {
                    int i28 = this.f8339d;
                    if (i28 > 8) {
                        j10 = 128;
                        long j16 = this.f8340e;
                        hd.z zVar = hd.a0.f4495e;
                        if (Long.compare((j16 * 32) ^ Long.MIN_VALUE, (i28 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f8336a;
                            int i29 = this.f8339d;
                            int[] iArr2 = this.f8337b;
                            Object[] objArr2 = this.f8338c;
                            int i30 = (i29 + 7) >> 3;
                            int i31 = i27;
                            while (i31 < i30) {
                                long j17 = j15;
                                long j18 = jArr4[i31] & (-9187201950435737472L);
                                jArr4[i31] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                                i31++;
                                j12 = j12;
                                j15 = j17;
                            }
                            j = j15;
                            j3 = j12;
                            int o6 = kotlin.collections.w.o(jArr4);
                            int i32 = o6 - 1;
                            long j19 = 72057594037927935L;
                            jArr4[i32] = (jArr4[i32] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[o6] = jArr4[i27];
                            int i33 = i27;
                            while (i33 != i29) {
                                int i34 = i33 >> 3;
                                int i35 = (i33 & 7) << 3;
                                long j20 = (jArr4[i34] >> i35) & j;
                                if (j20 != 128 && j20 == 254) {
                                    int hashCode2 = Integer.hashCode(iArr2[i33]) * i26;
                                    int i36 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e9 = e(i36);
                                    int i37 = i36 & i29;
                                    if (((e9 - i37) & i29) / 8 == ((i33 - i37) & i29) / 8) {
                                        long j21 = j19;
                                        jArr4[i34] = ((r8 & 127) << i35) | ((~(j << i35)) & jArr4[i34]);
                                        jArr4[jArr4.length - i21] = (jArr4[i27] & j21) | Long.MIN_VALUE;
                                        i33++;
                                        j19 = j21;
                                    } else {
                                        long j22 = j19;
                                        int i38 = e9 >> 3;
                                        long j23 = jArr4[i38];
                                        int i39 = (e9 & 7) << 3;
                                        if (((j23 >> i39) & j) == 128) {
                                            i11 = i21;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i38] = ((~(j << i39)) & j23) | ((r8 & 127) << i39);
                                            jArr4[i34] = (jArr4[i34] & (~(j << i35))) | (128 << i35);
                                            iArr[e9] = iArr[i33];
                                            iArr[i33] = i27;
                                            objArr[e9] = objArr[i33];
                                            objArr[i33] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i11 = i21;
                                            jArr4[i38] = ((r8 & 127) << i39) | ((~(j << i39)) & j23);
                                            int i40 = iArr[e9];
                                            iArr[e9] = iArr[i33];
                                            iArr[i33] = i40;
                                            Object obj = objArr[e9];
                                            objArr[e9] = objArr[i33];
                                            objArr[i33] = obj;
                                            i33--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i27] & j22) | Long.MIN_VALUE;
                                        i33++;
                                        j19 = j22;
                                        i21 = i11;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i33++;
                                }
                            }
                            i10 = i21;
                            this.f8391f = p0.a(this.f8339d) - this.f8340e;
                            e2 = e(i14);
                        }
                    } else {
                        j10 = 128;
                    }
                    j = 255;
                    j3 = j12;
                    i10 = 1;
                    int b10 = p0.b(this.f8339d);
                    long[] jArr5 = this.f8336a;
                    int[] iArr3 = this.f8337b;
                    Object[] objArr3 = this.f8338c;
                    int i41 = this.f8339d;
                    f(b10);
                    long[] jArr6 = this.f8336a;
                    int[] iArr4 = this.f8337b;
                    Object[] objArr4 = this.f8338c;
                    int i42 = this.f8339d;
                    int i43 = i27;
                    while (i43 < i41) {
                        if (((jArr5[i43 >> 3] >> ((i43 & 7) << 3)) & 255) < j10) {
                            int i44 = iArr3[i43];
                            int hashCode3 = Integer.hashCode(i44) * i26;
                            int i45 = hashCode3 ^ (hashCode3 << 16);
                            int e10 = e(i45 >>> 7);
                            long j24 = i45 & 127;
                            int i46 = e10 >> 3;
                            int i47 = (e10 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j25 = (jArr6[i46] & (~(255 << i47))) | (j24 << i47);
                            jArr[i46] = j25;
                            jArr[(((e10 - 7) & i42) + (i42 & 7)) >> 3] = j25;
                            iArr4[e10] = i44;
                            objArr4[e10] = objArr3[i43];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i43++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e2 = e(i14);
                }
                this.f8340e++;
                int i48 = this.f8391f;
                long[] jArr7 = this.f8336a;
                int i49 = e2 >> 3;
                long j26 = jArr7[i49];
                int i50 = (e2 & 7) << 3;
                if (((j26 >> i50) & j) != j10) {
                    i10 = i27;
                }
                this.f8391f = i48 - i10;
                int i51 = this.f8339d;
                long j27 = (j26 & (~(j << i50))) | (j3 << i50);
                jArr7[i49] = j27;
                jArr7[(((e2 - 7) & i51) + (i51 & 7)) >> 3] = j27;
                return e2;
            }
            i18 = i22 + 8;
            i17 = (i17 + i18) & i16;
            i12 = i26;
        }
    }

    public final int e(int i3) {
        int i10 = this.f8339d;
        int i11 = i3 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f8336a;
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

    public final void f(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, p0.c(i3)) : 0;
        this.f8339d = max;
        if (max == 0) {
            jArr = p0.f8356a;
        } else {
            int i10 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i10];
            Arrays.fill(jArr2, 0, i10, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f8336a = jArr;
        int i11 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f8391f = p0.a(this.f8339d) - this.f8340e;
        this.f8337b = new int[max];
        this.f8338c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i3) {
        int i10;
        int hashCode = Integer.hashCode(i3) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f8339d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f8336a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j3 = (i12 * 72340172838076673L) ^ j;
            long j10 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i10 = ((Long.numberOfTrailingZeros(j10) >> 3) + i14) & i13;
                if (this.f8337b[i10] == i3) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (i10 < 0) {
            return null;
        }
        this.f8340e--;
        long[] jArr2 = this.f8336a;
        int i18 = this.f8339d;
        int i19 = i10 >> 3;
        int i20 = (i10 & 7) << 3;
        long j11 = (jArr2[i19] & (~(255 << i20))) | (254 << i20);
        jArr2[i19] = j11;
        jArr2[(((i10 - 7) & i18) + (i18 & 7)) >> 3] = j11;
        Object[] objArr = this.f8338c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void h(int i3, Object obj) {
        int d10 = d(i3);
        this.f8337b[d10] = i3;
        this.f8338c[d10] = obj;
    }

    public /* synthetic */ w() {
        this(6);
    }
}
