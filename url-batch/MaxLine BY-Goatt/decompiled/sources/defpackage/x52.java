package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x52 {
    public static final x52 m;
    public static final /* synthetic */ x52[] n;

    static {
        x52 x52Var = new x52("DEFAULT", 0);
        m = x52Var;
        x52 x52Var2 = new x52("UNMETERED_ONLY", 1);
        x52 x52Var3 = new x52("UNMETERED_OR_DAILY", 2);
        x52 x52Var4 = new x52("FAST_IF_RADIO_AWAKE", 3);
        x52 x52Var5 = new x52("NEVER", 4);
        x52 x52Var6 = new x52("UNRECOGNIZED", 5);
        n = new x52[]{x52Var, x52Var2, x52Var3, x52Var4, x52Var5, x52Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, x52Var);
        sparseArray.put(1, x52Var2);
        sparseArray.put(2, x52Var3);
        sparseArray.put(3, x52Var4);
        sparseArray.put(4, x52Var5);
        sparseArray.put(-1, x52Var6);
    }

    public static x52 valueOf(String str) {
        return (x52) Enum.valueOf(x52.class, str);
    }

    public static x52[] values() {
        return (x52[]) n.clone();
    }
}
