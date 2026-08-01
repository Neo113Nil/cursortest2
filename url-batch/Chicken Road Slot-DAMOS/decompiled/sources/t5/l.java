package t5;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final e f9311a;

    public l(e eVar) {
        this.f9311a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f9311a.equals(((l) obj).f9311a);
    }

    public final int hashCode() {
        return this.f9311a.hashCode() + (l.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f9311a + '}';
    }
}
