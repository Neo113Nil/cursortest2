package j;

import java.util.Arrays;
import k2.C0572d;

/* renamed from: j.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0541o {

    /* renamed from: a, reason: collision with root package name */
    public int[] f6300a;

    /* renamed from: b, reason: collision with root package name */
    public int f6301b;

    public C0541o(int i3) {
        this.f6300a = i3 == 0 ? AbstractC0536j.f6285a : new int[i3];
    }

    public final void a(int i3) {
        b(this.f6301b + 1);
        int[] iArr = this.f6300a;
        int i4 = this.f6301b;
        iArr[i4] = i3;
        this.f6301b = i4 + 1;
    }

    public final void b(int i3) {
        int[] iArr = this.f6300a;
        if (iArr.length < i3) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i3, (iArr.length * 3) / 2));
            f2.j.e(copyOf, "copyOf(this, newSize)");
            this.f6300a = copyOf;
        }
    }

    public final int c(int i3) {
        if (i3 >= 0 && i3 < this.f6301b) {
            return this.f6300a[i3];
        }
        StringBuilder k3 = A.k.k(i3, "Index ", " must be in 0..");
        k3.append(this.f6301b - 1);
        throw new IndexOutOfBoundsException(k3.toString());
    }

    public final int d(int i3) {
        int i4;
        if (i3 < 0 || i3 >= (i4 = this.f6301b)) {
            StringBuilder k3 = A.k.k(i3, "Index ", " must be in 0..");
            k3.append(this.f6301b - 1);
            throw new IndexOutOfBoundsException(k3.toString());
        }
        int[] iArr = this.f6300a;
        int i5 = iArr[i3];
        if (i3 != i4 - 1) {
            S1.k.l0(iArr, iArr, i3, i3 + 1, i4);
        }
        this.f6301b--;
        return i5;
    }

    public final void e(int i3, int i4) {
        if (i3 < 0 || i3 >= this.f6301b) {
            StringBuilder k3 = A.k.k(i3, "set index ", " must be between 0 .. ");
            k3.append(this.f6301b - 1);
            throw new IndexOutOfBoundsException(k3.toString());
        }
        int[] iArr = this.f6300a;
        int i5 = iArr[i3];
        iArr[i3] = i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0541o) {
            C0541o c0541o = (C0541o) obj;
            int i3 = c0541o.f6301b;
            int i4 = this.f6301b;
            if (i3 == i4) {
                int[] iArr = this.f6300a;
                int[] iArr2 = c0541o.f6300a;
                C0572d g02 = O2.d.g0(0, i4);
                int i5 = g02.f6419d;
                int i6 = g02.f6420e;
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
        int[] iArr = this.f6300a;
        int i3 = this.f6301b;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += Integer.hashCode(iArr[i5]) * 31;
        }
        return i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f6300a;
        int i3 = this.f6301b;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
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
        f2.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ C0541o() {
        this(16);
    }
}
