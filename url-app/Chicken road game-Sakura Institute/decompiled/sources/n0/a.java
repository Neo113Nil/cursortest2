package n0;

import a0.m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f6496a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f6496a == ((a) obj).f6496a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6496a);
    }

    public final String toString() {
        return m.l(new StringBuilder("DeltaCounter(count="), this.f6496a, ')');
    }
}
