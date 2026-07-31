package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: f, reason: collision with root package name */
    public static final d0 f1516f = new d0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f1517a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f1518b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f1519c;

    /* renamed from: d, reason: collision with root package name */
    public int f1520d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1521e;

    public d0(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.f1517a = i2;
        this.f1518b = iArr;
        this.f1519c = objArr;
        this.f1521e = z2;
    }

    public final void a(int i2) {
        int[] iArr = this.f1518b;
        if (i2 > iArr.length) {
            int i3 = this.f1517a;
            int i4 = (i3 / 2) + i3;
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.f1518b = Arrays.copyOf(iArr, i2);
            this.f1519c = Arrays.copyOf(this.f1519c, i2);
        }
    }

    public final int b() {
        int V;
        int X2;
        int V2;
        int i2 = this.f1520d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f1517a; i4++) {
            int i5 = this.f1518b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ((Long) this.f1519c[i4]).getClass();
                    V2 = C0101m.V(i6) + 8;
                } else if (i7 == 2) {
                    V2 = C0101m.T(i6, (C0095g) this.f1519c[i4]);
                } else if (i7 == 3) {
                    V = C0101m.V(i6) * 2;
                    X2 = ((d0) this.f1519c[i4]).b();
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(A.b());
                    }
                    ((Integer) this.f1519c[i4]).getClass();
                    V2 = C0101m.V(i6) + 4;
                }
                i3 = V2 + i3;
            } else {
                long longValue = ((Long) this.f1519c[i4]).longValue();
                V = C0101m.V(i6);
                X2 = C0101m.X(longValue);
            }
            i3 = X2 + V + i3;
        }
        this.f1520d = i3;
        return i3;
    }

    public final void c(int i2, Object obj) {
        if (!this.f1521e) {
            throw new UnsupportedOperationException();
        }
        a(this.f1517a + 1);
        int[] iArr = this.f1518b;
        int i3 = this.f1517a;
        iArr[i3] = i2;
        this.f1519c[i3] = obj;
        this.f1517a = i3 + 1;
    }

    public final void d(F f2) {
        if (this.f1517a == 0) {
            return;
        }
        f2.getClass();
        C0101m c0101m = (C0101m) f2.f1452a;
        for (int i2 = 0; i2 < this.f1517a; i2++) {
            int i3 = this.f1518b[i2];
            Object obj = this.f1519c[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                c0101m.r0(((Long) obj).longValue(), i4);
            } else if (i5 == 1) {
                c0101m.h0(((Long) obj).longValue(), i4);
            } else if (i5 == 2) {
                c0101m.d0(i4, (C0095g) obj);
            } else if (i5 == 3) {
                c0101m.o0(i4, 3);
                ((d0) obj).d(f2);
                c0101m.o0(i4, 4);
            } else {
                if (i5 != 5) {
                    throw new RuntimeException(A.b());
                }
                c0101m.f0(i4, ((Integer) obj).intValue());
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
        int i2 = this.f1517a;
        if (i2 == d0Var.f1517a) {
            int[] iArr = this.f1518b;
            int[] iArr2 = d0Var.f1518b;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.f1519c;
                    Object[] objArr2 = d0Var.f1519c;
                    int i4 = this.f1517a;
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
        int i2 = this.f1517a;
        int i3 = (527 + i2) * 31;
        int[] iArr = this.f1518b;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.f1519c;
        int i8 = this.f1517a;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }
}
