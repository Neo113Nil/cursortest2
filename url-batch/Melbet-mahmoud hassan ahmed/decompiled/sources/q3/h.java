package q3;

/* loaded from: classes.dex */
public final class h<L> {

    /* renamed from: a, reason: collision with root package name */
    private final L f20271a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20272b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f20271a == hVar.f20271a && this.f20272b.equals(hVar.f20272b);
    }

    public int hashCode() {
        return (System.identityHashCode(this.f20271a) * 31) + this.f20272b.hashCode();
    }
}
