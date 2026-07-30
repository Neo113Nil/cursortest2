package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class e0 {
    public static final e0 LENIENT;
    public static final e0 SMART;
    public static final e0 STRICT;
    public static final /* synthetic */ e0[] a;

    static {
        e0 e0Var = new e0("STRICT", 0);
        STRICT = e0Var;
        e0 e0Var2 = new e0("SMART", 1);
        SMART = e0Var2;
        e0 e0Var3 = new e0("LENIENT", 2);
        LENIENT = e0Var3;
        a = new e0[]{e0Var, e0Var2, e0Var3};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) a.clone();
    }
}
