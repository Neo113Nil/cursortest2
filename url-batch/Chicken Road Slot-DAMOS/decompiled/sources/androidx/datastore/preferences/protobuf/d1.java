package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: f, reason: collision with root package name */
    public static final d1 f524f = new d1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f525a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f526b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f527c;

    /* renamed from: d, reason: collision with root package name */
    public int f528d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f529e;

    public d1(int i3, int[] iArr, Object[] objArr, boolean z10) {
        this.f525a = i3;
        this.f526b = iArr;
        this.f527c = objArr;
        this.f529e = z10;
    }

    public final void a(int i3) {
        int[] iArr = this.f526b;
        if (i3 > iArr.length) {
            int i10 = this.f525a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i3) {
                i3 = i11;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.f526b = Arrays.copyOf(iArr, i3);
            this.f527c = Arrays.copyOf(this.f527c, i3);
        }
    }

    public final int b() {
        int h10;
        int j;
        int h11;
        int i3 = this.f528d;
        if (i3 != -1) {
            return i3;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f525a; i11++) {
            int i12 = this.f526b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f527c[i11]).getClass();
                    h11 = l.h(i13) + 8;
                } else if (i14 == 2) {
                    h11 = l.f(i13, (f) this.f527c[i11]);
                } else if (i14 == 3) {
                    h10 = l.h(i13) * 2;
                    j = ((d1) this.f527c[i11]).b();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(z.b());
                    }
                    ((Integer) this.f527c[i11]).getClass();
                    h11 = l.h(i13) + 4;
                }
                i10 = h11 + i10;
            } else {
                long longValue = ((Long) this.f527c[i11]).longValue();
                h10 = l.h(i13);
                j = l.j(longValue);
            }
            i10 = j + h10 + i10;
        }
        this.f528d = i10;
        return i10;
    }

    public final void c(int i3, Object obj) {
        if (!this.f529e) {
            a2.r.a();
            return;
        }
        a(this.f525a + 1);
        int[] iArr = this.f526b;
        int i10 = this.f525a;
        iArr[i10] = i3;
        this.f527c[i10] = obj;
        this.f525a = i10 + 1;
    }

    public final void d(f0 f0Var) {
        if (this.f525a == 0) {
            return;
        }
        f0Var.getClass();
        l lVar = (l) f0Var.f538a;
        for (int i3 = 0; i3 < this.f525a; i3++) {
            int i10 = this.f526b[i3];
            Object obj = this.f527c[i3];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                lVar.E(i11, ((Long) obj).longValue());
            } else if (i12 == 1) {
                lVar.t(i11, ((Long) obj).longValue());
            } else if (i12 == 2) {
                lVar.p(i11, (f) obj);
            } else if (i12 == 3) {
                lVar.B(i11, 3);
                ((d1) obj).d(f0Var);
                lVar.B(i11, 4);
            } else {
                if (i12 != 5) {
                    throw new RuntimeException(z.b());
                }
                lVar.r(i11, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        int i3 = this.f525a;
        if (i3 == d1Var.f525a) {
            int[] iArr = this.f526b;
            int[] iArr2 = d1Var.f526b;
            int i10 = 0;
            while (true) {
                if (i10 >= i3) {
                    Object[] objArr = this.f527c;
                    Object[] objArr2 = d1Var.f527c;
                    int i11 = this.f525a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
                if (iArr[i10] != iArr2[i10]) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f525a;
        int i10 = (527 + i3) * 31;
        int[] iArr = this.f526b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i3; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.f527c;
        int i15 = this.f525a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}
