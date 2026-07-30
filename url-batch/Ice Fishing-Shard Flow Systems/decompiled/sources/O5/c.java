package O5;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: d, reason: collision with root package name */
    public final d f1928d;

    /* renamed from: e, reason: collision with root package name */
    public final d f1929e;

    /* renamed from: i, reason: collision with root package name */
    public final d f1930i;

    /* renamed from: l, reason: collision with root package name */
    public final d f1931l;

    public c() {
        b bVar = b.f1926d;
        this.f1928d = bVar;
        a aVar = a.f1924d;
        this.f1929e = aVar;
        this.f1930i = bVar;
        this.f1931l = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        Object obj2 = b.f1926d;
        return obj2.equals(obj2) && this.f1928d.equals(cVar.f1928d) && this.f1929e.equals(cVar.f1929e) && this.f1930i.equals(cVar.f1930i) && this.f1931l.equals(cVar.f1931l);
    }

    @Override // O5.d
    public final String getDescription() {
        return "ParentBased{root:AlwaysOnSampler,remoteParentSampled:" + this.f1928d.getDescription() + ",remoteParentNotSampled:" + this.f1929e.getDescription() + ",localParentSampled:" + this.f1930i.getDescription() + ",localParentNotSampled:" + this.f1931l.getDescription() + "}";
    }

    public final int hashCode() {
        return this.f1931l.hashCode() + ((this.f1930i.hashCode() + ((this.f1929e.hashCode() + ((this.f1928d.hashCode() + (b.f1926d.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return getDescription();
    }
}
