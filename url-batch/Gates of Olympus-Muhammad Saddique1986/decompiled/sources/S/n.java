package S;

import g2.InterfaceC0439a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n implements Iterable, InterfaceC0439a {

    /* renamed from: h, reason: collision with root package name */
    public static final n f4232h = new n(0, 0, 0, null);

    /* renamed from: d, reason: collision with root package name */
    public final long f4233d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4234e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4235f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f4236g;

    public n(long j3, long j4, int i3, int[] iArr) {
        this.f4233d = j3;
        this.f4234e = j4;
        this.f4235f = i3;
        this.f4236g = iArr;
    }

    public final n b(n nVar) {
        n nVar2;
        int[] iArr;
        n nVar3 = f4232h;
        if (nVar == nVar3) {
            return this;
        }
        if (this == nVar3) {
            return nVar3;
        }
        int i3 = nVar.f4235f;
        int[] iArr2 = nVar.f4236g;
        long j3 = nVar.f4234e;
        long j4 = nVar.f4233d;
        int i4 = this.f4235f;
        if (i3 == i4 && iArr2 == (iArr = this.f4236g)) {
            return new n(this.f4233d & (~j4), this.f4234e & (~j3), i4, iArr);
        }
        if (iArr2 != null) {
            nVar2 = this;
            for (int i5 : iArr2) {
                nVar2 = nVar2.c(i5);
            }
        } else {
            nVar2 = this;
        }
        int i6 = nVar.f4235f;
        if (j3 != 0) {
            for (int i7 = 0; i7 < 64; i7++) {
                if (((1 << i7) & j3) != 0) {
                    nVar2 = nVar2.c(i7 + i6);
                }
            }
        }
        if (j4 != 0) {
            for (int i8 = 0; i8 < 64; i8++) {
                if (((1 << i8) & j4) != 0) {
                    nVar2 = nVar2.c(i8 + 64 + i6);
                }
            }
        }
        return nVar2;
    }

    public final n c(int i3) {
        int[] iArr;
        int b3;
        int i4 = this.f4235f;
        int i5 = i3 - i4;
        if (i5 >= 0 && i5 < 64) {
            long j3 = 1 << i5;
            long j4 = this.f4234e;
            if ((j4 & j3) != 0) {
                return new n(this.f4233d, j4 & (~j3), i4, this.f4236g);
            }
        } else if (i5 >= 64 && i5 < 128) {
            long j5 = 1 << (i5 - 64);
            long j6 = this.f4233d;
            if ((j6 & j5) != 0) {
                return new n(j6 & (~j5), this.f4234e, i4, this.f4236g);
            }
        } else if (i5 < 0 && (iArr = this.f4236g) != null && (b3 = u.b(iArr, i3)) >= 0) {
            int length = iArr.length;
            int i6 = length - 1;
            if (i6 == 0) {
                return new n(this.f4233d, this.f4234e, this.f4235f, null);
            }
            int[] iArr2 = new int[i6];
            if (b3 > 0) {
                S1.k.l0(iArr, iArr2, 0, 0, b3);
            }
            if (b3 < i6) {
                S1.k.l0(iArr, iArr2, b3, b3 + 1, length);
            }
            return new n(this.f4233d, this.f4234e, this.f4235f, iArr2);
        }
        return this;
    }

    public final boolean d(int i3) {
        int[] iArr;
        int i4 = i3 - this.f4235f;
        if (i4 >= 0 && i4 < 64) {
            return ((1 << i4) & this.f4234e) != 0;
        }
        if (i4 >= 64 && i4 < 128) {
            return ((1 << (i4 - 64)) & this.f4233d) != 0;
        }
        if (i4 <= 0 && (iArr = this.f4236g) != null) {
            return u.b(iArr, i3) >= 0;
        }
        return false;
    }

    public final n i(n nVar) {
        n nVar2;
        int[] iArr;
        n nVar3 = nVar;
        n nVar4 = f4232h;
        if (nVar3 == nVar4) {
            return this;
        }
        if (this == nVar4) {
            return nVar3;
        }
        int i3 = nVar3.f4235f;
        long j3 = this.f4234e;
        long j4 = this.f4233d;
        int[] iArr2 = nVar3.f4236g;
        long j5 = nVar3.f4234e;
        long j6 = nVar3.f4233d;
        int i4 = this.f4235f;
        if (i3 == i4 && iArr2 == (iArr = this.f4236g)) {
            return new n(j4 | j6, j3 | j5, i4, iArr);
        }
        int[] iArr3 = this.f4236g;
        if (iArr3 == null) {
            if (iArr3 != null) {
                for (int i5 : iArr3) {
                    nVar3 = nVar3.j(i5);
                }
            }
            int i6 = this.f4235f;
            if (j3 != 0) {
                for (int i7 = 0; i7 < 64; i7++) {
                    if (((1 << i7) & j3) != 0) {
                        nVar3 = nVar3.j(i7 + i6);
                    }
                }
            }
            if (j4 == 0) {
                return nVar3;
            }
            for (int i8 = 0; i8 < 64; i8++) {
                if (((1 << i8) & j4) != 0) {
                    nVar3 = nVar3.j(i8 + 64 + i6);
                }
            }
            return nVar3;
        }
        if (iArr2 != null) {
            nVar2 = this;
            for (int i9 : iArr2) {
                nVar2 = nVar2.j(i9);
            }
        } else {
            nVar2 = this;
        }
        int i10 = nVar3.f4235f;
        if (j5 != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((1 << i11) & j5) != 0) {
                    nVar2 = nVar2.j(i11 + i10);
                }
            }
        }
        if (j6 != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if (((1 << i12) & j6) != 0) {
                    nVar2 = nVar2.j(i12 + 64 + i10);
                }
            }
        }
        return nVar2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return l0.c.F(new m(this, null));
    }

    public final n j(int i3) {
        long j3;
        int i4;
        int i5 = this.f4235f;
        int i6 = i3 - i5;
        long j4 = this.f4234e;
        if (i6 < 0 || i6 >= 64) {
            long j5 = this.f4233d;
            if (i6 < 64 || i6 >= 128) {
                int[] iArr = this.f4236g;
                if (i6 < 128) {
                    if (iArr == null) {
                        return new n(j5, j4, i5, new int[]{i3});
                    }
                    int b3 = u.b(iArr, i3);
                    if (b3 < 0) {
                        int i7 = -(b3 + 1);
                        int length = iArr.length;
                        int[] iArr2 = new int[length + 1];
                        S1.k.l0(iArr, iArr2, 0, 0, i7);
                        S1.k.l0(iArr, iArr2, i7 + 1, i7, length);
                        iArr2[i7] = i3;
                        return new n(this.f4233d, this.f4234e, this.f4235f, iArr2);
                    }
                } else if (!d(i3)) {
                    int i8 = ((i3 + 1) / 64) * 64;
                    int i9 = this.f4235f;
                    ArrayList arrayList = null;
                    long j6 = j5;
                    while (true) {
                        if (i9 >= i8) {
                            j3 = j4;
                            i4 = i9;
                            break;
                        }
                        if (j4 != 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                if (iArr != null) {
                                    for (int i10 : iArr) {
                                        arrayList.add(Integer.valueOf(i10));
                                    }
                                }
                            }
                            for (int i11 = 0; i11 < 64; i11++) {
                                if (((1 << i11) & j4) != 0) {
                                    arrayList.add(Integer.valueOf(i11 + i9));
                                }
                            }
                        }
                        if (j6 == 0) {
                            i4 = i8;
                            j3 = 0;
                            break;
                        }
                        i9 += 64;
                        j4 = j6;
                        j6 = 0;
                    }
                    if (arrayList != null) {
                        iArr = S1.l.Z0(arrayList);
                    }
                    return new n(j6, j3, i4, iArr).j(i3);
                }
            } else {
                long j7 = 1 << (i6 - 64);
                if ((j5 & j7) == 0) {
                    return new n(j5 | j7, j4, i5, this.f4236g);
                }
            }
        } else {
            long j8 = 1 << i6;
            if ((j4 & j8) == 0) {
                return new n(this.f4233d, j4 | j8, i5, this.f4236g);
            }
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(S1.n.E0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = arrayList.get(i4);
            i3++;
            if (i3 > 1) {
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
}
