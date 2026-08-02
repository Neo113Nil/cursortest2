package j$.time.temporal;

import j$.time.Duration;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public interface TemporalUnit {
    long between(Temporal temporal, Temporal temporal2);

    Temporal f(Temporal temporal, long j);

    Duration getDuration();

    boolean isDurationEstimated();
}
