package G0;

/* loaded from: classes.dex */
public final class p extends q {

    /* renamed from: a, reason: collision with root package name */
    public final h f821a;

    public p(h hVar) {
        this.f821a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        return this.f821a.equals(((p) obj).f821a);
    }

    public final int hashCode() {
        return this.f821a.hashCode() + (p.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f821a + '}';
    }
}
