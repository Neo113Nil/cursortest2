package b0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: d, reason: collision with root package name */
    public static final b0 f804d;

    /* renamed from: e, reason: collision with root package name */
    public static final b0 f805e;

    /* renamed from: i, reason: collision with root package name */
    public static final b0 f806i;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ b0[] f807r;

    static {
        b0 b0Var = new b0("Vertical", 0);
        f804d = b0Var;
        b0 b0Var2 = new b0("Horizontal", 1);
        f805e = b0Var2;
        b0 b0Var3 = new b0("Both", 2);
        f806i = b0Var3;
        f807r = new b0[]{b0Var, b0Var2, b0Var3};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f807r.clone();
    }
}
