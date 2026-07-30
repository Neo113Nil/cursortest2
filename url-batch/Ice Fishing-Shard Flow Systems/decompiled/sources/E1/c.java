package E1;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: i, reason: collision with root package name */
    public final transient e f662i;

    public c(e eVar) {
        this.f662i = eVar;
    }

    @Override // E1.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f662i.contains(obj);
    }

    @Override // E1.e
    public final e e() {
        return this.f662i;
    }

    @Override // E1.e, java.util.List
    /* renamed from: f */
    public final e subList(int i2, int i5) {
        e eVar = this.f662i;
        d4.c.Q(i2, i5, eVar.size());
        return eVar.subList(eVar.size() - i5, eVar.size() - i2).e();
    }

    @Override // java.util.List
    public final Object get(int i2) {
        e eVar = this.f662i;
        d4.c.P(i2, eVar.size());
        return eVar.get((eVar.size() - 1) - i2);
    }

    @Override // E1.e, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f662i.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // E1.e, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f662i.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f662i.size();
    }
}
