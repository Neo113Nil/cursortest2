package s;

import java.util.Arrays;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8289a = p0.f8356a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f8290b = t.a.f9195c;

    /* renamed from: c, reason: collision with root package name */
    public long[] f8291c = q.f8358b;

    /* renamed from: d, reason: collision with root package name */
    public int f8292d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f8293e = Integer.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public int f8294f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f8295h;

    public e0(int i3) {
        if (i3 >= 0) {
            f(p0.d(i3));
        } else {
            a1.e("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i3 = this.g;
        int d10 = d(obj);
        this.f8290b[d10] = obj;
        long[] jArr = this.f8291c;
        int i10 = this.f8292d;
        jArr[d10] = (i10 & 2147483647L) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = ((d10 & 2147483647L) << 31) | (jArr[i10] & (-4611686016279904257L));
        }
        this.f8292d = d10;
        if (this.f8293e == Integer.MAX_VALUE) {
            this.f8293e = d10;
        }
        return this.g != i3;
    }

    public final void b() {
        this.g = 0;
        long[] jArr = this.f8289a;
        if (jArr != p0.f8356a) {
            kotlin.collections.v.j(jArr, -9187201950435737472L);
            long[] jArr2 = this.f8289a;
            int i3 = this.f8294f;
            int i10 = i3 >> 3;
            long j = 255 << ((i3 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j)) | j;
        }
        kotlin.collections.v.i(this.f8290b, 0, this.f8294f);
        kotlin.collections.v.j(this.f8291c, 4611686018427387903L);
        this.f8292d = Integer.MAX_VALUE;
        this.f8293e = Integer.MAX_VALUE;
        this.f8295h = p0.a(this.f8294f) - this.g;
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
        int i12 = this.f8294f;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f8289a;
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
                if (Intrinsics.a(this.f8290b[i3], obj)) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return i3 >= 0;
    }

    public final int d(Object obj) {
        int i3;
        long j;
        long j3;
        long j10;
        char c10;
        long[] jArr;
        long[] jArr2;
        long j11;
        int i10 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f8294f;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr3 = this.f8289a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j12 = ((jArr3[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr3[i17] >>> i18);
            long j13 = i13;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (j14 - 72340172838076673L) & (~j14) & (-9187201950435737472L);
            while (j15 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i15) & i14;
                int i19 = i10;
                if (Intrinsics.a(this.f8290b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i10 = i19;
            }
            int i20 = i10;
            if ((j12 & ((~j12) << 6) & (-9187201950435737472L)) != 0) {
                int e2 = e(i12);
                long j16 = 255;
                if (this.f8295h != 0 || ((this.f8289a[e2 >> 3] >> ((e2 & 7) << 3)) & 255) == 254) {
                    i3 = 0;
                    j = j13;
                    j3 = 255;
                    j10 = 128;
                } else {
                    int i21 = this.f8294f;
                    if (i21 > 8) {
                        c10 = 31;
                        long j17 = this.g;
                        hd.z zVar = hd.a0.f4495e;
                        j10 = 128;
                        if (Long.compare((j17 * 32) ^ Long.MIN_VALUE, (i21 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f8289a;
                            if (jArr4 == null) {
                                i3 = 0;
                                j = j13;
                                j3 = 255;
                            } else {
                                int i22 = this.f8294f;
                                Object[] objArr = this.f8290b;
                                long[] jArr5 = this.f8291c;
                                long[] jArr6 = new long[i22];
                                Arrays.fill(jArr6, 0, i22, 9223372034707292159L);
                                i3 = 0;
                                int i23 = (i22 + 7) >> 3;
                                int i24 = 0;
                                while (i24 < i23) {
                                    long j18 = j16;
                                    long j19 = jArr4[i24] & (-9187201950435737472L);
                                    int i25 = i24;
                                    jArr4[i25] = ((~j19) + (j19 >>> 7)) & (-72340172838076674L);
                                    i24 = i25 + 1;
                                    j16 = j18;
                                }
                                j3 = j16;
                                int length = jArr4.length;
                                int i26 = length - 1;
                                int i27 = length - 2;
                                jArr4[i27] = (jArr4[i27] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i26] = jArr4[0];
                                int i28 = 0;
                                while (i28 != i22) {
                                    int i29 = i28 >> 3;
                                    int i30 = (i28 & 7) << 3;
                                    long j20 = (jArr4[i29] >> i30) & j3;
                                    if (j20 != 128 && j20 == 254) {
                                        Object obj2 = objArr[i28];
                                        int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i20;
                                        int i31 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                        int e9 = e(i31);
                                        int i32 = i31 & i22;
                                        if (((e9 - i32) & i22) / 8 == ((i28 - i32) & i22) / 8) {
                                            int i33 = i22;
                                            Object[] objArr2 = objArr;
                                            jArr4[i29] = (jArr4[i29] & (~(j3 << i30))) | ((r17 & 127) << i30);
                                            if (jArr6[i28] == 9223372034707292159L) {
                                                long j21 = i28;
                                                jArr6[i28] = j21 | (j21 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i28++;
                                            i22 = i33;
                                            objArr = objArr2;
                                        } else {
                                            int i34 = i22;
                                            Object[] objArr3 = objArr;
                                            int i35 = e9 >> 3;
                                            long j22 = jArr4[i35];
                                            int i36 = (e9 & 7) << 3;
                                            if (((j22 >> i36) & j3) == 128) {
                                                jArr4[i35] = (j22 & (~(j3 << i36))) | ((r17 & 127) << i36);
                                                jArr4[i29] = (jArr4[i29] & (~(j3 << i30))) | (128 << i30);
                                                objArr3[e9] = objArr3[i28];
                                                objArr3[i28] = null;
                                                jArr5[e9] = jArr5[i28];
                                                jArr5[i28] = 4611686018427387903L;
                                                int i37 = (int) ((jArr6[i28] >> 32) & 4294967295L);
                                                int i38 = Integer.MAX_VALUE;
                                                if (i37 != Integer.MAX_VALUE) {
                                                    j11 = j13;
                                                    jArr6[i37] = e9 | (jArr6[i37] & (-4294967296L));
                                                    jArr6[i28] = (jArr6[i28] & 4294967295L) | (-4294967296L);
                                                    i38 = Integer.MAX_VALUE;
                                                } else {
                                                    j11 = j13;
                                                    jArr6[i28] = (Integer.MAX_VALUE << 32) | e9;
                                                }
                                                jArr6[e9] = (i28 << 32) | i38;
                                            } else {
                                                j11 = j13;
                                                jArr4[i35] = ((r17 & 127) << i36) | (j22 & (~(j3 << i36)));
                                                Object obj3 = objArr3[e9];
                                                objArr3[e9] = objArr3[i28];
                                                objArr3[i28] = obj3;
                                                long j23 = jArr5[e9];
                                                jArr5[e9] = jArr5[i28];
                                                jArr5[i28] = j23;
                                                int i39 = (int) ((jArr6[i28] >> 32) & 4294967295L);
                                                if (i39 != Integer.MAX_VALUE) {
                                                    long j24 = e9;
                                                    jArr6[i39] = (jArr6[i39] & (-4294967296L)) | j24;
                                                    jArr6[i28] = (jArr6[i28] & 4294967295L) | (j24 << 32);
                                                } else {
                                                    long j25 = e9;
                                                    jArr6[i28] = j25 | (j25 << 32);
                                                    i39 = i28;
                                                }
                                                jArr6[e9] = (i39 << 32) | i28;
                                                i28--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i28++;
                                            i22 = i34;
                                            objArr = objArr3;
                                            j13 = j11;
                                        }
                                    } else {
                                        i28++;
                                    }
                                }
                                j = j13;
                                this.f8295h = p0.a(this.f8294f) - this.g;
                                long[] jArr7 = this.f8291c;
                                int length2 = jArr7.length;
                                for (int i40 = 0; i40 < length2; i40++) {
                                    long j26 = jArr7[i40];
                                    jArr7[i40] = (((j26 & (-4611686018427387904L)) | (((int) ((j26 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r4] & 4294967295L))) << 31) | (((int) (j26 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r6] & 4294967295L));
                                }
                                int i41 = this.f8292d;
                                if (i41 != Integer.MAX_VALUE) {
                                    this.f8292d = (int) (jArr6[i41] & 4294967295L);
                                }
                                int i42 = this.f8293e;
                                if (i42 != Integer.MAX_VALUE) {
                                    this.f8293e = (int) (jArr6[i42] & 4294967295L);
                                }
                            }
                            e2 = e(i12);
                        }
                    } else {
                        c10 = 31;
                        j10 = 128;
                    }
                    i3 = 0;
                    j = j13;
                    j3 = 255;
                    int b10 = p0.b(this.f8294f);
                    long[] jArr8 = this.f8289a;
                    Object[] objArr4 = this.f8290b;
                    long[] jArr9 = this.f8291c;
                    int i43 = this.f8294f;
                    int[] iArr = new int[i43];
                    f(b10);
                    long[] jArr10 = this.f8289a;
                    Object[] objArr5 = this.f8290b;
                    long[] jArr11 = this.f8291c;
                    int i44 = this.f8294f;
                    int i45 = 0;
                    while (i45 < i43) {
                        if (((jArr8[i45 >> 3] >> ((i45 & 7) << 3)) & 255) < j10) {
                            Object obj4 = objArr4[i45];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i20;
                            int i46 = hashCode3 ^ (hashCode3 << 16);
                            int e10 = e(i46 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j27 = i46 & 127;
                            int i47 = e10 >> 3;
                            int i48 = (e10 & 7) << 3;
                            long j28 = (jArr[i47] & (~(255 << i48))) | (j27 << i48);
                            jArr[i47] = j28;
                            jArr[(((e10 - 7) & i44) + (i44 & 7)) >> 3] = j28;
                            objArr5[e10] = obj4;
                            jArr11[e10] = jArr9[i45];
                            iArr[i45] = e10;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i45++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f8291c;
                    int length3 = jArr12.length;
                    for (int i49 = 0; i49 < length3; i49++) {
                        long j29 = jArr12[i49];
                        jArr12[i49] = (((j29 & (-4611686018427387904L)) | (((int) ((j29 >> c10) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r4])) << c10) | (((int) (j29 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r6]);
                    }
                    int i50 = this.f8292d;
                    if (i50 != Integer.MAX_VALUE) {
                        this.f8292d = iArr[i50];
                    }
                    int i51 = this.f8293e;
                    if (i51 != Integer.MAX_VALUE) {
                        this.f8293e = iArr[i51];
                    }
                    e2 = e(i12);
                }
                this.g++;
                int i52 = this.f8295h;
                long[] jArr13 = this.f8289a;
                int i53 = e2 >> 3;
                long j30 = jArr13[i53];
                int i54 = (e2 & 7) << 3;
                if (((j30 >> i54) & j3) == j10) {
                    i3 = 1;
                }
                this.f8295h = i52 - i3;
                int i55 = this.f8294f;
                long j31 = (j30 & (~(j3 << i54))) | (j << i54);
                jArr13[i53] = j31;
                jArr13[(((e2 - 7) & i55) + (i55 & 7)) >> 3] = j31;
                return e2;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i10 = i20;
        }
    }

    public final int e(int i3) {
        int i10 = this.f8294f;
        int i11 = i3 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f8289a;
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
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (e0Var.g != this.g) {
            return false;
        }
        Object[] objArr = this.f8290b;
        long[] jArr = this.f8289a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128 && !e0Var.c(objArr[(i3 << 3) + i11])) {
                            return false;
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
        return true;
    }

    public final void f(int i3) {
        long[] jArr;
        long[] jArr2;
        int max = i3 > 0 ? Math.max(7, p0.c(i3)) : 0;
        this.f8294f = max;
        if (max == 0) {
            jArr = p0.f8356a;
        } else {
            int i10 = ((max + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i10];
            Arrays.fill(jArr3, 0, i10, -9187201950435737472L);
            jArr = jArr3;
        }
        this.f8289a = jArr;
        int i11 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f8295h = p0.a(this.f8294f) - this.g;
        this.f8290b = max == 0 ? t.a.f9195c : new Object[max];
        if (max == 0) {
            jArr2 = q.f8358b;
        } else {
            long[] jArr4 = new long[max];
            Arrays.fill(jArr4, 0, max, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.f8291c = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(Object obj) {
        int i3;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f8294f;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f8289a;
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
                if (Intrinsics.a(this.f8290b[i3], obj)) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        boolean z10 = i3 >= 0;
        if (z10) {
            h(i3);
        }
        return z10;
    }

    public final void h(int i3) {
        this.g--;
        long[] jArr = this.f8289a;
        int i10 = this.f8294f;
        int i11 = i3 >> 3;
        int i12 = (i3 & 7) << 3;
        long j = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j;
        jArr[(((i3 - 7) & i10) + (i10 & 7)) >> 3] = j;
        this.f8290b[i3] = null;
        long[] jArr2 = this.f8291c;
        long j3 = jArr2[i3];
        int i13 = (int) ((j3 >> 31) & 2147483647L);
        int i14 = (int) (j3 & 2147483647L);
        if (i13 != Integer.MAX_VALUE) {
            jArr2[i13] = (jArr2[i13] & (-2147483648L)) | (i14 & 2147483647L);
        } else {
            this.f8292d = i14;
        }
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = ((i13 & 2147483647L) << 31) | (jArr2[i14] & (-4611686016279904257L));
        } else {
            this.f8293e = i13;
        }
        jArr2[i3] = 4611686018427387903L;
    }

    public final int hashCode() {
        int i3 = (this.f8294f * 31) + this.g;
        Object[] objArr = this.f8290b;
        long[] jArr = this.f8289a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (!Intrinsics.a(obj, this)) {
                                i3 += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        return i3;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return i3;
    }

    public final boolean i(Collection collection) {
        collection.getClass();
        Object[] objArr = this.f8290b;
        int i3 = this.g;
        long[] jArr = this.f8289a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!CollectionsKt.u(collection, objArr[i13])) {
                                h(i13);
                            }
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return i3 != this.g;
    }

    public final String toString() {
        a3.e eVar = new a3.e(19, this);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f8290b;
        long[] jArr = this.f8291c;
        int i3 = this.f8293e;
        int i10 = 0;
        while (true) {
            if (i3 == Integer.MAX_VALUE) {
                sb2.append((CharSequence) "]");
                break;
            }
            int i11 = (int) ((jArr[i3] >> 31) & 2147483647L);
            Object obj = objArr[i3];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) eVar.invoke(obj));
            i10++;
            i3 = i11;
        }
        return sb2.toString();
    }
}
