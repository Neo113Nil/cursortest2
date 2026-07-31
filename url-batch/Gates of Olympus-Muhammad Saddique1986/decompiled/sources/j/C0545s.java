package j;

import k.AbstractC0561a;

/* renamed from: j.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545s {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6319a = AbstractC0522D.f6254a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f6320b = AbstractC0537k.f6286a;

    /* renamed from: c, reason: collision with root package name */
    public int f6321c;

    /* renamed from: d, reason: collision with root package name */
    public int f6322d;

    /* renamed from: e, reason: collision with root package name */
    public int f6323e;

    public C0545s(int i3) {
        if (i3 >= 0) {
            c(AbstractC0522D.f(i3));
        } else {
            AbstractC0561a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(long j3) {
        int i3;
        int hashCode = Long.hashCode(j3) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this.f6321c;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.f6319a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j5 = (i5 * 72340172838076673L) ^ j4;
            long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j6 == 0) {
                    break;
                }
                i3 = ((Long.numberOfTrailingZeros(j6) >> 3) + i7) & i6;
                if (this.f6320b[i3] == j3) {
                    break loop0;
                }
                j6 &= j6 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        return i3 >= 0;
    }

    public final int b(int i3) {
        int i4 = this.f6321c;
        int i5 = i3 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f6319a;
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

    public final void c(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, AbstractC0522D.e(i3)) : 0;
        this.f6321c = max;
        if (max == 0) {
            jArr = AbstractC0522D.f6254a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            S1.k.s0(jArr);
        }
        this.f6319a = jArr;
        int i4 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j3)) | j3;
        this.f6323e = AbstractC0522D.c(this.f6321c) - this.f6322d;
        this.f6320b = new long[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0545s)) {
            return false;
        }
        C0545s c0545s = (C0545s) obj;
        if (c0545s.f6322d != this.f6322d) {
            return false;
        }
        long[] jArr = this.f6320b;
        long[] jArr2 = this.f6319a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr2[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128 && !c0545s.a(jArr[(i3 << 3) + i5])) {
                            return false;
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
        long[] jArr = this.f6320b;
        long[] jArr2 = this.f6319a;
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
                            i5 = Long.hashCode(jArr[(i4 << 3) + i7]) + i5;
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
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f6320b;
        long[] jArr2 = this.f6319a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j3 = jArr2[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j3) < 128) {
                            long j4 = jArr[(i3 << 3) + i6];
                            if (i4 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(j4);
                            i4++;
                        }
                        j3 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        f2.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
