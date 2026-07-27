package g2;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public String f6715a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6716b;

    /* renamed from: c, reason: collision with root package name */
    public String f6717c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f6716b == iVar.f6716b && this.f6715a.equals(iVar.f6715a)) {
            return this.f6717c.equals(iVar.f6717c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6717c.hashCode() + (((this.f6715a.hashCode() * 31) + (this.f6716b ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("http");
        sb.append(this.f6716b ? "s" : "");
        sb.append("://");
        sb.append(this.f6715a);
        return sb.toString();
    }
}
