package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum cea {
    UNKNOWN_MOBILE_SUBTYPE(0),
    GPRS(1),
    EDGE(2),
    UMTS(3),
    CDMA(4),
    EVDO_0(5),
    EVDO_A(6),
    RTT(7),
    HSDPA(8),
    HSUPA(9),
    HSPA(10),
    IDEN(11),
    EVDO_B(12),
    LTE(13),
    EHRPD(14),
    HSPAP(15),
    GSM(16),
    TD_SCDMA(17),
    IWLAN(18),
    LTE_CA(19),
    COMBINED(100);

    private static final SparseArray w;
    public final int v;

    static {
        cea ceaVar = UNKNOWN_MOBILE_SUBTYPE;
        cea ceaVar2 = GPRS;
        cea ceaVar3 = EDGE;
        cea ceaVar4 = UMTS;
        cea ceaVar5 = CDMA;
        cea ceaVar6 = EVDO_0;
        cea ceaVar7 = EVDO_A;
        cea ceaVar8 = RTT;
        cea ceaVar9 = HSDPA;
        cea ceaVar10 = HSUPA;
        cea ceaVar11 = HSPA;
        cea ceaVar12 = IDEN;
        cea ceaVar13 = EVDO_B;
        cea ceaVar14 = LTE;
        cea ceaVar15 = EHRPD;
        cea ceaVar16 = HSPAP;
        cea ceaVar17 = GSM;
        cea ceaVar18 = TD_SCDMA;
        cea ceaVar19 = IWLAN;
        cea ceaVar20 = LTE_CA;
        SparseArray sparseArray = new SparseArray();
        w = sparseArray;
        sparseArray.put(0, ceaVar);
        sparseArray.put(1, ceaVar2);
        sparseArray.put(2, ceaVar3);
        sparseArray.put(3, ceaVar4);
        sparseArray.put(4, ceaVar5);
        sparseArray.put(5, ceaVar6);
        sparseArray.put(6, ceaVar7);
        sparseArray.put(7, ceaVar8);
        sparseArray.put(8, ceaVar9);
        sparseArray.put(9, ceaVar10);
        sparseArray.put(10, ceaVar11);
        sparseArray.put(11, ceaVar12);
        sparseArray.put(12, ceaVar13);
        sparseArray.put(13, ceaVar14);
        sparseArray.put(14, ceaVar15);
        sparseArray.put(15, ceaVar16);
        sparseArray.put(16, ceaVar17);
        sparseArray.put(17, ceaVar18);
        sparseArray.put(18, ceaVar19);
        sparseArray.put(19, ceaVar20);
    }

    cea(int i) {
        this.v = i;
    }

    public static cea a(int i) {
        return (cea) w.get(i);
    }
}
