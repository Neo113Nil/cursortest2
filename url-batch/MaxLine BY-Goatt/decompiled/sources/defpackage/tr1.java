package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tr1 {
    public static final SparseArray m;
    public static final /* synthetic */ tr1[] n;

    /* JADX INFO: Fake field, exist only in values array */
    tr1 EF1;

    static {
        tr1 tr1Var = new tr1("MOBILE", 0);
        tr1 tr1Var2 = new tr1("WIFI", 1);
        tr1 tr1Var3 = new tr1("MOBILE_MMS", 2);
        tr1 tr1Var4 = new tr1("MOBILE_SUPL", 3);
        tr1 tr1Var5 = new tr1("MOBILE_DUN", 4);
        tr1 tr1Var6 = new tr1("MOBILE_HIPRI", 5);
        tr1 tr1Var7 = new tr1("WIMAX", 6);
        tr1 tr1Var8 = new tr1("BLUETOOTH", 7);
        tr1 tr1Var9 = new tr1("DUMMY", 8);
        tr1 tr1Var10 = new tr1("ETHERNET", 9);
        tr1 tr1Var11 = new tr1("MOBILE_FOTA", 10);
        tr1 tr1Var12 = new tr1("MOBILE_IMS", 11);
        tr1 tr1Var13 = new tr1("MOBILE_CBS", 12);
        tr1 tr1Var14 = new tr1("WIFI_P2P", 13);
        tr1 tr1Var15 = new tr1("MOBILE_IA", 14);
        tr1 tr1Var16 = new tr1("MOBILE_EMERGENCY", 15);
        tr1 tr1Var17 = new tr1("PROXY", 16);
        tr1 tr1Var18 = new tr1("VPN", 17);
        tr1 tr1Var19 = new tr1("NONE", 18);
        n = new tr1[]{tr1Var, tr1Var2, tr1Var3, tr1Var4, tr1Var5, tr1Var6, tr1Var7, tr1Var8, tr1Var9, tr1Var10, tr1Var11, tr1Var12, tr1Var13, tr1Var14, tr1Var15, tr1Var16, tr1Var17, tr1Var18, tr1Var19};
        SparseArray sparseArray = new SparseArray();
        m = sparseArray;
        sparseArray.put(0, tr1Var);
        sparseArray.put(1, tr1Var2);
        sparseArray.put(2, tr1Var3);
        sparseArray.put(3, tr1Var4);
        sparseArray.put(4, tr1Var5);
        sparseArray.put(5, tr1Var6);
        sparseArray.put(6, tr1Var7);
        sparseArray.put(7, tr1Var8);
        sparseArray.put(8, tr1Var9);
        sparseArray.put(9, tr1Var10);
        sparseArray.put(10, tr1Var11);
        sparseArray.put(11, tr1Var12);
        sparseArray.put(12, tr1Var13);
        sparseArray.put(13, tr1Var14);
        sparseArray.put(14, tr1Var15);
        sparseArray.put(15, tr1Var16);
        sparseArray.put(16, tr1Var17);
        sparseArray.put(17, tr1Var18);
        sparseArray.put(-1, tr1Var19);
    }

    public static tr1 valueOf(String str) {
        return (tr1) Enum.valueOf(tr1.class, str);
    }

    public static tr1[] values() {
        return (tr1[]) n.clone();
    }
}
