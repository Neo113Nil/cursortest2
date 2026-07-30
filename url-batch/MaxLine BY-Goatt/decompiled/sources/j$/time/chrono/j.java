package j$.time.chrono;

import j$.time.ZoneOffset;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public interface j extends j$.time.temporal.m, Comparable {
    j E(j$.time.y yVar);

    j$.time.y K();

    default long Y() {
        return ((n().toEpochDay() * 86400) + h().g0()) - o().b;
    }

    @Override // j$.time.temporal.m
    default j a(long j, j$.time.temporal.s sVar) {
        return l.s(d(), super.a(j, sVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(j$.time.a0 a0Var) {
        return (a0Var == j$.time.temporal.r.e || a0Var == j$.time.temporal.r.a) ? K() : a0Var == j$.time.temporal.r.d ? o() : a0Var == j$.time.temporal.r.g ? h() : a0Var == j$.time.temporal.r.b ? d() : a0Var == j$.time.temporal.r.c ? j$.time.temporal.b.NANOS : a0Var.j(this);
    }

    default m d() {
        return n().d();
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int e(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return super.e(qVar);
        }
        int i = i.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i != 1) {
            return i != 2 ? x().e(qVar) : o().b;
        }
        throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.P(this);
        }
        int i = i.a[((j$.time.temporal.a) qVar).ordinal()];
        return i != 1 ? i != 2 ? x().g(qVar) : o().b : Y();
    }

    default j$.time.l h() {
        return x().h();
    }

    @Override // j$.time.temporal.TemporalAccessor
    default j$.time.temporal.u k(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? (qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) qVar).b : x().k(qVar) : qVar.B(this);
    }

    @Override // j$.time.temporal.m
    default j m(j$.time.temporal.n nVar) {
        return l.s(d(), nVar.c(this));
    }

    default b n() {
        return x().n();
    }

    ZoneOffset o();

    @Override // java.lang.Comparable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    default int compareTo(j jVar) {
        int compare = Long.compare(Y(), jVar.Y());
        return (compare == 0 && (compare = h().d - jVar.h().d) == 0 && (compare = x().compareTo(jVar.x())) == 0 && (compare = K().q().compareTo(jVar.K().q())) == 0) ? ((a) d()).q().compareTo(jVar.d().q()) : compare;
    }

    e x();
}
