package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: f, reason: collision with root package name */
    public static final d0 f1428f = new d0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f1429a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f1430b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f1431c;

    /* renamed from: d, reason: collision with root package name */
    public int f1432d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1433e;

    public d0(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.f1429a = i2;
        this.f1430b = iArr;
        this.f1431c = objArr;
        this.f1433e = z2;
    }

    public final void a(int i2) {
        int[] iArr = this.f1430b;
        if (i2 > iArr.length) {
            int i3 = this.f1429a;
            int i4 = (i3 / 2) + i3;
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.f1430b = Arrays.copyOf(iArr, i2);
            this.f1431c = Arrays.copyOf(this.f1431c, i2);
        }
    }

    public final int b() {
        int n02;
        int i2 = this.f1432d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f1429a; i4++) {
            int i5 = this.f1430b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                n02 = C0083m.n0(((Long) this.f1431c[i4]).longValue(), i6);
            } else if (i7 == 1) {
                ((Long) this.f1431c[i4]).getClass();
                n02 = C0083m.Z(i6);
            } else if (i7 == 2) {
                n02 = C0083m.V(i6, (C0077g) this.f1431c[i4]);
            } else if (i7 == 3) {
                i3 = ((d0) this.f1431c[i4]).b() + (C0083m.k0(i6) * 2) + i3;
            } else {
                if (i7 != 5) {
                    throw new IllegalStateException(A.b());
                }
                ((Integer) this.f1431c[i4]).getClass();
                n02 = C0083m.Y(i6);
            }
            i3 = n02 + i3;
        }
        this.f1432d = i3;
        return i3;
    }

    public final void c(int i2, Object obj) {
        if (!this.f1433e) {
            throw new UnsupportedOperationException();
        }
        a(this.f1429a + 1);
        int[] iArr = this.f1430b;
        int i3 = this.f1429a;
        iArr[i3] = i2;
        this.f1431c[i3] = obj;
        this.f1429a = i3 + 1;
    }

    public final void d(F f2) {
        if (this.f1429a == 0) {
            return;
        }
        f2.getClass();
        for (int i2 = 0; i2 < this.f1429a; i2++) {
            int i3 = this.f1430b[i2];
            Object obj = this.f1431c[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                f2.j(((Long) obj).longValue(), i4);
            } else if (i5 == 1) {
                f2.f(((Long) obj).longValue(), i4);
            } else if (i5 == 2) {
                f2.b(i4, (C0077g) obj);
            } else if (i5 == 3) {
                C0083m c0083m = (C0083m) f2.f1365a;
                c0083m.E0(i4, 3);
                ((d0) obj).d(f2);
                c0083m.E0(i4, 4);
            } else {
                if (i5 != 5) {
                    throw new RuntimeException(A.b());
                }
                f2.e(i4, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        int i2 = this.f1429a;
        if (i2 == d0Var.f1429a) {
            int[] iArr = this.f1430b;
            int[] iArr2 = d0Var.f1430b;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.f1431c;
                    Object[] objArr2 = d0Var.f1431c;
                    int i4 = this.f1429a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (objArr[i5].equals(objArr2[i5])) {
                        }
                    }
                    return true;
                }
                if (iArr[i3] != iArr2[i3]) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f1429a;
        int i3 = (527 + i2) * 31;
        int[] iArr = this.f1430b;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.f1431c;
        int i8 = this.f1429a;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }
}
