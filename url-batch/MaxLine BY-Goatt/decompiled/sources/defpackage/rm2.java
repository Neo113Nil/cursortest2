package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rm2 implements Iterable, k71 {
    public static final rm2 q = new rm2(0, 0, 0, null);
    public final long m;
    public final long n;
    public final long o;
    public final long[] p;

    public rm2(long j, long j2, long j3, long[] jArr) {
        this.m = j;
        this.n = j2;
        this.o = j3;
        this.p = jArr;
    }

    public final rm2 a(rm2 rm2Var) {
        long[] jArr;
        rm2 rm2Var2 = this;
        rm2 rm2Var3 = q;
        if (rm2Var == rm2Var3) {
            return rm2Var2;
        }
        if (rm2Var2 == rm2Var3) {
            return rm2Var3;
        }
        long j = rm2Var.o;
        long j2 = rm2Var.o;
        long[] jArr2 = rm2Var.p;
        long j3 = rm2Var.n;
        long j4 = rm2Var.m;
        long j5 = rm2Var2.o;
        if (j == j5 && jArr2 == (jArr = rm2Var2.p)) {
            return new rm2(rm2Var2.m & (~j4), rm2Var2.n & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                rm2Var2 = rm2Var2.b(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    rm2Var2 = rm2Var2.b(i + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    rm2Var2 = rm2Var2.b(i2 + j2 + 64);
                }
            }
        }
        return rm2Var2;
    }

    public final rm2 b(long j) {
        long[] jArr;
        int b;
        long[] jArr2;
        long j2 = j - this.o;
        if (Intrinsics.d(j2, 0L) >= 0 && Intrinsics.d(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.n;
            if ((j4 & j3) != 0) {
                return new rm2(this.m, j4 & (~j3), this.o, this.p);
            }
        } else if (Intrinsics.d(j2, 64L) >= 0 && Intrinsics.d(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.m;
            if ((j6 & j5) != 0) {
                return new rm2(j6 & (~j5), this.n, this.o, this.p);
            }
        } else if (Intrinsics.d(j2, 0L) < 0 && (jArr = this.p) != null && (b = ti2.b(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (b > 0) {
                    ni.g(jArr, jArr3, 0, 0, b);
                }
                if (b < i) {
                    ni.g(jArr, jArr3, b, b + 1, length);
                }
                jArr2 = jArr3;
            }
            return new rm2(this.m, this.n, this.o, jArr2);
        }
        return this;
    }

    public final boolean c(long j) {
        long[] jArr;
        long j2 = j - this.o;
        return (Intrinsics.d(j2, 0L) < 0 || Intrinsics.d(j2, 64L) >= 0) ? (Intrinsics.d(j2, 64L) < 0 || Intrinsics.d(j2, 128L) >= 0) ? Intrinsics.d(j2, 0L) <= 0 && (jArr = this.p) != null && ti2.b(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.m) != 0 : ((1 << ((int) j2)) & this.n) != 0;
    }

    public final rm2 d(rm2 rm2Var) {
        rm2 rm2Var2;
        long[] jArr;
        rm2 rm2Var3 = this;
        rm2 rm2Var4 = q;
        if (rm2Var == rm2Var4) {
            return rm2Var3;
        }
        if (rm2Var3 == rm2Var4) {
            return rm2Var;
        }
        long j = rm2Var.o;
        long j2 = rm2Var.o;
        long[] jArr2 = rm2Var.p;
        long j3 = rm2Var.n;
        long j4 = rm2Var.m;
        long j5 = rm2Var3.o;
        long j6 = rm2Var3.n;
        long j7 = rm2Var3.m;
        if (j == j5 && jArr2 == (jArr = rm2Var3.p)) {
            return new rm2(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = rm2Var3.p;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    rm2Var3 = rm2Var3.e(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        rm2Var3 = rm2Var3.e(i2 + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        rm2Var3 = rm2Var3.e(i + j2 + 64);
                    }
                    i++;
                }
            }
            return rm2Var3;
        }
        if (jArr3 != null) {
            rm2Var2 = rm2Var;
            for (long j9 : jArr3) {
                rm2Var2 = rm2Var2.e(j9);
            }
        } else {
            rm2Var2 = rm2Var;
        }
        long j10 = rm2Var3.o;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    rm2Var2 = rm2Var2.e(i3 + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    rm2Var2 = rm2Var2.e(i + j10 + 64);
                }
                i++;
            }
        }
        return rm2Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0132, code lost:
    
        if (r5 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0134, code lost:
    
        r0 = (defpackage.dn1) r5.m;
        r3 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013a, code lost:
    
        if (r3 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013c, code lost:
    
        r0 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014e, code lost:
    
        if (r0 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0151, code lost:
    
        r28 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015f, code lost:
    
        return new defpackage.rm2(r22, r24, r26, r28).e(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013f, code lost:
    
        r4 = new long[r3];
        r0 = r0.a;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0144, code lost:
    
        if (r6 >= r3) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0146, code lost:
    
        r4[r6] = r0[r6];
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014d, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0154, code lost:
    
        r28 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rm2 e(long j) {
        long[] jArr;
        long j2;
        long j3;
        int i;
        dn1 dn1Var;
        long j4 = this.o;
        long j5 = j - j4;
        long j6 = 0;
        int d = Intrinsics.d(j5, 0L);
        long j7 = this.n;
        if (d < 0 || Intrinsics.d(j5, 64L) >= 0) {
            int d2 = Intrinsics.d(j5, 64L);
            long j8 = this.m;
            int i2 = 64;
            if (d2 < 0 || Intrinsics.d(j5, 128L) >= 0) {
                int d3 = Intrinsics.d(j5, 128L);
                long[] jArr2 = this.p;
                if (d3 < 0) {
                    if (jArr2 == null) {
                        return new rm2(this.m, this.n, this.o, new long[]{j});
                    }
                    int b = ti2.b(jArr2, j);
                    if (b < 0) {
                        int i3 = -(b + 1);
                        int length = jArr2.length;
                        long[] jArr3 = new long[length + 1];
                        ni.g(jArr2, jArr3, 0, 0, i3);
                        ni.g(jArr2, jArr3, i3 + 1, i3, length);
                        jArr3[i3] = j;
                        return new rm2(this.m, this.n, this.o, jArr3);
                    }
                } else if (!c(j)) {
                    long j9 = ((j + 1) / 64) * 64;
                    if (Intrinsics.d(j9, 0L) < 0) {
                        j9 = 9223372036854775680L;
                    }
                    long j10 = j8;
                    at0 at0Var = null;
                    while (true) {
                        if (Intrinsics.d(j4, j9) >= 0) {
                            jArr = null;
                            j2 = j4;
                            j3 = j7;
                            break;
                        }
                        if (j7 != j6) {
                            if (at0Var == null) {
                                at0Var = new at0();
                                if (jArr2 != null) {
                                    long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
                                    jArr = null;
                                    dn1Var = new dn1(copyOf.length);
                                    int i4 = dn1Var.b;
                                    if (i4 < 0) {
                                        a.c(BuildConfig.FLAVOR);
                                        throw null;
                                    }
                                    j3 = j6;
                                    if (copyOf.length != 0) {
                                        int length2 = copyOf.length + i4;
                                        long[] jArr4 = dn1Var.a;
                                        if (jArr4.length < length2) {
                                            dn1Var.a = Arrays.copyOf(jArr4, Math.max(length2, (jArr4.length * 3) / 2));
                                        }
                                        long[] jArr5 = dn1Var.a;
                                        int i5 = dn1Var.b;
                                        if (i4 != i5) {
                                            ni.g(jArr5, jArr5, copyOf.length + i4, i4, i5);
                                        }
                                        ni.g(copyOf, jArr5, i4, 0, copyOf.length);
                                        dn1Var.b += copyOf.length;
                                    }
                                } else {
                                    j3 = j6;
                                    jArr = null;
                                    dn1Var = new dn1(16);
                                }
                                at0Var.m = dn1Var;
                            } else {
                                j3 = j6;
                                jArr = null;
                            }
                            i = i2;
                            for (int i6 = 0; i6 < i; i6++) {
                                if (((1 << i6) & j7) != j3) {
                                    ((dn1) at0Var.m).a(i6 + j4);
                                }
                            }
                        } else {
                            j3 = j6;
                            i = i2;
                            jArr = null;
                        }
                        if (j10 == j3) {
                            j2 = j9;
                            break;
                        }
                        j4 += 64;
                        i2 = i;
                        j7 = j10;
                        j6 = j3;
                        j10 = j6;
                    }
                }
            } else {
                long j11 = 1 << (((int) j5) - 64);
                if ((j8 & j11) == 0) {
                    return new rm2(j8 | j11, this.n, this.o, this.p);
                }
            }
        } else {
            long j12 = 1 << ((int) j5);
            if ((j7 & j12) == 0) {
                return new rm2(this.m, j7 | j12, this.o, this.p);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return yi2.a(new qm2(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(rv.l(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) BuildConfig.FLAVOR);
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) BuildConfig.FLAVOR);
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
