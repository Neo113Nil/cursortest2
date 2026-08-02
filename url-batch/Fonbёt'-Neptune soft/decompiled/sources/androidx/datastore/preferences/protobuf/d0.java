package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: f, reason: collision with root package name */
    public static final d0 f1676f = new d0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f1677a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f1678b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f1679c;

    /* renamed from: d, reason: collision with root package name */
    public int f1680d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1681e;

    public d0(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.f1677a = i2;
        this.f1678b = iArr;
        this.f1679c = objArr;
        this.f1681e = z2;
    }

    public final void a(int i2) {
        int[] iArr = this.f1678b;
        if (i2 > iArr.length) {
            int i3 = this.f1677a;
            int i4 = (i3 / 2) + i3;
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.f1678b = Arrays.copyOf(iArr, i2);
            this.f1679c = Arrays.copyOf(this.f1679c, i2);
        }
    }

    public final int b() {
        int q02;
        int i2 = this.f1680d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f1677a; i4++) {
            int i5 = this.f1678b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                q02 = C0150m.q0(((Long) this.f1679c[i4]).longValue(), i6);
            } else if (i7 == 1) {
                ((Long) this.f1679c[i4]).getClass();
                q02 = C0150m.c0(i6);
            } else if (i7 == 2) {
                q02 = C0150m.Y(i6, (C0144g) this.f1679c[i4]);
            } else if (i7 == 3) {
                i3 = ((d0) this.f1679c[i4]).b() + (C0150m.n0(i6) * 2) + i3;
            } else {
                if (i7 != 5) {
                    throw new IllegalStateException(A.b());
                }
                ((Integer) this.f1679c[i4]).getClass();
                q02 = C0150m.b0(i6);
            }
            i3 = q02 + i3;
        }
        this.f1680d = i3;
        return i3;
    }

    public final void c(int i2, Object obj) {
        if (!this.f1681e) {
            throw new UnsupportedOperationException();
        }
        a(this.f1677a + 1);
        int[] iArr = this.f1678b;
        int i3 = this.f1677a;
        iArr[i3] = i2;
        this.f1679c[i3] = obj;
        this.f1677a = i3 + 1;
    }

    public final void d(F f2) {
        if (this.f1677a == 0) {
            return;
        }
        f2.getClass();
        for (int i2 = 0; i2 < this.f1677a; i2++) {
            int i3 = this.f1678b[i2];
            Object obj = this.f1679c[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                f2.j(((Long) obj).longValue(), i4);
            } else if (i5 == 1) {
                f2.f(((Long) obj).longValue(), i4);
            } else if (i5 == 2) {
                f2.b(i4, (C0144g) obj);
            } else if (i5 == 3) {
                C0150m c0150m = (C0150m) f2.f1613a;
                c0150m.H0(i4, 3);
                ((d0) obj).d(f2);
                c0150m.H0(i4, 4);
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
        int i2 = this.f1677a;
        if (i2 == d0Var.f1677a) {
            int[] iArr = this.f1678b;
            int[] iArr2 = d0Var.f1678b;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.f1679c;
                    Object[] objArr2 = d0Var.f1679c;
                    int i4 = this.f1677a;
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
        int i2 = this.f1677a;
        int i3 = (527 + i2) * 31;
        int[] iArr = this.f1678b;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.f1679c;
        int i8 = this.f1677a;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }
}
