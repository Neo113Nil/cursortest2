package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d0 {
    public static final d0 f = new d0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f2287a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2288b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f2289c;

    /* renamed from: d, reason: collision with root package name */
    public int f2290d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2291e;

    public d0(int i3, int[] iArr, Object[] objArr, boolean z) {
        this.f2287a = i3;
        this.f2288b = iArr;
        this.f2289c = objArr;
        this.f2291e = z;
    }

    public final void a(int i3) {
        int[] iArr = this.f2288b;
        if (i3 > iArr.length) {
            int i4 = this.f2287a;
            int i5 = (i4 / 2) + i4;
            if (i5 >= i3) {
                i3 = i5;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.f2288b = Arrays.copyOf(iArr, i3);
            this.f2289c = Arrays.copyOf(this.f2289c, i3);
        }
    }

    public final int b() {
        int X2;
        int Z2;
        int X3;
        int i3 = this.f2290d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f2287a; i5++) {
            int i6 = this.f2288b[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 != 0) {
                if (i8 == 1) {
                    ((Long) this.f2289c[i5]).getClass();
                    X3 = C0146m.X(i7) + 8;
                } else if (i8 == 2) {
                    X3 = C0146m.V(i7, (C0140g) this.f2289c[i5]);
                } else if (i8 == 3) {
                    X2 = C0146m.X(i7) * 2;
                    Z2 = ((d0) this.f2289c[i5]).b();
                } else {
                    if (i8 != 5) {
                        throw new IllegalStateException(A.b());
                    }
                    ((Integer) this.f2289c[i5]).getClass();
                    X3 = C0146m.X(i7) + 4;
                }
                i4 = X3 + i4;
            } else {
                long longValue = ((Long) this.f2289c[i5]).longValue();
                X2 = C0146m.X(i7);
                Z2 = C0146m.Z(longValue);
            }
            i4 = Z2 + X2 + i4;
        }
        this.f2290d = i4;
        return i4;
    }

    public final void c(int i3, Object obj) {
        if (!this.f2291e) {
            throw new UnsupportedOperationException();
        }
        a(this.f2287a + 1);
        int[] iArr = this.f2288b;
        int i4 = this.f2287a;
        iArr[i4] = i3;
        this.f2289c[i4] = obj;
        this.f2287a = i4 + 1;
    }

    public final void d(F f3) {
        if (this.f2287a == 0) {
            return;
        }
        f3.getClass();
        for (int i3 = 0; i3 < this.f2287a; i3++) {
            int i4 = this.f2288b[i3];
            Object obj = this.f2289c[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            C0146m c0146m = (C0146m) f3.f2225a;
            if (i6 == 0) {
                c0146m.t0(i5, ((Long) obj).longValue());
            } else if (i6 == 1) {
                c0146m.j0(i5, ((Long) obj).longValue());
            } else if (i6 == 2) {
                c0146m.f0(i5, (C0140g) obj);
            } else if (i6 == 3) {
                c0146m.q0(i5, 3);
                ((d0) obj).d(f3);
                c0146m.q0(i5, 4);
            } else {
                if (i6 != 5) {
                    throw new RuntimeException(A.b());
                }
                c0146m.h0(i5, ((Integer) obj).intValue());
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
        int i3 = this.f2287a;
        if (i3 == d0Var.f2287a) {
            int[] iArr = this.f2288b;
            int[] iArr2 = d0Var.f2288b;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    Object[] objArr = this.f2289c;
                    Object[] objArr2 = d0Var.f2289c;
                    int i5 = this.f2287a;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (objArr[i6].equals(objArr2[i6])) {
                        }
                    }
                    return true;
                }
                if (iArr[i4] != iArr2[i4]) {
                    break;
                }
                i4++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f2287a;
        int i4 = (527 + i3) * 31;
        int[] iArr = this.f2288b;
        int i5 = 17;
        int i6 = 17;
        for (int i7 = 0; i7 < i3; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        int i8 = (i4 + i6) * 31;
        Object[] objArr = this.f2289c;
        int i9 = this.f2287a;
        for (int i10 = 0; i10 < i9; i10++) {
            i5 = (i5 * 31) + objArr[i10].hashCode();
        }
        return i8 + i5;
    }
}
