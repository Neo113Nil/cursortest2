package i;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4768a;

    /* renamed from: b, reason: collision with root package name */
    public int f4769b;

    public o(int i7) {
        this.f4768a = i7 == 0 ? j.f4753a : new int[i7];
    }

    public final void a(int i7) {
        b(this.f4769b + 1);
        int[] iArr = this.f4768a;
        int i8 = this.f4769b;
        iArr[i8] = i7;
        this.f4769b = i8 + 1;
    }

    public final void b(int i7) {
        int[] iArr = this.f4768a;
        if (iArr.length < i7) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i7, (iArr.length * 3) / 2));
            r6.k.e(copyOf, "copyOf(this, newSize)");
            this.f4768a = copyOf;
        }
    }

    public final int c(int i7) {
        if (i7 >= 0 && i7 < this.f4769b) {
            return this.f4768a[i7];
        }
        StringBuilder n8 = a0.m.n(i7, "Index ", " must be in 0..");
        n8.append(this.f4769b - 1);
        throw new IndexOutOfBoundsException(n8.toString());
    }

    public final int d(int i7) {
        int i8;
        if (i7 < 0 || i7 >= (i8 = this.f4769b)) {
            StringBuilder n8 = a0.m.n(i7, "Index ", " must be in 0..");
            n8.append(this.f4769b - 1);
            throw new IndexOutOfBoundsException(n8.toString());
        }
        int[] iArr = this.f4768a;
        int i9 = iArr[i7];
        if (i7 != i8 - 1) {
            e6.k.W(iArr, iArr, i7, i7 + 1, i8);
        }
        this.f4769b--;
        return i9;
    }

    public final void e(int i7, int i8) {
        if (i7 < 0 || i7 >= this.f4769b) {
            StringBuilder n8 = a0.m.n(i7, "set index ", " must be between 0 .. ");
            n8.append(this.f4769b - 1);
            throw new IndexOutOfBoundsException(n8.toString());
        }
        int[] iArr = this.f4768a;
        int i9 = iArr[i7];
        iArr[i7] = i8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            int i7 = oVar.f4769b;
            int i8 = this.f4769b;
            if (i7 == i8) {
                int[] iArr = this.f4768a;
                int[] iArr2 = oVar.f4768a;
                w6.d o2 = v1.g.o(0, i8);
                int i9 = o2.f9521f;
                int i10 = o2.f9522g;
                if (i9 > i10) {
                    return true;
                }
                while (iArr[i9] == iArr2[i9]) {
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
        int[] iArr = this.f4768a;
        int i7 = this.f4769b;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += Integer.hashCode(iArr[i9]) * 31;
        }
        return i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f4768a;
        int i7 = this.f4769b;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                sb.append((CharSequence) "]");
                break;
            }
            int i9 = iArr[i8];
            if (i8 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i8 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i9);
            i8++;
        }
        String sb2 = sb.toString();
        r6.k.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ o() {
        this(16);
    }
}
