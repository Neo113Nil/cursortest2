package o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f5427a = r0.f5528a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f5428b = p.a.f5709c;

    /* renamed from: c, reason: collision with root package name */
    public float[] f5429c = i.f5478a;

    /* renamed from: d, reason: collision with root package name */
    public int f5430d;

    /* renamed from: e, reason: collision with root package name */
    public int f5431e;

    /* renamed from: f, reason: collision with root package name */
    public int f5432f;

    public c0(int i) {
        if (i >= 0) {
            c(r0.d(i));
        } else {
            p.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i) {
        int i8 = this.f5430d;
        int i9 = i & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f5427a;
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

    public final int b(Object obj) {
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f5430d;
        int i11 = i8 >>> 7;
        while (true) {
            int i12 = i11 & i10;
            long[] jArr = this.f5427a;
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            long j7 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j8 = (i9 * 72340172838076673L) ^ j7;
            for (long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i12) & i10;
                if (q6.i.a(this.f5428b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i11 = i12 + i;
        }
    }

    public final void c(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, r0.c(i)) : 0;
        this.f5430d = max;
        if (max == 0) {
            jArr = r0.f5528a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            d6.l.M(jArr, -9187201950435737472L);
        }
        this.f5427a = jArr;
        int i8 = max >> 3;
        long j7 = 255 << ((max & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j7)) | j7;
        this.f5432f = r0.a(this.f5430d) - this.f5431e;
        this.f5428b = new Object[max];
        this.f5429c = new float[max];
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
    
        if (r37.f5432f != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        if (((r37.f5427a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        r2 = r37.f5430d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        if (r2 <= 8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b1, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cb, code lost:
    
        if (java.lang.Long.compare((r37.f5431e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cd, code lost:
    
        r2 = r37.f5427a;
        r3 = r37.f5430d;
        r4 = r37.f5428b;
        r6 = r37.f5429c;
        r7 = (r3 + 7) >> 3;
        r25 = 255;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dc, code lost:
    
        if (r8 >= r7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00de, code lost:
    
        r10 = r2[r8] & r13;
        r2[r8] = (-72340172838076674L) & ((~r10) + (r10 >>> 7));
        r8 = r8 + 1;
        r11 = r11;
        r13 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
    
        r29 = r11;
        r9 = 7;
        r7 = d6.l.O(r2);
        r8 = r7 - 1;
        r12 = 72057594037927935L;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0116, code lost:
    
        if (r7 == r3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0118, code lost:
    
        r8 = r7 >> 3;
        r14 = (r7 & 7) << 3;
        r10 = (r2[r8] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0125, code lost:
    
        if (r10 != 128) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012c, code lost:
    
        if (r10 == 254) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012f, code lost:
    
        r10 = r4[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0131, code lost:
    
        if (r10 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0133, code lost:
    
        r10 = r10.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0139, code lost:
    
        r10 = r10 * r20;
        r11 = (r10 ^ (r10 << 16)) >>> 7;
        r27 = a(r11);
        r11 = r11 & r3;
        r31 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0152, code lost:
    
        if ((((r27 - r11) & r3) / 8) != (((r7 - r11) & r3) / 8)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0176, code lost:
    
        r32 = r12;
        r9 = r27 >> 3;
        r11 = r2[r9];
        r13 = (r27 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0186, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0188, code lost:
    
        r28 = r3;
        r34 = r4;
        r2[r9] = ((~(255 << r13)) & r11) | ((r10 & 127) << r13);
        r2[r8] = (r2[r8] & (~(255 << r14))) | (128 << r14);
        r34[r27] = r34[r7];
        r34[r7] = null;
        r6[r27] = r6[r7];
        r6[r7] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01d8, code lost:
    
        r2[r2.length - 1] = (r2[0] & r32) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r3 = r28;
        r9 = r31;
        r12 = r32;
        r4 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b4, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0154, code lost:
    
        r32 = r12;
        r2[r8] = ((r10 & 127) << r14) | (r2[r8] & (~(255 << r14)));
        r2[r2.length - 1] = (r2[0] & r32) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r9 = r31;
        r12 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0138, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0127, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ef, code lost:
    
        r37.f5432f = o.r0.a(r37.f5430d) - r37.f5431e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x027d, code lost:
    
        r2 = a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0281, code lost:
    
        r37.f5431e++;
        r1 = r37.f5432f;
        r3 = r37.f5427a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0299, code lost:
    
        if (((r5 >> r7) & r25) != r18) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x029b, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x029d, code lost:
    
        r37.f5432f = r1 - r15;
        r1 = r37.f5430d;
        r5 = (r5 & (~(r25 << r7))) | (r29 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01fe, code lost:
    
        r25 = 255;
        r29 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0208, code lost:
    
        r2 = o.r0.b(r37.f5430d);
        r3 = r37.f5427a;
        r4 = r37.f5428b;
        r6 = r37.f5429c;
        r7 = r37.f5430d;
        c(r2);
        r2 = r37.f5427a;
        r8 = r37.f5428b;
        r9 = r37.f5429c;
        r10 = r37.f5430d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0222, code lost:
    
        if (r11 >= r7) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0231, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r18) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0233, code lost:
    
        r12 = r4[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0235, code lost:
    
        if (r12 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0237, code lost:
    
        r13 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x023d, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0276, code lost:
    
        r11 = r11 + 1;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x023c, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0274, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0205, code lost:
    
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
    public final void d(String str, float f6) {
        int i;
        int i8;
        String str2 = str;
        int i9 = -862048943;
        int hashCode = (str2 != null ? str2.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f5430d;
        int i14 = i11 & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f5427a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j7 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j8 = i12;
            int i18 = i12;
            int i19 = 0;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = -9187201950435737472L;
            long j11 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j11) >> 3)) & i13;
                int i20 = i9;
                if (q6.i.a(this.f5428b[numberOfTrailingZeros], str2)) {
                    i8 = numberOfTrailingZeros;
                    break loop0;
                } else {
                    j11 &= j11 - 1;
                    i9 = i20;
                }
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            str2 = str;
            i12 = i18;
            i9 = i;
        }
        if (i8 < 0) {
            i8 = ~i8;
        }
        this.f5428b[i8] = str;
        this.f5429c[i8] = f6;
    }

    public final boolean equals(Object obj) {
        boolean z3;
        boolean z7;
        boolean z8 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (c0Var.f5431e != this.f5431e) {
            return false;
        }
        Object[] objArr = this.f5428b;
        float[] fArr = this.f5429c;
        long[] jArr = this.f5427a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                int i9 = 0;
                while (i9 < i8) {
                    if ((255 & j7) < 128) {
                        int i10 = (i << 3) + i9;
                        Object obj2 = objArr[i10];
                        float f6 = fArr[i10];
                        int b8 = c0Var.b(obj2);
                        if (b8 < 0) {
                            break loop0;
                        }
                        z7 = z8;
                        if (f6 != c0Var.f5429c[b8]) {
                            break loop0;
                        }
                    } else {
                        z7 = z8;
                    }
                    j7 >>= 8;
                    i9++;
                    z8 = z7;
                }
                z3 = z8;
                if (i8 != 8) {
                    return z3;
                }
            } else {
                z3 = z8;
            }
            if (i == length) {
                return z3;
            }
            i++;
            z8 = z3;
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.f5428b;
        float[] fArr = this.f5429c;
        long[] jArr = this.f5427a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i8 = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j7) < 128) {
                        int i11 = (i << 3) + i10;
                        Object obj = objArr[i11];
                        i8 += Float.hashCode(fArr[i11]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j7 >>= 8;
                }
                if (i9 != 8) {
                    return i8;
                }
            }
            if (i == length) {
                return i8;
            }
            i++;
        }
    }

    public final String toString() {
        if (this.f5431e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f5428b;
        float[] fArr = this.f5429c;
        long[] jArr = this.f5427a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i8 = 0;
            while (true) {
                long j7 = jArr[i];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j7) < 128) {
                            int i11 = (i << 3) + i10;
                            Object obj = objArr[i11];
                            float f6 = fArr[i11];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f6);
                            i8++;
                            if (i8 < this.f5431e) {
                                sb.append(", ");
                            }
                        }
                        j7 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }
}
