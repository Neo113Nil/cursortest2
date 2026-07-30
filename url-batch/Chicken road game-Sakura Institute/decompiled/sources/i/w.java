package i;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public long[] f4806a = e0.f4736a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f4807b = j.a.f4968c;

    /* renamed from: c, reason: collision with root package name */
    public long[] f4808c = k.f4754a;

    /* renamed from: d, reason: collision with root package name */
    public int f4809d;

    /* renamed from: e, reason: collision with root package name */
    public int f4810e;

    /* renamed from: f, reason: collision with root package name */
    public int f4811f;

    public w(int i7) {
        if (i7 >= 0) {
            d(e0.f(i7));
        } else {
            j.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i7) {
        int i8 = this.f4809d;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f4806a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j8 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j9 = j8 & ((~j8) << 7) & (-9187201950435737472L);
            if (j9 != 0) {
                return (i9 + (Long.numberOfTrailingZeros(j9) >> 3)) & i8;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
        }
    }

    public final int b(Object obj) {
        int i7 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f4809d;
        int i11 = i8 >>> 7;
        while (true) {
            int i12 = i11 & i10;
            long[] jArr = this.f4806a;
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            long j8 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j9 = (i9 * 72340172838076673L) ^ j8;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i12) & i10;
                if (r6.k.a(this.f4807b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i7 += 8;
            i11 = i12 + i7;
        }
    }

    public final long c(Object obj) {
        int b9 = b(obj);
        if (b9 >= 0) {
            return this.f4808c[b9];
        }
        throw new NoSuchElementException("There is no key " + obj + " in the map");
    }

    public final void d(int i7) {
        long[] jArr;
        int max = i7 > 0 ? Math.max(7, e0.e(i7)) : 0;
        this.f4809d = max;
        if (max == 0) {
            jArr = e0.f4736a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            e6.k.d0(jArr);
        }
        this.f4806a = jArr;
        int i8 = max >> 3;
        long j8 = 255 << ((max & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j8)) | j8;
        this.f4811f = e0.c(this.f4809d) - this.f4810e;
        this.f4807b = new Object[max];
        this.f4808c = new long[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        r2 = a(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        if (r42.f4811f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        if (((r42.f4806a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        r2 = r42.f4809d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        if (r2 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
    
        if (java.lang.Long.compare((r42.f4810e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c8, code lost:
    
        r2 = r42.f4806a;
        r3 = r42.f4809d;
        r5 = r42.f4807b;
        r6 = r42.f4808c;
        i.e0.a(r2, r3);
        r13 = 0;
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d7, code lost:
    
        if (r13 == r3) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d9, code lost:
    
        r26 = r13 >> 3;
        r29 = (r13 & 7) << 3;
        r27 = (r2[r26] >> r29) & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e7, code lost:
    
        if (r27 != 128) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f3, code lost:
    
        if (r27 == 254) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f8, code lost:
    
        r27 = r5[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fa, code lost:
    
        if (r27 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fc, code lost:
    
        r27 = r27.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0103, code lost:
    
        r27 = r27 * r21;
        r30 = r11;
        r11 = (r27 ^ (r27 << 16)) >>> 7;
        r12 = a(r11);
        r11 = r11 & r3;
        r32 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0124, code lost:
    
        if ((((r12 - r11) & r3) / 8) != (((r13 - r11) & r3) / 8)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0126, code lost:
    
        r35 = r9;
        r2[r26] = (r2[r26] & (~(r30 << r29))) | ((r27 & 127) << r29);
        r2[r2.length - 1] = (r2[r15] & 72057594037927935L) | Long.MIN_VALUE;
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0144, code lost:
    
        r11 = r30;
        r14 = r32;
        r9 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014b, code lost:
    
        r35 = r9;
        r8 = r12 >> 3;
        r37 = r2[r8];
        r9 = (r12 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015b, code lost:
    
        if (((r37 >> r9) & r30) != 128) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x015d, code lost:
    
        r28 = r15;
        r2[r8] = ((r27 & 127) << r9) | (r37 & (~(r30 << r9)));
        r2[r26] = (r2[r26] & (~(r30 << r29))) | (128 << r29);
        r5[r12] = r5[r13];
        r5[r13] = null;
        r6[r12] = r6[r13];
        r6[r13] = 0;
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b9, code lost:
    
        r2[r2.length - 1] = (r2[r28] & 72057594037927935L) | Long.MIN_VALUE;
        r13 = r13 + 1;
        r15 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0187, code lost:
    
        r28 = r15;
        r2[r8] = ((r27 & 127) << r9) | (r37 & (~(r30 << r9)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0197, code lost:
    
        if (r7 != (-1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0199, code lost:
    
        r7 = i.e0.b(r2, r13 + 1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x019f, code lost:
    
        r5[r7] = r5[r12];
        r5[r12] = r5[r13];
        r5[r13] = r5[r7];
        r6[r7] = r6[r12];
        r6[r12] = r6[r13];
        r6[r13] = r6[r7];
        r13 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0101, code lost:
    
        r27 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f5, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
    
        r41 = r13;
        r13 = r13 + 1;
        r7 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ca, code lost:
    
        r35 = r9;
        r30 = r11;
        r32 = r14;
        r28 = r15;
        r42.f4811f = i.e0.c(r42.f4809d) - r42.f4810e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x025f, code lost:
    
        r2 = a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0263, code lost:
    
        r42.f4810e++;
        r1 = r42.f4811f;
        r3 = r42.f4806a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x027b, code lost:
    
        if (((r5 >> r7) & r30) != r16) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x027d, code lost:
    
        r28 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x027f, code lost:
    
        r42.f4811f = r1 - r28;
        r1 = r42.f4809d;
        r5 = (r5 & (~(r30 << r7))) | (r35 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r13 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01df, code lost:
    
        r35 = r9;
        r30 = 255;
        r32 = 1;
        r28 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01eb, code lost:
    
        r2 = i.e0.d(r42.f4809d);
        r3 = r42.f4806a;
        r5 = r42.f4807b;
        r6 = r42.f4808c;
        r7 = r42.f4809d;
        d(r2);
        r2 = r42.f4806a;
        r8 = r42.f4807b;
        r9 = r42.f4808c;
        r10 = r42.f4809d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0206, code lost:
    
        if (r11 >= r7) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0215, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r16) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0217, code lost:
    
        r12 = r5[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0219, code lost:
    
        if (r12 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x021b, code lost:
    
        r13 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0222, code lost:
    
        r13 = r13 * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = a(r13 >>> 7);
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r18 = (r14 & 7) << 3;
        r1 = (r15[r13] & (~(255 << r18))) | (r1 << r18);
        r15[r13] = r1;
        r15[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0259, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0220, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0258, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e8, code lost:
    
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x009e, code lost:
    
        r35 = r9;
        r30 = 255;
        r32 = 1;
        r28 = 0;
        r16 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j8, Object obj) {
        int i7;
        int i8;
        Object obj2 = obj;
        int i9 = -862048943;
        int hashCode = obj2.hashCode() * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f4809d;
        int i14 = i11 & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f4806a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            int i18 = 1;
            int i19 = i15;
            int i20 = 0;
            long j9 = (((-i17) >> 63) & (jArr[i16 + 1] << (64 - i17))) | (jArr[i16] >>> i17);
            long j10 = i12;
            long j11 = j9 ^ (j10 * 72340172838076673L);
            long j12 = (j11 - 72340172838076673L) & (~j11) & (-9187201950435737472L);
            while (true) {
                if (j12 == 0) {
                    break;
                }
                i8 = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                int i21 = i9;
                if (r6.k.a(this.f4807b[i8], obj2)) {
                    break loop0;
                }
                j12 &= j12 - 1;
                i9 = i21;
            }
            i15 = i19 + 8;
            i14 = (i14 + i15) & i13;
            obj2 = obj;
            i9 = i7;
        }
        if (i8 < 0) {
            i8 = ~i8;
        }
        this.f4807b[i8] = obj;
        this.f4808c[i8] = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (wVar.f4810e != this.f4810e) {
            return false;
        }
        Object[] objArr = this.f4807b;
        long[] jArr = this.f4808c;
        long[] jArr2 = this.f4806a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j8 = jArr2[i7];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j8) < 128) {
                            int i10 = (i7 << 3) + i9;
                            if (jArr[i10] != wVar.c(objArr[i10])) {
                                return false;
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.f4807b;
        long[] jArr = this.f4808c;
        long[] jArr2 = this.f4806a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            long j8 = jArr2[i7];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j8) < 128) {
                        int i11 = (i7 << 3) + i10;
                        Object obj = objArr[i11];
                        i8 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(jArr[i11]);
                    }
                    j8 >>= 8;
                }
                if (i9 != 8) {
                    return i8;
                }
            }
            if (i7 == length) {
                return i8;
            }
            i7++;
        }
    }

    public final String toString() {
        int i7;
        int i8;
        if (this.f4810e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f4807b;
        long[] jArr = this.f4808c;
        long[] jArr2 = this.f4806a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            while (true) {
                long j8 = jArr2[i9];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((255 & j8) < 128) {
                            int i13 = (i9 << 3) + i12;
                            Object obj = objArr[i13];
                            i8 = i9;
                            long j9 = jArr[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(j9);
                            i10++;
                            if (i10 < this.f4810e) {
                                sb.append(", ");
                            }
                        } else {
                            i8 = i9;
                        }
                        j8 >>= 8;
                        i12++;
                        i9 = i8;
                    }
                    int i14 = i9;
                    if (i11 != 8) {
                        break;
                    }
                    i7 = i14;
                } else {
                    i7 = i9;
                }
                if (i7 == length) {
                    break;
                }
                i9 = i7 + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        r6.k.e(sb2, "s.append('}').toString()");
        return sb2;
    }
}
