package j$.time.format;

import j$.time.temporal.TemporalAccessor;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class y {
    public final TemporalAccessor a;
    public final DateTimeFormatter b;
    public int c;

    public y(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.m mVar = dateTimeFormatter.e;
        if (mVar != null) {
            j$.time.chrono.m mVar2 = (j$.time.chrono.m) temporalAccessor.b(j$.time.temporal.r.b);
            j$.time.y yVar = (j$.time.y) temporalAccessor.b(j$.time.temporal.r.a);
            j$.time.chrono.b bVar = null;
            mVar = Objects.equals(mVar, mVar2) ? null : mVar;
            if (mVar != null) {
                j$.time.chrono.m mVar3 = mVar != null ? mVar : mVar2;
                if (mVar != null) {
                    if (temporalAccessor.f(j$.time.temporal.a.EPOCH_DAY)) {
                        bVar = mVar3.H(temporalAccessor);
                    } else if (mVar != j$.time.chrono.t.c || mVar2 != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.isDateBased() && temporalAccessor.f(aVar)) {
                                throw new j$.time.c("Unable to apply override chronology '" + mVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new x(bVar, temporalAccessor, mVar3, yVar);
            }
        }
        this.a = temporalAccessor;
        this.b = dateTimeFormatter;
    }

    public final Long a(j$.time.temporal.q qVar) {
        int i = this.c;
        TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.f(qVar)) {
            return Long.valueOf(temporalAccessor.g(qVar));
        }
        return null;
    }

    public final Object b(j$.time.a0 a0Var) {
        TemporalAccessor temporalAccessor = this.a;
        Object b = temporalAccessor.b(a0Var);
        if (b != null || this.c != 0) {
            return b;
        }
        throw new j$.time.c("Unable to extract " + a0Var + " from temporal " + temporalAccessor);
    }

    public final String toString() {
        return this.a.toString();
    }
}
