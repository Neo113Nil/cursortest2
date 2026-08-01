package s;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8336a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f8337b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f8338c;

    /* renamed from: d, reason: collision with root package name */
    public int f8339d;

    /* renamed from: e, reason: collision with root package name */
    public int f8340e;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i3) {
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
        return i10 >= 0;
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
    public final Object b(int i3) {
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
        if (i10 >= 0) {
            return this.f8338c[i10];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (kVar.f8340e != this.f8340e) {
            return false;
        }
        int[] iArr = this.f8337b;
        Object[] objArr = this.f8338c;
        long[] jArr = this.f8336a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128) {
                            int i12 = (i3 << 3) + i11;
                            int i13 = iArr[i12];
                            Object obj2 = objArr[i12];
                            if (obj2 == null) {
                                if (kVar.b(i13) != null || !kVar.a(i13)) {
                                    break loop0;
                                }
                            } else if (!obj2.equals(kVar.b(i13))) {
                                return false;
                            }
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
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int[] iArr = this.f8337b;
        Object[] objArr = this.f8338c;
        long[] jArr = this.f8336a;
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
                        int i14 = iArr[i13];
                        Object obj = objArr[i13];
                        i10 += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i14);
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
        if (this.f8340e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        int[] iArr = this.f8337b;
        Object[] objArr = this.f8338c;
        long[] jArr = this.f8336a;
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
                            int i14 = iArr[i13];
                            Object obj = objArr[i13];
                            sb2.append(i14);
                            sb2.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i10++;
                            if (i10 < this.f8340e) {
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
