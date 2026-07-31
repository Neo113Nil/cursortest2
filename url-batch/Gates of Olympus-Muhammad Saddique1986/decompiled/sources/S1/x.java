package S1;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f4323a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4324b;

    public x(int i3, Object obj) {
        this.f4323a = i3;
        this.f4324b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f4323a == xVar.f4323a && f2.j.a(this.f4324b, xVar.f4324b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f4323a) * 31;
        Object obj = this.f4324b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f4323a + ", value=" + this.f4324b + ')';
    }
}
