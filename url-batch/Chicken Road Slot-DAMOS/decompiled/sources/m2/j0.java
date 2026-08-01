package m2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f6489a;

    public j0(String str) {
        this.f6489a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return this.f6489a.equals(((j0) obj).f6489a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6489a.hashCode();
    }

    public final String toString() {
        return n0.l.h(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f6489a, ')');
    }
}
