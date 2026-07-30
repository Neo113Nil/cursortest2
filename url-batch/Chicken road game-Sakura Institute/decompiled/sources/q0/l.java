package q0;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l implements Iterable, s6.a {

    /* renamed from: j, reason: collision with root package name */
    public static final l f7418j = new l(0, 0, 0, null);

    /* renamed from: f, reason: collision with root package name */
    public final long f7419f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7420g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7421h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f7422i;

    public l(long j8, long j9, int i7, int[] iArr) {
        this.f7419f = j8;
        this.f7420g = j9;
        this.f7421h = i7;
        this.f7422i = iArr;
    }

    public final l a(l lVar) {
        l lVar2;
        int[] iArr;
        l lVar3 = f7418j;
        if (lVar == lVar3) {
            return this;
        }
        if (this == lVar3) {
            return lVar3;
        }
        int i7 = lVar.f7421h;
        int i8 = lVar.f7421h;
        int[] iArr2 = lVar.f7422i;
        long j8 = lVar.f7420g;
        long j9 = lVar.f7419f;
        int i9 = this.f7421h;
        if (i7 == i9 && iArr2 == (iArr = this.f7422i)) {
            return new l(this.f7419f & (~j9), this.f7420g & (~j8), i9, iArr);
        }
        if (iArr2 != null) {
            lVar2 = this;
            for (int i10 : iArr2) {
                lVar2 = lVar2.g(i10);
            }
        } else {
            lVar2 = this;
        }
        if (j8 != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((1 << i11) & j8) != 0) {
                    lVar2 = lVar2.g(i11 + i8);
                }
            }
        }
        if (j9 != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if (((1 << i12) & j9) != 0) {
                    lVar2 = lVar2.g(i12 + 64 + i8);
                }
            }
        }
        return lVar2;
    }

    public final l g(int i7) {
        int[] iArr;
        int b9;
        int i8 = this.f7421h;
        int i9 = i7 - i8;
        if (i9 >= 0 && i9 < 64) {
            long j8 = 1 << i9;
            long j9 = this.f7420g;
            if ((j9 & j8) != 0) {
                return new l(this.f7419f, j9 & (~j8), i8, this.f7422i);
            }
        } else if (i9 >= 64 && i9 < 128) {
            long j10 = 1 << (i9 - 64);
            long j11 = this.f7419f;
            if ((j11 & j10) != 0) {
                return new l((~j10) & j11, this.f7420g, i8, this.f7422i);
            }
        } else if (i9 < 0 && (iArr = this.f7422i) != null && (b9 = r.b(iArr, i7)) >= 0) {
            int length = iArr.length;
            int i10 = length - 1;
            if (i10 == 0) {
                return new l(this.f7419f, this.f7420g, this.f7421h, null);
            }
            int[] iArr2 = new int[i10];
            if (b9 > 0) {
                e6.k.W(iArr, iArr2, 0, 0, b9);
            }
            if (b9 < i10) {
                e6.k.W(iArr, iArr2, b9, b9 + 1, length);
            }
            return new l(this.f7419f, this.f7420g, this.f7421h, iArr2);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return u3.r.j(new k(this, null));
    }

    public final boolean m(int i7) {
        int[] iArr;
        int i8 = i7 - this.f7421h;
        return (i8 < 0 || i8 >= 64) ? (i8 < 64 || i8 >= 128) ? i8 <= 0 && (iArr = this.f7422i) != null && r.b(iArr, i7) >= 0 : ((1 << (i8 - 64)) & this.f7419f) != 0 : ((1 << i8) & this.f7420g) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(e6.n.a0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = arrayList.get(i8);
            i7++;
            if (i7 > 1) {
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

    public final l w(l lVar) {
        l lVar2;
        int[] iArr;
        l lVar3 = lVar;
        l lVar4 = f7418j;
        if (lVar3 == lVar4) {
            return this;
        }
        if (this == lVar4) {
            return lVar3;
        }
        int i7 = lVar3.f7421h;
        int i8 = lVar3.f7421h;
        int[] iArr2 = lVar3.f7422i;
        long j8 = lVar3.f7420g;
        long j9 = lVar3.f7419f;
        long j10 = this.f7420g;
        long j11 = this.f7419f;
        int i9 = this.f7421h;
        if (i7 == i9 && iArr2 == (iArr = this.f7422i)) {
            return new l(j11 | j9, j10 | j8, i9, iArr);
        }
        int i10 = 0;
        int[] iArr3 = this.f7422i;
        if (iArr3 == null) {
            if (iArr3 != null) {
                for (int i11 : iArr3) {
                    lVar3 = lVar3.x(i11);
                }
            }
            int i12 = this.f7421h;
            if (j10 != 0) {
                for (int i13 = 0; i13 < 64; i13++) {
                    if (((1 << i13) & j10) != 0) {
                        lVar3 = lVar3.x(i13 + i12);
                    }
                }
            }
            if (j11 != 0) {
                while (i10 < 64) {
                    if (((1 << i10) & j11) != 0) {
                        lVar3 = lVar3.x(i10 + 64 + i12);
                    }
                    i10++;
                }
            }
            return lVar3;
        }
        if (iArr2 != null) {
            lVar2 = this;
            for (int i14 : iArr2) {
                lVar2 = lVar2.x(i14);
            }
        } else {
            lVar2 = this;
        }
        if (j8 != 0) {
            for (int i15 = 0; i15 < 64; i15++) {
                if (((1 << i15) & j8) != 0) {
                    lVar2 = lVar2.x(i15 + i8);
                }
            }
        }
        if (j9 != 0) {
            while (i10 < 64) {
                if (((1 << i10) & j9) != 0) {
                    lVar2 = lVar2.x(i10 + 64 + i8);
                }
                i10++;
            }
        }
        return lVar2;
    }

    public final l x(int i7) {
        long j8;
        int i8;
        long j9;
        int i9 = this.f7421h;
        int i10 = i7 - i9;
        long j10 = this.f7419f;
        long j11 = this.f7420g;
        int[] iArr = this.f7422i;
        long j12 = 1;
        if (i10 >= 0 && i10 < 64) {
            long j13 = 1 << i10;
            if ((j11 & j13) == 0) {
                return new l(j10, j11 | j13, i9, iArr);
            }
        } else if (i10 >= 64 && i10 < 128) {
            long j14 = 1 << (i10 - 64);
            if ((j10 & j14) == 0) {
                return new l(j14 | j10, j11, i9, iArr);
            }
        } else if (i10 < 128) {
            if (iArr == null) {
                return new l(j10, j11, i9, new int[]{i7});
            }
            int b9 = r.b(iArr, i7);
            if (b9 < 0) {
                int i11 = -(b9 + 1);
                int length = iArr.length;
                int[] iArr2 = new int[length + 1];
                e6.k.W(iArr, iArr2, 0, 0, i11);
                e6.k.W(iArr, iArr2, i11 + 1, i11, length);
                iArr2[i11] = i7;
                return new l(this.f7419f, this.f7420g, this.f7421h, iArr2);
            }
        } else if (!m(i7)) {
            int i12 = ((i7 + 1) / 64) * 64;
            int i13 = this.f7421h;
            ArrayList arrayList = null;
            long j15 = j10;
            while (true) {
                if (i13 >= i12) {
                    j8 = j11;
                    i8 = i13;
                    break;
                }
                if (j11 != 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        if (iArr != null) {
                            int length2 = iArr.length;
                            int i14 = 0;
                            while (i14 < length2) {
                                arrayList.add(Integer.valueOf(iArr[i14]));
                                i14++;
                                j12 = j12;
                            }
                        }
                    }
                    j9 = j12;
                    for (int i15 = 0; i15 < 64; i15++) {
                        if (((j9 << i15) & j11) != 0) {
                            arrayList.add(Integer.valueOf(i15 + i13));
                        }
                    }
                } else {
                    j9 = j12;
                }
                if (j15 == 0) {
                    i8 = i12;
                    j8 = 0;
                    break;
                }
                i13 += 64;
                j11 = j15;
                j12 = j9;
                j15 = 0;
            }
            return new l(j15, j8, i8, arrayList != null ? e6.l.v0(arrayList) : iArr).x(i7);
        }
        return this;
    }
}
