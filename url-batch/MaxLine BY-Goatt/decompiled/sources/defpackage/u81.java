package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class u81 {
    public static final u81 m;
    public static final u81 n;
    public static final /* synthetic */ u81[] o;

    static {
        u81 u81Var = new u81("Ltr", 0);
        m = u81Var;
        u81 u81Var2 = new u81("Rtl", 1);
        n = u81Var2;
        o = new u81[]{u81Var, u81Var2};
    }

    public static u81 valueOf(String str) {
        return (u81) Enum.valueOf(u81.class, str);
    }

    public static u81[] values() {
        return (u81[]) o.clone();
    }
}
