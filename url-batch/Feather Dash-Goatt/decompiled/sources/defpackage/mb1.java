package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class mb1 implements Iterable, yb0 {
    public static final mb1 i = new mb1(0, 0, 0, null);
    public final long d;
    public final long e;
    public final long g;
    public final long[] h;

    public mb1(long j, long j2, long j3, long[] jArr) {
        this.d = j;
        this.e = j2;
        this.g = j3;
        this.h = jArr;
    }

    public final mb1 a(mb1 mb1Var) {
        long[] jArr;
        mb1 mb1Var2 = this;
        mb1 mb1Var3 = i;
        if (mb1Var == mb1Var3) {
            return mb1Var2;
        }
        if (mb1Var2 == mb1Var3) {
            return mb1Var3;
        }
        long j = mb1Var.g;
        long j2 = mb1Var.g;
        long[] jArr2 = mb1Var.h;
        long j3 = mb1Var.e;
        long j4 = mb1Var.d;
        long j5 = mb1Var2.g;
        if (j == j5 && jArr2 == (jArr = mb1Var2.h)) {
            return new mb1(mb1Var2.d & (~j4), mb1Var2.e & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                mb1Var2 = mb1Var2.b(j6);
            }
        }
        if (j3 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j3) != 0) {
                    mb1Var2 = mb1Var2.b(i2 + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j4) != 0) {
                    mb1Var2 = mb1Var2.b(i3 + j2 + 64);
                }
            }
        }
        return mb1Var2;
    }

    public final mb1 b(long j) {
        long[] jArr;
        int j2;
        long[] jArr2;
        long j3 = j - this.g;
        if (Intrinsics.c(j3, 0L) >= 0 && Intrinsics.c(j3, 64L) < 0) {
            long j4 = 1 << ((int) j3);
            long j5 = this.e;
            if ((j5 & j4) != 0) {
                return new mb1(this.d, j5 & (~j4), this.g, this.h);
            }
        } else if (Intrinsics.c(j3, 64L) >= 0 && Intrinsics.c(j3, 128L) < 0) {
            long j6 = 1 << (((int) j3) - 64);
            long j7 = this.d;
            if ((j7 & j6) != 0) {
                return new mb1(j7 & (~j6), this.e, this.g, this.h);
            }
        } else if (Intrinsics.c(j3, 0L) < 0 && (jArr = this.h) != null && (j2 = xa0.j(jArr, j)) >= 0) {
            int length = jArr.length;
            int i2 = length - 1;
            if (i2 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i2];
                if (j2 > 0) {
                    w9.b(jArr, jArr3, 0, 0, j2);
                }
                if (j2 < i2) {
                    w9.b(jArr, jArr3, j2, j2 + 1, length);
                }
                jArr2 = jArr3;
            }
            return new mb1(this.d, this.e, this.g, jArr2);
        }
        return this;
    }

    public final boolean d(long j) {
        long[] jArr;
        long j2 = j - this.g;
        return (Intrinsics.c(j2, 0L) < 0 || Intrinsics.c(j2, 64L) >= 0) ? (Intrinsics.c(j2, 64L) < 0 || Intrinsics.c(j2, 128L) >= 0) ? Intrinsics.c(j2, 0L) <= 0 && (jArr = this.h) != null && xa0.j(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.d) != 0 : ((1 << ((int) j2)) & this.e) != 0;
    }

    public final mb1 e(mb1 mb1Var) {
        mb1 mb1Var2;
        long[] jArr;
        mb1 mb1Var3 = this;
        mb1 mb1Var4 = i;
        if (mb1Var == mb1Var4) {
            return mb1Var3;
        }
        if (mb1Var3 == mb1Var4) {
            return mb1Var;
        }
        long j = mb1Var.g;
        long j2 = mb1Var.g;
        long[] jArr2 = mb1Var.h;
        long j3 = mb1Var.e;
        long j4 = mb1Var.d;
        long j5 = mb1Var3.g;
        long j6 = mb1Var3.e;
        long j7 = mb1Var3.d;
        if (j == j5 && jArr2 == (jArr = mb1Var3.h)) {
            return new mb1(j7 | j4, j6 | j3, j5, jArr);
        }
        int i2 = 0;
        long[] jArr3 = mb1Var3.h;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    mb1Var3 = mb1Var3.f(j8);
                }
            }
            if (j3 != 0) {
                for (int i3 = 0; i3 < 64; i3++) {
                    if (((1 << i3) & j3) != 0) {
                        mb1Var3 = mb1Var3.f(i3 + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i2 < 64) {
                    if (((1 << i2) & j4) != 0) {
                        mb1Var3 = mb1Var3.f(i2 + j2 + 64);
                    }
                    i2++;
                }
            }
            return mb1Var3;
        }
        if (jArr3 != null) {
            mb1Var2 = mb1Var;
            for (long j9 : jArr3) {
                mb1Var2 = mb1Var2.f(j9);
            }
        } else {
            mb1Var2 = mb1Var;
        }
        long j10 = mb1Var3.g;
        if (j6 != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if (((1 << i4) & j6) != 0) {
                    mb1Var2 = mb1Var2.f(i4 + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i2 < 64) {
                if (((1 << i2) & j7) != 0) {
                    mb1Var2 = mb1Var2.f(i2 + j10 + 64);
                }
                i2++;
            }
        }
        return mb1Var2;
    }

    public final mb1 f(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i2;
        long j4;
        long j5 = this.g;
        long j6 = j - j5;
        long j7 = 0;
        int c = Intrinsics.c(j6, 0L);
        long j8 = this.e;
        if (c < 0 || Intrinsics.c(j6, 64L) >= 0) {
            int c2 = Intrinsics.c(j6, 64L);
            long j9 = this.d;
            int i3 = 64;
            if (c2 < 0 || Intrinsics.c(j6, 128L) >= 0) {
                int c3 = Intrinsics.c(j6, 128L);
                long[] jArr3 = this.h;
                if (c3 < 0) {
                    if (jArr3 == null) {
                        return new mb1(this.d, this.e, this.g, new long[]{j});
                    }
                    int j10 = xa0.j(jArr3, j);
                    if (j10 < 0) {
                        int i4 = -(j10 + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        w9.b(jArr3, jArr4, 0, 0, i4);
                        w9.b(jArr3, jArr4, i4 + 1, i4, length);
                        jArr4[i4] = j;
                        return new mb1(this.d, this.e, this.g, jArr4);
                    }
                } else if (!d(j)) {
                    long j11 = ((j + 1) / 64) * 64;
                    if (Intrinsics.c(j11, 0L) < 0) {
                        j11 = 9223372036854775680L;
                    }
                    long j12 = j9;
                    nq0 nq0Var = null;
                    while (true) {
                        if (Intrinsics.c(j5, j11) >= 0) {
                            j2 = j5;
                            j3 = j8;
                            break;
                        }
                        if (j8 != j7) {
                            if (nq0Var == null) {
                                nq0Var = new nq0(jArr3);
                            }
                            int i5 = 0;
                            i2 = i3;
                            while (i5 < i2) {
                                if ((j8 & (1 << i5)) != j7) {
                                    j4 = j7;
                                    ((hn0) nq0Var.e).a(i5 + j5);
                                } else {
                                    j4 = j7;
                                }
                                i5++;
                                j7 = j4;
                            }
                        } else {
                            i2 = i3;
                        }
                        long j13 = j7;
                        if (j12 == j13) {
                            j2 = j11;
                            j3 = j13;
                            break;
                        }
                        j5 += 64;
                        j7 = j13;
                        j8 = j12;
                        i3 = i2;
                        j12 = j7;
                    }
                    if (nq0Var != null) {
                        hn0 hn0Var = (hn0) nq0Var.e;
                        int i6 = hn0Var.b;
                        if (i6 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i6];
                            long[] jArr6 = hn0Var.a;
                            for (int i7 = 0; i7 < i6; i7++) {
                                jArr5[i7] = jArr6[i7];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 != null) {
                            jArr = jArr2;
                            return new mb1(j12, j3, j2, jArr).f(j);
                        }
                    }
                    jArr = jArr3;
                    return new mb1(j12, j3, j2, jArr).f(j);
                }
            } else {
                long j14 = 1 << (((int) j6) - 64);
                if ((j9 & j14) == 0) {
                    return new mb1(j9 | j14, this.e, this.g, this.h);
                }
            }
        } else {
            long j15 = 1 << ((int) j6);
            if ((j8 & j15) == 0) {
                return new mb1(this.d, j8 | j15, this.g, this.h);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return h91.a(new lb1(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(ai.h(this));
        Iterator it = iterator();
        while (true) {
            f91 f91Var = (f91) it;
            if (!f91Var.hasNext()) {
                break;
            }
            arrayList.add(String.valueOf(((Number) f91Var.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = arrayList.get(i3);
            i2++;
            if (i2 > 1) {
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
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
