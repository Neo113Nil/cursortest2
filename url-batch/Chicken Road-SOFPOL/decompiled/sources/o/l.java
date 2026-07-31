package o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public long[] f5494a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5495b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f5496c;

    /* renamed from: d, reason: collision with root package name */
    public int f5497d;

    /* renamed from: e, reason: collision with root package name */
    public int f5498e;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i) {
        int i8;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i9 = hashCode ^ (hashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f5497d;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f5494a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j7 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j8 = (i10 * 72340172838076673L) ^ j7;
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j9 == 0) {
                    break;
                }
                i8 = ((Long.numberOfTrailingZeros(j9) >> 3) + i12) & i11;
                if (this.f5495b[i8] == i) {
                    break loop0;
                }
                j9 &= j9 - 1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        return i8 >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i) {
        int i8;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i9 = hashCode ^ (hashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f5497d;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f5494a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j7 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j8 = (i10 * 72340172838076673L) ^ j7;
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j9 == 0) {
                    break;
                }
                i8 = ((Long.numberOfTrailingZeros(j9) >> 3) + i12) & i11;
                if (this.f5495b[i8] == i) {
                    break loop0;
                }
                j9 &= j9 - 1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        if (i8 >= 0) {
            return this.f5496c[i8];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (lVar.f5498e != this.f5498e) {
            return false;
        }
        int[] iArr = this.f5495b;
        Object[] objArr = this.f5496c;
        long[] jArr = this.f5494a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j7 = jArr[i];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j7) < 128) {
                            int i10 = (i << 3) + i9;
                            int i11 = iArr[i10];
                            Object obj2 = objArr[i10];
                            if (obj2 == null) {
                                if (lVar.b(i11) != null || !lVar.a(i11)) {
                                    break loop0;
                                }
                            } else if (!obj2.equals(lVar.b(i11))) {
                                return false;
                            }
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
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int[] iArr = this.f5495b;
        Object[] objArr = this.f5496c;
        long[] jArr = this.f5494a;
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
                        int i12 = iArr[i11];
                        Object obj = objArr[i11];
                        i8 += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i12);
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
        if (this.f5498e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f5495b;
        Object[] objArr = this.f5496c;
        long[] jArr = this.f5494a;
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
                            int i12 = iArr[i11];
                            Object obj = objArr[i11];
                            sb.append(i12);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i8++;
                            if (i8 < this.f5498e) {
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
