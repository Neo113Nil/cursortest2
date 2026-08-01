package b1;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f726a;

    /* renamed from: b, reason: collision with root package name */
    public int f727b;
    public Object c;

    /* renamed from: d, reason: collision with root package name */
    public int f728d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            int i4 = this.f726a;
            if (i4 != aVar.f726a) {
                return false;
            }
            if (i4 != 8 || Math.abs(this.f728d - this.f727b) != 1 || this.f728d != aVar.f727b || this.f727b != aVar.f728d) {
                if (this.f728d != aVar.f728d || this.f727b != aVar.f727b) {
                    return false;
                }
                Object obj2 = this.c;
                if (obj2 != null) {
                    if (!obj2.equals(aVar.c)) {
                        return false;
                    }
                } else if (aVar.c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f726a * 31) + this.f727b) * 31) + this.f728d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i4 = this.f726a;
        sb.append(i4 != 1 ? i4 != 2 ? i4 != 4 ? i4 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f727b);
        sb.append("c:");
        sb.append(this.f728d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
