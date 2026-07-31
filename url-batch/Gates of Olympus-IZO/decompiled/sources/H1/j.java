package H1;

/* loaded from: classes.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final com.gates.olympus.miruv.data.d f1877a;

    public j(com.gates.olympus.miruv.data.d dVar) {
        this.f1877a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f1877a == ((j) obj).f1877a;
    }

    public final int hashCode() {
        com.gates.olympus.miruv.data.d dVar = this.f1877a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }

    public final String toString() {
        return "SetFilter(family=" + this.f1877a + ")";
    }
}
