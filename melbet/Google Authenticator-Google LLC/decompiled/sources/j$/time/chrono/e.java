package j$.time.chrono;

import j$.time.temporal.Temporal;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public interface e extends Temporal, j$.time.temporal.l, Comparable {
    a getChronology();

    j i(j$.time.c0 c0Var);

    /* renamed from: r */
    int compareTo(e eVar);

    b toLocalDate();

    j$.time.n toLocalTime();
}
