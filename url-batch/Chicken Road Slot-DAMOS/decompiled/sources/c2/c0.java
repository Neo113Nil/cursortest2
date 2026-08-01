package c2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f1505d;

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f1506e;

    /* renamed from: i, reason: collision with root package name */
    public static final c0 f1507i;

    /* renamed from: r, reason: collision with root package name */
    public static final c0 f1508r;

    /* renamed from: s, reason: collision with root package name */
    public static final c0 f1509s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ c0[] f1510t;

    static {
        c0 c0Var = new c0("Measuring", 0);
        f1505d = c0Var;
        c0 c0Var2 = new c0("LookaheadMeasuring", 1);
        f1506e = c0Var2;
        c0 c0Var3 = new c0("LayingOut", 2);
        f1507i = c0Var3;
        c0 c0Var4 = new c0("LookaheadLayingOut", 3);
        f1508r = c0Var4;
        c0 c0Var5 = new c0("Idle", 4);
        f1509s = c0Var5;
        f1510t = new c0[]{c0Var, c0Var2, c0Var3, c0Var4, c0Var5};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f1510t.clone();
    }
}
