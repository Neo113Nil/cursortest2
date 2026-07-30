package j$.time;

import defpackage.l42;
import j$.time.temporal.TemporalAccessor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final /* synthetic */ class a0 implements j$.time.temporal.n {
    public final /* synthetic */ int a;

    public /* synthetic */ a0(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.n
    public j$.time.temporal.m c(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return mVar.i(mVar.k(aVar).d, aVar);
    }

    public Object j(TemporalAccessor temporalAccessor) {
        int i = this.a;
        a0 a0Var = j$.time.temporal.r.a;
        ZonedDateTime zonedDateTime = null;
        switch (i) {
            case 0:
                if (temporalAccessor instanceof ZonedDateTime) {
                    return (ZonedDateTime) temporalAccessor;
                }
                try {
                    y s = y.s(temporalAccessor);
                    j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
                    zonedDateTime = temporalAccessor.f(aVar) ? ZonedDateTime.s(temporalAccessor.g(aVar), temporalAccessor.e(j$.time.temporal.a.NANO_OF_SECOND), s) : ZonedDateTime.B(LocalDateTime.J(LocalDate.G(temporalAccessor), l.G(temporalAccessor)), s, null);
                    return zonedDateTime;
                } catch (c e) {
                    h.g("Unable to obtain ZonedDateTime from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e);
                    return zonedDateTime;
                }
            case 1:
                y yVar = (y) temporalAccessor.b(a0Var);
                if (yVar == null || (yVar instanceof ZoneOffset)) {
                    return null;
                }
                return yVar;
            case 2:
            default:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_DAY;
                if (temporalAccessor.f(aVar2)) {
                    return l.W(temporalAccessor.g(aVar2));
                }
                return null;
            case 3:
                return (y) temporalAccessor.b(a0Var);
            case 4:
                return (j$.time.chrono.m) temporalAccessor.b(j$.time.temporal.r.b);
            case 5:
                return (j$.time.temporal.s) temporalAccessor.b(j$.time.temporal.r.c);
            case 6:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.OFFSET_SECONDS;
                if (temporalAccessor.f(aVar3)) {
                    return ZoneOffset.b0(temporalAccessor.e(aVar3));
                }
                return null;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                y yVar2 = (y) temporalAccessor.b(a0Var);
                return yVar2 != null ? yVar2 : (y) temporalAccessor.b(j$.time.temporal.r.d);
            case 8:
                j$.time.temporal.a aVar4 = j$.time.temporal.a.EPOCH_DAY;
                if (temporalAccessor.f(aVar4)) {
                    return LocalDate.ofEpochDay(temporalAccessor.g(aVar4));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "ZoneId";
            case 4:
                return "Chronology";
            case 5:
                return "Precision";
            case 6:
                return "ZoneOffset";
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return "Zone";
            case 8:
                return "LocalDate";
            case 9:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
