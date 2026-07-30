package t5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t extends l {

    /* renamed from: a, reason: collision with root package name */
    public static final t f8922a = new t();

    @Override // t5.l
    public final String a() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }

    @Override // t5.l
    public final boolean b(s sVar) {
        return !sVar.c().isEmpty();
    }

    @Override // t5.l
    public final q c(c cVar, s sVar) {
        return new q(cVar, new v("[PRIORITY-POST]", sVar));
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        q qVar = (q) obj;
        q qVar2 = (q) obj2;
        s c4 = qVar.f8920b.c();
        s c6 = qVar2.f8920b.c();
        c cVar = qVar.f8919a;
        c cVar2 = qVar2.f8919a;
        int compareTo = c4.compareTo(c6);
        return compareTo != 0 ? compareTo : cVar.compareTo(cVar2);
    }

    @Override // t5.l
    public final q d() {
        return c(c.f8887h, s.f8921e);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj instanceof t;
    }

    public final int hashCode() {
        return 3155577;
    }

    public final String toString() {
        return "PriorityIndex";
    }
}
