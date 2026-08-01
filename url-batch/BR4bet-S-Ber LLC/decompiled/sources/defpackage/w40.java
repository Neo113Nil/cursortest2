package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class w40 extends l9 {
    public final transient byte[][] j;
    public final transient int[] k;

    public w40(byte[][] bArr, int[] iArr) {
        super(l9.i.f);
        this.j = bArr;
        this.k = iArr;
    }

    @Override // defpackage.l9
    public final int a() {
        return this.k[this.j.length - 1];
    }

    @Override // defpackage.l9
    public final String b() {
        return new l9(j()).b();
    }

    @Override // defpackage.l9
    public final byte[] c() {
        return j();
    }

    @Override // defpackage.l9
    public final byte d(int i) {
        byte[][] bArr = this.j;
        int length = bArr.length - 1;
        int[] iArr = this.k;
        b9.g(iArr[length], i, 1L);
        int a0 = la0.a0(this, i);
        return bArr[a0][(i - (a0 == 0 ? 0 : iArr[a0 - 1])) + iArr[bArr.length + a0]];
    }

    @Override // defpackage.l9
    public final boolean e(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0 && i <= a() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int a0 = la0.a0(this, i);
            while (i < i4) {
                int[] iArr = this.k;
                int i5 = a0 == 0 ? 0 : iArr[a0 - 1];
                int i6 = iArr[a0] - i5;
                byte[][] bArr2 = this.j;
                int i7 = iArr[bArr2.length + a0];
                int min = Math.min(i4, i6 + i5) - i;
                int i8 = (i - i5) + i7;
                byte[] bArr3 = bArr2[a0];
                bArr3.getClass();
                for (int i9 = 0; i9 < min; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += min;
                i += min;
                a0++;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.l9
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l9)) {
            return false;
        }
        l9 l9Var = (l9) obj;
        return l9Var.a() == a() && f(l9Var, a());
    }

    @Override // defpackage.l9
    public final boolean f(l9 l9Var, int i) {
        l9Var.getClass();
        if (a() - i >= 0) {
            int a0 = la0.a0(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.k;
                int i4 = a0 == 0 ? 0 : iArr[a0 - 1];
                int i5 = iArr[a0] - i4;
                byte[][] bArr = this.j;
                int i6 = iArr[bArr.length + a0];
                int min = Math.min(i, i5 + i4) - i2;
                if (l9Var.e(i3, bArr[a0], (i2 - i4) + i6, min)) {
                    i3 += min;
                    i2 += min;
                    a0++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.l9
    public final l9 g() {
        return new l9(j()).g();
    }

    @Override // defpackage.l9
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

    @Override // defpackage.l9
    public final void i(h9 h9Var, int i) {
        int a0 = la0.a0(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.k;
            int i3 = a0 == 0 ? 0 : iArr[a0 - 1];
            int i4 = iArr[a0] - i3;
            byte[][] bArr = this.j;
            int i5 = iArr[bArr.length + a0];
            int min = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            u40 u40Var = new u40(bArr[a0], i6, i6 + min, true);
            u40 u40Var2 = h9Var.f;
            if (u40Var2 == null) {
                u40Var.g = u40Var;
                u40Var.f = u40Var;
                h9Var.f = u40Var;
            } else {
                u40 u40Var3 = u40Var2.g;
                u40Var3.getClass();
                u40Var3.b(u40Var);
            }
            i2 += min;
            a0++;
        }
        h9Var.g += i;
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
            a7.Y(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.l9
    public final String toString() {
        return new l9(j()).toString();
    }
}
