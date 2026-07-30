package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f3485f = new c0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f3486a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3487b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f3488c;

    /* renamed from: d, reason: collision with root package name */
    public int f3489d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3490e;

    public c0(int i2, int[] iArr, Object[] objArr, boolean z7) {
        this.f3486a = i2;
        this.f3487b = iArr;
        this.f3488c = objArr;
        this.f3490e = z7;
    }

    public final void a(int i2) {
        int[] iArr = this.f3487b;
        if (i2 > iArr.length) {
            int i5 = this.f3486a;
            int i7 = (i5 / 2) + i5;
            if (i7 >= i2) {
                i2 = i7;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.f3487b = Arrays.copyOf(iArr, i2);
            this.f3488c = Arrays.copyOf(this.f3488c, i2);
        }
    }

    public final int b() {
        int a02;
        int c02;
        int a03;
        int i2 = this.f3489d;
        if (i2 != -1) {
            return i2;
        }
        int i5 = 0;
        for (int i7 = 0; i7 < this.f3486a; i7++) {
            int i8 = this.f3487b[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 != 0) {
                if (i10 == 1) {
                    ((Long) this.f3488c[i7]).getClass();
                    a03 = C0196l.a0(i9) + 8;
                } else if (i10 == 2) {
                    a03 = C0196l.Y(i9, (C0191g) this.f3488c[i7]);
                } else if (i10 == 3) {
                    a02 = C0196l.a0(i9) * 2;
                    c02 = ((c0) this.f3488c[i7]).b();
                } else {
                    if (i10 != 5) {
                        throw new IllegalStateException(C0209z.b());
                    }
                    ((Integer) this.f3488c[i7]).getClass();
                    a03 = C0196l.a0(i9) + 4;
                }
                i5 = a03 + i5;
            } else {
                long longValue = ((Long) this.f3488c[i7]).longValue();
                a02 = C0196l.a0(i9);
                c02 = C0196l.c0(longValue);
            }
            i5 = c02 + a02 + i5;
        }
        this.f3489d = i5;
        return i5;
    }

    public final void c(int i2, Object obj) {
        if (!this.f3490e) {
            throw new UnsupportedOperationException();
        }
        a(this.f3486a + 1);
        int[] iArr = this.f3487b;
        int i5 = this.f3486a;
        iArr[i5] = i2;
        this.f3488c[i5] = obj;
        this.f3486a = i5 + 1;
    }

    public final void d(E e7) {
        if (this.f3486a == 0) {
            return;
        }
        e7.getClass();
        C0196l c0196l = (C0196l) e7.f3424a;
        for (int i2 = 0; i2 < this.f3486a; i2++) {
            int i5 = this.f3487b[i2];
            Object obj = this.f3488c[i2];
            int i7 = i5 >>> 3;
            int i8 = i5 & 7;
            if (i8 == 0) {
                c0196l.w0(((Long) obj).longValue(), i7);
            } else if (i8 == 1) {
                c0196l.m0(((Long) obj).longValue(), i7);
            } else if (i8 == 2) {
                c0196l.i0(i7, (C0191g) obj);
            } else if (i8 == 3) {
                c0196l.t0(i7, 3);
                ((c0) obj).d(e7);
                c0196l.t0(i7, 4);
            } else {
                if (i8 != 5) {
                    throw new RuntimeException(C0209z.b());
                }
                c0196l.k0(i7, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i2 = this.f3486a;
        if (i2 == c0Var.f3486a) {
            int[] iArr = this.f3487b;
            int[] iArr2 = c0Var.f3487b;
            int i5 = 0;
            while (true) {
                if (i5 >= i2) {
                    Object[] objArr = this.f3488c;
                    Object[] objArr2 = c0Var.f3488c;
                    int i7 = this.f3486a;
                    for (int i8 = 0; i8 < i7; i8++) {
                        if (objArr[i8].equals(objArr2[i8])) {
                        }
                    }
                    return true;
                }
                if (iArr[i5] != iArr2[i5]) {
                    break;
                }
                i5++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f3486a;
        int i5 = (527 + i2) * 31;
        int[] iArr = this.f3487b;
        int i7 = 17;
        int i8 = 17;
        for (int i9 = 0; i9 < i2; i9++) {
            i8 = (i8 * 31) + iArr[i9];
        }
        int i10 = (i5 + i8) * 31;
        Object[] objArr = this.f3488c;
        int i11 = this.f3486a;
        for (int i12 = 0; i12 < i11; i12++) {
            i7 = (i7 * 31) + objArr[i12].hashCode();
        }
        return i10 + i7;
    }
}
