package Z1;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final t f4584a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4585b;

    public j(t tVar, boolean z4) {
        this.f4584a = tVar;
        this.f4585b = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.f4584a.equals(this.f4584a) && jVar.f4585b == this.f4585b;
    }

    public final int hashCode() {
        return ((this.f4584a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f4585b).hashCode();
    }
}
