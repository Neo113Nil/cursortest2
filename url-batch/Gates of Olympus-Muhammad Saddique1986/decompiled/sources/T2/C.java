package T2;

/* loaded from: classes.dex */
public final class C extends C0234i {

    /* renamed from: h, reason: collision with root package name */
    public final transient byte[][] f4382h;

    /* renamed from: i, reason: collision with root package name */
    public final transient int[] f4383i;

    public C(byte[][] bArr, int[] iArr) {
        super(C0234i.f4410g.f4411d);
        this.f4382h = bArr;
        this.f4383i = iArr;
    }

    @Override // T2.C0234i
    public final int b() {
        return this.f4383i[this.f4382h.length - 1];
    }

    @Override // T2.C0234i
    public final String c() {
        return r().c();
    }

    @Override // T2.C0234i
    public final int d(int i3, byte[] bArr) {
        f2.j.f(bArr, "other");
        return r().d(i3, bArr);
    }

    @Override // T2.C0234i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0234i) {
            C0234i c0234i = (C0234i) obj;
            if (c0234i.b() == b() && j(0, c0234i, b())) {
                return true;
            }
        }
        return false;
    }

    @Override // T2.C0234i
    public final byte[] f() {
        return q();
    }

    @Override // T2.C0234i
    public final byte g(int i3) {
        byte[][] bArr = this.f4382h;
        int length = bArr.length - 1;
        int[] iArr = this.f4383i;
        O2.l.R(iArr[length], i3, 1L);
        int g3 = U2.b.g(this, i3);
        return bArr[g3][(i3 - (g3 == 0 ? 0 : iArr[g3 - 1])) + iArr[bArr.length + g3]];
    }

    @Override // T2.C0234i
    public final int h(int i3, byte[] bArr) {
        f2.j.f(bArr, "other");
        return r().h(i3, bArr);
    }

    @Override // T2.C0234i
    public final int hashCode() {
        int i3 = this.f4412e;
        if (i3 != 0) {
            return i3;
        }
        byte[][] bArr = this.f4382h;
        int length = bArr.length;
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (i4 < length) {
            int[] iArr = this.f4383i;
            int i7 = iArr[length + i4];
            int i8 = iArr[i4];
            byte[] bArr2 = bArr[i4];
            int i9 = (i8 - i6) + i7;
            while (i7 < i9) {
                i5 = (i5 * 31) + bArr2[i7];
                i7++;
            }
            i4++;
            i6 = i8;
        }
        this.f4412e = i5;
        return i5;
    }

    @Override // T2.C0234i
    public final boolean j(int i3, C0234i c0234i, int i4) {
        f2.j.f(c0234i, "other");
        if (i3 < 0 || i3 > b() - i4) {
            return false;
        }
        int i5 = i4 + i3;
        int g3 = U2.b.g(this, i3);
        int i6 = 0;
        while (i3 < i5) {
            int[] iArr = this.f4383i;
            int i7 = g3 == 0 ? 0 : iArr[g3 - 1];
            int i8 = iArr[g3] - i7;
            byte[][] bArr = this.f4382h;
            int i9 = iArr[bArr.length + g3];
            int min = Math.min(i5, i8 + i7) - i3;
            if (!c0234i.k(i6, bArr[g3], (i3 - i7) + i9, min)) {
                return false;
            }
            i6 += min;
            i3 += min;
            g3++;
        }
        return true;
    }

    @Override // T2.C0234i
    public final boolean k(int i3, byte[] bArr, int i4, int i5) {
        f2.j.f(bArr, "other");
        if (i3 < 0 || i3 > b() - i5 || i4 < 0 || i4 > bArr.length - i5) {
            return false;
        }
        int i6 = i5 + i3;
        int g3 = U2.b.g(this, i3);
        while (i3 < i6) {
            int[] iArr = this.f4383i;
            int i7 = g3 == 0 ? 0 : iArr[g3 - 1];
            int i8 = iArr[g3] - i7;
            byte[][] bArr2 = this.f4382h;
            int i9 = iArr[bArr2.length + g3];
            int min = Math.min(i6, i8 + i7) - i3;
            if (!O2.l.O((i3 - i7) + i9, i4, min, bArr2[g3], bArr)) {
                return false;
            }
            i4 += min;
            i3 += min;
            g3++;
        }
        return true;
    }

    @Override // T2.C0234i
    public final C0234i l(int i3, int i4) {
        if (i4 == -1234567890) {
            i4 = b();
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(A.k.g(i3, "beginIndex=", " < 0").toString());
        }
        if (i4 > b()) {
            StringBuilder k3 = A.k.k(i4, "endIndex=", " > length(");
            k3.append(b());
            k3.append(')');
            throw new IllegalArgumentException(k3.toString().toString());
        }
        int i5 = i4 - i3;
        if (i5 < 0) {
            throw new IllegalArgumentException(A.k.f(i4, i3, "endIndex=", " < beginIndex=").toString());
        }
        if (i3 == 0 && i4 == b()) {
            return this;
        }
        if (i3 == i4) {
            return C0234i.f4410g;
        }
        int g3 = U2.b.g(this, i3);
        int g4 = U2.b.g(this, i4 - 1);
        byte[][] bArr = this.f4382h;
        byte[][] bArr2 = (byte[][]) S1.k.q0(bArr, g3, g4 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f4383i;
        if (g3 <= g4) {
            int i6 = g3;
            int i7 = 0;
            while (true) {
                iArr[i7] = Math.min(iArr2[i6] - i3, i5);
                int i8 = i7 + 1;
                iArr[i7 + bArr2.length] = iArr2[bArr.length + i6];
                if (i6 == g4) {
                    break;
                }
                i6++;
                i7 = i8;
            }
        }
        int i9 = g3 != 0 ? iArr2[g3 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i3 - i9) + iArr[length];
        return new C(bArr2, iArr);
    }

    @Override // T2.C0234i
    public final C0234i n() {
        return r().n();
    }

    @Override // T2.C0234i
    public final void p(C0231f c0231f, int i3) {
        f2.j.f(c0231f, "buffer");
        int g3 = U2.b.g(this, 0);
        int i4 = 0;
        while (i4 < i3) {
            int[] iArr = this.f4383i;
            int i5 = g3 == 0 ? 0 : iArr[g3 - 1];
            int i6 = iArr[g3] - i5;
            byte[][] bArr = this.f4382h;
            int i7 = iArr[bArr.length + g3];
            int min = Math.min(i3, i6 + i5) - i4;
            int i8 = (i4 - i5) + i7;
            A a3 = new A(bArr[g3], i8, i8 + min, true);
            A a4 = c0231f.f4408d;
            if (a4 == null) {
                a3.f4378g = a3;
                a3.f4377f = a3;
                c0231f.f4408d = a3;
            } else {
                A a5 = a4.f4378g;
                f2.j.c(a5);
                a5.b(a3);
            }
            i4 += min;
            g3++;
        }
        c0231f.f4409e += i3;
    }

    public final byte[] q() {
        byte[] bArr = new byte[b()];
        byte[][] bArr2 = this.f4382h;
        int length = bArr2.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            int[] iArr = this.f4383i;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            int i8 = i7 - i4;
            S1.k.j0(i5, i6, i6 + i8, bArr2[i3], bArr);
            i5 += i8;
            i3++;
            i4 = i7;
        }
        return bArr;
    }

    public final C0234i r() {
        return new C0234i(q());
    }

    @Override // T2.C0234i
    public final String toString() {
        return r().toString();
    }
}
