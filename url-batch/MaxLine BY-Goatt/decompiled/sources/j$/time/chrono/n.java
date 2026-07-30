package j$.time.chrono;

import j$.time.temporal.TemporalAccessor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public interface n extends TemporalAccessor, j$.time.temporal.n {
    @Override // j$.time.temporal.TemporalAccessor
    default Object b(j$.time.a0 a0Var) {
        return a0Var == j$.time.temporal.r.c ? j$.time.temporal.b.ERAS : super.b(a0Var);
    }

    @Override // j$.time.temporal.n
    default j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.i(getValue(), j$.time.temporal.a.ERA);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int e(j$.time.temporal.q qVar) {
        return qVar == j$.time.temporal.a.ERA ? getValue() : super.e(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.ERA : qVar != null && qVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long g(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return getValue();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", qVar));
        }
        return qVar.P(this);
    }

    int getValue();
}
