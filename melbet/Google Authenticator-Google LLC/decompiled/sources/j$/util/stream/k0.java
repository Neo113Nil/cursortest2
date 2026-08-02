package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class k0 {
    public static final k0 DOUBLE_VALUE;
    public static final k0 INT_VALUE;
    public static final k0 LONG_VALUE;
    public static final k0 REFERENCE;
    public static final /* synthetic */ k0[] a;

    static {
        k0 k0Var = new k0("REFERENCE", 0);
        REFERENCE = k0Var;
        k0 k0Var2 = new k0("INT_VALUE", 1);
        INT_VALUE = k0Var2;
        k0 k0Var3 = new k0("LONG_VALUE", 2);
        LONG_VALUE = k0Var3;
        k0 k0Var4 = new k0("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = k0Var4;
        a = new k0[]{k0Var, k0Var2, k0Var3, k0Var4};
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) a.clone();
    }
}
