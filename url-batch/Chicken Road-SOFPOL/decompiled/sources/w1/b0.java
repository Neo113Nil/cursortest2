package w1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: d, reason: collision with root package name */
    public static final b0 f7590d;

    /* renamed from: e, reason: collision with root package name */
    public static final b0 f7591e;

    /* renamed from: f, reason: collision with root package name */
    public static final b0 f7592f;

    /* renamed from: g, reason: collision with root package name */
    public static final b0 f7593g;

    /* renamed from: h, reason: collision with root package name */
    public static final b0 f7594h;
    public static final /* synthetic */ b0[] i;

    static {
        b0 b0Var = new b0("Measuring", 0);
        f7590d = b0Var;
        b0 b0Var2 = new b0("LookaheadMeasuring", 1);
        f7591e = b0Var2;
        b0 b0Var3 = new b0("LayingOut", 2);
        f7592f = b0Var3;
        b0 b0Var4 = new b0("LookaheadLayingOut", 3);
        f7593g = b0Var4;
        b0 b0Var5 = new b0("Idle", 4);
        f7594h = b0Var5;
        i = new b0[]{b0Var, b0Var2, b0Var3, b0Var4, b0Var5};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) i.clone();
    }
}
