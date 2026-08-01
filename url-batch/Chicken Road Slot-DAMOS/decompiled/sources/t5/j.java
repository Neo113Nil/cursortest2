package t5;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends m {

    /* renamed from: a, reason: collision with root package name */
    public final e f9310a = e.f9301c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return this.f9310a.equals(((j) obj).f9310a);
    }

    public final int hashCode() {
        return this.f9310a.hashCode() + (j.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f9310a + '}';
    }
}
