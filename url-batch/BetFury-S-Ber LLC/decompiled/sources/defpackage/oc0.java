package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class oc0 extends y9 {
    public final transient byte[][] j;
    public final transient int[] k;

    public oc0(byte[][] bArr, int[] iArr) {
        super(y9.i.f);
        this.j = bArr;
        this.k = iArr;
    }

    @Override // defpackage.y9
    public final int a() {
        return this.k[this.j.length - 1];
    }

    @Override // defpackage.y9
    public final String b() {
        return new y9(j()).b();
    }

    @Override // defpackage.y9
    public final byte[] c() {
        return j();
    }

    @Override // defpackage.y9
    public final byte d(int i) {
        byte[][] bArr = this.j;
        int length = bArr.length - 1;
        int[] iArr = this.k;
        n9.b(iArr[length], i, 1L);
        int N = gk0.N(this, i);
        return bArr[N][(i - (N == 0 ? 0 : iArr[N - 1])) + iArr[bArr.length + N]];
    }

    @Override // defpackage.y9
    public final boolean e(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0 && i <= a() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int N = gk0.N(this, i);
            while (i < i4) {
                int[] iArr = this.k;
                int i5 = N == 0 ? 0 : iArr[N - 1];
                int i6 = iArr[N] - i5;
                byte[][] bArr2 = this.j;
                int i7 = iArr[bArr2.length + N];
                int min = Math.min(i4, i6 + i5) - i;
                int i8 = (i - i5) + i7;
                byte[] bArr3 = bArr2[N];
                bArr3.getClass();
                for (int i9 = 0; i9 < min; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += min;
                i += min;
                N++;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.y9
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y9)) {
            return false;
        }
        y9 y9Var = (y9) obj;
        return y9Var.a() == a() && f(y9Var, a());
    }

    @Override // defpackage.y9
    public final boolean f(y9 y9Var, int i) {
        y9Var.getClass();
        if (a() - i >= 0) {
            int N = gk0.N(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.k;
                int i4 = N == 0 ? 0 : iArr[N - 1];
                int i5 = iArr[N] - i4;
                byte[][] bArr = this.j;
                int i6 = iArr[bArr.length + N];
                int min = Math.min(i, i5 + i4) - i2;
                if (y9Var.e(i3, bArr[N], (i2 - i4) + i6, min)) {
                    i3 += min;
                    i2 += min;
                    N++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.y9
    public final y9 g() {
        return new y9(j()).g();
    }

    @Override // defpackage.y9
    public final int hashCode() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.j;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.k;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.g = i3;
        return i3;
    }

    @Override // defpackage.y9
    public final void i(t9 t9Var, int i) {
        int N = gk0.N(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.k;
            int i3 = N == 0 ? 0 : iArr[N - 1];
            int i4 = iArr[N] - i3;
            byte[][] bArr = this.j;
            int i5 = iArr[bArr.length + N];
            int min = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            kc0 kc0Var = new kc0(bArr[N], i6, i6 + min, true);
            kc0 kc0Var2 = t9Var.f;
            if (kc0Var2 == null) {
                kc0Var.g = kc0Var;
                kc0Var.f = kc0Var;
                t9Var.f = kc0Var;
            } else {
                kc0 kc0Var3 = kc0Var2.g;
                kc0Var3.getClass();
                kc0Var3.b(kc0Var);
            }
            i2 += min;
            N++;
        }
        t9Var.g += i;
    }

    public final byte[] j() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.j;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.k;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            j7.X(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.y9
    public final String toString() {
        return new y9(j()).toString();
    }
}
