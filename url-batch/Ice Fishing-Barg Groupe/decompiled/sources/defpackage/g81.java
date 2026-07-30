package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class g81 {
    public long[] PxuCJdSBwIXG;
    public int lS5Rgt96tfkO;

    public g81(int i) {
        this.PxuCJdSBwIXG = i == 0 ? o31.PxuCJdSBwIXG : new long[i];
    }

    public final void PxuCJdSBwIXG(long j) {
        int i = this.lS5Rgt96tfkO + 1;
        long[] jArr = this.PxuCJdSBwIXG;
        if (jArr.length < i) {
            this.PxuCJdSBwIXG = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.PxuCJdSBwIXG;
        int i2 = this.lS5Rgt96tfkO;
        jArr2[i2] = j;
        this.lS5Rgt96tfkO = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g81) {
            g81 g81Var = (g81) obj;
            int i = g81Var.lS5Rgt96tfkO;
            int i2 = this.lS5Rgt96tfkO;
            if (i == i2) {
                long[] jArr = this.PxuCJdSBwIXG;
                long[] jArr2 = g81Var.PxuCJdSBwIXG;
                br0 nLZGh9p8gVSu = ng0.nLZGh9p8gVSu(0, i2);
                int i3 = nLZGh9p8gVSu.rtx2ld2ELZv4;
                int i4 = nLZGh9p8gVSu.OPXfSBeufaJ8;
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
        long[] jArr = this.PxuCJdSBwIXG;
        int i = this.lS5Rgt96tfkO;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Long.hashCode(jArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.PxuCJdSBwIXG;
        int i = this.lS5Rgt96tfkO;
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

    public /* synthetic */ g81() {
        this(16);
    }
}
