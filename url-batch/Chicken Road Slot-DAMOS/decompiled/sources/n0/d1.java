package n0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6657a;

    public d1(String str) {
        this.f6657a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && this.f6657a.equals(((d1) obj).f6657a);
    }

    public final int hashCode() {
        return this.f6657a.hashCode();
    }

    public final String toString() {
        return l.h(new StringBuilder("OpaqueKey(key="), this.f6657a, ')');
    }
}
