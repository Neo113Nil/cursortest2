package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class t01 {
    public static final t01 d;
    public static final /* synthetic */ t01[] e;

    static {
        t01 t01Var = new t01("DEFAULT", 0);
        d = t01Var;
        t01 t01Var2 = new t01("UNMETERED_ONLY", 1);
        t01 t01Var3 = new t01("UNMETERED_OR_DAILY", 2);
        t01 t01Var4 = new t01("FAST_IF_RADIO_AWAKE", 3);
        t01 t01Var5 = new t01("NEVER", 4);
        t01 t01Var6 = new t01("UNRECOGNIZED", 5);
        e = new t01[]{t01Var, t01Var2, t01Var3, t01Var4, t01Var5, t01Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, t01Var);
        sparseArray.put(1, t01Var2);
        sparseArray.put(2, t01Var3);
        sparseArray.put(3, t01Var4);
        sparseArray.put(4, t01Var5);
        sparseArray.put(-1, t01Var6);
    }

    public static t01 valueOf(String str) {
        return (t01) Enum.valueOf(t01.class, str);
    }

    public static t01[] values() {
        return (t01[]) e.clone();
    }
}
