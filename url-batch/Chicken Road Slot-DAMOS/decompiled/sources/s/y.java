package s;

import java.util.Arrays;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8397a;

    /* renamed from: b, reason: collision with root package name */
    public int f8398b;

    public y(int i3) {
        this.f8397a = i3 == 0 ? o.f8350a : new long[i3];
    }

    public final void a(long j) {
        int i3 = this.f8398b + 1;
        long[] jArr = this.f8397a;
        if (jArr.length < i3) {
            this.f8397a = Arrays.copyOf(jArr, Math.max(i3, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.f8397a;
        int i10 = this.f8398b;
        jArr2[i10] = j;
        this.f8398b = i10 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            int i3 = yVar.f8398b;
            int i10 = this.f8398b;
            if (i3 == i10) {
                long[] jArr = this.f8397a;
                long[] jArr2 = yVar.f8397a;
                IntRange f3 = be.f.f(0, i10);
                int i11 = f3.f5599d;
                int i12 = f3.f5600e;
                if (i11 > i12) {
                    return true;
                }
                while (jArr[i11] == jArr2[i11]) {
                    if (i11 == i12) {
                        return true;
                    }
                    i11++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f8397a;
        int i3 = this.f8398b;
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            i10 += Long.hashCode(jArr[i11]) * 31;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        long[] jArr = this.f8397a;
        int i3 = this.f8398b;
        int i10 = 0;
        while (true) {
            if (i10 >= i3) {
                sb2.append((CharSequence) "]");
                break;
            }
            long j = jArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(j);
            i10++;
        }
        return sb2.toString();
    }
}
