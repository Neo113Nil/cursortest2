package h6;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f4477a;

    public b(Integer num) {
        this.f4477a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f4477a.equals(((b) obj).f4477a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4477a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f4477a + "}";
    }
}
