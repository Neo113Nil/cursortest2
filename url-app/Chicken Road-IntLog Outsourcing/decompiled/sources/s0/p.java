package s0;

/* loaded from: classes.dex */
public final class p extends q {

    /* renamed from: a, reason: collision with root package name */
    public final g f11790a;

    public p(g gVar) {
        this.f11790a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        return this.f11790a.equals(((p) obj).f11790a);
    }

    public final int hashCode() {
        return this.f11790a.hashCode() + (p.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f11790a + '}';
    }
}
