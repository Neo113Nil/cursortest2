package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class n7 {
    public static final n7 d;
    public static final n7 e;
    public static final /* synthetic */ n7[] g;

    static {
        n7 n7Var = new n7("BoundReached", 0);
        d = n7Var;
        n7 n7Var2 = new n7("Finished", 1);
        e = n7Var2;
        g = new n7[]{n7Var, n7Var2};
    }

    public static n7 valueOf(String str) {
        return (n7) Enum.valueOf(n7.class, str);
    }

    public static n7[] values() {
        return (n7[]) g.clone();
    }
}
