package j;

import java.util.NoSuchElementException;
import k.AbstractC0561a;

/* renamed from: j.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549w {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6338a = AbstractC0522D.f6254a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f6339b = AbstractC0561a.f6410c;

    /* renamed from: c, reason: collision with root package name */
    public long[] f6340c = AbstractC0537k.f6286a;

    /* renamed from: d, reason: collision with root package name */
    public int f6341d;

    /* renamed from: e, reason: collision with root package name */
    public int f6342e;

    /* renamed from: f, reason: collision with root package name */
    public int f6343f;

    public C0549w(int i3) {
        if (i3 >= 0) {
            d(AbstractC0522D.f(i3));
        } else {
            AbstractC0561a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i3) {
        int i4 = this.f6341d;
        int i5 = i3 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f6338a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j3 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j4 = j3 & ((~j3) << 7) & (-9187201950435737472L);
            if (j4 != 0) {
                return (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final int b(Object obj) {
        int i3 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this.f6341d;
        int i7 = i4 >>> 7;
        while (true) {
            int i8 = i7 & i6;
            long[] jArr = this.f6338a;
            int i9 = i8 >> 3;
            int i10 = (i8 & 7) << 3;
            long j3 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j4 = (i5 * 72340172838076673L) ^ j3;
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i8) & i6;
                if (f2.j.a(this.f6339b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i3 += 8;
            i7 = i8 + i3;
        }
    }

    public final long c(Object obj) {
        int b3 = b(obj);
        if (b3 >= 0) {
            return this.f6340c[b3];
        }
        throw new NoSuchElementException("There is no key " + obj + " in the map");
    }

    public final void d(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, AbstractC0522D.e(i3)) : 0;
        this.f6341d = max;
        if (max == 0) {
            jArr = AbstractC0522D.f6254a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            S1.k.s0(jArr);
        }
        this.f6338a = jArr;
        int i4 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j3)) | j3;
        this.f6343f = AbstractC0522D.c(this.f6341d) - this.f6342e;
        this.f6339b = new Object[max];
        this.f6340c = new long[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        r2 = r0.a(r4);
        r6 = 128;
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r0.f6343f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        if (((r0.f6338a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        r2 = r0.f6341d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        if (r2 <= 8) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
    
        if (java.lang.Long.compare((r0.f6342e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
    
        r2 = r0.f6338a;
        r5 = r0.f6341d;
        r8 = r0.f6339b;
        r9 = r0.f6340c;
        j.AbstractC0522D.a(r2, r5);
        r13 = -1;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
    
        if (r15 == r5) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c9, code lost:
    
        r16 = r15 >> 3;
        r29 = (r15 & 7) << 3;
        r27 = (r2[r16] >> r29) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d7, code lost:
    
        if (r27 != r6) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e3, code lost:
    
        if (r27 == 254) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e8, code lost:
    
        r27 = r8[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ea, code lost:
    
        if (r27 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ec, code lost:
    
        r27 = r27.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
    
        r27 = r27 * r3;
        r10 = (r27 ^ (r27 << 16)) >>> 7;
        r30 = r0.a(r10);
        r10 = r10 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0112, code lost:
    
        if ((((r30 - r10) & r5) / 8) != (((r15 - r10) & r5) / 8)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0114, code lost:
    
        r2[r16] = (r2[r16] & (~(255 << r29))) | ((r27 & 127) << r29);
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r15 + 1;
        r13 = r13;
        r3 = -862048943;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013b, code lost:
    
        r6 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013e, code lost:
    
        r14 = r13;
        r6 = r15;
        r3 = r30 >> 3;
        r19 = r2[r3];
        r7 = (r30 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0150, code lost:
    
        if (((r19 >> r7) & 255) != 128) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0152, code lost:
    
        r2[r3] = (r19 & (~(255 << r7))) | ((r27 & 127) << r7);
        r2[r16] = (r2[r16] & (~(255 << r29))) | (128 << r29);
        r8[r30] = r8[r6];
        r8[r6] = null;
        r9[r30] = r9[r6];
        r9[r6] = 0;
        r1 = r6;
        r16 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b2, code lost:
    
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r1 + 1;
        r3 = -862048943;
        r0 = r39;
        r13 = r6;
        r9 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017e, code lost:
    
        r16 = r9;
        r2[r3] = ((r27 & 127) << r7) | (r19 & (~(255 << r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x018d, code lost:
    
        if (r14 != (-1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018f, code lost:
    
        r13 = j.AbstractC0522D.b(r2, r6 + 1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0197, code lost:
    
        r8[r13] = r8[r30];
        r8[r30] = r8[r6];
        r8[r6] = r8[r13];
        r16[r13] = r16[r30];
        r16[r30] = r16[r6];
        r16[r6] = r16[r13];
        r1 = r6 - 1;
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0196, code lost:
    
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f1, code lost:
    
        r27 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e5, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d9, code lost:
    
        r38 = r15;
        r15 = r15 + 1;
        r13 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01cd, code lost:
    
        r1 = r0;
        r19 = 0;
        r1.f6343f = j.AbstractC0522D.c(r1.f6341d) - r1.f6342e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x026a, code lost:
    
        r2 = r1.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x026e, code lost:
    
        r3 = 1;
        r1.f6342e++;
        r0 = r1.f6343f;
        r4 = r1.f6338a;
        r5 = r2 >> 3;
        r6 = r4[r5];
        r8 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0289, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x028c, code lost:
    
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x028e, code lost:
    
        r1.f6343f = r0 - r3;
        r0 = r1.f6341d;
        r6 = (r6 & (~(255 << r8))) | (r23 << r8);
        r4[r5] = r6;
        r4[(((r2 - 7) & r0) + (r0 & 7)) >> 3] = r6;
        r0 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01dd, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01de, code lost:
    
        r19 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e5, code lost:
    
        r0 = j.AbstractC0522D.d(r1.f6341d);
        r2 = r1.f6338a;
        r3 = r1.f6339b;
        r5 = r1.f6340c;
        r6 = r1.f6341d;
        r1.d(r0);
        r0 = r1.f6338a;
        r7 = r1.f6339b;
        r8 = r1.f6340c;
        r9 = r1.f6341d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0200, code lost:
    
        if (r10 >= r6) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0211, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & r11) >= 128) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0213, code lost:
    
        r14 = r3[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0215, code lost:
    
        if (r14 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0217, code lost:
    
        r15 = r14.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0222, code lost:
    
        r15 = r15 * (-862048943);
        r15 = r15 ^ (r15 << 16);
        r13 = r1.a(r15 >>> 7);
        r11 = r15 & 127;
        r15 = r13 >> 3;
        r16 = (r13 & 7) << 3;
        r18 = r2;
        r27 = r3;
        r2 = (r0[r15] & (~(255 << r16))) | (r11 << r16);
        r0[r15] = r2;
        r0[(((r13 - 7) & r9) + (r9 & 7)) >> 3] = r2;
        r7[r13] = r14;
        r8[r13] = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0261, code lost:
    
        r10 = r10 + 1;
        r2 = r18;
        r3 = r27;
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x021f, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x025a, code lost:
    
        r18 = r2;
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e1, code lost:
    
        r1 = r0;
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0097, code lost:
    
        r1 = r0;
        r23 = r9;
        r19 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j3, Object obj) {
        C0549w c0549w;
        int i3;
        C0549w c0549w2 = this;
        Object obj2 = obj;
        int i4 = -862048943;
        int hashCode = obj.hashCode() * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = c0549w2.f6341d;
        int i9 = i6 & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr = c0549w2.f6338a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = i10;
            long j4 = (((-i12) >> 63) & (jArr[i11 + 1] << (64 - i12))) | (jArr[i11] >>> i12);
            long j5 = i7;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (j6 - 72340172838076673L) & (~j6) & (-9187201950435737472L);
            while (true) {
                if (j7 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j7) >> 3)) & i8;
                if (f2.j.a(c0549w2.f6339b[numberOfTrailingZeros], obj2)) {
                    c0549w = c0549w2;
                    i3 = numberOfTrailingZeros;
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i10 = i13 + 8;
            i9 = (i9 + i10) & i8;
            c0549w2 = c0549w2;
            obj2 = obj;
        }
        if (i3 < 0) {
            i3 = ~i3;
        }
        c0549w.f6339b[i3] = obj;
        c0549w.f6340c[i3] = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0549w)) {
            return false;
        }
        C0549w c0549w = (C0549w) obj;
        if (c0549w.f6342e != this.f6342e) {
            return false;
        }
        Object[] objArr = this.f6339b;
        long[] jArr = this.f6340c;
        long[] jArr2 = this.f6338a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr2[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            int i6 = (i3 << 3) + i5;
                            if (jArr[i6] != c0549w.c(objArr[i6])) {
                                return false;
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i4 != 8) {
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

    public final int hashCode() {
        Object[] objArr = this.f6339b;
        long[] jArr = this.f6340c;
        long[] jArr2 = this.f6338a;
        int length = jArr2.length - 2;
        int i3 = 0;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j3 = jArr2[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j3) < 128) {
                            int i8 = (i4 << 3) + i7;
                            Object obj = objArr[i8];
                            i5 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(jArr[i8]);
                        }
                        j3 >>= 8;
                    }
                    if (i6 != 8) {
                        return i5;
                    }
                }
                if (i4 == length) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
        }
        return i3;
    }

    public final String toString() {
        int i3;
        int i4;
        if (this.f6342e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f6339b;
        long[] jArr = this.f6340c;
        long[] jArr2 = this.f6338a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                long j3 = jArr2[i5];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((255 & j3) < 128) {
                            int i9 = (i5 << 3) + i8;
                            Object obj = objArr[i9];
                            i4 = i5;
                            long j4 = jArr[i9];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(j4);
                            i6++;
                            if (i6 < this.f6342e) {
                                sb.append(", ");
                            }
                        } else {
                            i4 = i5;
                        }
                        j3 >>= 8;
                        i8++;
                        i5 = i4;
                    }
                    int i10 = i5;
                    if (i7 != 8) {
                        break;
                    }
                    i3 = i10;
                } else {
                    i3 = i5;
                }
                if (i3 == length) {
                    break;
                }
                i5 = i3 + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        f2.j.e(sb2, "s.append('}').toString()");
        return sb2;
    }
}
