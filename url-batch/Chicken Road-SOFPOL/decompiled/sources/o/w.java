package o;

import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public int[] f5559a;

    /* renamed from: b, reason: collision with root package name */
    public int f5560b;

    public w(int i) {
        this.f5559a = i == 0 ? n.f5513a : new int[i];
    }

    public final void a(int i) {
        int i8 = this.f5560b + 1;
        int[] iArr = this.f5559a;
        if (iArr.length < i8) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i8, (iArr.length * 3) / 2));
            q6.i.d(copyOf, "copyOf(...)");
            this.f5559a = copyOf;
        }
        int[] iArr2 = this.f5559a;
        int i9 = this.f5560b;
        iArr2[i9] = i;
        this.f5560b = i9 + 1;
    }

    public final int b(int i) {
        if (i >= 0 && i < this.f5560b) {
            return this.f5559a[i];
        }
        p.a.d("Index must be between 0 and size");
        throw null;
    }

    public final void c(int i) {
        int i8;
        if (i < 0 || i >= (i8 = this.f5560b)) {
            p.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f5559a;
        int i9 = iArr[i];
        if (i != i8 - 1) {
            d6.l.F(i, i + 1, i8, iArr, iArr);
        }
        this.f5560b--;
    }

    public final void d(int i, int i8) {
        if (i < 0 || i >= this.f5560b) {
            p.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f5559a;
        int i9 = iArr[i];
        iArr[i] = i8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            int i = wVar.f5560b;
            int i8 = this.f5560b;
            if (i == i8) {
                int[] iArr = this.f5559a;
                int[] iArr2 = wVar.f5559a;
                v6.d u02 = r2.o.u0(0, i8);
                int i9 = u02.f7492d;
                int i10 = u02.f7493e;
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
        int[] iArr = this.f5559a;
        int i = this.f5560b;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            i8 += Integer.hashCode(iArr[i9]) * 31;
        }
        return i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f5559a;
        int i = this.f5560b;
        int i8 = 0;
        while (true) {
            if (i8 >= i) {
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
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ w() {
        this(16);
    }
}
