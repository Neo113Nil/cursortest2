package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class eo implements Cloneable {
    public final int m;
    public final int n;
    public final int o;
    public final int[] p;

    public eo(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            lh.e("Both dimensions must be greater than 0");
            throw null;
        }
        this.m = i;
        this.n = i2;
        int i3 = (i + 31) / 32;
        this.o = i3;
        this.p = new int[i3 * i2];
    }

    public final boolean a(int i, int i2) {
        return ((this.p[(i / 32) + (i2 * this.o)] >>> (i & 31)) & 1) != 0;
    }

    public final void b(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.o);
        int[] iArr = this.p;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public final void c(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            lh.e("Left and top must be nonnegative");
            return;
        }
        if (i4 <= 0 || i3 <= 0) {
            lh.e("Height and width must be at least 1");
            return;
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.n || i5 > this.m) {
            lh.e("The region must fit inside the matrix");
            return;
        }
        while (i2 < i6) {
            int i7 = this.o * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int i9 = (i8 / 32) + i7;
                int[] iArr = this.p;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final Object clone() {
        return new eo(this.m, this.n, this.o, (int[]) this.p.clone());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eo)) {
            return false;
        }
        eo eoVar = (eo) obj;
        return this.m == eoVar.m && this.n == eoVar.n && this.o == eoVar.o && Arrays.equals(this.p, eoVar.p);
    }

    public final int hashCode() {
        int i = this.m;
        return Arrays.hashCode(this.p) + (((((((i * 31) + i) * 31) + this.n) * 31) + this.o) * 31);
    }

    public final String toString() {
        int i = this.m;
        int i2 = this.n;
        StringBuilder sb = new StringBuilder((i + 1) * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                sb.append(a(i4, i3) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public eo(int i, int i2, int i3, int[] iArr) {
        this.m = i;
        this.n = i2;
        this.o = i3;
        this.p = iArr;
    }
}
