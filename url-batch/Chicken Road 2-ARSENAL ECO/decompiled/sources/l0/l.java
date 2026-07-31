package l0;

/* loaded from: classes.dex */
public final class l extends o {

    /* renamed from: a, reason: collision with root package name */
    public final g f5279a = g.f5270c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f5279a.equals(((l) obj).f5279a);
    }

    public final int hashCode() {
        return this.f5279a.hashCode() + (l.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f5279a + '}';
    }
}
