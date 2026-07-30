package j$.time.chrono;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public interface b extends j$.time.temporal.m, j$.time.temporal.n, Comparable {
    default e L(j$.time.l lVar) {
        return new g(this, lVar);
    }

    default n N() {
        return d().C(e(j$.time.temporal.a.ERA));
    }

    b R(j$.time.temporal.p pVar);

    default int U() {
        return y() ? 366 : 365;
    }

    @Override // java.lang.Comparable
    /* renamed from: V */
    default int compareTo(b bVar) {
        int compare = Long.compare(toEpochDay(), bVar.toEpochDay());
        if (compare != 0) {
            return compare;
        }
        return ((a) d()).q().compareTo(bVar.d().q());
    }

    @Override // j$.time.temporal.m
    default b a(long j, j$.time.temporal.s sVar) {
        return d.s(d(), super.a(j, sVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(j$.time.a0 a0Var) {
        if (a0Var == j$.time.temporal.r.a || a0Var == j$.time.temporal.r.e || a0Var == j$.time.temporal.r.d || a0Var == j$.time.temporal.r.g) {
            return null;
        }
        return a0Var == j$.time.temporal.r.b ? d() : a0Var == j$.time.temporal.r.c ? j$.time.temporal.b.DAYS : a0Var.j(this);
    }

    @Override // j$.time.temporal.n
    default j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.i(toEpochDay(), j$.time.temporal.a.EPOCH_DAY);
    }

    m d();

    boolean equals(Object obj);

    @Override // j$.time.temporal.TemporalAccessor
    default boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).isDateBased() : qVar != null && qVar.s(this);
    }

    int hashCode();

    @Override // j$.time.temporal.m
    b i(long j, j$.time.temporal.q qVar);

    @Override // j$.time.temporal.m
    b l(long j, j$.time.temporal.s sVar);

    b m(j$.time.temporal.n nVar);

    default long toEpochDay() {
        return g(j$.time.temporal.a.EPOCH_DAY);
    }

    String toString();

    default boolean y() {
        return d().X(g(j$.time.temporal.a.YEAR));
    }
}
