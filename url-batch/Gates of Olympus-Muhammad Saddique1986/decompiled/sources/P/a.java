package P;

import A.k;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f3912a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f3912a == ((a) obj).f3912a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3912a);
    }

    public final String toString() {
        return k.j(new StringBuilder("DeltaCounter(count="), this.f3912a, ')');
    }
}
