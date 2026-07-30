package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class q21 {
    public static final q21 d;
    public static final /* synthetic */ q21[] e;

    static {
        q21 q21Var = new q21("Restart", 0);
        d = q21Var;
        e = new q21[]{q21Var, new q21("Reverse", 1)};
    }

    public static q21 valueOf(String str) {
        return (q21) Enum.valueOf(q21.class, str);
    }

    public static q21[] values() {
        return (q21[]) e.clone();
    }
}
