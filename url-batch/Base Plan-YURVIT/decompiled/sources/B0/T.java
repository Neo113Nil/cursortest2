package B0;

import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final String f65a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f66b;

    public T(String str, Q q2) {
        this.f65a = str;
        this.f66b = q2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof T)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        T t = (T) obj;
        return AbstractC0086a.n(E0.g.O(this.f65a, this.f66b), E0.g.O(t.f65a, t.f66b));
    }

    public final int hashCode() {
        return E0.g.O(this.f65a, this.f66b).hashCode();
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f65a + ", type=" + this.f66b + ")";
    }
}
