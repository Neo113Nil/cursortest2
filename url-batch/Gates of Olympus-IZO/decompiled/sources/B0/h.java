package B0;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final String f266a;

    /* renamed from: b, reason: collision with root package name */
    public final A f267b;

    public h(String str, A a3) {
        this.f266a = str;
        this.f267b = a3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!Z1.i.a(this.f266a, hVar.f266a)) {
            return false;
        }
        if (!Z1.i.a(this.f267b, hVar.f267b)) {
            return false;
        }
        hVar.getClass();
        return Z1.i.a(null, null);
    }

    public final int hashCode() {
        int hashCode = this.f266a.hashCode() * 31;
        A a3 = this.f267b;
        return (hashCode + (a3 != null ? a3.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Url(url=" + this.f266a + ')';
    }
}
