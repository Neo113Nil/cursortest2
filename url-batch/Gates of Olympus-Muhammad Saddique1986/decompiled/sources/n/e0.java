package n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final e0 f7122d;

    /* renamed from: e, reason: collision with root package name */
    public static final e0 f7123e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ e0[] f7124f;

    static {
        e0 e0Var = new e0("Default", 0);
        f7122d = e0Var;
        e0 e0Var2 = new e0("UserInput", 1);
        f7123e = e0Var2;
        f7124f = new e0[]{e0Var, e0Var2, new e0("PreventUserInput", 2)};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f7124f.clone();
    }
}
