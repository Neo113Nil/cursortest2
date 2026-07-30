package G0;

/* loaded from: classes.dex */
public final class n extends q {

    /* renamed from: a, reason: collision with root package name */
    public final h f820a = h.f809c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        return this.f820a.equals(((n) obj).f820a);
    }

    public final int hashCode() {
        return this.f820a.hashCode() + (n.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f820a + '}';
    }
}
