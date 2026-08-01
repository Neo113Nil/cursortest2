package f1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1291a;

    /* renamed from: b, reason: collision with root package name */
    public int f1292b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1293c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            int i = this.f1291a;
            if (i != aVar.f1291a) {
                return false;
            }
            if (i != 8 || Math.abs(this.d - this.f1292b) != 1 || this.d != aVar.f1292b || this.f1292b != aVar.d) {
                if (this.d != aVar.d || this.f1292b != aVar.f1292b) {
                    return false;
                }
                Object obj2 = this.f1293c;
                if (obj2 != null) {
                    if (!obj2.equals(aVar.f1293c)) {
                        return false;
                    }
                } else if (aVar.f1293c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f1291a * 31) + this.f1292b) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f1291a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f1292b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.f1293c);
        sb.append("]");
        return sb.toString();
    }
}
