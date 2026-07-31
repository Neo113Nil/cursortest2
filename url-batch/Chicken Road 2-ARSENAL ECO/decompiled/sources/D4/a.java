package D4;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f508a;

    /* renamed from: b, reason: collision with root package name */
    public final String f509b;

    public a(String str, int i7) {
        this.f508a = i7;
        this.f509b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f508a == aVar.f508a && this.f509b.equals(aVar.f509b);
    }

    public final int hashCode() {
        return ((this.f508a ^ 1000003) * 1000003) ^ this.f509b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProtoEnumInfo{enumNumber=");
        sb.append(this.f508a);
        sb.append(", jsonName=");
        return N.p.b(sb, this.f509b, "}");
    }
}
