package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class co implements Cloneable {
    public int n = 0;
    public int[] m = new int[1];

    public final void a(boolean z) {
        c(this.n + 1);
        if (z) {
            int[] iArr = this.m;
            int i = this.n;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.n++;
    }

    public final void b(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            lh.e("Num bits must be between 0 and 32");
            return;
        }
        c(this.n + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            a(z);
            i2--;
        }
    }

    public final void c(int i) {
        int[] iArr = this.m;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.m = iArr2;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.m.clone();
        int i = this.n;
        co coVar = new co();
        coVar.m = iArr;
        coVar.n = i;
        return coVar;
    }

    public final boolean d(int i) {
        return (this.m[i / 32] & (1 << (i & 31))) != 0;
    }

    public final int e() {
        return (this.n + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof co)) {
            return false;
        }
        co coVar = (co) obj;
        return this.n == coVar.n && Arrays.equals(this.m, coVar.m);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.m) + (this.n * 31);
    }

    public final String toString() {
        int i = this.n;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.n; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(d(i2) ? 'X' : '.');
        }
        return sb.toString();
    }
}
