package i;

import A.AbstractC0017m;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import z2.C1436t;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int[] f6938a;

    /* renamed from: b, reason: collision with root package name */
    public int f6939b;

    public p(int i2) {
        this.f6938a = i2 == 0 ? k.f6923a : new int[i2];
    }

    public final void a(int i2) {
        b(this.f6939b + 1);
        int[] iArr = this.f6938a;
        int i4 = this.f6939b;
        iArr[i4] = i2;
        this.f6939b = i4 + 1;
    }

    public final void b(int i2) {
        int[] iArr = this.f6938a;
        if (iArr.length < i2) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f6938a = copyOf;
        }
    }

    public final int c(int i2) {
        if (i2 >= 0 && i2 < this.f6939b) {
            return this.f6938a[i2];
        }
        StringBuilder o4 = AbstractC0017m.o(i2, "Index ", " must be in 0..");
        o4.append(this.f6939b - 1);
        throw new IndexOutOfBoundsException(o4.toString());
    }

    public final int d(int i2) {
        int i4;
        if (i2 < 0 || i2 >= (i4 = this.f6939b)) {
            StringBuilder o4 = AbstractC0017m.o(i2, "Index ", " must be in 0..");
            o4.append(this.f6939b - 1);
            throw new IndexOutOfBoundsException(o4.toString());
        }
        int[] iArr = this.f6938a;
        int i5 = iArr[i2];
        if (i2 != i4 - 1) {
            C1436t.e(iArr, iArr, i2, i2 + 1, i4);
        }
        this.f6939b--;
        return i5;
    }

    public final void e(int i2, int i4) {
        if (i2 < 0 || i2 >= this.f6939b) {
            StringBuilder o4 = AbstractC0017m.o(i2, "set index ", " must be between 0 .. ");
            o4.append(this.f6939b - 1);
            throw new IndexOutOfBoundsException(o4.toString());
        }
        int[] iArr = this.f6938a;
        int i5 = iArr[i2];
        iArr[i2] = i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            int i2 = pVar.f6939b;
            int i4 = this.f6939b;
            if (i2 == i4) {
                int[] iArr = this.f6938a;
                int[] iArr2 = pVar.f6938a;
                IntRange h4 = kotlin.ranges.b.h(0, i4);
                int i5 = h4.f7505d;
                int i6 = h4.f7506e;
                if (i5 > i6) {
                    return true;
                }
                while (iArr[i5] == iArr2[i5]) {
                    if (i5 == i6) {
                        return true;
                    }
                    i5++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f6938a;
        int i2 = this.f6939b;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += Integer.hashCode(iArr[i5]) * 31;
        }
        return i4;
    }

    public final String toString() {
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f6938a;
        int i2 = this.f6939b;
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                sb.append((CharSequence) "]");
                break;
            }
            int i5 = iArr[i4];
            if (i4 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i4 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i5);
            i4++;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ p() {
        this(16);
    }
}
