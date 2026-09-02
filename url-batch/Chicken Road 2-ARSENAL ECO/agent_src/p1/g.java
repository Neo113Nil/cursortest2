package p1;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final o f5680a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5681b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5682c;

    public g(Class cls, int i7, int i8) {
        this(o.a(cls), i7, i8);
    }

    public static g a(Class cls) {
        return new g(cls, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f5680a.equals(gVar.f5680a) && this.f5681b == gVar.f5681b && this.f5682c == gVar.f5682c;
    }

    public final int hashCode() {
        return ((((this.f5680a.hashCode() ^ 1000003) * 1000003) ^ this.f5681b) * 1000003) ^ this.f5682c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f5680a);
        sb.append(", type=");
        int i7 = this.f5681b;
        sb.append(i7 == 1 ? "required" : i7 == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i8 = this.f5682c;
        if (i8 == 0) {
            str = i3.e.DIRECT_TAG;
        } else if (i8 == 1) {
            str = "provider";
        } else {
            if (i8 != 2) {
                throw new AssertionError(W4.o.c("Unsupported injection: ", i8));
            }
            str = "deferred";
        }
        return N.p.b(sb, str, "}");
    }

    public g(o oVar, int i7, int i8) {
        this.f5680a = oVar;
        this.f5681b = i7;
        this.f5682c = i8;
    }
}
