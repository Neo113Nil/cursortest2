package e5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final t f2785a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2786b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2787c;

    public l(int i7, int i8, Class cls) {
        this(t.a(cls), i7, i8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f2785a.equals(lVar.f2785a) && this.f2786b == lVar.f2786b && this.f2787c == lVar.f2787c;
    }

    public final int hashCode() {
        return ((((this.f2785a.hashCode() ^ 1000003) * 1000003) ^ this.f2786b) * 1000003) ^ this.f2787c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f2785a);
        sb.append(", type=");
        int i7 = this.f2786b;
        sb.append(i7 == 1 ? "required" : i7 == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i8 = this.f2787c;
        if (i8 == 0) {
            str = "direct";
        } else if (i8 == 1) {
            str = "provider";
        } else {
            if (i8 != 2) {
                throw new AssertionError(a0.m.i("Unsupported injection: ", i8));
            }
            str = "deferred";
        }
        return a0.m.m(sb, str, "}");
    }

    public l(t tVar, int i7, int i8) {
        this.f2785a = tVar;
        this.f2786b = i7;
        this.f2787c = i8;
    }
}
