package j0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: d, reason: collision with root package name */
    public static final e2 f3626d;

    /* renamed from: e, reason: collision with root package name */
    public static final e2 f3627e;

    /* renamed from: f, reason: collision with root package name */
    public static final e2 f3628f;

    /* renamed from: g, reason: collision with root package name */
    public static final e2 f3629g;

    /* renamed from: h, reason: collision with root package name */
    public static final e2 f3630h;
    public static final /* synthetic */ e2[] i;

    static {
        e2 e2Var = new e2("TopBar", 0);
        f3626d = e2Var;
        e2 e2Var2 = new e2("MainContent", 1);
        f3627e = e2Var2;
        e2 e2Var3 = new e2("Snackbar", 2);
        f3628f = e2Var3;
        e2 e2Var4 = new e2("Fab", 3);
        f3629g = e2Var4;
        e2 e2Var5 = new e2("BottomBar", 4);
        f3630h = e2Var5;
        i = new e2[]{e2Var, e2Var2, e2Var3, e2Var4, e2Var5};
    }

    public static e2 valueOf(String str) {
        return (e2) Enum.valueOf(e2.class, str);
    }

    public static e2[] values() {
        return (e2[]) i.clone();
    }
}
