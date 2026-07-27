package o2;

import j2.AbstractC0720j;

/* loaded from: classes.dex */
public final class n extends l {

    /* renamed from: a, reason: collision with root package name */
    public static final n f8944a = new n();

    @Override // o2.l
    public final String a() {
        return ".key";
    }

    @Override // o2.l
    public final boolean b(s sVar) {
        return true;
    }

    @Override // o2.l
    public final q c(C0924c c0924c, s sVar) {
        AbstractC0720j.c(sVar instanceof v);
        return new q(C0924c.c((String) sVar.getValue()), k.f8939k);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((q) obj).f8950a.compareTo(((q) obj2).f8950a);
    }

    @Override // o2.l
    public final q d() {
        return q.f8949d;
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
