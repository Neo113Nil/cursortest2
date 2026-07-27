package i;

import j.AbstractC0705a;
import kotlin.jvm.internal.Intrinsics;
import z2.C1436t;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6946a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f6947b;

    /* renamed from: c, reason: collision with root package name */
    public int f6948c;

    /* renamed from: d, reason: collision with root package name */
    public int f6949d;

    /* renamed from: e, reason: collision with root package name */
    public int f6950e;

    public r(int i2) {
        this.f6946a = AbstractC0664E.f6891a;
        this.f6947b = k.f6923a;
        if (i2 >= 0) {
            e(AbstractC0664E.f(i2));
        } else {
            AbstractC0705a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (((((~r10) << 6) & r10) & (-9187201950435737472L)) == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        r2 = r0.d(r7);
        r8 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        if (r0.f6950e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        r14 = 254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
    
        if (((r0.f6946a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        r2 = r0.f6948c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if (r2 <= 8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        r5 = r0.f6949d;
        r18 = y2.y.f11688e;
        r19 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        if (java.lang.Long.compareUnsigned(r5 * 32, r2 * 25) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
    
        r2 = r0.f6946a;
        r3 = r0.f6948c;
        r4 = r0.f6947b;
        i.AbstractC0664E.a(r2, r3);
        r5 = 0;
        r6 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cb, code lost:
    
        if (r5 == r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cd, code lost:
    
        r18 = r5 >> 3;
        r25 = (r5 & 7) << 3;
        r23 = (r2[r18] >> r25) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00db, code lost:
    
        if (r23 != r8) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00eb, code lost:
    
        if (r23 == r14) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f0, code lost:
    
        r23 = java.lang.Integer.hashCode(r4[r5]) * (-862048943);
        r14 = (r23 ^ (r23 << 16)) >>> 7;
        r15 = r0.d(r14);
        r14 = r14 & r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011c, code lost:
    
        if ((((r15 - r14) & r3) / 8) != (((r5 - r14) & r3) / 8)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011e, code lost:
    
        r33 = r12;
        r2[r18] = ((r23 & 127) << r25) | (r2[r18] & (~(255 << r25)));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "<this>");
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013f, code lost:
    
        r12 = r33;
        r8 = 128;
        r14 = 254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0146, code lost:
    
        r33 = r12;
        r8 = r15 >> 3;
        r12 = r2[r8];
        r9 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0158, code lost:
    
        if (((r12 >> r9) & 255) != 128) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015a, code lost:
    
        r24 = r7;
        r2[r8] = ((~(255 << r9)) & r12) | ((r23 & 127) << r9);
        r2[r18] = (r2[r18] & (~(255 << r25))) | (128 << r25);
        r4[r15] = r4[r5];
        r4[r5] = 0;
        r6 = r5;
        r7 = "<this>";
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a6, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7);
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
        r0 = r38;
        r7 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x017f, code lost:
    
        r24 = r7;
        r7 = "<this>";
        r2[r8] = ((r23 & 127) << r9) | (r12 & (~(255 << r9)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0190, code lost:
    
        if (r6 != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0192, code lost:
    
        r6 = i.AbstractC0664E.b(r2, r5 + 1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0199, code lost:
    
        r4[r6] = r4[r15];
        r4[r15] = r4[r5];
        r4[r5] = r4[r6];
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ed, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dd, code lost:
    
        r6 = r5;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01bd, code lost:
    
        r1 = r0;
        r33 = r12;
        r1.f6950e = i.AbstractC0664E.c(r1.f6948c) - r1.f6949d;
        r2 = r7;
        r21 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0252, code lost:
    
        r0 = r1.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0258, code lost:
    
        r1.f6949d++;
        r2 = r1.f6950e;
        r3 = r1.f6946a;
        r4 = r0 >> 3;
        r5 = r3[r4];
        r7 = (r0 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0271, code lost:
    
        if (((r5 >> r7) & 255) != 128) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0273, code lost:
    
        r8 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0277, code lost:
    
        r1.f6950e = r2 - r8;
        r2 = r1.f6948c;
        r5 = (r5 & (~(255 << r7))) | (r33 << r7);
        r3[r4] = r5;
        r3[(((r0 - 7) & r2) + (r2 & 7)) >> 3] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0276, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d4, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d5, code lost:
    
        r33 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01df, code lost:
    
        r0 = i.AbstractC0664E.d(r1.f6948c);
        r2 = r1.f6946a;
        r3 = r1.f6947b;
        r4 = r1.f6948c;
        r1.e(r0);
        r0 = r1.f6946a;
        r5 = r1.f6947b;
        r6 = r1.f6948c;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f5, code lost:
    
        if (r7 >= r4) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0205, code lost:
    
        if (((r2[r7 >> 3] >> ((r7 & 7) << 3)) & 255) >= 128) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0207, code lost:
    
        r8 = r3[r7];
        r9 = java.lang.Integer.hashCode(r8) * (-862048943);
        r9 = r9 ^ (r9 << 16);
        r14 = r1.d(r9 >>> 7);
        r12 = r9 & 127;
        r9 = r14 >> 3;
        r15 = (r14 & 7) << 3;
        r16 = r2;
        r18 = r3;
        r2 = (r0[r9] & (~(255 << r15))) | (r12 << r15);
        r0[r9] = r2;
        r0[(((r14 - 7) & r6) + (r6 & 7)) >> 3] = r2;
        r5[r14] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0246, code lost:
    
        r7 = r7 + 1;
        r2 = r16;
        r3 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0241, code lost:
    
        r16 = r2;
        r18 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x024e, code lost:
    
        r21 = 1;
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01db, code lost:
    
        r1 = r0;
        r19 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x009d, code lost:
    
        r1 = r0;
        r19 = r4;
        r33 = r12;
        r21 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0257, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i2) {
        r rVar;
        int i4;
        int i5;
        int i6;
        r rVar2 = this;
        int i7 = i2;
        int i8 = 1;
        int i9 = rVar2.f6949d;
        int hashCode = Integer.hashCode(i2) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = rVar2.f6948c;
        int i14 = i11 & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = rVar2.f6946a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            int i18 = i15;
            long j4 = (((-i17) >> 63) & (jArr[i16 + i8] << (64 - i17))) | (jArr[i16] >>> i17);
            long j5 = i12;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j7 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j7) >> 3)) & i13;
                if (rVar2.f6947b[numberOfTrailingZeros] == i7) {
                    rVar = rVar2;
                    i6 = numberOfTrailingZeros;
                    i5 = 1;
                    i4 = i9;
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
            rVar2 = rVar2;
            i9 = i9;
            i8 = 1;
            i7 = i2;
        }
        rVar.f6947b[i6] = i2;
        if (rVar.f6949d != i4) {
            return i5;
        }
        return false;
    }

    public final void b() {
        this.f6949d = 0;
        long[] jArr = this.f6946a;
        if (jArr != AbstractC0664E.f6891a) {
            C1436t.m(jArr);
            long[] jArr2 = this.f6946a;
            int i2 = this.f6948c;
            int i4 = i2 >> 3;
            long j4 = 255 << ((i2 & 7) << 3);
            jArr2[i4] = (jArr2[i4] & (~j4)) | j4;
        }
        this.f6950e = AbstractC0664E.c(this.f6948c) - this.f6949d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i2) {
        int i4;
        int hashCode = Integer.hashCode(i2) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f6948c;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f6946a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j5 = (i6 * 72340172838076673L) ^ j4;
            long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j6 == 0) {
                    break;
                }
                i4 = ((Long.numberOfTrailingZeros(j6) >> 3) + i8) & i7;
                if (this.f6947b[i4] == i2) {
                    break loop0;
                }
                j6 &= j6 - 1;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        return i4 >= 0;
    }

    public final int d(int i2) {
        int i4 = this.f6948c;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f6946a;
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

    public final void e(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, AbstractC0664E.e(i2)) : 0;
        this.f6948c = max;
        if (max == 0) {
            jArr = AbstractC0664E.f6891a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C1436t.m(jArr);
        }
        this.f6946a = jArr;
        int i4 = max >> 3;
        long j4 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j4)) | j4;
        this.f6950e = AbstractC0664E.c(this.f6948c) - this.f6949d;
        this.f6947b = new int[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (rVar.f6949d != this.f6949d) {
            return false;
        }
        int[] iArr = this.f6947b;
        long[] jArr = this.f6946a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j4 = jArr[i2];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j4) < 128 && !rVar.c(iArr[(i2 << 3) + i5])) {
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

    public final void f(int i2) {
        this.f6949d--;
        long[] jArr = this.f6946a;
        int i4 = this.f6948c;
        int i5 = i2 >> 3;
        int i6 = (i2 & 7) << 3;
        long j4 = (jArr[i5] & (~(255 << i6))) | (254 << i6);
        jArr[i5] = j4;
        jArr[(((i2 - 7) & i4) + (i4 & 7)) >> 3] = j4;
    }

    public final int hashCode() {
        int[] iArr = this.f6947b;
        long[] jArr = this.f6946a;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j4 = jArr[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j4) < 128) {
                            i5 = Integer.hashCode(iArr[(i4 << 3) + i7]) + i5;
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
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f6947b;
        long[] jArr = this.f6946a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j4 = jArr[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i4 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j4 & 255) < 128) {
                            int i9 = iArr[(i4 << 3) + i8];
                            if (i5 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i5 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(i9);
                            i5++;
                            i2 = 8;
                        } else {
                            i2 = i6;
                        }
                        j4 >>= i2;
                        i8++;
                        i6 = i2;
                    }
                    if (i7 != i6) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        sb.append((CharSequence) "]");
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public /* synthetic */ r() {
        this(6);
    }
}
