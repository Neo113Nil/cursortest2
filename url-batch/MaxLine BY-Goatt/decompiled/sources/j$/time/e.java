package j$.time;

import j$.time.temporal.TemporalAccessor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class e implements TemporalAccessor, j$.time.temporal.n {
    public static final e FRIDAY;
    public static final e MONDAY;
    public static final e SATURDAY;
    public static final e SUNDAY;
    public static final e THURSDAY;
    public static final e TUESDAY;
    public static final e WEDNESDAY;
    public static final e[] a;
    public static final /* synthetic */ e[] b;

    static {
        e eVar = new e("MONDAY", 0);
        MONDAY = eVar;
        e eVar2 = new e("TUESDAY", 1);
        TUESDAY = eVar2;
        e eVar3 = new e("WEDNESDAY", 2);
        WEDNESDAY = eVar3;
        e eVar4 = new e("THURSDAY", 3);
        THURSDAY = eVar4;
        e eVar5 = new e("FRIDAY", 4);
        FRIDAY = eVar5;
        e eVar6 = new e("SATURDAY", 5);
        SATURDAY = eVar6;
        e eVar7 = new e("SUNDAY", 6);
        SUNDAY = eVar7;
        b = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
        a = values();
    }

    public static e s(int i) {
        if (i >= 1 && i <= 7) {
            return a[i - 1];
        }
        h.b("Invalid value for DayOfWeek: ", i);
        return null;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) b.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(a0 a0Var) {
        return a0Var == j$.time.temporal.r.c ? j$.time.temporal.b.DAYS : super.b(a0Var);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.i(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.q qVar) {
        return qVar == j$.time.temporal.a.DAY_OF_WEEK ? getValue() : super.e(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.DAY_OF_WEEK : qVar != null && qVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(d.a("Unsupported field: ", qVar));
        }
        return qVar.P(this);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        return qVar == j$.time.temporal.a.DAY_OF_WEEK ? qVar.J() : super.k(qVar);
    }
}
