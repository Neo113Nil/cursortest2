package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class cp0 {
    public static final SparseArray d;
    public static final /* synthetic */ cp0[] e;

    /* JADX INFO: Fake field, exist only in values array */
    cp0 EF1;

    static {
        cp0 cp0Var = new cp0("MOBILE", 0);
        cp0 cp0Var2 = new cp0("WIFI", 1);
        cp0 cp0Var3 = new cp0("MOBILE_MMS", 2);
        cp0 cp0Var4 = new cp0("MOBILE_SUPL", 3);
        cp0 cp0Var5 = new cp0("MOBILE_DUN", 4);
        cp0 cp0Var6 = new cp0("MOBILE_HIPRI", 5);
        cp0 cp0Var7 = new cp0("WIMAX", 6);
        cp0 cp0Var8 = new cp0("BLUETOOTH", 7);
        cp0 cp0Var9 = new cp0("DUMMY", 8);
        cp0 cp0Var10 = new cp0("ETHERNET", 9);
        cp0 cp0Var11 = new cp0("MOBILE_FOTA", 10);
        cp0 cp0Var12 = new cp0("MOBILE_IMS", 11);
        cp0 cp0Var13 = new cp0("MOBILE_CBS", 12);
        cp0 cp0Var14 = new cp0("WIFI_P2P", 13);
        cp0 cp0Var15 = new cp0("MOBILE_IA", 14);
        cp0 cp0Var16 = new cp0("MOBILE_EMERGENCY", 15);
        cp0 cp0Var17 = new cp0("PROXY", 16);
        cp0 cp0Var18 = new cp0("VPN", 17);
        cp0 cp0Var19 = new cp0("NONE", 18);
        e = new cp0[]{cp0Var, cp0Var2, cp0Var3, cp0Var4, cp0Var5, cp0Var6, cp0Var7, cp0Var8, cp0Var9, cp0Var10, cp0Var11, cp0Var12, cp0Var13, cp0Var14, cp0Var15, cp0Var16, cp0Var17, cp0Var18, cp0Var19};
        SparseArray sparseArray = new SparseArray();
        d = sparseArray;
        sparseArray.put(0, cp0Var);
        sparseArray.put(1, cp0Var2);
        sparseArray.put(2, cp0Var3);
        sparseArray.put(3, cp0Var4);
        sparseArray.put(4, cp0Var5);
        sparseArray.put(5, cp0Var6);
        sparseArray.put(6, cp0Var7);
        sparseArray.put(7, cp0Var8);
        sparseArray.put(8, cp0Var9);
        sparseArray.put(9, cp0Var10);
        sparseArray.put(10, cp0Var11);
        sparseArray.put(11, cp0Var12);
        sparseArray.put(12, cp0Var13);
        sparseArray.put(13, cp0Var14);
        sparseArray.put(14, cp0Var15);
        sparseArray.put(15, cp0Var16);
        sparseArray.put(16, cp0Var17);
        sparseArray.put(17, cp0Var18);
        sparseArray.put(-1, cp0Var19);
    }

    public static cp0 valueOf(String str) {
        return (cp0) Enum.valueOf(cp0.class, str);
    }

    public static cp0[] values() {
        return (cp0[]) e.clone();
    }
}
