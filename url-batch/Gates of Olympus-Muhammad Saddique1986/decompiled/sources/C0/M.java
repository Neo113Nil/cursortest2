package C0;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final String f575a;

    public M(String str) {
        this.f575a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof M) {
            return f2.j.a(this.f575a, ((M) obj).f575a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f575a.hashCode();
    }

    public final String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f575a + ')';
    }
}
