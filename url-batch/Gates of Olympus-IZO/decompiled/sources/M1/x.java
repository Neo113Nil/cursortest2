package M1;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f2806a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2807b;

    public x(int i3, Object obj) {
        this.f2806a = i3;
        this.f2807b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f2806a == xVar.f2806a && Z1.i.a(this.f2807b, xVar.f2807b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f2806a) * 31;
        Object obj = this.f2807b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f2806a + ", value=" + this.f2807b + ')';
    }
}
