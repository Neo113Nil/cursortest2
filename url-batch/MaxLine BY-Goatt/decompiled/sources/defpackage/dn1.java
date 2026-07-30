package defpackage;

import java.util.Arrays;
import kotlin.ranges.IntRange;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dn1 {
    public long[] a;
    public int b;

    public dn1(int i) {
        this.a = i == 0 ? lg1.a : new long[i];
    }

    public final void a(long j) {
        int i = this.b + 1;
        long[] jArr = this.a;
        if (jArr.length < i) {
            this.a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.a;
        int i2 = this.b;
        jArr2[i2] = j;
        this.b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dn1) {
            dn1 dn1Var = (dn1) obj;
            int i = dn1Var.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = dn1Var.a;
                IntRange f = d.f(0, i2);
                int i3 = f.m;
                int i4 = f.n;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
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

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Long.hashCode(jArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }
}
