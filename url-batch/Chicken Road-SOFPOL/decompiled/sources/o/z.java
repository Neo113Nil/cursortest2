package o;

import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public long[] f5569a;

    /* renamed from: b, reason: collision with root package name */
    public int f5570b;

    public z(int i) {
        this.f5569a = i == 0 ? p.f5517a : new long[i];
    }

    public final void a(long j7) {
        int i = this.f5570b + 1;
        long[] jArr = this.f5569a;
        if (jArr.length < i) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
            q6.i.d(copyOf, "copyOf(...)");
            this.f5569a = copyOf;
        }
        long[] jArr2 = this.f5569a;
        int i8 = this.f5570b;
        jArr2[i8] = j7;
        this.f5570b = i8 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            int i = zVar.f5570b;
            int i8 = this.f5570b;
            if (i == i8) {
                long[] jArr = this.f5569a;
                long[] jArr2 = zVar.f5569a;
                v6.d u02 = r2.o.u0(0, i8);
                int i9 = u02.f7492d;
                int i10 = u02.f7493e;
                if (i9 > i10) {
                    return true;
                }
                while (jArr[i9] == jArr2[i9]) {
                    if (i9 == i10) {
                        return true;
                    }
                    i9++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f5569a;
        int i = this.f5570b;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            i8 += Long.hashCode(jArr[i9]) * 31;
        }
        return i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f5569a;
        int i = this.f5570b;
        int i8 = 0;
        while (true) {
            if (i8 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            long j7 = jArr[i8];
            if (i8 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i8 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j7);
            i8++;
        }
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }
}
