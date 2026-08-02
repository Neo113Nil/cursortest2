package T;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f2764b;

    /* renamed from: a, reason: collision with root package name */
    public final v2.I f2765a;

    static {
        v2.G g4 = v2.I.f15571b;
        f2764b = new a0(v2.a0.f15605e);
        W.J.G(0);
    }

    public a0(v2.a0 a0Var) {
        this.f2765a = v2.I.k(a0Var);
    }

    public final boolean a(int i4) {
        int i5 = 0;
        while (true) {
            v2.I i6 = this.f2765a;
            if (i5 >= i6.size()) {
                return false;
            }
            Z z = (Z) i6.get(i5);
            boolean[] zArr = z.f2755e;
            int length = zArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (!zArr[i7]) {
                    i7++;
                } else if (z.f2752b.f2707c == i4) {
                    return true;
                }
            }
            i5++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        return this.f2765a.equals(((a0) obj).f2765a);
    }

    public final int hashCode() {
        return this.f2765a.hashCode();
    }
}
