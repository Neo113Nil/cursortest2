package t5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n extends l {

    /* renamed from: a, reason: collision with root package name */
    public static final n f8913a = new n();

    @Override // t5.l
    public final String a() {
        return ".key";
    }

    @Override // t5.l
    public final boolean b(s sVar) {
        return true;
    }

    @Override // t5.l
    public final q c(c cVar, s sVar) {
        o5.j.c(sVar instanceof v);
        return new q(c.e((String) sVar.getValue()), k.f8908j);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((q) obj).f8919a.compareTo(((q) obj2).f8919a);
    }

    @Override // t5.l
    public final q d() {
        return q.f8918d;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj instanceof n;
    }

    public final int hashCode() {
        return 37;
    }

    public final String toString() {
        return "KeyIndex";
    }
}
