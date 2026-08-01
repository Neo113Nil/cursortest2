package f8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final e0 f4132d;

    /* renamed from: e, reason: collision with root package name */
    public static final e0 f4133e;

    /* renamed from: i, reason: collision with root package name */
    public static final e0 f4134i;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ e0[] f4135r;

    static {
        e0 e0Var = new e0("NOT_RUN", 0);
        f4132d = e0Var;
        e0 e0Var2 = new e0("CANCELLED", 1);
        f4133e = e0Var2;
        e0 e0Var3 = new e0("STARTED", 2);
        f4134i = e0Var3;
        f4135r = new e0[]{e0Var, e0Var2, e0Var3};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f4135r.clone();
    }
}
