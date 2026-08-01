package s;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8267a = p0.f8356a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f8268b = t.a.f9195c;

    /* renamed from: c, reason: collision with root package name */
    public float[] f8269c = h.f8311a;

    /* renamed from: d, reason: collision with root package name */
    public int f8270d;

    /* renamed from: e, reason: collision with root package name */
    public int f8271e;

    /* renamed from: f, reason: collision with root package name */
    public int f8272f;

    public b0(int i3) {
        if (i3 >= 0) {
            c(p0.d(i3));
        } else {
            a1.e("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i3) {
        int i10 = this.f8270d;
        int i11 = i3 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f8267a;
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
        int i3 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f8270d;
        int i13 = i10 >>> 7;
        while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f8267a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j3 = (i11 * 72340172838076673L) ^ j;
            for (long j10 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i14) & i12;
                if (Intrinsics.a(this.f8268b[numberOfTrailingZeros], obj)) {
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

    public final void c(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, p0.c(i3)) : 0;
        this.f8270d = max;
        if (max == 0) {
            jArr = p0.f8356a;
        } else {
            int i10 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i10];
            Arrays.fill(jArr2, 0, i10, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f8267a = jArr;
        int i11 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f8272f = p0.a(this.f8270d) - this.f8271e;
        this.f8268b = new Object[max];
        this.f8269c = new float[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        r2 = a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        if (r37.f8272f != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        if (((r37.f8267a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        r2 = r37.f8270d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        if (r2 <= 8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b1, code lost:
    
        r3 = r37.f8271e;
        r18 = hd.a0.f4495e;
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cd, code lost:
    
        if (java.lang.Long.compare((r3 * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cf, code lost:
    
        r2 = r37.f8267a;
        r3 = r37.f8270d;
        r4 = r37.f8268b;
        r6 = r37.f8269c;
        r7 = (r3 + 7) >> 3;
        r25 = 255;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00de, code lost:
    
        if (r8 >= r7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e0, code lost:
    
        r10 = r2[r8] & r13;
        r2[r8] = (-72340172838076674L) & ((~r10) + (r10 >>> 7));
        r8 = r8 + 1;
        r11 = r11;
        r13 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fc, code lost:
    
        r29 = r11;
        r9 = 7;
        r7 = kotlin.collections.w.o(r2);
        r8 = r7 - 1;
        r12 = 72057594037927935L;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0118, code lost:
    
        if (r7 == r3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011a, code lost:
    
        r8 = r7 >> 3;
        r14 = (r7 & 7) << 3;
        r10 = (r2[r8] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0127, code lost:
    
        if (r10 != 128) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012e, code lost:
    
        if (r10 == 254) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0131, code lost:
    
        r10 = r4[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0133, code lost:
    
        if (r10 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0135, code lost:
    
        r10 = r10.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013b, code lost:
    
        r10 = r10 * r20;
        r11 = (r10 ^ (r10 << 16)) >>> 7;
        r27 = a(r11);
        r11 = r11 & r3;
        r31 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0154, code lost:
    
        if ((((r27 - r11) & r3) / 8) != (((r7 - r11) & r3) / 8)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0178, code lost:
    
        r32 = r12;
        r9 = r27 >> 3;
        r11 = r2[r9];
        r13 = (r27 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0188, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x018a, code lost:
    
        r28 = r3;
        r34 = r4;
        r2[r9] = ((~(255 << r13)) & r11) | ((r10 & 127) << r13);
        r2[r8] = (r2[r8] & (~(255 << r14))) | (128 << r14);
        r34[r27] = r34[r7];
        r34[r7] = null;
        r6[r27] = r6[r7];
        r6[r7] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01da, code lost:
    
        r2[r2.length - 1] = (r2[0] & r32) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r3 = r28;
        r9 = r31;
        r12 = r32;
        r4 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b6, code lost:
    
        r28 = r3;
        r34 = r4;
        r2[r9] = ((~(255 << r13)) & r11) | ((r10 & 127) << r13);
        r3 = r34[r27];
        r34[r27] = r34[r7];
        r34[r7] = r3;
        r3 = r6[r27];
        r6[r27] = r6[r7];
        r6[r7] = r3;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0156, code lost:
    
        r32 = r12;
        r2[r8] = ((r10 & 127) << r14) | (r2[r8] & (~(255 << r14)));
        r2[r2.length - 1] = (r2[0] & r32) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r9 = r31;
        r12 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013a, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0129, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f1, code lost:
    
        r37.f8272f = s.p0.a(r37.f8270d) - r37.f8271e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x027f, code lost:
    
        r2 = a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0283, code lost:
    
        r37.f8271e++;
        r1 = r37.f8272f;
        r3 = r37.f8267a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x029b, code lost:
    
        if (((r5 >> r7) & r25) != r18) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x029d, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x029f, code lost:
    
        r37.f8272f = r1 - r15;
        r1 = r37.f8270d;
        r5 = (r5 & (~(r25 << r7))) | (r29 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0200, code lost:
    
        r25 = 255;
        r29 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x020a, code lost:
    
        r2 = s.p0.b(r37.f8270d);
        r3 = r37.f8267a;
        r4 = r37.f8268b;
        r6 = r37.f8269c;
        r7 = r37.f8270d;
        c(r2);
        r2 = r37.f8267a;
        r8 = r37.f8268b;
        r9 = r37.f8269c;
        r10 = r37.f8270d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0224, code lost:
    
        if (r11 >= r7) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0233, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r18) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0235, code lost:
    
        r12 = r4[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0237, code lost:
    
        if (r12 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0239, code lost:
    
        r13 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x023f, code lost:
    
        r13 = r13 * r20;
        r13 = r13 ^ (r13 << 16);
        r14 = a(r13 >>> 7);
        r17 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r21 = (r14 & 7) << 3;
        r1 = (r17[r13] & (~(255 << r21))) | (r1 << r21);
        r17[r13] = r1;
        r17[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0278, code lost:
    
        r11 = r11 + 1;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x023e, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0276, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0207, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00a3, code lost:
    
        r25 = 255;
        r29 = r11;
        r18 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(String str, float f3) {
        int i3;
        int i10;
        String str2 = str;
        int i11 = -862048943;
        int hashCode = (str2 != null ? str2.hashCode() : 0) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f8270d;
        int i16 = i13 & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f8267a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j3 = i14;
            int i20 = i14;
            int i21 = 0;
            long j10 = j ^ (j3 * 72340172838076673L);
            long j11 = -9187201950435737472L;
            long j12 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j12 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j12) >> 3)) & i15;
                int i22 = i11;
                if (Intrinsics.a(this.f8268b[numberOfTrailingZeros], str2)) {
                    i10 = numberOfTrailingZeros;
                    break loop0;
                } else {
                    j12 &= j12 - 1;
                    i11 = i22;
                }
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            str2 = str;
            i14 = i20;
            i11 = i3;
        }
        if (i10 < 0) {
            i10 = ~i10;
        }
        this.f8268b[i10] = str;
        this.f8269c[i10] = f3;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (b0Var.f8271e != this.f8271e) {
            return false;
        }
        Object[] objArr = this.f8268b;
        float[] fArr = this.f8269c;
        long[] jArr = this.f8267a;
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
                        float f3 = fArr[i12];
                        int b10 = b0Var.b(obj2);
                        if (b10 < 0) {
                            break loop0;
                        }
                        z11 = z12;
                        if (f3 != b0Var.f8269c[b10]) {
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

    public final int hashCode() {
        Object[] objArr = this.f8268b;
        float[] fArr = this.f8269c;
        long[] jArr = this.f8267a;
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
                        i10 += Float.hashCode(fArr[i13]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.f8271e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f8268b;
        float[] fArr = this.f8269c;
        long[] jArr = this.f8267a;
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
                            float f3 = fArr[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(f3);
                            i10++;
                            if (i10 < this.f8271e) {
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
}
