package i;

import j.AbstractC0705a;
import kotlin.jvm.internal.Intrinsics;
import z2.C1436t;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6957a = AbstractC0664E.f6891a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f6958b = l.f6924a;

    /* renamed from: c, reason: collision with root package name */
    public int f6959c;

    /* renamed from: d, reason: collision with root package name */
    public int f6960d;

    /* renamed from: e, reason: collision with root package name */
    public int f6961e;

    public t(int i2) {
        if (i2 >= 0) {
            c(AbstractC0664E.f(i2));
        } else {
            AbstractC0705a.c("Capacity must be a positive value.");
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
    public final boolean a(long j4) {
        int i2;
        int hashCode = Long.hashCode(j4) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this.f6959c;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.f6957a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j5 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j6 = (i5 * 72340172838076673L) ^ j5;
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j7 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j7) >> 3) + i7) & i6;
                if (this.f6958b[i2] == j4) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        return i2 >= 0;
    }

    public final int b(int i2) {
        int i4 = this.f6959c;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f6957a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j4 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j5 = j4 & ((~j4) << 7) & (-9187201950435737472L);
            if (j5 != 0) {
                return (i5 + (Long.numberOfTrailingZeros(j5) >> 3)) & i4;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final void c(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, AbstractC0664E.e(i2)) : 0;
        this.f6959c = max;
        if (max == 0) {
            jArr = AbstractC0664E.f6891a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C1436t.m(jArr);
        }
        this.f6957a = jArr;
        int i4 = max >> 3;
        long j4 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j4)) | j4;
        this.f6961e = AbstractC0664E.c(this.f6959c) - this.f6960d;
        this.f6958b = new long[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (tVar.f6960d != this.f6960d) {
            return false;
        }
        long[] jArr = this.f6958b;
        long[] jArr2 = this.f6957a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j4 = jArr2[i2];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j4) < 128 && !tVar.a(jArr[(i2 << 3) + i5])) {
                            return false;
                        }
                        j4 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return true;
    }

    public final int hashCode() {
        long[] jArr = this.f6958b;
        long[] jArr2 = this.f6957a;
        int length = jArr2.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j4) < 128) {
                            i5 = Long.hashCode(jArr[(i4 << 3) + i7]) + i5;
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        return i5;
                    }
                }
                if (i4 == length) {
                    i2 = i5;
                    break;
                }
                i4++;
            }
        }
        return i2;
    }

    public final String toString() {
        int i2;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f6958b;
        long[] jArr2 = this.f6957a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i7 = 0;
            loop0: while (true) {
                long j4 = jArr2[i6];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8;
                    int i9 = 8 - ((~(i6 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j4 & 255) < 128) {
                            i4 = i6;
                            long j5 = jArr[(i6 << 3) + i10];
                            if (i7 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i7 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(j5);
                            i7++;
                            i5 = 8;
                        } else {
                            i4 = i6;
                            i5 = i8;
                        }
                        j4 >>= i5;
                        i10++;
                        i8 = i5;
                        i6 = i4;
                    }
                    int i11 = i6;
                    if (i9 != i8) {
                        break;
                    }
                    i2 = i11;
                } else {
                    i2 = i6;
                }
                if (i2 == length) {
                    break;
                }
                i6 = i2 + 1;
            }
        }
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
