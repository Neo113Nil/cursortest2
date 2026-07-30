package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class k11 {
    public static final k11 d;
    public static final k11 e;
    public static final k11 g;
    public static final k11 h;
    public static final k11 i;
    public static final k11 j;
    public static final /* synthetic */ k11[] k;

    static {
        k11 k11Var = new k11("ShutDown", 0);
        d = k11Var;
        k11 k11Var2 = new k11("ShuttingDown", 1);
        e = k11Var2;
        k11 k11Var3 = new k11("Inactive", 2);
        g = k11Var3;
        k11 k11Var4 = new k11("InactivePendingWork", 3);
        h = k11Var4;
        k11 k11Var5 = new k11("Idle", 4);
        i = k11Var5;
        k11 k11Var6 = new k11("PendingWork", 5);
        j = k11Var6;
        k = new k11[]{k11Var, k11Var2, k11Var3, k11Var4, k11Var5, k11Var6};
    }

    public static k11 valueOf(String str) {
        return (k11) Enum.valueOf(k11.class, str);
    }

    public static k11[] values() {
        return (k11[]) k.clone();
    }
}
