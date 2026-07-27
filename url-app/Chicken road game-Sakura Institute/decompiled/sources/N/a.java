package N;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f3611a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f3611a == ((a) obj).f3611a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3611a);
    }

    public final String toString() {
        return AbstractC0017m.l(new StringBuilder("DeltaCounter(count="), this.f3611a, ')');
    }
}
