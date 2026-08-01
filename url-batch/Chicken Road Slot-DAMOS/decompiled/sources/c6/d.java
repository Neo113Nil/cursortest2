package c6;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f1811a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f1812b;

    public d(String str, Long l10) {
        this.f1811a = str;
        this.f1812b = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f1811a.equals(dVar.f1811a) && this.f1812b.equals(dVar.f1812b);
    }

    public final int hashCode() {
        return this.f1812b.hashCode() + (this.f1811a.hashCode() * 31);
    }

    public final String toString() {
        return "Preference(key=" + this.f1811a + ", value=" + this.f1812b + ')';
    }
}
