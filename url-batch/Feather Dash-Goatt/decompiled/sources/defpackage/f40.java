package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class f40 {
    public static final f40 d;
    public static final f40 e;
    public static final f40 g;
    public static final /* synthetic */ f40[] h;

    static {
        f40 f40Var = new f40("ACTIVE", 0);
        d = f40Var;
        f40 f40Var2 = new f40("CHECKPOINT", 1);
        e = f40Var2;
        f40 f40Var3 = new f40("COLLISION", 2);
        g = f40Var3;
        h = new f40[]{f40Var, f40Var2, f40Var3};
    }

    public static f40 valueOf(String str) {
        return (f40) Enum.valueOf(f40.class, str);
    }

    public static f40[] values() {
        return (f40[]) h.clone();
    }
}
