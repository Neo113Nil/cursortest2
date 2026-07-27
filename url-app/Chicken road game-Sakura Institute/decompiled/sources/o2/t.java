package o2;

/* loaded from: classes.dex */
public final class t extends l {

    /* renamed from: a, reason: collision with root package name */
    public static final t f8953a = new t();

    @Override // o2.l
    public final String a() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }

    @Override // o2.l
    public final boolean b(s sVar) {
        return !sVar.k().isEmpty();
    }

    @Override // o2.l
    public final q c(C0924c c0924c, s sVar) {
        return new q(c0924c, new v("[PRIORITY-POST]", sVar));
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        q qVar = (q) obj;
        q qVar2 = (q) obj2;
        int compareTo = qVar.f8951b.k().compareTo(qVar2.f8951b.k());
        return compareTo != 0 ? compareTo : qVar.f8950a.compareTo(qVar2.f8950a);
    }

    @Override // o2.l
    public final q d() {
        return c(C0924c.f8918i, s.f8952g);
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
