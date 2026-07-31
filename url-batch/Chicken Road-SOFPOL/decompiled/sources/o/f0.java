package o;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f5447a = r0.f5528a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f5448b = p.a.f5709c;

    /* renamed from: c, reason: collision with root package name */
    public long[] f5449c = r.f5526b;

    /* renamed from: d, reason: collision with root package name */
    public int f5450d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f5451e = Integer.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public int f5452f;

    /* renamed from: g, reason: collision with root package name */
    public int f5453g;

    /* renamed from: h, reason: collision with root package name */
    public int f5454h;

    public f0(int i) {
        if (i >= 0) {
            f(r0.d(i));
        } else {
            p.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.f5453g;
        int d8 = d(obj);
        this.f5448b[d8] = obj;
        long[] jArr = this.f5449c;
        int i8 = this.f5450d;
        jArr[d8] = (i8 & 2147483647L) | 4611686016279904256L;
        if (i8 != Integer.MAX_VALUE) {
            jArr[i8] = ((d8 & 2147483647L) << 31) | (jArr[i8] & (-4611686016279904257L));
        }
        this.f5450d = d8;
        if (this.f5451e == Integer.MAX_VALUE) {
            this.f5451e = d8;
        }
        return this.f5453g != i;
    }

    public final void b() {
        this.f5453g = 0;
        long[] jArr = this.f5447a;
        if (jArr != r0.f5528a) {
            d6.l.M(jArr, -9187201950435737472L);
            long[] jArr2 = this.f5447a;
            int i = this.f5452f;
            int i8 = i >> 3;
            long j7 = 255 << ((i & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j7)) | j7;
        }
        d6.l.L(this.f5448b, 0, this.f5452f);
        d6.l.M(this.f5449c, 4611686018427387903L);
        this.f5450d = Integer.MAX_VALUE;
        this.f5451e = Integer.MAX_VALUE;
        this.f5454h = r0.a(this.f5452f) - this.f5453g;
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
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f5452f;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f5447a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j7 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j8 = (i9 * 72340172838076673L) ^ j7;
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j9 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j9) >> 3) + i11) & i10;
                if (q6.i.a(this.f5448b[i], obj)) {
                    break loop0;
                }
                j9 &= j9 - 1;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
        return i >= 0;
    }

    public final int d(Object obj) {
        int i;
        long j7;
        long j8;
        long j9;
        char c8;
        long[] jArr;
        long[] jArr2;
        long j10;
        int i8 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = hashCode ^ (hashCode << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this.f5452f;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr3 = this.f5447a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr3[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr3[i15] >>> i16);
            long j12 = i11;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (j13 - 72340172838076673L) & (~j13) & (-9187201950435737472L);
            while (j14 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i13) & i12;
                int i17 = i8;
                if (q6.i.a(this.f5448b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i8 = i17;
            }
            int i18 = i8;
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                int e8 = e(i10);
                long j15 = 255;
                if (this.f5454h != 0 || ((this.f5447a[e8 >> 3] >> ((e8 & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j7 = j12;
                    j8 = 255;
                    j9 = 128;
                } else {
                    int i19 = this.f5452f;
                    if (i19 > 8) {
                        c8 = 31;
                        j9 = 128;
                        if (Long.compare((this.f5453g * 32) ^ Long.MIN_VALUE, (i19 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f5447a;
                            if (jArr4 == null) {
                                i = 0;
                                j7 = j12;
                                j8 = 255;
                            } else {
                                int i20 = this.f5452f;
                                Object[] objArr = this.f5448b;
                                long[] jArr5 = this.f5449c;
                                long[] jArr6 = new long[i20];
                                Arrays.fill(jArr6, 0, i20, 9223372034707292159L);
                                i = 0;
                                int i21 = (i20 + 7) >> 3;
                                int i22 = 0;
                                while (i22 < i21) {
                                    long j16 = j15;
                                    long j17 = jArr4[i22] & (-9187201950435737472L);
                                    int i23 = i22;
                                    jArr4[i23] = ((~j17) + (j17 >>> 7)) & (-72340172838076674L);
                                    i22 = i23 + 1;
                                    j15 = j16;
                                }
                                j8 = j15;
                                int length = jArr4.length;
                                int i24 = length - 1;
                                int i25 = length - 2;
                                jArr4[i25] = (jArr4[i25] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i24] = jArr4[0];
                                int i26 = 0;
                                while (i26 != i20) {
                                    int i27 = i26 >> 3;
                                    int i28 = (i26 & 7) << 3;
                                    long j18 = (jArr4[i27] >> i28) & j8;
                                    if (j18 != 128 && j18 == 254) {
                                        Object obj2 = objArr[i26];
                                        int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i18;
                                        int i29 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                        int e9 = e(i29);
                                        int i30 = i29 & i20;
                                        if (((e9 - i30) & i20) / 8 == ((i26 - i30) & i20) / 8) {
                                            int i31 = i20;
                                            Object[] objArr2 = objArr;
                                            jArr4[i27] = (jArr4[i27] & (~(j8 << i28))) | ((r17 & 127) << i28);
                                            if (jArr6[i26] == 9223372034707292159L) {
                                                long j19 = i26;
                                                jArr6[i26] = j19 | (j19 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i26++;
                                            i20 = i31;
                                            objArr = objArr2;
                                        } else {
                                            int i32 = i20;
                                            Object[] objArr3 = objArr;
                                            int i33 = e9 >> 3;
                                            long j20 = jArr4[i33];
                                            int i34 = (e9 & 7) << 3;
                                            if (((j20 >> i34) & j8) == 128) {
                                                jArr4[i33] = (j20 & (~(j8 << i34))) | ((r17 & 127) << i34);
                                                jArr4[i27] = (jArr4[i27] & (~(j8 << i28))) | (128 << i28);
                                                objArr3[e9] = objArr3[i26];
                                                objArr3[i26] = null;
                                                jArr5[e9] = jArr5[i26];
                                                jArr5[i26] = 4611686018427387903L;
                                                int i35 = (int) ((jArr6[i26] >> 32) & 4294967295L);
                                                int i36 = Integer.MAX_VALUE;
                                                if (i35 != Integer.MAX_VALUE) {
                                                    j10 = j12;
                                                    jArr6[i35] = e9 | (jArr6[i35] & (-4294967296L));
                                                    jArr6[i26] = (jArr6[i26] & 4294967295L) | (-4294967296L);
                                                    i36 = Integer.MAX_VALUE;
                                                } else {
                                                    j10 = j12;
                                                    jArr6[i26] = (Integer.MAX_VALUE << 32) | e9;
                                                }
                                                jArr6[e9] = (i26 << 32) | i36;
                                            } else {
                                                j10 = j12;
                                                jArr4[i33] = ((r17 & 127) << i34) | (j20 & (~(j8 << i34)));
                                                Object obj3 = objArr3[e9];
                                                objArr3[e9] = objArr3[i26];
                                                objArr3[i26] = obj3;
                                                long j21 = jArr5[e9];
                                                jArr5[e9] = jArr5[i26];
                                                jArr5[i26] = j21;
                                                int i37 = (int) ((jArr6[i26] >> 32) & 4294967295L);
                                                if (i37 != Integer.MAX_VALUE) {
                                                    long j22 = e9;
                                                    jArr6[i37] = (jArr6[i37] & (-4294967296L)) | j22;
                                                    jArr6[i26] = (jArr6[i26] & 4294967295L) | (j22 << 32);
                                                } else {
                                                    long j23 = e9;
                                                    jArr6[i26] = j23 | (j23 << 32);
                                                    i37 = i26;
                                                }
                                                jArr6[e9] = (i37 << 32) | i26;
                                                i26--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i26++;
                                            i20 = i32;
                                            objArr = objArr3;
                                            j12 = j10;
                                        }
                                    } else {
                                        i26++;
                                    }
                                }
                                j7 = j12;
                                this.f5454h = r0.a(this.f5452f) - this.f5453g;
                                long[] jArr7 = this.f5449c;
                                int length2 = jArr7.length;
                                for (int i38 = 0; i38 < length2; i38++) {
                                    long j24 = jArr7[i38];
                                    jArr7[i38] = (((j24 & (-4611686018427387904L)) | (((int) ((j24 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r4] & 4294967295L))) << 31) | (((int) (j24 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r6] & 4294967295L));
                                }
                                int i39 = this.f5450d;
                                if (i39 != Integer.MAX_VALUE) {
                                    this.f5450d = (int) (jArr6[i39] & 4294967295L);
                                }
                                int i40 = this.f5451e;
                                if (i40 != Integer.MAX_VALUE) {
                                    this.f5451e = (int) (jArr6[i40] & 4294967295L);
                                }
                            }
                            e8 = e(i10);
                        }
                    } else {
                        c8 = 31;
                        j9 = 128;
                    }
                    i = 0;
                    j7 = j12;
                    j8 = 255;
                    int b8 = r0.b(this.f5452f);
                    long[] jArr8 = this.f5447a;
                    Object[] objArr4 = this.f5448b;
                    long[] jArr9 = this.f5449c;
                    int i41 = this.f5452f;
                    int[] iArr = new int[i41];
                    f(b8);
                    long[] jArr10 = this.f5447a;
                    Object[] objArr5 = this.f5448b;
                    long[] jArr11 = this.f5449c;
                    int i42 = this.f5452f;
                    int i43 = 0;
                    while (i43 < i41) {
                        if (((jArr8[i43 >> 3] >> ((i43 & 7) << 3)) & 255) < j9) {
                            Object obj4 = objArr4[i43];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i18;
                            int i44 = hashCode3 ^ (hashCode3 << 16);
                            int e10 = e(i44 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j25 = i44 & 127;
                            int i45 = e10 >> 3;
                            int i46 = (e10 & 7) << 3;
                            long j26 = (jArr[i45] & (~(255 << i46))) | (j25 << i46);
                            jArr[i45] = j26;
                            jArr[(((e10 - 7) & i42) + (i42 & 7)) >> 3] = j26;
                            objArr5[e10] = obj4;
                            jArr11[e10] = jArr9[i43];
                            iArr[i43] = e10;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i43++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f5449c;
                    int length3 = jArr12.length;
                    for (int i47 = 0; i47 < length3; i47++) {
                        long j27 = jArr12[i47];
                        jArr12[i47] = (((j27 & (-4611686018427387904L)) | (((int) ((j27 >> c8) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r4])) << c8) | (((int) (j27 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r6]);
                    }
                    int i48 = this.f5450d;
                    if (i48 != Integer.MAX_VALUE) {
                        this.f5450d = iArr[i48];
                    }
                    int i49 = this.f5451e;
                    if (i49 != Integer.MAX_VALUE) {
                        this.f5451e = iArr[i49];
                    }
                    e8 = e(i10);
                }
                this.f5453g++;
                int i50 = this.f5454h;
                long[] jArr13 = this.f5447a;
                int i51 = e8 >> 3;
                long j28 = jArr13[i51];
                int i52 = (e8 & 7) << 3;
                if (((j28 >> i52) & j8) == j9) {
                    i = 1;
                }
                this.f5454h = i50 - i;
                int i53 = this.f5452f;
                long j29 = (j28 & (~(j8 << i52))) | (j7 << i52);
                jArr13[i51] = j29;
                jArr13[(((e8 - 7) & i53) + (i53 & 7)) >> 3] = j29;
                return e8;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i8 = i18;
        }
    }

    public final int e(int i) {
        int i8 = this.f5452f;
        int i9 = i & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f5447a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j7 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j8 = j7 & ((~j7) << 7) & (-9187201950435737472L);
            if (j8 != 0) {
                return (i9 + (Long.numberOfTrailingZeros(j8) >> 3)) & i8;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (f0Var.f5453g != this.f5453g) {
            return false;
        }
        Object[] objArr = this.f5448b;
        long[] jArr = this.f5447a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j7 = jArr[i];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j7) < 128 && !f0Var.c(objArr[(i << 3) + i9])) {
                            return false;
                        }
                        j7 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final void f(int i) {
        long[] jArr;
        long[] jArr2;
        int max = i > 0 ? Math.max(7, r0.c(i)) : 0;
        this.f5452f = max;
        if (max == 0) {
            jArr = r0.f5528a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            d6.l.M(jArr, -9187201950435737472L);
        }
        this.f5447a = jArr;
        int i8 = max >> 3;
        long j7 = 255 << ((max & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j7)) | j7;
        this.f5454h = r0.a(this.f5452f) - this.f5453g;
        this.f5448b = max == 0 ? p.a.f5709c : new Object[max];
        if (max == 0) {
            jArr2 = r.f5526b;
        } else {
            jArr2 = new long[max];
            d6.l.M(jArr2, 4611686018427387903L);
        }
        this.f5449c = jArr2;
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
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f5452f;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f5447a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j7 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j8 = (i9 * 72340172838076673L) ^ j7;
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j9 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j9) >> 3) + i11) & i10;
                if (q6.i.a(this.f5448b[i], obj)) {
                    break loop0;
                }
                j9 &= j9 - 1;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
        boolean z3 = i >= 0;
        if (z3) {
            h(i);
        }
        return z3;
    }

    public final void h(int i) {
        this.f5453g--;
        long[] jArr = this.f5447a;
        int i8 = this.f5452f;
        int i9 = i >> 3;
        int i10 = (i & 7) << 3;
        long j7 = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        jArr[i9] = j7;
        jArr[(((i - 7) & i8) + (i8 & 7)) >> 3] = j7;
        this.f5448b[i] = null;
        long[] jArr2 = this.f5449c;
        long j8 = jArr2[i];
        int i11 = (int) ((j8 >> 31) & 2147483647L);
        int i12 = (int) (j8 & 2147483647L);
        if (i11 != Integer.MAX_VALUE) {
            jArr2[i11] = (jArr2[i11] & (-2147483648L)) | (i12 & 2147483647L);
        } else {
            this.f5450d = i12;
        }
        if (i12 != Integer.MAX_VALUE) {
            jArr2[i12] = ((i11 & 2147483647L) << 31) | (jArr2[i12] & (-4611686016279904257L));
        } else {
            this.f5451e = i11;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final int hashCode() {
        int i = (this.f5452f * 31) + this.f5453g;
        Object[] objArr = this.f5448b;
        long[] jArr = this.f5447a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j7 = jArr[i8];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j7) < 128) {
                            Object obj = objArr[(i8 << 3) + i10];
                            if (!q6.i.a(obj, this)) {
                                i += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j7 >>= 8;
                    }
                    if (i9 != 8) {
                        return i;
                    }
                }
                if (i8 == length) {
                    break;
                }
                i8++;
            }
        }
        return i;
    }

    public final boolean i(Collection collection) {
        q6.i.e(collection, "elements");
        Object[] objArr = this.f5448b;
        int i = this.f5453g;
        long[] jArr = this.f5447a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j7 = jArr[i8];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j7) < 128) {
                            int i11 = (i8 << 3) + i10;
                            if (!d6.m.Q(collection, objArr[i11])) {
                                h(i11);
                            }
                        }
                        j7 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                }
                i8++;
            }
        }
        return i != this.f5453g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f5448b;
        long[] jArr = this.f5449c;
        int i = this.f5451e;
        int i8 = 0;
        while (true) {
            if (i == Integer.MAX_VALUE) {
                sb.append((CharSequence) "]");
                break;
            }
            int i9 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            if (i8 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i8 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i8++;
            i = i9;
        }
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }
}
