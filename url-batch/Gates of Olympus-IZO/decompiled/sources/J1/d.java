package J1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2595a;

    public d(String str) {
        Z1.i.f(str, "jointId");
        this.f2595a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Z1.i.a(this.f2595a, ((d) obj).f2595a);
    }

    public final int hashCode() {
        return this.f2595a.hashCode();
    }

    public final String toString() {
        return "Remove(jointId=" + this.f2595a + ")";
    }
}
