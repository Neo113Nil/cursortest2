package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sr1 {
    public static final SparseArray m;
    public static final /* synthetic */ sr1[] n;

    /* JADX INFO: Fake field, exist only in values array */
    sr1 EF1;

    static {
        sr1 sr1Var = new sr1("UNKNOWN_MOBILE_SUBTYPE", 0);
        sr1 sr1Var2 = new sr1("GPRS", 1);
        sr1 sr1Var3 = new sr1("EDGE", 2);
        sr1 sr1Var4 = new sr1("UMTS", 3);
        sr1 sr1Var5 = new sr1("CDMA", 4);
        sr1 sr1Var6 = new sr1("EVDO_0", 5);
        sr1 sr1Var7 = new sr1("EVDO_A", 6);
        sr1 sr1Var8 = new sr1("RTT", 7);
        sr1 sr1Var9 = new sr1("HSDPA", 8);
        sr1 sr1Var10 = new sr1("HSUPA", 9);
        sr1 sr1Var11 = new sr1("HSPA", 10);
        sr1 sr1Var12 = new sr1("IDEN", 11);
        sr1 sr1Var13 = new sr1("EVDO_B", 12);
        sr1 sr1Var14 = new sr1("LTE", 13);
        sr1 sr1Var15 = new sr1("EHRPD", 14);
        sr1 sr1Var16 = new sr1("HSPAP", 15);
        sr1 sr1Var17 = new sr1("GSM", 16);
        sr1 sr1Var18 = new sr1("TD_SCDMA", 17);
        sr1 sr1Var19 = new sr1("IWLAN", 18);
        sr1 sr1Var20 = new sr1("LTE_CA", 19);
        n = new sr1[]{sr1Var, sr1Var2, sr1Var3, sr1Var4, sr1Var5, sr1Var6, sr1Var7, sr1Var8, sr1Var9, sr1Var10, sr1Var11, sr1Var12, sr1Var13, sr1Var14, sr1Var15, sr1Var16, sr1Var17, sr1Var18, sr1Var19, sr1Var20, new sr1("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        m = sparseArray;
        sparseArray.put(0, sr1Var);
        sparseArray.put(1, sr1Var2);
        sparseArray.put(2, sr1Var3);
        sparseArray.put(3, sr1Var4);
        sparseArray.put(4, sr1Var5);
        sparseArray.put(5, sr1Var6);
        sparseArray.put(6, sr1Var7);
        sparseArray.put(7, sr1Var8);
        sparseArray.put(8, sr1Var9);
        sparseArray.put(9, sr1Var10);
        sparseArray.put(10, sr1Var11);
        sparseArray.put(11, sr1Var12);
        sparseArray.put(12, sr1Var13);
        sparseArray.put(13, sr1Var14);
        sparseArray.put(14, sr1Var15);
        sparseArray.put(15, sr1Var16);
        sparseArray.put(16, sr1Var17);
        sparseArray.put(17, sr1Var18);
        sparseArray.put(18, sr1Var19);
        sparseArray.put(19, sr1Var20);
    }

    public static sr1 valueOf(String str) {
        return (sr1) Enum.valueOf(sr1.class, str);
    }

    public static sr1[] values() {
        return (sr1[]) n.clone();
    }
}
