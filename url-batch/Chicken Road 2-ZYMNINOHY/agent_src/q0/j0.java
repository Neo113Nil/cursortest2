package q0;

import W.AbstractC0108a;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final j0 f15033d = new j0(new T.U[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f15034a;

    /* renamed from: b, reason: collision with root package name */
    public final v2.a0 f15035b;

    /* renamed from: c, reason: collision with root package name */
    public int f15036c;

    static {
        W.J.G(0);
    }

    public j0(T.U... uArr) {
        v2.a0 l4 = v2.I.l(uArr);
        this.f15035b = l4;
        this.f15034a = uArr.length;
        int i4 = 0;
        while (i4 < l4.f15607d) {
            int i5 = i4 + 1;
            for (int i6 = i5; i6 < l4.f15607d; i6++) {
                if (((T.U) l4.get(i4)).equals(l4.get(i6))) {
                    AbstractC0108a.f("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i4 = i5;
        }
    }

    public final T.U a(int i4) {
        return (T.U) this.f15035b.get(i4);
    }

    public final int b(T.U u4) {
        int indexOf = this.f15035b.indexOf(u4);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j0.class != obj.getClass()) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f15034a == j0Var.f15034a && this.f15035b.equals(j0Var.f15035b);
    }

    public final int hashCode() {
        if (this.f15036c == 0) {
            this.f15036c = this.f15035b.hashCode();
        }
        return this.f15036c;
    }

    public final String toString() {
        return this.f15035b.toString();
    }
}
