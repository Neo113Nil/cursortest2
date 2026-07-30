package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class g01 {
    public static final g01 d;
    public static final /* synthetic */ g01[] e;

    static {
        g01 g01Var = new g01("DEFAULT", 0);
        d = g01Var;
        e = new g01[]{g01Var, new g01("SIGNED", 1), new g01("FIXED", 2)};
    }

    public static g01 valueOf(String str) {
        return (g01) Enum.valueOf(g01.class, str);
    }

    public static g01[] values() {
        return (g01[]) e.clone();
    }
}
