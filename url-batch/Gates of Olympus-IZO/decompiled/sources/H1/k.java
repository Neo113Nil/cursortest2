package H1;

/* loaded from: classes.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final String f1878a;

    public k(String str) {
        Z1.i.f(str, "jointId");
        this.f1878a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Z1.i.a(this.f1878a, ((k) obj).f1878a);
    }

    public final int hashCode() {
        return this.f1878a.hashCode();
    }

    public final String toString() {
        return "ToggleSaved(jointId=" + this.f1878a + ")";
    }
}
