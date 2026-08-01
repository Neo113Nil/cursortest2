package x1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f10253a;

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f10253a == ((d) obj).f10253a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10253a);
    }

    public final String toString() {
        return "IndirectPointerEventData(packedValue=" + this.f10253a + ')';
    }
}
