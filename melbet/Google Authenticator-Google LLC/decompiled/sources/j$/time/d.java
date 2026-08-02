package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class d implements j$.time.temporal.k, j$.time.temporal.l {
    public static final d FRIDAY;
    public static final d MONDAY;
    public static final d SATURDAY;
    public static final d SUNDAY;
    public static final d THURSDAY;
    public static final d TUESDAY;
    public static final d WEDNESDAY;
    public static final d[] a;
    public static final /* synthetic */ d[] b;

    static {
        d dVar = new d("MONDAY", 0);
        MONDAY = dVar;
        d dVar2 = new d("TUESDAY", 1);
        TUESDAY = dVar2;
        d dVar3 = new d("WEDNESDAY", 2);
        WEDNESDAY = dVar3;
        d dVar4 = new d("THURSDAY", 3);
        THURSDAY = dVar4;
        d dVar5 = new d("FRIDAY", 4);
        FRIDAY = dVar5;
        d dVar6 = new d("SATURDAY", 5);
        SATURDAY = dVar6;
        d dVar7 = new d("SUNDAY", 6);
        SUNDAY = dVar7;
        b = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7};
        a = values();
    }

    public static d t(int i) {
        if (i >= 1 && i <= 7) {
            return a[i - 1];
        }
        i.b("Invalid value for DayOfWeek: ", i);
        return null;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) b.clone();
    }

    @Override // j$.time.temporal.k
    public final boolean c(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.DAY_OF_WEEK : nVar != null && nVar.f(this);
    }

    @Override // j$.time.temporal.k
    public final int f(j$.time.temporal.n nVar) {
        return nVar == j$.time.temporal.a.DAY_OF_WEEK ? getValue() : j$.time.temporal.o.a(this, nVar);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q h(j$.time.temporal.n nVar) {
        return nVar == j$.time.temporal.a.DAY_OF_WEEK ? nVar.range() : j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal j(Temporal temporal) {
        return temporal.a(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }

    @Override // j$.time.temporal.k
    public final Object k(j$.time.format.b bVar) {
        return bVar == j$.time.temporal.o.c ? ChronoUnit.DAYS : j$.time.temporal.o.c(this, bVar);
    }

    @Override // j$.time.temporal.k
    public final long o(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.h(this);
        }
        i.a("Unsupported field: ".concat(String.valueOf(nVar)));
        return 0L;
    }
}
