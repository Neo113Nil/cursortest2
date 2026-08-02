package j$.time.chrono;

import j$.time.temporal.Temporal;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public interface j extends Temporal, Comparable {
    j e(j$.time.b0 b0Var);

    a getChronology();

    j$.time.c0 getOffset();

    j$.time.b0 getZone();

    j m(j$.time.b0 b0Var);

    long toEpochSecond();

    b toLocalDate();

    e toLocalDateTime();

    j$.time.n toLocalTime();
}
