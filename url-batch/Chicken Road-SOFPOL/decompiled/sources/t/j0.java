package t;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final j0 f6794d;

    /* renamed from: e, reason: collision with root package name */
    public static final j0 f6795e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ j0[] f6796f;

    static {
        j0 j0Var = new j0("Default", 0);
        f6794d = j0Var;
        j0 j0Var2 = new j0("UserInput", 1);
        f6795e = j0Var2;
        f6796f = new j0[]{j0Var, j0Var2, new j0("PreventUserInput", 2)};
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f6796f.clone();
    }
}
