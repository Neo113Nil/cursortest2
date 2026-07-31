package o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f5418a = r0.f5528a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f5419b = p.f5517a;

    /* renamed from: c, reason: collision with root package name */
    public int f5420c;

    /* renamed from: d, reason: collision with root package name */
    public int f5421d;

    /* renamed from: e, reason: collision with root package name */
    public int f5422e;

    public b0(int i) {
        if (i >= 0) {
            c(r0.d(i));
        } else {
            p.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(long j7) {
        int i;
        int hashCode = Long.hashCode(j7) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f5420c;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f5418a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j8 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j9 = (i9 * 72340172838076673L) ^ j8;
            long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j10) >> 3) + i11) & i10;
                if (this.f5419b[i] == j7) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
        return i >= 0;
    }

    public final int b(int i) {
        int i8 = this.f5420c;
        int i9 = i & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f5418a;
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

    public final void c(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, r0.c(i)) : 0;
        this.f5420c = max;
        if (max == 0) {
            jArr = r0.f5528a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            d6.l.M(jArr, -9187201950435737472L);
        }
        this.f5418a = jArr;
        int i8 = max >> 3;
        long j7 = 255 << ((max & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j7)) | j7;
        this.f5422e = r0.a(this.f5420c) - this.f5421d;
        this.f5419b = new long[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (b0Var.f5421d != this.f5421d) {
            return false;
        }
        long[] jArr = this.f5419b;
        long[] jArr2 = this.f5418a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j7 = jArr2[i];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j7) < 128 && !b0Var.a(jArr[(i << 3) + i9])) {
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

    public final int hashCode() {
        long[] jArr = this.f5419b;
        long[] jArr2 = this.f5418a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i8 = 0;
        while (true) {
            long j7 = jArr2[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j7) < 128) {
                        i8 = Long.hashCode(jArr[(i << 3) + i10]) + i8;
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
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f5419b;
        long[] jArr2 = this.f5418a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i8 = 0;
            loop0: while (true) {
                long j7 = jArr2[i];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j7) < 128) {
                            long j8 = jArr[(i << 3) + i10];
                            if (i8 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i8 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(j8);
                            i8++;
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
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }
}
