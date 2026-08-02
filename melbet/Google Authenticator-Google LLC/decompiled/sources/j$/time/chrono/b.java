package j$.time.chrono;

import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public interface b extends Temporal, j$.time.temporal.l, Comparable {
    @Override // j$.time.temporal.Temporal
    b a(long j, j$.time.temporal.n nVar);

    @Override // j$.time.temporal.Temporal
    b b(long j, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.k
    boolean c(j$.time.temporal.n nVar);

    @Override // j$.time.temporal.Temporal
    long d(Temporal temporal, TemporalUnit temporalUnit);

    a getChronology();

    int hashCode();

    b l(long j, TemporalUnit temporalUnit);

    long p();

    e q(j$.time.n nVar);

    /* renamed from: s */
    int compareTo(b bVar);

    String toString();
}
