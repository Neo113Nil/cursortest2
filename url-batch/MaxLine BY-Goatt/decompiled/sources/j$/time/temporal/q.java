package j$.time.temporal;

import j$.time.format.d0;
import j$.time.format.e0;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public interface q {
    u B(TemporalAccessor temporalAccessor);

    default TemporalAccessor G(Map map, d0 d0Var, e0 e0Var) {
        return null;
    }

    u J();

    long P(TemporalAccessor temporalAccessor);

    m W(m mVar, long j);

    boolean isDateBased();

    boolean s(TemporalAccessor temporalAccessor);
}
