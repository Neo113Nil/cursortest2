package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: f, reason: collision with root package name */
    public static final e1 f674f = new e1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f675a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f676b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f677c;

    /* renamed from: d, reason: collision with root package name */
    public int f678d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f679e;

    public e1(int i, int[] iArr, Object[] objArr, boolean z3) {
        this.f675a = i;
        this.f676b = iArr;
        this.f677c = objArr;
        this.f679e = z3;
    }

    public final void a(int i) {
        int[] iArr = this.f676b;
        if (i > iArr.length) {
            int i8 = this.f675a;
            int i9 = (i8 / 2) + i8;
            if (i9 >= i) {
                i = i9;
            }
            if (i < 8) {
                i = 8;
            }
            this.f676b = Arrays.copyOf(iArr, i);
            this.f677c = Arrays.copyOf(this.f677c, i);
        }
    }

    public final int b() {
        int L;
        int N;
        int L2;
        int i = this.f678d;
        if (i != -1) {
            return i;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f675a; i9++) {
            int i10 = this.f676b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 == 1) {
                    ((Long) this.f677c[i9]).getClass();
                    L2 = m.L(i11) + 8;
                } else if (i12 == 2) {
                    L2 = m.J(i11, (g) this.f677c[i9]);
                } else if (i12 == 3) {
                    L = m.L(i11) * 2;
                    N = ((e1) this.f677c[i9]).b();
                } else {
                    if (i12 != 5) {
                        throw new IllegalStateException(a0.b());
                    }
                    ((Integer) this.f677c[i9]).getClass();
                    L2 = m.L(i11) + 4;
                }
                i8 = L2 + i8;
            } else {
                long longValue = ((Long) this.f677c[i9]).longValue();
                L = m.L(i11);
                N = m.N(longValue);
            }
            i8 = N + L + i8;
        }
        this.f678d = i8;
        return i8;
    }

    public final void c(int i, Object obj) {
        if (!this.f679e) {
            throw new UnsupportedOperationException();
        }
        a(this.f675a + 1);
        int[] iArr = this.f676b;
        int i8 = this.f675a;
        iArr[i8] = i;
        this.f677c[i8] = obj;
        this.f675a = i8 + 1;
    }

    public final void d(g0 g0Var) {
        if (this.f675a == 0) {
            return;
        }
        g0Var.getClass();
        m mVar = (m) g0Var.f687a;
        for (int i = 0; i < this.f675a; i++) {
            int i8 = this.f676b[i];
            Object obj = this.f677c[i];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 == 0) {
                mVar.h0(i9, ((Long) obj).longValue());
            } else if (i10 == 1) {
                mVar.X(i9, ((Long) obj).longValue());
            } else if (i10 == 2) {
                mVar.T(i9, (g) obj);
            } else if (i10 == 3) {
                mVar.e0(i9, 3);
                ((e1) obj).d(g0Var);
                mVar.e0(i9, 4);
            } else {
                if (i10 != 5) {
                    throw new RuntimeException(a0.b());
                }
                mVar.V(i9, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        int i = this.f675a;
        if (i == e1Var.f675a) {
            int[] iArr = this.f676b;
            int[] iArr2 = e1Var.f676b;
            int i8 = 0;
            while (true) {
                if (i8 >= i) {
                    Object[] objArr = this.f677c;
                    Object[] objArr2 = e1Var.f677c;
                    int i9 = this.f675a;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (objArr[i10].equals(objArr2[i10])) {
                        }
                    }
                    return true;
                }
                if (iArr[i8] != iArr2[i8]) {
                    break;
                }
                i8++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f675a;
        int i8 = (527 + i) * 31;
        int[] iArr = this.f676b;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = (i8 + i10) * 31;
        Object[] objArr = this.f677c;
        int i13 = this.f675a;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }
}
