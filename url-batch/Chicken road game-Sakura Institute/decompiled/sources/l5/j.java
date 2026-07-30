package l5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public String f6044a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6045b;

    /* renamed from: c, reason: collision with root package name */
    public String f6046c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f6045b == jVar.f6045b && this.f6044a.equals(jVar.f6044a)) {
            return this.f6046c.equals(jVar.f6046c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6046c.hashCode() + (((this.f6044a.hashCode() * 31) + (this.f6045b ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("http");
        sb.append(this.f6045b ? "s" : "");
        sb.append("://");
        sb.append(this.f6044a);
        return sb.toString();
    }
}
