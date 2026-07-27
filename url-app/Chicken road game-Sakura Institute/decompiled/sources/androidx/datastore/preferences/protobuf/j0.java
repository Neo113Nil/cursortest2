package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: f, reason: collision with root package name */
    public static final j0 f5365f = new j0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f5366a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5367b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f5368c;

    /* renamed from: d, reason: collision with root package name */
    public int f5369d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5370e;

    public j0(int i2, int[] iArr, Object[] objArr, boolean z4) {
        this.f5366a = i2;
        this.f5367b = iArr;
        this.f5368c = objArr;
        this.f5370e = z4;
    }

    public final void a(int i2) {
        int[] iArr = this.f5367b;
        if (i2 > iArr.length) {
            int i4 = this.f5366a;
            int i5 = (i4 / 2) + i4;
            if (i5 >= i2) {
                i2 = i5;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.f5367b = Arrays.copyOf(iArr, i2);
            this.f5368c = Arrays.copyOf(this.f5368c, i2);
        }
    }

    public final int b() {
        int G3;
        int i2 = this.f5369d;
        if (i2 != -1) {
            return i2;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f5366a; i5++) {
            int i6 = this.f5367b[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 == 0) {
                G3 = C0447l.G(((Long) this.f5368c[i5]).longValue(), i7);
            } else if (i8 == 1) {
                ((Long) this.f5368c[i5]).getClass();
                G3 = C0447l.r(i7);
            } else if (i8 == 2) {
                G3 = C0447l.m(i7, (C0442g) this.f5368c[i5]);
            } else if (i8 == 3) {
                i4 = ((j0) this.f5368c[i5]).b() + (C0447l.D(i7) * 2) + i4;
            } else {
                if (i8 != 5) {
                    throw new IllegalStateException(C0460z.b());
                }
                ((Integer) this.f5368c[i5]).getClass();
                G3 = C0447l.q(i7);
            }
            i4 = G3 + i4;
        }
        this.f5369d = i4;
        return i4;
    }

    public final void c(int i2, Object obj) {
        if (!this.f5370e) {
            throw new UnsupportedOperationException();
        }
        a(this.f5366a + 1);
        int[] iArr = this.f5367b;
        int i4 = this.f5366a;
        iArr[i4] = i2;
        this.f5368c[i4] = obj;
        this.f5366a = i4 + 1;
    }

    public final void d(H h4) {
        if (this.f5366a == 0) {
            return;
        }
        h4.getClass();
        for (int i2 = 0; i2 < this.f5366a; i2++) {
            int i4 = this.f5367b[i2];
            Object obj = this.f5368c[i2];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                h4.j(((Long) obj).longValue(), i5);
            } else if (i6 == 1) {
                h4.f(((Long) obj).longValue(), i5);
            } else if (i6 == 2) {
                h4.b(i5, (C0442g) obj);
            } else if (i6 == 3) {
                C0447l c0447l = (C0447l) h4.f5272a;
                c0447l.X(i5, 3);
                ((j0) obj).d(h4);
                c0447l.X(i5, 4);
            } else {
                if (i6 != 5) {
                    throw new RuntimeException(C0460z.b());
                }
                h4.e(i5, ((Integer) obj).intValue());
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
        int i2 = this.f5366a;
        if (i2 == j0Var.f5366a) {
            int[] iArr = this.f5367b;
            int[] iArr2 = j0Var.f5367b;
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    Object[] objArr = this.f5368c;
                    Object[] objArr2 = j0Var.f5368c;
                    int i5 = this.f5366a;
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
        int i2 = this.f5366a;
        int i4 = (527 + i2) * 31;
        int[] iArr = this.f5367b;
        int i5 = 17;
        int i6 = 17;
        for (int i7 = 0; i7 < i2; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        int i8 = (i4 + i6) * 31;
        Object[] objArr = this.f5368c;
        int i9 = this.f5366a;
        for (int i10 = 0; i10 < i9; i10++) {
            i5 = (i5 * 31) + objArr[i10].hashCode();
        }
        return i8 + i5;
    }
}
