package t0;

import a0.q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f6893a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f6893a == ((a) obj).f6893a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6893a);
    }

    public final String toString() {
        return q.k(new StringBuilder("DeltaCounter(count="), this.f6893a, ')');
    }
}
