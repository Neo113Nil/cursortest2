package Q;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;
import z2.C1436t;
import z2.C1442z;

/* loaded from: classes.dex */
public final class o implements Iterable, N2.a {

    /* renamed from: k, reason: collision with root package name */
    public static final o f3869k = new o(0, 0, 0, null);

    /* renamed from: d, reason: collision with root package name */
    public final long f3870d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3871e;

    /* renamed from: i, reason: collision with root package name */
    public final int f3872i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f3873j;

    public o(long j4, long j5, int i2, int[] iArr) {
        this.f3870d = j4;
        this.f3871e = j5;
        this.f3872i = i2;
        this.f3873j = iArr;
    }

    public final o B(int i2) {
        long j4;
        int i4;
        int i5 = this.f3872i;
        int i6 = i2 - i5;
        long j5 = this.f3871e;
        if (i6 < 0 || i6 >= 64) {
            long j6 = this.f3870d;
            if (i6 < 64 || i6 >= 128) {
                int[] iArr = this.f3873j;
                if (i6 < 128) {
                    if (iArr == null) {
                        return new o(j6, j5, i5, new int[]{i2});
                    }
                    int b4 = w.b(iArr, i2);
                    if (b4 < 0) {
                        int i7 = -(b4 + 1);
                        int length = iArr.length;
                        int[] iArr2 = new int[length + 1];
                        C1436t.e(iArr, iArr2, 0, 0, i7);
                        C1436t.e(iArr, iArr2, i7 + 1, i7, length);
                        iArr2[i7] = i2;
                        return new o(this.f3870d, this.f3871e, this.f3872i, iArr2);
                    }
                } else if (!s(i2)) {
                    int i8 = ((i2 + 1) / 64) * 64;
                    int i9 = this.f3872i;
                    ArrayList arrayList = null;
                    long j7 = j6;
                    while (true) {
                        if (i9 >= i8) {
                            j4 = j5;
                            i4 = i9;
                            break;
                        }
                        if (j5 != 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                if (iArr != null) {
                                    for (int i10 : iArr) {
                                        arrayList.add(Integer.valueOf(i10));
                                    }
                                }
                            }
                            for (int i11 = 0; i11 < 64; i11++) {
                                if (((1 << i11) & j5) != 0) {
                                    arrayList.add(Integer.valueOf(i11 + i9));
                                }
                            }
                        }
                        if (j7 == 0) {
                            i4 = i8;
                            j4 = 0;
                            break;
                        }
                        i9 += 64;
                        j5 = j7;
                        j7 = 0;
                    }
                    if (arrayList != null) {
                        iArr = C1403G.G(arrayList);
                    }
                    return new o(j7, j4, i4, iArr).B(i2);
                }
            } else {
                long j8 = 1 << (i6 - 64);
                if ((j6 & j8) == 0) {
                    return new o(j6 | j8, j5, i5, this.f3873j);
                }
            }
        } else {
            long j9 = 1 << i6;
            if ((j5 & j9) == 0) {
                return new o(this.f3870d, j5 | j9, i5, this.f3873j);
            }
        }
        return this;
    }

    public final o e(o oVar) {
        o oVar2;
        int[] iArr;
        o oVar3 = f3869k;
        if (oVar == oVar3) {
            return this;
        }
        if (this == oVar3) {
            return oVar3;
        }
        int i2 = oVar.f3872i;
        int[] iArr2 = oVar.f3873j;
        long j4 = oVar.f3871e;
        long j5 = oVar.f3870d;
        int i4 = this.f3872i;
        if (i2 == i4 && iArr2 == (iArr = this.f3873j)) {
            return new o(this.f3870d & (~j5), this.f3871e & (~j4), i4, iArr);
        }
        if (iArr2 != null) {
            oVar2 = this;
            for (int i5 : iArr2) {
                oVar2 = oVar2.h(i5);
            }
        } else {
            oVar2 = this;
        }
        int i6 = oVar.f3872i;
        if (j4 != 0) {
            for (int i7 = 0; i7 < 64; i7++) {
                if (((1 << i7) & j4) != 0) {
                    oVar2 = oVar2.h(i7 + i6);
                }
            }
        }
        if (j5 != 0) {
            for (int i8 = 0; i8 < 64; i8++) {
                if (((1 << i8) & j5) != 0) {
                    oVar2 = oVar2.h(i8 + 64 + i6);
                }
            }
        }
        return oVar2;
    }

    public final o h(int i2) {
        int[] iArr;
        int b4;
        int i4 = this.f3872i;
        int i5 = i2 - i4;
        if (i5 >= 0 && i5 < 64) {
            long j4 = 1 << i5;
            long j5 = this.f3871e;
            if ((j5 & j4) != 0) {
                return new o(this.f3870d, j5 & (~j4), i4, this.f3873j);
            }
        } else if (i5 >= 64 && i5 < 128) {
            long j6 = 1 << (i5 - 64);
            long j7 = this.f3870d;
            if ((j7 & j6) != 0) {
                return new o(j7 & (~j6), this.f3871e, i4, this.f3873j);
            }
        } else if (i5 < 0 && (iArr = this.f3873j) != null && (b4 = w.b(iArr, i2)) >= 0) {
            int length = iArr.length;
            int i6 = length - 1;
            if (i6 == 0) {
                return new o(this.f3870d, this.f3871e, this.f3872i, null);
            }
            int[] iArr2 = new int[i6];
            if (b4 > 0) {
                C1436t.e(iArr, iArr2, 0, 0, b4);
            }
            if (b4 < i6) {
                C1436t.e(iArr, iArr2, b4, b4 + 1, length);
            }
            return new o(this.f3870d, this.f3871e, this.f3872i, iArr2);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        n block = new n(this, null);
        Intrinsics.checkNotNullParameter(block, "block");
        return T2.j.a(block);
    }

    public final boolean s(int i2) {
        int[] iArr;
        int i4 = i2 - this.f3872i;
        if (i4 >= 0 && i4 < 64) {
            return ((1 << i4) & this.f3871e) != 0;
        }
        if (i4 >= 64 && i4 < 128) {
            return ((1 << (i4 - 64)) & this.f3870d) != 0;
        }
        if (i4 <= 0 && (iArr = this.f3873j) != null) {
            return w.b(iArr, i2) >= 0;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(C1442z.h(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i2 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = arrayList.get(i4);
            i2++;
            if (i2 > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }

    public final o w(o oVar) {
        o oVar2;
        int[] iArr;
        o oVar3 = oVar;
        o oVar4 = f3869k;
        if (oVar3 == oVar4) {
            return this;
        }
        if (this == oVar4) {
            return oVar3;
        }
        int i2 = oVar3.f3872i;
        long j4 = this.f3871e;
        long j5 = this.f3870d;
        int[] iArr2 = oVar3.f3873j;
        long j6 = oVar3.f3871e;
        long j7 = oVar3.f3870d;
        int i4 = this.f3872i;
        if (i2 == i4 && iArr2 == (iArr = this.f3873j)) {
            return new o(j5 | j7, j4 | j6, i4, iArr);
        }
        int[] iArr3 = this.f3873j;
        if (iArr3 == null) {
            if (iArr3 != null) {
                for (int i5 : iArr3) {
                    oVar3 = oVar3.B(i5);
                }
            }
            int i6 = this.f3872i;
            if (j4 != 0) {
                for (int i7 = 0; i7 < 64; i7++) {
                    if (((1 << i7) & j4) != 0) {
                        oVar3 = oVar3.B(i7 + i6);
                    }
                }
            }
            if (j5 == 0) {
                return oVar3;
            }
            for (int i8 = 0; i8 < 64; i8++) {
                if (((1 << i8) & j5) != 0) {
                    oVar3 = oVar3.B(i8 + 64 + i6);
                }
            }
            return oVar3;
        }
        if (iArr2 != null) {
            oVar2 = this;
            for (int i9 : iArr2) {
                oVar2 = oVar2.B(i9);
            }
        } else {
            oVar2 = this;
        }
        int i10 = oVar3.f3872i;
        if (j6 != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((1 << i11) & j6) != 0) {
                    oVar2 = oVar2.B(i11 + i10);
                }
            }
        }
        if (j7 != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if (((1 << i12) & j7) != 0) {
                    oVar2 = oVar2.B(i12 + 64 + i10);
                }
            }
        }
        return oVar2;
    }
}
