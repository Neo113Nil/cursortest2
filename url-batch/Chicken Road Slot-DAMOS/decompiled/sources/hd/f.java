package hd;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final e f4501e = new e(null);

    /* renamed from: i, reason: collision with root package name */
    public static final f f4502i = new f();

    /* renamed from: d, reason: collision with root package name */
    public final int f4503d = 132096;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        fVar.getClass();
        return this.f4503d - fVar.f4503d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        f fVar = obj instanceof f ? (f) obj : null;
        return fVar != null && this.f4503d == fVar.f4503d;
    }

    public final int hashCode() {
        return this.f4503d;
    }

    public final String toString() {
        return "2.4.0";
    }
}
