package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: f, reason: collision with root package name */
    public static final j0 f3890f = new j0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f3891a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3892b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f3893c;

    /* renamed from: d, reason: collision with root package name */
    public int f3894d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3895e;

    public j0(int i3, int[] iArr, Object[] objArr, boolean z3) {
        this.f3891a = i3;
        this.f3892b = iArr;
        this.f3893c = objArr;
        this.f3895e = z3;
    }

    public final void a(int i3) {
        int[] iArr = this.f3892b;
        if (i3 > iArr.length) {
            int i4 = this.f3891a;
            int i5 = (i4 / 2) + i4;
            if (i5 >= i3) {
                i3 = i5;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.f3892b = Arrays.copyOf(iArr, i3);
            this.f3893c = Arrays.copyOf(this.f3893c, i3);
        }
    }

    public final int b() {
        int G3;
        int i3 = this.f3894d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f3891a; i5++) {
            int i6 = this.f3892b[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 == 0) {
                G3 = C0202l.G(((Long) this.f3893c[i5]).longValue(), i7);
            } else if (i8 == 1) {
                ((Long) this.f3893c[i5]).getClass();
                G3 = C0202l.r(i7);
            } else if (i8 == 2) {
                G3 = C0202l.m(i7, (C0197g) this.f3893c[i5]);
            } else if (i8 == 3) {
                i4 = ((j0) this.f3893c[i5]).b() + (C0202l.D(i7) * 2) + i4;
            } else {
                if (i8 != 5) {
                    throw new IllegalStateException(C0215z.b());
                }
                ((Integer) this.f3893c[i5]).getClass();
                G3 = C0202l.q(i7);
            }
            i4 = G3 + i4;
        }
        this.f3894d = i4;
        return i4;
    }

    public final void c(int i3, Object obj) {
        if (!this.f3895e) {
            throw new UnsupportedOperationException();
        }
        a(this.f3891a + 1);
        int[] iArr = this.f3892b;
        int i4 = this.f3891a;
        iArr[i4] = i3;
        this.f3893c[i4] = obj;
        this.f3891a = i4 + 1;
    }

    public final void d(H h3) {
        if (this.f3891a == 0) {
            return;
        }
        h3.getClass();
        for (int i3 = 0; i3 < this.f3891a; i3++) {
            int i4 = this.f3892b[i3];
            Object obj = this.f3893c[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                h3.j(((Long) obj).longValue(), i5);
            } else if (i6 == 1) {
                h3.f(((Long) obj).longValue(), i5);
            } else if (i6 == 2) {
                h3.b(i5, (C0197g) obj);
            } else if (i6 == 3) {
                C0202l c0202l = (C0202l) h3.f3798a;
                c0202l.X(i5, 3);
                ((j0) obj).d(h3);
                c0202l.X(i5, 4);
            } else {
                if (i6 != 5) {
                    throw new RuntimeException(C0215z.b());
                }
                h3.e(i5, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        int i3 = this.f3891a;
        if (i3 == j0Var.f3891a) {
            int[] iArr = this.f3892b;
            int[] iArr2 = j0Var.f3892b;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    Object[] objArr = this.f3893c;
                    Object[] objArr2 = j0Var.f3893c;
                    int i5 = this.f3891a;
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
        int i3 = this.f3891a;
        int i4 = (527 + i3) * 31;
        int[] iArr = this.f3892b;
        int i5 = 17;
        int i6 = 17;
        for (int i7 = 0; i7 < i3; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        int i8 = (i4 + i6) * 31;
        Object[] objArr = this.f3893c;
        int i9 = this.f3891a;
        for (int i10 = 0; i10 < i9; i10++) {
            i5 = (i5 * 31) + objArr[i10].hashCode();
        }
        return i8 + i5;
    }
}
