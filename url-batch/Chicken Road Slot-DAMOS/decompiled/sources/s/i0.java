package s;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8319a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f8320b;

    /* renamed from: c, reason: collision with root package name */
    public int f8321c;

    /* renamed from: d, reason: collision with root package name */
    public int f8322d;

    /* renamed from: e, reason: collision with root package name */
    public int f8323e;

    public i0(int i3) {
        this.f8319a = p0.f8356a;
        this.f8320b = t.a.f9195c;
        if (i3 >= 0) {
            f(p0.d(i3));
        } else {
            a1.e("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i3 = this.f8322d;
        this.f8320b[d(obj)] = obj;
        return this.f8322d != i3;
    }

    public final void b() {
        this.f8322d = 0;
        long[] jArr = this.f8319a;
        if (jArr != p0.f8356a) {
            kotlin.collections.v.j(jArr, -9187201950435737472L);
            long[] jArr2 = this.f8319a;
            int i3 = this.f8321c;
            int i10 = i3 >> 3;
            long j = 255 << ((i3 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j)) | j;
        }
        kotlin.collections.v.i(this.f8320b, 0, this.f8321c);
        this.f8323e = p0.a(this.f8321c) - this.f8322d;
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
        int i12 = this.f8321c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f8319a;
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
                if (Intrinsics.a(this.f8320b[i3], obj)) {
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
        long j;
        long j3;
        long j10;
        long[] jArr;
        long[] jArr2;
        int i3;
        Object[] objArr;
        int i10;
        int i11 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f8321c;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr3 = this.f8319a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j11 = ((jArr3[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr3[i18] >>> i19);
            long j12 = i14;
            int i20 = i14;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (j14 != 0) {
                int numberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j14) >> 3)) & i15;
                int i21 = i11;
                if (Intrinsics.a(this.f8320b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i11 = i21;
            }
            int i22 = i11;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int e2 = e(i13);
                long j15 = 255;
                if (this.f8323e != 0 || ((this.f8319a[e2 >> 3] >> ((e2 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j3 = j12;
                    j10 = 128;
                } else {
                    int i23 = this.f8321c;
                    if (i23 > 8) {
                        int i24 = 8;
                        long j16 = this.f8322d;
                        hd.z zVar = hd.a0.f4495e;
                        if (Long.compare((j16 * 32) ^ Long.MIN_VALUE, (i23 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f8319a;
                            int i25 = this.f8321c;
                            Object[] objArr2 = this.f8320b;
                            int i26 = (i25 + 7) >> 3;
                            int i27 = 0;
                            j10 = 128;
                            while (i27 < i26) {
                                long j17 = j15;
                                long j18 = jArr4[i27] & (-9187201950435737472L);
                                jArr4[i27] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                                i27++;
                                i24 = i24;
                                j12 = j12;
                                j15 = j17;
                            }
                            j = j15;
                            j3 = j12;
                            int i28 = i24;
                            int o6 = kotlin.collections.w.o(jArr4);
                            int i29 = o6 - 1;
                            long j19 = 72057594037927935L;
                            jArr4[i29] = (jArr4[i29] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[o6] = jArr4[0];
                            int i30 = 0;
                            while (i30 != i25) {
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                long j20 = (jArr4[i31] >> i32) & j;
                                if (j20 != 128 && j20 == 254) {
                                    Object obj2 = objArr2[i30];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i22;
                                    int i33 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e9 = e(i33);
                                    int i34 = i33 & i25;
                                    if (((e9 - i34) & i25) / i28 == ((i30 - i34) & i25) / i28) {
                                        long j21 = j19;
                                        jArr4[i31] = ((r7 & 127) << i32) | ((~(j << i32)) & jArr4[i31]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j21) | Long.MIN_VALUE;
                                        i30++;
                                        j19 = j21;
                                    } else {
                                        long j22 = j19;
                                        int i35 = e9 >> 3;
                                        long j23 = jArr4[i35];
                                        int i36 = (e9 & 7) << 3;
                                        if (((j23 >> i36) & j) == 128) {
                                            i10 = i28;
                                            i3 = i25;
                                            objArr = objArr2;
                                            jArr4[i35] = ((~(j << i36)) & j23) | ((r7 & 127) << i36);
                                            jArr4[i31] = (jArr4[i31] & (~(j << i32))) | (128 << i32);
                                            objArr[e9] = objArr[i30];
                                            objArr[i30] = null;
                                        } else {
                                            i3 = i25;
                                            objArr = objArr2;
                                            i10 = i28;
                                            jArr4[i35] = ((r7 & 127) << i36) | ((~(j << i36)) & j23);
                                            Object obj3 = objArr[e9];
                                            objArr[e9] = objArr[i30];
                                            objArr[i30] = obj3;
                                            i30--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j22) | Long.MIN_VALUE;
                                        i30++;
                                        j19 = j22;
                                        i28 = i10;
                                        i25 = i3;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i30++;
                                }
                            }
                            this.f8323e = p0.a(this.f8321c) - this.f8322d;
                            e2 = e(i13);
                        }
                    }
                    j = 255;
                    j3 = j12;
                    j10 = 128;
                    int b10 = p0.b(this.f8321c);
                    long[] jArr5 = this.f8319a;
                    Object[] objArr3 = this.f8320b;
                    int i37 = this.f8321c;
                    f(b10);
                    long[] jArr6 = this.f8319a;
                    Object[] objArr4 = this.f8320b;
                    int i38 = this.f8321c;
                    int i39 = 0;
                    while (i39 < i37) {
                        if (((jArr5[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i39];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i22;
                            int i40 = hashCode3 ^ (hashCode3 << 16);
                            int e10 = e(i40 >>> 7);
                            long j24 = i40 & 127;
                            int i41 = e10 >> 3;
                            int i42 = (e10 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j25 = (jArr6[i41] & (~(255 << i42))) | (j24 << i42);
                            jArr[i41] = j25;
                            jArr[(((e10 - 7) & i38) + (i38 & 7)) >> 3] = j25;
                            objArr4[e10] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i39++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e2 = e(i13);
                }
                this.f8322d++;
                int i43 = this.f8323e;
                long[] jArr7 = this.f8319a;
                int i44 = e2 >> 3;
                long j26 = jArr7[i44];
                int i45 = (e2 & 7) << 3;
                this.f8323e = i43 - (((j26 >> i45) & j) == j10 ? 1 : 0);
                int i46 = this.f8321c;
                long j27 = (j26 & (~(j << i45))) | (j3 << i45);
                jArr7[i44] = j27;
                jArr7[(((e2 - 7) & i46) + (i46 & 7)) >> 3] = j27;
                return e2;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i14 = i20;
            i11 = i22;
        }
    }

    public final int e(int i3) {
        int i10 = this.f8321c;
        int i11 = i3 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f8319a;
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
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (i0Var.f8322d != this.f8322d) {
            return false;
        }
        Object[] objArr = this.f8320b;
        long[] jArr = this.f8319a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128 && !i0Var.c(objArr[(i3 << 3) + i11])) {
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
        int max = i3 > 0 ? Math.max(7, p0.c(i3)) : 0;
        this.f8321c = max;
        if (max == 0) {
            jArr = p0.f8356a;
        } else {
            int i10 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i10];
            Arrays.fill(jArr2, 0, i10, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f8319a = jArr;
        int i11 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f8323e = p0.a(this.f8321c) - this.f8322d;
        this.f8320b = max == 0 ? t.a.f9195c : new Object[max];
    }

    public final boolean g() {
        return this.f8322d == 0;
    }

    public final boolean h() {
        return this.f8322d != 0;
    }

    public final int hashCode() {
        int i3 = (this.f8321c * 31) + this.f8322d;
        Object[] objArr = this.f8320b;
        long[] jArr = this.f8319a;
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

    public final void i(Object obj) {
        this.f8320b[d(obj)] = obj;
    }

    public final void j(i0 i0Var) {
        i0Var.getClass();
        Object[] objArr = i0Var.f8320b;
        long[] jArr = i0Var.f8319a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i3 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        i(objArr[(i3 << 3) + i11]);
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
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
    public final boolean k(Object obj) {
        int i3;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f8321c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f8319a;
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
                if (Intrinsics.a(this.f8320b[i3], obj)) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        boolean z10 = i3 >= 0;
        if (z10) {
            l(i3);
        }
        return z10;
    }

    public final void l(int i3) {
        this.f8322d--;
        long[] jArr = this.f8319a;
        int i10 = this.f8321c;
        int i11 = i3 >> 3;
        int i12 = (i3 & 7) << 3;
        long j = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j;
        jArr[(((i3 - 7) & i10) + (i10 & 7)) >> 3] = j;
        this.f8320b[i3] = null;
    }

    public final String toString() {
        a3.e eVar = new a3.e(20, this);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f8320b;
        long[] jArr = this.f8319a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i3 << 3) + i12];
                            if (i10 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append((CharSequence) eVar.invoke(obj));
                            i10++;
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
            return sb2.toString();
        }
        sb2.append((CharSequence) "]");
        return sb2.toString();
    }

    public /* synthetic */ i0() {
        this(6);
    }
}
