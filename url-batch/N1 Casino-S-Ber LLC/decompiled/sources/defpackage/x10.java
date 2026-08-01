package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class x10 extends y8 {
    public final transient byte[][] j;
    public final transient int[] k;

    public x10(byte[][] bArr, int[] iArr) {
        super(y8.i.f);
        this.j = bArr;
        this.k = iArr;
    }

    @Override // defpackage.y8
    public final int a() {
        return this.k[this.j.length - 1];
    }

    @Override // defpackage.y8
    public final String b() {
        return new y8(j()).b();
    }

    @Override // defpackage.y8
    public final byte[] c() {
        return j();
    }

    @Override // defpackage.y8
    public final byte d(int i) {
        byte[][] bArr = this.j;
        int length = bArr.length - 1;
        int[] iArr = this.k;
        o8.i(iArr[length], i, 1L);
        int O = e70.O(this, i);
        return bArr[O][(i - (O == 0 ? 0 : iArr[O - 1])) + iArr[bArr.length + O]];
    }

    @Override // defpackage.y8
    public final boolean e(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0 && i <= a() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int O = e70.O(this, i);
            while (i < i4) {
                int[] iArr = this.k;
                int i5 = O == 0 ? 0 : iArr[O - 1];
                int i6 = iArr[O] - i5;
                byte[][] bArr2 = this.j;
                int i7 = iArr[bArr2.length + O];
                int min = Math.min(i4, i6 + i5) - i;
                int i8 = (i - i5) + i7;
                byte[] bArr3 = bArr2[O];
                bArr3.getClass();
                for (int i9 = 0; i9 < min; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += min;
                i += min;
                O++;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.y8
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y8)) {
            return false;
        }
        y8 y8Var = (y8) obj;
        return y8Var.a() == a() && f(y8Var, a());
    }

    @Override // defpackage.y8
    public final boolean f(y8 y8Var, int i) {
        y8Var.getClass();
        if (a() - i >= 0) {
            int O = e70.O(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.k;
                int i4 = O == 0 ? 0 : iArr[O - 1];
                int i5 = iArr[O] - i4;
                byte[][] bArr = this.j;
                int i6 = iArr[bArr.length + O];
                int min = Math.min(i, i5 + i4) - i2;
                if (y8Var.e(i3, bArr[O], (i2 - i4) + i6, min)) {
                    i3 += min;
                    i2 += min;
                    O++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.y8
    public final y8 g() {
        return new y8(j()).g();
    }

    @Override // defpackage.y8
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

    @Override // defpackage.y8
    public final void i(u8 u8Var, int i) {
        int O = e70.O(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.k;
            int i3 = O == 0 ? 0 : iArr[O - 1];
            int i4 = iArr[O] - i3;
            byte[][] bArr = this.j;
            int i5 = iArr[bArr.length + O];
            int min = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            v10 v10Var = new v10(bArr[O], i6, i6 + min, true);
            v10 v10Var2 = u8Var.f;
            if (v10Var2 == null) {
                v10Var.g = v10Var;
                v10Var.f = v10Var;
                u8Var.f = v10Var;
            } else {
                v10 v10Var3 = v10Var2.g;
                v10Var3.getClass();
                v10Var3.b(v10Var);
            }
            i2 += min;
            O++;
        }
        u8Var.g += i;
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
            q6.c0(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.y8
    public final String toString() {
        return new y8(j()).toString();
    }
}
