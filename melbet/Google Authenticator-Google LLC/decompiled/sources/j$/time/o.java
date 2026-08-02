package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class o implements j$.time.temporal.k, j$.time.temporal.l {
    public static final o APRIL;
    public static final o AUGUST;
    public static final o DECEMBER;
    public static final o FEBRUARY;
    public static final o JANUARY;
    public static final o JULY;
    public static final o JUNE;
    public static final o MARCH;
    public static final o MAY;
    public static final o NOVEMBER;
    public static final o OCTOBER;
    public static final o SEPTEMBER;
    public static final o[] a;
    public static final /* synthetic */ o[] b;

    static {
        o oVar = new o("JANUARY", 0);
        JANUARY = oVar;
        o oVar2 = new o("FEBRUARY", 1);
        FEBRUARY = oVar2;
        o oVar3 = new o("MARCH", 2);
        MARCH = oVar3;
        o oVar4 = new o("APRIL", 3);
        APRIL = oVar4;
        o oVar5 = new o("MAY", 4);
        MAY = oVar5;
        o oVar6 = new o("JUNE", 5);
        JUNE = oVar6;
        o oVar7 = new o("JULY", 6);
        JULY = oVar7;
        o oVar8 = new o("AUGUST", 7);
        AUGUST = oVar8;
        o oVar9 = new o("SEPTEMBER", 8);
        SEPTEMBER = oVar9;
        o oVar10 = new o("OCTOBER", 9);
        OCTOBER = oVar10;
        o oVar11 = new o("NOVEMBER", 10);
        NOVEMBER = oVar11;
        o oVar12 = new o("DECEMBER", 11);
        DECEMBER = oVar12;
        b = new o[]{oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9, oVar10, oVar11, oVar12};
        a = values();
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) b.clone();
    }

    public static o w(int i) {
        if (i >= 1 && i <= 12) {
            return a[i - 1];
        }
        i.b("Invalid value for MonthOfYear: ", i);
        return null;
    }

    @Override // j$.time.temporal.k
    public final boolean c(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.MONTH_OF_YEAR : nVar != null && nVar.f(this);
    }

    @Override // j$.time.temporal.k
    public final int f(j$.time.temporal.n nVar) {
        return nVar == j$.time.temporal.a.MONTH_OF_YEAR ? getValue() : j$.time.temporal.o.a(this, nVar);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q h(j$.time.temporal.n nVar) {
        return nVar == j$.time.temporal.a.MONTH_OF_YEAR ? nVar.range() : j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal j(Temporal temporal) {
        if (j$.nio.file.attribute.a.A(temporal).equals(j$.time.chrono.s.c)) {
            return temporal.a(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
        }
        i.d("Adjustment only supported on ISO date-time");
        return null;
    }

    @Override // j$.time.temporal.k
    public final Object k(j$.time.format.b bVar) {
        return bVar == j$.time.temporal.o.b ? j$.time.chrono.s.c : bVar == j$.time.temporal.o.c ? ChronoUnit.MONTHS : j$.time.temporal.o.c(this, bVar);
    }

    @Override // j$.time.temporal.k
    public final long o(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.h(this);
        }
        i.a("Unsupported field: ".concat(String.valueOf(nVar)));
        return 0L;
    }

    public final int t(boolean z) {
        switch (ordinal()) {
            case 0:
                return 1;
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 60;
            case 3:
                return (z ? 1 : 0) + 91;
            case 4:
                return (z ? 1 : 0) + 121;
            case 5:
                return (z ? 1 : 0) + 152;
            case 6:
                return (z ? 1 : 0) + 182;
            case 7:
                return (z ? 1 : 0) + 213;
            case 8:
                return (z ? 1 : 0) + 244;
            case 9:
                return (z ? 1 : 0) + 274;
            case 10:
                return (z ? 1 : 0) + 305;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    public final int u(boolean z) {
        int ordinal = ordinal();
        return ordinal != 1 ? (ordinal == 3 || ordinal == 5 || ordinal == 8 || ordinal == 10) ? 30 : 31 : z ? 29 : 28;
    }

    public final int v() {
        int ordinal = ordinal();
        if (ordinal != 1) {
            return (ordinal == 3 || ordinal == 5 || ordinal == 8 || ordinal == 10) ? 30 : 31;
        }
        return 29;
    }
}
