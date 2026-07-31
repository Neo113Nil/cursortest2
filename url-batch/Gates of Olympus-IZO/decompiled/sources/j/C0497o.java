package j;

import H2.AbstractC0080b;
import e2.AbstractC0381e;
import e2.C0380d;
import java.util.Arrays;

/* renamed from: j.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0497o {

    /* renamed from: a, reason: collision with root package name */
    public int[] f5182a;

    /* renamed from: b, reason: collision with root package name */
    public int f5183b;

    public C0497o(int i3) {
        this.f5182a = i3 == 0 ? AbstractC0492j.f5167a : new int[i3];
    }

    public final void a(int i3) {
        int i4 = this.f5183b + 1;
        int[] iArr = this.f5182a;
        if (iArr.length < i4) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i4, (iArr.length * 3) / 2));
            Z1.i.e(copyOf, "copyOf(this, newSize)");
            this.f5182a = copyOf;
        }
        int[] iArr2 = this.f5182a;
        int i5 = this.f5183b;
        iArr2[i5] = i3;
        this.f5183b = i5 + 1;
    }

    public final int b(int i3) {
        if (i3 >= 0 && i3 < this.f5183b) {
            return this.f5182a[i3];
        }
        StringBuilder l3 = AbstractC0080b.l("Index ", i3, " must be in 0..");
        l3.append(this.f5183b - 1);
        throw new IndexOutOfBoundsException(l3.toString());
    }

    public final int c(int i3) {
        int i4;
        if (i3 < 0 || i3 >= (i4 = this.f5183b)) {
            StringBuilder l3 = AbstractC0080b.l("Index ", i3, " must be in 0..");
            l3.append(this.f5183b - 1);
            throw new IndexOutOfBoundsException(l3.toString());
        }
        int[] iArr = this.f5182a;
        int i5 = iArr[i3];
        if (i3 != i4 - 1) {
            M1.k.W(iArr, iArr, i3, i3 + 1, i4);
        }
        this.f5183b--;
        return i5;
    }

    public final void d(int i3, int i4) {
        if (i3 < 0 || i3 >= this.f5183b) {
            StringBuilder l3 = AbstractC0080b.l("set index ", i3, " must be between 0 .. ");
            l3.append(this.f5183b - 1);
            throw new IndexOutOfBoundsException(l3.toString());
        }
        int[] iArr = this.f5182a;
        int i5 = iArr[i3];
        iArr[i3] = i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0497o) {
            C0497o c0497o = (C0497o) obj;
            int i3 = c0497o.f5183b;
            int i4 = this.f5183b;
            if (i3 == i4) {
                int[] iArr = this.f5182a;
                int[] iArr2 = c0497o.f5182a;
                C0380d Q2 = AbstractC0381e.Q(0, i4);
                int i5 = Q2.f4768d;
                int i6 = Q2.f4769e;
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
        int[] iArr = this.f5182a;
        int i3 = this.f5183b;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += Integer.hashCode(iArr[i5]) * 31;
        }
        return i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f5182a;
        int i3 = this.f5183b;
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
        Z1.i.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ C0497o() {
        this(16);
    }
}
