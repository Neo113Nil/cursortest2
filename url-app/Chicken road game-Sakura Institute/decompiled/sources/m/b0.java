package m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: d, reason: collision with root package name */
    public static final b0 f8079d;

    /* renamed from: e, reason: collision with root package name */
    public static final b0 f8080e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b0[] f8081i;

    static {
        b0 b0Var = new b0("Default", 0);
        f8079d = b0Var;
        b0 b0Var2 = new b0("UserInput", 1);
        f8080e = b0Var2;
        f8081i = new b0[]{b0Var, b0Var2, new b0("PreventUserInput", 2)};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f8081i.clone();
    }
}
