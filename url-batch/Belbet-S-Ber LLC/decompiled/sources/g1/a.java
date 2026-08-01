package g1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1590a;

    /* renamed from: b, reason: collision with root package name */
    public int f1591b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1592c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            int i = this.f1590a;
            if (i != aVar.f1590a) {
                return false;
            }
            if (i != 8 || Math.abs(this.d - this.f1591b) != 1 || this.d != aVar.f1591b || this.f1591b != aVar.d) {
                if (this.d != aVar.d || this.f1591b != aVar.f1591b) {
                    return false;
                }
                Object obj2 = this.f1592c;
                if (obj2 != null) {
                    if (!obj2.equals(aVar.f1592c)) {
                        return false;
                    }
                } else if (aVar.f1592c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f1590a * 31) + this.f1591b) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f1590a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f1591b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.f1592c);
        sb.append("]");
        return sb.toString();
    }
}
