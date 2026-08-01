package s;

import java.util.Arrays;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public int[] f8389a;

    /* renamed from: b, reason: collision with root package name */
    public int f8390b;

    public v(int i3) {
        this.f8389a = i3 == 0 ? m.f8345a : new int[i3];
    }

    public final void a(int i3) {
        int i10 = this.f8390b + 1;
        int[] iArr = this.f8389a;
        if (iArr.length < i10) {
            this.f8389a = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
        }
        int[] iArr2 = this.f8389a;
        int i11 = this.f8390b;
        iArr2[i11] = i3;
        this.f8390b = i11 + 1;
    }

    public final int b(int i3) {
        if (i3 >= 0 && i3 < this.f8390b) {
            return this.f8389a[i3];
        }
        kotlin.collections.i0.g("Index must be between 0 and size");
        return 0;
    }

    public final void c(int i3) {
        int i10;
        if (i3 < 0 || i3 >= (i10 = this.f8390b)) {
            kotlin.collections.i0.g("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.f8389a;
        int i11 = iArr[i3];
        if (i3 != i10 - 1) {
            kotlin.collections.v.c(i3, i3 + 1, i10, iArr, iArr);
        }
        this.f8390b--;
    }

    public final void d(int i3, int i10) {
        if (i3 < 0 || i3 >= this.f8390b) {
            kotlin.collections.i0.g("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.f8389a;
        int i11 = iArr[i3];
        iArr[i3] = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            int i3 = vVar.f8390b;
            int i10 = this.f8390b;
            if (i3 == i10) {
                int[] iArr = this.f8389a;
                int[] iArr2 = vVar.f8389a;
                IntRange f3 = be.f.f(0, i10);
                int i11 = f3.f5599d;
                int i12 = f3.f5600e;
                if (i11 > i12) {
                    return true;
                }
                while (iArr[i11] == iArr2[i11]) {
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
        int[] iArr = this.f8389a;
        int i3 = this.f8390b;
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            i10 += Integer.hashCode(iArr[i11]) * 31;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f8389a;
        int i3 = this.f8390b;
        int i10 = 0;
        while (true) {
            if (i10 >= i3) {
                sb2.append((CharSequence) "]");
                break;
            }
            int i11 = iArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(i11);
            i10++;
        }
        return sb2.toString();
    }

    public /* synthetic */ v() {
        this(16);
    }
}
