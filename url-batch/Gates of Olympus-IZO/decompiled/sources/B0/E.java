package B0;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final String f239a;

    public E(String str) {
        this.f239a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E) {
            return Z1.i.a(this.f239a, ((E) obj).f239a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f239a.hashCode();
    }

    public final String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f239a + ')';
    }
}
