package defpackage;

import java.util.Arrays;
import kotlin.ranges.IntRange;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ym1 {
    public int[] a;
    public int b;

    public ym1(int i) {
        this.a = i == 0 ? w31.a : new int[i];
    }

    public final void a(int i) {
        b(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            this.a = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    public final int c(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        a.c("Index must be between 0 and size");
        return 0;
    }

    public final int d() {
        int i = this.b;
        if (i != 0) {
            return this.a[i - 1];
        }
        ch2.k("IntList is empty.");
        return 0;
    }

    public final void e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            a.c("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            ni.d(i, i + 1, i2, iArr, iArr);
        }
        this.b--;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ym1) {
            ym1 ym1Var = (ym1) obj;
            int i = ym1Var.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = ym1Var.a;
                IntRange f = d.f(0, i2);
                int i3 = f.m;
                int i4 = f.n;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i, int i2) {
        if (i < 0 || i >= this.b) {
            a.c("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Integer.hashCode(iArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ ym1() {
        this(16);
    }
}
