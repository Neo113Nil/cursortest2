package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class bp0 {
    public static final SparseArray d;
    public static final /* synthetic */ bp0[] e;

    /* JADX INFO: Fake field, exist only in values array */
    bp0 EF1;

    static {
        bp0 bp0Var = new bp0("UNKNOWN_MOBILE_SUBTYPE", 0);
        bp0 bp0Var2 = new bp0("GPRS", 1);
        bp0 bp0Var3 = new bp0("EDGE", 2);
        bp0 bp0Var4 = new bp0("UMTS", 3);
        bp0 bp0Var5 = new bp0("CDMA", 4);
        bp0 bp0Var6 = new bp0("EVDO_0", 5);
        bp0 bp0Var7 = new bp0("EVDO_A", 6);
        bp0 bp0Var8 = new bp0("RTT", 7);
        bp0 bp0Var9 = new bp0("HSDPA", 8);
        bp0 bp0Var10 = new bp0("HSUPA", 9);
        bp0 bp0Var11 = new bp0("HSPA", 10);
        bp0 bp0Var12 = new bp0("IDEN", 11);
        bp0 bp0Var13 = new bp0("EVDO_B", 12);
        bp0 bp0Var14 = new bp0("LTE", 13);
        bp0 bp0Var15 = new bp0("EHRPD", 14);
        bp0 bp0Var16 = new bp0("HSPAP", 15);
        bp0 bp0Var17 = new bp0("GSM", 16);
        bp0 bp0Var18 = new bp0("TD_SCDMA", 17);
        bp0 bp0Var19 = new bp0("IWLAN", 18);
        bp0 bp0Var20 = new bp0("LTE_CA", 19);
        e = new bp0[]{bp0Var, bp0Var2, bp0Var3, bp0Var4, bp0Var5, bp0Var6, bp0Var7, bp0Var8, bp0Var9, bp0Var10, bp0Var11, bp0Var12, bp0Var13, bp0Var14, bp0Var15, bp0Var16, bp0Var17, bp0Var18, bp0Var19, bp0Var20, new bp0("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        d = sparseArray;
        sparseArray.put(0, bp0Var);
        sparseArray.put(1, bp0Var2);
        sparseArray.put(2, bp0Var3);
        sparseArray.put(3, bp0Var4);
        sparseArray.put(4, bp0Var5);
        sparseArray.put(5, bp0Var6);
        sparseArray.put(6, bp0Var7);
        sparseArray.put(7, bp0Var8);
        sparseArray.put(8, bp0Var9);
        sparseArray.put(9, bp0Var10);
        sparseArray.put(10, bp0Var11);
        sparseArray.put(11, bp0Var12);
        sparseArray.put(12, bp0Var13);
        sparseArray.put(13, bp0Var14);
        sparseArray.put(14, bp0Var15);
        sparseArray.put(15, bp0Var16);
        sparseArray.put(16, bp0Var17);
        sparseArray.put(17, bp0Var18);
        sparseArray.put(18, bp0Var19);
        sparseArray.put(19, bp0Var20);
    }

    public static bp0 valueOf(String str) {
        return (bp0) Enum.valueOf(bp0.class, str);
    }

    public static bp0[] values() {
        return (bp0[]) e.clone();
    }
}
