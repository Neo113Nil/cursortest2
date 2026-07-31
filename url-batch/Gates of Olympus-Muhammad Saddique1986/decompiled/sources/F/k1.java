package F;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: d, reason: collision with root package name */
    public static final k1 f1638d;

    /* renamed from: e, reason: collision with root package name */
    public static final k1 f1639e;

    /* renamed from: f, reason: collision with root package name */
    public static final k1 f1640f;

    /* renamed from: g, reason: collision with root package name */
    public static final k1 f1641g;

    /* renamed from: h, reason: collision with root package name */
    public static final k1 f1642h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k1[] f1643i;

    static {
        k1 k1Var = new k1("TopBar", 0);
        f1638d = k1Var;
        k1 k1Var2 = new k1("MainContent", 1);
        f1639e = k1Var2;
        k1 k1Var3 = new k1("Snackbar", 2);
        f1640f = k1Var3;
        k1 k1Var4 = new k1("Fab", 3);
        f1641g = k1Var4;
        k1 k1Var5 = new k1("BottomBar", 4);
        f1642h = k1Var5;
        f1643i = new k1[]{k1Var, k1Var2, k1Var3, k1Var4, k1Var5};
    }

    public static k1 valueOf(String str) {
        return (k1) Enum.valueOf(k1.class, str);
    }

    public static k1[] values() {
        return (k1[]) f1643i.clone();
    }
}
