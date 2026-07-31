package l0;

/* loaded from: classes.dex */
public final class n extends o {

    /* renamed from: a, reason: collision with root package name */
    public final g f5280a;

    public n(g gVar) {
        this.f5280a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        return this.f5280a.equals(((n) obj).f5280a);
    }

    public final int hashCode() {
        return this.f5280a.hashCode() + (n.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f5280a + '}';
    }
}
