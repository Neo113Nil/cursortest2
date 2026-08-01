package o7;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: i, reason: collision with root package name */
    public final transient e f7542i;

    public c(e eVar) {
        this.f7542i = eVar;
    }

    @Override // o7.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f7542i.contains(obj);
    }

    @Override // o7.e
    public final e g() {
        return this.f7542i;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        e eVar = this.f7542i;
        a.a.f0(i3, eVar.size());
        return eVar.get((eVar.size() - 1) - i3);
    }

    @Override // o7.e, java.util.List
    /* renamed from: h */
    public final e subList(int i3, int i10) {
        e eVar = this.f7542i;
        a.a.g0(i3, i10, eVar.size());
        return eVar.subList(eVar.size() - i10, eVar.size() - i3).g();
    }

    @Override // o7.e, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f7542i.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // o7.e, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f7542i.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7542i.size();
    }
}
