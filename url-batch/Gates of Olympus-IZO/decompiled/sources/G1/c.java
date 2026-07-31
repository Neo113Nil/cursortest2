package G1;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f1541a;

    public c(String str) {
        Z1.i.f(str, "jointId");
        this.f1541a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Z1.i.a(this.f1541a, ((c) obj).f1541a);
    }

    public final int hashCode() {
        return this.f1541a.hashCode();
    }

    public final String toString() {
        return "Answer(jointId=" + this.f1541a + ")";
    }
}
