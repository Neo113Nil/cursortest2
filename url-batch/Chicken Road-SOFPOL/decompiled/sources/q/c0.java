package q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f5806d;

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f5807e;

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f5808f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c0[] f5809g;

    static {
        c0 c0Var = new c0("PreEnter", 0);
        f5806d = c0Var;
        c0 c0Var2 = new c0("Visible", 1);
        f5807e = c0Var2;
        c0 c0Var3 = new c0("PostExit", 2);
        f5808f = c0Var3;
        f5809g = new c0[]{c0Var, c0Var2, c0Var3};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f5809g.clone();
    }
}
