package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ceb {
    MOBILE(0),
    WIFI(1),
    MOBILE_MMS(2),
    MOBILE_SUPL(3),
    MOBILE_DUN(4),
    MOBILE_HIPRI(5),
    WIMAX(6),
    BLUETOOTH(7),
    DUMMY(8),
    ETHERNET(9),
    MOBILE_FOTA(10),
    MOBILE_IMS(11),
    MOBILE_CBS(12),
    WIFI_P2P(13),
    MOBILE_IA(14),
    MOBILE_EMERGENCY(15),
    PROXY(16),
    VPN(17),
    NONE(-1);

    public static final SparseArray t;
    public final int u;

    static {
        ceb cebVar = MOBILE;
        ceb cebVar2 = WIFI;
        ceb cebVar3 = MOBILE_MMS;
        ceb cebVar4 = MOBILE_SUPL;
        ceb cebVar5 = MOBILE_DUN;
        ceb cebVar6 = MOBILE_HIPRI;
        ceb cebVar7 = WIMAX;
        ceb cebVar8 = BLUETOOTH;
        ceb cebVar9 = DUMMY;
        ceb cebVar10 = ETHERNET;
        ceb cebVar11 = MOBILE_FOTA;
        ceb cebVar12 = MOBILE_IMS;
        ceb cebVar13 = MOBILE_CBS;
        ceb cebVar14 = WIFI_P2P;
        ceb cebVar15 = MOBILE_IA;
        ceb cebVar16 = MOBILE_EMERGENCY;
        ceb cebVar17 = PROXY;
        ceb cebVar18 = VPN;
        ceb cebVar19 = NONE;
        SparseArray sparseArray = new SparseArray();
        t = sparseArray;
        sparseArray.put(0, cebVar);
        sparseArray.put(1, cebVar2);
        sparseArray.put(2, cebVar3);
        sparseArray.put(3, cebVar4);
        sparseArray.put(4, cebVar5);
        sparseArray.put(5, cebVar6);
        sparseArray.put(6, cebVar7);
        sparseArray.put(7, cebVar8);
        sparseArray.put(8, cebVar9);
        sparseArray.put(9, cebVar10);
        sparseArray.put(10, cebVar11);
        sparseArray.put(11, cebVar12);
        sparseArray.put(12, cebVar13);
        sparseArray.put(13, cebVar14);
        sparseArray.put(14, cebVar15);
        sparseArray.put(15, cebVar16);
        sparseArray.put(16, cebVar17);
        sparseArray.put(17, cebVar18);
        sparseArray.put(-1, cebVar19);
    }

    ceb(int i) {
        this.u = i;
    }
}
