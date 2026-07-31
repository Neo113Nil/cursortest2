package P;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f3019a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f3019a == ((a) obj).f3019a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3019a);
    }

    public final String toString() {
        return AbstractC0080b.k(new StringBuilder("DeltaCounter(count="), this.f3019a, ')');
    }
}
