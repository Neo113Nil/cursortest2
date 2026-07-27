package Z1;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final t f4586a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4587b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4588c;

    public k(int i2, int i4, Class cls) {
        this(t.a(cls), i2, i4);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f4586a.equals(kVar.f4586a) && this.f4587b == kVar.f4587b && this.f4588c == kVar.f4588c;
    }

    public final int hashCode() {
        return ((((this.f4586a.hashCode() ^ 1000003) * 1000003) ^ this.f4587b) * 1000003) ^ this.f4588c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f4586a);
        sb.append(", type=");
        int i2 = this.f4587b;
        sb.append(i2 == 1 ? "required" : i2 == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i4 = this.f4588c;
        if (i4 == 0) {
            str = "direct";
        } else if (i4 == 1) {
            str = "provider";
        } else {
            if (i4 != 2) {
                throw new AssertionError(AbstractC0017m.g(i4, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return AbstractC0017m.n(sb, str, "}");
    }

    public k(t tVar, int i2, int i4) {
        this.f4586a = tVar;
        this.f4587b = i2;
        this.f4588c = i4;
    }
}
