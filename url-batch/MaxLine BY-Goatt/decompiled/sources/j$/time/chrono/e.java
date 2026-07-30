package j$.time.chrono;

import j$.time.ZoneOffset;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public interface e extends j$.time.temporal.m, j$.time.temporal.n, Comparable {
    j F(j$.time.y yVar);

    @Override // java.lang.Comparable
    /* renamed from: O */
    default int compareTo(e eVar) {
        int compareTo = n().compareTo(eVar.n());
        return (compareTo == 0 && (compareTo = h().compareTo(eVar.h())) == 0) ? ((a) d()).q().compareTo(eVar.d().q()) : compareTo;
    }

    @Override // j$.time.temporal.m
    default e a(long j, j$.time.temporal.s sVar) {
        return g.s(d(), super.a(j, sVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(j$.time.a0 a0Var) {
        if (a0Var == j$.time.temporal.r.a || a0Var == j$.time.temporal.r.e || a0Var == j$.time.temporal.r.d) {
            return null;
        }
        return a0Var == j$.time.temporal.r.g ? h() : a0Var == j$.time.temporal.r.b ? d() : a0Var == j$.time.temporal.r.c ? j$.time.temporal.b.NANOS : a0Var.j(this);
    }

    @Override // j$.time.temporal.n
    default j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.i(n().toEpochDay(), j$.time.temporal.a.EPOCH_DAY).i(h().f0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    default m d() {
        return n().d();
    }

    j$.time.l h();

    b n();

    default long w(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((n().toEpochDay() * 86400) + h().g0()) - zoneOffset.b;
    }
}
