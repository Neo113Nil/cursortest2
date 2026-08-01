package m2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f6486a;

    public i0(String str) {
        this.f6486a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            return this.f6486a.equals(((i0) obj).f6486a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6486a.hashCode();
    }

    public final String toString() {
        return n0.l.h(new StringBuilder("UrlAnnotation(url="), this.f6486a, ')');
    }
}
