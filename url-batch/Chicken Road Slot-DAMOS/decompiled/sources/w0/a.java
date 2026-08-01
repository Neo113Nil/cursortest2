package w0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f10001a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f10001a == ((a) obj).f10001a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10001a);
    }

    public final String toString() {
        return v4.a.m(new StringBuilder("DeltaCounter(count="), this.f10001a, ')');
    }
}
