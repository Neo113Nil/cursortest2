package r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f6290d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f0[] f6291e;

    static {
        f0 f0Var = new f0("Default", 0);
        f6290d = f0Var;
        f6291e = new f0[]{f0Var, new f0("UserInput", 1), new f0("PreventUserInput", 2)};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f6291e.clone();
    }
}
